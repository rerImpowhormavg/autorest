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
 * HttpSuccess
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestHeadTestService.
 */
export interface HttpSuccess {

    /**
     * Return 200 status code if successful
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    head200(options: {customHeaders?: any}, callback: ServiceCallback<boolean>): void;
    head200(callback: ServiceCallback<boolean>): void;

    /**
     * Return 204 status code if successful
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    head204(options: {customHeaders?: any}, callback: ServiceCallback<boolean>): void;
    head204(callback: ServiceCallback<boolean>): void;

    /**
     * Return 404 status code if successful
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    head404(options: {customHeaders?: any}, callback: ServiceCallback<boolean>): void;
    head404(callback: ServiceCallback<boolean>): void;
}
