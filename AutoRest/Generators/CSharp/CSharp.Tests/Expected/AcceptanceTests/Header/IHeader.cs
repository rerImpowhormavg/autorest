// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsHeader
{
    using System;
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// Header operations.
    /// </summary>
    public partial interface IHeader
    {
        /// <summary>
        /// Send a post request with header value "User-Agent": "overwrite"
        /// </summary>
        /// <param name='userAgent'>
        /// Send a post request with header value "User-Agent": "overwrite"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamExistingKeyWithHttpMessagesAsync(string userAgent, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header value "User-Agent": "overwrite"
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseExistingKeyHeaders>> ResponseExistingKeyWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header value "Content-Type": "text/html"
        /// </summary>
        /// <param name='contentType'>
        /// Send a post request with header value "Content-Type": "text/html"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamProtectedKeyWithHttpMessagesAsync(string contentType, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header value "Content-Type": "text/html"
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseProtectedKeyHeaders>> ResponseProtectedKeyWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "positive",
        /// "value": 1 or "scenario": "negative", "value": -2
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "positive" or
        /// "negative"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values 1 or -2
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamIntegerWithHttpMessagesAsync(string scenario, int? value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header value "value": 1 or -2
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "positive" or
        /// "negative"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseIntegerHeaders>> ResponseIntegerWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "positive",
        /// "value": 105 or "scenario": "negative", "value": -2
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "positive" or
        /// "negative"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values 105 or -2
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamLongWithHttpMessagesAsync(string scenario, long? value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header value "value": 105 or -2
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "positive" or
        /// "negative"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseLongHeaders>> ResponseLongWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "positive",
        /// "value": 0.07 or "scenario": "negative", "value": -3.0
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "positive" or
        /// "negative"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values 0.07 or -3.0
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamFloatWithHttpMessagesAsync(string scenario, double? value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header value "value": 0.07 or -3.0
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "positive" or
        /// "negative"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseFloatHeaders>> ResponseFloatWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "positive",
        /// "value": 7e120 or "scenario": "negative", "value": -3.0
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "positive" or
        /// "negative"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values 7e120 or -3.0
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamDoubleWithHttpMessagesAsync(string scenario, double? value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header value "value": 7e120 or -3.0
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "positive" or
        /// "negative"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseDoubleHeaders>> ResponseDoubleWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "true",
        /// "value": true or "scenario": "false", "value": false
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "true" or
        /// "false"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values true or false
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamBoolWithHttpMessagesAsync(string scenario, bool? value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header value "value": true or false
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "true" or
        /// "false"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseBoolHeaders>> ResponseBoolWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "valid",
        /// "value": "The quick brown fox jumps over the lazy dog" or
        /// "scenario": "null", "value": null or "scenario": "empty",
        /// "value": ""
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or
        /// "null" or "empty"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values "The quick brown fox jumps
        /// over the lazy dog" or null or ""
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamStringWithHttpMessagesAsync(string scenario, string value = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header values "The quick brown fox jumps over
        /// the lazy dog" or null or ""
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or
        /// "null" or "empty"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseStringHeaders>> ResponseStringWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "valid",
        /// "value": "2010-01-01" or "scenario": "min", "value": "0001-01-01"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or "min"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values "2010-01-01" or "0001-01-01"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamDateWithHttpMessagesAsync(string scenario, DateTime? value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header values "2010-01-01" or "0001-01-01"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or "min"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseDateHeaders>> ResponseDateWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "valid",
        /// "value": "2010-01-01T12:34:56Z" or "scenario": "min", "value":
        /// "0001-01-01T00:00:00Z"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or "min"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values "2010-01-01T12:34:56Z" or
        /// "0001-01-01T00:00:00Z"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamDatetimeWithHttpMessagesAsync(string scenario, DateTime? value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header values "2010-01-01T12:34:56Z" or
        /// "0001-01-01T00:00:00Z"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or "min"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseDatetimeHeaders>> ResponseDatetimeWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "valid",
        /// "value": "Wed, 01 Jan 2010 12:34:56 GMT" or "scenario": "min",
        /// "value": "Mon, 01 Jan 0001 00:00:00 GMT"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or "min"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values "Wed, 01 Jan 2010 12:34:56
        /// GMT" or "Mon, 01 Jan 0001 00:00:00 GMT"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamDatetimeRfc1123WithHttpMessagesAsync(string scenario, DateTime? value = default(DateTime?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header values "Wed, 01 Jan 2010 12:34:56 GMT"
        /// or "Mon, 01 Jan 0001 00:00:00 GMT"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or "min"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseDatetimeRfc1123Headers>> ResponseDatetimeRfc1123WithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "valid",
        /// "value": "P123DT22H14M12.011S"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values "P123DT22H14M12.011S"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamDurationWithHttpMessagesAsync(string scenario, TimeSpan? value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header values "P123DT22H14M12.011S"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseDurationHeaders>> ResponseDurationWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "valid",
        /// "value": "啊齄丂狛狜隣郎隣兀﨩"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamByteWithHttpMessagesAsync(string scenario, byte[] value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header values "啊齄丂狛狜隣郎隣兀﨩"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseByteHeaders>> ResponseByteWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header values "scenario": "valid",
        /// "value": "GREY" or "scenario": "null", "value": null
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or
        /// "null" or "empty"
        /// </param>
        /// <param name='value'>
        /// Send a post request with header values 'GREY' . Possible values
        /// include: 'White', 'black', 'GREY'
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamEnumWithHttpMessagesAsync(string scenario, GreyscaleColors? value = default(GreyscaleColors?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header values "GREY" or null
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or
        /// "null" or "empty"
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationHeaderResponse<HeaderResponseEnumHeaders>> ResponseEnumWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0
        /// in the header of the request
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> CustomRequestIdWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
    }
}
