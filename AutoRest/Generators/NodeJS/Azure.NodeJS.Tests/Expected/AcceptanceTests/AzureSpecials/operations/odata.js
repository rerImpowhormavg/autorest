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
var msRestAzure = require('ms-rest-azure');
var WebResource = msRest.WebResource;

/**
 * @class
 * Odata
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestAzureSpecialParametersTestClient.
 * Initializes a new instance of the Odata class.
 * @constructor
 *
 * @param {AutoRestAzureSpecialParametersTestClient} client Reference to the service client.
 */
function Odata(client) {
  this.client = client;
}

/**
 * Specify filter parameter with value '$filter=id gt 5 and name eq
 * 'foo'&$orderby=id&$top=10'
 *
 * @param {object} [options] Optional Parameters.
 * 
 * @param {string} [options.filter] The filter parameter with value
 * '$filter=id gt 5 and name eq 'foo''.
 * 
 * @param {number} [options.top] The top parameter with value 10.
 * 
 * @param {string} [options.orderby] The orderby parameter with value id.
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
Odata.prototype.getWithFilter = function (options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  var filter = (options && options.filter !== undefined) ? options.filter : undefined;
  var top = (options && options.top !== undefined) ? options.top : undefined;
  var orderby = (options && options.orderby !== undefined) ? options.orderby : undefined;
  // Validate
  try {
    if (filter !== null && filter !== undefined && typeof filter.valueOf() !== 'string') {
      throw new Error('filter must be of type string.');
    }
    if (top !== null && top !== undefined && typeof top !== 'number') {
      throw new Error('top must be of type number.');
    }
    if (orderby !== null && orderby !== undefined && typeof orderby.valueOf() !== 'string') {
      throw new Error('orderby must be of type string.');
    }
    if (this.client.acceptLanguage !== null && this.client.acceptLanguage !== undefined && typeof this.client.acceptLanguage.valueOf() !== 'string') {
      throw new Error('this.client.acceptLanguage must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri +
                   '//azurespecials/odata/filter';
  var queryParameters = [];
  if (filter !== null && filter !== undefined) {
    queryParameters.push('$filter=' + encodeURIComponent(filter));
  }
  if (top !== null && top !== undefined) {
    queryParameters.push('$top=' + encodeURIComponent(top.toString()));
  }
  if (orderby !== null && orderby !== undefined) {
    queryParameters.push('$orderby=' + encodeURIComponent(orderby));
  }
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
  if (this.client.generateClientRequestId) {
      httpRequest.headers['x-ms-client-request-id'] = msRestAzure.generateUuid();
  }
  if (this.client.acceptLanguage !== undefined && this.client.acceptLanguage !== null) {
    httpRequest.headers['accept-language'] = this.client.acceptLanguage;
  }
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


module.exports = Odata;
