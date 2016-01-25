// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsRequiredOptional.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    public partial class ArrayWrapper
    {
        /// <summary>
        /// Initializes a new instance of the ArrayWrapper class.
        /// </summary>
        public ArrayWrapper() { }

        /// <summary>
        /// Initializes a new instance of the ArrayWrapper class.
        /// </summary>
        public ArrayWrapper(IList<string> value)
        {
            Value = value;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public IList<string> Value { get; set; }

        /// <summary>
        /// Validate the object. Throws ValidationException if validation fails.
        /// </summary>
        public virtual void Validate()
        {
            if (Value == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Value");
            }
        }
    }
}
