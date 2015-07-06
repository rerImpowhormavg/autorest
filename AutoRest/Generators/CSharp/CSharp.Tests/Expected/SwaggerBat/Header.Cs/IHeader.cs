namespace Fixtures.SwaggerBatHeader
{
    using System;
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// Test Infrastructure for AutoRest
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamExistingKeyWithHttpMessagesAsync(string userAgent, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header value "User-Agent": "overwrite"
        /// </summary>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseExistingKeyWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send a post request with header value "Content-Type": "text/html"
        /// </summary>
        /// <param name='contentType'>
        /// Send a post request with header value "Content-Type": "text/html"
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamProtectedKeyWithHttpMessagesAsync(string contentType, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header value "Content-Type": "text/html"
        /// </summary>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseProtectedKeyWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseIntegerWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseLongWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseFloatWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseDoubleWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseBoolWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseStringWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamDateWithHttpMessagesAsync(string scenario, DateTime? value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header values "2010-01-01" or "0001-01-01"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid" or "min"
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseDateWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseDatetimeWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ParamByteWithHttpMessagesAsync(string scenario, byte[] value, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a response with header values "啊齄丂狛狜隣郎隣兀﨩"
        /// </summary>
        /// <param name='scenario'>
        /// Send a post request with header values "scenario": "valid"
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseByteWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
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
        /// for this parameter include: 'White', 'black', 'GREY'
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
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
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ResponseEnumWithHttpMessagesAsync(string scenario, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0
        /// in the header of the request
        /// </summary>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> CustomRequestIdWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
    }
}
