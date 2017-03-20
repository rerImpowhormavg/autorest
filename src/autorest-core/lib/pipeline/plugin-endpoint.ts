/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { fork, ChildProcess } from "child_process";
import { Mappings, Mapping, RawSourceMap, SmartPosition, Position } from "../approved-imports/source-map";
import { CancellationToken } from "../approved-imports/cancallation";
import { createMessageConnection, MessageConnection } from "../approved-imports/jsonrpc";
import { DataStoreViewReadonly, DataStoreView, DataHandleRead } from "../data-store/data-store";
import { Message, IAutoRestPluginInitiator_Types, IAutoRestPluginTarget_Types, IAutoRestPluginInitiator } from "./plugin-api";


interface IAutoRestPluginTargetEndpoint {
  GetPluginNames(cancellationToken: CancellationToken): Promise<string[]>;
  Process(pluginName: string, sessionId: string, cancellationToken: CancellationToken): Promise<boolean>;
}

interface IAutoRestPluginInitiatorEndpoint {
  FinishNotifications(): Promise<void>; // not exposed; necessary to ensure notifications are processed before 

  ReadFile(filename: string): Promise<string>;
  GetValue(key: string): Promise<any>;
  ListInputs(): Promise<string[]>;

  WriteFile(filename: string, content: string, sourceMap?: Mappings | RawSourceMap): Promise<void>;
  Message(message: Message<any>, path?: SmartPosition, sourceFile?: string): Promise<void>;
}

export class AutoRestPlugin {
  private static lastSessionId: number = 0;
  private static CreateSessionId(): string { return `session_${++AutoRestPlugin.lastSessionId}`; }

  public static async FromModule(modulePath: string): Promise<AutoRestPlugin> {
    const childProc = fork(modulePath, [], <any>{ silent: true });
    return AutoRestPlugin.FromChildProcess(childProc);
  }

  public static async FromChildProcess(childProc: ChildProcess): Promise<AutoRestPlugin> {
    // childProc.on("error", err => { throw err; });
    const channel = createMessageConnection(
      childProc.stdout,
      childProc.stdin,
      console
    );
    childProc.stderr.pipe(process.stderr);
    const plugin = new AutoRestPlugin(channel);
    channel.listen();
    return plugin;
  }

  public constructor(channel: MessageConnection) {
    // initiator
    const dispatcher = (fnName: string) => async (sessionId: string, ...rest: any[]) => {
      try {
        const endpoint = this.apiInitiatorEndpoints[sessionId];
        if (endpoint) {
          return await (endpoint as any)[fnName](...rest);
        }
      } catch (e) {
        console.error(`Error occurred in handler for '${fnName}' in session '${sessionId}':`);
        console.error(e);
      }
    };
    this.apiInitiator = {
      ReadFile: dispatcher("ReadFile"),
      GetValue: dispatcher("GetValue"),
      ListInputs: dispatcher("ListInputs"),

      WriteFile: dispatcher("WriteFile"),
      Message: dispatcher("Message"),
    };
    channel.onRequest(IAutoRestPluginInitiator_Types.ReadFile, this.apiInitiator.ReadFile);
    channel.onRequest(IAutoRestPluginInitiator_Types.GetValue, this.apiInitiator.GetValue);
    channel.onRequest(IAutoRestPluginInitiator_Types.ListInputs, this.apiInitiator.ListInputs);
    channel.onNotification(IAutoRestPluginInitiator_Types.WriteFile, this.apiInitiator.WriteFile);
    channel.onNotification(IAutoRestPluginInitiator_Types.Message, this.apiInitiator.Message);

    // target
    this.apiTarget = {
      async GetPluginNames(cancellationToken: CancellationToken): Promise<string[]> {
        return await channel.sendRequest(IAutoRestPluginTarget_Types.GetPluginNames, cancellationToken);
      },
      async Process(pluginName: string, sessionId: string, cancellationToken: CancellationToken): Promise<boolean> {
        return await channel.sendRequest(IAutoRestPluginTarget_Types.Process, pluginName, sessionId, cancellationToken);
      }
    };
  }

  private apiTarget: IAutoRestPluginTargetEndpoint;
  private apiInitiator: IAutoRestPluginInitiator;
  private apiInitiatorEndpoints: { [sessionId: string]: IAutoRestPluginInitiatorEndpoint } = {};

  public GetPluginNames(cancellationToken: CancellationToken): Promise<string[]> {
    return this.apiTarget.GetPluginNames(cancellationToken);
  }

  public async Process(pluginName: string, configuration: (key: string) => any, inputScope: DataStoreViewReadonly, outputScope: DataStoreView, messageScope: DataStoreView, cancellationToken: CancellationToken): Promise<boolean> {
    const sid = AutoRestPlugin.CreateSessionId();

    // register endpoint
    this.apiInitiatorEndpoints[sid] = AutoRestPlugin.CreateEndpointFor(configuration, inputScope, outputScope, messageScope, cancellationToken);

    // dispatch
    const result = await this.apiTarget.Process(pluginName, sid, cancellationToken);

    // wait for outstanding notifications
    await this.apiInitiatorEndpoints[sid].FinishNotifications();

    // unregister endpoint
    delete this.apiInitiatorEndpoints[sid];

    return result;
  }

  private static CreateEndpointFor(configuration: (key: string) => any, inputScope: DataStoreViewReadonly, outputScope: DataStoreView, messageScope: DataStoreView, cancellationToken: CancellationToken): IAutoRestPluginInitiatorEndpoint {
    let messageId: number = 0;

    const inputFileHandles = async () => {
      const inputFileNames = Array.from(await inputScope.Enum());
      const inputFiles = await Promise.all(inputFileNames.map(fn => inputScope.ReadStrict(fn)));
      return inputFiles;
    }

    let finishNotifications: Promise<void> = Promise.resolve();
    const apiInitiator: IAutoRestPluginInitiatorEndpoint = {
      FinishNotifications(): Promise<void> { return finishNotifications; },
      async ReadFile(filename: string): Promise<string> {
        const file = await inputScope.ReadStrict(filename);
        return await file.ReadData();
      },
      async GetValue(key: string): Promise<any> {
        return configuration(key);
      },
      async ListInputs(): Promise<string[]> {
        const result = await inputScope.Enum();
        return Array.from(result);
      },

      async WriteFile(filename: string, content: string, sourceMap?: Mappings | RawSourceMap): Promise<void> {
        if (!sourceMap) {
          sourceMap = [];
        }
        const finishPrev = finishNotifications;
        let notify: () => void = () => { };
        finishNotifications = new Promise<void>(res => notify = res);

        const file = await outputScope.Write(filename);
        if (typeof (sourceMap as any).mappings === "string") {
          await file.WriteDataWithSourceMap(content, async () => sourceMap);
        } else {
          await file.WriteData(content, sourceMap as Mappings, await inputFileHandles());
        }

        await finishPrev;
        notify();
      },
      async Message(message: Message<any>, path?: SmartPosition, sourceFile?: string): Promise<void> {
        if (message.channel === "FATAL") {
          throw new Error(message.message);
        }

        const finishPrev = finishNotifications;
        let notify: () => void = () => { };
        finishNotifications = new Promise<void>(res => notify = res);

        const dataHandle = await messageScope.Write(`message_${messageId++}.yaml`);
        const mappings: Mapping[] = [];
        const files = await inputFileHandles();
        if (path) {
          if (!sourceFile) {
            if (files.length !== 1) {
              await finishPrev;
              notify();
              throw new Error("Message did not specify blame origin but there are multiple input files");
            }
            sourceFile = files[0].key;
          }
          var a: Position = { line: 1, column: 0 };
          var b: SmartPosition = a;

          mappings.push({
            name: `location of ${message.channel} '${message.message}'`,
            source: sourceFile,
            generated: <Position>{ line: 1, column: 0 },
            original: path
          });
        }
        dataHandle.WriteObject(message, mappings, files);

        await finishPrev;
        notify();
      }
    };
    return apiInitiator;
  }
}