// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsAzureCompositeModelClient
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Microsoft.Rest.Azure;
    using Models;

    /// <summary>
    /// Extension methods for PolymorphicrecursiveOperations.
    /// </summary>
    public static partial class PolymorphicrecursiveOperationsExtensions
    {
            /// <summary>
            /// Get complex types that are polymorphic and have recursive references
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static Fish GetValid(this IPolymorphicrecursiveOperations operations)
            {
                return Task.Factory.StartNew(s => ((IPolymorphicrecursiveOperations)s).GetValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get complex types that are polymorphic and have recursive references
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Fish> GetValidAsync(this IPolymorphicrecursiveOperations operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Put complex types that are polymorphic and have recursive references
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='complexBody'>
            /// Please put a salmon that looks like this:
            /// {
            /// "fishtype": "salmon",
            /// "species": "king",
            /// "length": 1,
            /// "age": 1,
            /// "location": "alaska",
            /// "iswild": true,
            /// "siblings": [
            /// {
            /// "fishtype": "shark",
            /// "species": "predator",
            /// "length": 20,
            /// "age": 6,
            /// "siblings": [
            /// {
            /// "fishtype": "salmon",
            /// "species": "coho",
            /// "length": 2,
            /// "age": 2,
            /// "location": "atlantic",
            /// "iswild": true,
            /// "siblings": [
            /// {
            /// "fishtype": "shark",
            /// "species": "predator",
            /// "length": 20,
            /// "age": 6
            /// },
            /// {
            /// "fishtype": "sawshark",
            /// "species": "dangerous",
            /// "length": 10,
            /// "age": 105
            /// }
            /// ]
            /// },
            /// {
            /// "fishtype": "sawshark",
            /// "species": "dangerous",
            /// "length": 10,
            /// "age": 105
            /// }
            /// ]
            /// },
            /// {
            /// "fishtype": "sawshark",
            /// "species": "dangerous",
            /// "length": 10,
            /// "age": 105
            /// }
            /// ]
            /// }
            /// </param>
            public static void PutValid(this IPolymorphicrecursiveOperations operations, Fish complexBody)
            {
                Task.Factory.StartNew(s => ((IPolymorphicrecursiveOperations)s).PutValidAsync(complexBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put complex types that are polymorphic and have recursive references
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='complexBody'>
            /// Please put a salmon that looks like this:
            /// {
            /// "fishtype": "salmon",
            /// "species": "king",
            /// "length": 1,
            /// "age": 1,
            /// "location": "alaska",
            /// "iswild": true,
            /// "siblings": [
            /// {
            /// "fishtype": "shark",
            /// "species": "predator",
            /// "length": 20,
            /// "age": 6,
            /// "siblings": [
            /// {
            /// "fishtype": "salmon",
            /// "species": "coho",
            /// "length": 2,
            /// "age": 2,
            /// "location": "atlantic",
            /// "iswild": true,
            /// "siblings": [
            /// {
            /// "fishtype": "shark",
            /// "species": "predator",
            /// "length": 20,
            /// "age": 6
            /// },
            /// {
            /// "fishtype": "sawshark",
            /// "species": "dangerous",
            /// "length": 10,
            /// "age": 105
            /// }
            /// ]
            /// },
            /// {
            /// "fishtype": "sawshark",
            /// "species": "dangerous",
            /// "length": 10,
            /// "age": 105
            /// }
            /// ]
            /// },
            /// {
            /// "fishtype": "sawshark",
            /// "species": "dangerous",
            /// "length": 10,
            /// "age": 105
            /// }
            /// ]
            /// }
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutValidAsync(this IPolymorphicrecursiveOperations operations, Fish complexBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutValidWithHttpMessagesAsync(complexBody, null, cancellationToken).ConfigureAwait(false);
            }

    }
}
