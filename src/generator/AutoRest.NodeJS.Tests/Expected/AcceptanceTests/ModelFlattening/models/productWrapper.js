/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the ProductWrapper class.
 * @constructor
 * The wrapped produc.
 *
 * @member {string} [value] the product value
 *
 */
function ProductWrapper() {
}

/**
 * Defines the metadata of ProductWrapper
 *
 * @returns {object} metadata of ProductWrapper
 *
 */
ProductWrapper.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'ProductWrapper',
    type: {
      name: 'Composite',
      className: 'ProductWrapper',
      modelProperties: {
        value: {
          required: false,
          serializedName: 'property.value',
          type: {
            name: 'String'
          }
        }
      }
    }
  };
};

module.exports = ProductWrapper;
