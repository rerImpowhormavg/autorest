// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Searchservice.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Represents credentials that can be used to connect to a datasource.
    /// </summary>
    public partial class DataSourceCredentials
    {
        /// <summary>
        /// Initializes a new instance of the DataSourceCredentials class.
        /// </summary>
        public DataSourceCredentials()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DataSourceCredentials class.
        /// </summary>
        /// <param name="connectionString">Gets or sets the connection string
        /// for the datasource.</param>
        public DataSourceCredentials(string connectionString)
        {
            ConnectionString = connectionString;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the connection string for the datasource.
        /// </summary>
        [JsonProperty(PropertyName = "connectionString")]
        public string ConnectionString { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (ConnectionString == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "ConnectionString");
            }
        }
    }
}
