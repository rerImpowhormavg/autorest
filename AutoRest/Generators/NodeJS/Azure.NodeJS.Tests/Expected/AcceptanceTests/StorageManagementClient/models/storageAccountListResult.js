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

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the StorageAccountListResult class.
 * @constructor
 * The list storage accounts operation response.
 * @member {array} [value] Gets the list of storage accounts and their properties.
 *
 */
function StorageAccountListResult(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.value !== null && parameters.value !== undefined) {
      var initializedArray = [];
      parameters.value.forEach(function(element) {
        if (element !== null && element !== undefined) {
          element = new models['StorageAccount'](element);
        }
        initializedArray.push(element);
      });
      this.value = initializedArray;
    }
  }    
}


/**
 * Validate the payload against the StorageAccountListResult schema
 *
 * @param {JSON} payload
 *
 */
StorageAccountListResult.prototype.serialize = function () {
  var payload = {};
  if (util.isArray(this['value'])) {
    for (var i = 0; i < this['value'].length; i++) {
      if (this['value'][i]) {
        payload['value'][i] = this['value'][i].serialize();
      }
    }
  }
};

/**
 * Deserialize the instance to StorageAccountListResult schema
 *
 * @param {JSON} instance
 *
 */
StorageAccountListResult.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance.value !== null && instance.value !== undefined) {
      var deserializedArray = [];
      instance.value.forEach(function(element1) {
        if (element1 !== null && element1 !== undefined) {
          element1 = new models['StorageAccount']().deserialize(element1);
        }
        deserializedArray.push(element1);
      });
      this.value = deserializedArray;
    }
  }
};

module.exports = StorageAccountListResult;
