/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
*/

import { ServiceClientOptions, RequestOptions, ServiceCallback } from 'ms-rest';
import * as models from '../models';


/**
 * @class
 * Group
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the MicrosoftAzureTestUrl.
 */
export interface Group {

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param {string} resourceGroupName Resource Group name 'testgroup101'.
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getSampleResourceGroup(resourceGroupName: string, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.SampleResourceGroup>): void;
    getSampleResourceGroup(resourceGroupName: string, callback: ServiceCallback<models.SampleResourceGroup>): void;
}
