// Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Searchservice.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Represents information about the entity (such as Azure SQL table or
    /// DocumentDb collection) that will be indexed.
    /// </summary>
    public partial class DataContainer
    {
        /// <summary>
        /// Initializes a new instance of the DataContainer class.
        /// </summary>
        public DataContainer()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DataContainer class.
        /// </summary>
        /// <param name="name">Gets or sets the name of the table or view (for
        /// Azure SQL data source) or collection (for DocumentDB data source)
        /// that will be indexed.</param>
        /// <param name="query">Gets or sets a query that is applied to this
        /// data container. Only supported by DocumentDb datasources.</param>
        public DataContainer(string name, string query = default(string))
        {
            Name = name;
            Query = query;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the name of the table or view (for Azure SQL data
        /// source) or collection (for DocumentDB data source) that will be
        /// indexed.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets a query that is applied to this data container. Only
        /// supported by DocumentDb datasources.
        /// </summary>
        [JsonProperty(PropertyName = "query")]
        public string Query { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Name == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Name");
            }
        }
    }
}
