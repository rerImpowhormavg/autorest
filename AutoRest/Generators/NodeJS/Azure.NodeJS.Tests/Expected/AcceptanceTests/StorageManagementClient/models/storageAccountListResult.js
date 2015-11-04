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
 * Initializes a new instance of the StorageAccountListResult class.
 * @constructor
 * The list storage accounts operation response.
 * @member {array} [value] Gets the list of storage accounts and their
 * properties.
 * 
 * @member {string} [nextLink] Gets the link to the next set of results.
 * Currently this will always be empty as the API does not support pagination.
 * 
 */
function StorageAccountListResult() {
}

util.inherits(StorageAccountListResult, Array);

/**
 * Deserialize the instance to StorageAccountListResult schema
 *
 * @param {JSON} instance
 *
 */
StorageAccountListResult.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance.value) {
      var deserializedInstancevalue = [];
        instance.value.forEach(function(element) {
        if (element) {
          element = new models['StorageAccount']().deserialize(element);
        }
        deserializedInstancevalue.push(element);
      });
      Array.prototype.push.apply(this, deserializedInstancevalue);
    }
    if (instance.nextLink !== undefined) {
      this.nextLink = instance.nextLink;
    }
  }

  return this;
};

module.exports = StorageAccountListResult;
