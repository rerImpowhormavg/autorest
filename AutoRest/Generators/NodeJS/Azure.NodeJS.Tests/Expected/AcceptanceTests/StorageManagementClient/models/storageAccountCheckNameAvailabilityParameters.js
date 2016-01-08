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
 * Initializes a new instance of the StorageAccountCheckNameAvailabilityParameters class.
 * @constructor
 * @member {string} name
 * 
 * @member {string} [type]  Default value: Microsoft.Storage/storageAccounts .
 * 
 */
function StorageAccountCheckNameAvailabilityParameters() {
}

/**
 * Defines the metadata of StorageAccountCheckNameAvailabilityParameters
 *
 * @returns {object} metadata of StorageAccountCheckNameAvailabilityParameters
 *
 */
StorageAccountCheckNameAvailabilityParameters.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'StorageAccountCheckNameAvailabilityParameters',
    type: {
      name: 'Composite',
      className: 'StorageAccountCheckNameAvailabilityParameters',
      modelProperties: {
        name: {
          required: true,
          serializedName: 'name',
          type: {
            name: 'String'
          }
        },
        type: {
          required: false,
          serializedName: 'type',
          defaultValue: 'Microsoft.Storage/storageAccounts',
          type: {
            name: 'String'
          }
        }
      }
    }
  };
};

module.exports = StorageAccountCheckNameAvailabilityParameters;
