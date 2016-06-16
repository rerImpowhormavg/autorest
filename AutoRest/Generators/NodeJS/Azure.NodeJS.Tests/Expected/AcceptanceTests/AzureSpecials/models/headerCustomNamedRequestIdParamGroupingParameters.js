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
 * Initializes a new instance of the HeaderCustomNamedRequestIdParamGroupingParameters class.
 * @constructor
 * Additional parameters for the header_customNamedRequestIdParamGrouping
 * operation.
 *
 * @member {string} fooClientRequestId The fooRequestId
 * 
 */
function HeaderCustomNamedRequestIdParamGroupingParameters() {
}

/**
 * Defines the metadata of HeaderCustomNamedRequestIdParamGroupingParameters
 *
 * @returns {object} metadata of HeaderCustomNamedRequestIdParamGroupingParameters
 *
 */
HeaderCustomNamedRequestIdParamGroupingParameters.prototype.mapper = function () {
  return {
    required: false,
    type: {
      name: 'Composite',
      className: 'HeaderCustomNamedRequestIdParamGroupingParameters',
      modelProperties: {
        fooClientRequestId: {
          required: true,
          type: {
            name: 'String'
          }
        }
      }
    }
  };
};

module.exports = HeaderCustomNamedRequestIdParamGroupingParameters;
