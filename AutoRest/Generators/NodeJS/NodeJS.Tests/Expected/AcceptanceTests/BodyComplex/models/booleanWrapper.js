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

/**
 * @class
 * Initializes a new instance of the BooleanWrapper class.
 * @constructor
 * @member {boolean} [fieldTrue]
 * 
 * @member {boolean} [fieldFalse]
 * 
 */
function BooleanWrapper(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.fieldTrue !== undefined) {
      this.fieldTrue = parameters.fieldTrue;
    }
    if (parameters.fieldFalse !== undefined) {
      this.fieldFalse = parameters.fieldFalse;
    }
  }    
}


/**
 * Validate the payload against the BooleanWrapper schema
 *
 * @param {JSON} payload
 *
 */
BooleanWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['fieldTrue'] !== null && this['fieldTrue'] !== undefined) {
    if (typeof this['fieldTrue'] !== 'boolean') {
      throw new Error('this[\'fieldTrue\'] must be of type boolean.');
    }
    payload['field_true'] = this['fieldTrue'];
  }

  if (this['fieldFalse'] !== null && this['fieldFalse'] !== undefined) {
    if (typeof this['fieldFalse'] !== 'boolean') {
      throw new Error('this[\'fieldFalse\'] must be of type boolean.');
    }
    payload['field_false'] = this['fieldFalse'];
  }

  return payload;
};

/**
 * Deserialize the instance to BooleanWrapper schema
 *
 * @param {JSON} instance
 *
 */
BooleanWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['field_true'] !== undefined) {
      this['fieldTrue'] = instance['field_true'];
    }

    if (instance['field_false'] !== undefined) {
      this['fieldFalse'] = instance['field_false'];
    }
  }

  return this;
};

module.exports = BooleanWrapper;
