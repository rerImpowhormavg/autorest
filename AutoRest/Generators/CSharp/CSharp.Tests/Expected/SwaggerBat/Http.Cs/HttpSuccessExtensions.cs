namespace Fixtures.SwaggerBatHttp
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class HttpSuccessExtensions
    {
            /// <summary>
            /// Return 200 status code if successful
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void Head200(this IHttpSuccess operations)
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Head200Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 200 status code if successful
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Head200Async( this IHttpSuccess operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Head200WithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get 200 success
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static bool? Get200(this IHttpSuccess operations)
            {
                return Task.Factory.StartNew(s => ((IHttpSuccess)s).Get200Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get 200 success
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<bool?> Get200Async( this IHttpSuccess operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<bool?> result = await operations.Get200WithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Put boolean value true returning 200 success
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Put200(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Put200Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put boolean value true returning 200 success
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Put200Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Put200WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Patch true Boolean value in request returning 200
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Patch200(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Patch200Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Patch true Boolean value in request returning 200
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Patch200Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Patch200WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Post bollean value true in request that returns a 200
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Post200(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Post200Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Post bollean value true in request that returns a 200
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Post200Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Post200WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Delete simple boolean value true returns 200
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Delete200(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Delete200Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Delete simple boolean value true returns 200
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Delete200Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Delete200WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Put true Boolean value in request returns 201
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Put201(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Put201Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put true Boolean value in request returns 201
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Put201Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Put201WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Post true Boolean value in request returns 201 (Created)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Post201(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Post201Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Post true Boolean value in request returns 201 (Created)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Post201Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Post201WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Put true Boolean value in request returns 202 (Accepted)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Put202(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Put202Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put true Boolean value in request returns 202 (Accepted)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Put202Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Put202WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Patch true Boolean value in request returns 202
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Patch202(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Patch202Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Patch true Boolean value in request returns 202
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Patch202Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Patch202WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Post true Boolean value in request returns 202 (Accepted)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Post202(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Post202Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Post true Boolean value in request returns 202 (Accepted)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Post202Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Post202WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Delete true Boolean value in request returns 202 (accepted)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Delete202(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Delete202Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Delete true Boolean value in request returns 202 (accepted)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Delete202Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Delete202WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Return 204 status code if successful
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void Head204(this IHttpSuccess operations)
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Head204Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 204 status code if successful
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Head204Async( this IHttpSuccess operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Head204WithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Put true Boolean value in request returns 204 (no content)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Put204(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Put204Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put true Boolean value in request returns 204 (no content)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Put204Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Put204WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Patch true Boolean value in request returns 204 (no content)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Patch204(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Patch204Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Patch true Boolean value in request returns 204 (no content)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Patch204Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Patch204WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Post true Boolean value in request returns 204 (no content)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Post204(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Post204Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Post true Boolean value in request returns 204 (no content)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Post204Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Post204WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Delete true Boolean value in request returns 204 (no content)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            public static void Delete204(this IHttpSuccess operations, bool? booleanValue = default(bool?))
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Delete204Async(booleanValue), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Delete true Boolean value in request returns 204 (no content)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='booleanValue'>
            /// Simple boolean value true
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Delete204Async( this IHttpSuccess operations, bool? booleanValue = default(bool?), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Delete204WithHttpMessagesAsync(booleanValue, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Return 404 status code
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void Head404(this IHttpSuccess operations)
            {
                Task.Factory.StartNew(s => ((IHttpSuccess)s).Head404Async(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Return 404 status code
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Head404Async( this IHttpSuccess operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Head404WithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

    }
}
