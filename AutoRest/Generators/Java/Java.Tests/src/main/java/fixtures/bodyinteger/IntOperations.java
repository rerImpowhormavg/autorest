/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in IntOperations.
 */
public interface IntOperations {
    /**
     * The interface defining all the services for IntOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntService {
        @GET("/int/null")
        Response getNull() throws ServiceException;

        @GET("/int/null")
        void getNullAsync(ServiceResponseCallback cb);

        @GET("/int/invalid")
        Response getInvalid() throws ServiceException;

        @GET("/int/invalid")
        void getInvalidAsync(ServiceResponseCallback cb);

        @GET("/int/overflowint32")
        Response getOverflowInt32() throws ServiceException;

        @GET("/int/overflowint32")
        void getOverflowInt32Async(ServiceResponseCallback cb);

        @GET("/int/underflowint32")
        Response getUnderflowInt32() throws ServiceException;

        @GET("/int/underflowint32")
        void getUnderflowInt32Async(ServiceResponseCallback cb);

        @GET("/int/overflowint64")
        Response getOverflowInt64() throws ServiceException;

        @GET("/int/overflowint64")
        void getOverflowInt64Async(ServiceResponseCallback cb);

        @GET("/int/underflowint64")
        Response getUnderflowInt64() throws ServiceException;

        @GET("/int/underflowint64")
        void getUnderflowInt64Async(ServiceResponseCallback cb);

        @PUT("/int/max/32")
        Response putMax32(@Body int intBody) throws ServiceException;

        @PUT("/int/max/32")
        void putMax32Async(@Body int intBody, ServiceResponseCallback cb);

        @PUT("/int/max/64")
        Response putMax64(@Body long intBody) throws ServiceException;

        @PUT("/int/max/64")
        void putMax64Async(@Body long intBody, ServiceResponseCallback cb);

        @PUT("/int/min/32")
        Response putMin32(@Body int intBody) throws ServiceException;

        @PUT("/int/min/32")
        void putMin32Async(@Body int intBody, ServiceResponseCallback cb);

        @PUT("/int/min/64")
        Response putMin64(@Body long intBody) throws ServiceException;

        @PUT("/int/min/64")
        void putMin64Async(@Body long intBody, ServiceResponseCallback cb);

    }
    /**
     * Get null Int value
     *
     * @return the int object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    int getNull() throws ServiceException;

    /**
     * Get null Int value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNullAsync(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get invalid Int value
     *
     * @return the int object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    int getInvalid() throws ServiceException;

    /**
     * Get invalid Int value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getInvalidAsync(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get overflow Int32 value
     *
     * @return the int object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    int getOverflowInt32() throws ServiceException;

    /**
     * Get overflow Int32 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get underflow Int32 value
     *
     * @return the int object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    int getUnderflowInt32() throws ServiceException;

    /**
     * Get underflow Int32 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get overflow Int64 value
     *
     * @return the long object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    long getOverflowInt64() throws ServiceException;

    /**
     * Get overflow Int64 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getOverflowInt64Async(final ServiceCallback<Long> serviceCallback);

    /**
     * Get underflow Int64 value
     *
     * @return the long object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    long getUnderflowInt64() throws ServiceException;

    /**
     * Get underflow Int64 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback);

    /**
     * Put max int32 value
     *
     * @param intBody the int value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putMax32(int intBody) throws ServiceException;

    /**
     * Put max int32 value
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put max int64 value
     *
     * @param intBody the long value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putMax64(long intBody) throws ServiceException;

    /**
     * Put max int64 value
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put min int32 value
     *
     * @param intBody the int value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putMin32(int intBody) throws ServiceException;

    /**
     * Put min int32 value
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put min int64 value
     *
     * @param intBody the long value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putMin64(long intBody) throws ServiceException;

    /**
     * Put min int64 value
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback);

}
