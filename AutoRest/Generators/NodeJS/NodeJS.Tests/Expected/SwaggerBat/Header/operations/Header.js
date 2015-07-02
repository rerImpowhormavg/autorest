
'use strict';

var util = require('util');
var msRest = require('ms-rest');
var ServiceClient = msRest.ServiceClient;
var WebResource = msRest.WebResource;

var models = require('../models');

/**
 * @class
 * Header
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestSwaggerBATHeaderService.
 * Initializes a new instance of the Header class.
 * @constructor
 *
 * @param {AutoRestSwaggerBATHeaderService} client Reference to the service client.
 */
function Header(client) {
  this.client = client;
}

/**
 * Send a post request with header value "User-Agent": "overwrite"
 * @param {String} [userAgent] Send a post request with header value "User-Agent": "overwrite"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramExistingKey = function (userAgent, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (userAgent === null || userAgent === undefined) {
      throw new Error('\'userAgent\' cannot be null');
    }
    if (userAgent !== null && userAgent !== undefined && typeof userAgent !== 'string') {
      throw new Error('userAgent must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/existingkey';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (userAgent !== null) {
    httpRequest.headers['User-Agent'] = userAgent;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header value "User-Agent": "overwrite"
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseExistingKey = function (callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/existingkey';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header value "Content-Type": "text/html"
 * @param {String} [contentType] Send a post request with header value "Content-Type": "text/html"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramProtectedKey = function (contentType, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (contentType === null || contentType === undefined) {
      throw new Error('\'contentType\' cannot be null');
    }
    if (contentType !== null && contentType !== undefined && typeof contentType !== 'string') {
      throw new Error('contentType must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/protectedkey';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (contentType !== null) {
    httpRequest.headers['Content-Type'] = contentType;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header value "Content-Type": "text/html"
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseProtectedKey = function (callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/protectedkey';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header values "scenario": "positive", "value": 1
 * or "scenario": "negative", "value": -2
 * @param {String} [scenario] Send a post request with header values "scenario": "positive" or "negative"
 *
 * @param {Number} [value] Send a post request with header values 1 or -2
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramInteger = function (scenario, value, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
    if (value === null || value === undefined) {
      throw new Error('\'value\' cannot be null');
    }
    if (value !== null && value !== undefined && typeof value !== 'number') {
      throw new Error('value must be of type number.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/prim/integer';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
  }
  if (value !== null) {
    httpRequest.headers['value'] = value.toString();
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header value "value": 1 or -2
 * @param {String} [scenario] Send a post request with header values "scenario": "positive" or "negative"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseInteger = function (scenario, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/prim/integer';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header values "scenario": "positive", "value": 105
 * or "scenario": "negative", "value": -2
 * @param {String} [scenario] Send a post request with header values "scenario": "positive" or "negative"
 *
 * @param {Number} [value] Send a post request with header values 105 or -2
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramLong = function (scenario, value, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
    if (value === null || value === undefined) {
      throw new Error('\'value\' cannot be null');
    }
    if (value !== null && value !== undefined && typeof value !== 'number') {
      throw new Error('value must be of type number.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/prim/long';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
  }
  if (value !== null) {
    httpRequest.headers['value'] = value.toString();
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header value "value": 105 or -2
 * @param {String} [scenario] Send a post request with header values "scenario": "positive" or "negative"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseLong = function (scenario, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/prim/long';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header values "scenario": "positive", "value":
 * 0.07 or "scenario": "negative", "value": -3.0
 * @param {String} [scenario] Send a post request with header values "scenario": "positive" or "negative"
 *
 * @param {Number} [value] Send a post request with header values 0.07 or -3.0
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramFloat = function (scenario, value, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
    if (value === null || value === undefined) {
      throw new Error('\'value\' cannot be null');
    }
    if (value !== null && value !== undefined && typeof value !== 'number') {
      throw new Error('value must be of type number.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/prim/float';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
  }
  if (value !== null) {
    httpRequest.headers['value'] = value.toString();
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header value "value": 0.07 or -3.0
 * @param {String} [scenario] Send a post request with header values "scenario": "positive" or "negative"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseFloat = function (scenario, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/prim/float';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header values "scenario": "positive", "value":
 * 7e120 or "scenario": "negative", "value": -3.0
 * @param {String} [scenario] Send a post request with header values "scenario": "positive" or "negative"
 *
 * @param {Number} [value] Send a post request with header values 7e120 or -3.0
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramDouble = function (scenario, value, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
    if (value === null || value === undefined) {
      throw new Error('\'value\' cannot be null');
    }
    if (value !== null && value !== undefined && typeof value !== 'number') {
      throw new Error('value must be of type number.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/prim/double';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
  }
  if (value !== null) {
    httpRequest.headers['value'] = value.toString();
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header value "value": 7e120 or -3.0
 * @param {String} [scenario] Send a post request with header values "scenario": "positive" or "negative"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseDouble = function (scenario, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/prim/double';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header values "scenario": "true", "value": true or
 * "scenario": "false", "value": false
 * @param {String} [scenario] Send a post request with header values "scenario": "true" or "false"
 *
 * @param {Boolean} [value] Send a post request with header values true or false
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramBool = function (scenario, value, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
    if (value === null || value === undefined) {
      throw new Error('\'value\' cannot be null');
    }
    if (value !== null && value !== undefined && typeof value !== 'boolean') {
      throw new Error('value must be of type boolean.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/prim/bool';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
  }
  if (value !== null) {
    httpRequest.headers['value'] = value.toString();
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header value "value": true or false
 * @param {String} [scenario] Send a post request with header values "scenario": "true" or "false"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseBool = function (scenario, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/prim/bool';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header values "scenario": "valid", "value": "The
 * quick brown fox jumps over the lazy dog" or "scenario": "null", "value":
 * null or "scenario": "empty", "value": ""
 * @param {String} [scenario] Send a post request with header values "scenario": "valid" or "null" or "empty"
 *
 * @param {String} [value] Send a post request with header values "The quick brown fox jumps over the lazy dog" or null or ""
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramString = function (scenario, value, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
    if (value !== null && value !== undefined && typeof value !== 'string') {
      throw new Error('value must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/prim/string';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
  }
  if (value !== null) {
    httpRequest.headers['value'] = value;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header values "The quick brown fox jumps over the lazy
 * dog" or null or ""
 * @param {String} [scenario] Send a post request with header values "scenario": "valid" or "null" or "empty"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseString = function (scenario, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/prim/string';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header values "scenario": "valid", "value":
 * "2010-01-01" or "scenario": "min", "value": "0001-01-01"
 * @param {String} [scenario] Send a post request with header values "scenario": "valid" or "min"
 *
 * @param {Date} [value] Send a post request with header values "2010-01-01" or "0001-01-01"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramDate = function (scenario, value, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
    if (value === null || value === undefined) {
      throw new Error('\'value\' cannot be null');
    }
    if (value !== null && value !== undefined && 
        !(value instanceof Date || 
          (typeof value === 'string' && !isNaN(Date.parse(value))))) {
      throw new Error('value must be of type date.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/prim/date';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
  }
  if (value !== null) {
    httpRequest.headers['value'] = msRest.serializeObject(value).replace(/[Tt].*[Zz]/, '');
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header values "2010-01-01" or "0001-01-01"
 * @param {String} [scenario] Send a post request with header values "scenario": "valid" or "min"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseDate = function (scenario, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/prim/date';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header values "scenario": "valid", "value":
 * "2010-01-01T12:34:56Z" or "scenario": "min", "value":
 * "0001-01-01T00:00:00Z"
 * @param {String} [scenario] Send a post request with header values "scenario": "valid" or "min"
 *
 * @param {Date} [value] Send a post request with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramDatetime = function (scenario, value, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
    if (value === null || value === undefined) {
      throw new Error('\'value\' cannot be null');
    }
    if (value !== null && value !== undefined && 
        !(value instanceof Date || 
          (typeof value === 'string' && !isNaN(Date.parse(value))))) {
      throw new Error('value must be of type date.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/prim/datetime';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
  }
  if (value !== null) {
    httpRequest.headers['value'] = msRest.serializeObject(value);
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header values "2010-01-01T12:34:56Z" or
 * "0001-01-01T00:00:00Z"
 * @param {String} [scenario] Send a post request with header values "scenario": "valid" or "min"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseDatetime = function (scenario, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/prim/datetime';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header values "scenario": "valid", "value":
 * "啊齄丂狛狜隣郎隣兀﨩"
 * @param {String} [scenario] Send a post request with header values "scenario": "valid"
 *
 * @param {Buffer} [value] Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramByte = function (scenario, value, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
    if (value === null || value === undefined) {
      throw new Error('\'value\' cannot be null');
    }
    if (value !== null && value !== undefined && !Buffer.isBuffer(value)) {
      throw new Error('value must be of type buffer.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/prim/byte';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
  }
  if (value !== null) {
    httpRequest.headers['value'] = msRest.serializeObject(value);
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header values "啊齄丂狛狜隣郎隣兀﨩"
 * @param {String} [scenario] Send a post request with header values "scenario": "valid"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseByte = function (scenario, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/prim/byte';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send a post request with header values "scenario": "valid", "value": "GREY"
 * or "scenario": "null", "value": null
 * @param {String} [scenario] Send a post request with header values "scenario": "valid" or "null" or "empty"
 *
 * @param {GreyscaleColors} [value] Send a post request with header values 'GREY' . Possible values for this parameter include: 'White', 'black', 'GREY'
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.paramEnum = function (scenario, value, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
    if (value !== null && value !== undefined) {
      var allowedValues = [ 'White', 'black', 'GREY' ];
      if (!allowedValues.some( function(item) { return item === value; })) {
        throw new Error(value + ' is not a valid value. The valid values are: ' + allowedValues);
      }
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/param/prim/enum';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
  }
  if (value !== null) {
    httpRequest.headers['value'] = value.toString();
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Get a response with header values "GREY" or null
 * @param {String} [scenario] Send a post request with header values "scenario": "valid" or "null" or "empty"
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.responseEnum = function (scenario, callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (scenario === null || scenario === undefined) {
      throw new Error('\'scenario\' cannot be null');
    }
    if (scenario !== null && scenario !== undefined && typeof scenario !== 'string') {
      throw new Error('scenario must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/response/prim/enum';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if (scenario !== null) {
    httpRequest.headers['scenario'] = scenario;
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the
 * header of the request
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Header.prototype.customRequestId = function (callback) {
  var client = this.client;
  if (!callback) {
    throw new Error('callback cannot be null.');
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//header/custom/x-ms-client-request-id/9C4D50EE-2D56-4CD3-8152-34347DC9F2B0';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
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
        error.body = parsedErrorResponse;
          if (error.body !== null && error.body !== undefined) {
            error.body = client._models['ErrorModel'].deserialize(error.body);
          }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};


module.exports = Header;
