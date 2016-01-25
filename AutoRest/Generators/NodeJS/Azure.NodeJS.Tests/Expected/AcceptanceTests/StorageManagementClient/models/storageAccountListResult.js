/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var util = require('util');

/**
 * @class
 * Initializes a new instance of the StorageAccountListResult class.
 * @constructor
 * The list storage accounts operation response.
 * @member {array} [value] Gets the list of storage accounts and their
 * properties.
 * 
 * @member {string} [nextLink] Gets the link to the next set of results.
 * Currently this will always be empty as the API does not support pagination.
 * 
 */
function StorageAccountListResult() {
}

util.inherits(StorageAccountListResult, Array);

/**
 * Defines the metadata of StorageAccountListResult
 *
 * @returns {object} metadata of StorageAccountListResult
 *
 */
StorageAccountListResult.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'StorageAccountListResult',
    type: {
      name: 'Composite',
      className: 'StorageAccountListResult',
      modelProperties: {
        value: {
          required: false,
          serializedName: '',
          type: {
            name: 'Sequence',
            element: {
                required: false,
                serializedName: 'StorageAccountElementType',
                type: {
                  name: 'Composite',
                  className: 'StorageAccount'
                }
            }
          }
        }
      }
    }
  };
};

module.exports = StorageAccountListResult;
