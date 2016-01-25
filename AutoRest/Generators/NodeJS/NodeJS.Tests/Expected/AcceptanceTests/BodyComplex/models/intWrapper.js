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

/**
 * @class
 * Initializes a new instance of the IntWrapper class.
 * @constructor
 * @member {number} [field1]
 * 
 * @member {number} [field2]
 * 
 */
function IntWrapper() {
}

/**
 * Defines the metadata of IntWrapper
 *
 * @returns {object} metadata of IntWrapper
 *
 */
IntWrapper.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'int-wrapper',
    type: {
      name: 'Composite',
      className: 'IntWrapper',
      modelProperties: {
        field1: {
          required: false,
          serializedName: 'field1',
          type: {
            name: 'Number'
          }
        },
        field2: {
          required: false,
          serializedName: 'field2',
          type: {
            name: 'Number'
          }
        }
      }
    }
  };
};

module.exports = IntWrapper;
