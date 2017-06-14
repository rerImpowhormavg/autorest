// Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace SharedHeaders
{
    using Microsoft.Rest;
    using Microsoft.Rest.Azure;
    using Models;
    using System.Threading;
    using System.Threading.Tasks;

    /// <summary>
    /// Extension methods for BatchAccountOperations.
    /// </summary>
    public static partial class BatchAccountOperationsExtensions
    {
            /// <summary>
            /// Creates a new Batch account with the specified parameters. Existing
            /// accounts cannot be updated with this API and should instead be updated with
            /// the Update Batch Account API.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// A name for the Batch account which must be unique within the region. Batch
            /// account names must be between 3 and 24 characters in length and must use
            /// only numbers and lowercase letters. This name is used as part of the DNS
            /// name that is used to access the Batch service in the region in which the
            /// account is created. For example:
            /// http://accountname.region.batch.azure.com/.
            /// </param>
            /// <param name='parameters'>
            /// Additional parameters for account creation.
            /// </param>
            public static BatchAccount Create(this IBatchAccountOperations operations, string resourceGroupName, string accountName, BatchAccountCreateParameters parameters)
            {
                return operations.CreateAsync(resourceGroupName, accountName, parameters).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Creates a new Batch account with the specified parameters. Existing
            /// accounts cannot be updated with this API and should instead be updated with
            /// the Update Batch Account API.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// A name for the Batch account which must be unique within the region. Batch
            /// account names must be between 3 and 24 characters in length and must use
            /// only numbers and lowercase letters. This name is used as part of the DNS
            /// name that is used to access the Batch service in the region in which the
            /// account is created. For example:
            /// http://accountname.region.batch.azure.com/.
            /// </param>
            /// <param name='parameters'>
            /// Additional parameters for account creation.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<BatchAccount> CreateAsync(this IBatchAccountOperations operations, string resourceGroupName, string accountName, BatchAccountCreateParameters parameters, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.CreateWithHttpMessagesAsync(resourceGroupName, accountName, parameters, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Updates the properties of an existing Batch account.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// The name of the Batch account.
            /// </param>
            /// <param name='parameters'>
            /// Additional parameters for account update.
            /// </param>
            public static BatchAccount Update(this IBatchAccountOperations operations, string resourceGroupName, string accountName, BatchAccountUpdateParameters parameters)
            {
                return operations.UpdateAsync(resourceGroupName, accountName, parameters).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Updates the properties of an existing Batch account.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// The name of the Batch account.
            /// </param>
            /// <param name='parameters'>
            /// Additional parameters for account update.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<BatchAccount> UpdateAsync(this IBatchAccountOperations operations, string resourceGroupName, string accountName, BatchAccountUpdateParameters parameters, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.UpdateWithHttpMessagesAsync(resourceGroupName, accountName, parameters, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Deletes the specified Batch account.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// The name of the Batch account.
            /// </param>
            public static RetryHeader Delete(this IBatchAccountOperations operations, string resourceGroupName, string accountName)
            {
                return operations.DeleteAsync(resourceGroupName, accountName).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Deletes the specified Batch account.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// The name of the Batch account.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<RetryHeader> DeleteAsync(this IBatchAccountOperations operations, string resourceGroupName, string accountName, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.DeleteWithHttpMessagesAsync(resourceGroupName, accountName, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Headers;
                }
            }

            /// <summary>
            /// Gets information about the specified Batch account.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// The name of the Batch account.
            /// </param>
            public static BatchAccount Get(this IBatchAccountOperations operations, string resourceGroupName, string accountName)
            {
                return operations.GetAsync(resourceGroupName, accountName).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Gets information about the specified Batch account.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// The name of the Batch account.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<BatchAccount> GetAsync(this IBatchAccountOperations operations, string resourceGroupName, string accountName, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetWithHttpMessagesAsync(resourceGroupName, accountName, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Creates a new Batch account with the specified parameters. Existing
            /// accounts cannot be updated with this API and should instead be updated with
            /// the Update Batch Account API.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// A name for the Batch account which must be unique within the region. Batch
            /// account names must be between 3 and 24 characters in length and must use
            /// only numbers and lowercase letters. This name is used as part of the DNS
            /// name that is used to access the Batch service in the region in which the
            /// account is created. For example:
            /// http://accountname.region.batch.azure.com/.
            /// </param>
            /// <param name='parameters'>
            /// Additional parameters for account creation.
            /// </param>
            public static BatchAccount BeginCreate(this IBatchAccountOperations operations, string resourceGroupName, string accountName, BatchAccountCreateParameters parameters)
            {
                return operations.BeginCreateAsync(resourceGroupName, accountName, parameters).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Creates a new Batch account with the specified parameters. Existing
            /// accounts cannot be updated with this API and should instead be updated with
            /// the Update Batch Account API.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// A name for the Batch account which must be unique within the region. Batch
            /// account names must be between 3 and 24 characters in length and must use
            /// only numbers and lowercase letters. This name is used as part of the DNS
            /// name that is used to access the Batch service in the region in which the
            /// account is created. For example:
            /// http://accountname.region.batch.azure.com/.
            /// </param>
            /// <param name='parameters'>
            /// Additional parameters for account creation.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<BatchAccount> BeginCreateAsync(this IBatchAccountOperations operations, string resourceGroupName, string accountName, BatchAccountCreateParameters parameters, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.BeginCreateWithHttpMessagesAsync(resourceGroupName, accountName, parameters, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Deletes the specified Batch account.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// The name of the Batch account.
            /// </param>
            public static RetryHeader BeginDelete(this IBatchAccountOperations operations, string resourceGroupName, string accountName)
            {
                return operations.BeginDeleteAsync(resourceGroupName, accountName).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Deletes the specified Batch account.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group that contains the Batch account.
            /// </param>
            /// <param name='accountName'>
            /// The name of the Batch account.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<RetryHeader> BeginDeleteAsync(this IBatchAccountOperations operations, string resourceGroupName, string accountName, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.BeginDeleteWithHttpMessagesAsync(resourceGroupName, accountName, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Headers;
                }
            }

    }
}
