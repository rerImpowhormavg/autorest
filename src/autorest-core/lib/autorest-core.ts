/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { RunPipeline } from "./pipeline/pipeline";
import { Push } from "./ref/linq";
import { IEvent, EventEmitter } from "./events";
import { IFileSystem } from "./file-system";
import { Exception } from "./exception";
import { Configuration, ConfigurationView, MessageEmitter } from "./configuration";
export { ConfigurationView } from "./configuration";
import { Message, Channel } from "./message";
import * as Constants from "./constants";
import { Artifact } from "./artifact";
import { homedir } from "os"

export class AutoRest extends EventEmitter {
  /**
   *  Given a file's content, does this represent a swagger file of some sort?
   *
   * @param content - the file content to evaluate
   */
  public static async IsSwaggerFile(content: string): Promise<boolean> {
    // this checks to see if the document is a swagger document
    try {
      // quick check to see if it's json already
      let doc = JSON.parse(content);
      return (doc && doc.swagger && doc.swagger === "2.0")
    } catch (e) {
      try {
        // maybe it's yaml or literate swagger
        let doc = JSON.parse(await AutoRest.LiterateToJson(content));
        return (doc && doc.swagger && doc.swagger === "2.0")
      } catch (e) {
        // nope
      }
    }

    return false;
  }

  public static async LiterateToJson(content: string): Promise<string> {
    try {
      let autorest = new AutoRest({
        EnumerateFileUris: async function (folderUri: string): Promise<Array<string>> { return []; },
        ReadFile: async (f: string): Promise<string> => f == "none:///empty-file.md" ? content || "# empty file" : "# empty file"
      });
      let result = "";
      autorest.AddConfiguration({ "input-file": "none:///empty-file.md", "output-artifact": ["swagger-document"] });
      autorest.GeneratedFile.Subscribe((source, artifact) => {
        result = artifact.content;
      });
      // run autorest and wait.

      await (await autorest.Process()).finish;
      return result;
    } catch (x) {
      return "";
    }
  }

  public static async IsConfigurationFile(content: string): Promise<boolean> {
    // this checks to see if the document is an autorest markdown configuration file
    return content.indexOf(Constants.MagicString) > -1;
  }

  public static IsConfigurationExtension(extension: string): boolean {
    switch (extension) {
      case "markdown":
      case "md":
        return true;
      default:
        return false;
    }
  }

  public static IsSwaggerExtension(extension: string): boolean {
    switch (extension) {
      case "yaml":
      case "yml":
      case "markdown":
      case "md":
      case "json":
        return true;
      default:
        return false;
    }
  }

  public static async DetectConfigurationFile(fileSystem: IFileSystem, documentPath?: string): Promise<string | null> {
    return Configuration.DetectConfigurationFile(fileSystem, (documentPath || null));
  }

  /**
   * Event: Signals when a Process() finishes.
   */
  @EventEmitter.Event public Finished: IEvent<AutoRest, boolean | Error>;
  /**
   * Event: Signals when a File is generated
   */
  @EventEmitter.Event public GeneratedFile: IEvent<AutoRest, Artifact>;
  /**
   * Event: Signals when a Folder is supposed to be cleared
   */
  @EventEmitter.Event public ClearFolder: IEvent<AutoRest, string>;
  /**
   * Event: Signals when a message is generated
   */
  @EventEmitter.Event public Message: IEvent<AutoRest, Message>;

  private _configurations = new Array<any>();
  private _view: ConfigurationView | undefined;
  public get view(): Promise<ConfigurationView> {
    return this._view ? Promise.resolve(this._view) : this.RegenerateView(true);
  }

  /**
   *  @internal
   * @param fileSystem The implementation of the filesystem to load and save files from the host application.
   * @param configFileOrFolderUri The URI of the configuration file or folder containing the configuration file. Is null if no configuration file should be looked for.
   */
  public constructor(private fileSystem?: IFileSystem, public configFileOrFolderUri?: string) {
    super();
    // ensure the environment variable for the home folder is set.
    process.env["autorest.home"] = process.env["autorest.home"] || homedir();
  }

  public static create(fileSystem?: IFileSystem, configFileOrFolderUri?: string) {
    return new AutoRest(fileSystem, configFileOrFolderUri);
  }
  public async RegenerateView(includeDefault: boolean = false): Promise<ConfigurationView> {
    this.Invalidate();
    const messageEmitter = new MessageEmitter();

    // subscribe to the events for the current configuration view
    messageEmitter.GeneratedFile.Subscribe((cfg, file) => this.GeneratedFile.Dispatch(file));
    messageEmitter.ClearFolder.Subscribe((cfg, folder) => this.ClearFolder.Dispatch(folder));
    messageEmitter.Message.Subscribe((cfg, message) => this.Message.Dispatch(message));

    return this._view = await new Configuration(this.fileSystem, this.configFileOrFolderUri).CreateView(messageEmitter, includeDefault, ...this._configurations);
  }

  public Invalidate() {
    if (this._view) {
      this._view.messageEmitter.removeAllListeners();
      this._view = undefined;
    }
  }

  public AddConfiguration(configuration: any): void {
    Push(this._configurations, configuration);
    this.Invalidate();
  }

  public async ResetConfiguration(): Promise<void> {
    // clear the configuratiion array.
    this._configurations.length = 0;
    this.Invalidate();
  }

  public get HasConfiguration(): Promise<boolean> {
    return new Promise<boolean>(async (r, f) => {
      await this.view;
      r(false);
    });
  }

  /**
   * Called to start processing of the files.
   */
  public Process(): { finish: Promise<boolean | Error>, cancel: () => void } {
    let earlyCancel = false;
    let cancel: () => void = () => earlyCancel = true;
    const processInternal = async () => {
      let view: ConfigurationView = null as any;
      try {
        // grab the current configuration view.
        view = await this.view;

        // you can't use this again!
        this._view = undefined;

        // expose cancellation token
        cancel = () => {
          if (view) {
            view.CancellationTokenSource.cancel();
            view.messageEmitter.removeAllListeners();
          }
        };

        if (earlyCancel) {
          this.Finished.Dispatch(false);
          return false;
        }

        if (view.InputFileUris.length === 0) {
          if (view.GetEntry("allow-no-input")) {
            return true;
          } else {
            return new Exception("No input files provided.\n\nUse --help to get help information.");
          }
        }

        await Promise.race([
          RunPipeline(view, <IFileSystem>this.fileSystem),
          new Promise((_, rej) => view.CancellationToken.onCancellationRequested(() => rej("Cancellation requested.")))]);

        // finished -- return status (if cancelled, returns false.)
        this.Finished.Dispatch(!view.CancellationTokenSource.token.isCancellationRequested);

        view.messageEmitter.removeAllListeners();
        return true;
      } catch (e) {
        const message = { Channel: Channel.Debug, Text: `Process() Cancelled due to exception : ${e.message}` };
        if (e instanceof Exception) {
          // idea: don't throw exceptions, just visibly log them and return false
          message.Channel = Channel.Fatal;
          e = false;
        }
        this.Message.Dispatch(message);

        this.Finished.Dispatch(e);
        if (view) {
          view.messageEmitter.removeAllListeners();
        }
        return e;
      }
    };
    return {
      cancel: () => cancel(),
      finish: processInternal()
    }
  }
}
