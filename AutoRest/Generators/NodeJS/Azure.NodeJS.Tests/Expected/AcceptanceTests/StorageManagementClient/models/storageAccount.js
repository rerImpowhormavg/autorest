/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the StorageAccount class.
 * @constructor
 * The storage account.
 * @member {string} [provisioningState] Gets the status of the storage account at the time the operation was called. Possible values for this property include: 'Creating', 'ResolvingDNS', 'Succeeded'.
 *
 * @member {string} [accountType] Gets the type of the storage account. Possible values for this property include: 'Standard_LRS', 'Standard_ZRS', 'Standard_GRS', 'Standard_RAGRS', 'Premium_LRS'.
 *
 * @member {object} [primaryEndpoints] Gets the URLs that are used to perform a retrieval of a public blob, queue or table object.Note that StandardZRS and PremiumLRS accounts only return the blob endpoint.
 *
 * @member {string} [primaryLocation] Gets the location of the primary for the storage account.
 *
 * @member {string} [statusOfPrimary] Gets the status indicating whether the primary location of the storage account is available or unavailable. Possible values for this property include: 'Available', 'Unavailable'.
 *
 * @member {date} [lastGeoFailoverTime] Gets the timestamp of the most recent instance of a failover to the secondary location. Only the most recent timestamp is retained. This element is not returned if there has never been a failover instance. Only available if the accountType is StandardGRS or StandardRAGRS.
 *
 * @member {string} [secondaryLocation] Gets the location of the geo replicated secondary for the storage account. Only available if the accountType is StandardGRS or StandardRAGRS.
 *
 * @member {string} [statusOfSecondary] Gets the status indicating whether the secondary location of the storage account is available or unavailable. Only available if the accountType is StandardGRS or StandardRAGRS. Possible values for this property include: 'Available', 'Unavailable'.
 *
 * @member {date} [creationTime] Gets the creation date and time of the storage account in UTC.
 *
 * @member {object} [customDomain] Gets the user assigned custom domain assigned to this storage account.
 *
 * @member {object} [secondaryEndpoints] Gets the URLs that are used to perform a retrieval of a public blob, queue or table object from the secondary location of the storage account. Only available if the accountType is StandardRAGRS.
 *
 */
function StorageAccount(parameters) {
  StorageAccount['super_'].call(this, parameters);
  if (parameters !== null && parameters !== undefined) {
    if (parameters.properties.provisioningState !== null && parameters.properties.provisioningState !== undefined) {
      this.provisioningState = parameters.properties.provisioningState;
    }
    if (parameters.properties.accountType !== null && parameters.properties.accountType !== undefined) {
      this.accountType = parameters.properties.accountType;
    }
    if (parameters.properties.primaryEndpoints !== null && parameters.properties.primaryEndpoints !== undefined) {
      this.primaryEndpoints = new models['Endpoints'](parameters.properties.primaryEndpoints);
    }
    if (parameters.properties.primaryLocation !== null && parameters.properties.primaryLocation !== undefined) {
      this.primaryLocation = parameters.properties.primaryLocation;
    }
    if (parameters.properties.statusOfPrimary !== null && parameters.properties.statusOfPrimary !== undefined) {
      this.statusOfPrimary = parameters.properties.statusOfPrimary;
    }
    if (parameters.properties.lastGeoFailoverTime !== null && parameters.properties.lastGeoFailoverTime !== undefined) {
      this.lastGeoFailoverTime = parameters.properties.lastGeoFailoverTime;
    }
    if (parameters.properties.secondaryLocation !== null && parameters.properties.secondaryLocation !== undefined) {
      this.secondaryLocation = parameters.properties.secondaryLocation;
    }
    if (parameters.properties.statusOfSecondary !== null && parameters.properties.statusOfSecondary !== undefined) {
      this.statusOfSecondary = parameters.properties.statusOfSecondary;
    }
    if (parameters.properties.creationTime !== null && parameters.properties.creationTime !== undefined) {
      this.creationTime = parameters.properties.creationTime;
    }
    if (parameters.properties.customDomain !== null && parameters.properties.customDomain !== undefined) {
      this.customDomain = new models['CustomDomain'](parameters.properties.customDomain);
    }
    if (parameters.properties.secondaryEndpoints !== null && parameters.properties.secondaryEndpoints !== undefined) {
      this.secondaryEndpoints = new models['Endpoints'](parameters.properties.secondaryEndpoints);
    }
  }    
}

util.inherits(StorageAccount, models['Resource']);

/**
 * Validate the payload against the StorageAccount schema
 *
 * @param {JSON} payload
 *
 */
StorageAccount.prototype.serialize = function () {
  var payload = StorageAccount['super_'].prototype.serialize.call(this);
  if (this['provisioningState'] !== null && this['provisioningState'] !== undefined) {
    var allowedValues = [ 'Creating', 'ResolvingDNS', 'Succeeded' ];
    if (!allowedValues.some( function(item) { return item === payload['properties']['provisioningState']; })) {
      throw new Error(payload['properties']['provisioningState'] + ' is not a valid value. The valid values are: ' + allowedValues);
    }
    payload['properties']['provisioningState'] = this['provisioningState'];
  }

  if (this['accountType'] !== null && this['accountType'] !== undefined) {
    var allowedValues1 = [ 'Standard_LRS', 'Standard_ZRS', 'Standard_GRS', 'Standard_RAGRS', 'Premium_LRS' ];
    if (!allowedValues1.some( function(item) { return item === payload['properties']['accountType']; })) {
      throw new Error(payload['properties']['accountType'] + ' is not a valid value. The valid values are: ' + allowedValues1);
    }
    payload['properties']['accountType'] = this['accountType'];
  }

  if (this['primaryEndpoints']) {
    payload['properties']['primaryEndpoints'] = this['primaryEndpoints'].serialize();
  }

  if (this['primaryLocation'] !== null && this['primaryLocation'] !== undefined) {
    if (typeof this['primaryLocation'].valueOf() !== 'string') {
      throw new Error('this[\'primaryLocation\'] must be of type string.');
    }
    payload['properties']['primaryLocation'] = this['primaryLocation'];
  }

  if (this['statusOfPrimary'] !== null && this['statusOfPrimary'] !== undefined) {
    var allowedValues2 = [ 'Available', 'Unavailable' ];
    if (!allowedValues2.some( function(item) { return item === payload['properties']['statusOfPrimary']; })) {
      throw new Error(payload['properties']['statusOfPrimary'] + ' is not a valid value. The valid values are: ' + allowedValues2);
    }
    payload['properties']['statusOfPrimary'] = this['statusOfPrimary'];
  }

  if (this['lastGeoFailoverTime']) {
    if (!(this['lastGeoFailoverTime'] instanceof Date || typeof this['lastGeoFailoverTime'].valueOf() === 'string' && !isNaN(Date.parse(this['lastGeoFailoverTime']))))) {
      throw new Error('this[\'lastGeoFailoverTime\'] must be of type date.');
    }
    payload['properties']['lastGeoFailoverTime'] = (this['lastGeoFailoverTime'] instanceof Date) ? this['lastGeoFailoverTime'].toISOString('base64') : this['lastGeoFailoverTime'];
  }

  if (this['secondaryLocation'] !== null && this['secondaryLocation'] !== undefined) {
    if (typeof this['secondaryLocation'].valueOf() !== 'string') {
      throw new Error('this[\'secondaryLocation\'] must be of type string.');
    }
    payload['properties']['secondaryLocation'] = this['secondaryLocation'];
  }

  if (this['statusOfSecondary'] !== null && this['statusOfSecondary'] !== undefined) {
    var allowedValues3 = [ 'Available', 'Unavailable' ];
    if (!allowedValues3.some( function(item) { return item === payload['properties']['statusOfSecondary']; })) {
      throw new Error(payload['properties']['statusOfSecondary'] + ' is not a valid value. The valid values are: ' + allowedValues3);
    }
    payload['properties']['statusOfSecondary'] = this['statusOfSecondary'];
  }

  if (this['creationTime']) {
    if (!(this['creationTime'] instanceof Date || typeof this['creationTime'].valueOf() === 'string' && !isNaN(Date.parse(this['creationTime']))))) {
      throw new Error('this[\'creationTime\'] must be of type date.');
    }
    payload['properties']['creationTime'] = (this['creationTime'] instanceof Date) ? this['creationTime'].toISOString('base64') : this['creationTime'];
  }

  if (this['customDomain']) {
    payload['properties']['customDomain'] = this['customDomain'].serialize();
  }

  if (this['secondaryEndpoints']) {
    payload['properties']['secondaryEndpoints'] = this['secondaryEndpoints'].serialize();
  }
};

/**
 * Deserialize the instance to StorageAccount schema
 *
 * @param {JSON} instance
 *
 */
StorageAccount.prototype.deserialize = function (instance) {
  StorageAccount['super_'].prototype.deserialize.call(this, instance);
  if (instance) {
    if (instance.properties.provisioningState !== null && instance.properties.provisioningState !== undefined) {
      this.provisioningState = instance.properties.provisioningState;
    }

    if (instance.properties.accountType !== null && instance.properties.accountType !== undefined) {
      this.accountType = instance.properties.accountType;
    }

    if (instance.properties.primaryEndpoints !== null && instance.properties.primaryEndpoints !== undefined) {
      this.primaryEndpoints = new models['Endpoints']().deserialize(instance.properties.primaryEndpoints);
    }

    if (instance.properties.primaryLocation !== null && instance.properties.primaryLocation !== undefined) {
      this.primaryLocation = instance.properties.primaryLocation;
    }

    if (instance.properties.statusOfPrimary !== null && instance.properties.statusOfPrimary !== undefined) {
      this.statusOfPrimary = instance.properties.statusOfPrimary;
    }

    if (instance.properties.lastGeoFailoverTime !== null && instance.properties.lastGeoFailoverTime !== undefined) {
      this.lastGeoFailoverTime = new Date(instance.properties.lastGeoFailoverTime);
    }

    if (instance.properties.secondaryLocation !== null && instance.properties.secondaryLocation !== undefined) {
      this.secondaryLocation = instance.properties.secondaryLocation;
    }

    if (instance.properties.statusOfSecondary !== null && instance.properties.statusOfSecondary !== undefined) {
      this.statusOfSecondary = instance.properties.statusOfSecondary;
    }

    if (instance.properties.creationTime !== null && instance.properties.creationTime !== undefined) {
      this.creationTime = new Date(instance.properties.creationTime);
    }

    if (instance.properties.customDomain !== null && instance.properties.customDomain !== undefined) {
      this.customDomain = new models['CustomDomain']().deserialize(instance.properties.customDomain);
    }

    if (instance.properties.secondaryEndpoints !== null && instance.properties.secondaryEndpoints !== undefined) {
      this.secondaryEndpoints = new models['Endpoints']().deserialize(instance.properties.secondaryEndpoints);
    }
  }
  return instance;
};

module.exports = StorageAccount;
