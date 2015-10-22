// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyComplex
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class InheritanceExtensions
    {
            /// <summary>
            /// Get complex types that extend others
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static Siamese GetValid(this IInheritance operations)
            {
                return Task.Factory.StartNew(s => ((IInheritance)s).GetValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get complex types that extend others
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Siamese> GetValidAsync( this IInheritance operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Siamese> result = await operations.GetValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Put complex types that extend others
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='complexBody'>
            /// Please put a siamese with id=2, name="Siameee", color=green,
            /// breed=persion, which hates 2 dogs, the 1st one named "Potato" with id=1
            /// and food="tomato", and the 2nd one named "Tomato" with id=-1 and
            /// food="french fries".
            /// </param>
            public static void PutValid(this IInheritance operations, Siamese complexBody)
            {
                Task.Factory.StartNew(s => ((IInheritance)s).PutValidAsync(complexBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put complex types that extend others
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='complexBody'>
            /// Please put a siamese with id=2, name="Siameee", color=green,
            /// breed=persion, which hates 2 dogs, the 1st one named "Potato" with id=1
            /// and food="tomato", and the 2nd one named "Tomato" with id=-1 and
            /// food="french fries".
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutValidAsync( this IInheritance operations, Siamese complexBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutValidWithHttpMessagesAsync(complexBody, null, cancellationToken).ConfigureAwait(false);
            }

    }
}
