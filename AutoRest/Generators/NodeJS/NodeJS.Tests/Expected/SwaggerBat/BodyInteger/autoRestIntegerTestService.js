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
 * Initializes a new instance of the AutoRestIntegerTestService class.
 * @constructor
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
function AutoRestIntegerTestService(baseUri, options) {

  if (!options) options = {};

  AutoRestIntegerTestService['super_'].call(this, null, options);
  this.baseUri = baseUri;
  if (!this.baseUri) {
    this.baseUri = 'https://localhost';
  }

  this.intModel = new operations.IntModel(this);
  this._models = models;
}

util.inherits(AutoRestIntegerTestService, ServiceClient);

module.exports = AutoRestIntegerTestService;
