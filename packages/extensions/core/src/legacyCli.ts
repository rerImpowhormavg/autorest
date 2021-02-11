// eslint-disable-next-line unicorn/filename-case
import { isAbsolute } from "path";
/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { ResolveUri, GetFilenameWithoutExtension } from "@azure-tools/uri";
import { DataSource } from "@azure-tools/datastore";
import { AutorestRawConfiguration } from "@autorest/configuration";

const regexLegacyArg = /^-[^-]/;

/* @internal */ export function isLegacy(args: Array<string>): boolean {
  return args.some((arg) => regexLegacyArg.test(arg));
}

async function ParseCompositeSwagger(
  inputScope: DataSource,
  uri: string,
  targetConfig: AutorestRawConfiguration,
): Promise<void> {
  const compositeSwaggerFile = await inputScope.ReadStrict(uri);
  const data = await compositeSwaggerFile.ReadObject<{ info: any; documents: Array<string> }>();
  const documents = data.documents;
  targetConfig["input-file"] = documents.map((d) => ResolveUri(uri, d));

  // forward info section
  targetConfig["override-info"] = data.info;
}

/* @internal */ export async function CreateConfiguration(
  baseFolderUri: string,
  inputScope: DataSource,
  args: Array<string>,
): Promise<AutorestRawConfiguration> {
  const result: AutorestRawConfiguration = {
    "input-file": [],
  };

  const switches: { [key: string]: string | null } = {};

  // parse
  let lastValue: string | null = null;
  for (const arg of args.slice().reverse()) {
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
  result["namespace"] = switches["n"] || switches["namespace"] || GetFilenameWithoutExtension(inputFile);

  const modeler = switches["m"] || switches["modeler"] || "Swagger";
  if (modeler === "CompositeSwagger") {
    await ParseCompositeSwagger(inputScope, ResolveUri(baseFolderUri, inputFile), result);
  }

  const codegenerator = switches["g"] || switches["codegenerator"] || "CSharp";
  const usedCodeGenerator = codegenerator.toLowerCase().replace("azure.", "").replace(".fluent", "");
  if (codegenerator.toLowerCase() === "none") {
    (<any>result)["azure-validator"] = true;
    (<any>result)["openapi-type"] = "arm";
  } else {
    (<any>result)[usedCodeGenerator] = {};
    if (codegenerator.toLowerCase().startsWith("azure.")) {
      (<any>result)[usedCodeGenerator]["azure-arm"] = true;
    }
    if (codegenerator.toLowerCase().endsWith(".fluent")) {
      result["fluent"] = true;
    }
  }

  result["license-header"] = switches["header"] || undefined;
  result["payload-flattening-threshold"] = parseInt(switches["ft"] || switches["payloadflatteningthreshold"] || "0");
  result["sync-methods"] = <any>switches["syncmethods"] || undefined;
  result["add-credentials"] =
    switches["addcredentials"] === null || (switches["addcredentials"] + "").toLowerCase() === "true";

  if (usedCodeGenerator === "ruby" || usedCodeGenerator === "python" || usedCodeGenerator === "go") {
    result["package-version"] = switches["pv"] || switches["packageversion"] || undefined;
    result["package-name"] = switches["pn"] || switches["packagename"] || undefined;
  }

  const outputFile = (result["output-file"] = switches["outputfilename"] || undefined);
  if (outputFile && isAbsolute(outputFile)) {
    const splitAt = Math.max(outputFile.lastIndexOf("/"), outputFile.lastIndexOf("\\"));
    result["output-file"] = outputFile.slice(splitAt + 1);
    result["output-folder"] = outputFile.slice(0, splitAt);
  }

  result["message-format"] = switches["jsonvalidationmessages"] !== undefined ? "json" : undefined;

  if (codegenerator.toLowerCase() === "swaggerresolver") {
    result["output-artifact"] = "swagger-document";
    delete (<any>result)[usedCodeGenerator];
  }

  return result;
}
