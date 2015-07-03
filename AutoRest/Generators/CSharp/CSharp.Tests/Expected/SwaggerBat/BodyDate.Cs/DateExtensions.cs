namespace Fixtures.SwaggerBatBodyDate
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class DateExtensions
    {
            /// <summary>
            /// Get null date value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static DateTime? GetNull(this IDate operations)
            {
                return Task.Factory.StartNew(s => ((IDate)s).GetNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null date value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<DateTime?> GetNullAsync( this IDate operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<DateTime?> result = await operations.GetNullWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get invalid date value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static DateTime? GetInvalidDate(this IDate operations)
            {
                return Task.Factory.StartNew(s => ((IDate)s).GetInvalidDateAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get invalid date value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<DateTime?> GetInvalidDateAsync( this IDate operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<DateTime?> result = await operations.GetInvalidDateWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get overflow date value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static DateTime? GetOverflowDate(this IDate operations)
            {
                return Task.Factory.StartNew(s => ((IDate)s).GetOverflowDateAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get overflow date value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<DateTime?> GetOverflowDateAsync( this IDate operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<DateTime?> result = await operations.GetOverflowDateWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get underflow date value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static DateTime? GetUnderflowDate(this IDate operations)
            {
                return Task.Factory.StartNew(s => ((IDate)s).GetUnderflowDateAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get underflow date value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<DateTime?> GetUnderflowDateAsync( this IDate operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<DateTime?> result = await operations.GetUnderflowDateWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Put max date value 9999-12-31
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='dateBody'>
            /// </param>
            public static void PutMaxDate(this IDate operations, DateTime? dateBody)
            {
                Task.Factory.StartNew(s => ((IDate)s).PutMaxDateAsync(dateBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put max date value 9999-12-31
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='dateBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutMaxDateAsync( this IDate operations, DateTime? dateBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutMaxDateWithOperationResponseAsync(dateBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get max date value 9999-12-31
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static DateTime? GetMaxDate(this IDate operations)
            {
                return Task.Factory.StartNew(s => ((IDate)s).GetMaxDateAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get max date value 9999-12-31
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<DateTime?> GetMaxDateAsync( this IDate operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<DateTime?> result = await operations.GetMaxDateWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Put min date value 0000-01-01
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='dateBody'>
            /// </param>
            public static void PutMinDate(this IDate operations, DateTime? dateBody)
            {
                Task.Factory.StartNew(s => ((IDate)s).PutMinDateAsync(dateBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put min date value 0000-01-01
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='dateBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutMinDateAsync( this IDate operations, DateTime? dateBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutMinDateWithOperationResponseAsync(dateBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get min date value 0000-01-01
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static DateTime? GetMinDate(this IDate operations)
            {
                return Task.Factory.StartNew(s => ((IDate)s).GetMinDateAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get min date value 0000-01-01
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<DateTime?> GetMinDateAsync( this IDate operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<DateTime?> result = await operations.GetMinDateWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

    }
}
