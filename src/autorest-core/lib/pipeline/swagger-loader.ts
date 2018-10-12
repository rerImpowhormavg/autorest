/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { ConfigurationView } from "../autorest-core";
import { DataHandle, DataSink, DataSource } from '../data-store/data-store';
import { OperationAbortedException } from "../exception";
import { Channel, SourceLocation } from "../message";
import {
  CommonmarkHeadingFollowingText,
  CommonmarkHeadingText,
  CommonmarkSubHeadings,
  ParseCommonmark
} from "../parsing/literate";
import { Parse as ParseLiterateYaml } from "../parsing/literate-yaml";
import { IndexToPosition, Lines } from "../parsing/text-utility";
import { ResolvePath, ResolveRelativeNode } from "../parsing/yaml";
import { pushAll } from '../ref/array';
import { IsPrefix, JsonPath, JsonPathComponent, stringify } from "../ref/jsonpath";
import { From } from "../ref/linq";
import { safeEval } from "../ref/safe-eval";
import { Mapping, Mappings } from "../ref/source-map";
import { ResolveUri } from "../ref/uri";
import { Clone, CloneAst, Descendants, StrictJsonSyntaxCheck, StringifyAst, ToAst, YAMLNodeWithPath } from "../ref/yaml";
import { IdentitySourceMapping, MergeYamls } from "../source-map/merging";
import { CreateAssignmentMapping } from "../source-map/source-map";

const ctr = 0;

function isReferenceNode(node: YAMLNodeWithPath): boolean {
  const lastKey = node.path[node.path.length - 1];
  return (lastKey === '$ref' || lastKey === 'x-ms-odata') && typeof node.node.value === 'string';
}

async function EnsureCompleteDefinitionIsPresent(
  config: ConfigurationView,
  inputScope: DataSource,
  sink: DataSink,
  visitedEntities: Array<string>,
  externalFiles: { [uri: string]: DataHandle },
  sourceFileUri: string,
  sourceDocObj: any,
  sourceDocMappings: Array<Mapping>,
  currentFileUri?: string,
  entityType?: string,
  modelName?: string) {

  const ensureExtFilePresent: (fileUri: string, config: ConfigurationView, complaintLocation: SourceLocation) => Promise<void> = async (fileUri: string, config: ConfigurationView, complaintLocation: SourceLocation) => {
    if (!externalFiles[fileUri]) {
      const file = await inputScope.Read(fileUri);
      if (file === null) {
        config.Message({
          Channel: Channel.Error,
          Source: [complaintLocation],
          Text: `Referenced file '${fileUri}' not found`
        });
        throw new OperationAbortedException();
      }
      const externalFile = await ParseLiterateYaml(config, file, sink);
      externalFiles[fileUri] = externalFile;
    }
  };

  const sourceDoc = externalFiles[sourceFileUri];
  if (currentFileUri == null) {
    currentFileUri = sourceFileUri;
  }

  const references: Array<YAMLNodeWithPath> = [];
  const currentDoc = externalFiles[currentFileUri];
  const currentDocAst = currentDoc.ReadYamlAst();
  if (entityType == null || modelName == null) {
    // external references
    for (const node of Descendants(currentDocAst)) {
      if (isReferenceNode(node)) {
        if (!(node.node.value as string).startsWith('#')) {
          references.push(node);
        }
      }
    }
  } else {
    // references within external file
    const model = ResolveRelativeNode(currentDocAst, currentDocAst, [entityType, modelName]);
    for (const node of Descendants(model, [entityType, modelName])) {
      if (isReferenceNode(node)) {
        references.push(node);
      }
    }
  }

  const inputs: Array<DataHandle> = [sourceDoc];
  for (const { node, path } of references) {

    const complaintLocation: SourceLocation = { document: currentDoc.key, Position: <any>{ path } };

    const refPath = node.value as string;
    if (refPath.indexOf('#') === -1) {
      // inject entire file right here
      const fileUri = ResolveUri(currentFileUri, refPath);
      await ensureExtFilePresent(fileUri, config, complaintLocation);
      // console.error("Resolving ", fileUri);
      const targetPath = path.slice(0, path.length - 1);
      const extObj = externalFiles[fileUri].ReadObject();
      safeEval(`${stringify(targetPath)} = extObj`, { $: sourceDocObj, extObj });
      //// performance hit:
      // inputs.push(externalFiles[fileUri]);
      // sourceDocMappings.push(...CreateAssignmentMapping(
      //   extObj, externalFiles[fileUri].key,
      //   [], targetPath,
      //   `resolving '${refPath}' in '${currentFileUri}'`));

      // remove $ref
      sourceDocMappings = sourceDocMappings.filter(m => !IsPrefix(path, (m.generated as any).path));
      continue;
    }
    const refPathParts = refPath.split('#').filter(s => s.length > 0);
    let fileUri: string | null = null;
    let entityPath = refPath;
    if (refPathParts.length === 2) {
      fileUri = refPathParts[0];
      entityPath = '#' + refPathParts[1];
      fileUri = ResolveUri(currentFileUri, fileUri);
      await ensureExtFilePresent(fileUri, config, complaintLocation);
    }

    const entityPathParts = entityPath.split('/').filter(s => s.length > 0);
    const referencedEntityType = entityPathParts[1];
    const referencedModelName = entityPathParts[2];

    sourceDocObj[referencedEntityType] = sourceDocObj[referencedEntityType] || {};
    if (visitedEntities.indexOf(entityPath) === -1) {
      visitedEntities.push(entityPath);
      if (sourceDocObj[referencedEntityType][referencedModelName] === undefined) {
        if (fileUri != null) {
          sourceDocMappings = await EnsureCompleteDefinitionIsPresent(config, inputScope, sink, visitedEntities, externalFiles, sourceFileUri, sourceDocObj, sourceDocMappings, fileUri, referencedEntityType, referencedModelName);
          const extObj = externalFiles[fileUri].ReadObject<any>();
          inputs.push(externalFiles[fileUri]);
          sourceDocObj[referencedEntityType][referencedModelName] = extObj[referencedEntityType][referencedModelName];
          sourceDocMappings.push(...CreateAssignmentMapping(
            extObj[referencedEntityType][referencedModelName], externalFiles[fileUri].key,
            [referencedEntityType, referencedModelName], [referencedEntityType, referencedModelName],
            `resolving '${refPath}' in '${currentFileUri}'`));
        } else {
          sourceDocMappings = await EnsureCompleteDefinitionIsPresent(config, inputScope, sink, visitedEntities, externalFiles, sourceFileUri, sourceDocObj, sourceDocMappings, currentFileUri, referencedEntityType, referencedModelName);
          const currentObj = externalFiles[currentFileUri].ReadObject<any>();
          inputs.push(externalFiles[currentFileUri]);
          sourceDocObj[referencedEntityType][referencedModelName] = currentObj[referencedEntityType][referencedModelName];
          sourceDocMappings.push(...CreateAssignmentMapping(
            currentObj[referencedEntityType][referencedModelName], externalFiles[currentFileUri].key,
            [referencedEntityType, referencedModelName], [referencedEntityType, referencedModelName],
            `resolving '${refPath}' in '${currentFileUri}'`));
        }
      } else {
        // throw new Error(`Model definition '${entityPath}' already present`);
      }
    }
  }

  // ensure that all the models that are an allOf on the current model in the external doc are also included
  if (entityType != null && modelName != null) {
    let reference = '#/' + entityType + '/' + modelName;
    const dependentRefs: Array<YAMLNodeWithPath> = [];
    for (const node of Descendants(currentDocAst)) {
      const path = node.path;
      if (path.length > 3 && path[path.length - 3] === 'allOf' && isReferenceNode(node) && (node.node.value as string) === reference) {
        dependentRefs.push(node);
      }
    }
    for (const dependentRef of dependentRefs) {
      // the JSON Path "definitions.ModelName.allOf[0].$ref" provides the name of the model that is an allOf on the current model
      const refs = dependentRef.path;
      const defSec = refs[0];
      const model = refs[1];
      if (typeof defSec === 'string' && typeof model === 'string' && visitedEntities.indexOf(`#/${defSec}/${model}`) === -1) {
        // recursively check if the model is completely defined.
        sourceDocMappings = await EnsureCompleteDefinitionIsPresent(config, inputScope, sink, visitedEntities, externalFiles, sourceFileUri, sourceDocObj, sourceDocMappings, currentFileUri, defSec, model);
        const currentObj = externalFiles[currentFileUri].ReadObject<any>();
        inputs.push(externalFiles[currentFileUri]);
        sourceDocObj[defSec][model] = currentObj[defSec][model];
        sourceDocMappings.push(...CreateAssignmentMapping(
          currentObj[defSec][model], externalFiles[currentFileUri].key,
          [defSec, model], [defSec, model],
          `resolving '${stringify(dependentRef.path)}' (has allOf on '${reference}') in '${currentFileUri}'`));
      }
    }
  }

  // commit back
  externalFiles[sourceFileUri] = await sink.WriteObject('revision', sourceDocObj, undefined, sourceDocMappings, [...Object.getOwnPropertyNames(externalFiles).map(x => externalFiles[x]), sourceDoc] /* inputs */ /*TODO: fix*/);
  return sourceDocMappings;
}

async function StripExternalReferences(swagger: DataHandle, sink: DataSink): Promise<DataHandle> {
  const ast = CloneAst(swagger.ReadYamlAst());
  const mapping = IdentitySourceMapping(swagger.key, ast);
  for (const node of Descendants(ast)) {
    if (isReferenceNode(node)) {
      const parts = (node.node.value as string).split('#');
      if (parts.length === 2) {
        node.node.value = '#' + (node.node.value as string).split('#')[1];
      }
    }
  }
  return sink.WriteData('result.yaml', StringifyAst(ast), undefined, mapping, [swagger]);
}

export async function LoadLiterateSwaggerOverride(config: ConfigurationView, inputScope: DataSource, inputFileUri: string, sink: DataSink): Promise<DataHandle> {
  const commonmark = await inputScope.ReadStrict(inputFileUri);
  const rawCommonmark = commonmark.ReadData();
  const commonmarkNode = await ParseCommonmark(rawCommonmark);

  const directives: Array<any> = [];
  const mappings: Mappings = [];
  const transformer: Array<string> = [];
  const state = [...CommonmarkSubHeadings(commonmarkNode.firstChild)].map(x => ({ node: x, query: "$" }));

  while (state.length > 0) {
    const x = state.pop(); if (x === undefined) { throw "unreachable"; }
    // extract heading clue
    // Syntax: <regular heading> (`<query>`)
    // query syntax:
    // - implicit prefix: "@." (omitted if starts with "$." or "@.")
    // - "#<asd>" to obtain the object containing a string property containing "<asd>"
    let clue: string | null = null;
    let node = x.node.firstChild;
    while (node) {
      if ((node.literal || '').endsWith('(')
        && (((node.next || <any>{}).next || {}).literal || '').startsWith(')')
        && node.next
        && node.next.type === 'code') {
        clue = node.next.literal;
        break;
      }
      node = node.next;
    }

    // process clue
    if (clue) {
      // be explicit about relativity
      if (!clue.startsWith('@.') && !clue.startsWith('$.')) {
        clue = '@.' + clue;
      }

      // make absolute
      if (clue.startsWith('@.')) {
        clue = x.query + clue.slice(1);
      }

      // replace queries
      const candidProperties = ['name', 'operationId', '$ref'];
      clue = clue.replace(/\.\#(.+?)\b/g, (_, match) => `..[?(${candidProperties.map(p => `(@[${JSON.stringify(p)}] && @[${JSON.stringify(p)}].indexOf(${JSON.stringify(match)}) !== -1)`).join(' || ')})]`);

      // console.log(clue);

      // target field
      const allowedTargetFields = ['description', 'summary'];
      const targetField = allowedTargetFields.filter(f => (clue || '').endsWith('.' + f))[0] || 'description';
      const targetPath = clue.endsWith('.' + targetField) ? clue.slice(0, clue.length - targetField.length - 1) : clue;

      if (targetPath !== '$.parameters' && targetPath !== '$.definitions') {
        // add directive
        const headingTextRange = CommonmarkHeadingFollowingText(x.node);
        const documentation = Lines(rawCommonmark).slice(headingTextRange[0] - 1, headingTextRange[1]).join('\n');
        directives.push({
          where: targetPath,
          transform: `
            if (typeof $.${targetField} === "string" || typeof $.${targetField} === "undefined")
              $.${targetField} = ${JSON.stringify(documentation)};`
        });
      }
    }

    state.push(...[...CommonmarkSubHeadings(x.node)].map(y => ({ node: y, query: clue || x.query })));
  }

  return sink.WriteObject('override-directives', { directive: directives }, undefined, mappings, [commonmark]);
}

export async function LoadLiterateOpenApiOverride(config: ConfigurationView, inputScope: DataSource, inputFileUri: string, sink: DataSink): Promise<DataHandle> {
  const commonmark = await inputScope.ReadStrict(inputFileUri);
  const rawCommonmark = commonmark.ReadData();
  const commonmarkNode = await ParseCommonmark(rawCommonmark);

  const directives: Array<any> = [];
  const mappings: Mappings = [];
  const transformer: Array<string> = [];
  const state = [...CommonmarkSubHeadings(commonmarkNode.firstChild)].map(x => ({ node: x, query: "$" }));

  while (state.length > 0) {
    const x = state.pop(); if (x === undefined) { throw "unreachable"; }
    // extract heading clue
    // Syntax: <regular heading> (`<query>`)
    // query syntax:
    // - implicit prefix: "@." (omitted if starts with "$." or "@.")
    // - "#<asd>" to obtain the object containing a string property containing "<asd>"
    let clue: string | null = null;
    let node = x.node.firstChild;
    while (node) {
      if ((node.literal || '').endsWith('(')
        && (((node.next || <any>{}).next || {}).literal || '').startsWith(')')
        && node.next
        && node.next.type === 'code') {
        clue = node.next.literal;
        break;
      }
      node = node.next;
    }

    // process clue
    if (clue) {
      // be explicit about relativity
      if (!clue.startsWith('@.') && !clue.startsWith('$.')) {
        clue = '@.' + clue;
      }

      // make absolute
      if (clue.startsWith('@.')) {
        clue = x.query + clue.slice(1);
      }

      // replace queries
      const candidProperties = ['name', 'operationId', '$ref'];
      clue = clue.replace(/\.\#(.+?)\b/g, (_, match) => `..[?(${candidProperties.map(p => `(@[${JSON.stringify(p)}] && @[${JSON.stringify(p)}].indexOf(${JSON.stringify(match)}) !== -1)`).join(' || ')})]`);

      // console.log(clue);

      // target field
      const allowedTargetFields = ['description', 'summary'];
      const targetField = allowedTargetFields.filter(f => (clue || '').endsWith('.' + f))[0] || 'description';
      const targetPath = clue.endsWith('.' + targetField) ? clue.slice(0, clue.length - targetField.length - 1) : clue;

      if (targetPath !== '$.parameters' && targetPath !== '$.definitions') {
        // add directive
        const headingTextRange = CommonmarkHeadingFollowingText(x.node);
        const documentation = Lines(rawCommonmark).slice(headingTextRange[0] - 1, headingTextRange[1]).join('\n');
        directives.push({
          where: targetPath,
          transform: `
            if (typeof $.${targetField} === "string" || typeof $.${targetField} === "undefined")
              $.${targetField} = ${JSON.stringify(documentation)};`
        });
      }
    }

    state.push(...[...CommonmarkSubHeadings(x.node)].map(y => ({ node: y, query: clue || x.query })));
  }

  return sink.WriteObject('override-directives', { directive: directives }, undefined, mappings, [commonmark]);
}

export async function LoadLiterateSwagger(config: ConfigurationView, inputScope: DataSource, inputFileUri: string, sink: DataSink): Promise<DataHandle | null> {
  const handle = await inputScope.ReadStrict(inputFileUri);
  checkSyntaxFromData(inputFileUri, handle, config);
  const data = await ParseLiterateYaml(config, handle, sink);
  // check OpenAPI version
  if (data.ReadObject<any>().swagger !== '2.0') {
    return null;
    // TODO: Should we throw or send an error message?
  }

  const ast = CloneAst(data.ReadYamlAst());
  const mapping = IdentitySourceMapping(data.key, ast);

  return sink.WriteData('result.yaml', StringifyAst(ast), undefined, mapping, [data]);
}

export async function LoadLiterateOpenAPI(config: ConfigurationView, inputScope: DataSource, inputFileUri: string, sink: DataSink): Promise<DataHandle | null> {
  const handle = await inputScope.ReadStrict(inputFileUri);
  checkSyntaxFromData(inputFileUri, handle, config);
  const data = await ParseLiterateYaml(config, handle, sink);
  if (!isOpenAPI3Spec(data.ReadObject<OpenAPI3Spec>())) {
    return null;
    // TODO: Should we throw or send an error message?
  }

  const ast = CloneAst(data.ReadYamlAst());
  const mapping = IdentitySourceMapping(data.key, ast);

  return sink.WriteData('result.yaml', StringifyAst(ast), undefined, mapping, [data]);
}

export async function LoadLiterateSwaggers(config: ConfigurationView, inputScope: DataSource, inputFileUris: Array<string>, sink: DataSink): Promise<Array<DataHandle>> {
  const rawSwaggers: Array<DataHandle> = [];
  for (const inputFileUri of inputFileUris) {
    // read literate Swagger
    const pluginInput = await LoadLiterateSwagger(config, inputScope, inputFileUri, sink);
    if (pluginInput) {
      rawSwaggers.push(pluginInput);
    }
  }
  return rawSwaggers;
}

export async function LoadLiterateOpenAPIs(config: ConfigurationView, inputScope: DataSource, inputFileUris: Array<string>, sink: DataSink): Promise<Array<DataHandle>> {
  const rawOpenApis: Array<DataHandle> = [];
  for (const inputFileUri of inputFileUris) {
    // read literate Swagger
    const pluginInput = await LoadLiterateOpenAPI(config, inputScope, inputFileUri, sink);
    if (pluginInput) {
      rawOpenApis.push(pluginInput);
    }
  }
  return rawOpenApis;
}

export async function LoadLiterateSwaggerOverrides(config: ConfigurationView, inputScope: DataSource, inputFileUris: Array<string>, sink: DataSink): Promise<Array<DataHandle>> {
  const rawSwaggers: Array<DataHandle> = [];
  let i = 0;
  for (const inputFileUri of inputFileUris) {
    // read literate Swagger
    const pluginInput = await LoadLiterateSwaggerOverride(config, inputScope, inputFileUri, sink);
    rawSwaggers.push(pluginInput);
    i++;
  }
  return rawSwaggers;
}

export async function LoadLiterateOpenApiOverrides(config: ConfigurationView, inputScope: DataSource, inputFileUris: Array<string>, sink: DataSink): Promise<Array<DataHandle>> {
  const rawOpenApis: Array<DataHandle> = [];
  let i = 0;
  for (const inputFileUri of inputFileUris) {
    // read literate Swagger
    const pluginInput = await LoadLiterateOpenApiOverride(config, inputScope, inputFileUri, sink);
    rawOpenApis.push(pluginInput);
    i++;
  }
  return rawOpenApis;
}

interface ObjectWithPath<T> { obj: T, path: JsonPath }
function getPropertyValues<T, U>(obj: ObjectWithPath<T>): Array<ObjectWithPath<U>> {
  const o: T = obj.obj || <T>{};
  return Object.getOwnPropertyNames(o).map(n => getProperty<T, U>(obj, n));
}
function getProperty<T, U>(obj: ObjectWithPath<T>, key: string): ObjectWithPath<U> {
  return { obj: (obj.obj as any)[key], path: obj.path.concat([key]) };
}
function getArrayValues<T>(obj: ObjectWithPath<Array<T>>): Array<ObjectWithPath<T>> {
  const o: Array<T> = obj.obj || [];
  return o.map((x, i) => ({ obj: x, path: obj.path.concat([i]) }));
}

function distinct<T>(list: Array<T>): Array<T> {
  const sorted = list.slice().sort();
  return sorted.filter((x, i) => i === 0 || x !== sorted[i - 1]);
}

export async function ComposeSwaggers(config: ConfigurationView, overrideInfoTitle: any, overrideInfoDescription: any, inputSwaggers: Array<DataHandle>, sink: DataSink): Promise<DataHandle> {
  const inputSwaggerObjects = inputSwaggers.map(sw => sw.ReadObject<any>());
  const candidateTitles: Array<string> = overrideInfoTitle
    ? [overrideInfoTitle]
    : distinct(inputSwaggerObjects.map(s => s.info).filter(i => !!i).map(i => i.title));
  const candidateDescriptions: Array<string> = overrideInfoDescription
    ? [overrideInfoDescription]
    : distinct(inputSwaggerObjects.map(s => s.info).filter(i => !!i).map(i => i.description).filter(i => !!i));
  const uniqueVersion: boolean = distinct(inputSwaggerObjects.map(s => s.info).filter(i => !!i).map(i => i.version)).length === 1;

  if (candidateTitles.length === 0) { throw new Error(`No 'title' in provided OpenAPI definition(s).`); }
  if (candidateTitles.length > 1) { throw new Error(`The 'title' across provided OpenAPI definitions has to match. Found: ${candidateTitles.map(x => `'${x}'`).join(", ")}. Please adjust or provide an override (--title=...).`); }
  if (candidateDescriptions.length !== 1) { candidateDescriptions.splice(0, candidateDescriptions.length); }

  // prepare component Swaggers (override info, lift version param, ...)
  for (let i = 0; i < inputSwaggers.length; ++i) {
    const inputSwagger = inputSwaggers[i];
    const swagger = inputSwaggerObjects[i];
    const mapping: Mappings = [];
    const populate: Array<() => void> = []; // populate swagger; deferred in order to simplify source map generation

    // digest "info"
    const info = swagger.info;
    const version = info.version;
    delete info.title;
    delete info.description;
    if (!uniqueVersion) { delete info.version; }

    // extract interesting nodes
    const paths = From<ObjectWithPath<any>>([])
      .Concat(getPropertyValues(getProperty({ obj: swagger, path: [] }, 'paths')))
      .Concat(getPropertyValues(getProperty({ obj: swagger, path: [] }, 'x-ms-paths')));
    const methods = paths.SelectMany(getPropertyValues);
    const parameters =
      methods.SelectMany((method: any) => getArrayValues<any>(getProperty<any, any>(method, 'parameters'))).Concat(
        paths.SelectMany((path: any) => getArrayValues<any>(getProperty<any, any>(path, 'parameters'))));

    // inline api-version params
    if (!uniqueVersion) {
      const clientParams = swagger.parameters || {};
      const apiVersionClientParamName = Object.getOwnPropertyNames(clientParams).filter(n => clientParams[n].name === 'api-version')[0];
      const apiVersionClientParam = apiVersionClientParamName ? clientParams[apiVersionClientParamName] : null;
      if (apiVersionClientParam) {
        const apiVersionClientParam = clientParams[apiVersionClientParamName];
        const apiVersionParameters = parameters.Where((p: any) => p.obj.$ref === `#/parameters/${apiVersionClientParamName}`);
        for (const apiVersionParameter of apiVersionParameters) {
          delete apiVersionParameter.obj.$ref;

          // forward client param
          populate.push(() => ({ ...apiVersionParameter.obj, ...apiVersionClientParam }));
          mapping.push(...CreateAssignmentMapping(
            apiVersionClientParam, inputSwagger.key,
            ['parameters', apiVersionClientParamName], apiVersionParameter.path,
            'inlining api-version'));

          // make constant
          populate.push(() => apiVersionParameter.obj.enum = [version]);
          mapping.push({
            name: 'inlining api-version', source: inputSwagger.key,
            original: { path: [<JsonPathComponent>'info', 'version'] },
            generated: { path: apiVersionParameter.path.concat('enum') }
          });
          mapping.push({
            name: 'inlining api-version', source: inputSwagger.key,
            original: { path: [<JsonPathComponent>'info', 'version'] },
            generated: { path: apiVersionParameter.path.concat('enum', 0) }
          });
        }

        // remove api-version client param
        delete clientParams[apiVersionClientParamName];
      }
    }

    // inline produces/consumes
    for (const pc of ['produces', 'consumes']) {
      const clientPC = swagger[pc];
      if (clientPC) {
        for (const method of methods) {
          if (typeof method.obj === 'object' && !Array.isArray(method.obj) && !(method.obj as any)[pc]) {
            populate.push(() => (method.obj as any)[pc] = Clone(clientPC));
            mapping.push(...CreateAssignmentMapping(
              clientPC, inputSwagger.key,
              [pc], method.path.concat([pc]),
              `inlining ${pc}`));
          }
        }
      }
      delete swagger[pc];
    }

    // finish source map
    pushAll(mapping, IdentitySourceMapping(inputSwagger.key, ToAst(swagger)));

    // populate object
    populate.forEach(f => f());

    // write back
    inputSwaggers[i] = await sink.WriteObject('prepared', swagger, undefined, mapping, [inputSwagger]);
  }

  let hSwagger = await MergeYamls(config, inputSwaggers, sink, true);

  // override info section
  const info: any = { title: candidateTitles[0] };
  if (candidateDescriptions[0]) { info.description = candidateDescriptions[0]; }
  const hInfo = await sink.WriteObject('info.yaml', { info });

  hSwagger = await MergeYamls(config, [hSwagger, hInfo], sink);

  return hSwagger;
}

/**
 * If a JSON file is provided, it checks that the syntax is correct.
 * And if the syntax is incorrect, it puts an error message .
 */
function checkSyntaxFromData(fileUri: string, handle: DataHandle, configView: ConfigurationView): void {
  if (fileUri.toLowerCase().endsWith('.json')) {
    const error = StrictJsonSyntaxCheck(handle.ReadData());
    if (error) {
      configView.Message({
        Channel: Channel.Error,
        Text: `Syntax Error Encountered:  ${error.message}`,
        Source: [<SourceLocation>{ Position: IndexToPosition(handle, error.index), document: handle.key }],
      });
    }
  }
}

/**
 * Checks that the object has the property 'openapi' and that property has
 * the string value matching something like "3.x.x".
 */
function isOpenAPI3Spec(specObject: OpenAPI3Spec): boolean {
  const wasOpenApiVersionFound = /^3.\d.\d$/g.exec(<string>specObject.openapi);
  return (wasOpenApiVersionFound) ? true : false;
}

interface OpenAPI3Spec {
  openapi?: string;
  info?: object;
  paths?: object;
  components?: { schemas?: object };
}