// Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Storage.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    /// <summary>
    /// The list storage accounts operation response.
    /// </summary>
    public partial class StorageAccountListResult
    {
        /// <summary>
        /// Initializes a new instance of the StorageAccountListResult class.
        /// </summary>
        public StorageAccountListResult()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the StorageAccountListResult class.
        /// </summary>
        /// <param name="value">Gets the list of storage accounts and their
        /// properties.</param>
        public StorageAccountListResult(IList<StorageAccount> value = default(IList<StorageAccount>))
        {
            Value = value;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets the list of storage accounts and their properties.
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public IList<StorageAccount> Value { get; set; }

    }
}
