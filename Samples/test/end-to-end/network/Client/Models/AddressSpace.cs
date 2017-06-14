// Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace ApplicationGateway.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    /// <summary>
    /// AddressSpace contains an array of IP address ranges that can be used by
    /// subnets of the virtual network.
    /// </summary>
    public partial class AddressSpace
    {
        /// <summary>
        /// Initializes a new instance of the AddressSpace class.
        /// </summary>
        public AddressSpace()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AddressSpace class.
        /// </summary>
        /// <param name="addressPrefixes">A list of address blocks reserved for
        /// this virtual network in CIDR notation.</param>
        public AddressSpace(IList<string> addressPrefixes = default(IList<string>))
        {
            AddressPrefixes = addressPrefixes;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets a list of address blocks reserved for this virtual
        /// network in CIDR notation.
        /// </summary>
        [JsonProperty(PropertyName = "addressPrefixes")]
        public IList<string> AddressPrefixes { get; set; }

    }
}
