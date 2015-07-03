namespace Fixtures.SwaggerBatHttp
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class MultipleResponsesExtensions
    {
            /// <summary>
            /// Send a 200 response with valid payload: {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200Model204NoModelDefaultError200Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200Model204NoModelDefaultError200ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200Model204NoModelDefaultError200ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200Model204NoModelDefaultError200ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 204 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200Model204NoModelDefaultError204Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200Model204NoModelDefaultError204ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 204 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200Model204NoModelDefaultError204ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200Model204NoModelDefaultError204ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 201 response with valid payload: {'statusCode': '201'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200Model204NoModelDefaultError201Invalid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200Model204NoModelDefaultError201InvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 201 response with valid payload: {'statusCode': '201'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200Model204NoModelDefaultError201InvalidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200Model204NoModelDefaultError201InvalidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 202 response with no payload:
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200Model204NoModelDefaultError202None(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200Model204NoModelDefaultError202NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 202 response with no payload:
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200Model204NoModelDefaultError202NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200Model204NoModelDefaultError202NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 400 response with valid error payload: {'status': 400, 'message':
            /// 'client error'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200Model204NoModelDefaultError400Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200Model204NoModelDefaultError400ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with valid error payload: {'status': 400, 'message':
            /// 'client error'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200Model204NoModelDefaultError400ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200Model204NoModelDefaultError400ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200Model201ModelDefaultError200Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200Model201ModelDefaultError200ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200Model201ModelDefaultError200ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200Model201ModelDefaultError200ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 201 response with valid payload: {'statusCode': '201',
            /// 'textStatusCode': 'Created'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200Model201ModelDefaultError201Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200Model201ModelDefaultError201ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 201 response with valid payload: {'statusCode': '201',
            /// 'textStatusCode': 'Created'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200Model201ModelDefaultError201ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200Model201ModelDefaultError201ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 400 response with valid payload: {'code': '400', 'message': 'client
            /// error'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200Model201ModelDefaultError400Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200Model201ModelDefaultError400ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with valid payload: {'code': '400', 'message': 'client
            /// error'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200Model201ModelDefaultError400ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200Model201ModelDefaultError400ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static object Get200ModelA201ModelC404ModelDDefaultError200Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA201ModelC404ModelDDefaultError200ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<object> Get200ModelA201ModelC404ModelDDefaultError200ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<object> result = await operations.Get200ModelA201ModelC404ModelDDefaultError200ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'httpCode': '201'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static object Get200ModelA201ModelC404ModelDDefaultError201Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA201ModelC404ModelDDefaultError201ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'httpCode': '201'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<object> Get200ModelA201ModelC404ModelDDefaultError201ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<object> result = await operations.Get200ModelA201ModelC404ModelDDefaultError201ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'httpStatusCode': '404'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static object Get200ModelA201ModelC404ModelDDefaultError404Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA201ModelC404ModelDDefaultError404ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'httpStatusCode': '404'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<object> Get200ModelA201ModelC404ModelDDefaultError404ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<object> result = await operations.Get200ModelA201ModelC404ModelDDefaultError404ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 400 response with valid payload: {'code': '400', 'message': 'client
            /// error'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static object Get200ModelA201ModelC404ModelDDefaultError400Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA201ModelC404ModelDDefaultError400ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with valid payload: {'code': '400', 'message': 'client
            /// error'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<object> Get200ModelA201ModelC404ModelDDefaultError400ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<object> result = await operations.Get200ModelA201ModelC404ModelDDefaultError400ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 202 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void Get202None204NoneDefaultError202None(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).Get202None204NoneDefaultError202NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 202 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Get202None204NoneDefaultError202NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Get202None204NoneDefaultError202NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 204 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void Get202None204NoneDefaultError204None(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).Get202None204NoneDefaultError204NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 204 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Get202None204NoneDefaultError204NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Get202None204NoneDefaultError204NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 400 response with valid payload: {'code': '400', 'message': 'client
            /// error'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void Get202None204NoneDefaultError400Valid(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).Get202None204NoneDefaultError400ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with valid payload: {'code': '400', 'message': 'client
            /// error'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Get202None204NoneDefaultError400ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Get202None204NoneDefaultError400ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 202 response with an unexpected payload {'property': 'value'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void Get202None204NoneDefaultNone202Invalid(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).Get202None204NoneDefaultNone202InvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 202 response with an unexpected payload {'property': 'value'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Get202None204NoneDefaultNone202InvalidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Get202None204NoneDefaultNone202InvalidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 204 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void Get202None204NoneDefaultNone204None(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).Get202None204NoneDefaultNone204NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 204 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Get202None204NoneDefaultNone204NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Get202None204NoneDefaultNone204NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 400 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void Get202None204NoneDefaultNone400None(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).Get202None204NoneDefaultNone400NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Get202None204NoneDefaultNone400NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Get202None204NoneDefaultNone400NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 400 response with an unexpected payload {'property': 'value'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void Get202None204NoneDefaultNone400Invalid(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).Get202None204NoneDefaultNone400InvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with an unexpected payload {'property': 'value'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task Get202None204NoneDefaultNone400InvalidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.Get202None204NoneDefaultNone400InvalidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A GetDefaultModelA200Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).GetDefaultModelA200ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with valid payload: {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> GetDefaultModelA200ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.GetDefaultModelA200ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 200 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A GetDefaultModelA200None(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).GetDefaultModelA200NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> GetDefaultModelA200NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.GetDefaultModelA200NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 400 response with valid payload: {'statusCode': '400'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A GetDefaultModelA400Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).GetDefaultModelA400ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with valid payload: {'statusCode': '400'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> GetDefaultModelA400ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.GetDefaultModelA400ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 400 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A GetDefaultModelA400None(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).GetDefaultModelA400NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> GetDefaultModelA400NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.GetDefaultModelA400NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 200 response with invalid payload: {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void GetDefaultNone200Invalid(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).GetDefaultNone200InvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with invalid payload: {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task GetDefaultNone200InvalidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetDefaultNone200InvalidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 200 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void GetDefaultNone200None(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).GetDefaultNone200NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task GetDefaultNone200NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetDefaultNone200NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 400 response with valid payload: {'statusCode': '400'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void GetDefaultNone400Invalid(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).GetDefaultNone400InvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with valid payload: {'statusCode': '400'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task GetDefaultNone400InvalidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetDefaultNone400InvalidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 400 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static void GetDefaultNone400None(this IMultipleResponses operations)
            {
                Task.Factory.StartNew(s => ((IMultipleResponses)s).GetDefaultNone400NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with no payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task GetDefaultNone400NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.GetDefaultNone400NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Send a 200 response with no payload, when a payload is expected - client
            /// should return a null object of thde type for model A
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200ModelA200None(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA200NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with no payload, when a payload is expected - client
            /// should return a null object of thde type for model A
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200ModelA200NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200ModelA200NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 200 response with payload {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200ModelA200Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA200ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with payload {'statusCode': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200ModelA200ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200ModelA200ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 200 response with invalid payload {'statusCodeInvalid': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200ModelA200Invalid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA200InvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with invalid payload {'statusCodeInvalid': '200'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200ModelA200InvalidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200ModelA200InvalidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 400 response with no payload client should treat as an http error
            /// with no error model
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200ModelA400None(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA400NoneAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 400 response with no payload client should treat as an http error
            /// with no error model
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200ModelA400NoneAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200ModelA400NoneWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 200 response with payload {'statusCode': '400'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200ModelA400Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA400ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with payload {'statusCode': '400'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200ModelA400ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200ModelA400ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 200 response with invalid payload {'statusCodeInvalid': '400'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200ModelA400Invalid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA400InvalidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 200 response with invalid payload {'statusCodeInvalid': '400'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200ModelA400InvalidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200ModelA400InvalidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Send a 202 response with payload {'statusCode': '202'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static A Get200ModelA202Valid(this IMultipleResponses operations)
            {
                return Task.Factory.StartNew(s => ((IMultipleResponses)s).Get200ModelA202ValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Send a 202 response with payload {'statusCode': '202'}
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<A> Get200ModelA202ValidAsync( this IMultipleResponses operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<A> result = await operations.Get200ModelA202ValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

    }
}
