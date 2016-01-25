// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsUrl
{
    using System;
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// Queries operations.
    /// </summary>
    public partial interface IQueries
    {
        /// <summary>
        /// Get true Boolean value on path
        /// </summary>
        /// <param name='boolQuery'>
        /// true boolean value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetBooleanTrueWithHttpMessagesAsync(bool? boolQuery = default(bool?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get false Boolean value on path
        /// </summary>
        /// <param name='boolQuery'>
        /// false boolean value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetBooleanFalseWithHttpMessagesAsync(bool? boolQuery = default(bool?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null Boolean value on query (query string should be absent)
        /// </summary>
        /// <param name='boolQuery'>
        /// null boolean value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetBooleanNullWithHttpMessagesAsync(bool? boolQuery = default(bool?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '1000000' integer value
        /// </summary>
        /// <param name='intQuery'>
        /// '1000000' integer value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetIntOneMillionWithHttpMessagesAsync(int? intQuery = default(int?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '-1000000' integer value
        /// </summary>
        /// <param name='intQuery'>
        /// '-1000000' integer value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetIntNegativeOneMillionWithHttpMessagesAsync(int? intQuery = default(int?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null integer value (no query parameter)
        /// </summary>
        /// <param name='intQuery'>
        /// null integer value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetIntNullWithHttpMessagesAsync(int? intQuery = default(int?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '10000000000' 64 bit integer value
        /// </summary>
        /// <param name='longQuery'>
        /// '10000000000' 64 bit integer value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetTenBillionWithHttpMessagesAsync(long? longQuery = default(long?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '-10000000000' 64 bit integer value
        /// </summary>
        /// <param name='longQuery'>
        /// '-10000000000' 64 bit integer value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetNegativeTenBillionWithHttpMessagesAsync(long? longQuery = default(long?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get 'null 64 bit integer value (no query param in uri)
        /// </summary>
        /// <param name='longQuery'>
        /// null 64 bit integer value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetLongNullWithHttpMessagesAsync(long? longQuery = default(long?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '1.034E+20' numeric value
        /// </summary>
        /// <param name='floatQuery'>
        /// '1.034E+20'numeric value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> FloatScientificPositiveWithHttpMessagesAsync(double? floatQuery = default(double?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '-1.034E-20' numeric value
        /// </summary>
        /// <param name='floatQuery'>
        /// '-1.034E-20'numeric value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> FloatScientificNegativeWithHttpMessagesAsync(double? floatQuery = default(double?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null numeric value (no query parameter)
        /// </summary>
        /// <param name='floatQuery'>
        /// null numeric value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> FloatNullWithHttpMessagesAsync(double? floatQuery = default(double?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '9999999.999' numeric value
        /// </summary>
        /// <param name='doubleQuery'>
        /// '9999999.999'numeric value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> DoubleDecimalPositiveWithHttpMessagesAsync(double? doubleQuery = default(double?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '-9999999.999' numeric value
        /// </summary>
        /// <param name='doubleQuery'>
        /// '-9999999.999'numeric value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> DoubleDecimalNegativeWithHttpMessagesAsync(double? doubleQuery = default(double?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null numeric value (no query parameter)
        /// </summary>
        /// <param name='doubleQuery'>
        /// null numeric value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> DoubleNullWithHttpMessagesAsync(double? doubleQuery = default(double?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value
        /// </summary>
        /// <param name='stringQuery'>
        /// '啊齄丂狛狜隣郎隣兀﨩'multi-byte string value. Possible values for this
        /// parameter include: '啊齄丂狛狜隣郎隣兀﨩'
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> StringUnicodeWithHttpMessagesAsync(string stringQuery = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get 'begin!*'();:@ &amp;=+$,/?#[]end
        /// </summary>
        /// <param name='stringQuery'>
        /// 'begin!*'();:@ &amp;=+$,/?#[]end' url encoded string value.
        /// Possible values for this parameter include: 'begin!*'();:@
        /// &amp;=+$,/?#[]end'
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> StringUrlEncodedWithHttpMessagesAsync(string stringQuery = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get ''
        /// </summary>
        /// <param name='stringQuery'>
        /// '' string value. Possible values for this parameter include: ''
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> StringEmptyWithHttpMessagesAsync(string stringQuery = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null (no query parameter in url)
        /// </summary>
        /// <param name='stringQuery'>
        /// null string value
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> StringNullWithHttpMessagesAsync(string stringQuery = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get using uri with query parameter 'green color'
        /// </summary>
        /// <param name='enumQuery'>
        /// 'green color' enum value. Possible values for this parameter
        /// include: 'red color', 'green color', 'blue color'
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> EnumValidWithHttpMessagesAsync(UriColor? enumQuery = default(UriColor?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null (no query parameter in url)
        /// </summary>
        /// <param name='enumQuery'>
        /// null string value. Possible values for this parameter include:
        /// 'red color', 'green color', 'blue color'
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> EnumNullWithHttpMessagesAsync(UriColor? enumQuery = default(UriColor?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
        /// </summary>
        /// <param name='byteQuery'>
        /// '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ByteMultiByteWithHttpMessagesAsync(byte[] byteQuery = default(byte[]), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '' as byte array
        /// </summary>
        /// <param name='byteQuery'>
        /// '' as byte array
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ByteEmptyWithHttpMessagesAsync(byte[] byteQuery = default(byte[]), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null as byte array (no query parameters in uri)
        /// </summary>
        /// <param name='byteQuery'>
        /// null as byte array (no query parameters in uri)
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ByteNullWithHttpMessagesAsync(byte[] byteQuery = default(byte[]), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '2012-01-01' as date
        /// </summary>
        /// <param name='dateQuery'>
        /// '2012-01-01' as date
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> DateValidWithHttpMessagesAsync(DateTime? dateQuery = default(DateTime?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null as date - this should result in no query parameters in uri
        /// </summary>
        /// <param name='dateQuery'>
        /// null as date (no query parameters in uri)
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> DateNullWithHttpMessagesAsync(DateTime? dateQuery = default(DateTime?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '2012-01-01T01:01:01Z' as date-time
        /// </summary>
        /// <param name='dateTimeQuery'>
        /// '2012-01-01T01:01:01Z' as date-time
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> DateTimeValidWithHttpMessagesAsync(DateTime? dateTimeQuery = default(DateTime?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null as date-time, should result in no query parameters in uri
        /// </summary>
        /// <param name='dateTimeQuery'>
        /// null as date-time (no query parameters)
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> DateTimeNullWithHttpMessagesAsync(DateTime? dateTimeQuery = default(DateTime?), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get an array of string ['ArrayQuery1', 'begin!*'();:@
        /// &amp;=+$,/?#[]end' , null, ''] using the csv-array format
        /// </summary>
        /// <param name='arrayQuery'>
        /// an array of string ['ArrayQuery1', 'begin!*'();:@
        /// &amp;=+$,/?#[]end' , null, ''] using the csv-array format
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ArrayStringCsvValidWithHttpMessagesAsync(IList<string> arrayQuery = default(IList<string>), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get a null array of string using the csv-array format
        /// </summary>
        /// <param name='arrayQuery'>
        /// a null array of string using the csv-array format
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ArrayStringCsvNullWithHttpMessagesAsync(IList<string> arrayQuery = default(IList<string>), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get an empty array [] of string using the csv-array format
        /// </summary>
        /// <param name='arrayQuery'>
        /// an empty array [] of string using the csv-array format
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ArrayStringCsvEmptyWithHttpMessagesAsync(IList<string> arrayQuery = default(IList<string>), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get an array of string ['ArrayQuery1', 'begin!*'();:@
        /// &amp;=+$,/?#[]end' , null, ''] using the ssv-array format
        /// </summary>
        /// <param name='arrayQuery'>
        /// an array of string ['ArrayQuery1', 'begin!*'();:@
        /// &amp;=+$,/?#[]end' , null, ''] using the ssv-array format
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ArrayStringSsvValidWithHttpMessagesAsync(IList<string> arrayQuery = default(IList<string>), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get an array of string ['ArrayQuery1', 'begin!*'();:@
        /// &amp;=+$,/?#[]end' , null, ''] using the tsv-array format
        /// </summary>
        /// <param name='arrayQuery'>
        /// an array of string ['ArrayQuery1', 'begin!*'();:@
        /// &amp;=+$,/?#[]end' , null, ''] using the tsv-array format
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ArrayStringTsvValidWithHttpMessagesAsync(IList<string> arrayQuery = default(IList<string>), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get an array of string ['ArrayQuery1', 'begin!*'();:@
        /// &amp;=+$,/?#[]end' , null, ''] using the pipes-array format
        /// </summary>
        /// <param name='arrayQuery'>
        /// an array of string ['ArrayQuery1', 'begin!*'();:@
        /// &amp;=+$,/?#[]end' , null, ''] using the pipes-array format
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> ArrayStringPipesValidWithHttpMessagesAsync(IList<string> arrayQuery = default(IList<string>), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
    }
}
