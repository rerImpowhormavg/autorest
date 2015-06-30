'use strict';

var util = require('util');

var models = require('./index');

/**
 * @class
 * Initializes a new instance of the SubProduct class.
 * @constructor
 */
function SubProduct() { }

/**
 * Validate the payload against the SubProduct schema
 *
 * @param {JSON} payload
 *
 */
SubProduct.prototype.validate = function (payload) {
  if (!payload) {
    throw new Error('SubProduct cannot be null.');
  }
  if (payload['id'] !== null && payload['id'] !== undefined && typeof payload['id'] !== 'string') {
    throw new Error('payload["id"] must be of type string.');
  }

  if (payload['properties'] !== null && payload['properties'] !== undefined) {
    models['SubProductProperties'].validate(payload['properties']);
  }

};

/**
 * Deserialize the instance to SubProduct schema
 *
 * @param {JSON} instance
 *
 */
SubProduct.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance.properties !== null && instance.properties !== undefined) {
      instance.properties = models['SubProductProperties'].deserialize(instance.properties);
    }

  }
  return instance;
};

module.exports = new SubProduct();
