// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyComplex.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    public partial class Basic
    {
        /// <summary>
        /// Initializes a new instance of the Basic class.
        /// </summary>
        public Basic() { }

        /// <summary>
        /// Initializes a new instance of the Basic class.
        /// </summary>
        public Basic(int? id = default(int?), string name = default(string), string color = default(string))
        {
            Id = id;
            Name = name;
            Color = color;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public int? Id { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Possible values for this property include: 'cyan', 'Magenta',
        /// 'YELLOW', 'blacK'.
        /// </summary>
        [JsonProperty(PropertyName = "color")]
        public string Color { get; set; }

    }
}
