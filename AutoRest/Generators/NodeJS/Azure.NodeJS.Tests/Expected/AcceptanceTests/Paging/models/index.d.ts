/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
// TODO: Include PageTemplateModels here too?? Probably
 */


/**
 * @class
 * Initializes a new instance of the Product class.
 * @constructor
 * @member {object} [properties]
 * 
 * @member {number} [properties.id]
 * 
 * @member {string} [properties.name]
 * 
 */
export interface Product {
    properties?: ProductProperties;
}

/**
 * @class
 * Initializes a new instance of the ProductProperties class.
 * @constructor
 * @member {number} [id]
 * 
 * @member {string} [name]
 * 
 */
export interface ProductProperties {
    id?: number;
    name?: string;
}

/**
 * @class
 * Initializes a new instance of the OperationResult class.
 * @constructor
 * @member {string} [status] The status of the request. Possible values for
 * this property include: 'Succeeded', 'Failed', 'canceled', 'Accepted',
 * 'Creating', 'Created', 'Updating', 'Updated', 'Deleting', 'Deleted', 'OK'.
 * 
 */
export interface OperationResult {
    status?: string;
}

/**
 * @class
 * Initializes a new instance of the PagingGetMultiplePagesOptions class.
 * @constructor
 * Additional parameters for the getMultiplePages operation.
 * @member {number} [maxresults] Sets the maximum number of items to return in
 * the response.
 * 
 * @member {number} [timeout] Sets the maximum time that the server can spend
 * processing the request, in seconds. The default is 30 seconds.
 * 
 */
export interface PagingGetMultiplePagesOptions {
    maxresults?: number;
    timeout?: number;
}
