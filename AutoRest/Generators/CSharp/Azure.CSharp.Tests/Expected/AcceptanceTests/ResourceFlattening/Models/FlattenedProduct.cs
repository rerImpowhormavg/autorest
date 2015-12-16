// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsResourceFlattening.Models
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
    public partial class FlattenedProduct : Resource
    {
        /// <summary>
        /// Initializes a new instance of the FlattenedProduct class.
        /// </summary>
        public FlattenedProduct() { }

        /// <summary>
        /// Initializes a new instance of the FlattenedProduct class.
        /// </summary>
        public FlattenedProduct(string id = default(string), string type = default(string), IDictionary<string, string> tags = default(IDictionary<string, string>), string location = default(string), string name = default(string), string pname = default(string), string flattenedProductType = default(string), string provisioningStateValues = default(string), string provisioningState = default(string))
            : base(id, type, tags, location, name)
        {
            Pname = pname;
            FlattenedProductType = flattenedProductType;
            ProvisioningStateValues = provisioningStateValues;
            ProvisioningState = provisioningState;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.pname")]
        public string Pname { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.type")]
        public string FlattenedProductType { get; set; }

        /// <summary>
        /// Possible values for this property include: 'Succeeded', 'Failed',
        /// 'canceled', 'Accepted', 'Creating', 'Created', 'Updating',
        /// 'Updated', 'Deleting', 'Deleted', 'OK'.
        /// </summary>
        [JsonProperty(PropertyName = "properties.provisioningStateValues")]
        public string ProvisioningStateValues { get; private set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.provisioningState")]
        public string ProvisioningState { get; set; }

    }
}
