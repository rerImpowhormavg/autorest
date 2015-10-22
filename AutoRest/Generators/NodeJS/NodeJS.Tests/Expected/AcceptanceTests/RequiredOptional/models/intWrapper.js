/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the IntWrapper class.
 * @constructor
 * @member {number} value
 * 
 */
function IntWrapper(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.value !== undefined) {
      this.value = parameters.value;
    }
  }    
}


/**
 * Validate the payload against the IntWrapper schema
 *
 * @param {JSON} payload
 *
 */
IntWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['value'] === null || this['value'] === undefined || typeof this['value'] !== 'number') {
    throw new Error('this[\'value\'] cannot be null or undefined and it must be of type number.');
  }
  payload['value'] = this['value'];

  return payload;
};

/**
 * Deserialize the instance to IntWrapper schema
 *
 * @param {JSON} instance
 *
 */
IntWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['value'] !== undefined) {
      this['value'] = instance['value'];
    }
  }

  return this;
};

module.exports = IntWrapper;
