#!/usr/bin/env node
/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { CreateFileUri } from "./lib/approved-imports/uri";
import { Stringify } from "./lib/approved-imports/yaml";
import { DataStore, DataStoreView, KnownScopes, DataHandleRead } from "./lib/data-store/data-store";
import { AutoRestConfiguration } from "./lib/configuration/configuration";
import { RunPipeline, DataPromise } from "./lib/pipeline/pipeline";
import { MultiPromiseUtility } from "./lib/approved-imports/multi-promise";
import { CancellationToken } from "./lib/approved-imports/cancallation";

export interface IFileSystem {

}

export class AutoRest {
  public constructor(configurationUrl: string, fileSystem: IFileSystem) {
  }
}
