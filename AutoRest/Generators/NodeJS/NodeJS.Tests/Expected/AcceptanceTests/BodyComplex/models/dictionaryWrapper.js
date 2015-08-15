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
 * Initializes a new instance of the DictionaryWrapper class.
 * @constructor
 */
function DictionaryWrapper() { }

/**
 * Validate the payload against the DictionaryWrapper schema
 *
 * @param {JSON} payload
 *
 */
DictionaryWrapper.prototype.validate = function (payload) {
  if (!payload) {
    throw new Error('DictionaryWrapper cannot be null.');
  }
  if (payload['defaultProgram'] && typeof payload['defaultProgram'] === 'object') {
    for(var valueElement in payload['defaultProgram']) {
      if (payload['defaultProgram'][valueElement] !== null && payload['defaultProgram'][valueElement] !== undefined && typeof payload['defaultProgram'][valueElement].valueOf() !== 'string') {
        throw new Error('payload[\'defaultProgram\'][valueElement] must be of type string.');
      }
    }
  }
};

/**
 * Deserialize the instance to DictionaryWrapper schema
 *
 * @param {JSON} instance
 *
 */
DictionaryWrapper.prototype.deserialize = function (instance) {
  return instance;
};

module.exports = new DictionaryWrapper();
