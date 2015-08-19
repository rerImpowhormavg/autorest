/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import org.joda.time.LocalDate;
import org.joda.time.DateTime;
import fixtures.header.models.GreyscaleColors;
import retrofit.http.POST;
import retrofit.http.Header;

/**
 * An instance of this class provides access to all the operations defined
 * in HeaderOperations.
 */
public interface HeaderOperations {
    /**
     * The interface defining all the services for HeaderOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HeaderService {
        @POST("/header/param/existingkey")
        Response paramExistingKey(@Header("User-Agent") String userAgent) throws ServiceException;

        @POST("/header/param/existingkey")
        void paramExistingKeyAsync(@Header("User-Agent") String userAgent, ServiceResponseCallback cb);

        @POST("/header/response/existingkey")
        Response responseExistingKey() throws ServiceException;

        @POST("/header/response/existingkey")
        void responseExistingKeyAsync(ServiceResponseCallback cb);

        @POST("/header/param/protectedkey")
        Response paramProtectedKey(@Header("Content-Type") String contentType) throws ServiceException;

        @POST("/header/param/protectedkey")
        void paramProtectedKeyAsync(@Header("Content-Type") String contentType, ServiceResponseCallback cb);

        @POST("/header/response/protectedkey")
        Response responseProtectedKey() throws ServiceException;

        @POST("/header/response/protectedkey")
        void responseProtectedKeyAsync(ServiceResponseCallback cb);

        @POST("/header/param/prim/integer")
        Response paramInteger(@Header("scenario") String scenario, @Header("value") int value) throws ServiceException;

        @POST("/header/param/prim/integer")
        void paramIntegerAsync(@Header("scenario") String scenario, @Header("value") int value, ServiceResponseCallback cb);

        @POST("/header/response/prim/integer")
        Response responseInteger(@Header("scenario") String scenario) throws ServiceException;

        @POST("/header/response/prim/integer")
        void responseIntegerAsync(@Header("scenario") String scenario, ServiceResponseCallback cb);

        @POST("/header/param/prim/long")
        Response paramLong(@Header("scenario") String scenario, @Header("value") long value) throws ServiceException;

        @POST("/header/param/prim/long")
        void paramLongAsync(@Header("scenario") String scenario, @Header("value") long value, ServiceResponseCallback cb);

        @POST("/header/response/prim/long")
        Response responseLong(@Header("scenario") String scenario) throws ServiceException;

        @POST("/header/response/prim/long")
        void responseLongAsync(@Header("scenario") String scenario, ServiceResponseCallback cb);

        @POST("/header/param/prim/float")
        Response paramFloat(@Header("scenario") String scenario, @Header("value") double value) throws ServiceException;

        @POST("/header/param/prim/float")
        void paramFloatAsync(@Header("scenario") String scenario, @Header("value") double value, ServiceResponseCallback cb);

        @POST("/header/response/prim/float")
        Response responseFloat(@Header("scenario") String scenario) throws ServiceException;

        @POST("/header/response/prim/float")
        void responseFloatAsync(@Header("scenario") String scenario, ServiceResponseCallback cb);

        @POST("/header/param/prim/double")
        Response paramDouble(@Header("scenario") String scenario, @Header("value") double value) throws ServiceException;

        @POST("/header/param/prim/double")
        void paramDoubleAsync(@Header("scenario") String scenario, @Header("value") double value, ServiceResponseCallback cb);

        @POST("/header/response/prim/double")
        Response responseDouble(@Header("scenario") String scenario) throws ServiceException;

        @POST("/header/response/prim/double")
        void responseDoubleAsync(@Header("scenario") String scenario, ServiceResponseCallback cb);

        @POST("/header/param/prim/bool")
        Response paramBool(@Header("scenario") String scenario, @Header("value") boolean value) throws ServiceException;

        @POST("/header/param/prim/bool")
        void paramBoolAsync(@Header("scenario") String scenario, @Header("value") boolean value, ServiceResponseCallback cb);

        @POST("/header/response/prim/bool")
        Response responseBool(@Header("scenario") String scenario) throws ServiceException;

        @POST("/header/response/prim/bool")
        void responseBoolAsync(@Header("scenario") String scenario, ServiceResponseCallback cb);

        @POST("/header/param/prim/string")
        Response paramString(@Header("scenario") String scenario, @Header("value") String value) throws ServiceException;

        @POST("/header/param/prim/string")
        void paramStringAsync(@Header("scenario") String scenario, @Header("value") String value, ServiceResponseCallback cb);

        @POST("/header/response/prim/string")
        Response responseString(@Header("scenario") String scenario) throws ServiceException;

        @POST("/header/response/prim/string")
        void responseStringAsync(@Header("scenario") String scenario, ServiceResponseCallback cb);

        @POST("/header/param/prim/date")
        Response paramDate(@Header("scenario") String scenario, @Header("value") LocalDate value) throws ServiceException;

        @POST("/header/param/prim/date")
        void paramDateAsync(@Header("scenario") String scenario, @Header("value") LocalDate value, ServiceResponseCallback cb);

        @POST("/header/response/prim/date")
        Response responseDate(@Header("scenario") String scenario) throws ServiceException;

        @POST("/header/response/prim/date")
        void responseDateAsync(@Header("scenario") String scenario, ServiceResponseCallback cb);

        @POST("/header/param/prim/datetime")
        Response paramDatetime(@Header("scenario") String scenario, @Header("value") DateTime value) throws ServiceException;

        @POST("/header/param/prim/datetime")
        void paramDatetimeAsync(@Header("scenario") String scenario, @Header("value") DateTime value, ServiceResponseCallback cb);

        @POST("/header/response/prim/datetime")
        Response responseDatetime(@Header("scenario") String scenario) throws ServiceException;

        @POST("/header/response/prim/datetime")
        void responseDatetimeAsync(@Header("scenario") String scenario, ServiceResponseCallback cb);

        @POST("/header/param/prim/byte")
        Response paramByte(@Header("scenario") String scenario, @Header("value") byte[] value) throws ServiceException;

        @POST("/header/param/prim/byte")
        void paramByteAsync(@Header("scenario") String scenario, @Header("value") byte[] value, ServiceResponseCallback cb);

        @POST("/header/response/prim/byte")
        Response responseByte(@Header("scenario") String scenario) throws ServiceException;

        @POST("/header/response/prim/byte")
        void responseByteAsync(@Header("scenario") String scenario, ServiceResponseCallback cb);

        @POST("/header/param/prim/enum")
        Response paramEnum(@Header("scenario") String scenario, @Header("value") GreyscaleColors value) throws ServiceException;

        @POST("/header/param/prim/enum")
        void paramEnumAsync(@Header("scenario") String scenario, @Header("value") GreyscaleColors value, ServiceResponseCallback cb);

        @POST("/header/response/prim/enum")
        Response responseEnum(@Header("scenario") String scenario) throws ServiceException;

        @POST("/header/response/prim/enum")
        void responseEnumAsync(@Header("scenario") String scenario, ServiceResponseCallback cb);

        @POST("/header/custom/x-ms-client-request-id/9C4D50EE-2D56-4CD3-8152-34347DC9F2B0")
        Response customRequestId() throws ServiceException;

        @POST("/header/custom/x-ms-client-request-id/9C4D50EE-2D56-4CD3-8152-34347DC9F2B0")
        void customRequestIdAsync(ServiceResponseCallback cb);

    }
    /**
     * Send a post request with header value "User-Agent": "overwrite"
     *
     * @param userAgent Send a post request with header value "User-Agent": "overwrite"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramExistingKey(String userAgent) throws ServiceException;

    /**
     * Send a post request with header value "User-Agent": "overwrite"
     *
     * @param userAgent Send a post request with header value "User-Agent": "overwrite"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramExistingKeyAsync(String userAgent, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "User-Agent": "overwrite"
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseExistingKey() throws ServiceException;

    /**
     * Get a response with header value "User-Agent": "overwrite"
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseExistingKeyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header value "Content-Type": "text/html"
     *
     * @param contentType Send a post request with header value "Content-Type": "text/html"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramProtectedKey(String contentType) throws ServiceException;

    /**
     * Send a post request with header value "Content-Type": "text/html"
     *
     * @param contentType Send a post request with header value "Content-Type": "text/html"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramProtectedKeyAsync(String contentType, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "Content-Type": "text/html"
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseProtectedKey() throws ServiceException;

    /**
     * Get a response with header value "Content-Type": "text/html"
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseProtectedKeyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "positive", "value":
     * 1 or "scenario": "negative", "value": -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 1 or -2
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramInteger(String scenario, int value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "positive", "value":
     * 1 or "scenario": "negative", "value": -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 1 or -2
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramIntegerAsync(String scenario, int value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "value": 1 or -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseInteger(String scenario) throws ServiceException;

    /**
     * Get a response with header value "value": 1 or -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseIntegerAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "positive", "value":
     * 105 or "scenario": "negative", "value": -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 105 or -2
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramLong(String scenario, long value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "positive", "value":
     * 105 or "scenario": "negative", "value": -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 105 or -2
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramLongAsync(String scenario, long value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "value": 105 or -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseLong(String scenario) throws ServiceException;

    /**
     * Get a response with header value "value": 105 or -2
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseLongAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "positive", "value":
     * 0.07 or "scenario": "negative", "value": -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 0.07 or -3.0
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramFloat(String scenario, double value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "positive", "value":
     * 0.07 or "scenario": "negative", "value": -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 0.07 or -3.0
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramFloatAsync(String scenario, double value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "value": 0.07 or -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseFloat(String scenario) throws ServiceException;

    /**
     * Get a response with header value "value": 0.07 or -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseFloatAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "positive", "value":
     * 7e120 or "scenario": "negative", "value": -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 7e120 or -3.0
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramDouble(String scenario, double value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "positive", "value":
     * 7e120 or "scenario": "negative", "value": -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param value Send a post request with header values 7e120 or -3.0
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramDoubleAsync(String scenario, double value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "value": 7e120 or -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseDouble(String scenario) throws ServiceException;

    /**
     * Get a response with header value "value": 7e120 or -3.0
     *
     * @param scenario Send a post request with header values "scenario": "positive" or "negative"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseDoubleAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "true", "value":
     * true or "scenario": "false", "value": false
     *
     * @param scenario Send a post request with header values "scenario": "true" or "false"
     * @param value Send a post request with header values true or false
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramBool(String scenario, boolean value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "true", "value":
     * true or "scenario": "false", "value": false
     *
     * @param scenario Send a post request with header values "scenario": "true" or "false"
     * @param value Send a post request with header values true or false
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramBoolAsync(String scenario, boolean value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header value "value": true or false
     *
     * @param scenario Send a post request with header values "scenario": "true" or "false"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseBool(String scenario) throws ServiceException;

    /**
     * Get a response with header value "value": true or false
     *
     * @param scenario Send a post request with header values "scenario": "true" or "false"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseBoolAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "The quick brown fox jumps over the lazy dog" or "scenario": "null",
     * "value": null or "scenario": "empty", "value": ""
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param value Send a post request with header values "The quick brown fox jumps over the lazy dog" or null or ""
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramString(String scenario, String value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "The quick brown fox jumps over the lazy dog" or "scenario": "null",
     * "value": null or "scenario": "empty", "value": ""
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param value Send a post request with header values "The quick brown fox jumps over the lazy dog" or null or ""
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramStringAsync(String scenario, String value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "The quick brown fox jumps over the
     * lazy dog" or null or ""
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseString(String scenario) throws ServiceException;

    /**
     * Get a response with header values "The quick brown fox jumps over the
     * lazy dog" or null or ""
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseStringAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "2010-01-01" or "scenario": "min", "value": "0001-01-01"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param value Send a post request with header values "2010-01-01" or "0001-01-01"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramDate(String scenario, LocalDate value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "2010-01-01" or "scenario": "min", "value": "0001-01-01"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param value Send a post request with header values "2010-01-01" or "0001-01-01"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramDateAsync(String scenario, LocalDate value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "2010-01-01" or "0001-01-01"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseDate(String scenario) throws ServiceException;

    /**
     * Get a response with header values "2010-01-01" or "0001-01-01"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseDateAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "2010-01-01T12:34:56Z" or "scenario": "min", "value":
     * "0001-01-01T00:00:00Z"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param value Send a post request with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramDatetime(String scenario, DateTime value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "2010-01-01T12:34:56Z" or "scenario": "min", "value":
     * "0001-01-01T00:00:00Z"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param value Send a post request with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramDatetimeAsync(String scenario, DateTime value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "2010-01-01T12:34:56Z" or
     * "0001-01-01T00:00:00Z"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseDatetime(String scenario) throws ServiceException;

    /**
     * Get a response with header values "2010-01-01T12:34:56Z" or
     * "0001-01-01T00:00:00Z"
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "min"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseDatetimeAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "啊齄丂狛狜隣郎隣兀﨩"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @param value Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramByte(String scenario, byte[] value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "啊齄丂狛狜隣郎隣兀﨩"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @param value Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramByteAsync(String scenario, byte[] value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "啊齄丂狛狜隣郎隣兀﨩"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseByte(String scenario) throws ServiceException;

    /**
     * Get a response with header values "啊齄丂狛狜隣郎隣兀﨩"
     *
     * @param scenario Send a post request with header values "scenario": "valid"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseByteAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "GREY" or "scenario": "null", "value": null
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param value Send a post request with header values 'GREY' . Possible values for this parameter include: 'White', 'black', 'GREY'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramEnum(String scenario, GreyscaleColors value) throws ServiceException;

    /**
     * Send a post request with header values "scenario": "valid", "value":
     * "GREY" or "scenario": "null", "value": null
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param value Send a post request with header values 'GREY' . Possible values for this parameter include: 'White', 'black', 'GREY'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void paramEnumAsync(String scenario, GreyscaleColors value, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a response with header values "GREY" or null
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void responseEnum(String scenario) throws ServiceException;

    /**
     * Get a response with header values "GREY" or null
     *
     * @param scenario Send a post request with header values "scenario": "valid" or "null" or "empty"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void responseEnumAsync(String scenario, final ServiceCallback<Void> serviceCallback);

    /**
     * Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in
     * the header of the request
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void customRequestId() throws ServiceException;

    /**
     * Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in
     * the header of the request
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void customRequestIdAsync(final ServiceCallback<Void> serviceCallback);

}
