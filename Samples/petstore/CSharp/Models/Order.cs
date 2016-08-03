
namespace Petstore.Models
{
    using System.Linq;

    public partial class Order
    {
        /// <summary>
        /// Initializes a new instance of the Order class.
        /// </summary>
        public Order() { }

        /// <summary>
        /// Initializes a new instance of the Order class.
        /// </summary>
        /// <param name="status">Order Status. Possible values include:
        /// 'placed', 'approved', 'delivered'</param>
        public Order(System.Int64? id = default(System.Int64?), System.Int64? petId = default(System.Int64?), System.Int32? quantity = default(System.Int32?), System.DateTime? shipDate = default(System.DateTime?), System.String status = default(System.String), System.Boolean? complete = default(System.Boolean?))
        {
            Id = id;
            PetId = petId;
            Quantity = quantity;
            ShipDate = shipDate;
            Status = status;
            Complete = complete;
        }

        /// <summary>
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "id")]
        public System.Int64? Id { get; private set; }

        /// <summary>
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "petId")]
        public System.Int64? PetId { get; set; }

        /// <summary>
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "quantity")]
        public System.Int32? Quantity { get; set; }

        /// <summary>
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "shipDate")]
        public System.DateTime? ShipDate { get; set; }

        /// <summary>
        /// Gets or sets order Status. Possible values include: 'placed',
        /// 'approved', 'delivered'
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "status")]
        public System.String Status { get; set; }

        /// <summary>
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "complete")]
        public System.Boolean? Complete { get; set; }

    }
}
