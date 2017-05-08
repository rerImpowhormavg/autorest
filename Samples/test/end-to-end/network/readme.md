# Network

> see https://aka.ms/autorest

``` yaml 
input-file:
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/applicationGateway.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/checkDnsAvailability.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/expressRouteCircuit.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/loadBalancer.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/network.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/networkInterface.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/networkSecurityGroup.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/networkWatcher.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/publicIpAddress.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/routeFilter.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/routeTable.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/serviceCommunity.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/usage.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/virtualNetwork.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/virtualNetworkGateway.json
 - https://github.com/Azure/azure-rest-api-specs/blob/d374d03801e97737ddb32e01f20513e7b2bbd9c3/arm-network/2016-12-01/swagger/vmssNetworkInterface.json

output-artifact:
- swagger-document.json
- swagger-document.json.map

override-info:
  title: Network

csharp:
  azure-arm: true
  output-folder: Client
```
