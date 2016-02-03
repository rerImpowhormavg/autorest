// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsLro.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Microsoft.Rest.Azure;

    /// <summary>
    /// Defines headers for post202Retry200 operation.
    /// </summary>
    public partial class LROsPost202Retry200Headers
    {
        /// <summary>
        /// Initializes a new instance of the LROsPost202Retry200Headers class.
        /// </summary>
        public LROsPost202Retry200Headers() { }

        /// <summary>
        /// Initializes a new instance of the LROsPost202Retry200Headers class.
        /// </summary>
        public LROsPost202Retry200Headers(string location = default(string), int? retryAfter = default(int?))
        {
            Location = location;
            RetryAfter = retryAfter;
        }

        /// <summary>
        /// Location to poll for result status: will be set to
        /// /lro/post/202/retry/200
        /// </summary>
        [JsonProperty(PropertyName = "Location")]
        public string Location { get; set; }

        /// <summary>
        /// Number of milliseconds until the next poll should be sent, will be
        /// set to zero
        /// </summary>
        [JsonProperty(PropertyName = "Retry-After")]
        public int? RetryAfter { get; set; }

    }
}
