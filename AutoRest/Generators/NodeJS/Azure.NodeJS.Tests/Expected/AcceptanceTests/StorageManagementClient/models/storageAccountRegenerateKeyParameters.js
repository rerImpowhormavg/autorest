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

/**
 * @class
 * Initializes a new instance of the StorageAccountRegenerateKeyParameters class.
 * @constructor
 * @member {string} [keyName] Possible values for this property include:
 * 'key1', 'key2'.
 * 
 */
function StorageAccountRegenerateKeyParameters(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.keyName !== null && parameters.keyName !== undefined) {
      this.keyName = parameters.keyName;
    }
  }    
}


/**
 * Validate the payload against the StorageAccountRegenerateKeyParameters schema
 *
 * @param {JSON} payload
 *
 */
StorageAccountRegenerateKeyParameters.prototype.serialize = function () {
  var payload = {};
  if (this['keyName'] !== null && this['keyName'] !== undefined) {
    var allowedValues = [ 'key1', 'key2' ];
    if (!allowedValues.some( function(item) { return item === payload['keyName']; })) {
      throw new Error(payload['keyName'] + ' is not a valid value. The valid values are: ' + allowedValues);
    }
    payload['keyName'] = this['keyName'];
  }
};

/**
 * Deserialize the instance to StorageAccountRegenerateKeyParameters schema
 *
 * @param {JSON} instance
 *
 */
StorageAccountRegenerateKeyParameters.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance.keyName !== null && instance.keyName !== undefined) {
      this.keyName = instance.keyName;
    }
  }
};

module.exports = StorageAccountRegenerateKeyParameters;
