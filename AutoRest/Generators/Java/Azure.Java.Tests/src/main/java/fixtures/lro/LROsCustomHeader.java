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
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
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
        Call<ResponseBody> putAsyncRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/customheader/putasync/retry/succeeded")
        Call<ResponseBody> beginPutAsyncRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/customheader/put/201/creating/succeeded/200")
        Call<ResponseBody> put201CreatingSucceeded200(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/customheader/put/201/creating/succeeded/200")
        Call<ResponseBody> beginPut201CreatingSucceeded200(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/customheader/post/202/retry/200")
        Call<ResponseBody> post202Retry200(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/customheader/post/202/retry/200")
        Call<ResponseBody> beginPost202Retry200(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/customheader/postasync/retry/succeeded")
        Call<ResponseBody> postAsyncRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/customheader/postasync/retry/succeeded")
        Call<ResponseBody> beginPostAsyncRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage);

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
    Call<ResponseBody> putAsyncRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback);

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
    Call<ResponseBody> beginPutAsyncRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback);

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
    Call<ResponseBody> put201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback);

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
    Call<ResponseBody> beginPut201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback);

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
    Call<ResponseBody> post202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback);

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
    Call<ResponseBody> beginPost202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback);

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
    Call<ResponseBody> postAsyncRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback);

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
    Call<ResponseBody> beginPostAsyncRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback);

}
