// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsHttp.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// Defines headers for get307 operation.
    /// </summary>
    public partial class HttpRedirectsGet307Headers
    {
        /// <summary>
        /// Initializes a new instance of the HttpRedirectsGet307Headers class.
        /// </summary>
        public HttpRedirectsGet307Headers() { }

        /// <summary>
        /// Initializes a new instance of the HttpRedirectsGet307Headers class.
        /// </summary>
        public HttpRedirectsGet307Headers(string location = default(string))
        {
            Location = location;
        }

        /// <summary>
        /// The redirect location for this request
        /// </summary>
        [JsonProperty(PropertyName = "Location")]
        public string Location { get; set; }

    }
}
