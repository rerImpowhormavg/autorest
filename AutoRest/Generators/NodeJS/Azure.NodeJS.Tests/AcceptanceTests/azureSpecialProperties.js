﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

'use strict';

var should = require('should');
var http = require('http');
var util = require('util');
var assert = require('assert');
var msRestAzure = require('ms-rest-Azure');

var specialsClient = require('../Expected/SwaggerBat/AzureSpecials/AutoRestAzureSpecialParametersTestClient');
var dummySubscriptionId = '1234-5678-9012-3456';
var dummyToken = 'dummy12321343423';
var credentials = new msRestAzure.SubscriptionCredentials(dummyToken, dummySubscriptionId);

var clientOptions = {};
var baseUri = 'http://localhost:3000';

describe('nodejs', function () {
  
  describe('Azure Special Properties', function () {
    var testClient = new specialsClient(credentials, dummySubscriptionId, baseUri, clientOptions);
    it('should use the default api-version when no api-version parameter is present', function (done) {
      testClient.apiVersionDefault.getMethodGlobalValid(function (error, result) {
        should.not.exist(error);
        result.response.statusCode.should.equal(200);
        testClient.apiVersionDefault.getMethodGlobalNotProvidedValid(function (error, result) {
          should.not.exist(error);
          result.response.statusCode.should.equal(200);
          testClient.apiVersionDefault.getPathGlobalValid(function (error, result) {
            should.not.exist(error);
            result.response.statusCode.should.equal(200);
            testClient.apiVersionDefault.getSwaggerGlobalValid(function (error, result) {
              should.not.exist(error);
              result.response.statusCode.should.equal(200);
              done();
            });
          });
        });
      });
    });
    
    it('should use the api-version parameter instead of the default api-version when it is present', function (done) {
      testClient.apiVersionLocal.getMethodLocalNull(null, function (error, result) {
        should.not.exist(error);
        result.response.statusCode.should.equal(200);
        testClient.apiVersionLocal.getMethodLocalValid('2.0', function (error, result) {
          should.not.exist(error);
          result.response.statusCode.should.equal(200);
          testClient.apiVersionLocal.getPathLocalValid('2.0', function (error, result) {
            should.not.exist(error);
            result.response.statusCode.should.equal(200);
            testClient.apiVersionLocal.getSwaggerLocalValid('2.0', function (error, result) {
              should.not.exist(error);
              result.response.statusCode.should.equal(200);
              done();
            });
          });
        });
      });
    });
    
    it('should use the subscriptionId from credentials by default', function (done) {
      testClient.subscriptionInCredentials.postMethodGlobalNotProvidedValid(function (error, result) {
        should.not.exist(error);
        result.response.statusCode.should.equal(200);
        testClient.subscriptionInCredentials.postMethodGlobalValid(function (error, result) {
          should.not.exist(error);
          result.response.statusCode.should.equal(200);
          testClient.subscriptionInCredentials.postPathGlobalValid(function (error, result) {
            should.not.exist(error);
            result.response.statusCode.should.equal(200);
            testClient.subscriptionInCredentials.postSwaggerGlobalValid(function (error, result) {
              should.not.exist(error);
              result.response.statusCode.should.equal(200);
              done();
            });
          });
        });
      });
    });
    
    it('should thrown when creating a client with null subscription', function (done) {
      (function () { new msRestAzure.SubscriptionCredentials(dummyToken, null); }).should.throw(/subscriptionId cannot be null/);
      (function () { new specialsClient({}, baseUri, clientOptions); }).should.throw(/Azure clients require credentials with a valid subscriptionId/);
      done();
    });
    
    it('should use the subscriptionId parameter when it is present', function (done) {
      testClient.subscriptionInMethod.postMethodLocalNull(null, function (error, result) {
        should.exist(error);
        error.message.should.match(/'subscriptionID' cannot be null/ig);
        testClient.subscriptionInMethod.postMethodLocalValid(dummySubscriptionId, function (error, result) {
          should.not.exist(error);
          result.response.statusCode.should.equal(200);
          testClient.subscriptionInMethod.postPathLocalValid(dummySubscriptionId, function (error, result) {
            should.not.exist(error);
            result.response.statusCode.should.equal(200);
            testClient.subscriptionInMethod.postSwaggerLocalValid(dummySubscriptionId, function (error, result) {
              should.not.exist(error);
              result.response.statusCode.should.equal(200);
              done();
            });
          });
        });
      });
    });
    
    it('should skip url encoding when specified for path parameters', function (done) {
      var unencodedPath = 'path1/path2/path3';
      testClient.skipUrlEncoding.getMethodPathValid(unencodedPath, function (error, result) {
        should.not.exist(error);
        result.response.statusCode.should.equal(200);
        testClient.skipUrlEncoding.getPathPathValid(unencodedPath, function (error, result) {
          should.not.exist(error);
          result.response.statusCode.should.equal(200);
          testClient.skipUrlEncoding.getSwaggerPathValid(unencodedPath, function (error, result) {
            should.not.exist(error);
            result.response.statusCode.should.equal(200);
            done();
          });
        });
      });
    });

    it('should skip url encoding when specified for query parameters', function (done) {
      var unencodedQuery = 'value1&q2=value2&q3=value3';
      testClient.skipUrlEncoding.getMethodQueryValid(unencodedQuery, function (error, result) {
        should.not.exist(error);
        result.response.statusCode.should.equal(200);
        testClient.skipUrlEncoding.getPathQueryValid(unencodedQuery, function (error, result) {
          should.not.exist(error);
          result.response.statusCode.should.equal(200);
          testClient.skipUrlEncoding.getSwaggerQueryValid(unencodedQuery, function (error, result) {
            should.not.exist(error);
            result.response.statusCode.should.equal(200);
            testClient.skipUrlEncoding.getMethodQueryNull(null, function (error, result) {
              should.not.exist(error);
              result.response.statusCode.should.equal(200);
              done();
            });
          });
        });
      });
    });

    it('should overwrite x-ms-client-request-id', function (done) {
      var validClientId = '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0';
      testClient.xMsClientRequestId.paramGet(validClientId, function (error, result) {
        should.not.exist(error);
        result.response.statusCode.should.equal(200);
        var options = {
          customHeaders: {
            'x-ms-client-request-id': validClientId
          }
        }; 
        testClient.xMsClientRequestId.get(options, function (error, result) {
          should.not.exist(error);
          result.response.statusCode.should.equal(200);
          done();
        });
      });
    });

  });
});