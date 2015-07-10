
'use strict';

var util = require('util');
var msRest = require('ms-rest');
var ServiceClient = msRest.ServiceClient;
var WebResource = msRest.WebResource;

var models = require('../models');

/**
 * @class
 * Files
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestSwaggerBATFileService.
 * Initializes a new instance of the Files class.
 * @constructor
 *
 * @param {AutoRestSwaggerBATFileService} client Reference to the service client.
 */
function Files(client) {
  this.client = client;
}

/**
 * Get file
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
 * request
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Files.prototype.getFile = function (options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//files/stream/nonempty';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'GET';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  httpRequest.headers['Content-Type'] = 'application/json; charset=utf-8';
  httpRequest.body = null;
  httpRequest.headers['Content-Length'] = 0;
  if(options) {
    for(var headerName in options['customHeaders']) {
      if (options['customHeaders'].hasOwnProperty(headerName)) {
        httpRequest.headers[headerName] = options['customHeaders'][headerName];
      }
    }
  }
  // Send Request
  httpRequest.streamedResponse = true;
  return client.pipeline(httpRequest, function (err, response) {
    if (err) {
      return callback(err);
    }

    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(util.format('Unexpected status code: %s', statusCode));
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      return callback(error);
    }

    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    result.body = response;
    return callback(null, result);
  });
};

/**
 * Get empty file
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
 * request
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Files.prototype.getEmptyFile = function (options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//files/stream/empty';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'GET';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  httpRequest.headers['Content-Type'] = 'application/json; charset=utf-8';
  httpRequest.body = null;
  httpRequest.headers['Content-Length'] = 0;
  if(options) {
    for(var headerName in options['customHeaders']) {
      if (options['customHeaders'].hasOwnProperty(headerName)) {
        httpRequest.headers[headerName] = options['customHeaders'][headerName];
      }
    }
  }
  // Send Request
  httpRequest.streamedResponse = true;
  return client.pipeline(httpRequest, function (err, response) {
    if (err) {
      return callback(err);
    }

    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(util.format('Unexpected status code: %s', statusCode));
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      return callback(error);
    }

    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    result.body = response;
    return callback(null, result);
  });
};


module.exports = Files;
