// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsAzureCompositeModelClient.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Microsoft.Rest.Azure;

    /// <summary>
    /// </summary>
    public partial class DurationWrapper
    {
        /// <summary>
        /// Initializes a new instance of the DurationWrapper class.
        /// </summary>
        public DurationWrapper() { }

        /// <summary>
        /// Initializes a new instance of the DurationWrapper class.
        /// </summary>
        public DurationWrapper(TimeSpan? field = default(TimeSpan?))
        {
            Field = field;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "field")]
        public TimeSpan? Field { get; set; }

    }
}
