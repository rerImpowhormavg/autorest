/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
*/

import { ServiceClientOptions, RequestOptions, ServiceCallback } from 'ms-rest';
import * as models from '../models';


/**
 * @class
 * StorageAccounts
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the StorageManagementClient.
 */
export interface StorageAccounts {

    /**
     * Checks that account name is valid and is not in use.
     *
     * @param {object} accountName The name of the storage account within the
     * specified resource group. Storage account names must be between 3 and 24
     * characters in length and use numbers and lower-case letters only.
     * 
     * @param {string} [accountName.name]
     * 
     * @param {string} [accountName.type]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    checkNameAvailability(accountName: models.StorageAccountCheckNameAvailabilityParameters, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.CheckNameAvailabilityResult>): void;
    checkNameAvailability(accountName: models.StorageAccountCheckNameAvailabilityParameters, callback: ServiceCallback<models.CheckNameAvailabilityResult>): void;

    /**
     * Asynchronously creates a new storage account with the specified parameters.
     * Existing accounts cannot be updated with this API and should instead use
     * the Update Storage Account API. If an account is already created and
     * subsequent PUT request is issued with exact same set of properties, then
     * HTTP 200 would be returned.
     *
     * @param {string} resourceGroupName The name of the resource group within the
     * user’s subscription.
     * 
     * @param {string} accountName The name of the storage account within the
     * specified resource group. Storage account names must be between 3 and 24
     * characters in length and use numbers and lower-case letters only.
     * 
     * @param {object} parameters The parameters to provide for the created
     * account.
     * 
     * @param {string} [parameters.accountType] Gets or sets the account type.
     * Possible values for this property include: 'Standard_LRS', 'Standard_ZRS',
     * 'Standard_GRS', 'Standard_RAGRS', 'Premium_LRS'.
     * 
     * @param {string} [parameters.location] Resource location
     * 
     * @param {object} [parameters.tags] Resource tags
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    create(resourceGroupName: string, accountName: string, parameters: models.StorageAccountCreateParameters, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StorageAccount>): void;
    create(resourceGroupName: string, accountName: string, parameters: models.StorageAccountCreateParameters, callback: ServiceCallback<models.StorageAccount>): void;

    /**
     * Asynchronously creates a new storage account with the specified parameters.
     * Existing accounts cannot be updated with this API and should instead use
     * the Update Storage Account API. If an account is already created and
     * subsequent PUT request is issued with exact same set of properties, then
     * HTTP 200 would be returned.
     *
     * @param {string} resourceGroupName The name of the resource group within the
     * user’s subscription.
     * 
     * @param {string} accountName The name of the storage account within the
     * specified resource group. Storage account names must be between 3 and 24
     * characters in length and use numbers and lower-case letters only.
     * 
     * @param {object} parameters The parameters to provide for the created
     * account.
     * 
     * @param {string} [parameters.accountType] Gets or sets the account type.
     * Possible values for this property include: 'Standard_LRS', 'Standard_ZRS',
     * 'Standard_GRS', 'Standard_RAGRS', 'Premium_LRS'.
     * 
     * @param {string} [parameters.location] Resource location
     * 
     * @param {object} [parameters.tags] Resource tags
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    beginCreate(resourceGroupName: string, accountName: string, parameters: models.StorageAccountCreateParameters, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StorageAccount>): void;
    beginCreate(resourceGroupName: string, accountName: string, parameters: models.StorageAccountCreateParameters, callback: ServiceCallback<models.StorageAccount>): void;

    /**
     * Deletes a storage account in Microsoft Azure.
     *
     * @param {string} resourceGroupName The name of the resource group within the
     * user’s subscription.
     * 
     * @param {string} accountName The name of the storage account within the
     * specified resource group. Storage account names must be between 3 and 24
     * characters in length and use numbers and lower-case letters only.
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    deleteMethod(resourceGroupName: string, accountName: string, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    deleteMethod(resourceGroupName: string, accountName: string, callback: ServiceCallback<void>): void;

    /**
     * Returns the properties for the specified storage account including but not
     * limited to name, account type, location, and account status. The ListKeys
     * operation should be used to retrieve storage keys.
     *
     * @param {string} resourceGroupName The name of the resource group within the
     * user’s subscription.
     * 
     * @param {string} accountName The name of the storage account within the
     * specified resource group. Storage account names must be between 3 and 24
     * characters in length and use numbers and lower-case letters only.
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getProperties(resourceGroupName: string, accountName: string, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StorageAccount>): void;
    getProperties(resourceGroupName: string, accountName: string, callback: ServiceCallback<models.StorageAccount>): void;

    /**
     * Updates the account type or tags for a storage account. It can also be used
     * to add a custom domain (note that custom domains cannot be added via the
     * Create operation). Only one custom domain is supported per storage
     * account. This API can only be used to update one of tags, accountType, or
     * customDomain per call. To update multiple of these properties, call the
     * API multiple times with one change per call. This call does not change the
     * storage keys for the account. If you want to change storage account keys,
     * use the RegenerateKey operation. The location and name of the storage
     * account cannot be changed after creation.
     *
     * @param {string} resourceGroupName The name of the resource group within the
     * user’s subscription.
     * 
     * @param {string} accountName The name of the storage account within the
     * specified resource group. Storage account names must be between 3 and 24
     * characters in length and use numbers and lower-case letters only.
     * 
     * @param {object} parameters The parameters to update on the account. Note
     * that only one property can be changed at a time using this API.
     * 
     * @param {string} [parameters.accountType] Gets or sets the account type.
     * Note that StandardZRS and PremiumLRS accounts cannot be changed to other
     * account types, and other account types cannot be changed to StandardZRS or
     * PremiumLRS. Possible values for this property include: 'Standard_LRS',
     * 'Standard_ZRS', 'Standard_GRS', 'Standard_RAGRS', 'Premium_LRS'.
     * 
     * @param {object} [parameters.customDomain] User domain assigned to the
     * storage account. Name is the CNAME source. Only one custom domain is
     * supported per storage account at this time. To clear the existing custom
     * domain, use an empty string for the custom domain name property.
     * 
     * @param {string} [parameters.customDomain.name] Gets or sets the custom
     * domain name. Name is the CNAME source.
     * 
     * @param {boolean} [parameters.customDomain.useSubDomain] Indicates whether
     * indirect CName validation is enabled. Default value is false. This should
     * only be set on updates
     * 
     * @param {string} [parameters.location] Resource location
     * 
     * @param {object} [parameters.tags] Resource tags
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    update(resourceGroupName: string, accountName: string, parameters: models.StorageAccountUpdateParameters, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StorageAccount>): void;
    update(resourceGroupName: string, accountName: string, parameters: models.StorageAccountUpdateParameters, callback: ServiceCallback<models.StorageAccount>): void;

    /**
     * Lists the access keys for the specified storage account.
     *
     * @param {string} resourceGroupName The name of the resource group.
     * 
     * @param {string} accountName The name of the storage account.
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    listKeys(resourceGroupName: string, accountName: string, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StorageAccountKeys>): void;
    listKeys(resourceGroupName: string, accountName: string, callback: ServiceCallback<models.StorageAccountKeys>): void;

    /**
     * Lists all the storage accounts available under the subscription. Note that
     * storage keys are not returned; use the ListKeys operation for this.
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    list(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StorageAccountListResult>): void;
    list(callback: ServiceCallback<models.StorageAccountListResult>): void;

    /**
     * Lists all the storage accounts available under the given resource group.
     * Note that storage keys are not returned; use the ListKeys operation for
     * this.
     *
     * @param {string} resourceGroupName The name of the resource group within the
     * user’s subscription.
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    listByResourceGroup(resourceGroupName: string, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StorageAccountListResult>): void;
    listByResourceGroup(resourceGroupName: string, callback: ServiceCallback<models.StorageAccountListResult>): void;

    /**
     * Regenerates the access keys for the specified storage account.
     *
     * @param {string} resourceGroupName The name of the resource group within the
     * user’s subscription.
     * 
     * @param {string} accountName The name of the storage account within the
     * specified resource group. Storage account names must be between 3 and 24
     * characters in length and use numbers and lower-case letters only.
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {string} [options.keyName] Possible values for this property
     * include: 'key1', 'key2'.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    regenerateKey(resourceGroupName: string, accountName: string, options: { keyName? : string, customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StorageAccountKeys>): void;
    regenerateKey(resourceGroupName: string, accountName: string, callback: ServiceCallback<models.StorageAccountKeys>): void;

    /**
     * Lists all the storage accounts available under the subscription. Note that
     * storage keys are not returned; use the ListKeys operation for this.
     *
     * @param {string} nextPageLink The NextLink from the previous successful call
     * to List operation.
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    listNext(nextPageLink: string, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StorageAccountListResult>): void;
    listNext(nextPageLink: string, callback: ServiceCallback<models.StorageAccountListResult>): void;

    /**
     * Lists all the storage accounts available under the given resource group.
     * Note that storage keys are not returned; use the ListKeys operation for
     * this.
     *
     * @param {string} nextPageLink The NextLink from the previous successful call
     * to List operation.
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    listByResourceGroupNext(nextPageLink: string, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StorageAccountListResult>): void;
    listByResourceGroupNext(nextPageLink: string, callback: ServiceCallback<models.StorageAccountListResult>): void;
}

/**
 * @class
 * UsageOperations
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the StorageManagementClient.
 */
export interface UsageOperations {

    /**
     * Gets the current usage count and the limit for the resources under the
     * subscription.
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    list(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.UsageListResult>): void;
    list(callback: ServiceCallback<models.UsageListResult>): void;
}
