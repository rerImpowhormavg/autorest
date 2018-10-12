/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { Help } from '../../help';
import { ConfigurationView, GetExtension } from '../configuration';
import { DataHandle, DataSink, DataSource, QuickDataSource } from '../data-store/data-store';
import { IFileSystem } from '../file-system';
import { LazyPromise } from '../lazy';
import { Channel, Message } from '../message';
import { ConvertOAI2toOAI3 } from '../openapi/conversion';
import { OutstandingTaskAwaiter } from '../outstanding-task-awaiter';
import { ConvertJsonx2Yaml, ConvertYaml2Jsonx } from '../parsing/yaml';
import { JsonPath, stringify } from '../ref/jsonpath';
import { safeEval } from '../ref/safe-eval';
import { ResolveUri } from '../ref/uri';
import { Descendants, FastStringify, StringifyAst } from '../ref/yaml';
import { EmitArtifacts } from './artifact-emitter';
import { CreatePerFilePlugin, PipelinePlugin } from './common';
import { ProcessCodeModel } from './commonmark-documentation';
import { GetPlugin_ComponentModifier } from './component-modifier';
import { GetPlugin_Help } from './help';
import { Manipulator } from './manipulation';
import { GetPlugin_ReflectApiVersion } from './metadata-generation';
import { AutoRestExtension } from './plugin-endpoint';
import { GetPlugin_SchemaValidatorOpenApi, GetPlugin_SchemaValidatorSwagger } from './schema-validation';
import { ComposeSwaggers, LoadLiterateOpenAPIOverrides, LoadLiterateOpenAPIs, LoadLiterateSwaggerOverrides, LoadLiterateSwaggers } from './swagger-loader';

interface PipelineNode {
  outputArtifact?: string;
  pluginName: string;
  configScope: JsonPath;
  inputs: Array<string>;
  skip: boolean;
}

function GetPlugin_Identity(): PipelinePlugin {
  return async (config, input) => input;
}

function GetPlugin_LoaderSwagger(): PipelinePlugin {
  return async (config, input, sink) => {
    const inputs = config.InputFileUris;
    const swaggers = await LoadLiterateSwaggers(
      config,
      input,
      inputs,
      sink
    );
    const result: Array<DataHandle> = [];
    if (swaggers.length === inputs.length) {
      for (let i = 0; i < inputs.length; ++i) {
        result.push(await sink.Forward(inputs[i], swaggers[i]));
      }
    }
    return new QuickDataSource(result, swaggers.length !== inputs.length);
  };
}

function GetPlugin_LoaderOpenAPI(): PipelinePlugin {
  return async (config, input, sink) => {
    const inputs = config.InputFileUris;
    const openapis = await LoadLiterateOpenAPIs(
      config,
      input,
      inputs,
      sink
    );
    const result: Array<DataHandle> = [];
    if (openapis.length === inputs.length) {
      for (let i = 0; i < inputs.length; ++i) {
        result.push(await sink.Forward(inputs[i], openapis[i]));
      }
    }
    return new QuickDataSource(result, openapis.length !== inputs.length);
  };
}

function GetPlugin_MdOverrideLoaderSwagger(): PipelinePlugin {
  return async (config, input, sink) => {
    const inputs = config.InputFileUris;
    const swaggers = await LoadLiterateSwaggerOverrides(
      config,
      input,
      inputs, sink);
    const result: Array<DataHandle> = [];
    for (let i = 0; i < inputs.length; ++i) {
      result.push(await sink.Forward(inputs[i], swaggers[i]));
    }
    return new QuickDataSource(result, input.skip);
  };
}

function GetPlugin_MdOverrideLoaderOpenAPI(): PipelinePlugin {
  return async (config, input, sink) => {
    const inputs = config.InputFileUris;
    const openapis = await LoadLiterateOpenAPIOverrides(
      config,
      input,
      inputs, sink);
    const result: Array<DataHandle> = [];
    for (let i = 0; i < inputs.length; ++i) {
      result.push(await sink.Forward(inputs[i], openapis[i]));
    }
    return new QuickDataSource(result, input.skip);
  };
}

function GetPlugin_OAI2toOAIx(): PipelinePlugin {
  return CreatePerFilePlugin(async config => async (fileIn, sink) => {
    const fileOut = await ConvertOAI2toOAI3(fileIn, sink);
    return sink.Forward(fileIn.Description, fileOut);
  });
}

function GetPlugin_Yaml2Jsonx(): PipelinePlugin {
  return CreatePerFilePlugin(async config => async (fileIn, sink) => {
    let ast = fileIn.ReadYamlAst();
    ast = ConvertYaml2Jsonx(ast);
    return sink.WriteData(fileIn.Description, StringifyAst(ast));
  });
}

function GetPlugin_Jsonx2Yaml(): PipelinePlugin {
  return CreatePerFilePlugin(async config => async (fileIn, sink) => {
    let ast = fileIn.ReadYamlAst();
    ast = ConvertJsonx2Yaml(ast);
    return sink.WriteData(fileIn.Description, StringifyAst(ast));
  });
}

function GetPlugin_Transformer(): PipelinePlugin {
  return CreatePerFilePlugin(async config => {
    const isObject = config.GetEntry('is-object' as any) === false ? false : true;
    const manipulator = new Manipulator(config);
    return async (fileIn, sink) => {
      const fileOut = await manipulator.Process(fileIn, sink, isObject, fileIn.Description);
      return sink.Forward(fileIn.Description, fileOut);
    };
  });
}

function GetPlugin_TransformerImmediate(): PipelinePlugin {
  return async (config, input, sink) => {
    const isObject = config.GetEntry('is-object' as any) === false ? false : true;
    const files = await input.Enum(); // first all the immediate-configs, then a single swagger-document
    const scopes = await Promise.all(files.slice(0, files.length - 1).map(f => input.ReadStrict(f)));
    const manipulator = new Manipulator(config.GetNestedConfigurationImmediate(...scopes.map(s => s.ReadObject<any>())));
    const file = files[files.length - 1];
    const fileIn = await input.ReadStrict(file);
    const fileOut = await manipulator.Process(fileIn, sink, isObject, fileIn.Description);
    return new QuickDataSource([await sink.Forward('swagger-document', fileOut)], input.skip);
  };
}

function GetPlugin_Composer(): PipelinePlugin {
  return async (config, input, sink) => {
    const swaggers = await Promise.all((await input.Enum()).map(x => input.ReadStrict(x)));
    const overrideInfo = config.GetEntry('override-info');
    const overrideTitle = (overrideInfo && overrideInfo.title) || config.GetEntry('title');
    const overrideDescription = (overrideInfo && overrideInfo.description) || config.GetEntry('description');
    const swagger = await ComposeSwaggers(config, overrideTitle, overrideDescription, swaggers, sink);
    return new QuickDataSource([await sink.Forward('composed', swagger)], input.skip);
  };
}

function GetPlugin_External(host: AutoRestExtension, pluginName: string): PipelinePlugin {
  return async (config, input, sink) => {
    const plugin = await host;
    const pluginNames = await plugin.GetPluginNames(config.CancellationToken);
    if (pluginNames.indexOf(pluginName) === -1) {
      throw new Error(`Plugin ${pluginName} not found.`);
    }
    let shouldSkip: boolean | undefined;

    const results: Array<DataHandle> = [];
    const result = await plugin.Process(
      pluginName,
      key => config.GetEntry(key as any),
      config,
      input,
      sink,
      f => results.push(f),
      (message: Message) => {
        if (message.Channel === Channel.Control) {
          if (message.Details && message.Details.skip !== undefined) {
            shouldSkip = message.Details.skip;
          }

        } else {
          return config.Message.bind(config)(message);
        }
      },

      config.CancellationToken);
    if (!result) {
      throw new Error(`Plugin ${pluginName} reported failure.`);
    }
    return new QuickDataSource(results, shouldSkip);
  };
}

function GetPlugin_CommonmarkProcessor(): PipelinePlugin {
  return async (config, input, sink) => {
    const files = await input.Enum();
    const results: Array<DataHandle> = [];
    for (let file of files) {
      const fileIn = await input.ReadStrict(file);
      const fileOut = await ProcessCodeModel(fileIn, sink);
      file = file.substr(file.indexOf('/output/') + '/output/'.length);
      results.push(await sink.Forward('code-model-v1', fileOut));
    }
    return new QuickDataSource(results, input.skip);
  };
}

function GetPlugin_ArtifactEmitter(inputOverride?: () => Promise<DataSource>): PipelinePlugin {
  return async (config, input, sink) => {
    if (inputOverride) {
      input = await inputOverride();
    }

    // clear output-folder if requested
    if (config.GetEntry('clear-output-folder' as any)) {
      config.ClearFolder.Dispatch(config.OutputFolderUri);
    }

    await EmitArtifacts(
      config,
      config.GetEntry('input-artifact' as any) || null,
      key => ResolveUri(
        config.OutputFolderUri,
        safeEval<string>(config.GetEntry('output-uri-expr' as any) || '$key', { $key: key, $config: config.Raw })),
      input,
      config.GetEntry('is-object' as any));
    return new QuickDataSource([]);
  };
}

function BuildPipeline(config: ConfigurationView): { pipeline: { [name: string]: PipelineNode }, configs: { [jsonPath: string]: ConfigurationView } } {
  const cfgPipeline = config.GetEntry('pipeline' as any);
  const pipeline: { [name: string]: PipelineNode } = {};
  const configCache: { [jsonPath: string]: ConfigurationView } = {};

  // Resolves a pipeline stage name using the current stage's name and the relative name.
  // It considers the actually existing pipeline stages.
  // Example:
  // (csharp/cm/transform, commonmarker)
  //    --> csharp/cm/commonmarker       if such a stage exists
  //    --> csharp/commonmarker          if such a stage exists
  //    --> commonmarker                 if such a stage exists
  //    --> THROWS                       otherwise
  const resolvePipelineStageName = (currentStageName: string, relativeName: string) => {
    while (currentStageName !== '') {
      currentStageName = currentStageName.substring(0, currentStageName.length - 1);
      currentStageName = currentStageName.substring(0, currentStageName.lastIndexOf('/') + 1);

      if (cfgPipeline[currentStageName + relativeName]) {
        return currentStageName + relativeName;
      }
    }
    throw new Error(`Cannot resolve pipeline stage '${relativeName}'.`);
  };

  // One pipeline stage can generate multiple nodes in the pipeline graph
  // if the stage is associated with a configuration scope that has multiple entries.
  // Example: multiple generator calls
  const createNodesAndSuffixes: (stageName: string) => { name: string, suffixes: Array<string> } = stageName => {
    const cfg = cfgPipeline[stageName];
    if (!cfg) {
      throw new Error(`Cannot find pipeline stage '${stageName}'.`);
    }
    if (cfg.suffixes) {
      return { name: stageName, suffixes: cfg.suffixes };
    }

    // derive information about given pipeline stage
    const plugin = cfg.plugin || stageName.split('/').reverse()[0];
    const outputArtifact = cfg['output-artifact'];
    const scope = cfg.scope;
    const inputs: Array<string> = (!cfg.input ? [] : (Array.isArray(cfg.input) ? cfg.input : [cfg.input])).map((x: string) => resolvePipelineStageName(stageName, x));

    const suffixes: Array<string> = [];
    // adds nodes using at least suffix `suffix`, the input nodes called `inputs` using the context `config`
    // AFTER considering all the input nodes `inputNodes`
    // Example:
    // ("", [], cfg, [{ name: "a", suffixes: ["/0", "/1"] }])
    // --> ("/0", ["a/0"], cfg of "a/0", [])
    //     --> adds node `${stageName}/0`
    // --> ("/1", ["a/1"], cfg of "a/1", [])
    //     --> adds node `${stageName}/1`
    // Note: inherits the config of the LAST input node (affects for example `.../generate`)
    const addNodesAndSuffixes = (suffix: string, inputs: Array<string>, configScope: JsonPath, inputNodes: Array<{ name: string, suffixes: Array<string> }>) => {
      if (inputNodes.length === 0) {
        const config = configCache[stringify(configScope)];
        const configs = scope ? [...config.GetNestedConfiguration(scope)] : [config];
        for (let i = 0; i < configs.length; ++i) {
          const newSuffix = configs.length === 1 ? '' : '/' + i;
          suffixes.push(suffix + newSuffix);
          const path: JsonPath = configScope.slice();
          if (scope) { path.push(scope); }
          if (configs.length !== 1) { path.push(i); }
          configCache[stringify(path)] = configs[i];
          pipeline[stageName + suffix + newSuffix] = {
            pluginName: plugin,
            outputArtifact,
            configScope: path,
            inputs,
            skip: false,
          };
        }
      } else {
        const inputSuffixesHead = inputNodes[0];
        const inputSuffixesTail = inputNodes.slice(1);
        for (const inputSuffix of inputSuffixesHead.suffixes) {
          const additionalInput = inputSuffixesHead.name + inputSuffix;
          addNodesAndSuffixes(
            suffix + inputSuffix,
            inputs.concat([additionalInput]),
            pipeline[additionalInput].configScope,
            inputSuffixesTail);
        }
      }
    };

    configCache[stringify([])] = config;
    addNodesAndSuffixes('', [], [], inputs.map(createNodesAndSuffixes));

    return { name: stageName, suffixes: cfg.suffixes = suffixes };
  };

  for (const pipelineStepName of Object.keys(cfgPipeline)) {
    createNodesAndSuffixes(pipelineStepName);
  }

  return {
    pipeline,
    configs: configCache
  };
}

export async function RunPipeline(configView: ConfigurationView, fileSystem: IFileSystem): Promise<void> {
  // built-in plugins
  const plugins: { [name: string]: PipelinePlugin } = {
    'help': GetPlugin_Help(),
    'identity': GetPlugin_Identity(),
    'loader-swagger': GetPlugin_LoaderSwagger(),
    'loader-openapi': GetPlugin_LoaderOpenAPI(),
    'md-override-loader-swagger': GetPlugin_MdOverrideLoaderSwagger(),
    'md-override-loader-openapi': GetPlugin_MdOverrideLoaderOpenAPI(),
    'transform': GetPlugin_Transformer(),
    'transform-immediate': GetPlugin_TransformerImmediate(),
    'compose': GetPlugin_Composer(),
    'schema-validator-openapi': GetPlugin_SchemaValidatorOpenApi(),
    'schema-validator-swagger': GetPlugin_SchemaValidatorSwagger(),
    // TODO: replace with OAV again
    'semantic-validator': GetPlugin_Identity(),

    'openapi-document-converter': GetPlugin_OAI2toOAIx(),
    'component-modifiers': GetPlugin_ComponentModifier(),
    'yaml2jsonx': GetPlugin_Yaml2Jsonx(),
    'jsonx2yaml': GetPlugin_Jsonx2Yaml(),
    'reflect-api-versions-cs': GetPlugin_ReflectApiVersion(),
    'commonmarker': GetPlugin_CommonmarkProcessor(),
    'emitter': GetPlugin_ArtifactEmitter(),
    'pipeline-emitter': GetPlugin_ArtifactEmitter(async () => new QuickDataSource([await configView.DataStore.getDataSink().WriteObject('pipeline', pipeline.pipeline, 'pipeline')])),
    'configuration-emitter': GetPlugin_ArtifactEmitter(async () => new QuickDataSource([await configView.DataStore.getDataSink().WriteObject('configuration', configView.Raw, 'configuration')]))
  };

  // dynamically loaded, auto-discovered plugins
  const __extensionExtension: { [pluginName: string]: AutoRestExtension } = {};
  for (const useExtensionQualifiedName of configView.GetEntry('used-extension' as any) || []) {
    const extension = await GetExtension(useExtensionQualifiedName);
    for (const plugin of await extension.GetPluginNames(configView.CancellationToken)) {
      if (!plugins[plugin]) {
        plugins[plugin] = GetPlugin_External(extension, plugin);
        __extensionExtension[plugin] = extension;
      }
    }
  }

  // __status scope
  const startTime = Date.now();
  (configView.Raw as any).__status = new Proxy<any>({}, {
    get(_, key) {
      if (key === '__info') { return false; }
      const expr = new Buffer(key.toString(), 'base64').toString('ascii');
      try {
        return FastStringify(safeEval(expr, {
          pipeline: pipeline.pipeline,
          external: __extensionExtension,
          tasks,
          startTime,
          blame: (uri: string, position: any /*TODO: cleanup, nail type*/) => configView.DataStore.Blame(uri, position)
        }));
      } catch (e) {
        return '' + e;
      }
    }
  });

  // TODO: think about adding "number of files in scope" kind of validation in between pipeline steps

  const fsInput = configView.DataStore.GetReadThroughScope(fileSystem);
  const pipeline = BuildPipeline(configView);

  const ScheduleNode: (nodeName: string) => Promise<DataSource> =
    async (nodeName) => {
      const node = pipeline.pipeline[nodeName];

      if (!node) {
        throw new Error(`Cannot find pipeline node ${nodeName}.`);
      }

      // get input
      const inputScopes: Array<DataSource> = await Promise.all(node.inputs.map(getTask));

      let inputScope: DataSource;
      if (inputScopes.length === 0) {
        inputScope = fsInput;
      } else {
        let skip: boolean | undefined;

        const handles: Array<DataHandle> = [];
        for (const pscope of inputScopes) {
          const scope = await pscope;
          if (pscope.skip !== undefined) {
            skip = skip === undefined ? pscope.skip : skip && pscope.skip;
          }
          for (const handle of await scope.Enum()) {
            handles.push(await scope.ReadStrict(handle));
          }
        }
        inputScope = new QuickDataSource(handles, skip);
      }

      const config = pipeline.configs[stringify(node.configScope)];
      const pluginName = node.pluginName;
      const plugin = plugins[pluginName];

      if (!plugin) {
        throw new Error(`Plugin '${pluginName}' not found.`);
      }

      if (inputScope.skip) {
        config.Message({ Channel: Channel.Debug, Text: `${nodeName} - SKIPPING` });
        return inputScope;
      }
      try {
        config.Message({ Channel: Channel.Debug, Text: `${nodeName} - START` });

        const scopeResult = await plugin(config, inputScope, config.DataStore.getDataSink(node.outputArtifact));

        config.Message({ Channel: Channel.Debug, Text: `${nodeName} - END` });
        return scopeResult;
      } catch (e) {
        config.Message({ Channel: Channel.Fatal, Text: `${nodeName} - FAILED` });
        config.Message({ Channel: Channel.Fatal, Text: `${e}` });
        throw e;
      }
    };

  // schedule pipeline
  const tasks: { [name: string]: Promise<DataSource> } = {};
  const getTask = (name: string) => name in tasks ?
    tasks[name] :
    tasks[name] = ScheduleNode(name);

  // execute pipeline
  const barrier = new OutstandingTaskAwaiter();
  const barrierRobust = new OutstandingTaskAwaiter();

  for (const name of Object.keys(pipeline.pipeline)) {
    const task = getTask(name);
    const taskx: { _state: 'running' | 'failed' | 'complete'; _result(): Array<DataHandle>; _finishedAt: number } = task as any;
    taskx._state = 'running';
    task.then(async x => {
      const res = await Promise.all((await x.Enum()).map(key => x.ReadStrict(key)));
      taskx._result = () => res;
      taskx._state = 'complete';
      taskx._finishedAt = Date.now();
    }).catch(() => taskx._state = 'failed');
    barrier.Await(task);
    barrierRobust.Await(task.catch(() => { }));
  }

  try {
    await barrier.Wait();
  } catch (e) {
    // wait for outstanding nodes
    try {
      await barrierRobust.Wait();
    } catch {
      // wait for others to fail or whatever...
    }
    throw e;
  }
}
