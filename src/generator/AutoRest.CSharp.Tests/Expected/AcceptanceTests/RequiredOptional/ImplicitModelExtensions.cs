// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsRequiredOptional
{
    using System.Threading.Tasks;
   using Models;

    /// <summary>
    /// Extension methods for ImplicitModel.
    /// </summary>
    public static partial class ImplicitModelExtensions
    {
            /// <summary>
            /// Test implicitly required path parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='pathParameter'>
            /// </param>
            public static Error GetRequiredPath(this IImplicitModel operations, string pathParameter)
            {
                return System.Threading.Tasks.Task.Factory.StartNew(s => ((IImplicitModel)s).GetRequiredPathAsync(pathParameter), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None, System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Test implicitly required path parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='pathParameter'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task<Error> GetRequiredPathAsync(this IImplicitModel operations, string pathParameter, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                using (var _result = await operations.GetRequiredPathWithHttpMessagesAsync(pathParameter, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Test implicitly optional query parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='queryParameter'>
            /// </param>
            public static void PutOptionalQuery(this IImplicitModel operations, string queryParameter = default(string))
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IImplicitModel)s).PutOptionalQueryAsync(queryParameter), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Test implicitly optional query parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='queryParameter'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task PutOptionalQueryAsync(this IImplicitModel operations, string queryParameter = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.PutOptionalQueryWithHttpMessagesAsync(queryParameter, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Test implicitly optional header parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='queryParameter'>
            /// </param>
            public static void PutOptionalHeader(this IImplicitModel operations, string queryParameter = default(string))
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IImplicitModel)s).PutOptionalHeaderAsync(queryParameter), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Test implicitly optional header parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='queryParameter'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task PutOptionalHeaderAsync(this IImplicitModel operations, string queryParameter = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.PutOptionalHeaderWithHttpMessagesAsync(queryParameter, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Test implicitly optional body parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='bodyParameter'>
            /// </param>
            public static void PutOptionalBody(this IImplicitModel operations, string bodyParameter = default(string))
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IImplicitModel)s).PutOptionalBodyAsync(bodyParameter), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Test implicitly optional body parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='bodyParameter'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task PutOptionalBodyAsync(this IImplicitModel operations, string bodyParameter = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.PutOptionalBodyWithHttpMessagesAsync(bodyParameter, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Test implicitly required path parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static Error GetRequiredGlobalPath(this IImplicitModel operations)
            {
                return System.Threading.Tasks.Task.Factory.StartNew(s => ((IImplicitModel)s).GetRequiredGlobalPathAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None, System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Test implicitly required path parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task<Error> GetRequiredGlobalPathAsync(this IImplicitModel operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                using (var _result = await operations.GetRequiredGlobalPathWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Test implicitly required query parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static Error GetRequiredGlobalQuery(this IImplicitModel operations)
            {
                return System.Threading.Tasks.Task.Factory.StartNew(s => ((IImplicitModel)s).GetRequiredGlobalQueryAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None, System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Test implicitly required query parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task<Error> GetRequiredGlobalQueryAsync(this IImplicitModel operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                using (var _result = await operations.GetRequiredGlobalQueryWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Test implicitly optional query parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static Error GetOptionalGlobalQuery(this IImplicitModel operations)
            {
                return System.Threading.Tasks.Task.Factory.StartNew(s => ((IImplicitModel)s).GetOptionalGlobalQueryAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None, System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Test implicitly optional query parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task<Error> GetOptionalGlobalQueryAsync(this IImplicitModel operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                using (var _result = await operations.GetOptionalGlobalQueryWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

    }
}
