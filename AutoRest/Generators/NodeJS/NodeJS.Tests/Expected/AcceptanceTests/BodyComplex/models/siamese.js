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

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the Siamese class.
 * @constructor
 * @member {string} [breed]
 * 
 */
function Siamese() {
  Siamese['super_'].call(this);
}

util.inherits(Siamese, models['Cat']);

/**
 * Defines the metadata of Siamese
 *
 * @returns {object} metadata of Siamese
 *
 */
Siamese.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'siamese',
    type: {
      name: 'Composite',
      className: 'Siamese',
      modelProperties: {
        id: {
          required: false,
          serializedName: 'id',
          type: {
            name: 'Number'
          }
        },
        name: {
          required: false,
          serializedName: 'name',
          type: {
            name: 'String'
          }
        },
        color: {
          required: false,
          serializedName: 'color',
          type: {
            name: 'String'
          }
        },
        hates: {
          required: false,
          serializedName: 'hates',
          type: {
            name: 'Sequence',
            element: {
                required: false,
                serializedName: 'DogElementType',
                type: {
                  name: 'Composite',
                  className: 'Dog'
                }
            }
          }
        },
        breed: {
          required: false,
          serializedName: 'breed',
          type: {
            name: 'String'
          }
        }
      }
    }
  };
};

module.exports = Siamese;
