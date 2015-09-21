/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the FlattenedProduct class.
 * @constructor
 * @member {string} [pname]
 * 
 * @member {string} [flattenedProductType]
 * 
 * @member {string} [provisioningStateValues] Possible values for this
 * property include: 'Succeeded', 'Failed', 'canceled', 'Accepted',
 * 'Creating', 'Created', 'Updating', 'Updated', 'Deleting', 'Deleted', 'OK'.
 * 
 * @member {string} [provisioningState]
 * 
 */
function FlattenedProduct(parameters) {
  FlattenedProduct['super_'].call(this, parameters);
  if (parameters !== null && parameters !== undefined) {
    if (parameters.pname !== null && parameters.pname !== undefined) {
      this.pname = parameters.pname;
    }
    if (parameters.flattenedProductType !== null && parameters.flattenedProductType !== undefined) {
      this.flattenedProductType = parameters.flattenedProductType;
    }
    if (parameters.provisioningStateValues !== null && parameters.provisioningStateValues !== undefined) {
      this.provisioningStateValues = parameters.provisioningStateValues;
    }
    if (parameters.provisioningState !== null && parameters.provisioningState !== undefined) {
      this.provisioningState = parameters.provisioningState;
    }
  }    
}

util.inherits(FlattenedProduct, models['Resource']);

/**
 * Validate the payload against the FlattenedProduct schema
 *
 * @param {JSON} payload
 *
 */
FlattenedProduct.prototype.serialize = function () {
  var payload = FlattenedProduct['super_'].prototype.serialize.call(this);
  if (this['pname'] !== null && this['pname'] !== undefined) {
    if (typeof this['pname'].valueOf() !== 'string') {
      throw new Error('this[\'pname\'] must be of type string.');
    }
    if (payload['properties'] === null || payload['properties'] === undefined) {
      payload['properties'] = {};
    }
    payload['properties']['pname'] = this['pname'];
  }

  if (this['flattenedProductType'] !== null && this['flattenedProductType'] !== undefined) {
    if (typeof this['flattenedProductType'].valueOf() !== 'string') {
      throw new Error('this[\'flattenedProductType\'] must be of type string.');
    }
    if (payload['properties'] === null || payload['properties'] === undefined) {
      payload['properties'] = {};
    }
    payload['properties']['type'] = this['flattenedProductType'];
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

  if (this['provisioningState'] !== null && this['provisioningState'] !== undefined) {
    if (typeof this['provisioningState'].valueOf() !== 'string') {
      throw new Error('this[\'provisioningState\'] must be of type string.');
    }
    if (payload['properties'] === null || payload['properties'] === undefined) {
      payload['properties'] = {};
    }
    payload['properties']['provisioningState'] = this['provisioningState'];
  }

  return payload;
};

/**
 * Deserialize the instance to FlattenedProduct schema
 *
 * @param {JSON} instance
 *
 */
FlattenedProduct.prototype.deserialize = function (instance) {
  FlattenedProduct['super_'].prototype.deserialize.call(this, instance);
  if (instance) {
    if (instance['properties'] !== null && instance['properties'] !== undefined) {
      if (instance['properties']['pname'] !== null && instance['properties']['pname'] !== undefined) {
        this['pname'] = instance['properties']['pname'];
      }
      else {
        this['pname'] = instance['properties']['pname'];
      }
    }

    if (instance['properties'] !== null && instance['properties'] !== undefined) {
      if (instance['properties']['type'] !== null && instance['properties']['type'] !== undefined) {
        this['flattenedProductType'] = instance['properties']['type'];
      }
      else {
        this['flattenedProductType'] = instance['properties']['type'];
      }
    }

    if (instance['properties'] !== null && instance['properties'] !== undefined) {
      if (instance['properties']['provisioningStateValues'] !== null && instance['properties']['provisioningStateValues'] !== undefined) {
        this['provisioningStateValues'] = instance['properties']['provisioningStateValues'];
      }
      else {
        this['provisioningStateValues'] = instance['properties']['provisioningStateValues'];
      }
    }

    if (instance['properties'] !== null && instance['properties'] !== undefined) {
      if (instance['properties']['provisioningState'] !== null && instance['properties']['provisioningState'] !== undefined) {
        this['provisioningState'] = instance['properties']['provisioningState'];
      }
      else {
        this['provisioningState'] = instance['properties']['provisioningState'];
      }
    }
  }

  return this;
};

module.exports = FlattenedProduct;
