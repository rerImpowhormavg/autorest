/*---------------------------------------------------------------------------------------------
*  Copyright (c) Microsoft Corporation. All rights reserved.
*  Licensed under the MIT License. See License.txt in the project root for license information.
*--------------------------------------------------------------------------------------------*/

import * as path from "path";
import { ResolveUri, GetFilenameWithoutExtension } from "./lib/ref/uri";
import { DataHandleRead, DataStoreViewReadonly } from "./lib/data-store/data-store";
import { AutoRestConfigurationImpl } from "./lib/configuration";

const regexLegacyArg = /^-[^-]/;

export function isLegacy(args: string[]): boolean {
  return args.some(arg => regexLegacyArg.test(arg));
}

async function ParseCompositeSwagger(inputScope: DataStoreViewReadonly, uri: string, targetConfig: AutoRestConfigurationImpl): Promise<void> {
  const compositeSwaggerFile = await inputScope.ReadStrict(uri);
  const data = await compositeSwaggerFile.ReadObject<{ info: any, documents: string[] }>();
  const documents = data.documents;
  targetConfig["input-file"] = documents.map(d => ResolveUri(uri, d));

  // forward info section
  targetConfig.__specials = targetConfig.__specials || {};
  targetConfig.__specials.infoSectionOverride = data.info;
}

export async function CreateConfiguration(baseFolderUri: string, inputScope: DataStoreViewReadonly, args: string[]): Promise<AutoRestConfigurationImpl> {
  let result: AutoRestConfigurationImpl = {
    "input-file": []
  };
  const switches: { [key: string]: string | null } = {};

  // parse
  let lastValue: string | null = null;
  for (const arg of args.reverse()) {
    if (arg.startsWith("-")) {
      switches[arg.substr(1).toLowerCase()] = lastValue;
      lastValue = null;
    } else {
      lastValue = arg;
    }
  }

  // extract
  const inputFile = switches["i"] || switches["input"];
  if (inputFile === null) {
    throw new Error("No input specified.");
  }
  result["input-file"] = inputFile;

  result["output-folder"] = switches["o"] || switches["output"] || switches["outputdirectory"] || "Generated";

  result.__specials = result.__specials || {};
  result.__specials.namespace = switches["n"] || switches["namespace"] || GetFilenameWithoutExtension(inputFile);

  const modeler = switches["m"] || switches["modeler"] || "Swagger";
  if (modeler === "CompositeSwagger") {
    await ParseCompositeSwagger(inputScope, ResolveUri(baseFolderUri, inputFile), result);
  }

  const codegenerator = switches["g"] || switches["codegenerator"] || "CSharp";
  const usedCodeGenerator = codegenerator.toLowerCase().replace("azure.", "").replace(".fluent", "");
  result.__specials = result.__specials || {};
  if (codegenerator.toLowerCase() === "none") {
    result["azure-arm"] = true;
  } else {
    result[usedCodeGenerator] = {};
    if (codegenerator.toLowerCase().startsWith("azure.")) {
      result["azure-arm"] = true;
      result["disable-validation"] = true;
    }
    if (codegenerator.toLowerCase().endsWith(".fluent")) {
      result["fluent"] = true;
    }
  }

  result.__specials.header = switches["header"] || null;

  result.__specials.payloadFlatteningThreshold = parseInt(switches["fs"] || switches["payloadflatteningthreshold"] || "0");

  result.__specials.syncMethods = <any>switches["syncmethods"] || null;

  result.__specials.addCredentials = switches["addcredentials"] === null || ((switches["addcredentials"] + "").toLowerCase() === "true");

  result.__specials.rubyPackageName = GetFilenameWithoutExtension(inputFile).replace(/[^a-zA-Z0-9-_]/g, "").replace(/-/g, '_').replace(/([a-z])([A-Z])/g, "$1_$2").toLowerCase();

  result.__specials.outputFile = switches["outputfilename"] || null;

  if (codegenerator.toLowerCase() === "swaggerresolver") {
    result["output-artifact"] = "swagger-document";
    delete result[usedCodeGenerator];
  }

  return result;
}