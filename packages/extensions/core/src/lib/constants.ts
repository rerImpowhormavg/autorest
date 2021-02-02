/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
import * as path from "path";
import { existsSync } from "fs";

const resolveAppRoot = () => {
  let current = path.resolve(__dirname);
  while (!existsSync(path.join(current, "package.json"))) {
    current = path.dirname(current);
  }
  return current;
};

export const MagicString = "\n> see https://aka.ms/autorest";
export const DefaultConfiguration = "readme.md";

/**
 * Root of autorest core(i.e core folder)
 */
export const AppRoot = resolveAppRoot();
