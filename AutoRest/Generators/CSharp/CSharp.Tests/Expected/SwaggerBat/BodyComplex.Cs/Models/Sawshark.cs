namespace Fixtures.SwaggerBatBodyComplex.Models
{
    using System;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    [JsonObject("sawshark")]    
    public partial class Sawshark : Shark
    {
        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "picture")]
        public byte[] Picture { get; set; }

    }
}
