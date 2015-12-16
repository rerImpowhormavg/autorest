/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the CheckNameAvailabilityResult class.
 * @constructor
 * The CheckNameAvailability operation response.
 * @member {boolean} [nameAvailable] Gets a boolean value that indicates
 * whether the name is available for you to use. If true, the name is
 * available. If false, the name has already been taken or invalid and cannot
 * be used.
 * 
 * @member {string} [reason] Gets the reason that a storage account name could
 * not be used. The Reason element is only returned if NameAvailable is
 * false. Possible values for this property include: 'AccountNameInvalid',
 * 'AlreadyExists'.
 * 
 * @member {string} [message] Gets an error message explaining the Reason
 * value in more detail.
 * 
 */
function CheckNameAvailabilityResult(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.nameAvailable !== undefined) {
      this.nameAvailable = parameters.nameAvailable;
    }
    if (parameters.reason !== undefined) {
      this.reason = parameters.reason;
    }
    if (parameters.message !== undefined) {
      this.message = parameters.message;
    }
  }    
}


/**
 * Validate the payload against the CheckNameAvailabilityResult schema
 *
 * @param {JSON} payload
 *
 */
CheckNameAvailabilityResult.prototype.serialize = function () {
  var payload = {};
  if (this['nameAvailable'] !== null && this['nameAvailable'] !== undefined) {
    if (typeof this['nameAvailable'] !== 'boolean') {
      throw new Error('this[\'nameAvailable\'] must be of type boolean.');
    }
    payload['nameAvailable'] = this['nameAvailable'];
  }

  if (this['reason'] !== null && this['reason'] !== undefined) {
    var allowedValues = [ 'AccountNameInvalid', 'AlreadyExists' ];
    var thisreason = this['reason'];
    if (!allowedValues.some( function(item) { return item === thisreason; })) {
      throw new Error(this['reason'] + ' is not a valid value. The valid values are: ' + allowedValues);
    }
    payload['reason'] = this['reason'];
  }

  if (this['message'] !== null && this['message'] !== undefined) {
    if (typeof this['message'].valueOf() !== 'string') {
      throw new Error('this[\'message\'] must be of type string.');
    }
    payload['message'] = this['message'];
  }

  return payload;
};

/**
 * Deserialize the instance to CheckNameAvailabilityResult schema
 *
 * @param {JSON} instance
 *
 */
CheckNameAvailabilityResult.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['nameAvailable'] !== undefined) {
      this['nameAvailable'] = instance['nameAvailable'];
    }

    if (instance['reason'] !== undefined) {
      this['reason'] = instance['reason'];
    }

    if (instance['message'] !== undefined) {
      this['message'] = instance['message'];
    }
  }

  return this;
};

module.exports = CheckNameAvailabilityResult;
