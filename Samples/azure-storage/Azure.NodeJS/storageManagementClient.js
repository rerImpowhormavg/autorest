/*
 */

/* jshint latedef:false */
/* jshint forin:false */
/* jshint noempty:false */

'use strict';

var util = require('util');
var msRest = require('ms-rest');
var msRestAzure = require('ms-rest-azure');
var ServiceClient = msRestAzure.AzureServiceClient;

var models = require('./models');
var operations = require('./operations');

/**
 * @class
 * Initializes a new instance of the StorageManagementClient class.
 * @constructor
 *
 * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
 *
 * @param {string} subscriptionId - Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
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
 * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
 *
 * @param {string} [options.apiVersion] - Client Api Version.
 *
 * @param {string} [options.acceptLanguage] - Gets or sets the preferred language for the response.
 *
 * @param {number} [options.longRunningOperationRetryTimeout] - Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
 *
 * @param {boolean} [options.generateClientRequestId] - When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
 *
 */
function StorageManagementClient(credentials, subscriptionId, baseUri, options) {
  this.apiVersion = '2015-06-15';
  this.acceptLanguage = 'en-US';
  this.longRunningOperationRetryTimeout = 30;
  this.generateClientRequestId = true;
  if (credentials === null || credentials === undefined) {
    throw new Error('\'credentials\' cannot be null.');
  }
  if (subscriptionId === null || subscriptionId === undefined) {
    throw new Error('\'subscriptionId\' cannot be null.');
  }

  if (!options) options = {};

  StorageManagementClient['super_'].call(this, credentials, options);
  this.baseUri = baseUri;
  if (!this.baseUri) {
    this.baseUri = 'https://management.azure.com';
  }
  this.credentials = credentials;
  this.subscriptionId = subscriptionId;

  var packageInfo = this.getPackageJsonInfo(__dirname);
  this.addUserAgentInfo(util.format('%s/%s', packageInfo.name, packageInfo.version));
  if(options.apiVersion !== null && options.apiVersion !== undefined) {
    this.apiVersion = options.apiVersion;
  }
  if(options.acceptLanguage !== null && options.acceptLanguage !== undefined) {
    this.acceptLanguage = options.acceptLanguage;
  }
  if(options.longRunningOperationRetryTimeout !== null && options.longRunningOperationRetryTimeout !== undefined) {
    this.longRunningOperationRetryTimeout = options.longRunningOperationRetryTimeout;
  }
  if(options.generateClientRequestId !== null && options.generateClientRequestId !== undefined) {
    this.generateClientRequestId = options.generateClientRequestId;
  }
  this.storageAccounts = new operations.StorageAccounts(this);
  this.usageOperations = new operations.UsageOperations(this);
  this.models = models;
  msRest.addSerializationMixin(this);
}

util.inherits(StorageManagementClient, ServiceClient);

module.exports = StorageManagementClient;
