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

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the ResourceCollection class.
 * @constructor
 * @member {object} [productresource]
 * 
 * @member {string} [productresource.pname]
 * 
 * @member {string} [productresource.flattenedProductType]
 * 
 * @member {string} [productresource.provisioningStateValues] Possible values
 * for this property include: 'Succeeded', 'Failed', 'canceled', 'Accepted',
 * 'Creating', 'Created', 'Updating', 'Updated', 'Deleting', 'Deleted', 'OK'.
 * 
 * @member {string} [productresource.provisioningState]
 * 
 * @member {array} [arrayofresources]
 * 
 * @member {object} [dictionaryofresources]
 * 
 */
function ResourceCollection() {
}

/**
 * Defines the metadata of ResourceCollection
 *
 * @returns {object} metadata of ResourceCollection
 *
 */
ResourceCollection.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'ResourceCollection',
    type: {
      name: 'Composite',
      className: 'ResourceCollection',
      modelProperties: {
        productresource: {
          required: false,
          serializedName: 'productresource',
          type: {
            name: 'Composite',
            className: 'FlattenedProduct'
          }
        },
        arrayofresources: {
          required: false,
          serializedName: 'arrayofresources',
          type: {
            name: 'Sequence',
            element: {
                required: false,
                serializedName: 'FlattenedProductElementType',
                type: {
                  name: 'Composite',
                  className: 'FlattenedProduct'
                }
            }
          }
        },
        dictionaryofresources: {
          required: false,
          serializedName: 'dictionaryofresources',
          type: {
            name: 'Dictionary',
            value: {
                required: false,
                serializedName: 'FlattenedProductElementType',
                type: {
                  name: 'Composite',
                  className: 'FlattenedProduct'
                }
            }
          }
        }
      }
    }
  };
};

module.exports = ResourceCollection;
