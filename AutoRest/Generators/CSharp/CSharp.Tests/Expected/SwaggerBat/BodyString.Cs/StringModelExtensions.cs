namespace Fixtures.SwaggerBatBodyString
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class StringModelExtensions
    {
            /// <summary>
            /// Get null string value value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static string GetNull(this IStringModel operations)
            {
                return Task.Factory.StartNew(s => ((IStringModel)s).GetNullAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null string value value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<string> GetNullAsync( this IStringModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<string> result = await operations.GetNullWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set string value null
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='stringBody'>
            /// Possible values for this parameter include: ''
            /// </param>
            public static void PutNull(this IStringModel operations, string stringBody = default(string))
            {
                Task.Factory.StartNew(s => ((IStringModel)s).PutNullAsync(stringBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set string value null
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='stringBody'>
            /// Possible values for this parameter include: ''
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutNullAsync( this IStringModel operations, string stringBody = default(string), CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutNullWithHttpMessagesAsync(stringBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get empty string value value ''
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static string GetEmpty(this IStringModel operations)
            {
                return Task.Factory.StartNew(s => ((IStringModel)s).GetEmptyAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get empty string value value ''
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<string> GetEmptyAsync( this IStringModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<string> result = await operations.GetEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set string value empty ''
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='stringBody'>
            /// Possible values for this parameter include: ''
            /// </param>
            public static void PutEmpty(this IStringModel operations, string stringBody)
            {
                Task.Factory.StartNew(s => ((IStringModel)s).PutEmptyAsync(stringBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set string value empty ''
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='stringBody'>
            /// Possible values for this parameter include: ''
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutEmptyAsync( this IStringModel operations, string stringBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutEmptyWithHttpMessagesAsync(stringBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get mbcs string value
            /// '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static string GetMbcs(this IStringModel operations)
            {
                return Task.Factory.StartNew(s => ((IStringModel)s).GetMbcsAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get mbcs string value
            /// '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<string> GetMbcsAsync( this IStringModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<string> result = await operations.GetMbcsWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set string value mbcs
            /// '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='stringBody'>
            /// Possible values for this parameter include:
            /// '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
            /// </param>
            public static void PutMbcs(this IStringModel operations, string stringBody)
            {
                Task.Factory.StartNew(s => ((IStringModel)s).PutMbcsAsync(stringBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set string value mbcs
            /// '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='stringBody'>
            /// Possible values for this parameter include:
            /// '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutMbcsAsync( this IStringModel operations, string stringBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutMbcsWithHttpMessagesAsync(stringBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get string value with leading and trailing whitespace
            /// '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to
            /// come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static string GetWhitespace(this IStringModel operations)
            {
                return Task.Factory.StartNew(s => ((IStringModel)s).GetWhitespaceAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get string value with leading and trailing whitespace
            /// '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to
            /// come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<string> GetWhitespaceAsync( this IStringModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<string> result = await operations.GetWhitespaceWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Set String value with leading and trailing whitespace
            /// '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to
            /// come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='stringBody'>
            /// Possible values for this parameter include: '    Now is the time for all
            /// good men to come to the aid of their country    '
            /// </param>
            public static void PutWhitespace(this IStringModel operations, string stringBody)
            {
                Task.Factory.StartNew(s => ((IStringModel)s).PutWhitespaceAsync(stringBody), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Set String value with leading and trailing whitespace
            /// '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to
            /// come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='stringBody'>
            /// Possible values for this parameter include: '    Now is the time for all
            /// good men to come to the aid of their country    '
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task PutWhitespaceAsync( this IStringModel operations, string stringBody, CancellationToken cancellationToken = default(CancellationToken))
            {
                await operations.PutWhitespaceWithHttpMessagesAsync(stringBody, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get String value when no string value is sent in response payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            public static string GetNotProvided(this IStringModel operations)
            {
                return Task.Factory.StartNew(s => ((IStringModel)s).GetNotProvidedAsync(), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get String value when no string value is sent in response payload
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method
            /// </param>
            /// <param name='cancellationToken'>
            /// Cancellation token.
            /// </param>
            public static async Task<string> GetNotProvidedAsync( this IStringModel operations, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<string> result = await operations.GetNotProvidedWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

    }
}
