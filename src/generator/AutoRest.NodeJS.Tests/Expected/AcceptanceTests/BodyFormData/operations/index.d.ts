/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
*/

import { ServiceClientOptions, RequestOptions, ServiceCallback } from 'ms-rest';
import * as stream from 'stream';
import * as models from '../models';


/**
 * @class
 * Formdata
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestSwaggerBATFormDataService.
 */
export interface Formdata {

    /**
     * Upload file
     *
     * @param {object} fileContent File to upload.
     * 
     * @param {string} fileName File name to upload. Name has to be spelled exactly
     * as written here.
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    uploadFile(fileContent: stream.Readable, fileName: string, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<stream.Readable>): void;
    uploadFile(fileContent: stream.Readable, fileName: string, callback: ServiceCallback<stream.Readable>): void;

    /**
     * Upload file
     *
     * @param {object} fileContent File to upload.
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    uploadFileViaBody(fileContent: stream.Readable, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<stream.Readable>): void;
    uploadFileViaBody(fileContent: stream.Readable, callback: ServiceCallback<stream.Readable>): void;
}
