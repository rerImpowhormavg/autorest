import { suite, test, slow, timeout, skip, only } from "mocha-typescript";
import * as assert from "assert";

import { AutoRest } from "../lib/autorest-core";
import { RealFileSystem } from "../lib/file-system";
import { CreateFolderUri, ResolveUri } from "../lib/ref/uri";
import { Message, Channel } from "../lib/message";
import { PumpMessagesToConsole } from './test-utility';

@suite class EndToEnd {
  @test async "network full game"() {
    const autoRest = new AutoRest(new RealFileSystem());
    // PumpMessagesToConsole(autoRest);
    autoRest.AddConfiguration({
      "input-file": [
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/applicationGateway.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/checkDnsAvailability.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/expressRouteCircuit.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/loadBalancer.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/network.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/networkInterface.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/networkSecurityGroup.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/networkWatcher.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/publicIpAddress.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/routeFilter.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/routeTable.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/serviceCommunity.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/usage.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/virtualNetwork.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/virtualNetworkGateway.json",
        "https://github.com/Azure/azure-rest-api-specs/blob/master/arm-network/2017-03-01/swagger/vmssNetworkInterface.json"]
    });

    autoRest.AddConfiguration({
      "override-info": {
        title: "Network"
      }
    });

    // TODO: generate for all, probe results

    const success = await autoRest.Process().finish;
    assert.strictEqual(success, true);
  }

  @test async "other configuration scenario"() {
    const autoRest = new AutoRest(new RealFileSystem(), ResolveUri(CreateFolderUri(__dirname), "../../test/resources/literate-example/readme-complicated.md"));
    // PumpMessagesToConsole(autoRest);


    const config = await autoRest.view;
    assert.strictEqual(config["shouldwork"], true);

  }

  @test async "complicated configuration scenario"() {
    const autoRest = new AutoRest(new RealFileSystem(), ResolveUri(CreateFolderUri(__dirname), "../../test/resources/literate-example/readme-complicated.md"));
    // PumpMessagesToConsole(autoRest);
    autoRest.AddConfiguration({
      "cmd-line-true": true,
      "cmd-line-false": false,
      "cmd-line-complex": {
        "true": true,
        "false": false
      }
    });

    const config = await autoRest.view;
    assert.strictEqual(config.InputFileUris.length, 1);

    const messages: Message[] = [];

    autoRest.Message.Subscribe((_, m) => { if (m.Channel === Channel.Warning) { messages.push(m); } });
    assert.equal(await autoRest.Process().finish, true);
    assert.notEqual(messages.length, 0);
  }
  // testing end-to-end for non-arm type validation rules. Since all validation rules are currently defaulted to 
  // ARM, non-ARM documents should show 0 validation messages
  // TODO: fix this test when validation rules are properly categorized
  @test async "non-arm type spec testing"() {
    const autoRest = new AutoRest(new RealFileSystem(), ResolveUri(CreateFolderUri(__dirname), "../../test/resources/validation-options/readme.md"));
    autoRest.AddConfiguration({
      "openapi-type": "default",
      "azure-validator": true
    });

    const config = await autoRest.view;
    const messages: Message[] = [];

    autoRest.Message.Subscribe((_, m) => { messages.push(m); });
    assert.equal(await autoRest.Process().finish, true);
    assert.notEqual(messages.length, 0);
    // flag any fatal errors
    assert.equal(messages.filter(m => m.Channel === Channel.Fatal).length, 0);
  }
  @test async "arm type spec testing"() {
    const autoRest = new AutoRest(new RealFileSystem(), ResolveUri(CreateFolderUri(__dirname), "../../test/resources/validation-options/readme.md"));
    autoRest.AddConfiguration({
      "openapi-type": "arm",
      "azure-validator": true
    });

    const config = await autoRest.view;

    const messages: Message[] = [];

    autoRest.Message.Subscribe((_, m) => { messages.push(m); });
    // PumpMessagesToConsole(autoRest);
    assert.equal(await autoRest.Process().finish, true);
    // flag any fatal errors
    assert.equal(messages.filter(m => m.Channel === Channel.Fatal).length, 0);
    assert.notEqual(messages.length, 0);
  }
}