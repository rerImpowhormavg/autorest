// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.MirrorPrimitives
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class SwaggerDataTypesClientExtensions
    {
            /// <summary>
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='responseCode'>
            /// The desired returned status code
            /// </param>
            /// <param name='product'>
            /// The only parameter
            /// </param>
            public static Product GetProduct(this ISwaggerDataTypesClient operations, string responseCode = default(string), Product product = default(Product))
            {
                return Task.Factory.StartNew(s => ((ISwaggerDataTypesClient)s).GetProductAsync(responseCode, product), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='responseCode'>
            /// The desired returned status code
            /// </param>
            /// <param name='product'>
            /// The only parameter
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Product> GetProductAsync( this ISwaggerDataTypesClient operations, string responseCode = default(string), Product product = default(Product), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Product> result = await operations.GetProductWithHttpMessagesAsync(responseCode, product, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='responseCode'>
            /// The desired returned status code
            /// </param>
            /// <param name='product'>
            /// The only parameter
            /// </param>
            public static Product PutProduct(this ISwaggerDataTypesClient operations, string responseCode = default(string), Product product = default(Product))
            {
                return Task.Factory.StartNew(s => ((ISwaggerDataTypesClient)s).PutProductAsync(responseCode, product), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='responseCode'>
            /// The desired returned status code
            /// </param>
            /// <param name='product'>
            /// The only parameter
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Product> PutProductAsync( this ISwaggerDataTypesClient operations, string responseCode = default(string), Product product = default(Product), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Product> result = await operations.PutProductWithHttpMessagesAsync(responseCode, product, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='responseCode'>
            /// The desired returned status code
            /// </param>
            /// <param name='product'>
            /// The only parameter
            /// </param>
            public static Product PostProduct(this ISwaggerDataTypesClient operations, string responseCode = default(string), Product product = default(Product))
            {
                return Task.Factory.StartNew(s => ((ISwaggerDataTypesClient)s).PostProductAsync(responseCode, product), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='responseCode'>
            /// The desired returned status code
            /// </param>
            /// <param name='product'>
            /// The only parameter
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Product> PostProductAsync( this ISwaggerDataTypesClient operations, string responseCode = default(string), Product product = default(Product), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Product> result = await operations.PostProductWithHttpMessagesAsync(responseCode, product, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='responseCode'>
            /// The desired returned status code
            /// </param>
            /// <param name='product'>
            /// The only parameter
            /// </param>
            public static Product PatchProduct(this ISwaggerDataTypesClient operations, string responseCode = default(string), Product product = default(Product))
            {
                return Task.Factory.StartNew(s => ((ISwaggerDataTypesClient)s).PatchProductAsync(responseCode, product), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='responseCode'>
            /// The desired returned status code
            /// </param>
            /// <param name='product'>
            /// The only parameter
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Product> PatchProductAsync( this ISwaggerDataTypesClient operations, string responseCode = default(string), Product product = default(Product), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Product> result = await operations.PatchProductWithHttpMessagesAsync(responseCode, product, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

    }
}
