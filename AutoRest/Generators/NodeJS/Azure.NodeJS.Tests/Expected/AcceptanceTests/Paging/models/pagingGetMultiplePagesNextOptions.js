/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the PagingGetMultiplePagesNextOptions class.
 * @constructor
 * Additional parameters for the getMultiplePagesNext operation.
 * @member {number} [maxresults] Sets the maximum number of items to return in
 * the response.
 * 
 * @member {number} [timeout] Sets the maximum time that the server can spend
 * processing the request, in seconds. The default is 30 seconds. Default
 * value: 30 .
 * 
 */
function PagingGetMultiplePagesNextOptions() {
}

/**
 * Defines the metadata of PagingGetMultiplePagesNextOptions
 *
 * @returns {object} metadata of PagingGetMultiplePagesNextOptions
 *
 */
PagingGetMultiplePagesNextOptions.prototype.mapper = function () {
  return {
    required: false,
    type: {
      name: 'Composite',
      className: 'PagingGetMultiplePagesNextOptions',
      modelProperties: {
        maxresults: {
          required: false,
          type: {
            name: 'Number'
          }
        },
        timeout: {
          required: false,
          defaultValue: '30',
          type: {
            name: 'Number'
          }
        }
      }
    }
  };
};

module.exports = PagingGetMultiplePagesNextOptions;
