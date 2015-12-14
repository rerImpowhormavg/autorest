// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsUrl
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using System.Net;
    using System.Net.Http;
    using System.Net.Http.Headers;
    using System.Text;
    using System.Text.RegularExpressions;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Newtonsoft.Json;
    using Models;

    /// <summary>
    /// PathItems operations.
    /// </summary>
    public partial class PathItems : IServiceOperations<AutoRestUrlTestService>, IPathItems
    {
        /// <summary>
        /// Initializes a new instance of the PathItems class.
        /// </summary>
        /// <param name='client'>
        /// Reference to the service client.
        /// </param>
        public PathItems(AutoRestUrlTestService client)
        {
            if (client == null) 
            {
                throw new ArgumentNullException("client");
            }
            this.Client = client;
        }

        /// <summary>
        /// Gets a reference to the AutoRestUrlTestService
        /// </summary>
        public AutoRestUrlTestService Client { get; private set; }

        /// <summary>
        /// send globalStringPath='globalStringPath',
        /// pathItemStringPath='pathItemStringPath',
        /// localStringPath='localStringPath', globalStringQuery='globalStringQuery',
        /// pathItemStringQuery='pathItemStringQuery',
        /// localStringQuery='localStringQuery'
        /// </summary>
        /// <param name='localStringPath'>
        /// should contain value 'localStringPath'
        /// </param>
        /// <param name='pathItemStringPath'>
        /// A string value 'pathItemStringPath' that appears in the path
        /// </param>
        /// <param name='localStringQuery'>
        /// should contain value 'localStringQuery'
        /// </param>
        /// <param name='pathItemStringQuery'>
        /// A string value 'pathItemStringQuery' that appears as a query parameter
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        public async Task<HttpOperationResponse> GetAllWithValuesWithHttpMessagesAsync(string localStringPath, string pathItemStringPath, string localStringQuery = default(string), string pathItemStringQuery = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken))
        {
            if (localStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "localStringPath");
            }
            if (pathItemStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "pathItemStringPath");
            }
            if (this.Client.GlobalStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "this.Client.GlobalStringPath");
            }
            // Tracing
            bool _shouldTrace = ServiceClientTracing.IsEnabled;
            string _invocationId = null;
            if (_shouldTrace)
            {
                _invocationId = ServiceClientTracing.NextInvocationId.ToString();
                Dictionary<string, object> tracingParameters = new Dictionary<string, object>();
                tracingParameters.Add("localStringPath", localStringPath);
                tracingParameters.Add("localStringQuery", localStringQuery);
                tracingParameters.Add("pathItemStringPath", pathItemStringPath);
                tracingParameters.Add("pathItemStringQuery", pathItemStringQuery);
                tracingParameters.Add("cancellationToken", cancellationToken);
                ServiceClientTracing.Enter(_invocationId, this, "GetAllWithValues", tracingParameters);
            }
            // Construct URL
            var _baseUrl = this.Client.BaseUri.AbsoluteUri;
            var _url = new Uri(new Uri(_baseUrl + (_baseUrl.EndsWith("/") ? "" : "/")), "pathitem/nullable/globalStringPath/{globalStringPath}/pathItemStringPath/{pathItemStringPath}/localStringPath/{localStringPath}/globalStringQuery/pathItemStringQuery/localStringQuery").ToString();
            _url = _url.Replace("{localStringPath}", Uri.EscapeDataString(localStringPath));
            _url = _url.Replace("{pathItemStringPath}", Uri.EscapeDataString(pathItemStringPath));
            _url = _url.Replace("{globalStringPath}", Uri.EscapeDataString(this.Client.GlobalStringPath));
            List<string> _queryParameters = new List<string>();
            if (localStringQuery != null)
            {
                _queryParameters.Add(string.Format("localStringQuery={0}", Uri.EscapeDataString(localStringQuery)));
            }
            if (pathItemStringQuery != null)
            {
                _queryParameters.Add(string.Format("pathItemStringQuery={0}", Uri.EscapeDataString(pathItemStringQuery)));
            }
            if (this.Client.GlobalStringQuery != null)
            {
                _queryParameters.Add(string.Format("globalStringQuery={0}", Uri.EscapeDataString(this.Client.GlobalStringQuery)));
            }
            if (_queryParameters.Count > 0)
            {
                _url += "?" + string.Join("&", _queryParameters);
            }
            // Create HTTP transport objects
            HttpRequestMessage _httpRequest = new HttpRequestMessage();
            _httpRequest.Method = new HttpMethod("GET");
            _httpRequest.RequestUri = new Uri(_url);
            // Set Headers
            if (customHeaders != null)
            {
                foreach(var _header in customHeaders)
                {
                    if (_httpRequest.Headers.Contains(_header.Key))
                    {
                        _httpRequest.Headers.Remove(_header.Key);
                    }
                    _httpRequest.Headers.TryAddWithoutValidation(_header.Key, _header.Value);
                }
            }

            // Send Request
            if (_shouldTrace)
            {
                ServiceClientTracing.SendRequest(_invocationId, _httpRequest);
            }
            cancellationToken.ThrowIfCancellationRequested();
            HttpResponseMessage _httpResponse = await this.Client.HttpClient.SendAsync(_httpRequest, cancellationToken).ConfigureAwait(false);
            if (_shouldTrace)
            {
                ServiceClientTracing.ReceiveResponse(_invocationId, _httpResponse);
            }
            HttpStatusCode _statusCode = _httpResponse.StatusCode;
            cancellationToken.ThrowIfCancellationRequested();
            if ((int)_statusCode != 200)
            {
                var ex = new ErrorException(string.Format("Operation returned an invalid status code '{0}'", _statusCode));
                try
                {
                    string _responseContent = await _httpResponse.Content.ReadAsStringAsync().ConfigureAwait(false);
                    Error _errorBody = SafeJsonConvert.DeserializeObject<Error>(_responseContent, this.Client.DeserializationSettings);
                    if (_errorBody != null)
                    {
                        ex.Body = _errorBody;
                    }
                }
                catch (JsonException)
                {
                    // Ignore the exception
                }
                ex.Request = _httpRequest;
                ex.Response = _httpResponse;
                if (_shouldTrace)
                {
                    ServiceClientTracing.Error(_invocationId, ex);
                }
                throw ex;
            }
            // Create Result
            var _result = new HttpOperationResponse();
            _result.Request = _httpRequest;
            _result.Response = _httpResponse;
            if (_shouldTrace)
            {
                ServiceClientTracing.Exit(_invocationId, _result);
            }
            return _result;
        }

        /// <summary>
        /// send globalStringPath='globalStringPath',
        /// pathItemStringPath='pathItemStringPath',
        /// localStringPath='localStringPath', globalStringQuery=null,
        /// pathItemStringQuery='pathItemStringQuery',
        /// localStringQuery='localStringQuery'
        /// </summary>
        /// <param name='localStringPath'>
        /// should contain value 'localStringPath'
        /// </param>
        /// <param name='pathItemStringPath'>
        /// A string value 'pathItemStringPath' that appears in the path
        /// </param>
        /// <param name='localStringQuery'>
        /// should contain value 'localStringQuery'
        /// </param>
        /// <param name='pathItemStringQuery'>
        /// A string value 'pathItemStringQuery' that appears as a query parameter
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        public async Task<HttpOperationResponse> GetGlobalQueryNullWithHttpMessagesAsync(string localStringPath, string pathItemStringPath, string localStringQuery = default(string), string pathItemStringQuery = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken))
        {
            if (localStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "localStringPath");
            }
            if (pathItemStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "pathItemStringPath");
            }
            if (this.Client.GlobalStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "this.Client.GlobalStringPath");
            }
            // Tracing
            bool _shouldTrace = ServiceClientTracing.IsEnabled;
            string _invocationId = null;
            if (_shouldTrace)
            {
                _invocationId = ServiceClientTracing.NextInvocationId.ToString();
                Dictionary<string, object> tracingParameters = new Dictionary<string, object>();
                tracingParameters.Add("localStringPath", localStringPath);
                tracingParameters.Add("localStringQuery", localStringQuery);
                tracingParameters.Add("pathItemStringPath", pathItemStringPath);
                tracingParameters.Add("pathItemStringQuery", pathItemStringQuery);
                tracingParameters.Add("cancellationToken", cancellationToken);
                ServiceClientTracing.Enter(_invocationId, this, "GetGlobalQueryNull", tracingParameters);
            }
            // Construct URL
            var _baseUrl = this.Client.BaseUri.AbsoluteUri;
            var _url = new Uri(new Uri(_baseUrl + (_baseUrl.EndsWith("/") ? "" : "/")), "pathitem/nullable/globalStringPath/{globalStringPath}/pathItemStringPath/{pathItemStringPath}/localStringPath/{localStringPath}/null/pathItemStringQuery/localStringQuery").ToString();
            _url = _url.Replace("{localStringPath}", Uri.EscapeDataString(localStringPath));
            _url = _url.Replace("{pathItemStringPath}", Uri.EscapeDataString(pathItemStringPath));
            _url = _url.Replace("{globalStringPath}", Uri.EscapeDataString(this.Client.GlobalStringPath));
            List<string> _queryParameters = new List<string>();
            if (localStringQuery != null)
            {
                _queryParameters.Add(string.Format("localStringQuery={0}", Uri.EscapeDataString(localStringQuery)));
            }
            if (pathItemStringQuery != null)
            {
                _queryParameters.Add(string.Format("pathItemStringQuery={0}", Uri.EscapeDataString(pathItemStringQuery)));
            }
            if (this.Client.GlobalStringQuery != null)
            {
                _queryParameters.Add(string.Format("globalStringQuery={0}", Uri.EscapeDataString(this.Client.GlobalStringQuery)));
            }
            if (_queryParameters.Count > 0)
            {
                _url += "?" + string.Join("&", _queryParameters);
            }
            // Create HTTP transport objects
            HttpRequestMessage _httpRequest = new HttpRequestMessage();
            _httpRequest.Method = new HttpMethod("GET");
            _httpRequest.RequestUri = new Uri(_url);
            // Set Headers
            if (customHeaders != null)
            {
                foreach(var _header in customHeaders)
                {
                    if (_httpRequest.Headers.Contains(_header.Key))
                    {
                        _httpRequest.Headers.Remove(_header.Key);
                    }
                    _httpRequest.Headers.TryAddWithoutValidation(_header.Key, _header.Value);
                }
            }

            // Send Request
            if (_shouldTrace)
            {
                ServiceClientTracing.SendRequest(_invocationId, _httpRequest);
            }
            cancellationToken.ThrowIfCancellationRequested();
            HttpResponseMessage _httpResponse = await this.Client.HttpClient.SendAsync(_httpRequest, cancellationToken).ConfigureAwait(false);
            if (_shouldTrace)
            {
                ServiceClientTracing.ReceiveResponse(_invocationId, _httpResponse);
            }
            HttpStatusCode _statusCode = _httpResponse.StatusCode;
            cancellationToken.ThrowIfCancellationRequested();
            if ((int)_statusCode != 200)
            {
                var ex = new ErrorException(string.Format("Operation returned an invalid status code '{0}'", _statusCode));
                try
                {
                    string _responseContent = await _httpResponse.Content.ReadAsStringAsync().ConfigureAwait(false);
                    Error _errorBody = SafeJsonConvert.DeserializeObject<Error>(_responseContent, this.Client.DeserializationSettings);
                    if (_errorBody != null)
                    {
                        ex.Body = _errorBody;
                    }
                }
                catch (JsonException)
                {
                    // Ignore the exception
                }
                ex.Request = _httpRequest;
                ex.Response = _httpResponse;
                if (_shouldTrace)
                {
                    ServiceClientTracing.Error(_invocationId, ex);
                }
                throw ex;
            }
            // Create Result
            var _result = new HttpOperationResponse();
            _result.Request = _httpRequest;
            _result.Response = _httpResponse;
            if (_shouldTrace)
            {
                ServiceClientTracing.Exit(_invocationId, _result);
            }
            return _result;
        }

        /// <summary>
        /// send globalStringPath=globalStringPath,
        /// pathItemStringPath='pathItemStringPath',
        /// localStringPath='localStringPath', globalStringQuery=null,
        /// pathItemStringQuery='pathItemStringQuery', localStringQuery=null
        /// </summary>
        /// <param name='localStringPath'>
        /// should contain value 'localStringPath'
        /// </param>
        /// <param name='pathItemStringPath'>
        /// A string value 'pathItemStringPath' that appears in the path
        /// </param>
        /// <param name='localStringQuery'>
        /// should contain null value
        /// </param>
        /// <param name='pathItemStringQuery'>
        /// A string value 'pathItemStringQuery' that appears as a query parameter
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        public async Task<HttpOperationResponse> GetGlobalAndLocalQueryNullWithHttpMessagesAsync(string localStringPath, string pathItemStringPath, string localStringQuery = default(string), string pathItemStringQuery = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken))
        {
            if (localStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "localStringPath");
            }
            if (pathItemStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "pathItemStringPath");
            }
            if (this.Client.GlobalStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "this.Client.GlobalStringPath");
            }
            // Tracing
            bool _shouldTrace = ServiceClientTracing.IsEnabled;
            string _invocationId = null;
            if (_shouldTrace)
            {
                _invocationId = ServiceClientTracing.NextInvocationId.ToString();
                Dictionary<string, object> tracingParameters = new Dictionary<string, object>();
                tracingParameters.Add("localStringPath", localStringPath);
                tracingParameters.Add("localStringQuery", localStringQuery);
                tracingParameters.Add("pathItemStringPath", pathItemStringPath);
                tracingParameters.Add("pathItemStringQuery", pathItemStringQuery);
                tracingParameters.Add("cancellationToken", cancellationToken);
                ServiceClientTracing.Enter(_invocationId, this, "GetGlobalAndLocalQueryNull", tracingParameters);
            }
            // Construct URL
            var _baseUrl = this.Client.BaseUri.AbsoluteUri;
            var _url = new Uri(new Uri(_baseUrl + (_baseUrl.EndsWith("/") ? "" : "/")), "pathitem/nullable/globalStringPath/{globalStringPath}/pathItemStringPath/{pathItemStringPath}/localStringPath/{localStringPath}/null/pathItemStringQuery/null").ToString();
            _url = _url.Replace("{localStringPath}", Uri.EscapeDataString(localStringPath));
            _url = _url.Replace("{pathItemStringPath}", Uri.EscapeDataString(pathItemStringPath));
            _url = _url.Replace("{globalStringPath}", Uri.EscapeDataString(this.Client.GlobalStringPath));
            List<string> _queryParameters = new List<string>();
            if (localStringQuery != null)
            {
                _queryParameters.Add(string.Format("localStringQuery={0}", Uri.EscapeDataString(localStringQuery)));
            }
            if (pathItemStringQuery != null)
            {
                _queryParameters.Add(string.Format("pathItemStringQuery={0}", Uri.EscapeDataString(pathItemStringQuery)));
            }
            if (this.Client.GlobalStringQuery != null)
            {
                _queryParameters.Add(string.Format("globalStringQuery={0}", Uri.EscapeDataString(this.Client.GlobalStringQuery)));
            }
            if (_queryParameters.Count > 0)
            {
                _url += "?" + string.Join("&", _queryParameters);
            }
            // Create HTTP transport objects
            HttpRequestMessage _httpRequest = new HttpRequestMessage();
            _httpRequest.Method = new HttpMethod("GET");
            _httpRequest.RequestUri = new Uri(_url);
            // Set Headers
            if (customHeaders != null)
            {
                foreach(var _header in customHeaders)
                {
                    if (_httpRequest.Headers.Contains(_header.Key))
                    {
                        _httpRequest.Headers.Remove(_header.Key);
                    }
                    _httpRequest.Headers.TryAddWithoutValidation(_header.Key, _header.Value);
                }
            }

            // Send Request
            if (_shouldTrace)
            {
                ServiceClientTracing.SendRequest(_invocationId, _httpRequest);
            }
            cancellationToken.ThrowIfCancellationRequested();
            HttpResponseMessage _httpResponse = await this.Client.HttpClient.SendAsync(_httpRequest, cancellationToken).ConfigureAwait(false);
            if (_shouldTrace)
            {
                ServiceClientTracing.ReceiveResponse(_invocationId, _httpResponse);
            }
            HttpStatusCode _statusCode = _httpResponse.StatusCode;
            cancellationToken.ThrowIfCancellationRequested();
            if ((int)_statusCode != 200)
            {
                var ex = new ErrorException(string.Format("Operation returned an invalid status code '{0}'", _statusCode));
                try
                {
                    string _responseContent = await _httpResponse.Content.ReadAsStringAsync().ConfigureAwait(false);
                    Error _errorBody = SafeJsonConvert.DeserializeObject<Error>(_responseContent, this.Client.DeserializationSettings);
                    if (_errorBody != null)
                    {
                        ex.Body = _errorBody;
                    }
                }
                catch (JsonException)
                {
                    // Ignore the exception
                }
                ex.Request = _httpRequest;
                ex.Response = _httpResponse;
                if (_shouldTrace)
                {
                    ServiceClientTracing.Error(_invocationId, ex);
                }
                throw ex;
            }
            // Create Result
            var _result = new HttpOperationResponse();
            _result.Request = _httpRequest;
            _result.Response = _httpResponse;
            if (_shouldTrace)
            {
                ServiceClientTracing.Exit(_invocationId, _result);
            }
            return _result;
        }

        /// <summary>
        /// send globalStringPath='globalStringPath',
        /// pathItemStringPath='pathItemStringPath',
        /// localStringPath='localStringPath', globalStringQuery='globalStringQuery',
        /// pathItemStringQuery=null, localStringQuery=null
        /// </summary>
        /// <param name='localStringPath'>
        /// should contain value 'localStringPath'
        /// </param>
        /// <param name='pathItemStringPath'>
        /// A string value 'pathItemStringPath' that appears in the path
        /// </param>
        /// <param name='localStringQuery'>
        /// should contain value null
        /// </param>
        /// <param name='pathItemStringQuery'>
        /// should contain value null
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        public async Task<HttpOperationResponse> GetLocalPathItemQueryNullWithHttpMessagesAsync(string localStringPath, string pathItemStringPath, string localStringQuery = default(string), string pathItemStringQuery = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken))
        {
            if (localStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "localStringPath");
            }
            if (pathItemStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "pathItemStringPath");
            }
            if (this.Client.GlobalStringPath == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "this.Client.GlobalStringPath");
            }
            // Tracing
            bool _shouldTrace = ServiceClientTracing.IsEnabled;
            string _invocationId = null;
            if (_shouldTrace)
            {
                _invocationId = ServiceClientTracing.NextInvocationId.ToString();
                Dictionary<string, object> tracingParameters = new Dictionary<string, object>();
                tracingParameters.Add("localStringPath", localStringPath);
                tracingParameters.Add("localStringQuery", localStringQuery);
                tracingParameters.Add("pathItemStringPath", pathItemStringPath);
                tracingParameters.Add("pathItemStringQuery", pathItemStringQuery);
                tracingParameters.Add("cancellationToken", cancellationToken);
                ServiceClientTracing.Enter(_invocationId, this, "GetLocalPathItemQueryNull", tracingParameters);
            }
            // Construct URL
            var _baseUrl = this.Client.BaseUri.AbsoluteUri;
            var _url = new Uri(new Uri(_baseUrl + (_baseUrl.EndsWith("/") ? "" : "/")), "pathitem/nullable/globalStringPath/{globalStringPath}/pathItemStringPath/{pathItemStringPath}/localStringPath/{localStringPath}/globalStringQuery/null/null").ToString();
            _url = _url.Replace("{localStringPath}", Uri.EscapeDataString(localStringPath));
            _url = _url.Replace("{pathItemStringPath}", Uri.EscapeDataString(pathItemStringPath));
            _url = _url.Replace("{globalStringPath}", Uri.EscapeDataString(this.Client.GlobalStringPath));
            List<string> _queryParameters = new List<string>();
            if (localStringQuery != null)
            {
                _queryParameters.Add(string.Format("localStringQuery={0}", Uri.EscapeDataString(localStringQuery)));
            }
            if (pathItemStringQuery != null)
            {
                _queryParameters.Add(string.Format("pathItemStringQuery={0}", Uri.EscapeDataString(pathItemStringQuery)));
            }
            if (this.Client.GlobalStringQuery != null)
            {
                _queryParameters.Add(string.Format("globalStringQuery={0}", Uri.EscapeDataString(this.Client.GlobalStringQuery)));
            }
            if (_queryParameters.Count > 0)
            {
                _url += "?" + string.Join("&", _queryParameters);
            }
            // Create HTTP transport objects
            HttpRequestMessage _httpRequest = new HttpRequestMessage();
            _httpRequest.Method = new HttpMethod("GET");
            _httpRequest.RequestUri = new Uri(_url);
            // Set Headers
            if (customHeaders != null)
            {
                foreach(var _header in customHeaders)
                {
                    if (_httpRequest.Headers.Contains(_header.Key))
                    {
                        _httpRequest.Headers.Remove(_header.Key);
                    }
                    _httpRequest.Headers.TryAddWithoutValidation(_header.Key, _header.Value);
                }
            }

            // Send Request
            if (_shouldTrace)
            {
                ServiceClientTracing.SendRequest(_invocationId, _httpRequest);
            }
            cancellationToken.ThrowIfCancellationRequested();
            HttpResponseMessage _httpResponse = await this.Client.HttpClient.SendAsync(_httpRequest, cancellationToken).ConfigureAwait(false);
            if (_shouldTrace)
            {
                ServiceClientTracing.ReceiveResponse(_invocationId, _httpResponse);
            }
            HttpStatusCode _statusCode = _httpResponse.StatusCode;
            cancellationToken.ThrowIfCancellationRequested();
            if ((int)_statusCode != 200)
            {
                var ex = new ErrorException(string.Format("Operation returned an invalid status code '{0}'", _statusCode));
                try
                {
                    string _responseContent = await _httpResponse.Content.ReadAsStringAsync().ConfigureAwait(false);
                    Error _errorBody = SafeJsonConvert.DeserializeObject<Error>(_responseContent, this.Client.DeserializationSettings);
                    if (_errorBody != null)
                    {
                        ex.Body = _errorBody;
                    }
                }
                catch (JsonException)
                {
                    // Ignore the exception
                }
                ex.Request = _httpRequest;
                ex.Response = _httpResponse;
                if (_shouldTrace)
                {
                    ServiceClientTracing.Error(_invocationId, ex);
                }
                throw ex;
            }
            // Create Result
            var _result = new HttpOperationResponse();
            _result.Request = _httpRequest;
            _result.Response = _httpResponse;
            if (_shouldTrace)
            {
                ServiceClientTracing.Exit(_invocationId, _result);
            }
            return _result;
        }

    }
}
