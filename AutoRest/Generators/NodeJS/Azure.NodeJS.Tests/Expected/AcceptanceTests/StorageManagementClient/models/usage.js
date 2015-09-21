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

/**
 * @class
 * Initializes a new instance of the Usage class.
 * @constructor
 * Describes Storage Resource Usage.
 * @member {string} [unit] Gets the unit of measurement. Possible values for
 * this property include: 'Count', 'Bytes', 'Seconds', 'Percent',
 * 'CountsPerSecond', 'BytesPerSecond'.
 * 
 * @member {number} [currentValue] Gets the current count of the allocated
 * resources in the subscription.
 * 
 * @member {number} [limit] Gets the maximum count of the resources that can
 * be allocated in the subscription.
 * 
 * @member {object} [name] Gets the name of the type of usage.
 * 
 * @member {string} [name.value] Gets a string describing the resource name.
 * 
 * @member {string} [name.localizedValue] Gets a localized string describing
 * the resource name.
 * 
 */
function Usage(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.unit !== null && parameters.unit !== undefined) {
      this.unit = parameters.unit;
    }
    if (parameters.currentValue !== null && parameters.currentValue !== undefined) {
      this.currentValue = parameters.currentValue;
    }
    if (parameters.limit !== null && parameters.limit !== undefined) {
      this.limit = parameters.limit;
    }
    if (parameters.name !== null && parameters.name !== undefined) {
      this.name = new models['UsageName'](parameters.name);
    }
  }    
}


/**
 * Validate the payload against the Usage schema
 *
 * @param {JSON} payload
 *
 */
Usage.prototype.serialize = function () {
  var payload = {};
  if (this['unit'] !== null && this['unit'] !== undefined) {
    var allowedValues = [ 'Count', 'Bytes', 'Seconds', 'Percent', 'CountsPerSecond', 'BytesPerSecond' ];
    var thisunit = this['unit'];
    if (!allowedValues.some( function(item) { return item === thisunit; })) {
      throw new Error(this['unit'] + ' is not a valid value. The valid values are: ' + allowedValues);
    }
    payload['unit'] = this['unit'];
  }

  if (this['currentValue'] !== null && this['currentValue'] !== undefined) {
    if (typeof this['currentValue'] !== 'number') {
      throw new Error('this[\'currentValue\'] must be of type number.');
    }
    payload['currentValue'] = this['currentValue'];
  }

  if (this['limit'] !== null && this['limit'] !== undefined) {
    if (typeof this['limit'] !== 'number') {
      throw new Error('this[\'limit\'] must be of type number.');
    }
    payload['limit'] = this['limit'];
  }

  if (this['name']) {
    payload['name'] = this['name'].serialize();
  }

  return payload;
};

/**
 * Deserialize the instance to Usage schema
 *
 * @param {JSON} instance
 *
 */
Usage.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['unit'] !== null && instance['unit'] !== undefined) {
      this['unit'] = instance['unit'];
    }

    if (instance['currentValue'] !== null && instance['currentValue'] !== undefined) {
      this['currentValue'] = instance['currentValue'];
    }

    if (instance['limit'] !== null && instance['limit'] !== undefined) {
      this['limit'] = instance['limit'];
    }

    if (instance['name'] !== null && instance['name'] !== undefined) {
      this['name'] = new models['UsageName']().deserialize(instance['name']);
    }
  }

  return this;
};

module.exports = Usage;
