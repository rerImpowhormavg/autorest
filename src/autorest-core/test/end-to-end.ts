import { suite, test, slow, timeout, skip, only } from "mocha-typescript";
import * as assert from "assert";

import { AutoRest } from "../lib/autorest-core";
import { RealFileSystem } from "../lib/file-system";
import { CreateFolderUri, ResolveUri } from "../lib/ref/uri";
import { Message } from "../lib/message";

@suite class EndToEnd {
  @test @timeout(60000) async "network full game"() {
    const autoRest = new AutoRest(new RealFileSystem());
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

    // TODO: generate for all, probe results

    await autoRest.Process().finish;
  }
}