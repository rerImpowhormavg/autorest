// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
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
    /// Defines headers for putAsyncRelativeRetry400 operation.
    /// </summary>
    public partial class LROSADsPutAsyncRelativeRetry400Headers
    {
        /// <summary>
        /// Initializes a new instance of the
        /// LROSADsPutAsyncRelativeRetry400Headers class.
        /// </summary>
        public LROSADsPutAsyncRelativeRetry400Headers() { }

        /// <summary>
        /// Initializes a new instance of the
        /// LROSADsPutAsyncRelativeRetry400Headers class.
        /// </summary>
        public LROSADsPutAsyncRelativeRetry400Headers(string azureAsyncOperation = default(string), string location = default(string), int? retryAfter = default(int?))
        {
            AzureAsyncOperation = azureAsyncOperation;
            Location = location;
            RetryAfter = retryAfter;
        }

        /// <summary>
        /// Location to poll for result status: will be set to
        /// /lro/nonretryerror/putasync/retry/operationResults/400
        /// </summary>
        [JsonProperty(PropertyName = "Azure-AsyncOperation")]
        public string AzureAsyncOperation { get; set; }

        /// <summary>
        /// Location to poll for result status: will be set to
        /// /lro/nonretryerror/putasync/retry/operationResults/400
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
