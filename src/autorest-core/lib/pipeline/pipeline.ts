/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { Lazy, LazyPromise } from "../lazy";
import { Stringify, YAMLNode } from '../ref/yaml';
import { OutstandingTaskAwaiter } from "../outstanding-task-awaiter";
import { AutoRestPlugin } from "./plugin-endpoint";
import { Manipulator } from "./manipulation";
import { ProcessCodeModel } from "./commonmark-documentation";
import { IdentitySourceMapping } from "../source-map/merging";
import { Channel, Message, SourceLocation, Range } from "../message";
import { MultiPromise } from "../multi-promise";
import { GetFilename, ResolveUri } from "../ref/uri";
import { ConfigurationView } from "../configuration";
import { DataHandleRead, DataStoreView, DataStoreViewReadonly, QuickScope } from "../data-store/data-store";
import { AutoRestDotNetPlugin } from "./plugins/autorest-dotnet";
import { ComposeSwaggers, LoadLiterateSwaggers } from "./swagger-loader";
import { From } from "../ref/linq";
import { IFileSystem } from "../file-system";
import { Exception } from "../exception";

export type DataPromise = MultiPromise<DataHandleRead>;

async function emitArtifactInternal(config: ConfigurationView, artifactType: string, uri: string, handle: DataHandleRead): Promise<void> {
  config.Message({ Channel: Channel.Debug, Text: `Emitting '${artifactType}' at ${uri}` });
  if (config.IsOutputArtifactRequested(artifactType)) {
    config.GeneratedFile.Dispatch({
      type: artifactType,
      uri: uri,
      content: handle.ReadData()
    });
  }
  if (config.IsOutputArtifactRequested(artifactType + ".map")) {
    config.GeneratedFile.Dispatch({
      type: artifactType + ".map",
      uri: uri + ".map",
      content: JSON.stringify(handle.ReadMetadata().inputSourceMap.Value, null, 2)
    });
  }
}
let emitCtr = 0;
async function emitArtifact(config: ConfigurationView, artifactType: string, uri: string, handle: DataHandleRead, isObject: boolean): Promise<void> {
  await emitArtifactInternal(config, artifactType, uri, handle);

  if (isObject) {
    const scope = config.DataStore.CreateScope("emitObjectArtifact");
    const object = new Lazy<any>(() => handle.ReadObject<any>());
    const ast = new Lazy<YAMLNode>(() => handle.ReadYamlAst());

    if (config.IsOutputArtifactRequested(artifactType + ".yaml")
      || config.IsOutputArtifactRequested(artifactType + ".yaml.map")) {

      const hw = await scope.Write(`${++emitCtr}.yaml`);
      const h = await hw.WriteData(Stringify(object.Value), IdentitySourceMapping(handle.key, ast.Value), [handle]);
      await emitArtifactInternal(config, artifactType + ".yaml", uri + ".yaml", h);
    }
    if (config.IsOutputArtifactRequested(artifactType + ".json")
      || config.IsOutputArtifactRequested(artifactType + ".json.map")) {

      const hw = await scope.Write(`${++emitCtr}.json`);
      const h = await hw.WriteData(JSON.stringify(object.Value, null, 2), IdentitySourceMapping(handle.key, ast.Value), [handle]);
      await emitArtifactInternal(config, artifactType + ".json", uri + ".json", h);
    }
  }
}

async function emitArtifacts(config: ConfigurationView, artifactType: string, uriResolver: (key: string) => string, scope: DataStoreViewReadonly, isObject: boolean): Promise<void> {
  for (const key of await scope.Enum()) {
    const file = await scope.ReadStrict(key);
    await emitArtifact(config, artifactType, uriResolver(file.key), file, isObject);
  }
}

type PipelinePlugin = (config: ConfigurationView, input: DataStoreViewReadonly, working: DataStoreView, output: DataStoreView) => Promise<void>;
type PipelineNode = { id: string, outputArtifact: string, plugin: PipelinePlugin, inputs: PipelineNode[] };

function CreatePluginLoader(): PipelinePlugin {
  return async (config, input, working, output) => {
    let inputs = From(config.InputFileUris).ToArray();
    if (inputs.length === 0) {
      throw new Exception("No input files provided.\n\nUse --help to get help information.", 0);
    }
    const swaggers = await LoadLiterateSwaggers(
      config,
      input,
      inputs, working);
    for (let i = 0; i < inputs.length; ++i) {
      await (await output.Write(`./${i}/_` + encodeURIComponent(inputs[i]))).Forward(swaggers[i]);
    }
  };
}
function CreatePluginTransformer(): PipelinePlugin {
  return async (config, input, working, output) => {
    const documentIdResolver: (key: string) => string = key => {
      const parts = key.split("/_");
      return parts.length === 1 ? parts[0] : decodeURIComponent(parts[parts.length - 1]);
    };
    const manipulator = new Manipulator(config);
    const files = await input.Enum();
    for (const file of files) {
      const fileIn = await input.ReadStrict(file);
      const fileOut = await manipulator.Process(fileIn, working, documentIdResolver(file));
      await (await output.Write("./" + file)).Forward(fileOut);
    }
  };
}
function CreatePluginComposer(): PipelinePlugin {
  return async (config, input, working, output) => {
    const swaggers = await Promise.all((await input.Enum()).map(x => input.ReadStrict(x)));
    const swagger = config.GetEntry("override-info") || swaggers.length !== 1
      ? await ComposeSwaggers(config, config.GetEntry("override-info") || {}, swaggers, config.DataStore.CreateScope("compose"), true)
      : swaggers[0];
    await (await output.Write("swagger-document")).Forward(swagger);
  };
}
function CreatePluginExternal(host: PromiseLike<AutoRestPlugin>, pluginName: string): PipelinePlugin {
  return async (config, input, working, output) => {
    const plugin = await host;
    const pluginNames = await plugin.GetPluginNames(config.CancellationToken);
    if (pluginNames.indexOf(pluginName) === -1) {
      throw new Error(`Plugin ${pluginName} not found.`);
    }

    // forward input scope (relative/absolute key mess...)
    const inputx = new QuickScope(await Promise.all((await input.Enum()).map(x => input.ReadStrict(x))));

    const result = await plugin.Process(
      pluginName,
      key => config.GetEntry(key as any),
      inputx,
      output,
      config.Message.bind(config),
      config.CancellationToken);
    if (!result) {
      throw new Error(`Plugin ${pluginName} reported failure.`);
    }
  };
}
function CreateCommonmarkProcessor(): PipelinePlugin {
  return async (config, input, working, output) => {
    const files = await input.Enum();
    for (const file of files) {
      const fileIn = await input.ReadStrict(file);
      const fileOut = await ProcessCodeModel(fileIn, working);
      await (await output.Write("./" + file + "/_/code-model-v1.yaml")).Forward(fileOut);
    }
  };
}

export async function RunPipeline(config: ConfigurationView, fileSystem: IFileSystem): Promise<void> {
  const cancellationToken = config.CancellationToken;
  const processMessage = config.Message.bind(config);
  const barrier = new OutstandingTaskAwaiter();

  // externals:
  const oavPluginHost = new LazyPromise(async () => await AutoRestPlugin.FromModule(`${__dirname}/plugins/openapi-validation-tools`));
  const autoRestDotNet = new LazyPromise(async () => await AutoRestDotNetPlugin.Get().pluginEndpoint);

  // TODO: enhance with custom declared plugins
  const plugins: { [name: string]: PipelinePlugin } = {
    "loader": CreatePluginLoader(),
    "transform": CreatePluginTransformer(),
    "compose": CreatePluginComposer(),
    "model-validator": CreatePluginExternal(oavPluginHost, "model-validator"),
    "semantic-validator": CreatePluginExternal(oavPluginHost, "semantic-validator"),
    "azure-validator": CreatePluginExternal(autoRestDotNet, "azure-validator"),
    "modeler": CreatePluginExternal(autoRestDotNet, "modeler"),

    "csharp": CreatePluginExternal(autoRestDotNet, "csharp"),
    "ruby": CreatePluginExternal(autoRestDotNet, "ruby"),
    "nodejs": CreatePluginExternal(autoRestDotNet, "nodejs"),
    "python": CreatePluginExternal(autoRestDotNet, "python"),
    "go": CreatePluginExternal(autoRestDotNet, "go"),
    "java": CreatePluginExternal(autoRestDotNet, "java"),
    "azureresourceschema": CreatePluginExternal(autoRestDotNet, "azureresourceschema"),
    "csharp-simplifier": CreatePluginExternal(autoRestDotNet, "csharp-simplifier"),

    "commonmarker": CreateCommonmarkProcessor()
  };

  // TODO: think about adding "number of files in scope" kind of validation in between pipeline steps

  // to be replaced with scheduler
  let scopeCtr = 0;
  const RunPlugin: (config: ConfigurationView, pluginName: string, inputScope: DataStoreViewReadonly) => Promise<DataStoreViewReadonly> =
    async (config, pluginName, inputScope) => {
      const plugin = plugins[pluginName];
      if (!plugin) {
        throw `Plugin '${pluginName}' not found.`;
      }
      try {
        config.Message({ Channel: Channel.Debug, Text: `${pluginName} - START` });

        const scope = config.DataStore.CreateScope(`${++scopeCtr}_${pluginName}`);
        const scopeWorking = scope.CreateScope("working");
        const scopeOutput = scope.CreateScope("output");
        await plugin(config,
          inputScope,
          scopeWorking,
          scopeOutput);

        config.Message({ Channel: Channel.Debug, Text: `${pluginName} - END` });
        return scopeOutput;
      } catch (e) {
        config.Message({ Channel: Channel.Fatal, Text: `${pluginName} - FAILED` });
        throw e;
      }
    };

  const scopeLoadedSwaggers = await RunPlugin(config, "loader", config.DataStore.GetReadThroughScopeFileSystem(fileSystem));
  const scopeLoadedSwaggersTransformed = await RunPlugin(config, "transform", scopeLoadedSwaggers);
  const scopeComposedSwagger = await RunPlugin(config, "compose", scopeLoadedSwaggersTransformed);
  const scopeComposedSwaggerTransformed = await RunPlugin(config, "transform", scopeComposedSwagger);

  const swagger = await scopeComposedSwaggerTransformed.ReadStrict((await scopeComposedSwaggerTransformed.Enum())[0]);

  {
    const relPath =
      config.GetEntry("output-file") || // TODO: overthink
      (config.GetEntry("namespace") ? config.GetEntry("namespace") : GetFilename([...config.InputFileUris][0]).replace(/\.json$/, ""));
    barrier.Await(emitArtifacts(config, "swagger-document", _ => ResolveUri(config.OutputFolderUri, relPath), scopeComposedSwaggerTransformed, true));
  }

  if (!config.DisableValidation) {
    if (config.GetEntry("model-validator")) {
      barrier.Await(RunPlugin(config, "model-validator", scopeComposedSwaggerTransformed));
    }
    if (config.GetEntry("semantic-validator")) {
      barrier.Await(RunPlugin(config, "semantic-validator", scopeComposedSwaggerTransformed));
    }
    if (config.GetEntry("azure-validator")) {
      barrier.Await(RunPlugin(config, "azure-validator", scopeComposedSwaggerTransformed));
    }
  }

  const allCodeGenerators = ["csharp", "ruby", "nodejs", "python", "go", "java", "azureresourceschema"];
  const usedCodeGenerators = allCodeGenerators.filter(cg => config.GetEntry(cg as any) !== undefined);

  // code generators
  if (usedCodeGenerators.length > 0) {
    // modeler
    let codeModel = await AutoRestDotNetPlugin.Get().Model(swagger, config.DataStore.CreateScope("model"),
      {
        namespace: config.GetEntry("namespace")
      },
      processMessage);

    // GFMer
    const codeModelGFM = await ProcessCodeModel(codeModel, config.DataStore.CreateScope("modelgfm"));

    let pluginCtr = 0;
    for (const usedCodeGenerator of usedCodeGenerators) {
      for (const genConfig of config.GetPluginViews(usedCodeGenerator)) {
        const manipulator = new Manipulator(genConfig);
        const processMessage = genConfig.Message.bind(genConfig);
        const scope = genConfig.DataStore.CreateScope("plugin_" + ++pluginCtr);

        barrier.Await((async () => {
          // TRANSFORM
          const codeModelTransformed = await manipulator.Process(codeModelGFM, scope.CreateScope("transform"), "/code-model-v1.yaml");

          await emitArtifactInternal(genConfig, "code-model-v1", ResolveUri(config.OutputFolderUri, "code-model.yaml"), codeModelTransformed);

          let generatedFileScope = await AutoRestDotNetPlugin.Get().GenerateCode(genConfig, usedCodeGenerator, swagger, codeModelTransformed, scope.CreateScope("generate"), processMessage);

          // C# simplifier
          if (usedCodeGenerator === "csharp") {
            generatedFileScope = await AutoRestDotNetPlugin.Get().SimplifyCSharpCode(generatedFileScope, scope.CreateScope("simplify"), processMessage);
          }

          for (const fileName of await generatedFileScope.Enum()) {
            const handle = await generatedFileScope.ReadStrict(fileName);
            const relPath = decodeURIComponent(handle.key.split("/output/")[1]);
            const outputFileUri = ResolveUri(genConfig.OutputFolderUri, relPath);
            await emitArtifactInternal(genConfig, `source-file-${usedCodeGenerator}`, outputFileUri, handle);
          }
        })());
      }
    }
  }

  await barrier.Wait();
}
