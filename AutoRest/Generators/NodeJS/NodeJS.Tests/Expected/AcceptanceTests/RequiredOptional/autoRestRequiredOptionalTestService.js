/* jshint latedef:false */
/* jshint forin:false */
/* jshint noempty:false */

'use strict';

var util = require('util');
var msRest = require('ms-rest');
var ServiceClient = msRest.ServiceClient;
var WebResource = msRest.WebResource;

var models = require('./models');
var operations = require('./operations');

/**
 * @class
 * Initializes a new instance of the AutoRestRequiredOptionalTestService class.
 * @constructor
 *
 * @param {String} requiredGlobalPath number of items to skip
 *
 * @param {String} requiredGlobalQuery number of items to skip
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
function AutoRestRequiredOptionalTestService(requiredGlobalPath, requiredGlobalQuery, baseUri, options) {
  if (requiredGlobalPath === null || requiredGlobalPath === undefined) {
    throw new Error('\'requiredGlobalPath\' cannot be null.');
  }
  if (requiredGlobalQuery === null || requiredGlobalQuery === undefined) {
    throw new Error('\'requiredGlobalQuery\' cannot be null.');
  }

  if (!options) options = {};

  AutoRestRequiredOptionalTestService['super_'].call(this, null, options);
  this.baseUri = baseUri;
  if (!this.baseUri) {
    this.baseUri = 'http://localhost';
  }
  this.requiredGlobalPath = requiredGlobalPath;
  this.requiredGlobalQuery = requiredGlobalQuery;

  this.implicit = new operations.Implicit(this);
  this.explicit = new operations.Explicit(this);
  this._models = models;
}

util.inherits(AutoRestRequiredOptionalTestService, ServiceClient);

module.exports = AutoRestRequiredOptionalTestService;
