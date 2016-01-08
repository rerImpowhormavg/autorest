// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
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
    public partial class Siamese : Cat
    {
        /// <summary>
        /// Initializes a new instance of the Siamese class.
        /// </summary>
        public Siamese() { }

        /// <summary>
        /// Initializes a new instance of the Siamese class.
        /// </summary>
        public Siamese(int? id = default(int?), string name = default(string), string color = default(string), IList<Dog> hates = default(IList<Dog>), string breed = default(string))
            : base(id, name, color, hates)
        {
            Breed = breed;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "breed")]
        public string Breed { get; set; }

    }
}
