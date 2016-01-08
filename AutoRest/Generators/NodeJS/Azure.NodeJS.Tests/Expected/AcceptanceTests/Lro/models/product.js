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

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the Product class.
 * @constructor
 * @member {string} [provisioningState]
 * 
 * @member {string} [provisioningStateValues] Possible values for this
 * property include: 'Succeeded', 'Failed', 'canceled', 'Accepted',
 * 'Creating', 'Created', 'Updating', 'Updated', 'Deleting', 'Deleted', 'OK'.
 * 
 */
function Product() {
  Product['super_'].call(this);
}

util.inherits(Product, models['Resource']);

/**
 * Defines the metadata of Product
 *
 * @returns {object} metadata of Product
 *
 */
Product.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'Product',
    type: {
      name: 'Composite',
      className: 'Product',
      modelProperties: {
        id: {
          required: false,
          serializedName: 'id',
          type: {
            name: 'String'
          }
        },
        type: {
          required: false,
          serializedName: 'type',
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
        location: {
          required: false,
          serializedName: 'location',
          type: {
            name: 'String'
          }
        },
        name: {
          required: false,
          serializedName: 'name',
          type: {
            name: 'String'
          }
        },
        provisioningState: {
          required: false,
          serializedName: 'properties.provisioningState',
          type: {
            name: 'String'
          }
        },
        provisioningStateValues: {
          required: false,
          serializedName: 'properties.provisioningStateValues',
          type: {
            name: 'String'
          }
        }
      }
    }
  };
};

/**
 * Validate the payload against the Product schema
 *
 * @param {JSON} payload
 *
 */
Product.prototype.serialize = function () {
  var payload = Product['super_'].prototype.serialize.call(this);
  if (this['provisioningState'] !== null && this['provisioningState'] !== undefined) {
    if (typeof this['provisioningState'].valueOf() !== 'string') {
      throw new Error('this[\'provisioningState\'] must be of type string.');
    }
    if (payload['properties'] === null || payload['properties'] === undefined) {
      payload['properties'] = {};
    }
    payload['properties']['provisioningState'] = this['provisioningState'];
  }

  if (this['provisioningStateValues'] !== null && this['provisioningStateValues'] !== undefined) {
    if (typeof this['provisioningStateValues'].valueOf() !== 'string') {
      throw new Error('this[\'provisioningStateValues\'] must be of type string.');
    }
    if (payload['properties'] === null || payload['properties'] === undefined) {
      payload['properties'] = {};
    }
    payload['properties']['provisioningStateValues'] = this['provisioningStateValues'];
  }

  return payload;
};

/**
 * Deserialize the instance to Product schema
 *
 * @param {JSON} instance
 *
 */
Product.prototype.deserialize = function (instance) {
  Product['super_'].prototype.deserialize.call(this, instance);
  if (instance) {
    if (instance['properties'] !== null && instance['properties'] !== undefined) {
      if (instance['properties']['provisioningState'] !== undefined) {
        this['provisioningState'] = instance['properties']['provisioningState'];
      }
    }

    if (instance['properties'] !== null && instance['properties'] !== undefined) {
      if (instance['properties']['provisioningStateValues'] !== undefined) {
        this['provisioningStateValues'] = instance['properties']['provisioningStateValues'];
      }
    }
  }

  return this;
};

module.exports = Product;
