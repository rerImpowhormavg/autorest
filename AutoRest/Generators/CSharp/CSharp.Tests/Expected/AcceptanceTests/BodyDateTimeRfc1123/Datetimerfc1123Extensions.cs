// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyDateTimeRfc1123
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// Extension methods for Datetimerfc1123.
    /// </summary>
    public static partial class Datetimerfc1123Extensions
    {
            /// <summary>
            /// Get null datetime value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static DateTime? GetNull(this IDatetimerfc1123 operations)
            {
                return Task.Factory.StartNew(s => ((IDatetimerfc1123)s).GetNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null datetime value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<DateTime?> GetNullAsync(this IDatetimerfc1123 operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Get invalid datetime value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static DateTime? GetInvalid(this IDatetimerfc1123 operations)
            {
                return Task.Factory.StartNew(s => ((IDatetimerfc1123)s).GetInvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get invalid datetime value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<DateTime?> GetInvalidAsync(this IDatetimerfc1123 operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetInvalidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Get overflow datetime value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static DateTime? GetOverflow(this IDatetimerfc1123 operations)
            {
                return Task.Factory.StartNew(s => ((IDatetimerfc1123)s).GetOverflowAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get overflow datetime value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<DateTime?> GetOverflowAsync(this IDatetimerfc1123 operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetOverflowWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Get underflow datetime value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static DateTime? GetUnderflow(this IDatetimerfc1123 operations)
            {
                return Task.Factory.StartNew(s => ((IDatetimerfc1123)s).GetUnderflowAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get underflow datetime value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<DateTime?> GetUnderflowAsync(this IDatetimerfc1123 operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetUnderflowWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='datetimeBody'>
            /// </param>
            public static void PutUtcMaxDateTime(this IDatetimerfc1123 operations, DateTime datetimeBody)
            {
                Task.Factory.StartNew(s => ((IDatetimerfc1123)s).PutUtcMaxDateTimeAsync(datetimeBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='datetimeBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutUtcMaxDateTimeAsync(this IDatetimerfc1123 operations, DateTime datetimeBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutUtcMaxDateTimeWithHttpMessagesAsync(datetimeBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get max datetime value fri, 31 dec 9999 23:59:59 gmt
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static DateTime? GetUtcLowercaseMaxDateTime(this IDatetimerfc1123 operations)
            {
                return Task.Factory.StartNew(s => ((IDatetimerfc1123)s).GetUtcLowercaseMaxDateTimeAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get max datetime value fri, 31 dec 9999 23:59:59 gmt
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<DateTime?> GetUtcLowercaseMaxDateTimeAsync(this IDatetimerfc1123 operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetUtcLowercaseMaxDateTimeWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static DateTime? GetUtcUppercaseMaxDateTime(this IDatetimerfc1123 operations)
            {
                return Task.Factory.StartNew(s => ((IDatetimerfc1123)s).GetUtcUppercaseMaxDateTimeAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<DateTime?> GetUtcUppercaseMaxDateTimeAsync(this IDatetimerfc1123 operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetUtcUppercaseMaxDateTimeWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='datetimeBody'>
            /// </param>
            public static void PutUtcMinDateTime(this IDatetimerfc1123 operations, DateTime datetimeBody)
            {
                Task.Factory.StartNew(s => ((IDatetimerfc1123)s).PutUtcMinDateTimeAsync(datetimeBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='datetimeBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutUtcMinDateTimeAsync(this IDatetimerfc1123 operations, DateTime datetimeBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutUtcMinDateTimeWithHttpMessagesAsync(datetimeBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static DateTime? GetUtcMinDateTime(this IDatetimerfc1123 operations)
            {
                return Task.Factory.StartNew(s => ((IDatetimerfc1123)s).GetUtcMinDateTimeAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<DateTime?> GetUtcMinDateTimeAsync(this IDatetimerfc1123 operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetUtcMinDateTimeWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

    }
}
