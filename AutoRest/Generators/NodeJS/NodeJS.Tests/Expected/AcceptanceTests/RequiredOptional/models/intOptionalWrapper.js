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

/**
 * @class
 * Initializes a new instance of the IntOptionalWrapper class.
 * @constructor
 */
function IntOptionalWrapper() { }

/**
 * Validate the payload against the IntOptionalWrapper schema
 *
 * @param {JSON} payload
 *
 */
IntOptionalWrapper.prototype.validate = function (payload) {
  if (!payload) {
    throw new Error('IntOptionalWrapper cannot be null.');
  }
  if (payload['value'] !== null && payload['value'] !== undefined && typeof payload['value'] !== 'number') {
    throw new Error('payload[\'value\'] must be of type number.');
  }
};

/**
 * Deserialize the instance to IntOptionalWrapper schema
 *
 * @param {JSON} instance
 *
 */
IntOptionalWrapper.prototype.deserialize = function (instance) {
  return instance;
};

module.exports = new IntOptionalWrapper();
