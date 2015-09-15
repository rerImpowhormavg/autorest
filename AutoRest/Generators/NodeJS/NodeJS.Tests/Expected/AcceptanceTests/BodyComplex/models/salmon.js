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

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the Salmon class.
 * @constructor
 * @member {string} [location]
 * 
 * @member {boolean} [iswild]
 * 
 */
function Salmon(parameters) {
  Salmon['super_'].call(this, parameters);
  if (parameters !== null && parameters !== undefined) {
    if (parameters.location !== null && parameters.location !== undefined) {
      this.location = parameters.location;
    }
    if (parameters.iswild !== null && parameters.iswild !== undefined) {
      this.iswild = parameters.iswild;
    }
  }    
}

util.inherits(Salmon, models['Fish']);

/**
 * Validate the payload against the Salmon schema
 *
 * @param {JSON} payload
 *
 */
Salmon.prototype.serialize = function () {
  var payload = Salmon['super_'].prototype.serialize.call(this);
  if (this['location'] !== null && this['location'] !== undefined) {
    if (typeof this['location'].valueOf() !== 'string') {
      throw new Error('this[\'location\'] must be of type string.');
    }
    payload['location'] = this['location'];
  }

  if (this['iswild'] !== null && this['iswild'] !== undefined) {
    if (typeof this['iswild'] !== 'boolean') {
      throw new Error('this[\'iswild\'] must be of type boolean.');
    }
    payload['iswild'] = this['iswild'];
  }

  return payload;
};

/**
 * Deserialize the instance to Salmon schema
 *
 * @param {JSON} instance
 *
 */
Salmon.prototype.deserialize = function (instance) {
  Salmon['super_'].prototype.deserialize.call(this, instance);
  if (instance) {
    if (instance['location'] !== null && instance['location'] !== undefined) {
      this['location'] = instance['location'];
    }

    if (instance['iswild'] !== null && instance['iswild'] !== undefined) {
      this['iswild'] = instance['iswild'];
    }
  }

  return this;
};

module.exports = Salmon;
