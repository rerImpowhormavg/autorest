// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsHeader.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// Defines headers for responseBool operation.
    /// </summary>
    public partial class HeaderResponseBoolHeaders
    {
        /// <summary>
        /// Initializes a new instance of the HeaderResponseBoolHeaders class.
        /// </summary>
        public HeaderResponseBoolHeaders() { }

        /// <summary>
        /// Initializes a new instance of the HeaderResponseBoolHeaders class.
        /// </summary>
        public HeaderResponseBoolHeaders(bool? value = default(bool?))
        {
            Value = value;
        }

        /// <summary>
        /// response with header value "value": true or false
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public bool? Value { get; set; }

    }
}
