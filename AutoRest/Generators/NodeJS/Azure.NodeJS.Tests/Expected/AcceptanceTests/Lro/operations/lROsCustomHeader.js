/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
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
 * LROsCustomHeader
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestLongRunningOperationTestService.
 * Initializes a new instance of the LROsCustomHeader class.
 * @constructor
 *
 * @param {AutoRestLongRunningOperationTestService} client Reference to the service client.
 */
function LROsCustomHeader(client) {
  this.client = client;
}

/**
 *
 * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required
 * message header for all requests. Long running put request, service returns
 * a 200 to the initial request, with an entity that contains
 * ProvisioningState=’Creating’. Poll the endpoint indicated in the
 * Azure-AsyncOperation header for operation status
 *
 * @param {object} [product] Product to put
 * 
 * @param {string} [product.provisioningState]
 * 
 * @param {object} [product.tags]
 * 
 * @param {string} [product.location] Resource Location
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
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
LROsCustomHeader.prototype.putAsyncRetrySucceeded = function (product, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }

  if (!callback) {
    throw new Error('callback cannot be null.');
  }

  // Send request
  this.beginPutAsyncRetrySucceeded(product, options, function (err, parsedResult, httpRequest, response){
    if (err) return callback(err);

    //if (parsedResult !== null && parsedResult !== undefined) return callback(null, parsedResult, httpRequest, response);

    var initialResult = new msRest.HttpOperationResponse();
    initialResult.request = httpRequest;
    initialResult.response = response;
    initialResult.body = response.body;
    client.getPutOrPatchOperationResult(initialResult, options, function (err, pollingResult) {
      if (err) return callback(err);
      // Create Header
      var header = new client._models['LROsCustomHeaderPutAsyncRetrySucceededHeaders'](response.headers);
      header.deserialize(response.headers);
      // Create Result
      var result = null;
      httpRequest = pollingResult.request;
      response = pollingResult.response;
      var responseBody = pollingResult.body;
      if (responseBody === '') responseBody = null;

      // Deserialize Response
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

      return callback(null, result, header, httpRequest, response);
    });
  });
};

/**
 * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required
 * message header for all requests. Long running put request, service returns
 * a 200 to the initial request, with an entity that contains
 * ProvisioningState=’Creating’. Poll the endpoint indicated in the
 * Azure-AsyncOperation header for operation status
 *
 * @param {object} [product] Product to put
 * 
 * @param {string} [product.provisioningState]
 * 
 * @param {object} [product.tags]
 * 
 * @param {string} [product.location] Resource Location
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
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
LROsCustomHeader.prototype.beginPutAsyncRetrySucceeded = function (product, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (this.client.acceptLanguage !== null && this.client.acceptLanguage !== undefined && typeof this.client.acceptLanguage.valueOf() !== 'string') {
      throw new Error('this.client.acceptLanguage must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri +
                   '//lro/customheader/putasync/retry/succeeded';
  var queryParameters = [];
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
  httpRequest.headers['x-ms-client-request-id'] = msRestAzure.generateUuid();
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
  // Serialize Request
  var requestContent = null;
  var requestModel = null;
  try {
    if (product) {
      requestModel = new client._models['Product'](product);
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
        error.body = new client._models['CloudError']();
        if (parsedErrorResponse !== null && parsedErrorResponse !== undefined) {
          error.body.deserialize(parsedErrorResponse);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Header
    var header = new client._models['LROsCustomHeaderPutAsyncRetrySucceededHeaders'](response.headers);
    header.deserialize(response.headers);
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

    return callback(null, result, header, httpRequest, response);
  });
};

/**
 *
 * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required
 * message header for all requests. Long running put request, service returns
 * a 201 to the initial request, with an entity that contains
 * ProvisioningState=’Creating’.  Polls return this value until the last poll
 * returns a ‘200’ with ProvisioningState=’Succeeded’
 *
 * @param {object} [product] Product to put
 * 
 * @param {string} [product.provisioningState]
 * 
 * @param {object} [product.tags]
 * 
 * @param {string} [product.location] Resource Location
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
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
LROsCustomHeader.prototype.put201CreatingSucceeded200 = function (product, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }

  if (!callback) {
    throw new Error('callback cannot be null.');
  }

  // Send request
  this.beginPut201CreatingSucceeded200(product, options, function (err, parsedResult, httpRequest, response){
    if (err) return callback(err);

    //if (parsedResult !== null && parsedResult !== undefined) return callback(null, parsedResult, httpRequest, response);

    var initialResult = new msRest.HttpOperationResponse();
    initialResult.request = httpRequest;
    initialResult.response = response;
    initialResult.body = response.body;
    client.getPutOrPatchOperationResult(initialResult, options, function (err, pollingResult) {
      if (err) return callback(err);
      // Create Header
      var header = null;
      // Create Result
      var result = null;
      httpRequest = pollingResult.request;
      response = pollingResult.response;
      var responseBody = pollingResult.body;
      if (responseBody === '') responseBody = null;

      // Deserialize Response
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

      return callback(null, result, header, httpRequest, response);
    });
  });
};

/**
 * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required
 * message header for all requests. Long running put request, service returns
 * a 201 to the initial request, with an entity that contains
 * ProvisioningState=’Creating’.  Polls return this value until the last poll
 * returns a ‘200’ with ProvisioningState=’Succeeded’
 *
 * @param {object} [product] Product to put
 * 
 * @param {string} [product.provisioningState]
 * 
 * @param {object} [product.tags]
 * 
 * @param {string} [product.location] Resource Location
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
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
LROsCustomHeader.prototype.beginPut201CreatingSucceeded200 = function (product, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (this.client.acceptLanguage !== null && this.client.acceptLanguage !== undefined && typeof this.client.acceptLanguage.valueOf() !== 'string') {
      throw new Error('this.client.acceptLanguage must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri +
                   '//lro/customheader/put/201/creating/succeeded/200';
  var queryParameters = [];
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
  httpRequest.headers['x-ms-client-request-id'] = msRestAzure.generateUuid();
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
  // Serialize Request
  var requestContent = null;
  var requestModel = null;
  try {
    if (product) {
      requestModel = new client._models['Product'](product);
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
    if (statusCode !== 200 && statusCode !== 201) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = new client._models['CloudError']();
        if (parsedErrorResponse !== null && parsedErrorResponse !== undefined) {
          error.body.deserialize(parsedErrorResponse);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Header
    var header = null;
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
    // Deserialize Response
    if (statusCode === 201) {
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
        var deserializationError1 = new Error(util.format('Error "%s" occurred in deserializing the responseBody - "%s"', error, responseBody));
        deserializationError1.request = httpRequest;
        deserializationError1.response = response;
        return callback(deserializationError1);
      }
    }

    return callback(null, result, header, httpRequest, response);
  });
};

/**
 *
 * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required
 * message header for all requests. Long running post request, service
 * returns a 202 to the initial request, with 'Location' and 'Retry-After'
 * headers, Polls return a 200 with a response body after success
 *
 * @param {object} [product] Product to put
 * 
 * @param {string} [product.provisioningState]
 * 
 * @param {object} [product.tags]
 * 
 * @param {string} [product.location] Resource Location
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
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
LROsCustomHeader.prototype.post202Retry200 = function (product, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }

  if (!callback) {
    throw new Error('callback cannot be null.');
  }

  // Send request
  this.beginPost202Retry200(product, options, function (err, parsedResult, httpRequest, response){
    if (err) return callback(err);

    //if (parsedResult !== null && parsedResult !== undefined) return callback(null, parsedResult, httpRequest, response);

    var initialResult = new msRest.HttpOperationResponse();
    initialResult.request = httpRequest;
    initialResult.response = response;
    initialResult.body = response.body;
    client.getPostOrDeleteOperationResult(initialResult, options, function (err, pollingResult) {
      if (err) return callback(err);
      // Create Header
      var header = new client._models['LROsCustomHeaderPost202Retry200Headers'](response.headers);
      header.deserialize(response.headers);
      // Create Result
      var result = null;
      httpRequest = pollingResult.request;
      response = pollingResult.response;
      var responseBody = pollingResult.body;
      if (responseBody === '') responseBody = null;

      // Deserialize Response

      return callback(null, result, header, httpRequest, response);
    });
  });
};

/**
 * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required
 * message header for all requests. Long running post request, service
 * returns a 202 to the initial request, with 'Location' and 'Retry-After'
 * headers, Polls return a 200 with a response body after success
 *
 * @param {object} [product] Product to put
 * 
 * @param {string} [product.provisioningState]
 * 
 * @param {object} [product.tags]
 * 
 * @param {string} [product.location] Resource Location
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
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
LROsCustomHeader.prototype.beginPost202Retry200 = function (product, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (this.client.acceptLanguage !== null && this.client.acceptLanguage !== undefined && typeof this.client.acceptLanguage.valueOf() !== 'string') {
      throw new Error('this.client.acceptLanguage must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri +
                   '//lro/customheader/post/202/retry/200';
  var queryParameters = [];
  if (queryParameters.length > 0) {
    requestUrl += '?' + queryParameters.join('&');
  }
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  httpRequest.headers['x-ms-client-request-id'] = msRestAzure.generateUuid();
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
  // Serialize Request
  var requestContent = null;
  var requestModel = null;
  try {
    if (product) {
      requestModel = new client._models['Product'](product);
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
    if (statusCode !== 202) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = new client._models['CloudError']();
        if (parsedErrorResponse !== null && parsedErrorResponse !== undefined) {
          error.body.deserialize(parsedErrorResponse);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Header
    var header = new client._models['LROsCustomHeaderPost202Retry200Headers'](response.headers);
    header.deserialize(response.headers);
    // Create Result
    var result = null;
    if (responseBody === '') responseBody = null;

    return callback(null, result, header, httpRequest, response);
  });
};

/**
 *
 * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required
 * message header for all requests. Long running post request, service
 * returns a 202 to the initial request, with an entity that contains
 * ProvisioningState=’Creating’. Poll the endpoint indicated in the
 * Azure-AsyncOperation header for operation status
 *
 * @param {object} [product] Product to put
 * 
 * @param {string} [product.provisioningState]
 * 
 * @param {object} [product.tags]
 * 
 * @param {string} [product.location] Resource Location
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
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
LROsCustomHeader.prototype.postAsyncRetrySucceeded = function (product, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }

  if (!callback) {
    throw new Error('callback cannot be null.');
  }

  // Send request
  this.beginPostAsyncRetrySucceeded(product, options, function (err, parsedResult, httpRequest, response){
    if (err) return callback(err);

    //if (parsedResult !== null && parsedResult !== undefined) return callback(null, parsedResult, httpRequest, response);

    var initialResult = new msRest.HttpOperationResponse();
    initialResult.request = httpRequest;
    initialResult.response = response;
    initialResult.body = response.body;
    client.getPostOrDeleteOperationResult(initialResult, options, function (err, pollingResult) {
      if (err) return callback(err);
      // Create Header
      var header = new client._models['LROsCustomHeaderPostAsyncRetrySucceededHeaders'](response.headers);
      header.deserialize(response.headers);
      // Create Result
      var result = null;
      httpRequest = pollingResult.request;
      response = pollingResult.response;
      var responseBody = pollingResult.body;
      if (responseBody === '') responseBody = null;

      // Deserialize Response

      return callback(null, result, header, httpRequest, response);
    });
  });
};

/**
 * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required
 * message header for all requests. Long running post request, service
 * returns a 202 to the initial request, with an entity that contains
 * ProvisioningState=’Creating’. Poll the endpoint indicated in the
 * Azure-AsyncOperation header for operation status
 *
 * @param {object} [product] Product to put
 * 
 * @param {string} [product.provisioningState]
 * 
 * @param {object} [product.tags]
 * 
 * @param {string} [product.location] Resource Location
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
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
LROsCustomHeader.prototype.beginPostAsyncRetrySucceeded = function (product, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (this.client.acceptLanguage !== null && this.client.acceptLanguage !== undefined && typeof this.client.acceptLanguage.valueOf() !== 'string') {
      throw new Error('this.client.acceptLanguage must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri +
                   '//lro/customheader/postasync/retry/succeeded';
  var queryParameters = [];
  if (queryParameters.length > 0) {
    requestUrl += '?' + queryParameters.join('&');
  }
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  httpRequest.headers['x-ms-client-request-id'] = msRestAzure.generateUuid();
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
  // Serialize Request
  var requestContent = null;
  var requestModel = null;
  try {
    if (product) {
      requestModel = new client._models['Product'](product);
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
    if (statusCode !== 202) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = new client._models['CloudError']();
        if (parsedErrorResponse !== null && parsedErrorResponse !== undefined) {
          error.body.deserialize(parsedErrorResponse);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Header
    var header = new client._models['LROsCustomHeaderPostAsyncRetrySucceededHeaders'](response.headers);
    header.deserialize(response.headers);
    // Create Result
    var result = null;
    if (responseBody === '') responseBody = null;

    return callback(null, result, header, httpRequest, response);
  });
};


module.exports = LROsCustomHeader;
