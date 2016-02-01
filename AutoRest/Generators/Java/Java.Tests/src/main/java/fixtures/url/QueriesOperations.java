/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.url.models.ErrorException;
import fixtures.url.models.UriColor;
import java.io.IOException;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in QueriesOperations.
 */
public interface QueriesOperations {
    /**
     * The interface defining all the services for QueriesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface QueriesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/bool/true")
        Call<ResponseBody> getBooleanTrue(@Query("boolQuery") Boolean boolQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/bool/false")
        Call<ResponseBody> getBooleanFalse(@Query("boolQuery") Boolean boolQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/bool/null")
        Call<ResponseBody> getBooleanNull(@Query("boolQuery") Boolean boolQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/int/1000000")
        Call<ResponseBody> getIntOneMillion(@Query("intQuery") Integer intQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/int/-1000000")
        Call<ResponseBody> getIntNegativeOneMillion(@Query("intQuery") Integer intQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/int/null")
        Call<ResponseBody> getIntNull(@Query("intQuery") Integer intQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/long/10000000000")
        Call<ResponseBody> getTenBillion(@Query("longQuery") Long longQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/long/-10000000000")
        Call<ResponseBody> getNegativeTenBillion(@Query("longQuery") Long longQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/long/null")
        Call<ResponseBody> getLongNull(@Query("longQuery") Long longQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/float/1.034E+20")
        Call<ResponseBody> floatScientificPositive(@Query("floatQuery") Double floatQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/float/-1.034E-20")
        Call<ResponseBody> floatScientificNegative(@Query("floatQuery") Double floatQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/float/null")
        Call<ResponseBody> floatNull(@Query("floatQuery") Double floatQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/double/9999999.999")
        Call<ResponseBody> doubleDecimalPositive(@Query("doubleQuery") Double doubleQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/double/-9999999.999")
        Call<ResponseBody> doubleDecimalNegative(@Query("doubleQuery") Double doubleQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/double/null")
        Call<ResponseBody> doubleNull(@Query("doubleQuery") Double doubleQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/string/unicode/")
        Call<ResponseBody> stringUnicode(@Query("stringQuery") String stringQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/string/begin%21%2A%27%28%29%3B%3A%40%20%26%3D%2B%24%2C%2F%3F%23%5B%5Dend")
        Call<ResponseBody> stringUrlEncoded(@Query("stringQuery") String stringQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/string/empty")
        Call<ResponseBody> stringEmpty(@Query("stringQuery") String stringQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/string/null")
        Call<ResponseBody> stringNull(@Query("stringQuery") String stringQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/enum/green%20color")
        Call<ResponseBody> enumValid(@Query("enumQuery") String enumQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/enum/null")
        Call<ResponseBody> enumNull(@Query("enumQuery") String enumQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/byte/multibyte")
        Call<ResponseBody> byteMultiByte(@Query("byteQuery") String byteQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/byte/empty")
        Call<ResponseBody> byteEmpty(@Query("byteQuery") String byteQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/byte/null")
        Call<ResponseBody> byteNull(@Query("byteQuery") String byteQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/date/2012-01-01")
        Call<ResponseBody> dateValid(@Query("dateQuery") String dateQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/date/null")
        Call<ResponseBody> dateNull(@Query("dateQuery") String dateQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/datetime/2012-01-01T01%3A01%3A01Z")
        Call<ResponseBody> dateTimeValid(@Query("dateTimeQuery") String dateTimeQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/datetime/null")
        Call<ResponseBody> dateTimeNull(@Query("dateTimeQuery") String dateTimeQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/array/csv/string/valid")
        Call<ResponseBody> arrayStringCsvValid(@Query("arrayQuery") String arrayQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/array/csv/string/null")
        Call<ResponseBody> arrayStringCsvNull(@Query("arrayQuery") String arrayQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/array/csv/string/empty")
        Call<ResponseBody> arrayStringCsvEmpty(@Query("arrayQuery") String arrayQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/array/ssv/string/valid")
        Call<ResponseBody> arrayStringSsvValid(@Query("arrayQuery") String arrayQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/array/tsv/string/valid")
        Call<ResponseBody> arrayStringTsvValid(@Query("arrayQuery") String arrayQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("queries/array/pipes/string/valid")
        Call<ResponseBody> arrayStringPipesValid(@Query("arrayQuery") String arrayQuery);

    }
    /**
     * Get true Boolean value on path.
     *
     * @param boolQuery true boolean value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getBooleanTrue(Boolean boolQuery) throws ErrorException, IOException;

    /**
     * Get true Boolean value on path.
     *
     * @param boolQuery true boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBooleanTrueAsync(Boolean boolQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get false Boolean value on path.
     *
     * @param boolQuery false boolean value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getBooleanFalse(Boolean boolQuery) throws ErrorException, IOException;

    /**
     * Get false Boolean value on path.
     *
     * @param boolQuery false boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBooleanFalseAsync(Boolean boolQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null Boolean value on query (query string should be absent).
     *
     * @param boolQuery null boolean value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getBooleanNull(Boolean boolQuery) throws ErrorException, IOException;

    /**
     * Get null Boolean value on query (query string should be absent).
     *
     * @param boolQuery null boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBooleanNullAsync(Boolean boolQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '1000000' integer value.
     *
     * @param intQuery '1000000' integer value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getIntOneMillion(Integer intQuery) throws ErrorException, IOException;

    /**
     * Get '1000000' integer value.
     *
     * @param intQuery '1000000' integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getIntOneMillionAsync(Integer intQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1000000' integer value.
     *
     * @param intQuery '-1000000' integer value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getIntNegativeOneMillion(Integer intQuery) throws ErrorException, IOException;

    /**
     * Get '-1000000' integer value.
     *
     * @param intQuery '-1000000' integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getIntNegativeOneMillionAsync(Integer intQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null integer value (no query parameter).
     *
     * @param intQuery null integer value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getIntNull(Integer intQuery) throws ErrorException, IOException;

    /**
     * Get null integer value (no query parameter).
     *
     * @param intQuery null integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getIntNullAsync(Integer intQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @param longQuery '10000000000' 64 bit integer value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getTenBillion(Long longQuery) throws ErrorException, IOException;

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @param longQuery '10000000000' 64 bit integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getTenBillionAsync(Long longQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @param longQuery '-10000000000' 64 bit integer value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getNegativeTenBillion(Long longQuery) throws ErrorException, IOException;

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @param longQuery '-10000000000' 64 bit integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNegativeTenBillionAsync(Long longQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get 'null 64 bit integer value (no query param in uri).
     *
     * @param longQuery null 64 bit integer value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getLongNull(Long longQuery) throws ErrorException, IOException;

    /**
     * Get 'null 64 bit integer value (no query param in uri).
     *
     * @param longQuery null 64 bit integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getLongNullAsync(Long longQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '1.034E+20' numeric value.
     *
     * @param floatQuery '1.034E+20'numeric value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> floatScientificPositive(Double floatQuery) throws ErrorException, IOException;

    /**
     * Get '1.034E+20' numeric value.
     *
     * @param floatQuery '1.034E+20'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> floatScientificPositiveAsync(Double floatQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @param floatQuery '-1.034E-20'numeric value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> floatScientificNegative(Double floatQuery) throws ErrorException, IOException;

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @param floatQuery '-1.034E-20'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> floatScientificNegativeAsync(Double floatQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null numeric value (no query parameter).
     *
     * @param floatQuery null numeric value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> floatNull(Double floatQuery) throws ErrorException, IOException;

    /**
     * Get null numeric value (no query parameter).
     *
     * @param floatQuery null numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> floatNullAsync(Double floatQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '9999999.999' numeric value.
     *
     * @param doubleQuery '9999999.999'numeric value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> doubleDecimalPositive(Double doubleQuery) throws ErrorException, IOException;

    /**
     * Get '9999999.999' numeric value.
     *
     * @param doubleQuery '9999999.999'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> doubleDecimalPositiveAsync(Double doubleQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-9999999.999' numeric value.
     *
     * @param doubleQuery '-9999999.999'numeric value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> doubleDecimalNegative(Double doubleQuery) throws ErrorException, IOException;

    /**
     * Get '-9999999.999' numeric value.
     *
     * @param doubleQuery '-9999999.999'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> doubleDecimalNegativeAsync(Double doubleQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null numeric value (no query parameter).
     *
     * @param doubleQuery null numeric value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> doubleNull(Double doubleQuery) throws ErrorException, IOException;

    /**
     * Get null numeric value (no query parameter).
     *
     * @param doubleQuery null numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> doubleNullAsync(Double doubleQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @param stringQuery '啊齄丂狛狜隣郎隣兀﨩'multi-byte string value. Possible values for this parameter include: '啊齄丂狛狜隣郎隣兀﨩'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> stringUnicode(String stringQuery) throws ErrorException, IOException;

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @param stringQuery '啊齄丂狛狜隣郎隣兀﨩'multi-byte string value. Possible values for this parameter include: '啊齄丂狛狜隣郎隣兀﨩'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> stringUnicodeAsync(String stringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @param stringQuery 'begin!*'();:@ &amp;=+$,/?#[]end' url encoded string value. Possible values for this parameter include: 'begin!*'();:@ &amp;=+$,/?#[]end'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> stringUrlEncoded(String stringQuery) throws ErrorException, IOException;

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @param stringQuery 'begin!*'();:@ &amp;=+$,/?#[]end' url encoded string value. Possible values for this parameter include: 'begin!*'();:@ &amp;=+$,/?#[]end'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> stringUrlEncodedAsync(String stringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get ''.
     *
     * @param stringQuery '' string value. Possible values for this parameter include: ''
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> stringEmpty(String stringQuery) throws ErrorException, IOException;

    /**
     * Get ''.
     *
     * @param stringQuery '' string value. Possible values for this parameter include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> stringEmptyAsync(String stringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null (no query parameter in url).
     *
     * @param stringQuery null string value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> stringNull(String stringQuery) throws ErrorException, IOException;

    /**
     * Get null (no query parameter in url).
     *
     * @param stringQuery null string value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> stringNullAsync(String stringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get using uri with query parameter 'green color'.
     *
     * @param enumQuery 'green color' enum value. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> enumValid(UriColor enumQuery) throws ErrorException, IOException;

    /**
     * Get using uri with query parameter 'green color'.
     *
     * @param enumQuery 'green color' enum value. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> enumValidAsync(UriColor enumQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null (no query parameter in url).
     *
     * @param enumQuery null string value. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> enumNull(UriColor enumQuery) throws ErrorException, IOException;

    /**
     * Get null (no query parameter in url).
     *
     * @param enumQuery null string value. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> enumNullAsync(UriColor enumQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param byteQuery '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> byteMultiByte(byte[] byteQuery) throws ErrorException, IOException;

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param byteQuery '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> byteMultiByteAsync(byte[] byteQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '' as byte array.
     *
     * @param byteQuery '' as byte array
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> byteEmpty(byte[] byteQuery) throws ErrorException, IOException;

    /**
     * Get '' as byte array.
     *
     * @param byteQuery '' as byte array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> byteEmptyAsync(byte[] byteQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as byte array (no query parameters in uri).
     *
     * @param byteQuery null as byte array (no query parameters in uri)
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> byteNull(byte[] byteQuery) throws ErrorException, IOException;

    /**
     * Get null as byte array (no query parameters in uri).
     *
     * @param byteQuery null as byte array (no query parameters in uri)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> byteNullAsync(byte[] byteQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01' as date.
     *
     * @param dateQuery '2012-01-01' as date
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> dateValid(LocalDate dateQuery) throws ErrorException, IOException;

    /**
     * Get '2012-01-01' as date.
     *
     * @param dateQuery '2012-01-01' as date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> dateValidAsync(LocalDate dateQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date - this should result in no query parameters in uri.
     *
     * @param dateQuery null as date (no query parameters in uri)
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> dateNull(LocalDate dateQuery) throws ErrorException, IOException;

    /**
     * Get null as date - this should result in no query parameters in uri.
     *
     * @param dateQuery null as date (no query parameters in uri)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> dateNullAsync(LocalDate dateQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @param dateTimeQuery '2012-01-01T01:01:01Z' as date-time
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> dateTimeValid(DateTime dateTimeQuery) throws ErrorException, IOException;

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @param dateTimeQuery '2012-01-01T01:01:01Z' as date-time
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> dateTimeValidAsync(DateTime dateTimeQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date-time, should result in no query parameters in uri.
     *
     * @param dateTimeQuery null as date-time (no query parameters)
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> dateTimeNull(DateTime dateTimeQuery) throws ErrorException, IOException;

    /**
     * Get null as date-time, should result in no query parameters in uri.
     *
     * @param dateTimeQuery null as date-time (no query parameters)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> dateTimeNullAsync(DateTime dateTimeQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> arrayStringCsvValid(List<String> arrayQuery) throws ErrorException, IOException;

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> arrayStringCsvValidAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a null array of string using the csv-array format.
     *
     * @param arrayQuery a null array of string using the csv-array format
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> arrayStringCsvNull(List<String> arrayQuery) throws ErrorException, IOException;

    /**
     * Get a null array of string using the csv-array format.
     *
     * @param arrayQuery a null array of string using the csv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> arrayStringCsvNullAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an empty array [] of string using the csv-array format.
     *
     * @param arrayQuery an empty array [] of string using the csv-array format
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> arrayStringCsvEmpty(List<String> arrayQuery) throws ErrorException, IOException;

    /**
     * Get an empty array [] of string using the csv-array format.
     *
     * @param arrayQuery an empty array [] of string using the csv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> arrayStringCsvEmptyAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the ssv-array format.
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the ssv-array format
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> arrayStringSsvValid(List<String> arrayQuery) throws ErrorException, IOException;

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the ssv-array format.
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the ssv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> arrayStringSsvValidAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the tsv-array format.
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the tsv-array format
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> arrayStringTsvValid(List<String> arrayQuery) throws ErrorException, IOException;

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the tsv-array format.
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the tsv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> arrayStringTsvValidAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the pipes-array format.
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the pipes-array format
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> arrayStringPipesValid(List<String> arrayQuery) throws ErrorException, IOException;

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the pipes-array format.
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the pipes-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> arrayStringPipesValidAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

}
