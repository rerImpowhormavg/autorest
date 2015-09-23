// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyFormData.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    public partial class UploadFile
    {
        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "fieldName")]
        public string FieldName { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "originalName")]
        public string OriginalName { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "encoding")]
        public string Encoding { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "mimetype")]
        public string Mimetype { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "buffer")]
        public Buffer Buffer { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "size")]
        public long? Size { get; set; }

    }
}
