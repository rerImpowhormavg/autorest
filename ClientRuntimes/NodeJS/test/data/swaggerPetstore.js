// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

/* jshint latedef:false */
/* jshint forin:false */
/* jshint noempty:false */

// Code generated by Microsoft (R) AutoRest Code Generator 0.9.7.0
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

'use strict';

var util = require('util');
var azureCommon = require('../../lib/clientRuntime');
var ServiceClient = azureCommon.ServiceClient;
var HttpOperationResponse = azureCommon.HttpOperationResponse;
var WebResource = azureCommon.WebResource;
var Pet = require('./models/Pet');

var SwaggerPetstore = ( /** @lends SwaggerPetstore */ function() {
  /**
   * @class
   * Initializes a new instance of the SwaggerPetstore class.
   * @constructor
   * 
   * @param {string} [baseUri] The base URI of the service.
   * 
   * @param {Array} filters
   */
  function SwaggerPetstore(baseUri, credentials, filters) {
    SwaggerPetstore['super_'].call(this, credentials, filters);
    
    this.baseUri = baseUri;
    if (this.baseUri === null || this.baseUri === undefined) {
      this.baseUri = 'http://localhost:12510/api';
    }
  }
  
  util.inherits(SwaggerPetstore, ServiceClient);
  
  /**
   * Returns a pet.
   * 
   * @param {Number} id ID of pet to fetch
   * 
   * @param {function} callback
   * 
   * @returns {Stream} The response stream.
   */
  SwaggerPetstore.prototype.findPetById = function(id, callback) {
    this.findPetByIdWithOperationResponse(id, function (error, resultWithEnvelope) {
      return callback(null, resultWithEnvelope.body);
    });
  };

  /**
   * Returns a pet.
   * 
   * @param {Number} id ID of pet to fetch
   * 
   * @param {function} callback
   * 
   * @returns {Stream} The response stream.
   */
  SwaggerPetstore.prototype.findPetByIdWithOperationResponse = function(id, callback) {
    if (callback === null || callback === undefined) {
      throw new Error('callback cannot be null.');
    }
    // Validate
    if (id === null || id === undefined) {
      return callback(new Error('id cannot be null.'));
    }
    
    // Tracing
    
    // Construct URL
    var url2 = '';
    url2 = url2 + '/pets/';
    url2 = url2 + encodeURIComponent(id.toString());
    var baseUrl = this.baseUri;
    // Trim '/' character from the end of baseUrl and beginning of url.
    if (baseUrl[baseUrl.length - 1] === '/') {
      baseUrl = baseUrl.substring(0, (baseUrl.length - 1) + 0);
    }
    if (url2[0] === '/') {
      url2 = url2.substring(1);
    }
    url2 = baseUrl + '/' + url2;
    url2 = url2.replace(' ', '%20');
    
    // Create HTTP transport objects
    var httpRequest = new WebResource();
    httpRequest.method = 'GET';
    httpRequest.headers = {};
    httpRequest.url = url2;
    
    // Send Request
    return this.pipeline(httpRequest, function (err, response, body) {
      if (err !== null && err !== undefined) {
        return callback(err);
      }
      var statusCode = response.statusCode;
      var responseContent = body;

      if (statusCode !== 200) {
        var errorModel = {};
        var responseDoc = null;
        if (responseContent) {
          responseDoc = JSON.parse(responseContent);
        }
        if (responseDoc !== null) {
          errorModel.deserializeJsonSync(responseDoc);
        }
        var error = new Error(responseContent);
        error.statusCode = response.statusCode;
        return callback(error);
      }
      
      // Create Result
      var result = new HttpOperationResponse(httpRequest, response);

      // Deserialize Response
      if (statusCode === 200) {
        var resultModel = new Pet();
        var responseDoc = null;
        if (responseContent) {
          responseDoc = JSON.parse(responseContent);
        }
        if (responseDoc !== null) {
          result.body = resultModel.deserializeJsonSync(responseDoc);
        }
      }

      return callback(null, result);
    });
  };
  
  return SwaggerPetstore;
})();
exports.SwaggerPetstore = SwaggerPetstore;
