// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsAzureSpecials
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Microsoft.Rest.Azure;
    using Models;

    public static partial class SkipUrlEncodingOperationsExtensions
    {
            /// <summary>
            /// Get method with unencoded path parameter with value 'path1/path2/path3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='unencodedPathParam'>
            /// Unencoded path parameter with value 'path1/path2/path3'
            /// </param>
            public static void GetMethodPathValid(this ISkipUrlEncodingOperations operations, string unencodedPathParam)
            {
                Task.Factory.StartNew(s => ((ISkipUrlEncodingOperations)s).GetMethodPathValidAsync(unencodedPathParam), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get method with unencoded path parameter with value 'path1/path2/path3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='unencodedPathParam'>
            /// Unencoded path parameter with value 'path1/path2/path3'
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task GetMethodPathValidAsync( this ISkipUrlEncodingOperations operations, string unencodedPathParam, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetMethodPathValidWithHttpMessagesAsync(unencodedPathParam, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get method with unencoded path parameter with value 'path1/path2/path3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='unencodedPathParam'>
            /// Unencoded path parameter with value 'path1/path2/path3'
            /// </param>
            public static void GetPathPathValid(this ISkipUrlEncodingOperations operations, string unencodedPathParam)
            {
                Task.Factory.StartNew(s => ((ISkipUrlEncodingOperations)s).GetPathPathValidAsync(unencodedPathParam), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get method with unencoded path parameter with value 'path1/path2/path3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='unencodedPathParam'>
            /// Unencoded path parameter with value 'path1/path2/path3'
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task GetPathPathValidAsync( this ISkipUrlEncodingOperations operations, string unencodedPathParam, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetPathPathValidWithHttpMessagesAsync(unencodedPathParam, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get method with unencoded path parameter with value 'path1/path2/path3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='unencodedPathParam'>
            /// An unencoded path parameter with value 'path1/path2/path3'. Possible
            /// values for this parameter include: 'path1/path2/path3'
            /// </param>
            public static void GetSwaggerPathValid(this ISkipUrlEncodingOperations operations, string unencodedPathParam)
            {
                Task.Factory.StartNew(s => ((ISkipUrlEncodingOperations)s).GetSwaggerPathValidAsync(unencodedPathParam), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get method with unencoded path parameter with value 'path1/path2/path3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='unencodedPathParam'>
            /// An unencoded path parameter with value 'path1/path2/path3'. Possible
            /// values for this parameter include: 'path1/path2/path3'
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task GetSwaggerPathValidAsync( this ISkipUrlEncodingOperations operations, string unencodedPathParam, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetSwaggerPathValidWithHttpMessagesAsync(unencodedPathParam, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get method with unencoded query parameter with value
            /// 'value1&amp;q2=value2&amp;q3=value3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='q1'>
            /// Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
            /// </param>
            public static void GetMethodQueryValid(this ISkipUrlEncodingOperations operations, string q1)
            {
                Task.Factory.StartNew(s => ((ISkipUrlEncodingOperations)s).GetMethodQueryValidAsync(q1), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get method with unencoded query parameter with value
            /// 'value1&amp;q2=value2&amp;q3=value3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='q1'>
            /// Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task GetMethodQueryValidAsync( this ISkipUrlEncodingOperations operations, string q1, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetMethodQueryValidWithHttpMessagesAsync(q1, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get method with unencoded query parameter with value null
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='q1'>
            /// Unencoded query parameter with value null
            /// </param>
            public static void GetMethodQueryNull(this ISkipUrlEncodingOperations operations, string q1 = default(string))
            {
                Task.Factory.StartNew(s => ((ISkipUrlEncodingOperations)s).GetMethodQueryNullAsync(q1), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get method with unencoded query parameter with value null
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='q1'>
            /// Unencoded query parameter with value null
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task GetMethodQueryNullAsync( this ISkipUrlEncodingOperations operations, string q1 = default(string), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetMethodQueryNullWithHttpMessagesAsync(q1, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get method with unencoded query parameter with value
            /// 'value1&amp;q2=value2&amp;q3=value3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='q1'>
            /// Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
            /// </param>
            public static void GetPathQueryValid(this ISkipUrlEncodingOperations operations, string q1)
            {
                Task.Factory.StartNew(s => ((ISkipUrlEncodingOperations)s).GetPathQueryValidAsync(q1), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get method with unencoded query parameter with value
            /// 'value1&amp;q2=value2&amp;q3=value3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='q1'>
            /// Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task GetPathQueryValidAsync( this ISkipUrlEncodingOperations operations, string q1, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetPathQueryValidWithHttpMessagesAsync(q1, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get method with unencoded query parameter with value
            /// 'value1&amp;q2=value2&amp;q3=value3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='q1'>
            /// An unencoded query parameter with value
            /// 'value1&amp;q2=value2&amp;q3=value3'. Possible values for this parameter
            /// include: 'value1&amp;q2=value2&amp;q3=value3'
            /// </param>
            public static void GetSwaggerQueryValid(this ISkipUrlEncodingOperations operations, string q1 = default(string))
            {
                Task.Factory.StartNew(s => ((ISkipUrlEncodingOperations)s).GetSwaggerQueryValidAsync(q1), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get method with unencoded query parameter with value
            /// 'value1&amp;q2=value2&amp;q3=value3'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='q1'>
            /// An unencoded query parameter with value
            /// 'value1&amp;q2=value2&amp;q3=value3'. Possible values for this parameter
            /// include: 'value1&amp;q2=value2&amp;q3=value3'
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task GetSwaggerQueryValidAsync( this ISkipUrlEncodingOperations operations, string q1 = default(string), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetSwaggerQueryValidWithHttpMessagesAsync(q1, null, cancellationToken).ConfigureAwait(false);
            }

    }
}
