// Code generated by Microsoft (R) AutoRest Code Generator 1.2.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace ApplicationGateway.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Connection draining allows open connections to a backend server to be
    /// active for a specified time after the backend server got removed from
    /// the configuration.
    /// </summary>
    public partial class ApplicationGatewayConnectionDraining
    {
        /// <summary>
        /// Initializes a new instance of the
        /// ApplicationGatewayConnectionDraining class.
        /// </summary>
        public ApplicationGatewayConnectionDraining()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// ApplicationGatewayConnectionDraining class.
        /// </summary>
        /// <param name="enabled">Whether connection draining is enabled or
        /// not.</param>
        /// <param name="drainTimeoutInSec">The number of seconds connection
        /// draining is active. Acceptable values are from 1 second to 3600
        /// seconds.</param>
        public ApplicationGatewayConnectionDraining(bool enabled, int drainTimeoutInSec)
        {
            Enabled = enabled;
            DrainTimeoutInSec = drainTimeoutInSec;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets whether connection draining is enabled or not.
        /// </summary>
        [JsonProperty(PropertyName = "enabled")]
        public bool Enabled { get; set; }

        /// <summary>
        /// Gets or sets the number of seconds connection draining is active.
        /// Acceptable values are from 1 second to 3600 seconds.
        /// </summary>
        [JsonProperty(PropertyName = "drainTimeoutInSec")]
        public int DrainTimeoutInSec { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (DrainTimeoutInSec > 3600)
            {
                throw new ValidationException(ValidationRules.InclusiveMaximum, "DrainTimeoutInSec", 3600);
            }
            if (DrainTimeoutInSec < 1)
            {
                throw new ValidationException(ValidationRules.InclusiveMinimum, "DrainTimeoutInSec", 1);
            }
        }
    }
}
