// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyFormData
{
   using Models;
    using System.IO;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;

    /// <summary>
    /// Extension methods for Formdata.
    /// </summary>
    public static partial class FormdataExtensions
    {
            /// <summary>
            /// Upload file
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='fileContent'>
            /// File to upload.
            /// </param>
            /// <param name='fileName'>
            /// File name to upload. Name has to be spelled exactly as written here.
            /// </param>
            public static Stream UploadFile(this IFormdata operations, Stream fileContent, string fileName)
            {
                return Task.Factory.StartNew(s => ((IFormdata)s).UploadFileAsync(fileContent, fileName), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Upload file
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='fileContent'>
            /// File to upload.
            /// </param>
            /// <param name='fileName'>
            /// File name to upload. Name has to be spelled exactly as written here.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Stream> UploadFileAsync(this IFormdata operations, Stream fileContent, string fileName, CancellationToken cancellationToken = default(CancellationToken))
            {
                var _result = await operations.UploadFileWithHttpMessagesAsync(fileContent, fileName, null, cancellationToken).ConfigureAwait(false);
                _result.Request.Dispose();
                return _result.Body;
            }

            /// <summary>
            /// Upload file
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='fileContent'>
            /// File to upload.
            /// </param>
            public static Stream UploadFileViaBody(this IFormdata operations, Stream fileContent)
            {
                return Task.Factory.StartNew(s => ((IFormdata)s).UploadFileViaBodyAsync(fileContent), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Upload file
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='fileContent'>
            /// File to upload.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Stream> UploadFileViaBodyAsync(this IFormdata operations, Stream fileContent, CancellationToken cancellationToken = default(CancellationToken))
            {
                var _result = await operations.UploadFileViaBodyWithHttpMessagesAsync(fileContent, null, cancellationToken).ConfigureAwait(false);
                _result.Request.Dispose();
                return _result.Body;
            }

    }
}
