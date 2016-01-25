// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
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
    /// Defines headers for responseByte operation.
    /// </summary>
    public partial class HeaderResponseByteHeaders
    {
        /// <summary>
        /// Initializes a new instance of the HeaderResponseByteHeaders class.
        /// </summary>
        public HeaderResponseByteHeaders() { }

        /// <summary>
        /// Initializes a new instance of the HeaderResponseByteHeaders class.
        /// </summary>
        public HeaderResponseByteHeaders(byte[] value = default(byte[]))
        {
            Value = value;
        }

        /// <summary>
        /// response with header values "啊齄丂狛狜隣郎隣兀﨩"
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public byte[] Value { get; set; }

    }
}
