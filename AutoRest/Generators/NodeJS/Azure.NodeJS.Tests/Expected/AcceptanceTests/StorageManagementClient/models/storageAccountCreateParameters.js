/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the StorageAccountCreateParameters class.
 * @constructor
 * The parameters to provide for the account.
 *
 * @member {string} [accountType] Gets or sets the account type. Possible
 * values include: 'Standard_LRS', 'Standard_ZRS', 'Standard_GRS',
 * 'Standard_RAGRS', 'Premium_LRS'
 * 
 */
function StorageAccountCreateParameters() {
  StorageAccountCreateParameters['super_'].call(this);
}

util.inherits(StorageAccountCreateParameters, models['Resource']);

/**
 * Defines the metadata of StorageAccountCreateParameters
 *
 * @returns {object} metadata of StorageAccountCreateParameters
 *
 */
StorageAccountCreateParameters.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'StorageAccountCreateParameters',
    type: {
      name: 'Composite',
      className: 'StorageAccountCreateParameters',
      modelProperties: {
        id: {
          required: false,
          readOnly: true,
          serializedName: 'id',
          type: {
            name: 'String'
          }
        },
        name: {
          required: false,
          readOnly: true,
          serializedName: 'name',
          type: {
            name: 'String'
          }
        },
        type: {
          required: false,
          readOnly: true,
          serializedName: 'type',
          type: {
            name: 'String'
          }
        },
        location: {
          required: true,
          serializedName: 'location',
          type: {
            name: 'String'
          }
        },
        tags: {
          required: false,
          serializedName: 'tags',
          type: {
            name: 'Dictionary',
            value: {
                required: false,
                serializedName: 'StringElementType',
                type: {
                  name: 'String'
                }
            }
          }
        },
        accountType: {
          required: false,
          serializedName: 'properties.accountType',
          type: {
            name: 'Enum',
            allowedValues: [ 'Standard_LRS', 'Standard_ZRS', 'Standard_GRS', 'Standard_RAGRS', 'Premium_LRS' ]
          }
        }
      }
    }
  };
};

module.exports = StorageAccountCreateParameters;
