/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

/* jshint latedef:false */
/* jshint forin:false */
/* jshint noempty:false */

'use strict';

var util = require('util');
var msRest = require('ms-rest');
var ServiceClient = msRest.ServiceClient;
var WebResource = msRest.WebResource;

var models = require('./models');

/**
 * @class
 * Initializes a new instance of the AutoRestValidationTest class.
 * @constructor
 *
 * @param {String} subscriptionId Subscription ID.
 *
 * @param {String} apiVersion Required string following pattern \d{2}-\d{2}-\d{4}
 *
 * @param {string} [baseUri] - The base URI of the service.
 *
 * @param {object} [options] - The parameter options
 *
 * @param {Array} [options.filters] - Filters to be added to the request pipeline
 *
 * @param {object} [options.requestOptions] - Options for the underlying request object
 * {@link https://github.com/request/request#requestoptions-callback Options doc}
 *
 * @param {bool} [options.noRetryPolicy] - If set to true, turn off default retry policy
 */
function AutoRestValidationTest(subscriptionId, apiVersion, baseUri, options) {
  if (subscriptionId === null || subscriptionId === undefined) {
    throw new Error('\'subscriptionId\' cannot be null.');
  }
  if (apiVersion === null || apiVersion === undefined) {
    throw new Error('\'apiVersion\' cannot be null.');
  }

  if (!options) options = {};

  AutoRestValidationTest['super_'].call(this, null, options);
  this.baseUri = baseUri;
  if (!this.baseUri) {
    this.baseUri = 'http://localhost';
  }
  this.subscriptionId = subscriptionId;
  this.apiVersion = apiVersion;

  this._models = models;
}

util.inherits(AutoRestValidationTest, ServiceClient);

/**
 * Validates input parameters on the method. See swagger for details.
 *
 * @param {string} resourceGroupName Required string between 3 and 10 chars
 * with pattern [a-zA-Z0-9]+.
 * 
 * @param {number} id Required int multiple of 10 from 100 to 1000.
 * 
 * @param {object} [options] Optional Parameters.
 * 
 * @param {object} [options.customHeaders] Headers that will be added to the
 * request
 * 
 * @param {function} callback
 *
 * @returns {function} callback(err, result, request, response)
 *
 *                      {Error}  err        - The Error object if an error occurred, null otherwise.
 *
 *                      {object} [result]   - The deserialized result object.
 *                      See {@link Product} for more information.
 *
 *                      {object} [request]  - The HTTP Request object if an error did not occur.
 *
 *                      {stream} [response] - The HTTP Response stream if an error did not occur.
 */
AutoRestValidationTest.prototype.validationOfMethodParameters = function (resourceGroupName, id, options, callback) {
  var client = this;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (this.subscriptionId === null || this.subscriptionId === undefined || typeof this.subscriptionId.valueOf() !== 'string') {
      throw new Error('this.subscriptionId cannot be null or undefined and it must be of type string.');
    }
    if (resourceGroupName === null || resourceGroupName === undefined || typeof resourceGroupName.valueOf() !== 'string') {
      throw new Error('resourceGroupName cannot be null or undefined and it must be of type string.');
    }
    if (resourceGroupName !== null && resourceGroupName !== undefined) {
      if (resourceGroupName.length > 10)
      {
        throw new Error('"resourceGroupName" should satisfy the constraint - "MaxLength": 10');
      }
      if (resourceGroupName.length < 3)
      {
        throw new Error('"resourceGroupName" should satisfy the constraint - "MinLength": 3');
      }
      if (resourceGroupName.match(/[a-zA-Z0-9]+/) === null)
      {
        throw new Error('"resourceGroupName" should satisfy the constraint - "Pattern": /[a-zA-Z0-9]+/');
      }
    }
    if (id === null || id === undefined || typeof id !== 'number') {
      throw new Error('id cannot be null or undefined and it must be of type number.');
    }
    if (id !== null && id !== undefined) {
      if (id > 1000)
      {
        throw new Error('"id" should satisfy the constraint - "InclusiveMaximum": 1000');
      }
      if (id < 100)
      {
        throw new Error('"id" should satisfy the constraint - "InclusiveMinimum": 100');
      }
      if (id % 10 !== 0)
      {
        throw new Error('"id" should satisfy the constraint - "MultipleOf": 10');
      }
    }
    if (this.apiVersion === null || this.apiVersion === undefined || typeof this.apiVersion.valueOf() !== 'string') {
      throw new Error('this.apiVersion cannot be null or undefined and it must be of type string.');
    }
    if (this.apiVersion !== null && this.apiVersion !== undefined) {
      if (this.apiVersion.match(/\d{2}-\d{2}-\d{4}/) === null)
      {
        throw new Error('"this.apiVersion" should satisfy the constraint - "Pattern": /\d{2}-\d{2}-\d{4}/');
      }
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.baseUri +
                   '//fakepath/{subscriptionId}/{resourceGroupName}/{id}';
  requestUrl = requestUrl.replace('{subscriptionId}', encodeURIComponent(this.subscriptionId));
  requestUrl = requestUrl.replace('{resourceGroupName}', encodeURIComponent(resourceGroupName));
  requestUrl = requestUrl.replace('{id}', encodeURIComponent(id.toString()));
  var queryParameters = [];
  queryParameters.push('apiVersion=' + encodeURIComponent(this.apiVersion));
  if (queryParameters.length > 0) {
    requestUrl += '?' + queryParameters.join('&');
  }
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'GET';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if(options) {
    for(var headerName in options['customHeaders']) {
      if (options['customHeaders'].hasOwnProperty(headerName)) {
        httpRequest.headers[headerName] = options['customHeaders'][headerName];
      }
    }
  }
  httpRequest.headers['Content-Type'] = 'application/json; charset=utf-8';
  httpRequest.body = null;
  httpRequest.headers['Content-Length'] = 0;
  // Send Request
  return client.pipeline(httpRequest, function (err, response, responseBody) {
    if (err) {
      return callback(err);
    }
    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = new client._models['ErrorModel']();
        if (parsedErrorResponse !== null && parsedErrorResponse !== undefined) {
          error.body.deserialize(parsedErrorResponse);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = null;
    if (responseBody === '') responseBody = null;
    // Deserialize Response
    if (statusCode === 200) {
      var parsedResponse = null;
      try {
        parsedResponse = JSON.parse(responseBody);
        result = JSON.parse(responseBody);
        if (parsedResponse) {
          result = new client._models['Product'](parsedResponse);
        }
        if (parsedResponse !== null && parsedResponse !== undefined) {
          result.deserialize(parsedResponse);
        }
      } catch (error) {
        var deserializationError = new Error(util.format('Error "%s" occurred in deserializing the responseBody - "%s"', error, responseBody));
        deserializationError.request = httpRequest;
        deserializationError.response = response;
        return callback(deserializationError);
      }
    }

    return callback(null, result, httpRequest, response);
  });
};

/**
 * Validates body parameters on the method. See swagger for details.
 *
 * @param {string} resourceGroupName Required string between 3 and 10 chars
 * with pattern [a-zA-Z0-9]+.
 * 
 * @param {number} id Required int multiple of 10 from 100 to 1000.
 * 
 * @param {object} [options] Optional Parameters.
 * 
 * @param {object} [options.body]
 * 
 * @param {array} [options.body.displayNames] Non required array of unique
 * items from 0 to 6 elements.
 * 
 * @param {number} [options.body.capacity] Non required int betwen 0 and 100
 * exclusive.
 * 
 * @param {string} [options.body.image] Image URL representing the product.
 * 
 * @param {object} [options.customHeaders] Headers that will be added to the
 * request
 * 
 * @param {function} callback
 *
 * @returns {function} callback(err, result, request, response)
 *
 *                      {Error}  err        - The Error object if an error occurred, null otherwise.
 *
 *                      {object} [result]   - The deserialized result object.
 *                      See {@link Product} for more information.
 *
 *                      {object} [request]  - The HTTP Request object if an error did not occur.
 *
 *                      {stream} [response] - The HTTP Response stream if an error did not occur.
 */
AutoRestValidationTest.prototype.validationOfBody = function (resourceGroupName, id, options, callback) {
  var client = this;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  var body = (options && options.body !== undefined) ? options.body : undefined;
  // Validate
  try {
    if (this.subscriptionId === null || this.subscriptionId === undefined || typeof this.subscriptionId.valueOf() !== 'string') {
      throw new Error('this.subscriptionId cannot be null or undefined and it must be of type string.');
    }
    if (resourceGroupName === null || resourceGroupName === undefined || typeof resourceGroupName.valueOf() !== 'string') {
      throw new Error('resourceGroupName cannot be null or undefined and it must be of type string.');
    }
    if (resourceGroupName !== null && resourceGroupName !== undefined) {
      if (resourceGroupName.length > 10)
      {
        throw new Error('"resourceGroupName" should satisfy the constraint - "MaxLength": 10');
      }
      if (resourceGroupName.length < 3)
      {
        throw new Error('"resourceGroupName" should satisfy the constraint - "MinLength": 3');
      }
      if (resourceGroupName.match(/[a-zA-Z0-9]+/) === null)
      {
        throw new Error('"resourceGroupName" should satisfy the constraint - "Pattern": /[a-zA-Z0-9]+/');
      }
    }
    if (id === null || id === undefined || typeof id !== 'number') {
      throw new Error('id cannot be null or undefined and it must be of type number.');
    }
    if (id !== null && id !== undefined) {
      if (id > 1000)
      {
        throw new Error('"id" should satisfy the constraint - "InclusiveMaximum": 1000');
      }
      if (id < 100)
      {
        throw new Error('"id" should satisfy the constraint - "InclusiveMinimum": 100');
      }
      if (id % 10 !== 0)
      {
        throw new Error('"id" should satisfy the constraint - "MultipleOf": 10');
      }
    }
    if (this.apiVersion === null || this.apiVersion === undefined || typeof this.apiVersion.valueOf() !== 'string') {
      throw new Error('this.apiVersion cannot be null or undefined and it must be of type string.');
    }
    if (this.apiVersion !== null && this.apiVersion !== undefined) {
      if (this.apiVersion.match(/\d{2}-\d{2}-\d{4}/) === null)
      {
        throw new Error('"this.apiVersion" should satisfy the constraint - "Pattern": /\d{2}-\d{2}-\d{4}/');
      }
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.baseUri +
                   '//fakepath/{subscriptionId}/{resourceGroupName}/{id}';
  requestUrl = requestUrl.replace('{subscriptionId}', encodeURIComponent(this.subscriptionId));
  requestUrl = requestUrl.replace('{resourceGroupName}', encodeURIComponent(resourceGroupName));
  requestUrl = requestUrl.replace('{id}', encodeURIComponent(id.toString()));
  var queryParameters = [];
  queryParameters.push('apiVersion=' + encodeURIComponent(this.apiVersion));
  if (queryParameters.length > 0) {
    requestUrl += '?' + queryParameters.join('&');
  }
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'PUT';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if(options) {
    for(var headerName in options['customHeaders']) {
      if (options['customHeaders'].hasOwnProperty(headerName)) {
        httpRequest.headers[headerName] = options['customHeaders'][headerName];
      }
    }
  }
  httpRequest.headers['Content-Type'] = 'application/json; charset=utf-8';
  // Serialize Request
  var requestContent = null;
  var requestModel = null;
  try {
    if (body) {
      requestModel = new client._models['Product'](body);
    }
    if (requestModel !== null && requestModel !== undefined) {
      requestContent = JSON.stringify(requestModel.serialize());
    } else {
      requestContent = JSON.stringify(requestModel);
    }
  } catch (error) {
    var serializationError = new Error(util.format('Error "%s" occurred in serializing the payload - "%s"', error, util.inspect(requestModel, {depth: null})));
    return callback(serializationError);
  }
  httpRequest.body = requestContent;
  httpRequest.headers['Content-Length'] = Buffer.isBuffer(requestContent) ? requestContent.length : Buffer.byteLength(requestContent, 'UTF8');
  // Send Request
  return client.pipeline(httpRequest, function (err, response, responseBody) {
    if (err) {
      return callback(err);
    }
    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = new client._models['ErrorModel']();
        if (parsedErrorResponse !== null && parsedErrorResponse !== undefined) {
          error.body.deserialize(parsedErrorResponse);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = null;
    if (responseBody === '') responseBody = null;
    // Deserialize Response
    if (statusCode === 200) {
      var parsedResponse = null;
      try {
        parsedResponse = JSON.parse(responseBody);
        result = JSON.parse(responseBody);
        if (parsedResponse) {
          result = new client._models['Product'](parsedResponse);
        }
        if (parsedResponse !== null && parsedResponse !== undefined) {
          result.deserialize(parsedResponse);
        }
      } catch (error) {
        var deserializationError = new Error(util.format('Error "%s" occurred in deserializing the responseBody - "%s"', error, responseBody));
        deserializationError.request = httpRequest;
        deserializationError.response = response;
        return callback(deserializationError);
      }
    }

    return callback(null, result, httpRequest, response);
  });
};

module.exports = AutoRestValidationTest;
