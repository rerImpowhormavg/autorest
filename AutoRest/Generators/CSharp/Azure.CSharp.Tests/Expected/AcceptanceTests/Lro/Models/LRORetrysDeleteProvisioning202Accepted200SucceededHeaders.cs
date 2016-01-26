// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
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
    /// Defines headers for deleteProvisioning202Accepted200Succeeded
    /// operation.
    /// </summary>
    public partial class LRORetrysDeleteProvisioning202Accepted200SucceededHeaders
    {
        /// <summary>
        /// Initializes a new instance of the
        /// LRORetrysDeleteProvisioning202Accepted200SucceededHeaders class.
        /// </summary>
        public LRORetrysDeleteProvisioning202Accepted200SucceededHeaders() { }

        /// <summary>
        /// Initializes a new instance of the
        /// LRORetrysDeleteProvisioning202Accepted200SucceededHeaders class.
        /// </summary>
        public LRORetrysDeleteProvisioning202Accepted200SucceededHeaders(string location = default(string), int? retryAfter = default(int?))
        {
            Location = location;
            RetryAfter = retryAfter;
        }

        /// <summary>
        /// Location to poll for result status: will be set to
        /// /lro/retryerror/delete/provisioning/202/accepted/200/succeeded
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
