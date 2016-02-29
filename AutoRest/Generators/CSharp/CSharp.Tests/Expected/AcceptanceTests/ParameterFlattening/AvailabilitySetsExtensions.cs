// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsParameterFlattening
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// Extension methods for AvailabilitySets.
    /// </summary>
    public static partial class AvailabilitySetsExtensions
    {
            /// <summary>
            /// Updates the tags for an availability set.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group.
            /// </param>
            /// <param name='availabilitySetName'>
            /// The name of the storage availability set.
            /// </param>
            /// <param name='tags'>
            /// </param>
            public static void Update(this IAvailabilitySets operations, string resourceGroupName, string availabilitySetName, IDictionary<string, string> tags)
            {
                Task.Factory.StartNew(s => ((IAvailabilitySets)s).UpdateAsync(resourceGroupName, availabilitySetName, tags), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Updates the tags for an availability set.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// The name of the resource group.
            /// </param>
            /// <param name='availabilitySetName'>
            /// The name of the storage availability set.
            /// </param>
            /// <param name='tags'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task UpdateAsync(this IAvailabilitySets operations, string resourceGroupName, string availabilitySetName, IDictionary<string, string> tags, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.UpdateWithHttpMessagesAsync(resourceGroupName, availabilitySetName, tags, null, cancellationToken).ConfigureAwait(false);
            }

    }
}
