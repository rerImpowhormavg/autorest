import { keys } from "@azure-tools/linq";
import * as pointer from "./json-pointer";

describe("JsonPointer", () => {
  let rfcExample: any;
  let rfcValues: any;
  let rfcParsed: any;

  beforeEach(() => {
    rfcExample = {
      "foo": ["bar", "baz"],
      "bar": { baz: 10 },
      "": 0,
      "a/b": 1,
      "c%d": 2,
      "e^f": 3,
      "g|h": 4,
      "i\\j": 5,
      'k"l': 6,
      " ": 7,
      "m~n": 8,
    };

    rfcValues = {
      "": rfcExample,
      "/foo": rfcExample.foo,
      "/foo/0": "bar",
      "/bar": rfcExample.bar,
      "/bar/baz": 10,
      "/": 0,
      "/a~1b": 1,
      "/c%d": 2,
      "/e^f": 3,
      "/g|h": 4,
      "/i\\j": 5,
      '/k"l': 6,
      "/ ": 7,
      "/m~0n": 8,
    };

    rfcParsed = {
      "": { tokens: [], value: rfcExample },
      "/foo": { tokens: ["foo"], value: rfcExample.foo },
      "/foo/0": { tokens: ["foo", "0"], value: "bar" },
      "/bar": { tokens: ["bar"], value: rfcExample.bar },
      "/bar/baz": { tokens: ["bar", "baz"], value: 10 },
      "/": { tokens: [""], value: 0 },
      "/a~1b": { tokens: ["a/b"], value: 1 },
      "/c%d": { tokens: ["c%d"], value: 2 },
      "/e^f": { tokens: ["e^f"], value: 3 },
      "/g|h": { tokens: ["g|h"], value: 4 },
      "/i\\j": { tokens: ["i\\j"], value: 5 },
      '/k"l': { tokens: ['k"l'], value: 6 },
      "/ ": { tokens: [" "], value: 7 },
      "/m~0n": { tokens: ["m~n"], value: 8 },
    };
  });

  it("should work for root element", () => {
    const obj = {};
    expect(pointer.get(obj, "")).toEqual(obj);
  });

  it("should do examples", () => {
    for (const p of keys(rfcValues)) {
      const expectedValue = rfcValues[p];
      expect(pointer.get(rfcExample, p)).toEqual(expectedValue);
    }
  });

  it("should create arrays for - and reference the (nonexistent) member after the last array element.", () => {
    const obj = <any>["foo"];
    pointer.set(obj, "/-/test/-", "expected");
    expect(Array.isArray(obj)).toBe(true);
    expect(obj.length).toEqual(2);
    expect(Array.isArray(obj[1].test)).toBe(true);
    expect(obj[1].test.length).toEqual(1);
    expect(obj[1].test[0]).toEqual("expected");
  });

  it("should return a dictionary (pointer -> value)", () => {
    const obj = {
        bla: {
          test: "expected",
        },
        abc: "bla",
      },
      dict = pointer.toDictionary(obj);

    expect(dict["/bla/test"]).toEqual("expected");
    expect(dict["/abc"]).toEqual("bla");
  });

  it("should work with arrays", () => {
    const obj = {
        users: [{ name: "example 1" }, { name: "example 2" }],
      },
      dict = pointer.toDictionary(obj),
      pointers = Object.keys(dict);

    expect(pointers.length).toEqual(2);
    expect(pointers[0]).toEqual("/users/0/name");
    expect(pointers[1]).toEqual("/users/1/name");
  });

  it("should work with other arrays", () => {
    const obj = {
        bla: {
          bli: [4, 5, 6],
        },
      },
      dict = pointer.toDictionary(obj);
    expect(dict["/bla/bli/0"]).toEqual(4);
    expect(dict["/bla/bli/1"]).toEqual(5);
    expect(dict["/bla/bli/2"]).toEqual(6);
  });

  it("should return true when the pointer exists", () => {
    const obj = {
      bla: {
        test: "expected",
      },
      foo: [["hello"]],
      abc: "bla",
    };
    expect(pointer.has(obj, "/bla")).toEqual(true);
    expect(pointer.has(obj, "/abc")).toEqual(true);
    expect(pointer.has(obj, "/foo/0/0")).toEqual(true);
    expect(pointer.has(obj, "/bla/test")).toEqual(true);
  });

  it("should return true when the tokens point to value", () => {
    const obj = {
      bla: {
        test: "expected",
      },
      foo: [["hello"]],
      abc: "bla",
    };
    expect(pointer.has(obj, ["bla"])).toEqual(true);
    expect(pointer.has(obj, ["abc"])).toEqual(true);
    expect(pointer.has(obj, ["foo", "0", "0"])).toEqual(true);
    expect(pointer.has(obj, ["bla", "test"])).toEqual(true);
  });

  it("should return false when the pointer does not exist", () => {
    const obj = {
      bla: {
        test: "expected",
      },
      abc: "bla",
    };
    expect(pointer.has(obj, "/not-existing")).toBe(false);
    expect(pointer.has(obj, "/not-existing/bla")).toBe(false);
    expect(pointer.has(obj, "/test/1/bla")).toBe(false);
    expect(pointer.has(obj, "/bla/test1")).toBe(false);
  });

  it("should return false when the tokens do not point to value", () => {
    const obj = {
      bla: {
        test: "expected",
      },
      abc: "bla",
    };
    expect(pointer.has(obj, ["not-existing"])).toEqual(false);
    expect(pointer.has(obj, ["not-existing", "bla"])).toEqual(false);
    expect(pointer.has(obj, ["test", "1", "bla"])).toEqual(false);
    expect(pointer.has(obj, ["bla", "test1"])).toEqual(false);
  });

  it("should iterate over an object", () => {
    pointer.walk({ bla: { test: "expected" } }, (value, ptr) => {
      expect(ptr).toEqual("/bla/test");
      expect(value).toEqual("expected");
    });
  });

  it("non-recursive visit pattern", () => {
    const obj = {
      foo: 100,
      bar: "hello",
      bin: {
        b1: "string",
        b2: 0,
        b3: ["a", "b", "c"],
        b4: {
          box: "sad",
        },
      },
    };

    for (const each of pointer.visit(obj)) {
      switch (each.key) {
        case "foo":
          expect(each.value).toEqual(100);
          break;

        case "bar":
          expect(each.value).toEqual("hello");
          break;

        case "bin":
          expect(typeof each.value).toEqual("object");

          for (const item of each.children) {
            switch (item.key) {
              case "b1":
                expect(item.value).toEqual("string");
                break;

              case "b2":
                expect(item.value).toEqual(0);
                break;

              case "b3":
                expect(Array.isArray(item.value)).toEqual(true);
                for (const i of item.children) {
                  expect(typeof i.value).toEqual("string");
                }
                break;

              case "b4":
                expect(typeof item.value).toEqual("object");
                break;
            }
          }
      }
    }
  });
});
