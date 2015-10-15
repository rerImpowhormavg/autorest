/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetime;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import org.joda.time.DateTime;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in DatetimeOperations.
 */
public interface DatetimeOperations {
    /**
     * The interface defining all the services for DatetimeOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DatetimeService {
        @GET("/datetime/null")
        Call<ResponseBody> getNull();

        @GET("/datetime/invalid")
        Call<ResponseBody> getInvalid();

        @GET("/datetime/overflow")
        Call<ResponseBody> getOverflow();

        @GET("/datetime/underflow")
        Call<ResponseBody> getUnderflow();

        @PUT("/datetime/max/utc")
        Call<ResponseBody> putUtcMaxDateTime(@Body DateTime datetimeBody);

        @GET("/datetime/max/utc/lowercase")
        Call<ResponseBody> getUtcLowercaseMaxDateTime();

        @GET("/datetime/max/utc/uppercase")
        Call<ResponseBody> getUtcUppercaseMaxDateTime();

        @PUT("/datetime/max/localpositiveoffset")
        Call<ResponseBody> putLocalPositiveOffsetMaxDateTime(@Body DateTime datetimeBody);

        @GET("/datetime/max/localpositiveoffset/lowercase")
        Call<ResponseBody> getLocalPositiveOffsetLowercaseMaxDateTime();

        @GET("/datetime/max/localpositiveoffset/uppercase")
        Call<ResponseBody> getLocalPositiveOffsetUppercaseMaxDateTime();

        @PUT("/datetime/max/localnegativeoffset")
        Call<ResponseBody> putLocalNegativeOffsetMaxDateTime(@Body DateTime datetimeBody);

        @GET("/datetime/max/localnegativeoffset/uppercase")
        Call<ResponseBody> getLocalNegativeOffsetUppercaseMaxDateTime();

        @GET("/datetime/max/localnegativeoffset/lowercase")
        Call<ResponseBody> getLocalNegativeOffsetLowercaseMaxDateTime();

        @PUT("/datetime/min/utc")
        Call<ResponseBody> putUtcMinDateTime(@Body DateTime datetimeBody);

        @GET("/datetime/min/utc")
        Call<ResponseBody> getUtcMinDateTime();

        @PUT("/datetime/min/localpositiveoffset")
        Call<ResponseBody> putLocalPositiveOffsetMinDateTime(@Body DateTime datetimeBody);

        @GET("/datetime/min/localpositiveoffset")
        Call<ResponseBody> getLocalPositiveOffsetMinDateTime();

        @PUT("/datetime/min/localnegativeoffset")
        Call<ResponseBody> putLocalNegativeOffsetMinDateTime(@Body DateTime datetimeBody);

        @GET("/datetime/min/localnegativeoffset")
        Call<ResponseBody> getLocalNegativeOffsetMinDateTime();

    }
    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getInvalid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getOverflow() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getOverflowAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getUnderflow() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getUnderflowAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putUtcMaxDateTime(DateTime datetimeBody) throws ServiceException;

    /**
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putUtcMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getUtcLowercaseMaxDateTime() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getUtcUppercaseMaxDateTime() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putLocalPositiveOffsetMaxDateTime(DateTime datetimeBody) throws ServiceException;

    /**
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putLocalPositiveOffsetMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getLocalPositiveOffsetLowercaseMaxDateTime() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getLocalPositiveOffsetLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getLocalPositiveOffsetUppercaseMaxDateTime() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getLocalPositiveOffsetUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putLocalNegativeOffsetMaxDateTime(DateTime datetimeBody) throws ServiceException;

    /**
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putLocalNegativeOffsetMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getLocalNegativeOffsetUppercaseMaxDateTime() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getLocalNegativeOffsetUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getLocalNegativeOffsetLowercaseMaxDateTime() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getLocalNegativeOffsetLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putUtcMinDateTime(DateTime datetimeBody) throws ServiceException;

    /**
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putUtcMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getUtcMinDateTime() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getUtcMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putLocalPositiveOffsetMinDateTime(DateTime datetimeBody) throws ServiceException;

    /**
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putLocalPositiveOffsetMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getLocalPositiveOffsetMinDateTime() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getLocalPositiveOffsetMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putLocalNegativeOffsetMinDateTime(DateTime datetimeBody) throws ServiceException;

    /**
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putLocalNegativeOffsetMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DateTime getLocalNegativeOffsetMinDateTime() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getLocalNegativeOffsetMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

}
