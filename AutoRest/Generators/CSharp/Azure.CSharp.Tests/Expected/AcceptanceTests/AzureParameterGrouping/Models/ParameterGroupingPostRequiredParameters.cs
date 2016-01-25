// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsAzureParameterGrouping.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Microsoft.Rest.Azure;

    /// <summary>
    /// Additional parameters for the postRequired operation.
    /// </summary>
    public partial class ParameterGroupingPostRequiredParameters
    {
        /// <summary>
        /// Initializes a new instance of the
        /// ParameterGroupingPostRequiredParameters class.
        /// </summary>
        public ParameterGroupingPostRequiredParameters() { }

        /// <summary>
        /// Initializes a new instance of the
        /// ParameterGroupingPostRequiredParameters class.
        /// </summary>
        public ParameterGroupingPostRequiredParameters(int? body, string path, string customHeader = default(string), int? query = default(int?))
        {
            Body = body;
            CustomHeader = customHeader;
            Query = query;
            Path = path;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "")]
        public int? Body { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "")]
        public string CustomHeader { get; set; }

        /// <summary>
        /// Query parameter with default
        /// </summary>
        [JsonProperty(PropertyName = "")]
        public int? Query { get; set; }

        /// <summary>
        /// Path parameter
        /// </summary>
        [JsonProperty(PropertyName = "")]
        public string Path { get; set; }

        /// <summary>
        /// Validate the object. Throws ValidationException if validation fails.
        /// </summary>
        public virtual void Validate()
        {
            if (Body == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Body");
            }
            if (Path == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Path");
            }
        }
    }
}
