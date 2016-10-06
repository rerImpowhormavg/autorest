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

var util = require('util');
var msRest = require('ms-rest');
var WebResource = msRest.WebResource;

/**
 * @class
 * Paths
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestParameterizedCustomHostTestClient.
 * Initializes a new instance of the Paths class.
 * @constructor
 *
 * @param {AutoRestParameterizedCustomHostTestClient} client Reference to the service client.
 */
function Paths(client) {
  this.client = client;
}

/**
 * Get a 200 to test a valid base uri
 *
 * @param {string} vault The vault name, e.g. https://myvault
 * 
 * @param {string} secret Secret value.
 * 
 * @param {string} keyName The key name with value 'key1'.
 * 
 * @param {object} [options] Optional Parameters.
 * 
 * @param {string} [options.keyVersion] The key version. Default value 'v1'.
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
 *                      {null} [result]   - The deserialized result object.
 *
 *                      {object} [request]  - The HTTP Request object if an error did not occur.
 *
 *                      {stream} [response] - The HTTP Response stream if an error did not occur.
 */
Paths.prototype.getEmpty = function (vault, secret, keyName, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  var keyVersion = (options && options.keyVersion !== undefined) ? options.keyVersion : 'v1';
  // Validate
  try {
    if (vault === null || vault === undefined || typeof vault.valueOf() !== 'string') {
      throw new Error('vault cannot be null or undefined and it must be of type string.');
    }
    if (secret === null || secret === undefined || typeof secret.valueOf() !== 'string') {
      throw new Error('secret cannot be null or undefined and it must be of type string.');
    }
    if (this.client.dnsSuffix === null || this.client.dnsSuffix === undefined || typeof this.client.dnsSuffix.valueOf() !== 'string') {
      throw new Error('this.client.dnsSuffix cannot be null or undefined and it must be of type string.');
    }
    if (keyName === null || keyName === undefined || typeof keyName.valueOf() !== 'string') {
      throw new Error('keyName cannot be null or undefined and it must be of type string.');
    }
    if (this.client.subscriptionId === null || this.client.subscriptionId === undefined || typeof this.client.subscriptionId.valueOf() !== 'string') {
      throw new Error('this.client.subscriptionId cannot be null or undefined and it must be of type string.');
    }
    if (keyVersion !== null && keyVersion !== undefined && typeof keyVersion.valueOf() !== 'string') {
      throw new Error('keyVersion must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var baseUrl = this.client.baseUri;
  var requestUrl = baseUrl + (baseUrl.endsWith('/') ? '' : '/') + 'customuri/{subscriptionId}/{keyName}';
  requestUrl = requestUrl.replace('{vault}', vault);
  requestUrl = requestUrl.replace('{secret}', secret);
  requestUrl = requestUrl.replace('{dnsSuffix}', this.client.dnsSuffix);
  requestUrl = requestUrl.replace('{keyName}', encodeURIComponent(keyName));
  requestUrl = requestUrl.replace('{subscriptionId}', encodeURIComponent(this.client.subscriptionId));
  var queryParameters = [];
  if (keyVersion !== null && keyVersion !== undefined) {
    queryParameters.push('keyVersion=' + encodeURIComponent(keyVersion));
  }
  if (queryParameters.length > 0) {
    requestUrl += '?' + queryParameters.join('&');
  }

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
  // Send Request
  return client.pipeline(httpRequest, function (err, response, responseBody) {
    if (err) {
      return callback(err);
    }
    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = msRest.stripRequest(httpRequest);
      error.response = msRest.stripResponse(response);
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        if (parsedErrorResponse) {
          if (parsedErrorResponse.error) parsedErrorResponse = parsedErrorResponse.error;
          if (parsedErrorResponse.code) error.code = parsedErrorResponse.code;
          if (parsedErrorResponse.message) error.message = parsedErrorResponse.message;
        }
        if (parsedErrorResponse !== null && parsedErrorResponse !== undefined) {
          var resultMapper = new client.models['ErrorModel']().mapper();
          error.body = client.deserialize(resultMapper, parsedErrorResponse, 'error.body');
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody ' + 
                         '- "%s" for the default response.', defaultError.message, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = null;
    if (responseBody === '') responseBody = null;

    return callback(null, result, httpRequest, response);
  });
};


module.exports = Paths;
