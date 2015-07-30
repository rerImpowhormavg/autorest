'use strict';

var util = require('util');

var models = require('./index');

/**
 * @class
 * Initializes a new instance of the Siamese class.
 * @constructor
 */
function Siamese() { }

/**
 * Validate the payload against the Siamese schema
 *
 * @param {JSON} payload
 *
 */
Siamese.prototype.validate = function (payload) {
  if (!payload) {
    throw new Error('Siamese cannot be null.');
  }
  if (payload['id'] !== null && payload['id'] !== undefined && typeof payload['id'] !== 'number') {
    throw new Error('payload[\'id\'] must be of type number.');
  }

  if (payload['name'] !== null && payload['name'] !== undefined && typeof payload['name'].valueOf() !== 'string') {
    throw new Error('payload[\'name\'] must be of type string.');
  }

  if (payload['color'] !== null && payload['color'] !== undefined && typeof payload['color'].valueOf() !== 'string') {
    throw new Error('payload[\'color\'] must be of type string.');
  }

  if (util.isArray(payload['hates'])) {
    for (var i = 0; i < payload['hates'].length; i++) {
      if (payload['hates'][i]) {
        models['Dog'].validate(payload['hates'][i]);
      }
    }
  }

  if (payload['breed'] !== null && payload['breed'] !== undefined && typeof payload['breed'].valueOf() !== 'string') {
    throw new Error('payload[\'breed\'] must be of type string.');
  }
};

/**
 * Deserialize the instance to Siamese schema
 *
 * @param {JSON} instance
 *
 */
Siamese.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance.hates !== null && instance.hates !== undefined) {
      var deserializedArray = [];
      instance.hates.forEach(function(element) {
        if (element !== null && element !== undefined) {
          element = models['Dog'].deserialize(element);
        }
        deserializedArray.push(element);
      });
      instance.hates = deserializedArray;
    }
  }
  return instance;
};

module.exports = new Siamese();
