namespace Fixtures.SwaggerBatBodyComplex
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class BasicOperationsExtensions
    {
            /// <summary>
            /// Get complex type {id: 2, name: 'abc', color: 'YELLOW'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Basic GetValid(this IBasicOperations operations)
            {
                return Task.Factory.StartNew(s => ((IBasicOperations)s).GetValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get complex type {id: 2, name: 'abc', color: 'YELLOW'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Basic> GetValidAsync( this IBasicOperations operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Basic> result = await operations.GetValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Please put {id: 2, name: 'abc', color: 'Magenta'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='complexBody'>
            /// Please put {id: 2, name: 'abc', color: 'Magenta'}
            /// </param>
            public static void PutValid(this IBasicOperations operations, Basic complexBody)
            {
                Task.Factory.StartNew(s => ((IBasicOperations)s).PutValidAsync(complexBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Please put {id: 2, name: 'abc', color: 'Magenta'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='complexBody'>
            /// Please put {id: 2, name: 'abc', color: 'Magenta'}
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutValidAsync( this IBasicOperations operations, Basic complexBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutValidWithHttpMessagesAsync(complexBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get a basic complex type that is invalid for the local strong type
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Basic GetInvalid(this IBasicOperations operations)
            {
                return Task.Factory.StartNew(s => ((IBasicOperations)s).GetInvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get a basic complex type that is invalid for the local strong type
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Basic> GetInvalidAsync( this IBasicOperations operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Basic> result = await operations.GetInvalidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get a basic complex type that is empty
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Basic GetEmpty(this IBasicOperations operations)
            {
                return Task.Factory.StartNew(s => ((IBasicOperations)s).GetEmptyAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get a basic complex type that is empty
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Basic> GetEmptyAsync( this IBasicOperations operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Basic> result = await operations.GetEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get a basic complex type whose properties are null
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Basic GetNull(this IBasicOperations operations)
            {
                return Task.Factory.StartNew(s => ((IBasicOperations)s).GetNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get a basic complex type whose properties are null
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Basic> GetNullAsync( this IBasicOperations operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Basic> result = await operations.GetNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get a basic complex type while the server doesn't provide a response
            /// payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Basic GetNotProvided(this IBasicOperations operations)
            {
                return Task.Factory.StartNew(s => ((IBasicOperations)s).GetNotProvidedAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get a basic complex type while the server doesn't provide a response
            /// payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Basic> GetNotProvidedAsync( this IBasicOperations operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Basic> result = await operations.GetNotProvidedWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

    }
}
