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
 * Initializes a new instance of the D class.
 * @constructor
 * @member {string} [httpStatusCode]
 * 
 */
function D(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.httpStatusCode !== null && parameters.httpStatusCode !== undefined) {
      this.httpStatusCode = parameters.httpStatusCode;
    }
  }    
}


/**
 * Validate the payload against the D schema
 *
 * @param {JSON} payload
 *
 */
D.prototype.serialize = function () {
  var payload = {};
  if (this['httpStatusCode'] !== null && this['httpStatusCode'] !== undefined) {
    if (typeof this['httpStatusCode'].valueOf() !== 'string') {
      throw new Error('this[\'httpStatusCode\'] must be of type string.');
    }
    payload['httpStatusCode'] = this['httpStatusCode'];
  }
};

/**
 * Deserialize the instance to D schema
 *
 * @param {JSON} instance
 *
 */
D.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance.httpStatusCode !== null && instance.httpStatusCode !== undefined) {
      this.httpStatusCode = instance.httpStatusCode;
    }
  }
};

module.exports = D;
