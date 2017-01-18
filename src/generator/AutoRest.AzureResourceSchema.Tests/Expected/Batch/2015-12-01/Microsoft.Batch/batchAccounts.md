# Microsoft.Batch/batchAccounts template reference
API Version: 2015-12-01
## Template format

To create a Microsoft.Batch/batchAccounts resource, add the following JSON to the resources section of your template.

```json
{
  "type": "Microsoft.Batch/batchAccounts",
  "apiVersion": "2015-12-01",
  "location": "string",
  "tags": {},
  "properties": {
    "autoStorage": {
      "storageAccountId": "string"
    }
  },
  "resources": [
    null
  ]
}
```
## Property values

The following tables describe the values you need to set in the schema.

<a id="Microsoft.Batch/batchAccounts" />
### Microsoft.Batch/batchAccounts object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  type | enum | Yes | Microsoft.Batch/batchAccounts |
|  apiVersion | enum | Yes | 2015-12-01 |
|  location | string | No | The region in which the account is created. |
|  tags | object | No | The user specified tags associated with the account. |
|  properties | object | Yes | The properties of the account. - [AccountBaseProperties object](#AccountBaseProperties) |
|  resources | array | No | [batchAccounts_applications_childResource object](#batchAccounts_applications_childResource) |


<a id="AccountBaseProperties" />
### AccountBaseProperties object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  autoStorage | object | No | The properties related to auto storage account. - [AutoStorageBaseProperties object](#AutoStorageBaseProperties) |


<a id="batchAccounts_applications_childResource" />
### batchAccounts_applications_childResource object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  type | enum | Yes | applications |
|  apiVersion | enum | Yes | 2015-12-01 |
|  allowUpdates | boolean | No | A value indicating whether packages within the application may be overwritten using the same version string. |
|  displayName | string | No | The display name for the application. |
|  resources | array | No | [batchAccounts_applications_versions_childResource object](#batchAccounts_applications_versions_childResource) |


<a id="AutoStorageBaseProperties" />
### AutoStorageBaseProperties object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  storageAccountId | string | Yes | The resource id of the storage account to be used for auto storage account. |


<a id="batchAccounts_applications_versions_childResource" />
### batchAccounts_applications_versions_childResource object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  type | enum | Yes | versions |
|  apiVersion | enum | Yes | 2015-12-01 |

