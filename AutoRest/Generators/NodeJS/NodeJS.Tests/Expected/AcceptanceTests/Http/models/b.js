'use strict';

/**
 * @class
 * Initializes a new instance of the B class.
 * @constructor
 */
function B() { }

/**
 * Validate the payload against the B schema
 *
 * @param {JSON} payload
 *
 */
B.prototype.validate = function (payload) {
  if (!payload) {
    throw new Error('B cannot be null.');
  }
  if (payload['statusCode'] !== null && payload['statusCode'] !== undefined && typeof payload['statusCode'].valueOf() !== 'string') {
    throw new Error('payload[\'statusCode\'] must be of type string.');
  }

  if (payload['textStatusCode'] !== null && payload['textStatusCode'] !== undefined && typeof payload['textStatusCode'].valueOf() !== 'string') {
    throw new Error('payload[\'textStatusCode\'] must be of type string.');
  }
};

/**
 * Deserialize the instance to B schema
 *
 * @param {JSON} instance
 *
 */
B.prototype.deserialize = function (instance) {
  return instance;
};

module.exports = new B();
