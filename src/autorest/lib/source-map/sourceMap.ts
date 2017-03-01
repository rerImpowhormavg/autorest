/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import * as jsonpath from "jsonpath";
import * as sourceMap from "source-map";
import * as yamlAst from "../parsing/yamlAst";
import { DataHandleRead } from "../data-store/dataStore";

/**
 * Also allow for object paths that will gladly be resolved by us.
 */
export type Position = sourceMap.Position | { path: jsonpath.PathComponent[] };

export function parseJsonPath(jsonPath: string): Position {
  return { path: jsonpath.parse(jsonPath).map(part => part.expression.value) };
}

export interface Mapping {
  generated: Position;
  original: Position;
  source: string;
  name?: string;
}

export type Mappings = Iterable<Mapping>;

export async function compilePosition(position: Position, yamlFile: DataHandleRead): Promise<sourceMap.Position> {
  const path = (position as any).path;
  if (path) {
    return yamlAst.resolvePath(yamlFile, path);
  }
  return position as sourceMap.Position;
}

export async function compile(mappings: Mappings, target: sourceMap.SourceMapGenerator, yamlFiles: DataHandleRead[] = []): Promise<void> {
  // build lookup
  const yamlFileLookup: { [key: string]: DataHandleRead } = {};
  for (const yamlFile of yamlFiles) {
    yamlFileLookup[yamlFile.key] = yamlFile;
  }

  const generatedFile = target.toJSON().file;
  const compilePos = (position: Position, key: string) => compilePosition(position, yamlFileLookup[key]);

  for (const mapping of mappings) {
    const compiledMapping: sourceMap.Mapping = {
      generated: await compilePos(mapping.generated, generatedFile),
      original: await compilePos(mapping.original, mapping.source),
      name: mapping.name,
      source: mapping.source
    };
    target.addMapping(compiledMapping);
  }
}
