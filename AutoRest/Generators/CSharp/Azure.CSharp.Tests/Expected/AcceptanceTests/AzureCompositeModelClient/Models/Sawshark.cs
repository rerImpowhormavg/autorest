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

    [JsonObject("sawshark")]
    public partial class Sawshark : Shark
    {
        /// <summary>
        /// Initializes a new instance of the Sawshark class.
        /// </summary>
        public Sawshark() { }

        /// <summary>
        /// Initializes a new instance of the Sawshark class.
        /// </summary>
        public Sawshark(double length, DateTime birthday, string species = default(string), IList<Fish> siblings = default(IList<Fish>), int? age = default(int?), byte[] picture = default(byte[]))
            : base(length, birthday, species, siblings, age)
        {
            Picture = picture;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "picture")]
        public byte[] Picture { get; set; }

        /// <summary>
        /// Validate the object. Throws ValidationException if validation fails.
        /// </summary>
        public override void Validate()
        {
            base.Validate();
        }
    }
}
