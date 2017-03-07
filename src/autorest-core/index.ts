#!/usr/bin/env node
/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { createFileUri } from "./lib/approved-imports/uri";
import { stringify } from "./lib/approved-imports/yaml";
import { DataStore, DataStoreView, KnownScopes, DataHandleRead } from "./lib/data-store/data-store";
import { AutoRestConfiguration } from "./lib/configuration/configuration";
import { RunPipeline, DataPromise } from "./lib/pipeline/pipeline";
import { MultiPromiseUtility } from "./lib/approved-imports/multi-promise";
import { CancellationToken } from "./lib/approved-imports/cancallation";

/* @internal */
export async function run(
  configurationUri: string,
  callback: (data: DataHandleRead) => Promise<void>,
  cancellationToken: CancellationToken = CancellationToken.None)
  : Promise<void> {

  const dataStore: DataStoreView = new DataStore(cancellationToken);
  const outputData = await RunPipeline(configurationUri, dataStore);
}

/* @internal */
export async function runWithKnownSetOfFiles(
  configuration: AutoRestConfiguration,
  inputFiles: { [fileName: string]: string },
  callback: (data: DataHandleRead) => Promise<void>,
  cancellationToken: CancellationToken = CancellationToken.None)
  : Promise<void> {

  const dataStore = new DataStore(cancellationToken);
  const configFileUri = createFileUri("config.yaml");

  // input
  const inputView = dataStore.CreateScope(KnownScopes.Input).AsFileScope();
  const hwConfig = await inputView.Write(configFileUri);
  await hwConfig.WriteData(stringify(configuration));
  for (const fileName in inputFiles) {
    if (typeof fileName === "string") {
      const hwFile = await inputView.Write(createFileUri(fileName));
      await hwFile.WriteData(inputFiles[fileName]);
    }
  }

  const outputData = await RunPipeline(configFileUri, dataStore);
}

export interface IFileSystem {

}

export class AutoRest {
  public constructor(configurationUrl: string, fileSystem: IFileSystem) {
  }
}
