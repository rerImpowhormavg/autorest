/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import fixtures.lro.models.Product;
import retrofit.http.PUT;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.POST;

/**
 * An instance of this class provides access to all the operations defined
 * in LROsCustomHeader.
 */
public interface LROsCustomHeader {
    /**
     * The interface defining all the services for LROsCustomHeader to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LROsCustomHeaderService {
        @PUT("/lro/customheader/putasync/retry/succeeded")
        Response putAsyncRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @PUT("/lro/customheader/putasync/retry/succeeded")
        void putAsyncRetrySucceededAsync(@Body Product product, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @PUT("/lro/customheader/putasync/retry/succeeded")
        Response beginPutAsyncRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @PUT("/lro/customheader/putasync/retry/succeeded")
        void beginPutAsyncRetrySucceededAsync(@Body Product product, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @PUT("/lro/customheader/put/201/creating/succeeded/200")
        Response put201CreatingSucceeded200(@Body Product product, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @PUT("/lro/customheader/put/201/creating/succeeded/200")
        void put201CreatingSucceeded200Async(@Body Product product, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @PUT("/lro/customheader/put/201/creating/succeeded/200")
        Response beginPut201CreatingSucceeded200(@Body Product product, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @PUT("/lro/customheader/put/201/creating/succeeded/200")
        void beginPut201CreatingSucceeded200Async(@Body Product product, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @POST("/lro/customheader/post/202/retry/200")
        Response post202Retry200(@Body Product product, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @POST("/lro/customheader/post/202/retry/200")
        void post202Retry200Async(@Body Product product, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @POST("/lro/customheader/post/202/retry/200")
        Response beginPost202Retry200(@Body Product product, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @POST("/lro/customheader/post/202/retry/200")
        void beginPost202Retry200Async(@Body Product product, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @POST("/lro/customheader/postasync/retry/succeeded")
        Response postAsyncRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @POST("/lro/customheader/postasync/retry/succeeded")
        void postAsyncRetrySucceededAsync(@Body Product product, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @POST("/lro/customheader/postasync/retry/succeeded")
        Response beginPostAsyncRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @POST("/lro/customheader/postasync/retry/succeeded")
        void beginPostAsyncRetrySucceededAsync(@Body Product product, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

    }
    /**
     *
     * @param product Product to put
     * @return the Product object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Product putAsyncRetrySucceeded(Product product) throws ServiceException;

    /**
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putAsyncRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     *
     * @param product Product to put
     * @return the Product object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Product beginPutAsyncRetrySucceeded(Product product) throws ServiceException;

    /**
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void beginPutAsyncRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     *
     * @param product Product to put
     * @return the Product object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Product put201CreatingSucceeded200(Product product) throws ServiceException;

    /**
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     *
     * @param product Product to put
     * @return the Product object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Product beginPut201CreatingSucceeded200(Product product) throws ServiceException;

    /**
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void beginPut201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     *
     * @param product Product to put
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post202Retry200(Product product) throws ServiceException;

    /**
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void post202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param product Product to put
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void beginPost202Retry200(Product product) throws ServiceException;

    /**
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void beginPost202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param product Product to put
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void postAsyncRetrySucceeded(Product product) throws ServiceException;

    /**
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void postAsyncRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param product Product to put
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void beginPostAsyncRetrySucceeded(Product product) throws ServiceException;

    /**
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void beginPostAsyncRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback);

}
