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
 * Initializes a new instance of the Resource class.
 * @constructor
 * @member {string} [id] Resource Id
 * 
 * @member {string} [name] Resource name
 * 
 * @member {string} [type] Resource type
 * 
 * @member {string} location Resource location
 * 
 * @member {object} [tags] Resource tags
 * 
 */
function Resource(parameters) {
  Resource['super_'].call(this, parameters);
  if (parameters !== null && parameters !== undefined) {
    if (parameters.id !== undefined) {
      this.id = parameters.id;
    }
    if (parameters.name !== undefined) {
      this.name = parameters.name;
    }
    if (parameters.type !== undefined) {
      this.type = parameters.type;
    }
    if (parameters.location !== undefined) {
      this.location = parameters.location;
    }
    if (parameters.tags) {
      this.tags = {};
      for(var valueElement in parameters.tags) {
        if (parameters.tags[valueElement] !== undefined) {
          this.tags[valueElement] = parameters.tags[valueElement];
        }
      }
    }
  }    
}

util.inherits(Resource, models['BaseResource']);

/**
 * Validate the payload against the Resource schema
 *
 * @param {JSON} payload
 *
 */
Resource.prototype.serialize = function () {
  var payload = Resource['super_'].prototype.serialize.call(this);
  if (this['id'] !== null && this['id'] !== undefined) {
    if (typeof this['id'].valueOf() !== 'string') {
      throw new Error('this[\'id\'] must be of type string.');
    }
    payload['id'] = this['id'];
  }

  if (this['name'] !== null && this['name'] !== undefined) {
    if (typeof this['name'].valueOf() !== 'string') {
      throw new Error('this[\'name\'] must be of type string.');
    }
    payload['name'] = this['name'];
  }

  if (this['type'] !== null && this['type'] !== undefined) {
    if (typeof this['type'].valueOf() !== 'string') {
      throw new Error('this[\'type\'] must be of type string.');
    }
    payload['type'] = this['type'];
  }

  if (this['location'] === null || this['location'] === undefined || typeof this['location'].valueOf() !== 'string') {
    throw new Error('this[\'location\'] cannot be null or undefined and it must be of type string.');
  }
  payload['location'] = this['location'];

  if (this['tags'] && typeof this['tags'] === 'object') {
    payload['tags'] = {};
    for(var valueElement1 in this['tags']) {
      if (this['tags'][valueElement1] !== null && this['tags'][valueElement1] !== undefined) {
        if (typeof this['tags'][valueElement1].valueOf() !== 'string') {
          throw new Error('this[\'tags\'][valueElement1] must be of type string.');
        }
        if (payload['tags'] === null || payload['tags'] === undefined) {
          payload['tags'] = {};
        }
        payload['tags'][valueElement1] = this['tags'][valueElement1];
      }
      else {
        payload['tags'][valueElement1] = this['tags'][valueElement1];
      }
    }
  }

  return payload;
};

/**
 * Deserialize the instance to Resource schema
 *
 * @param {JSON} instance
 *
 */
Resource.prototype.deserialize = function (instance) {
  Resource['super_'].prototype.deserialize.call(this, instance);
  if (instance) {
    if (instance['id'] !== undefined) {
      this['id'] = instance['id'];
    }

    if (instance['name'] !== undefined) {
      this['name'] = instance['name'];
    }

    if (instance['type'] !== undefined) {
      this['type'] = instance['type'];
    }

    if (instance['location'] !== undefined) {
      this['location'] = instance['location'];
    }

    if (instance['tags']) {
      this['tags'] = {};
      for(var valueElement2 in instance['tags']) {
        if (instance['tags'] !== null && instance['tags'] !== undefined) {
          if (instance['tags'][valueElement2] !== undefined) {
            this['tags'][valueElement2] = instance['tags'][valueElement2];
          }
        }
      }
    }
  }

  return this;
};

module.exports = Resource;
