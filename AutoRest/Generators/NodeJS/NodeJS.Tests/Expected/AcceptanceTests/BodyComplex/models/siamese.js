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
 * Initializes a new instance of the Siamese class.
 * @constructor
 * @member {string} [breed]
 * 
 */
function Siamese(parameters) {
  Siamese['super_'].call(this, parameters);
  if (parameters !== null && parameters !== undefined) {
    if (parameters.breed !== null && parameters.breed !== undefined) {
      this.breed = parameters.breed;
    }
  }    
}

util.inherits(Siamese, models['Cat']);

/**
 * Validate the payload against the Siamese schema
 *
 * @param {JSON} payload
 *
 */
Siamese.prototype.serialize = function () {
  var payload = Siamese['super_'].prototype.serialize.call(this);
  if (this['breed'] !== null && this['breed'] !== undefined) {
    if (typeof this['breed'].valueOf() !== 'string') {
      throw new Error('this[\'breed\'] must be of type string.');
    }
    payload['breed'] = this['breed'];
  }
};

/**
 * Deserialize the instance to Siamese schema
 *
 * @param {JSON} instance
 *
 */
Siamese.prototype.deserialize = function (instance) {
  Siamese['super_'].prototype.deserialize.call(this, instance);
  if (instance) {
    if (instance['breed'] !== null && instance['breed'] !== undefined) {
      this['breed'] = instance['breed'];
    }
  }
};

module.exports = Siamese;
