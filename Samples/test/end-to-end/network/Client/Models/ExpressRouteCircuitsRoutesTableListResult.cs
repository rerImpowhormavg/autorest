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
    /// Response for ListRoutesTable associated with the Express Route Circuits
    /// API.
    /// </summary>
    public partial class ExpressRouteCircuitsRoutesTableListResult
    {
        /// <summary>
        /// Initializes a new instance of the
        /// ExpressRouteCircuitsRoutesTableListResult class.
        /// </summary>
        public ExpressRouteCircuitsRoutesTableListResult()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// ExpressRouteCircuitsRoutesTableListResult class.
        /// </summary>
        /// <param name="value">The list of routes table.</param>
        /// <param name="nextLink">The URL to get the next set of
        /// results.</param>
        public ExpressRouteCircuitsRoutesTableListResult(IList<ExpressRouteCircuitRoutesTable> value = default(IList<ExpressRouteCircuitRoutesTable>), string nextLink = default(string))
        {
            Value = value;
            NextLink = nextLink;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the list of routes table.
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public IList<ExpressRouteCircuitRoutesTable> Value { get; set; }

        /// <summary>
        /// Gets or sets the URL to get the next set of results.
        /// </summary>
        [JsonProperty(PropertyName = "nextLink")]
        public string NextLink { get; set; }

    }
}
