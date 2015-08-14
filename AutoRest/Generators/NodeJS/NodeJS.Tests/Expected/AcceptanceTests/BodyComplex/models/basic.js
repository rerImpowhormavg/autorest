'use strict';

/**
 * @class
 * Initializes a new instance of the Basic class.
 * @constructor
 */
function Basic() { }

/**
 * Validate the payload against the Basic schema
 *
 * @param {JSON} payload
 *
 */
Basic.prototype.validate = function (payload) {
  if (!payload) {
    throw new Error('Basic cannot be null.');
  }
  if (payload['id'] !== null && payload['id'] !== undefined && typeof payload['id'] !== 'number') {
    throw new Error('payload[\'id\'] must be of type number.');
  }

  if (payload['name'] !== null && payload['name'] !== undefined && typeof payload['name'].valueOf() !== 'string') {
    throw new Error('payload[\'name\'] must be of type string.');
  }

  if (payload['color']) {
    var allowedValues = [ 'cyan', 'Magenta', 'YELLOW', 'blacK' ];
    if (!allowedValues.some( function(item) { return item === payload['color']; })) {
      throw new Error(payload['color'] + ' is not a valid value. The valid values are: ' + allowedValues);
    }
  }
};

/**
 * Deserialize the instance to Basic schema
 *
 * @param {JSON} instance
 *
 */
Basic.prototype.deserialize = function (instance) {
  return instance;
};

module.exports = new Basic();
