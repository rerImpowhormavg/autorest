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
 * Initializes a new instance of the SubProduct class.
 * @constructor
 * @member {number} [integer]
 * 
 * @member {string} [string]
 * 
 */
function SubProduct(parameters) {}


/**
 * Metadata of SubProduct
 *
 * @returns {object} metadata of the SubProduct
 *
 */
SubProduct.prototype.mapper = function () {
  return {
    type: {
      name : 'Composite',
      className: 'SubProduct',
      modelProperties: {
        subId : {
          serializedName: 'subId',
          required: true,
          type : {
            name: 'Number'
          }
        },
        subName : {
          serializedName: 'subName',
          required: true,
          type : {
            name: 'String'
          }
        },
        provisioningState : {
          serializedName: 'provisioningState',
          required: false,
          type : {
            name: 'Enum',
            allowedValues: ['Creating', 'Failed', 'Succeeded']
          }
        },
        makeTime : {
          serializedName: 'makeTime',
          required: false,
          type : {
            name: 'DateTime'
          }
        },
        invoiceInfo : {
          serializedName: 'invoiceInfo',
          required: false,
          type : {
            name: 'Composite',
            className: 'Invoice'
          }
        }
      }
    }
  };
};

module.exports = SubProduct;