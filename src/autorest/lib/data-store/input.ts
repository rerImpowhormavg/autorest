/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

// untyped imports
const getUri = require("get-uri");
const fileUri: (path: string, options: { resolve: boolean }) => string = require("file-url");

import * as promisify from "pify";
import { Readable } from "stream";

const getUriAsync: (uri: string) => Promise<Readable> = promisify(getUri);

export async function readUri(uri: string): Promise<string> {
  const readable = await getUriAsync(uri);

  const readAll = new Promise<string>(function (resolve, reject) {
    let result = "";
    readable.on("data", data => result += data.toString());
    readable.on("end", () => resolve(result));
    readable.on("error", err => reject(err));
  });

  return await readAll;
}

export function createFileUri(path: string, resolve: boolean = false): string {
  return fileUri(path, { resolve: resolve });
}