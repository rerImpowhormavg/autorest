/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
/* eslint-disable @typescript-eslint/no-use-before-define */
/* eslint-disable no-prototype-builtins */

import { JsonPath, Mapping, Stringify, YAMLNode, Descendants } from "@azure-tools/datastore";

/**
 * Merge a and b by adding new properties of b into a. It will fail if a and b have the same property and the value is different.
 * @param a Object 1 to merge
 * @param b Object 2 to merge
 * @param path current path of the merge.
 */
export function strictMerge(a: any, b: any, path: JsonPath = []): any {
  if (a === null || b === null) {
    throw new Error(`Argument cannot be null ('${Stringify(path)}')`);
  }

  // trivial case
  if (a === b || JSON.stringify(a) === JSON.stringify(b)) {
    return a;
  }

  // mapping nodes
  if (typeof a === "object" && typeof b === "object") {
    if (a instanceof Array && b instanceof Array) {
      if (a.length === 0) {
        return b;
      }
      if (b.length === 0) {
        return a;
      }
      // both sides gave a sequence, and they are not identical.
      // this is currently not a good thing.
      throw new Error(`'${Stringify(path)}' has two arrays that are incompatible (${Stringify(a)}, ${Stringify(b)}).`);
    } else {
      // object nodes - iterate all members
      const result: any = {};
      const keys = new Set([...Object.keys(a), ...Object.keys(b)]);
      for (const key of keys) {
        const subpath = path.concat(key);

        // forward if only present in one of the nodes
        if (a[key] === undefined) {
          result[key] = b[key];
          continue;
        }
        if (b[key] === undefined) {
          result[key] = a[key];
          continue;
        }

        // try merge objects otherwise
        const aMember = a[key];
        const bMember = b[key];
        result[key] = strictMerge(aMember, bMember, subpath);
      }
      return result;
    }
  }

  throw new Error(`'${Stringify(path)}' has incompatible values (${Stringify(a)}, ${Stringify(b)}).`);
}

// Note: I am not convinced this works precisely as it should
// but it works well enough for my needs right now
// I will revisit it later.
const macroRegEx = () => /\$\(([a-zA-Z0-9_-]*)\)/gi;

/**
 * Resolve the expanded value by interpolating any
 * @param value Value to interpolate.
 * @param propertyName Name of the property.
 * @param higherPriority Higher priority context to resolve the interpolation values.
 * @param lowerPriority Lower priority context to resolve the interpolation values.
 * @param jsAware
 */
export function resolveRValue(
  value: any,
  propertyName: string,
  higherPriority: any,
  lowerPriority: any,
  jsAware = 0,
): any {
  if (value) {
    // resolves the actual macro value.
    const resolve = (macroExpression: string, macroKey: string) => {
      // if the original set has it, use that.
      if (higherPriority && higherPriority[macroKey]) {
        return resolveRValue(higherPriority[macroKey], macroKey, lowerPriority, null, jsAware - 1);
      }

      if (lowerPriority) {
        // check to see if the value is in the overrides set before the key itself.
        const keys = Object.getOwnPropertyNames(lowerPriority);
        const macroKeyLocation = keys.indexOf(macroKey);
        if (macroKeyLocation > -1) {
          if (macroKeyLocation < keys.indexOf(propertyName)) {
            // the macroKey is in the overrides, and it precedes the propertyName itself
            return resolveRValue(lowerPriority[macroKey], macroKey, higherPriority, lowerPriority, jsAware - 1);
          }
        }
      }

      // can't find the macro. maybe later.
      return macroExpression;
    };

    // resolve the macro value for strings
    if (typeof value === "string") {
      const match = macroRegEx().exec(value.trim());
      if (match) {
        if (match[0] === match.input) {
          // the target value should be the result without string twiddling
          if (jsAware > 0) {
            return JSON.stringify(resolve(match[0], match[1]));
          }
          return resolve(match[0], match[1]);
        }
        // it looks like we should do a string replace.
        return value.replace(macroRegEx(), resolve);
      }
    }

    // resolve macro values for array values
    if (value instanceof Array) {
      const result = new Array<any>();
      for (const each of value) {
        // since we're not naming the parameter,
        // if there isn't a higher priority,
        // we can fall back to a wide-lookup in lowerPriority.
        result.push(resolveRValue(each, "", higherPriority || lowerPriority, null));
      }
      return result;
    }
  }

  if (jsAware > 0) {
    return JSON.stringify(value);
  }

  return value;
}

export type ArrayMergingStrategy = "high-pri-first" | "low-pri-first";

export interface MergeOptions {
  arrayMergeStrategy?: ArrayMergingStrategy;
  concatListPathFilter?: (path: JsonPath) => boolean;
}

const defaultOptions: Required<MergeOptions> = {
  arrayMergeStrategy: "high-pri-first",
  concatListPathFilter: () => false,
};

export function mergeOverwriteOrAppend(
  higherPriority: any,
  lowerPriority: any,
  options: MergeOptions = {},
  path: JsonPath = [],
): any {
  if (higherPriority === null || lowerPriority === null) {
    return null;
  }

  const computedOptions = { ...defaultOptions, ...options };
  // scalars/arrays involved
  if (
    typeof higherPriority !== "object" ||
    higherPriority instanceof Array ||
    typeof lowerPriority !== "object" ||
    lowerPriority instanceof Array
  ) {
    return mergeArray(higherPriority, lowerPriority, path, computedOptions);
  }

  // object nodes - iterate all members
  const result: any = {};

  const keys = [
    ...new Set(Object.getOwnPropertyNames(higherPriority).concat(Object.getOwnPropertyNames(lowerPriority))),
  ];
  // keys = keys.filter((v, i) => { const idx = keys.indexOf(v); return idx === -1 || idx >= i; }); // distinct

  for (const key of keys) {
    const subpath = path.concat(key);

    // forward if only present in one of the nodes
    if (higherPriority[key] === undefined) {
      result[key] = resolveRValue(lowerPriority[key], key, higherPriority, lowerPriority);
      continue;
    }
    if (lowerPriority[key] === undefined) {
      result[key] = resolveRValue(higherPriority[key], key, null, higherPriority);
      continue;
    }

    // try merge objects otherwise
    const aMember = resolveRValue(higherPriority[key], key, lowerPriority, higherPriority);
    const bMember = resolveRValue(lowerPriority[key], key, higherPriority, lowerPriority);
    result[key] = mergeOverwriteOrAppend(aMember, bMember, computedOptions, subpath);
  }
  return result;
}

function mergeArray(
  higherPriority: unknown,
  lowerPriority: unknown,
  path: JsonPath,
  { concatListPathFilter, arrayMergeStrategy }: Required<MergeOptions>,
) {
  if (!(higherPriority instanceof Array) && !(lowerPriority instanceof Array) && !concatListPathFilter(path)) {
    return higherPriority;
  }

  const higherPriorityArray = higherPriority instanceof Array ? higherPriority : [higherPriority];
  const lowerPriorityArray = lowerPriority instanceof Array ? lowerPriority : [lowerPriority];

  if (arrayMergeStrategy === "high-pri-first") {
    return [...new Set(higherPriorityArray.concat(lowerPriority))];
  } else {
    return [...new Set(lowerPriorityArray.concat(higherPriority))];
  }
}

export function identitySourceMapping(sourceYamlFileName: string, sourceYamlAst: YAMLNode): Mapping[] {
  return [...Descendants(sourceYamlAst)].map((x) => {
    return {
      generated: { path: x.path },
      original: { path: x.path },
      name: JSON.stringify(x.path),
      source: sourceYamlFileName,
    };
  });
}
