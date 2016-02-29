
namespace Petstore.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Microsoft.Rest.Azure;

    /// <summary>
    /// The parameters to update on the account.
    /// </summary>
    public partial class StorageAccountUpdateParameters : IResource
    {
        /// <summary>
        /// Initializes a new instance of the StorageAccountUpdateParameters
        /// class.
        /// </summary>
        public StorageAccountUpdateParameters() { }

        /// <summary>
        /// Initializes a new instance of the StorageAccountUpdateParameters
        /// class.
        /// </summary>
        public StorageAccountUpdateParameters(IDictionary<string, string> tags = default(IDictionary<string, string>), AccountType? accountType = default(AccountType?), CustomDomain customDomain = default(CustomDomain))
        {
            Tags = tags;
            AccountType = accountType;
            CustomDomain = customDomain;
        }

        /// <summary>
        /// Resource tags
        /// </summary>
        [JsonProperty(PropertyName = "tags")]
        public IDictionary<string, string> Tags { get; set; }

        /// <summary>
        /// Gets or sets the account type. Note that StandardZRS and
        /// PremiumLRS accounts cannot be changed to other account types, and
        /// other account types cannot be changed to StandardZRS or
        /// PremiumLRS. Possible values include: 'Standard_LRS',
        /// 'Standard_ZRS', 'Standard_GRS', 'Standard_RAGRS', 'Premium_LRS'
        /// </summary>
        [JsonProperty(PropertyName = "properties.accountType")]
        public AccountType? AccountType { get; set; }

        /// <summary>
        /// User domain assigned to the storage account. Name is the CNAME
        /// source. Only one custom domain is supported per storage account
        /// at this time. To clear the existing custom domain, use an empty
        /// string for the custom domain name property.
        /// </summary>
        [JsonProperty(PropertyName = "properties.customDomain")]
        public CustomDomain CustomDomain { get; set; }

        /// <summary>
        /// Validate the object. Throws ValidationException if validation fails.
        /// </summary>
        public virtual void Validate()
        {
            if (this.CustomDomain != null)
            {
                this.CustomDomain.Validate();
            }
        }
    }
}
