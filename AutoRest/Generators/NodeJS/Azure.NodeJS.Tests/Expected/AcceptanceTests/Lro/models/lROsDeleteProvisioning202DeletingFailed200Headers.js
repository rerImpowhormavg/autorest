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

/**
 * @class
 * Initializes a new instance of the LROsDeleteProvisioning202DeletingFailed200Headers class.
 * @constructor
 * Defines headers for deleteProvisioning202DeletingFailed200 operation.
 * @member {string} [location] Location to poll for result status: will be set
 * to /lro/delete/provisioning/202/deleting/200/failed
 * 
 * @member {number} [retryAfter] Number of milliseconds until the next poll
 * should be sent, will be set to zero
 * 
 */
function LROsDeleteProvisioning202DeletingFailed200Headers(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.location !== undefined) {
      this.location = parameters.location;
    }
    if (parameters.retryAfter !== undefined) {
      this.retryAfter = parameters.retryAfter;
    }
  }    
}


/**
 * Validate the payload against the LROsDeleteProvisioning202DeletingFailed200Headers schema
 *
 * @param {JSON} payload
 *
 */
LROsDeleteProvisioning202DeletingFailed200Headers.prototype.serialize = function () {
  var payload = {};
  if (this['location'] !== null && this['location'] !== undefined) {
    if (typeof this['location'].valueOf() !== 'string') {
      throw new Error('this[\'location\'] must be of type string.');
    }
    payload['Location'] = this['location'];
  }

  if (this['retryAfter'] !== null && this['retryAfter'] !== undefined) {
    if (typeof this['retryAfter'] !== 'number') {
      throw new Error('this[\'retryAfter\'] must be of type number.');
    }
    payload['Retry-After'] = this['retryAfter'];
  }

  return payload;
};

/**
 * Deserialize the instance to LROsDeleteProvisioning202DeletingFailed200Headers schema
 *
 * @param {JSON} instance
 *
 */
LROsDeleteProvisioning202DeletingFailed200Headers.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['Location'] !== undefined) {
      this['location'] = instance['Location'];
    }

    if (instance['Retry-After'] !== undefined) {
      this['retryAfter'] = instance['Retry-After'];
    }
  }

  return this;
};

module.exports = LROsDeleteProvisioning202DeletingFailed200Headers;
