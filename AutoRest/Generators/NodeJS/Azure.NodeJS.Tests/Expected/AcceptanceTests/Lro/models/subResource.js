/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the SubResource class.
 * @constructor
 * @member {string} [id] Sub Resource Id
 * 
 */
function SubResource(parameters) {
  SubResource['super_'].call(this, parameters);
  if (parameters !== null && parameters !== undefined) {
    if (parameters.id !== undefined) {
      this.id = parameters.id;
    }
  }    
}

util.inherits(SubResource, models['BaseResource']);

/**
 * Validate the payload against the SubResource schema
 *
 * @param {JSON} payload
 *
 */
SubResource.prototype.serialize = function () {
  var payload = SubResource['super_'].prototype.serialize.call(this);
  if (this['id'] !== null && this['id'] !== undefined) {
    if (typeof this['id'].valueOf() !== 'string') {
      throw new Error('this[\'id\'] must be of type string.');
    }
    payload['id'] = this['id'];
  }

  return payload;
};

/**
 * Deserialize the instance to SubResource schema
 *
 * @param {JSON} instance
 *
 */
SubResource.prototype.deserialize = function (instance) {
  SubResource['super_'].prototype.deserialize.call(this, instance);
  if (instance) {
    if (instance['id'] !== undefined) {
      this['id'] = instance['id'];
    }
  }

  return this;
};

module.exports = SubResource;
