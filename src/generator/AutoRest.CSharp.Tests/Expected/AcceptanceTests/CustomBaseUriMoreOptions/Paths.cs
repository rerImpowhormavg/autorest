// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsCustomBaseUriMoreOptions
{
    using Microsoft.Rest;
    using Models;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Net;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;

    /// <summary>
    /// Paths operations.
    /// </summary>
    public partial class Paths : IServiceOperations<AutoRestParameterizedCustomHostTestClient>, IPaths
    {
        /// <summary>
        /// Initializes a new instance of the Paths class.
        /// </summary>
        /// <param name='client'>
        /// Reference to the service client.
        /// </param>
        /// <exception cref="System.ArgumentNullException">
        /// Thrown when a required parameter is null
        /// </exception>
        public Paths(AutoRestParameterizedCustomHostTestClient client)
        {
            if (client == null) 
            {
                throw new System.ArgumentNullException("client");
            }
            Client = client;
        }

        /// <summary>
        /// Gets a reference to the AutoRestParameterizedCustomHostTestClient
        /// </summary>
        public AutoRestParameterizedCustomHostTestClient Client { get; private set; }

        /// <summary>
        /// Get a 200 to test a valid base uri
        /// </summary>
        /// <param name='vault'>
        /// The vault name, e.g. https://myvault
        /// </param>
        /// <param name='secret'>
        /// Secret value.
        /// </param>
        /// <param name='keyName'>
        /// The key name with value 'key1'.
        /// </param>
        /// <param name='keyVersion'>
        /// The key version. Default value 'v1'.
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="ErrorException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        /// <exception cref="ValidationException">
        /// Thrown when a required parameter is null
        /// </exception>
        /// <return>
        /// A response object containing the response body and response headers.
        /// </return>
        public async Task<HttpOperationResponse> GetEmptyWithHttpMessagesAsync(string vault, string secret, string keyName, string keyVersion = "v1", Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken))
        {
            if (vault == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "vault");
            }
            if (secret == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "secret");
            }
            if (Client.DnsSuffix == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "this.Client.DnsSuffix");
            }
            if (keyName == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "keyName");
            }
            if (Client.SubscriptionId == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "this.Client.SubscriptionId");
            }
            // Tracing
            bool _shouldTrace = ServiceClientTracing.IsEnabled;
            string _invocationId = null;
            if (_shouldTrace)
            {
                _invocationId = ServiceClientTracing.NextInvocationId.ToString();
                Dictionary<string, object> tracingParameters = new Dictionary<string, object>();
                tracingParameters.Add("vault", vault);
                tracingParameters.Add("secret", secret);
                tracingParameters.Add("keyName", keyName);
                tracingParameters.Add("keyVersion", keyVersion);
                tracingParameters.Add("cancellationToken", cancellationToken);
                ServiceClientTracing.Enter(_invocationId, this, "GetEmpty", tracingParameters);
            }
            // Construct URL
            var _baseUrl = Client.BaseUri;
            var _url = _baseUrl + (_baseUrl.EndsWith("/") ? "" : "/") + "customuri/{subscriptionId}/{keyName}";
            _url = _url.Replace("{vault}", vault);
            _url = _url.Replace("{secret}", secret);
            _url = _url.Replace("{dnsSuffix}", Client.DnsSuffix);
            _url = _url.Replace("{keyName}", System.Uri.EscapeDataString(keyName));
            _url = _url.Replace("{subscriptionId}", System.Uri.EscapeDataString(Client.SubscriptionId));
            List<string> _queryParameters = new List<string>();
            if (keyVersion != null)
            {
                _queryParameters.Add(string.Format("keyVersion={0}", System.Uri.EscapeDataString(keyVersion)));
            }
            if (_queryParameters.Count > 0)
            {
                _url += "?" + string.Join("&", _queryParameters);
            }
            // Create HTTP transport objects
            var _httpRequest = new System.Net.Http.HttpRequestMessage();
            System.Net.Http.HttpResponseMessage _httpResponse = null;
            _httpRequest.Method = new System.Net.Http.HttpMethod("GET");
            _httpRequest.RequestUri = new System.Uri(_url);
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

            // Serialize Request
            string _requestContent = null;
            // Send Request
            if (_shouldTrace)
            {
                ServiceClientTracing.SendRequest(_invocationId, _httpRequest);
            }
            cancellationToken.ThrowIfCancellationRequested();
            _httpResponse = await Client.HttpClient.SendAsync(_httpRequest, cancellationToken).ConfigureAwait(false);
            if (_shouldTrace)
            {
                ServiceClientTracing.ReceiveResponse(_invocationId, _httpResponse);
            }
            HttpStatusCode _statusCode = _httpResponse.StatusCode;
            cancellationToken.ThrowIfCancellationRequested();
            string _responseContent = null;
            if ((int)_statusCode != 200)
            {
                var ex = new ErrorException(string.Format("Operation returned an invalid status code '{0}'", _statusCode));
                try
                {
                    _responseContent = await _httpResponse.Content.ReadAsStringAsync().ConfigureAwait(false);
                    Error _errorBody =  Microsoft.Rest.Serialization.SafeJsonConvert.DeserializeObject<Error>(_responseContent, Client.DeserializationSettings);
                    if (_errorBody != null)
                    {
                        ex.Body = _errorBody;
                    }
                }
                catch (Newtonsoft.Json.JsonException)
                {
                    // Ignore the exception
                }
                ex.Request = new HttpRequestMessageWrapper(_httpRequest, _requestContent);
                ex.Response = new HttpResponseMessageWrapper(_httpResponse, _responseContent);
                if (_shouldTrace)
                {
                    ServiceClientTracing.Error(_invocationId, ex);
                }
                _httpRequest.Dispose();
                if (_httpResponse != null)
                {
                    _httpResponse.Dispose();
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
