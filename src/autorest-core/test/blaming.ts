import { suite, test, slow, timeout, skip, only } from "mocha-typescript";
import * as assert from "assert";

import { CreateFileUri, ResolveUri } from "../lib/approved-imports/uri";
import { parse } from "../lib/approved-imports/jsonpath";
import { DataStore } from "../lib/data-store/data-store";
import { RunPipeline } from "../lib/pipeline/pipeline";

@suite class Blaming {

  @test async "end to end blaming with literate swagger"() {
    const dataStore = new DataStore();
    const configFileUri = ResolveUri(CreateFileUri(__dirname) + "/", "resources/literate-example/readme.md");
    const results = await RunPipeline(configFileUri, dataStore);

    // regular description
    {
      const blameTree = await dataStore.Blame(
        "compose/swagger.yaml",
        { path: parse("$.securityDefinitions.azure_auth.description") });
      const blameInputs = Array.from(blameTree.BlameInputs());
      assert.equal(blameInputs.length, 1);
    }

    // markdown description (blames both the swagger's json path and the markdown source of the description)
    {
      const blameTree = await dataStore.Blame(
        "compose/swagger.yaml",
        { path: parse("$.definitions.SearchServiceListResult.description") });
      const blameInputs = Array.from(blameTree.BlameInputs());
      assert.equal(blameInputs.length, 2);
    }
  }
}