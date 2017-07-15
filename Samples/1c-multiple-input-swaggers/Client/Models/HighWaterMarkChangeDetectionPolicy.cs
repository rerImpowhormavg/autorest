// Code generated by Microsoft (R) AutoRest Code Generator 1.2.1.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Searchservice.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Defines a data change detection policy that captures changes based on
    /// the value of a high water mark column.
    /// </summary>
    [Newtonsoft.Json.JsonObject("#Microsoft.Azure.Search.HighWaterMarkChangeDetectionPolicy")]
    public partial class HighWaterMarkChangeDetectionPolicy : DataChangeDetectionPolicy
    {
        /// <summary>
        /// Initializes a new instance of the
        /// HighWaterMarkChangeDetectionPolicy class.
        /// </summary>
        public HighWaterMarkChangeDetectionPolicy()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// HighWaterMarkChangeDetectionPolicy class.
        /// </summary>
        /// <param name="highWaterMarkColumnName">Gets or sets the name of the
        /// high water mark column.</param>
        public HighWaterMarkChangeDetectionPolicy(string highWaterMarkColumnName)
        {
            HighWaterMarkColumnName = highWaterMarkColumnName;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the name of the high water mark column.
        /// </summary>
        [JsonProperty(PropertyName = "highWaterMarkColumnName")]
        public string HighWaterMarkColumnName { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (HighWaterMarkColumnName == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "HighWaterMarkColumnName");
            }
        }
    }
}
