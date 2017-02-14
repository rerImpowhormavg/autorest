// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsAzureCompositeModelClient.Models
{
    using Fixtures.AcceptanceTestsAzureCompositeModelClient;
    using Newtonsoft.Json;
    using System.Linq;

    public partial class FloatWrapper
    {
        /// <summary>
        /// Initializes a new instance of the FloatWrapper class.
        /// </summary>
        public FloatWrapper() { }

        /// <summary>
        /// Initializes a new instance of the FloatWrapper class.
        /// </summary>
        public FloatWrapper(double? field1 = default(double?), double? field2 = default(double?))
        {
            Field1 = field1;
            Field2 = field2;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "field1")]
        public double? Field1 { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "field2")]
        public double? Field2 { get; set; }

    }
}

