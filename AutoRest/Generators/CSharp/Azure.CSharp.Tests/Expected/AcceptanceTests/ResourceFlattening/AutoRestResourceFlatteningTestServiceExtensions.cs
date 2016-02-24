// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsResourceFlattening
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Microsoft.Rest.Azure;
    using Models;

    /// <summary>
    /// Extension methods for AutoRestResourceFlatteningTestService.
    /// </summary>
    public static partial class AutoRestResourceFlatteningTestServiceExtensions
    {
            /// <summary>
            /// Put External Resource as an Array
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceArray'>
            /// External Resource as an Array to put
            /// </param>
            public static void PutArray(this IAutoRestResourceFlatteningTestService operations, IList<Resource> resourceArray = default(IList<Resource>))
            {
                Task.Factory.StartNew(s => ((IAutoRestResourceFlatteningTestService)s).PutArrayAsync(resourceArray), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put External Resource as an Array
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceArray'>
            /// External Resource as an Array to put
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutArrayAsync(this IAutoRestResourceFlatteningTestService operations, IList<Resource> resourceArray = default(IList<Resource>), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutArrayWithHttpMessagesAsync(resourceArray, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get External Resource as an Array
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IList<FlattenedProduct> GetArray(this IAutoRestResourceFlatteningTestService operations)
            {
                return Task.Factory.StartNew(s => ((IAutoRestResourceFlatteningTestService)s).GetArrayAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get External Resource as an Array
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<IList<FlattenedProduct>> GetArrayAsync(this IAutoRestResourceFlatteningTestService operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetArrayWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Put External Resource as a Dictionary
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceDictionary'>
            /// External Resource as a Dictionary to put
            /// </param>
            public static void PutDictionary(this IAutoRestResourceFlatteningTestService operations, IDictionary<string, FlattenedProduct> resourceDictionary = default(IDictionary<string, FlattenedProduct>))
            {
                Task.Factory.StartNew(s => ((IAutoRestResourceFlatteningTestService)s).PutDictionaryAsync(resourceDictionary), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put External Resource as a Dictionary
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceDictionary'>
            /// External Resource as a Dictionary to put
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutDictionaryAsync(this IAutoRestResourceFlatteningTestService operations, IDictionary<string, FlattenedProduct> resourceDictionary = default(IDictionary<string, FlattenedProduct>), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutDictionaryWithHttpMessagesAsync(resourceDictionary, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get External Resource as a Dictionary
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static IDictionary<string, FlattenedProduct> GetDictionary(this IAutoRestResourceFlatteningTestService operations)
            {
                return Task.Factory.StartNew(s => ((IAutoRestResourceFlatteningTestService)s).GetDictionaryAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get External Resource as a Dictionary
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<IDictionary<string, FlattenedProduct>> GetDictionaryAsync(this IAutoRestResourceFlatteningTestService operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetDictionaryWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Put External Resource as a ResourceCollection
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceComplexObject'>
            /// External Resource as a ResourceCollection to put
            /// </param>
            public static void PutResourceCollection(this IAutoRestResourceFlatteningTestService operations, ResourceCollection resourceComplexObject = default(ResourceCollection))
            {
                Task.Factory.StartNew(s => ((IAutoRestResourceFlatteningTestService)s).PutResourceCollectionAsync(resourceComplexObject), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put External Resource as a ResourceCollection
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceComplexObject'>
            /// External Resource as a ResourceCollection to put
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutResourceCollectionAsync(this IAutoRestResourceFlatteningTestService operations, ResourceCollection resourceComplexObject = default(ResourceCollection), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutResourceCollectionWithHttpMessagesAsync(resourceComplexObject, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get External Resource as a ResourceCollection
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static ResourceCollection GetResourceCollection(this IAutoRestResourceFlatteningTestService operations)
            {
                return Task.Factory.StartNew(s => ((IAutoRestResourceFlatteningTestService)s).GetResourceCollectionAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get External Resource as a ResourceCollection
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<ResourceCollection> GetResourceCollectionAsync(this IAutoRestResourceFlatteningTestService operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetResourceCollectionWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Put Simple Product with client flattening true on the model
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='simpleBodyProduct'>
            /// Simple body product to put
            /// </param>
            public static SimpleProduct PutSimpleProduct(this IAutoRestResourceFlatteningTestService operations, SimpleProduct simpleBodyProduct = default(SimpleProduct))
            {
                return Task.Factory.StartNew(s => ((IAutoRestResourceFlatteningTestService)s).PutSimpleProductAsync(simpleBodyProduct), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put Simple Product with client flattening true on the model
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='simpleBodyProduct'>
            /// Simple body product to put
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<SimpleProduct> PutSimpleProductAsync(this IAutoRestResourceFlatteningTestService operations, SimpleProduct simpleBodyProduct = default(SimpleProduct), CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.PutSimpleProductWithHttpMessagesAsync(simpleBodyProduct, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Put Flattened Simple Product with client flattening true on the parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='flattenParameterGroup'>
            /// Additional parameters for the operation
            /// </param>
            public static SimpleProduct PostFlattenedSimpleProduct(this IAutoRestResourceFlatteningTestService operations, FlattenParameterGroup flattenParameterGroup)
            {
                return Task.Factory.StartNew(s => ((IAutoRestResourceFlatteningTestService)s).PostFlattenedSimpleProductAsync(flattenParameterGroup), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put Flattened Simple Product with client flattening true on the parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='flattenParameterGroup'>
            /// Additional parameters for the operation
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<SimpleProduct> PostFlattenedSimpleProductAsync(this IAutoRestResourceFlatteningTestService operations, FlattenParameterGroup flattenParameterGroup, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.PostFlattenedSimpleProductWithHttpMessagesAsync(flattenParameterGroup, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Put Simple Product with client flattening true on the model
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='flattenParameterGroup'>
            /// Additional parameters for the operation
            /// </param>
            public static SimpleProduct PutSimpleProductWithGrouping(this IAutoRestResourceFlatteningTestService operations, FlattenParameterGroup flattenParameterGroup)
            {
                return Task.Factory.StartNew(s => ((IAutoRestResourceFlatteningTestService)s).PutSimpleProductWithGroupingAsync(flattenParameterGroup), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put Simple Product with client flattening true on the model
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='flattenParameterGroup'>
            /// Additional parameters for the operation
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<SimpleProduct> PutSimpleProductWithGroupingAsync(this IAutoRestResourceFlatteningTestService operations, FlattenParameterGroup flattenParameterGroup, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.PutSimpleProductWithGroupingWithHttpMessagesAsync(flattenParameterGroup, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

    }
}
