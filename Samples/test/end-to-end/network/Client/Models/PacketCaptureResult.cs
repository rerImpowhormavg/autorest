// Code generated by Microsoft (R) AutoRest Code Generator 1.2.1.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace ApplicationGateway.Models
{
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    /// <summary>
    /// Information about packet capture session.
    /// </summary>
    [JsonTransformation]
    public partial class PacketCaptureResult
    {
        /// <summary>
        /// Initializes a new instance of the PacketCaptureResult class.
        /// </summary>
        public PacketCaptureResult()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the PacketCaptureResult class.
        /// </summary>
        /// <param name="target">The ID of the targeted resource, only VM is
        /// currently supported.</param>
        /// <param name="name">Name of the packet capture session.</param>
        /// <param name="id">ID of the packet capture operation.</param>
        /// <param name="bytesToCapturePerPacket">Number of bytes captured per
        /// packet, the remaining bytes are truncated.</param>
        /// <param name="totalBytesPerSession">Maximum size of the capture
        /// output.</param>
        /// <param name="timeLimitInSeconds">Maximum duration of the capture
        /// session in seconds.</param>
        /// <param name="provisioningState">The provisioning state of the
        /// packet capture session. Possible values include: 'Succeeded',
        /// 'Updating', 'Deleting', 'Failed'</param>
        public PacketCaptureResult(string target, PacketCaptureStorageLocation storageLocation, string name = default(string), string id = default(string), string etag = default(string), int? bytesToCapturePerPacket = default(int?), int? totalBytesPerSession = default(int?), int? timeLimitInSeconds = default(int?), IList<PacketCaptureFilter> filters = default(IList<PacketCaptureFilter>), string provisioningState = default(string))
        {
            Name = name;
            Id = id;
            Etag = etag;
            Target = target;
            BytesToCapturePerPacket = bytesToCapturePerPacket;
            TotalBytesPerSession = totalBytesPerSession;
            TimeLimitInSeconds = timeLimitInSeconds;
            StorageLocation = storageLocation;
            Filters = filters;
            ProvisioningState = provisioningState;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets name of the packet capture session.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; private set; }

        /// <summary>
        /// Gets ID of the packet capture operation.
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public string Id { get; private set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "etag")]
        public string Etag { get; set; }

        /// <summary>
        /// Gets or sets the ID of the targeted resource, only VM is currently
        /// supported.
        /// </summary>
        [JsonProperty(PropertyName = "properties.target")]
        public string Target { get; set; }

        /// <summary>
        /// Gets or sets number of bytes captured per packet, the remaining
        /// bytes are truncated.
        /// </summary>
        [JsonProperty(PropertyName = "properties.bytesToCapturePerPacket")]
        public int? BytesToCapturePerPacket { get; set; }

        /// <summary>
        /// Gets or sets maximum size of the capture output.
        /// </summary>
        [JsonProperty(PropertyName = "properties.totalBytesPerSession")]
        public int? TotalBytesPerSession { get; set; }

        /// <summary>
        /// Gets or sets maximum duration of the capture session in seconds.
        /// </summary>
        [JsonProperty(PropertyName = "properties.timeLimitInSeconds")]
        public int? TimeLimitInSeconds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.storageLocation")]
        public PacketCaptureStorageLocation StorageLocation { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties.filters")]
        public IList<PacketCaptureFilter> Filters { get; set; }

        /// <summary>
        /// Gets or sets the provisioning state of the packet capture session.
        /// Possible values include: 'Succeeded', 'Updating', 'Deleting',
        /// 'Failed'
        /// </summary>
        [JsonProperty(PropertyName = "properties.provisioningState")]
        public string ProvisioningState { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Target == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Target");
            }
            if (StorageLocation == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "StorageLocation");
            }
        }
    }
}
