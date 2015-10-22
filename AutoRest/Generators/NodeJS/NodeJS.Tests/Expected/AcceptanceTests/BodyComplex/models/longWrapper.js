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
 * Initializes a new instance of the LongWrapper class.
 * @constructor
 * @member {number} [field1]
 * 
 * @member {number} [field2]
 * 
 */
function LongWrapper(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.field1 !== undefined) {
      this.field1 = parameters.field1;
    }
    if (parameters.field2 !== undefined) {
      this.field2 = parameters.field2;
    }
  }    
}


/**
 * Validate the payload against the LongWrapper schema
 *
 * @param {JSON} payload
 *
 */
LongWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['field1'] !== null && this['field1'] !== undefined) {
    if (typeof this['field1'] !== 'number') {
      throw new Error('this[\'field1\'] must be of type number.');
    }
    payload['field1'] = this['field1'];
  }

  if (this['field2'] !== null && this['field2'] !== undefined) {
    if (typeof this['field2'] !== 'number') {
      throw new Error('this[\'field2\'] must be of type number.');
    }
    payload['field2'] = this['field2'];
  }

  return payload;
};

/**
 * Deserialize the instance to LongWrapper schema
 *
 * @param {JSON} instance
 *
 */
LongWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['field1'] !== undefined) {
      this['field1'] = instance['field1'];
    }

    if (instance['field2'] !== undefined) {
      this['field2'] = instance['field2'];
    }
  }

  return this;
};

module.exports = LongWrapper;
