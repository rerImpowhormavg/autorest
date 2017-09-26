// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ApplicationGateway.Models
{
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Network security rule.
    /// </summary>
    [JsonTransformation]
    public partial class SecurityRule : SubResource
    {
        /// <summary>
        /// Initializes a new instance of the SecurityRule class.
        /// </summary>
        public SecurityRule()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the SecurityRule class.
        /// </summary>
        /// <param name="protocol">Network protocol this rule applies to.
        /// Possible values are 'Tcp', 'Udp', and '*'. Possible values include:
        /// 'Tcp', 'Udp', '*'</param>
        /// <param name="sourceAddressPrefix">The CIDR or source IP range.
        /// Asterix '*' can also be used to match all source IPs. Default tags
        /// such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can
        /// also be used. If this is an ingress rule, specifies where network
        /// traffic originates from. </param>
        /// <param name="destinationAddressPrefix">The destination address
        /// prefix. CIDR or source IP range. Asterix '*' can also be used to
        /// match all source IPs. Default tags such as 'VirtualNetwork',
        /// 'AzureLoadBalancer' and 'Internet' can also be used.</param>
        /// <param name="access">The network traffic is allowed or denied.
        /// Possible values are: 'Allow' and 'Deny'. Possible values include:
        /// 'Allow', 'Deny'</param>
        /// <param name="direction">The direction of the rule. The direction
        /// specifies if rule will be evaluated on incoming or outcoming
        /// traffic. Possible values are: 'Inbound' and 'Outbound'. Possible
        /// values include: 'Inbound', 'Outbound'</param>
        /// <param name="id">Resource ID.</param>
        /// <param name="description">A description for this rule. Restricted
        /// to 140 chars.</param>
        /// <param name="sourcePortRange">The source port or range. Integer or
        /// range between 0 and 65535. Asterix '*' can also be used to match
        /// all ports.</param>
        /// <param name="destinationPortRange">The destination port or range.
        /// Integer or range between 0 and 65535. Asterix '*' can also be used
        /// to match all ports.</param>
        /// <param name="priority">The priority of the rule. The value can be
        /// between 100 and 4096. The priority number must be unique for each
        /// rule in the collection. The lower the priority number, the higher
        /// the priority of the rule.</param>
        /// <param name="provisioningState">The provisioning state of the
        /// public IP resource. Possible values are: 'Updating', 'Deleting',
        /// and 'Failed'.</param>
        /// <param name="name">The name of the resource that is unique within a
        /// resource group. This name can be used to access the
        /// resource.</param>
        /// <param name="etag">A unique read-only string that changes whenever
        /// the resource is updated.</param>
        public SecurityRule(string protocol, string sourceAddressPrefix, string destinationAddressPrefix, string access, string direction, string id = default(string), string description = default(string), string sourcePortRange = default(string), string destinationPortRange = default(string), int? priority = default(int?), string provisioningState = default(string), string name = default(string), string etag = default(string))
            : base(id)
        {
            Description = description;
            Protocol = protocol;
            SourcePortRange = sourcePortRange;
            DestinationPortRange = destinationPortRange;
            SourceAddressPrefix = sourceAddressPrefix;
            DestinationAddressPrefix = destinationAddressPrefix;
            Access = access;
            Priority = priority;
            Direction = direction;
            ProvisioningState = provisioningState;
            Name = name;
            Etag = etag;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets a description for this rule. Restricted to 140 chars.
        /// </summary>
        [JsonProperty(PropertyName = "properties.description")]
        public string Description { get; set; }

        /// <summary>
        /// Gets or sets network protocol this rule applies to. Possible values
        /// are 'Tcp', 'Udp', and '*'. Possible values include: 'Tcp', 'Udp',
        /// '*'
        /// </summary>
        [JsonProperty(PropertyName = "properties.protocol")]
        public string Protocol { get; set; }

        /// <summary>
        /// Gets or sets the source port or range. Integer or range between 0
        /// and 65535. Asterix '*' can also be used to match all ports.
        /// </summary>
        [JsonProperty(PropertyName = "properties.sourcePortRange")]
        public string SourcePortRange { get; set; }

        /// <summary>
        /// Gets or sets the destination port or range. Integer or range
        /// between 0 and 65535. Asterix '*' can also be used to match all
        /// ports.
        /// </summary>
        [JsonProperty(PropertyName = "properties.destinationPortRange")]
        public string DestinationPortRange { get; set; }

        /// <summary>
        /// Gets or sets the CIDR or source IP range. Asterix '*' can also be
        /// used to match all source IPs. Default tags such as
        /// 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be
        /// used. If this is an ingress rule, specifies where network traffic
        /// originates from.
        /// </summary>
        [JsonProperty(PropertyName = "properties.sourceAddressPrefix")]
        public string SourceAddressPrefix { get; set; }

        /// <summary>
        /// Gets or sets the destination address prefix. CIDR or source IP
        /// range. Asterix '*' can also be used to match all source IPs.
        /// Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and
        /// 'Internet' can also be used.
        /// </summary>
        [JsonProperty(PropertyName = "properties.destinationAddressPrefix")]
        public string DestinationAddressPrefix { get; set; }

        /// <summary>
        /// Gets or sets the network traffic is allowed or denied. Possible
        /// values are: 'Allow' and 'Deny'. Possible values include: 'Allow',
        /// 'Deny'
        /// </summary>
        [JsonProperty(PropertyName = "properties.access")]
        public string Access { get; set; }

        /// <summary>
        /// Gets or sets the priority of the rule. The value can be between 100
        /// and 4096. The priority number must be unique for each rule in the
        /// collection. The lower the priority number, the higher the priority
        /// of the rule.
        /// </summary>
        [JsonProperty(PropertyName = "properties.priority")]
        public int? Priority { get; set; }

        /// <summary>
        /// Gets or sets the direction of the rule. The direction specifies if
        /// rule will be evaluated on incoming or outcoming traffic. Possible
        /// values are: 'Inbound' and 'Outbound'. Possible values include:
        /// 'Inbound', 'Outbound'
        /// </summary>
        [JsonProperty(PropertyName = "properties.direction")]
        public string Direction { get; set; }

        /// <summary>
        /// Gets or sets the provisioning state of the public IP resource.
        /// Possible values are: 'Updating', 'Deleting', and 'Failed'.
        /// </summary>
        [JsonProperty(PropertyName = "properties.provisioningState")]
        public string ProvisioningState { get; set; }

        /// <summary>
        /// Gets or sets the name of the resource that is unique within a
        /// resource group. This name can be used to access the resource.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets a unique read-only string that changes whenever the
        /// resource is updated.
        /// </summary>
        [JsonProperty(PropertyName = "etag")]
        public string Etag { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Protocol == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Protocol");
            }
            if (SourceAddressPrefix == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "SourceAddressPrefix");
            }
            if (DestinationAddressPrefix == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "DestinationAddressPrefix");
            }
            if (Access == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Access");
            }
            if (Direction == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Direction");
            }
        }
    }
}
