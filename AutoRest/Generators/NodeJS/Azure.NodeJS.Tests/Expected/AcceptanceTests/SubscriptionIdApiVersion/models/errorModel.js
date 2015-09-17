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
 * Initializes a new instance of the ErrorModel class.
 * @constructor
 * @member {number} [code]
 * 
 * @member {string} [message]
 * 
 */
function ErrorModel(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.code !== null && parameters.code !== undefined) {
      this.code = parameters.code;
    }
    if (parameters.message !== null && parameters.message !== undefined) {
      this.message = parameters.message;
    }
  }    
}


/**
 * Validate the payload against the ErrorModel schema
 *
 * @param {JSON} payload
 *
 */
ErrorModel.prototype.serialize = function () {
  var payload = {};
  if (this['code'] !== null && this['code'] !== undefined) {
    if (typeof this['code'] !== 'number') {
      throw new Error('this[\'code\'] must be of type number.');
    }
    payload['code'] = this['code'];
  }

  if (this['message'] !== null && this['message'] !== undefined) {
    if (typeof this['message'].valueOf() !== 'string') {
      throw new Error('this[\'message\'] must be of type string.');
    }
    payload['message'] = this['message'];
  }

  return payload;
};

/**
 * Deserialize the instance to ErrorModel schema
 *
 * @param {JSON} instance
 *
 */
ErrorModel.prototype.deserialize = function (instance) {
  if (instance) {
    this['code'] = instance['code'];

    this['message'] = instance['message'];
  }

  return this;
};

module.exports = ErrorModel;
