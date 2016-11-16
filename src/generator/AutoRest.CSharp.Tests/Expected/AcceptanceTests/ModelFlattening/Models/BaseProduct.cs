// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsModelFlattening.Models
{
    using AcceptanceTestsModelFlattening;
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;
    using System.Net.Http;

    /// <summary>
    /// The product documentation.
    /// </summary>
    public partial class BaseProduct
    {
        /// <summary>
        /// Initializes a new instance of the BaseProduct class.
        /// </summary>
        public BaseProduct() { }

        /// <summary>
        /// Initializes a new instance of the BaseProduct class.
        /// </summary>
        /// <param name="productId">Unique identifier representing a specific
        /// product for a given latitude &amp; longitude. For example, uberX in
        /// San Francisco will have a different product_id than uberX in Los
        /// Angeles.</param>
        /// <param name="description">Description of product.</param>
        public BaseProduct(string productId, string description = default(string))
        {
            ProductId = productId;
            Description = description;
        }

        /// <summary>
        /// Gets or sets unique identifier representing a specific product for
        /// a given latitude &amp;amp; longitude. For example, uberX in San
        /// Francisco will have a different product_id than uberX in Los
        /// Angeles.
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "base_product_id")]
        public string ProductId { get; set; }

        /// <summary>
        /// Gets or sets description of product.
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "base_product_description")]
        public string Description { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (ProductId == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "ProductId");
            }
        }
    }
}
