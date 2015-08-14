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
 * Initializes a new instance of the OperationResult class.
 * @constructor
 */
function OperationResult() { }

/**
 * Validate the payload against the OperationResult schema
 *
 * @param {JSON} payload
 *
 */
OperationResult.prototype.validate = function (payload) {
  if (!payload) {
    throw new Error('OperationResult cannot be null.');
  }
  if (payload['status'] !== null && payload['status'] !== undefined && typeof payload['status'].valueOf() !== 'string') {
    throw new Error('payload[\'status\'] must be of type string.');
  }
};

/**
 * Deserialize the instance to OperationResult schema
 *
 * @param {JSON} instance
 *
 */
OperationResult.prototype.deserialize = function (instance) {
  return instance;
};

module.exports = new OperationResult();
