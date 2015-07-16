namespace Fixtures.SwaggerBatBodyArray
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class ArrayExtensions
    {
            /// <summary>
            /// Get null array value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<int?> GetNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null array value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<int?>> GetNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<int?>> result = await operations.GetNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get invalid array [1, 2, 3
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<int?> GetInvalid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetInvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get invalid array [1, 2, 3
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<int?>> GetInvalidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<int?>> result = await operations.GetInvalidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get empty array value []
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<int?> GetEmpty(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetEmptyAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get empty array value []
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<int?>> GetEmptyAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<int?>> result = await operations.GetEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set array value empty []
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutEmpty(this IArray operations, IList<string> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutEmptyAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set array value empty []
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutEmptyAsync( this IArray operations, IList<string> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutEmptyWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get boolean array value [true, false, false, true]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<bool?> GetBooleanTfft(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetBooleanTfftAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get boolean array value [true, false, false, true]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<bool?>> GetBooleanTfftAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<bool?>> result = await operations.GetBooleanTfftWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set array value empty [true, false, false, true]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutBooleanTfft(this IArray operations, IList<bool?> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutBooleanTfftAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set array value empty [true, false, false, true]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutBooleanTfftAsync( this IArray operations, IList<bool?> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutBooleanTfftWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get boolean array value [true, null, false]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<bool?> GetBooleanInvalidNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetBooleanInvalidNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get boolean array value [true, null, false]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<bool?>> GetBooleanInvalidNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<bool?>> result = await operations.GetBooleanInvalidNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get boolean array value [true, 'boolean', false]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<bool?> GetBooleanInvalidString(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetBooleanInvalidStringAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get boolean array value [true, 'boolean', false]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<bool?>> GetBooleanInvalidStringAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<bool?>> result = await operations.GetBooleanInvalidStringWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get integer array value [1, -1, 3, 300]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<int?> GetIntegerValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetIntegerValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get integer array value [1, -1, 3, 300]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<int?>> GetIntegerValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<int?>> result = await operations.GetIntegerValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set array value empty [1, -1, 3, 300]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutIntegerValid(this IArray operations, IList<int?> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutIntegerValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set array value empty [1, -1, 3, 300]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutIntegerValidAsync( this IArray operations, IList<int?> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutIntegerValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get integer array value [1, null, 0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<int?> GetIntInvalidNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetIntInvalidNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get integer array value [1, null, 0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<int?>> GetIntInvalidNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<int?>> result = await operations.GetIntInvalidNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get integer array value [1, 'integer', 0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<int?> GetIntInvalidString(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetIntInvalidStringAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get integer array value [1, 'integer', 0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<int?>> GetIntInvalidStringAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<int?>> result = await operations.GetIntInvalidStringWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get integer array value [1, -1, 3, 300]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<long?> GetLongValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetLongValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get integer array value [1, -1, 3, 300]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<long?>> GetLongValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<long?>> result = await operations.GetLongValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set array value empty [1, -1, 3, 300]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutLongValid(this IArray operations, IList<long?> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutLongValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set array value empty [1, -1, 3, 300]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutLongValidAsync( this IArray operations, IList<long?> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutLongValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get long array value [1, null, 0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<long?> GetLongInvalidNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetLongInvalidNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get long array value [1, null, 0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<long?>> GetLongInvalidNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<long?>> result = await operations.GetLongInvalidNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get long array value [1, 'integer', 0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<long?> GetLongInvalidString(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetLongInvalidStringAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get long array value [1, 'integer', 0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<long?>> GetLongInvalidStringAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<long?>> result = await operations.GetLongInvalidStringWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get float array value [0, -0.01, 1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<double?> GetFloatValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetFloatValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get float array value [0, -0.01, 1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<double?>> GetFloatValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<double?>> result = await operations.GetFloatValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set array value [0, -0.01, 1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutFloatValid(this IArray operations, IList<double?> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutFloatValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set array value [0, -0.01, 1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutFloatValidAsync( this IArray operations, IList<double?> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutFloatValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get float array value [0.0, null, -1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<double?> GetFloatInvalidNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetFloatInvalidNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get float array value [0.0, null, -1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<double?>> GetFloatInvalidNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<double?>> result = await operations.GetFloatInvalidNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get boolean array value [1.0, 'number', 0.0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<double?> GetFloatInvalidString(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetFloatInvalidStringAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get boolean array value [1.0, 'number', 0.0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<double?>> GetFloatInvalidStringAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<double?>> result = await operations.GetFloatInvalidStringWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get float array value [0, -0.01, 1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<double?> GetDoubleValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDoubleValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get float array value [0, -0.01, 1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<double?>> GetDoubleValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<double?>> result = await operations.GetDoubleValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set array value [0, -0.01, 1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutDoubleValid(this IArray operations, IList<double?> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutDoubleValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set array value [0, -0.01, 1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutDoubleValidAsync( this IArray operations, IList<double?> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutDoubleValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get float array value [0.0, null, -1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<double?> GetDoubleInvalidNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDoubleInvalidNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get float array value [0.0, null, -1.2e20]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<double?>> GetDoubleInvalidNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<double?>> result = await operations.GetDoubleInvalidNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get boolean array value [1.0, 'number', 0.0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<double?> GetDoubleInvalidString(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDoubleInvalidStringAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get boolean array value [1.0, 'number', 0.0]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<double?>> GetDoubleInvalidStringAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<double?>> result = await operations.GetDoubleInvalidStringWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get string array value ['foo1', 'foo2', 'foo3']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<string> GetStringValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetStringValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get string array value ['foo1', 'foo2', 'foo3']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<string>> GetStringValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<string>> result = await operations.GetStringValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set array value ['foo1', 'foo2', 'foo3']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutStringValid(this IArray operations, IList<string> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutStringValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set array value ['foo1', 'foo2', 'foo3']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutStringValidAsync( this IArray operations, IList<string> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutStringValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get string array value ['foo', null, 'foo2']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<string> GetStringWithNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetStringWithNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get string array value ['foo', null, 'foo2']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<string>> GetStringWithNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<string>> result = await operations.GetStringWithNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get string array value ['foo', 123, 'foo2']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<string> GetStringWithInvalid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetStringWithInvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get string array value ['foo', 123, 'foo2']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<string>> GetStringWithInvalidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<string>> result = await operations.GetStringWithInvalidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get integer array value ['2000-12-01', '1980-01-02', '1492-10-12']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<DateTime?> GetDateValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDateValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get integer array value ['2000-12-01', '1980-01-02', '1492-10-12']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<DateTime?>> GetDateValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<DateTime?>> result = await operations.GetDateValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set array value  ['2000-12-01', '1980-01-02', '1492-10-12']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutDateValid(this IArray operations, IList<DateTime?> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutDateValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set array value  ['2000-12-01', '1980-01-02', '1492-10-12']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutDateValidAsync( this IArray operations, IList<DateTime?> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutDateValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get date array value ['2012-01-01', null, '1776-07-04']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<DateTime?> GetDateInvalidNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDateInvalidNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get date array value ['2012-01-01', null, '1776-07-04']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<DateTime?>> GetDateInvalidNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<DateTime?>> result = await operations.GetDateInvalidNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get date array value ['2011-03-22', 'date']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<DateTime?> GetDateInvalidChars(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDateInvalidCharsAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get date array value ['2011-03-22', 'date']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<DateTime?>> GetDateInvalidCharsAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<DateTime?>> result = await operations.GetDateInvalidCharsWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get date-time array value ['2000-12-01t00:00:01z',
            /// '1980-01-02T00:11:35+01:00', '1492-10-12T10:15:01-08:00']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<DateTime?> GetDateTimeValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDateTimeValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get date-time array value ['2000-12-01t00:00:01z',
            /// '1980-01-02T00:11:35+01:00', '1492-10-12T10:15:01-08:00']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<DateTime?>> GetDateTimeValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<DateTime?>> result = await operations.GetDateTimeValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set array value  ['2000-12-01t00:00:01z', '1980-01-02T00:11:35+01:00',
            /// '1492-10-12T10:15:01-08:00']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutDateTimeValid(this IArray operations, IList<DateTime?> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutDateTimeValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set array value  ['2000-12-01t00:00:01z', '1980-01-02T00:11:35+01:00',
            /// '1492-10-12T10:15:01-08:00']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutDateTimeValidAsync( this IArray operations, IList<DateTime?> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutDateTimeValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get date array value ['2000-12-01t00:00:01z', null]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<DateTime?> GetDateTimeInvalidNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDateTimeInvalidNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get date array value ['2000-12-01t00:00:01z', null]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<DateTime?>> GetDateTimeInvalidNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<DateTime?>> result = await operations.GetDateTimeInvalidNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get date array value ['2000-12-01t00:00:01z', 'date-time']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<DateTime?> GetDateTimeInvalidChars(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDateTimeInvalidCharsAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get date array value ['2000-12-01t00:00:01z', 'date-time']
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<DateTime?>> GetDateTimeInvalidCharsAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<DateTime?>> result = await operations.GetDateTimeInvalidCharsWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get byte array value [hex(FF FF FF FA), hex(01 02 03), hex (25, 29, 43)]
            /// with each item encoded in base64
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<byte[]> GetByteValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetByteValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get byte array value [hex(FF FF FF FA), hex(01 02 03), hex (25, 29, 43)]
            /// with each item encoded in base64
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<byte[]>> GetByteValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<byte[]>> result = await operations.GetByteValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Put the array value [hex(FF FF FF FA), hex(01 02 03), hex (25, 29, 43)]
            /// with each elementencoded in base 64
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutByteValid(this IArray operations, IList<byte[]> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutByteValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put the array value [hex(FF FF FF FA), hex(01 02 03), hex (25, 29, 43)]
            /// with each elementencoded in base 64
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutByteValidAsync( this IArray operations, IList<byte[]> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutByteValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get byte array value [hex(AB, AC, AD), null] with the first item base64
            /// encoded
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<byte[]> GetByteInvalidNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetByteInvalidNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get byte array value [hex(AB, AC, AD), null] with the first item base64
            /// encoded
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<byte[]>> GetByteInvalidNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<byte[]>> result = await operations.GetByteInvalidNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get array of complex type null value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<Product> GetComplexNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetComplexNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get array of complex type null value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<Product>> GetComplexNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<Product>> result = await operations.GetComplexNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get empty array of complex type []
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<Product> GetComplexEmpty(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetComplexEmptyAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get empty array of complex type []
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<Product>> GetComplexEmptyAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<Product>> result = await operations.GetComplexEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get array of complex type with null item [{'integer': 1 'string': '2'},
            /// null, {'integer': 5, 'string': '6'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<Product> GetComplexItemNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetComplexItemNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get array of complex type with null item [{'integer': 1 'string': '2'},
            /// null, {'integer': 5, 'string': '6'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<Product>> GetComplexItemNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<Product>> result = await operations.GetComplexItemNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get array of complex type with empty item [{'integer': 1 'string': '2'},
            /// {}, {'integer': 5, 'string': '6'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<Product> GetComplexItemEmpty(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetComplexItemEmptyAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get array of complex type with empty item [{'integer': 1 'string': '2'},
            /// {}, {'integer': 5, 'string': '6'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<Product>> GetComplexItemEmptyAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<Product>> result = await operations.GetComplexItemEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get array of complex type with [{'integer': 1 'string': '2'}, {'integer':
            /// 3, 'string': '4'}, {'integer': 5, 'string': '6'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<Product> GetComplexValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetComplexValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get array of complex type with [{'integer': 1 'string': '2'}, {'integer':
            /// 3, 'string': '4'}, {'integer': 5, 'string': '6'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<Product>> GetComplexValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<Product>> result = await operations.GetComplexValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Put an array of complex type with values [{'integer': 1 'string': '2'},
            /// {'integer': 3, 'string': '4'}, {'integer': 5, 'string': '6'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutComplexValid(this IArray operations, IList<Product> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutComplexValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put an array of complex type with values [{'integer': 1 'string': '2'},
            /// {'integer': 3, 'string': '4'}, {'integer': 5, 'string': '6'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutComplexValidAsync( this IArray operations, IList<Product> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutComplexValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get a null array
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<IList<string>> GetArrayNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetArrayNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get a null array
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<IList<string>>> GetArrayNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<IList<string>>> result = await operations.GetArrayNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get an empty array []
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<IList<string>> GetArrayEmpty(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetArrayEmptyAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an empty array []
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<IList<string>>> GetArrayEmptyAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<IList<string>>> result = await operations.GetArrayEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get an array of array of strings [['1', '2', '3'], null, ['7', '8', '9']]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<IList<string>> GetArrayItemNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetArrayItemNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an array of array of strings [['1', '2', '3'], null, ['7', '8', '9']]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<IList<string>>> GetArrayItemNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<IList<string>>> result = await operations.GetArrayItemNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get an array of array of strings [['1', '2', '3'], [], ['7', '8', '9']]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<IList<string>> GetArrayItemEmpty(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetArrayItemEmptyAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an array of array of strings [['1', '2', '3'], [], ['7', '8', '9']]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<IList<string>>> GetArrayItemEmptyAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<IList<string>>> result = await operations.GetArrayItemEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get an array of array of strings [['1', '2', '3'], ['4', '5', '6'], ['7',
            /// '8', '9']]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<IList<string>> GetArrayValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetArrayValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an array of array of strings [['1', '2', '3'], ['4', '5', '6'], ['7',
            /// '8', '9']]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<IList<string>>> GetArrayValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<IList<string>>> result = await operations.GetArrayValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Put An array of array of strings [['1', '2', '3'], ['4', '5', '6'], ['7',
            /// '8', '9']]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutArrayValid(this IArray operations, IList<IList<string>> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutArrayValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put An array of array of strings [['1', '2', '3'], ['4', '5', '6'], ['7',
            /// '8', '9']]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutArrayValidAsync( this IArray operations, IList<IList<string>> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutArrayValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get an array of Dictionaries with value null
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<IDictionary<string, string>> GetDictionaryNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDictionaryNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an array of Dictionaries with value null
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<IDictionary<string, string>>> GetDictionaryNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<IDictionary<string, string>>> result = await operations.GetDictionaryNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get an array of Dictionaries of type &lt;string, string&gt; with value []
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<IDictionary<string, string>> GetDictionaryEmpty(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDictionaryEmptyAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an array of Dictionaries of type &lt;string, string&gt; with value []
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<IDictionary<string, string>>> GetDictionaryEmptyAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<IDictionary<string, string>>> result = await operations.GetDictionaryEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get an array of Dictionaries of type &lt;string, string&gt; with value
            /// [{'1': 'one', '2': 'two', '3': 'three'}, null, {'7': 'seven', '8':
            /// 'eight', '9': 'nine'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<IDictionary<string, string>> GetDictionaryItemNull(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDictionaryItemNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an array of Dictionaries of type &lt;string, string&gt; with value
            /// [{'1': 'one', '2': 'two', '3': 'three'}, null, {'7': 'seven', '8':
            /// 'eight', '9': 'nine'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<IDictionary<string, string>>> GetDictionaryItemNullAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<IDictionary<string, string>>> result = await operations.GetDictionaryItemNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get an array of Dictionaries of type &lt;string, string&gt; with value
            /// [{'1': 'one', '2': 'two', '3': 'three'}, {}, {'7': 'seven', '8': 'eight',
            /// '9': 'nine'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<IDictionary<string, string>> GetDictionaryItemEmpty(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDictionaryItemEmptyAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an array of Dictionaries of type &lt;string, string&gt; with value
            /// [{'1': 'one', '2': 'two', '3': 'three'}, {}, {'7': 'seven', '8': 'eight',
            /// '9': 'nine'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<IDictionary<string, string>>> GetDictionaryItemEmptyAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<IDictionary<string, string>>> result = await operations.GetDictionaryItemEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get an array of Dictionaries of type &lt;string, string&gt; with value
            /// [{'1': 'one', '2': 'two', '3': 'three'}, {'4': 'four', '5': 'five', '6':
            /// 'six'}, {'7': 'seven', '8': 'eight', '9': 'nine'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<IDictionary<string, string>> GetDictionaryValid(this IArray operations)
            {
                return Task.Factory.StartNew(s => ((IArray)s).GetDictionaryValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an array of Dictionaries of type &lt;string, string&gt; with value
            /// [{'1': 'one', '2': 'two', '3': 'three'}, {'4': 'four', '5': 'five', '6':
            /// 'six'}, {'7': 'seven', '8': 'eight', '9': 'nine'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<IList<IDictionary<string, string>>> GetDictionaryValidAsync( this IArray operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<IList<IDictionary<string, string>>> result = await operations.GetDictionaryValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Get an array of Dictionaries of type &lt;string, string&gt; with value
            /// [{'1': 'one', '2': 'two', '3': 'three'}, {'4': 'four', '5': 'five', '6':
            /// 'six'}, {'7': 'seven', '8': 'eight', '9': 'nine'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            public static void PutDictionaryValid(this IArray operations, IList<IDictionary<string, string>> arrayBody)
            {
                Task.Factory.StartNew(s => ((IArray)s).PutDictionaryValidAsync(arrayBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an array of Dictionaries of type &lt;string, string&gt; with value
            /// [{'1': 'one', '2': 'two', '3': 'three'}, {'4': 'four', '5': 'five', '6':
            /// 'six'}, {'7': 'seven', '8': 'eight', '9': 'nine'}]
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayBody'>
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutDictionaryValidAsync( this IArray operations, IList<IDictionary<string, string>> arrayBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutDictionaryValidWithHttpMessagesAsync(arrayBody, null, cancellationToken).ConfigureAwait(false);
            }

    }
}
