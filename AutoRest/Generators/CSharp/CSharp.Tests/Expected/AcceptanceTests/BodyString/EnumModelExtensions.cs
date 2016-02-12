// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyString
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// Extension methods for EnumModel.
    /// </summary>
    public static partial class EnumModelExtensions
    {
            /// <summary>
            /// Get enum value 'red color' from enumeration of 'red color', 'green-color',
            /// 'blue_color'.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static Colors? GetNotExpandable(this IEnumModel operations)
            {
                return Task.Factory.StartNew(s => ((IEnumModel)s).GetNotExpandableAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get enum value 'red color' from enumeration of 'red color', 'green-color',
            /// 'blue_color'.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Colors?> GetNotExpandableAsync( this IEnumModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetNotExpandableWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Sends value 'red color' from enumeration of 'red color', 'green-color',
            /// 'blue_color'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='stringBody'>
            /// Possible values include: 'red color', 'green-color', 'blue_color'
            /// </param>
            public static void PutNotExpandable(this IEnumModel operations, Colors? stringBody)
            {
                Task.Factory.StartNew(s => ((IEnumModel)s).PutNotExpandableAsync(stringBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Sends value 'red color' from enumeration of 'red color', 'green-color',
            /// 'blue_color'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='stringBody'>
            /// Possible values include: 'red color', 'green-color', 'blue_color'
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task PutNotExpandableAsync( this IEnumModel operations, Colors? stringBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutNotExpandableWithHttpMessagesAsync(stringBody, null, cancellationToken).ConfigureAwait(false);
            }

    }
}
