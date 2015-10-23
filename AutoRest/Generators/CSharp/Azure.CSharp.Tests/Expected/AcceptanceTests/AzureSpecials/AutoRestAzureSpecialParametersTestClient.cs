// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsAzureSpecials
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using System.Diagnostics;
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
    using Microsoft.Rest.Azure;
    using Models;

    /// <summary>
    /// Test Infrastructure for AutoRest
    /// </summary>
    public partial class AutoRestAzureSpecialParametersTestClient : ServiceClient<AutoRestAzureSpecialParametersTestClient>, IAutoRestAzureSpecialParametersTestClient, IAzureClient
    {
        /// <summary>
        /// The base URI of the service.
        /// </summary>
        public Uri BaseUri { get; set; }

        /// <summary>
        /// Gets or sets json serialization settings.
        /// </summary>
        public JsonSerializerSettings SerializationSettings { get; private set; }

        /// <summary>
        /// Gets or sets json deserialization settings.
        /// </summary>
        public JsonSerializerSettings DeserializationSettings { get; private set; }        

        /// <summary>
        /// The management credentials for Azure.
        /// </summary>
        public ServiceClientCredentials Credentials { get; private set; }

        /// <summary>
        /// The subscription id, which appears in the path, always modeled in
        /// credentials. The value is always '1234-5678-9012-3456'
        /// </summary>
        public string SubscriptionId { get; set; }

        /// <summary>
        /// The api version, which appears in the query, the value is always
        /// '2015-07-01-preview'
        /// </summary>
        public string ApiVersion { get; private set; }

        /// <summary>
        /// Gets or sets the preferred language for the response.
        /// </summary>
        public string AcceptLanguage { get; set; }

        /// <summary>
        /// The retry timeout for Long Running Operations.
        /// </summary>
        public int? LongRunningOperationRetryTimeout { get; set; }

        public virtual IXMsClientRequestIdOperations XMsClientRequestId { get; private set; }

        public virtual ISubscriptionInCredentialsOperations SubscriptionInCredentials { get; private set; }

        public virtual ISubscriptionInMethodOperations SubscriptionInMethod { get; private set; }

        public virtual IApiVersionDefaultOperations ApiVersionDefault { get; private set; }

        public virtual IApiVersionLocalOperations ApiVersionLocal { get; private set; }

        public virtual ISkipUrlEncodingOperations SkipUrlEncoding { get; private set; }

        public virtual IHeaderOperations Header { get; private set; }

        /// <summary>
        /// Initializes a new instance of the AutoRestAzureSpecialParametersTestClient class.
        /// </summary>
        public AutoRestAzureSpecialParametersTestClient() : base()
        {
            this.Initialize();
        }

        /// <summary>
        /// Initializes a new instance of the AutoRestAzureSpecialParametersTestClient class.
        /// </summary>
        /// <param name='handlers'>
        /// Optional. The set of delegating handlers to insert in the http
        /// client pipeline.
        /// </param>
        public AutoRestAzureSpecialParametersTestClient(params DelegatingHandler[] handlers) : base(handlers)
        {
            this.Initialize();
        }

        /// <summary>
        /// Initializes a new instance of the AutoRestAzureSpecialParametersTestClient class.
        /// </summary>
        /// <param name='rootHandler'>
        /// Optional. The http client handler used to handle http transport.
        /// </param>
        /// <param name='handlers'>
        /// Optional. The set of delegating handlers to insert in the http
        /// client pipeline.
        /// </param>
        public AutoRestAzureSpecialParametersTestClient(HttpClientHandler rootHandler, params DelegatingHandler[] handlers) : base(rootHandler, handlers)
        {
            this.Initialize();
        }

        /// <summary>
        /// Initializes a new instance of the AutoRestAzureSpecialParametersTestClient class.
        /// </summary>
        /// <param name='baseUri'>
        /// Optional. The base URI of the service.
        /// </param>
        /// <param name='handlers'>
        /// Optional. The set of delegating handlers to insert in the http
        /// client pipeline.
        /// </param>
        public AutoRestAzureSpecialParametersTestClient(Uri baseUri, params DelegatingHandler[] handlers) : this(handlers)
        {
            if (baseUri == null)
            {
                throw new ArgumentNullException("baseUri");
            }
            this.BaseUri = baseUri;
        }

        /// <summary>
        /// Initializes a new instance of the AutoRestAzureSpecialParametersTestClient class.
        /// </summary>
        /// <param name='credentials'>
        /// Required. The management credentials for Azure.
        /// </param>
        /// <param name='handlers'>
        /// Optional. The set of delegating handlers to insert in the http
        /// client pipeline.
        /// </param>
        public AutoRestAzureSpecialParametersTestClient(ServiceClientCredentials credentials, params DelegatingHandler[] handlers) : this(handlers)
        {
            if (credentials == null)
            {
                throw new ArgumentNullException("credentials");
            }
            this.Credentials = credentials;
            if (this.Credentials != null)
            {
                this.Credentials.InitializeServiceClient(this);
            }
        }

        /// <summary>
        /// Initializes a new instance of the AutoRestAzureSpecialParametersTestClient class.
        /// </summary>
        /// <param name='baseUri'>
        /// Optional. The base URI of the service.
        /// </param>
        /// <param name='credentials'>
        /// Required. The management credentials for Azure.
        /// </param>
        /// <param name='handlers'>
        /// Optional. The set of delegating handlers to insert in the http
        /// client pipeline.
        /// </param>
        public AutoRestAzureSpecialParametersTestClient(Uri baseUri, ServiceClientCredentials credentials, params DelegatingHandler[] handlers) : this(handlers)
        {
            if (baseUri == null)
            {
                throw new ArgumentNullException("baseUri");
            }
            if (credentials == null)
            {
                throw new ArgumentNullException("credentials");
            }
            this.BaseUri = baseUri;
            this.Credentials = credentials;
            if (this.Credentials != null)
            {
                this.Credentials.InitializeServiceClient(this);
            }
        }

        /// <summary>
        /// Initializes client properties.
        /// </summary>
        private void Initialize()
        {
            this.XMsClientRequestId = new XMsClientRequestIdOperations(this);
            this.SubscriptionInCredentials = new SubscriptionInCredentialsOperations(this);
            this.SubscriptionInMethod = new SubscriptionInMethodOperations(this);
            this.ApiVersionDefault = new ApiVersionDefaultOperations(this);
            this.ApiVersionLocal = new ApiVersionLocalOperations(this);
            this.SkipUrlEncoding = new SkipUrlEncodingOperations(this);
            this.Header = new HeaderOperations(this);
            this.BaseUri = new Uri("http://localhost");
            this.ApiVersion = "2015-07-01-preview";
            this.AcceptLanguage = "en-US";
            SerializationSettings = new JsonSerializerSettings
            {
                Formatting = Formatting.Indented,
                DateFormatHandling = DateFormatHandling.IsoDateFormat,
                DateTimeZoneHandling = DateTimeZoneHandling.Utc,
                NullValueHandling = NullValueHandling.Ignore,
                ReferenceLoopHandling = ReferenceLoopHandling.Serialize,
                ContractResolver = new ReadOnlyJsonContractResolver(),
                Converters = new List<JsonConverter>
                    {
                        new Iso8601TimeSpanConverter()
                    }
            };
            SerializationSettings.Converters.Add(new ResourceJsonConverter()); 
            DeserializationSettings = new JsonSerializerSettings{
                DateFormatHandling = DateFormatHandling.IsoDateFormat,
                DateTimeZoneHandling = DateTimeZoneHandling.Utc,
                NullValueHandling = NullValueHandling.Ignore,
                ReferenceLoopHandling = ReferenceLoopHandling.Serialize,
                ContractResolver = new ReadOnlyJsonContractResolver(),
                Converters = new List<JsonConverter>
                    {
                        new Iso8601TimeSpanConverter()
                    }
            };
            DeserializationSettings.Converters.Add(new ResourceJsonConverter()); 
            DeserializationSettings.Converters.Add(new CloudErrorJsonConverter()); 
        }    
    }
}
