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
 * Initializes a new instance of the Widget class.
 * @constructor
 * @member {number} [integer]
 * 
 * @member {string} [string]
 * 
 */
function Widget(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.integer !== undefined) {
      this.integer = parameters.integer;
    }
    if (parameters.string !== undefined) {
      this.string = parameters.string;
    }
  }    
}


/**
 * Validate the payload against the Widget schema
 *
 * @param {JSON} payload
 *
 */
Widget.prototype.serialize = function () {
  var payload = {};
  if (this['integer'] !== null && this['integer'] !== undefined) {
    if (typeof this['integer'] !== 'number') {
      throw new Error('this[\'integer\'] must be of type number.');
    }
    payload['integer'] = this['integer'];
  }

  if (this['string'] !== null && this['string'] !== undefined) {
    if (typeof this['string'].valueOf() !== 'string') {
      throw new Error('this[\'string\'] must be of type string.');
    }
    payload['string'] = this['string'];
  }

  return payload;
};

/**
 * Deserialize the instance to Widget schema
 *
 * @param {JSON} instance
 *
 */
Widget.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['integer'] !== undefined) {
      this['integer'] = instance['integer'];
    }

    if (instance['string'] !== undefined) {
      this['string'] = instance['string'];
    }
  }

  return this;
};

module.exports = Widget;
