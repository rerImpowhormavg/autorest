namespace Fixtures.Azure.SwaggerBatSubscriptionIdApiVersion
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Microsoft.Azure;
    using Models;

    public static partial class GroupOperationsExtensions
    {
            /// <summary>
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='resourceGroupName'>
            /// Resource Group Id.
            /// </param>
            public static SampleResourceGroup GetSampleResourceGroup(this IGroupOperations operations, string resourceGroupName)
            {
                return Task.Factory.StartNew(s => ((IGroupOperations)s).GetSampleResourceGroupAsync(resourceGroupName), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='resourceGroupName'>
            /// Resource Group Id.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<SampleResourceGroup> GetSampleResourceGroupAsync( this IGroupOperations operations, string resourceGroupName, CancellationToken cancellationToken = default(CancellationToken))
            {
                AzureOperationResponse<SampleResourceGroup> result = await operations.GetSampleResourceGroupWithOperationResponseAsync(resourceGroupName, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

    }
}
