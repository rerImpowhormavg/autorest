import { suite, test, slow, timeout, skip, only } from "mocha-typescript";
import * as assert from "assert";

import { Message } from "../lib/pipeline/plugin-api";
import { AutoRestDotNetPlugin } from "../lib/pipeline/plugins/autorest-dotnet";
import { AutoRestPlugin } from "../lib/pipeline/plugin-endpoint";
import { CancellationToken } from "../lib/approved-imports/cancallation";
import { DataStore } from "../lib/data-store/data-store";
import { LoadLiterateSwagger } from "../lib/pipeline/swagger-loader";

@suite class Plugins {
  @test async "plugin loading and communication"() {
    const cancellationToken = CancellationToken.None;
    const dataStore = new DataStore(cancellationToken);
    const scopeInput = dataStore.CreateScope("input");
    const scopeWork = dataStore.CreateScope("working");

    const dummyPlugin = await AutoRestPlugin.FromModule("./lib/pipeline/plugins/dummy");
    const pluginNames = await dummyPlugin.GetPluginNames(cancellationToken);
    assert.deepStrictEqual(pluginNames, ["dummy"]);
    const result = await dummyPlugin.Process("dummy", key => key, scopeInput, scopeWork, cancellationToken);
    assert.strictEqual(result, true);
    const producedFiles = await scopeWork.Enum();
    assert.strictEqual(producedFiles.length, 1);
    const fileHandle = await scopeWork.ReadStrict(producedFiles[0]);
    const message = await fileHandle.ReadObject<Message<number>>();
    assert.strictEqual(message.payload, 42);
  }

  // SKIPPING because Amar's tool is resolved hacky right now (waiting for "getting plugin bits to disk part")
  @skip @test @timeout(10000) async "openapi-validation-tools"() {
    const cancellationToken = CancellationToken.None;
    const dataStore = new DataStore(cancellationToken);
    const scopeInput = dataStore.CreateScope("input").AsFileScopeReadThrough();

    const inputFileUri = "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2016-12-01/swagger/network.json";
    await scopeInput.Read(inputFileUri);

    const validationPlugin = await AutoRestPlugin.FromModule("./lib/pipeline/plugins/openapi-validation-tools");
    const pluginNames = await validationPlugin.GetPluginNames(cancellationToken);
    assert.deepStrictEqual(pluginNames.length, 2);

    for (let pluginIndex = 0; pluginIndex < pluginNames.length; ++pluginIndex) {
      const scopeWork = dataStore.CreateScope(`working_${pluginIndex}`);
      const result = await validationPlugin.Process(pluginNames[pluginIndex], _ => null, scopeInput, scopeWork, cancellationToken);
      assert.strictEqual(result, true);
      const producedFiles = await scopeWork.Enum();
      assert.strictEqual(producedFiles.length, (await scopeInput.Enum()).length);
      const producedFile = await scopeWork.ReadStrict(producedFiles[0]);
    }
  }

  @test async "AutoRest.dll"() {
    const dataStore = new DataStore(CancellationToken.None);

    // load swagger
    const swagger = await LoadLiterateSwagger(
      dataStore.CreateScope("input").AsFileScopeReadThrough(),
      "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2016-12-01/swagger/network.json",
      dataStore.CreateScope("loader"));

    // call validator
    const autorestPlugin = new AutoRestDotNetPlugin();
    const pluginScope = dataStore.CreateScope("plugin");
    await autorestPlugin.Validate(swagger, pluginScope);

    // check results
    const results = await pluginScope.Enum();
    assert.notEqual(results.length, 0);
    for (const result of results) {
      const resultHandle = await pluginScope.ReadStrict(result);
      const resultObject = await resultHandle.ReadObject<any>();
      assert.ok(resultObject);
      assert.ok(resultObject.code);
      assert.ok(resultObject.message);
      assert.ok(resultObject.jsonref);
      assert.ok(resultObject["json-path"]);
      assert.ok(resultObject.validationCategory);
    }
  }
}