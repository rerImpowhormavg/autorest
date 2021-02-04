import { Dereferenced, ExtensionKey, PathReference, Refable } from "./common";

/**
 * Only return properties starting with x-
 * @param dictionary
 */
export const includeXDash = (dictionary: Record<string, unknown>): ExtensionKey[] => {
  return Object.keys(dictionary).filter((v, i, a) => v.startsWith("x-")) as any;
};

/**
 * Only return properties NOT starting with x-
 * @param dictionary
 */
export const excludeXDash = <T extends Record<string, unknown>>(dictionary: T): string[] => {
  return Object.keys(dictionary).filter((v, i, a) => !v.startsWith("x-"));
};

export const filterOutXDash = <T>(obj: T | undefined): T | undefined => {
  if (obj) {
    const result = <any>{};
    for (const [key, value] of Object.entries(obj).filter(([key, value]) => !key.startsWith("x-"))) {
      result[key] = <any>value;
    }
    return result;
  }
  return undefined;
};

/**
 * Identifies if a given refable is a reference or an instance
 * @param item Check if item is a reference.
 */
export const isReference = <T>(item: Refable<T>): item is PathReference => {
  return item && (<PathReference>item).$ref ? true : false;
};

/**
 * Gets an object instance for the item, regardless if it's a reference or not.
 * @param document Entire document.
 * @param item Reference item.
 * @param stack Stack for circular dependencies.
 */
export const dereference = <T>(document: any, item: Refable<T>, stack: string[] = []): Dereferenced<T> => {
  let name: string | undefined;

  if (isReference(item)) {
    let node = document;
    const path = item.$ref;
    if (stack.indexOf(path) > -1) {
      throw new Error(`Circular $ref in Model -- ${path} :: ${JSON.stringify(stack)}`);
    }
    stack.push(path);

    const parts = path.replace("#/", "").split("/");

    for (name of parts) {
      if (!node[name]) {
        throw new Error(`Invalid Reference ${name} -- ${path}`);
      }
      node = node[name];
    }

    if (isReference(node)) {
      // it's a ref to a ref.
      return dereference<T>(document, node, stack);
    }
    return { instance: node, name: name || "", fromRef: true };
  }
  return { instance: item, name: "", fromRef: false };
};
