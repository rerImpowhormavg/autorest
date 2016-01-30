// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.MirrorPolymorphic.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    public partial class HimalayanCat : SiameseCat
    {
        /// <summary>
        /// Initializes a new instance of the HimalayanCat class.
        /// </summary>
        public HimalayanCat() { }

        /// <summary>
        /// Initializes a new instance of the HimalayanCat class.
        /// </summary>
        public HimalayanCat(string id = default(string), string description = default(string), string color = default(string), int? length = default(int?), int? hairLength = default(int?))
            : base(id, description, color, length)
        {
            HairLength = hairLength;
        }

        /// <summary>
        /// cat hair length
        /// </summary>
        [JsonProperty(PropertyName = "hairLength")]
        public int? HairLength { get; set; }

    }
}