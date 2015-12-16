/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

import { ServiceClientOptions, RequestOptions, ServiceCallback, ServiceClientCredentials } from 'ms-rest';
import * as operations from "./operations";

declare class AutoRestHeadTestService {
    /**
     * @class
     * Initializes a new instance of the AutoRestHeadTestService class.
     * @constructor
     *
     * @param {Credentials} credentials The management credentials for Azure.
     *
     * @param {string} [baseUri] - The base URI of the service.
     *
     * @param {object} [options] - The parameter options
     *
     * @param {Array} [options.filters] - Filters to be added to the request pipeline
     *
     * @param {object} [options.requestOptions] - Options for the underlying request object
     * {@link https://github.com/request/request#requestoptions-callback Options doc}
     *
     * @param {bool} [options.noRetryPolicy] - If set to true, turn off default retry policy
     */
    constructor(credentials: ServiceClientCredentials, baseUri: string, options: ServiceClientOptions);

    credentials: ServiceClientCredentials;

    acceptLanguage: string;

    longRunningOperationRetryTimeout: number;

    // Operation groups
    httpSuccess: operations.HttpSuccess;
    }

export = AutoRestHeadTestService;
