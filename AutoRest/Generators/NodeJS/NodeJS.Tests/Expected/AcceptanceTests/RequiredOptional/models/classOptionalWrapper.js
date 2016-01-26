/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var models = require('./index');

/**
 * @class
 * Initializes a new instance of the ClassOptionalWrapper class.
 * @constructor
 * @member {object} [value]
 * 
 * @member {number} [value.id]
 * 
 * @member {string} [value.name]
 * 
 */
function ClassOptionalWrapper() {
}

/**
 * Defines the metadata of ClassOptionalWrapper
 *
 * @returns {object} metadata of ClassOptionalWrapper
 *
 */
ClassOptionalWrapper.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'class-optional-wrapper',
    type: {
      name: 'Composite',
      className: 'ClassOptionalWrapper',
      modelProperties: {
        value: {
          required: false,
          serializedName: 'value',
          type: {
            name: 'Composite',
            className: 'Product'
          }
        }
      }
    }
  };
};

module.exports = ClassOptionalWrapper;
