/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { matches } from "./ref/jsonpath";
import { MergeOverwrite } from "./source-map/merging";
import { DataStore } from "./data-store/data-store";
import { EventEmitter, IEvent } from "./events";
import { CodeBlock, EvaluateGuard, ParseCodeBlocks } from './parsing/literate-yaml';
import { EnsureIsFolderUri, ResolveUri } from "./ref/uri";
import { From } from "./ref/linq";
import { IFileSystem } from "./file-system";
import * as Constants from "./constants";
import { Message, Channel } from "./message";
import { Artifact } from "./artifact";
import { CancellationTokenSource, CancellationToken } from "./ref/cancallation";

export interface AutoRestConfigurationImpl {
  __info?: string | null;
  "input-file": string[] | string;
  "base-folder"?: string;
  "directive"?: Directive[] | Directive;
  "output-artifact"?: string[] | string;
  "message-format"?: "json";
  "vscode"?: any; // activates VS Code specific behavior and does *NOT* influence the core's behavior (only consumed by VS Code extension)

  // plugin specific
  "output-file"?: string;
  "output-folder"?: string;
  "disable-validation"?: boolean;

  // from here on: CONVENTION, not cared about by the core
  "fluent"?: boolean;
  "azure-arm"?: boolean; // TODO: enable tooling using guard in default config!
  "override-info"?: any; // make sure source maps are pulling it! (see "composite swagger" method)
  "namespace"?: string; // TODO: the modeler cares :( because it is badly designed
  "license-header"?: string;
  "add-credentials"?: boolean;
  "package-name"?: string; // Ruby, Python, ...
  "package-version"?: string;
  "sync-methods"?: "all" | "essential" | "none";
  "payload-flattening-threshold"?: number;
}

// TODO: operate on DataHandleRead and create source map!
function MergeConfigurations(a: AutoRestConfigurationImpl, b: AutoRestConfigurationImpl): AutoRestConfigurationImpl {
  // check guard
  if (b.__info && !EvaluateGuard(b.__info, a)) {
    // guard false? => skip
    return a;
  }

  // merge
  return MergeOverwrite(a, b, p => matches("$.directive", p) || matches("$['input-file']", p) || matches("$['output-artifact']", p));
}

function ValuesOf<T>(obj: any): Iterable<T> {
  if (obj === undefined) {
    return [];
  }
  if (obj instanceof Array) {
    return obj;
  }
  return [obj];
}

export interface Directive {
  from?: string[] | string;
  where?: string[] | string;
  reason?: string;

  // one of:
  suppress?: string[] | string;
  set?: string[] | string;
  transform?: string[] | string;
}

export class DirectiveView {
  constructor(private directive: Directive) {
  }

  public get from(): Iterable<string> {
    return ValuesOf<string>(this.directive["from"]);
  }

  public get where(): Iterable<string> {
    return ValuesOf<string>(this.directive["where"]);
  }

  public get reason(): string | null {
    return this.directive.reason || null;
  }

  public get suppress(): Iterable<string> {
    return ValuesOf<string>(this.directive["suppress"]);
  }

  public get set(): Iterable<string> {
    return ValuesOf<string>(this.directive["set"]);
  }

  public get transform(): Iterable<string> {
    return ValuesOf<string>(this.directive["transform"]);
  }
}

export class MessageEmitter extends EventEmitter {
  /**
  * Event: Signals when a File is generated 
  */
  @EventEmitter.Event public GeneratedFile: IEvent<MessageEmitter, Artifact>;
  /**
   * Event: Signals when a message is generated
   */
  @EventEmitter.Event public Message: IEvent<MessageEmitter, Message>;
  private cancellationTokenSource = new CancellationTokenSource();

  constructor() {
    super();
    this.DataStore = new DataStore(this.CancellationToken);
  }
  /* @internal */ public DataStore: DataStore;
  /* @internal */ public get messageEmitter() { return this; }
  /* @internal */ public get CancellationTokenSource(): CancellationTokenSource { return this.cancellationTokenSource; }
  /* @internal */ public get CancellationToken(): CancellationToken { return this.cancellationTokenSource.token; }
}

export class ConfigurationView {

  /* @internal */ constructor(
    /* @internal */public messageEmitter: MessageEmitter,
    /* @internal */public configFileFolderUri: string,
    ...configs: Array<AutoRestConfigurationImpl> // decreasing priority
  ) {

    // TODO: fix configuration loading, note that there was no point in passing that DataStore used 
    // for loading in here as all connection to the sources is lost when passing `Array<AutoRestConfigurationImpl>` instead of `DataHandleRead`s...
    // theoretically the `ValuesOf` approach and such won't support blaming (who to blame if $.directives[3] sucks? which code block was it from)
    // long term, we simply gotta write a `Merge` method that adheres to the rules we need in here.
    this.config = <any>{
      "directive": [],
      "input-file": [],
      "output-artifact": []
    };
    for (const config of configs) {
      this.config = MergeConfigurations(this.config, config);
    }
    this.messageEmitter.Message.Dispatch({ Channel: Channel.Debug, Text: `Creating ConfigurationView : ${configs.length} sections.` });
  }

  /* @internal */ public get DataStore(): DataStore { return this.messageEmitter.DataStore }

  /* @internal */ public get CancellationToken(): CancellationToken { return this.messageEmitter.CancellationToken; }

  /* @internal */ public get CancellationTokenSource(): CancellationTokenSource { return this.messageEmitter.CancellationTokenSource; }

  /* @internal */ public get Message(): IEvent<MessageEmitter, Message> {
    return this.messageEmitter.Message;
  }
  /* @internal */ public get GeneratedFile(): IEvent<MessageEmitter, Artifact> {
    return this.messageEmitter.GeneratedFile;
  }

  private config: AutoRestConfigurationImpl;

  private ResolveAsFolder(path: string): string {
    return EnsureIsFolderUri(ResolveUri(this.BaseFolderUri, path));
  }

  private ResolveAsPath(path: string): string {
    return ResolveUri(this.BaseFolderUri, path);
  }

  private get BaseFolderUri(): string {
    return EnsureIsFolderUri(ResolveUri(this.configFileFolderUri, this.config["base-folder"] || "."));
  }

  // public methods

  public get Directives(): Iterable<DirectiveView> {
    return From(ValuesOf<Directive>(this.config["directive"]))
      .Select(each => new DirectiveView(each));
  }

  public get InputFileUris(): Iterable<string> {
    return From<string>(ValuesOf<string>(this.config["input-file"]))
      .Select(each => this.ResolveAsPath(each));
  }

  public get OutputFolderUri(): string {
    return this.ResolveAsFolder(this.config["output-folder"] || "generated");
  }

  public get OutputArtifact(): Iterable<string> {
    return ValuesOf<string>(this.config["output-artifact"]);
  }

  public GetEntry(key: keyof AutoRestConfigurationImpl): any {
    return (this.config as any)[key];
  }

  public get Raw(): AutoRestConfigurationImpl {
    return this.config;
  }

  public get DisableValidation(): boolean {
    return this.config["disable-validation"] || false;
  }

  public get AzureArm(): boolean {
    return this.config["azure-arm"] || false;
  }

  public get Fluent(): boolean {
    return this.config["fluent"] || false;
  }

  public * GetPluginViews(pluginName: string): Iterable<ConfigurationView> {
    for (const section of ValuesOf<any>((this.config as any)[pluginName])) {
      yield new ConfigurationView(this.messageEmitter, this.configFileFolderUri, section, this.config);
    }
  }
}


export class Configuration {
  public async CreateView(messageEmitter: MessageEmitter, ...configs: Array<any>): Promise<ConfigurationView> {
    const workingScope: DataStore = new DataStore();
    const configFileUri = this.fileSystem && this.uriToConfigFileOrWorkingFolder
      ? await Configuration.DetectConfigurationFile(this.fileSystem, this.uriToConfigFileOrWorkingFolder)
      : null;

    const defaults = require("../resources/default-configuration.json");

    if (configFileUri === null) {
      return new ConfigurationView(messageEmitter, this.uriToConfigFileOrWorkingFolder || "file:///", ...configs, defaults);
    } else {
      const inputView = workingScope.GetReadThroughScopeFileSystem(this.fileSystem as IFileSystem);

      // load config
      const hConfig = await ParseCodeBlocks(
        messageEmitter,
        await inputView.ReadStrict(configFileUri),
        workingScope.CreateScope("config"));

      const blocks = await Promise.all(From<CodeBlock>(hConfig).Select(async each => {
        const block = each.data.ReadObject<AutoRestConfigurationImpl>();
        block.__info = each.info;
        return block;
      }));

      return new ConfigurationView(messageEmitter, ResolveUri(configFileUri, "."), ...configs, ...blocks, defaults);
    }
  }

  public constructor(
    private fileSystem?: IFileSystem,
    private uriToConfigFileOrWorkingFolder?: string
  ) {
    this.FileChanged();
  }

  public FileChanged() {
  }

  public static async DetectConfigurationFile(fileSystem: IFileSystem, uriToConfigFileOrWorkingFolder: string | null): Promise<string | null> {
    if (!uriToConfigFileOrWorkingFolder || !uriToConfigFileOrWorkingFolder.endsWith("/")) {
      return uriToConfigFileOrWorkingFolder;
    }

    // search for a config file, walking up the folder tree
    while (uriToConfigFileOrWorkingFolder !== null) {
      // scan the filesystem items for the configuration.
      const configFiles = new Map<string, string>();

      for await (const name of fileSystem.EnumerateFileUris(uriToConfigFileOrWorkingFolder)) {
        if (name.endsWith(".md")) {
          const content = await fileSystem.ReadFile(name);
          if (content.indexOf(Constants.MagicString) > -1) {
            configFiles.set(name, content);
          }
        }
      }

      if (configFiles.size > 0) {
        // it's the readme.md or the shortest filename.
        const found =
          From<string>(configFiles.keys()).FirstOrDefault(each => each.toLowerCase().endsWith("/" + Constants.DefaultConfiguratiion)) ||
          From<string>(configFiles.keys()).OrderBy(each => each.length).First();

        return found;
      }

      // walk up
      const newUriToConfigFileOrWorkingFolder = ResolveUri(uriToConfigFileOrWorkingFolder, "..");
      uriToConfigFileOrWorkingFolder = newUriToConfigFileOrWorkingFolder === uriToConfigFileOrWorkingFolder
        ? null
        : newUriToConfigFileOrWorkingFolder;
    }

    return null;
  }
}
