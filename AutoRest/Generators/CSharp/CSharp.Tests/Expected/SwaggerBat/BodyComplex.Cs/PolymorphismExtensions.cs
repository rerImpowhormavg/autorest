namespace Fixtures.SwaggerBatBodyComplex
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class PolymorphismExtensions
    {
            /// <summary>
            /// Get complex types that are polymorphic
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static Fish GetValid(this IPolymorphism operations)
            {
                return Task.Factory.StartNew(s => ((IPolymorphism)s).GetValidAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get complex types that are polymorphic
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<Fish> GetValidAsync( this IPolymorphism operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Fish> result = await operations.GetValidWithOperationResponseAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Put complex types that are polymorphic
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='complexBody'>
            /// Please put a salmon that looks like this:
            /// {
            /// 'dtype':'Salmon',
            /// 'location':'alaska',
            /// 'iswild':true,
            /// 'species':'king',
            /// 'length':1.0,
            /// 'siblings':[
            /// {
            /// 'dtype':'Shark',
            /// 'age':6,
            /// 'birthday': '2012-01-05T01:00:00Z',
            /// 'length':20.0,
            /// 'species':'predator',
            /// },
            /// {
            /// 'dtype':'Sawshark',
            /// 'age':105,
            /// 'birthday': '1900-01-05T01:00:00Z',
            /// 'length':10.0,
            /// 'picture': new Buffer([255, 255, 255, 255,
            /// 254]).toString('base64'),
            /// 'species':'dangerous',
            /// }
            /// ]
            /// };
            /// </param>
            public static void PutValid(this IPolymorphism operations, Fish complexBody)
            {
                Task.Factory.StartNew(s => ((IPolymorphism)s).PutValidAsync(complexBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put complex types that are polymorphic
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='complexBody'>
            /// Please put a salmon that looks like this:
            /// {
            /// 'dtype':'Salmon',
            /// 'location':'alaska',
            /// 'iswild':true,
            /// 'species':'king',
            /// 'length':1.0,
            /// 'siblings':[
            /// {
            /// 'dtype':'Shark',
            /// 'age':6,
            /// 'birthday': '2012-01-05T01:00:00Z',
            /// 'length':20.0,
            /// 'species':'predator',
            /// },
            /// {
            /// 'dtype':'Sawshark',
            /// 'age':105,
            /// 'birthday': '1900-01-05T01:00:00Z',
            /// 'length':10.0,
            /// 'picture': new Buffer([255, 255, 255, 255,
            /// 254]).toString('base64'),
            /// 'species':'dangerous',
            /// }
            /// ]
            /// };
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutValidAsync( this IPolymorphism operations, Fish complexBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutValidWithOperationResponseAsync(complexBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Put complex types that are polymorphic, attempting to omit required
            /// 'birthday' field - the request should not be allowed from the client
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='complexBody'>
            /// Please attempt put a sawshark that looks like this, the client should not
            /// allow this data to be sent:
            /// {
            /// "dtype": "sawshark",
            /// "species": "snaggle toothed",
            /// "length": 18.5,
            /// "age": 2,
            /// "birthday": "2013-06-01T01:00:00Z",
            /// "location": "alaska",
            /// "picture": base64(FF FF FF FF FE),
            /// "siblings": [
            /// {
            /// "dtype": "shark",
            /// "species": "predator",
            /// "birthday": "2012-01-05T01:00:00Z",
            /// "length": 20,
            /// "age": 6
            /// },
            /// {
            /// "dtype": "sawshark",
            /// "species": "dangerous",
            /// "picture": base64(FF FF FF FF FE),
            /// "length": 10,
            /// "age": 105
            /// }
            /// ]
            /// }
            /// </param>
            public static void PutValidMissingRequired(this IPolymorphism operations, Fish complexBody)
            {
                Task.Factory.StartNew(s => ((IPolymorphism)s).PutValidMissingRequiredAsync(complexBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Put complex types that are polymorphic, attempting to omit required
            /// 'birthday' field - the request should not be allowed from the client
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='complexBody'>
            /// Please attempt put a sawshark that looks like this, the client should not
            /// allow this data to be sent:
            /// {
            /// "dtype": "sawshark",
            /// "species": "snaggle toothed",
            /// "length": 18.5,
            /// "age": 2,
            /// "birthday": "2013-06-01T01:00:00Z",
            /// "location": "alaska",
            /// "picture": base64(FF FF FF FF FE),
            /// "siblings": [
            /// {
            /// "dtype": "shark",
            /// "species": "predator",
            /// "birthday": "2012-01-05T01:00:00Z",
            /// "length": 20,
            /// "age": 6
            /// },
            /// {
            /// "dtype": "sawshark",
            /// "species": "dangerous",
            /// "picture": base64(FF FF FF FF FE),
            /// "length": 10,
            /// "age": 105
            /// }
            /// ]
            /// }
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutValidMissingRequiredAsync( this IPolymorphism operations, Fish complexBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutValidMissingRequiredWithOperationResponseAsync(complexBody, null, cancellationToken).ConfigureAwait(false);
            }

    }
}
