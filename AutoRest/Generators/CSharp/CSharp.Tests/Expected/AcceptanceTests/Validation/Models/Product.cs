// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsValidation.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// The product documentation.
    /// </summary>
    public partial class Product
    {
        /// <summary>
        /// Initializes a new instance of the Product class.
        /// </summary>
        public Product()
        {
            Child = new ChildProduct();
        }

        /// <summary>
        /// Initializes a new instance of the Product class.
        /// </summary>
        public Product(ChildProduct child, IList<string> displayNames = default(IList<string>), int? capacity = default(int?), string image = default(string), EnumConst? constStringAsEnum = default(EnumConst?))
        {
            Child = new ChildProduct();
            DisplayNames = displayNames;
            Capacity = capacity;
            Image = image;
            Child = child;
            ConstStringAsEnum = constStringAsEnum;
        }
        /// <summary>
        /// Static constructor for Product class.
        /// </summary>
        static Product()
        {
            ConstChild = new ConstantProduct();
            ConstInt = 0;
            ConstString = "constant";
        }

        /// <summary>
        /// Gets or sets non required array of unique items from 0 to 6
        /// elements.
        /// </summary>
        [JsonProperty(PropertyName = "display_names")]
        public IList<string> DisplayNames { get; set; }

        /// <summary>
        /// Gets or sets non required int betwen 0 and 100 exclusive.
        /// </summary>
        [JsonProperty(PropertyName = "capacity")]
        public int? Capacity { get; set; }

        /// <summary>
        /// Gets or sets image URL representing the product.
        /// </summary>
        [JsonProperty(PropertyName = "image")]
        public string Image { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "child")]
        public ChildProduct Child { get; set; }

        /// <summary>
        /// Gets or sets constant string as Enum. Possible values include:
        /// 'constant_string_as_enum'
        /// </summary>
        [JsonProperty(PropertyName = "constStringAsEnum")]
        public EnumConst? ConstStringAsEnum { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "constChild")]
        public static ConstantProduct ConstChild { get; private set; }

        /// <summary>
        /// Constant int
        /// </summary>
        [JsonProperty(PropertyName = "constInt")]
        public static int ConstInt { get; private set; }

        /// <summary>
        /// Constant string
        /// </summary>
        [JsonProperty(PropertyName = "constString")]
        public static string ConstString { get; private set; }

        /// <summary>
        /// Validate the object. Throws ValidationException if validation fails.
        /// </summary>
        public virtual void Validate()
        {
            if (Child == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Child");
            }
            if (this.DisplayNames != null)
            {
                if (this.DisplayNames.Count > 6)
                {
                    throw new ValidationException(ValidationRules.MaxItems, "DisplayNames", 6);
                }
                if (this.DisplayNames.Count < 0)
                {
                    throw new ValidationException(ValidationRules.MinItems, "DisplayNames", 0);
                }
                if (this.DisplayNames.Count != this.DisplayNames.Distinct().Count())
                {
                    throw new ValidationException(ValidationRules.UniqueItems, "DisplayNames");
                }
            }
            if (this.Capacity >= 100)
            {
                throw new ValidationException(ValidationRules.ExclusiveMaximum, "Capacity", 100);
            }
            if (this.Capacity <= 0)
            {
                throw new ValidationException(ValidationRules.ExclusiveMinimum, "Capacity", 0);
            }
            if (this.Image != null)
            {
                if (!System.Text.RegularExpressions.Regex.IsMatch(this.Image, "http://\\w+"))
                {
                    throw new ValidationException(ValidationRules.Pattern, "Image", "http://\\w+");
                }
            }
        }
    }
}
