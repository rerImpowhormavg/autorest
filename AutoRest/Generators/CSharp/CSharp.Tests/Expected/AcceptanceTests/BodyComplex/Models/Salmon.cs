// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
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
    [JsonObject("salmon")]
    public partial class Salmon : Fish
    {
        /// <summary>
        /// Initializes a new instance of the Salmon class.
        /// </summary>
        public Salmon() { }

        /// <summary>
        /// Initializes a new instance of the Salmon class.
        /// </summary>
        public Salmon(string location = default(string), bool? iswild = default(bool?))
        {
            Location = location;
            Iswild = iswild;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "location")]
        public string Location { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "iswild")]
        public bool? Iswild { get; set; }

        /// <summary>
        /// Validate the object. Throws ArgumentException or ArgumentNullException if validation fails.
        /// </summary>
        public override void Validate()
        {
            base.Validate();
        }
    }
}
