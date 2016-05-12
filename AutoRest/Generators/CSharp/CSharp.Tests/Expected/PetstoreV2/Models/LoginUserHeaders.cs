// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.PetstoreV2.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// Defines headers for loginUser operation.
    /// </summary>
    public partial class LoginUserHeaders
    {
        /// <summary>
        /// Initializes a new instance of the LoginUserHeaders class.
        /// </summary>
        public LoginUserHeaders() { }

        /// <summary>
        /// Initializes a new instance of the LoginUserHeaders class.
        /// </summary>
        public LoginUserHeaders(int? xRateLimit = default(int?), DateTime? xExpiresAfter = default(DateTime?))
        {
            XRateLimit = xRateLimit;
            XExpiresAfter = xExpiresAfter;
        }

        /// <summary>
        /// Gets or sets calls per hour allowed by the user
        /// </summary>
        [JsonProperty(PropertyName = "X-Rate-Limit")]
        public int? XRateLimit { get; set; }

        /// <summary>
        /// Gets or sets date in UTC when toekn expires
        /// </summary>
        [JsonProperty(PropertyName = "X-Expires-After")]
        public DateTime? XExpiresAfter { get; set; }

    }
}
