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
 * Initializes a new instance of the CustomDomain class.
 * @constructor
 * The custom domain assigned to this storage account. This can be set via
 * Update.
 * @member {string} [name] Gets or sets the custom domain name. Name is the CNAME source.
 *
 * @member {boolean} [useSubDomain] Indicates whether indirect CName validation is enabled. Default value is false. This should only be set on updates
 *
 */
function CustomDomain(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters['name'] !== null && parameters['name'] !== undefined) {
      this['name'] = parameters['name'];
    }
    if (parameters['useSubDomain'] !== null && parameters['useSubDomain'] !== undefined) {
      this['useSubDomain'] = parameters['useSubDomain'];
    }
  }    
}


/**
 * Validate the payload against the CustomDomain schema
 *
 * @param {JSON} payload
 *
 */
CustomDomain.prototype.serialize = function () {
  var payload = {};
  if (this['name'] !== null && this['name'] !== undefined && typeof this['name'].valueOf() !== 'string') {
    throw new Error('this[\'name\'] must be of type string.');
  }

  if (this['useSubDomain'] !== null && this['useSubDomain'] !== undefined && typeof this['useSubDomain'] !== 'boolean') {
    throw new Error('this[\'useSubDomain\'] must be of type boolean.');
  }
};

/**
 * Deserialize the instance to CustomDomain schema
 *
 * @param {JSON} instance
 *
 */
CustomDomain.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance.name !== null && instance.name !== undefined) {
      this.name = instance.name;
    }

    if (instance.useSubDomain !== null && instance.useSubDomain !== undefined) {
      this.useSubDomain = instance.useSubDomain;
    }
  }
  return instance;
};

module.exports = CustomDomain;
