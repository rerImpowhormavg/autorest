import { addSchema, createTestSpec, findByName } from "../utils";
import { runModeler } from "./modelerfour-utils";

describe("Modelerfour.Schemas", () => {
  describe("additionalProperties", () => {
    it("support reference to itself(circular dependency", async () => {
      const spec = createTestSpec();

      addSchema(spec, "SelfRefSchema", {
        additionalProperties: {
          $ref: "#/components/schemas/SelfRefSchema",
        },
      });

      const codeModel = await runModeler(spec);

      const schema = codeModel.schemas.dictionaries?.[0];
      expect(schema).not.toBeNull();
      expect(schema?.language.default.name).toEqual("SelfRefSchema");
      expect(schema?.elementType).toEqual(schema);
    });

    describe("polymorhism discriminator", () => {
      it("support openapi3 discriminator mapping", async () => {
        const spec = createTestSpec();

        addSchema(spec, "Pet", {
          type: "object",
          properties: {
            name: { type: "string" },
            pet_type: { type: "string" },
          },
          required: ["name", "pet_type"],
          discriminator: {
            propertyName: "pet_type",
            mapping: {
              catType: "#/components/schemas/Cat",
              dogType: "#/components/schemas/Dog",
            },
          },
        });

        addSchema(spec, "Dog", {
          allOf: [
            { $ref: "#/components/schemas/Pet" },
            {
              type: "object",
              properties: { bark: { type: "boolean" } },
            },
          ],
        });

        addSchema(spec, "Cat", {
          allOf: [
            { $ref: "#/components/schemas/Pet" },
            {
              type: "object",
              properties: { hunting: { type: "boolean" } },
            },
          ],
        });

        const codeModel = await runModeler(spec);

        const cat = findByName("Cat", codeModel.schemas.objects);
        expect(cat).toBeDefined();
        expect(cat?.discriminatorValue).toEqual("catType");

        const dog = findByName("Dog", codeModel.schemas.objects);
        expect(dog).toBeDefined();
        expect(dog?.discriminatorValue).toEqual("dogType");
      });

      it("support OpenAPI 2 custom x-ms-discriminator-value", async () => {
        const spec = createTestSpec();

        addSchema(spec, "Pet", {
          type: "object",
          properties: {
            name: { type: "string" },
            pet_type: { type: "string" },
          },
          required: ["name", "pet_type"],
          discriminator: {
            propertyName: "pet_type",
          },
        });

        addSchema(spec, "Dog", {
          "x-ms-discriminator-value": "dogType",
          "allOf": [
            { $ref: "#/components/schemas/Pet" },
            {
              type: "object",
              properties: { bark: { type: "boolean" } },
            },
          ],
        });

        addSchema(spec, "Cat", {
          "x-ms-discriminator-value": "catType",
          "allOf": [
            { $ref: "#/components/schemas/Pet" },
            {
              type: "object",
              properties: { hunting: { type: "boolean" } },
            },
          ],
        });

        const codeModel = await runModeler(spec);

        const cat = findByName("Cat", codeModel.schemas.objects);
        expect(cat).toBeDefined();
        expect(cat?.discriminatorValue).toEqual("catType");

        const dog = findByName("Dog", codeModel.schemas.objects);
        expect(dog).toBeDefined();
        expect(dog?.discriminatorValue).toEqual("dogType");
      });
    });

    describe("enums", () => {
      it("enums referencing other any with allOf include all their properties", async () => {
        const spec = createTestSpec();

        addSchema(spec, "Foo", {
          type: "string",
          enum: ["one", "two"],
        });
        addSchema(spec, "Bar", {
          type: "string",
          enum: ["three", "four", "five"],
          allOf: [{ $ref: "#/components/schemas/Foo" }],
        });

        const codeModel = await runModeler(spec);

        const bar = findByName("Bar", codeModel.schemas.choices);
        expect(bar).toBeDefined();
        expect(bar?.choices.map((x) => x.value)).toEqual(["one", "two", "three", "four", "five"]);

        // Parent should not have changed
        const foo = findByName("Foo", codeModel.schemas.choices);
        expect(foo).toBeDefined();
        expect(foo?.choices.map((x) => x.value)).toEqual(["one", "two"]);
      });
    });
  });
});
