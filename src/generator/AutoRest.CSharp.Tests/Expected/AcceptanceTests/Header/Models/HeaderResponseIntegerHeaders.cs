// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsHeader.Models
{
    using Fixtures.AcceptanceTestsHeader;
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Defines headers for responseInteger operation.
    /// </summary>
    public partial class HeaderResponseIntegerHeaders
    {
        /// <summary>
        /// Initializes a new instance of the HeaderResponseIntegerHeaders
        /// class.
        /// </summary>
        public HeaderResponseIntegerHeaders()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the HeaderResponseIntegerHeaders
        /// class.
        /// </summary>
        /// <param name="value">response with header value "value": 1 or
        /// -2</param>
        public HeaderResponseIntegerHeaders(int? value = default(int?))
        {
            Value = value;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets response with header value "value": 1 or -2
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public int? Value { get; set; }

    }
}
