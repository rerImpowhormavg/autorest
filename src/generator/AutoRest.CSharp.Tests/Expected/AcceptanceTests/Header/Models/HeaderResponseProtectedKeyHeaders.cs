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
    /// Defines headers for responseProtectedKey operation.
    /// </summary>
    public partial class HeaderResponseProtectedKeyHeaders
    {
        /// <summary>
        /// Initializes a new instance of the HeaderResponseProtectedKeyHeaders
        /// class.
        /// </summary>
        public HeaderResponseProtectedKeyHeaders() { }

        /// <summary>
        /// Initializes a new instance of the HeaderResponseProtectedKeyHeaders
        /// class.
        /// </summary>
        /// <param name="contentType">response with header value
        /// "Content-Type": "text/html"</param>
        public HeaderResponseProtectedKeyHeaders(string contentType = default(string))
        {
            ContentType = contentType;
        }

        /// <summary>
        /// Gets or sets response with header value "Content-Type": "text/html"
        /// </summary>
        [JsonProperty(PropertyName = "Content-Type")]
        public string ContentType { get; set; }

    }
}

