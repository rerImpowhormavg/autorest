/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

import { ServiceClientOptions, RequestOptions, ServiceCallback, ServiceClientCredentials } from 'ms-rest';
import * as models from "./models";

declare class AutoRestResourceFlatteningTestService {
    /**
     * @class
     * Initializes a new instance of the AutoRestResourceFlatteningTestService class.
     * @constructor
     *
     * @param {credentials} credentials - Gets Azure subscription credentials.
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
     * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
     *
     * @param {string} [options.acceptLanguage] - Gets or sets the preferred language for the response.
     *
     * @param {number} [options.longRunningOperationRetryTimeout] - Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param {boolean} [options.generateClientRequestId] - When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     */
    constructor(credentials: ServiceClientCredentials, baseUri: string, options: ServiceClientOptions);

    credentials: ServiceClientCredentials;

    acceptLanguage: string;

    longRunningOperationRetryTimeout: number;

    generateClientRequestId: boolean;

            /**
         * Put External Resource as an Array
         *
         * @param {object} [options] Optional Parameters.
         * 
         * @param {array} [options.resourceArray] External Resource as an Array to put
         * 
         * @param {object} [options.customHeaders] Headers that will be added to the
         * request
         * 
         * @param {ServiceCallback} [callback] callback function; see ServiceCallback
         * doc in ms-rest index.d.ts for details
         */
        putArray(options: { resourceArray? : models.Resource[], customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
        putArray(callback: ServiceCallback<void>): void;

        /**
         * Get External Resource as an Array
         *
         * @param {object} [options] Optional Parameters.
         * 
         * @param {object} [options.customHeaders] Headers that will be added to the
         * request
         * 
         * @param {ServiceCallback} [callback] callback function; see ServiceCallback
         * doc in ms-rest index.d.ts for details
         */
        getArray(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.FlattenedProduct[]>): void;
        getArray(callback: ServiceCallback<models.FlattenedProduct[]>): void;

        /**
         * Put External Resource as a Dictionary
         *
         * @param {object} [options] Optional Parameters.
         * 
         * @param {object} [options.resourceDictionary] External Resource as a
         * Dictionary to put
         * 
         * @param {object} [options.customHeaders] Headers that will be added to the
         * request
         * 
         * @param {ServiceCallback} [callback] callback function; see ServiceCallback
         * doc in ms-rest index.d.ts for details
         */
        putDictionary(options: { resourceDictionary? : { [propertyName: string]: models.FlattenedProduct }, customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
        putDictionary(callback: ServiceCallback<void>): void;

        /**
         * Get External Resource as a Dictionary
         *
         * @param {object} [options] Optional Parameters.
         * 
         * @param {object} [options.customHeaders] Headers that will be added to the
         * request
         * 
         * @param {ServiceCallback} [callback] callback function; see ServiceCallback
         * doc in ms-rest index.d.ts for details
         */
        getDictionary(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<{ [propertyName: string]: models.FlattenedProduct }>): void;
        getDictionary(callback: ServiceCallback<{ [propertyName: string]: models.FlattenedProduct }>): void;

        /**
         * Put External Resource as a ResourceCollection
         *
         * @param {object} [options] Optional Parameters.
         * 
         * @param {object} [options.resourceComplexObject] External Resource as a
         * ResourceCollection to put
         * 
         * @param {object} [options.resourceComplexObject.productresource]
         * 
         * @param {string} [options.resourceComplexObject.productresource.pname]
         * 
         * @param {string}
         * [options.resourceComplexObject.productresource.flattenedProductType]
         * 
         * @param {string}
         * [options.resourceComplexObject.productresource.provisioningState]
         * 
         * @param {object} [options.resourceComplexObject.productresource.tags]
         * 
         * @param {string} [options.resourceComplexObject.productresource.location]
         * Resource Location
         * 
         * @param {array} [options.resourceComplexObject.arrayofresources]
         * 
         * @param {object} [options.resourceComplexObject.dictionaryofresources]
         * 
         * @param {object} [options.customHeaders] Headers that will be added to the
         * request
         * 
         * @param {ServiceCallback} [callback] callback function; see ServiceCallback
         * doc in ms-rest index.d.ts for details
         */
        putResourceCollection(options: { resourceComplexObject? : models.ResourceCollection, customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
        putResourceCollection(callback: ServiceCallback<void>): void;

        /**
         * Get External Resource as a ResourceCollection
         *
         * @param {object} [options] Optional Parameters.
         * 
         * @param {object} [options.customHeaders] Headers that will be added to the
         * request
         * 
         * @param {ServiceCallback} [callback] callback function; see ServiceCallback
         * doc in ms-rest index.d.ts for details
         */
        getResourceCollection(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.ResourceCollection>): void;
        getResourceCollection(callback: ServiceCallback<models.ResourceCollection>): void;

        /**
         * Put Simple Product with client flattening true on the model
         *
         * @param {object} [options] Optional Parameters.
         * 
         * @param {object} [options.simpleBodyProduct] Simple body product to put
         * 
         * @param {string} [options.simpleBodyProduct.maxProductDisplayName] Display
         * name of product.
         * 
         * @param {string} [options.simpleBodyProduct.'@odata.value'] URL value.
         * 
         * @param {string} [options.simpleBodyProduct.baseProductId] Unique identifier
         * representing a specific product for a given latitude & longitude. For
         * example, uberX in San Francisco will have a different product_id than
         * uberX in Los Angeles.
         * 
         * @param {string} [options.simpleBodyProduct.baseProductDescription]
         * Description of product.
         * 
         * @param {object} [options.customHeaders] Headers that will be added to the
         * request
         * 
         * @param {ServiceCallback} [callback] callback function; see ServiceCallback
         * doc in ms-rest index.d.ts for details
         */
        putSimpleProduct(options: { simpleBodyProduct? : models.SimpleProduct, customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.SimpleProduct>): void;
        putSimpleProduct(callback: ServiceCallback<models.SimpleProduct>): void;

        /**
         * Put Flattened Simple Product with client flattening true on the parameter
         *
         * @param {object} flattenParameterGroup Additional parameters for the
         * operation
         * 
         * @param {string} [flattenParameterGroup.baseProductId] Unique identifier
         * representing a specific product for a given latitude & longitude. For
         * example, uberX in San Francisco will have a different product_id than
         * uberX in Los Angeles.
         * 
         * @param {string} [flattenParameterGroup.baseProductDescription] Description
         * of product.
         * 
         * @param {string} [flattenParameterGroup.maxProductDisplayName] Display name
         * of product.
         * 
         * @param {string} [flattenParameterGroup.'@odata.value'] URL value.
         * 
         * @param {string} [flattenParameterGroup.name] Product name
         * 
         * @param {object} [options] Optional Parameters.
         * 
         * @param {object} [options.customHeaders] Headers that will be added to the
         * request
         * 
         * @param {ServiceCallback} [callback] callback function; see ServiceCallback
         * doc in ms-rest index.d.ts for details
         */
        postFlattenedSimpleProduct(flattenParameterGroup: models.FlattenParameterGroup, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.SimpleProduct>): void;
        postFlattenedSimpleProduct(flattenParameterGroup: models.FlattenParameterGroup, callback: ServiceCallback<models.SimpleProduct>): void;

        /**
         * Put Simple Product with client flattening true on the model
         *
         * @param {object} flattenParameterGroup Additional parameters for the
         * operation
         * 
         * @param {string} [flattenParameterGroup.baseProductId] Unique identifier
         * representing a specific product for a given latitude & longitude. For
         * example, uberX in San Francisco will have a different product_id than
         * uberX in Los Angeles.
         * 
         * @param {string} [flattenParameterGroup.baseProductDescription] Description
         * of product.
         * 
         * @param {string} [flattenParameterGroup.maxProductDisplayName] Display name
         * of product.
         * 
         * @param {string} [flattenParameterGroup.'@odata.value'] URL value.
         * 
         * @param {string} [flattenParameterGroup.name] Product name
         * 
         * @param {object} [options] Optional Parameters.
         * 
         * @param {object} [options.customHeaders] Headers that will be added to the
         * request
         * 
         * @param {ServiceCallback} [callback] callback function; see ServiceCallback
         * doc in ms-rest index.d.ts for details
         */
        putSimpleProductWithGrouping(flattenParameterGroup: models.FlattenParameterGroup, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.SimpleProduct>): void;
        putSimpleProductWithGrouping(flattenParameterGroup: models.FlattenParameterGroup, callback: ServiceCallback<models.SimpleProduct>): void;
}

export = AutoRestResourceFlatteningTestService;
