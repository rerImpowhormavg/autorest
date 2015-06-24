namespace Fixtures.SwaggerBatBodyInteger
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class IntModelExtensions
    {
            /// <summary>
            /// Get null Int value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static int? GetNull(this IIntModel operations)
            {
                return Task.Factory.StartNew(s => ((IIntModel)s).GetNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null Int value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<int?> GetNullAsync( this IIntModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<int?> result = await operations.GetNullWithOperationResponseAsync(cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get invalid Int value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static int? GetInvalid(this IIntModel operations)
            {
                return Task.Factory.StartNew(s => ((IIntModel)s).GetInvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get invalid Int value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<int?> GetInvalidAsync( this IIntModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<int?> result = await operations.GetInvalidWithOperationResponseAsync(cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get overflow Int32 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static int? GetOverflowInt32(this IIntModel operations)
            {
                return Task.Factory.StartNew(s => ((IIntModel)s).GetOverflowInt32Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get overflow Int32 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<int?> GetOverflowInt32Async( this IIntModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<int?> result = await operations.GetOverflowInt32WithOperationResponseAsync(cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get underflow Int32 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static int? GetUnderflowInt32(this IIntModel operations)
            {
                return Task.Factory.StartNew(s => ((IIntModel)s).GetUnderflowInt32Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get underflow Int32 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<int?> GetUnderflowInt32Async( this IIntModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<int?> result = await operations.GetUnderflowInt32WithOperationResponseAsync(cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get overflow Int64 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static long? GetOverflowInt64(this IIntModel operations)
            {
                return Task.Factory.StartNew(s => ((IIntModel)s).GetOverflowInt64Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get overflow Int64 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<long?> GetOverflowInt64Async( this IIntModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<long?> result = await operations.GetOverflowInt64WithOperationResponseAsync(cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get underflow Int64 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static long? GetUnderflowInt64(this IIntModel operations)
            {
                return Task.Factory.StartNew(s => ((IIntModel)s).GetUnderflowInt64Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get underflow Int64 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<long?> GetUnderflowInt64Async( this IIntModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<long?> result = await operations.GetUnderflowInt64WithOperationResponseAsync(cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Put max int32 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='intBody'>
            /// </param>
            public static void PutMax32(this IIntModel operations, int? intBody)
            {
                Task.Factory.StartNew(s => ((IIntModel)s).PutMax32Async(intBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put max int32 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='intBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutMax32Async( this IIntModel operations, int? intBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutMax32WithOperationResponseAsync(intBody, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Put max int64 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='intBody'>
            /// </param>
            public static void PutMax64(this IIntModel operations, long? intBody)
            {
                Task.Factory.StartNew(s => ((IIntModel)s).PutMax64Async(intBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put max int64 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='intBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutMax64Async( this IIntModel operations, long? intBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutMax64WithOperationResponseAsync(intBody, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Put min int32 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='intBody'>
            /// </param>
            public static void PutMin32(this IIntModel operations, int? intBody)
            {
                Task.Factory.StartNew(s => ((IIntModel)s).PutMin32Async(intBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put min int32 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='intBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutMin32Async( this IIntModel operations, int? intBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutMin32WithOperationResponseAsync(intBody, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Put min int64 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='intBody'>
            /// </param>
            public static void PutMin64(this IIntModel operations, long? intBody)
            {
                Task.Factory.StartNew(s => ((IIntModel)s).PutMin64Async(intBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put min int64 value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='intBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutMin64Async( this IIntModel operations, long? intBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutMin64WithOperationResponseAsync(intBody, cancellationToken).ConfigureAwait(false);
            }

    }
}
