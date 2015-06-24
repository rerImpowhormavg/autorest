﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

'use strict';

var should = require('should');
var http = require('http');
var util = require('util');
var assert = require('assert');
var msRest = require('ms-rest');
var _ = require('underscore')

var reportClient = require('../Expected/SwaggerBat/Report/AutoRestReportServiceForAzure');

var credentials = new msRest.TokenCredentials({
  authorizationScheme: 'Bearer',
  token: '<your token here>'
});

var clientOptions = {};
var baseUri = 'http://localhost:3000';

describe('nodejs', function () {
  
  describe('Swagger BAT coverage report', function () {
    var testClient = new reportClient(credentials, baseUri, clientOptions);
    it('should have 100% coverage for Azure', function (done) {
      testClient.getReport(function (error, result) {
        should.not.exist(error);
        //console.log('The test coverage for azure is ' + util.inspect(result.body));
        var total = _.keys(result.body).length;
        var passed = 0;
        _.keys(result.body).forEach(function(item) {
          if (result.body[item] > 0) {
            passed++;
          } else {
            console.log('No coverage for scenario: ' + item + '\n');
          }
        });
        var result = Math.floor((passed/total)*100);
        console.log('Passed: ' + passed + ', Total: ' + total + ', coverage: ' + result + '% .');
        result.should.equal(100);
        done();
      });
    });
  });
});
