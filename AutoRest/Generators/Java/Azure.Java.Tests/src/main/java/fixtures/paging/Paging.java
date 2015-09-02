/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import fixtures.paging.models.Page<Product>;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;

/**
 * An instance of this class provides access to all the operations defined
 * in Paging.
 */
public interface Paging {
    /**
     * The interface defining all the services for Paging to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PagingService {
        @GET("/paging/single")
        Response getSinglePages(@Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/paging/single")
        void getSinglePagesAsync(@Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/paging/multiple")
        Response getMultiplePages(@Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/paging/multiple")
        void getMultiplePagesAsync(@Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/paging/multiple/retryfirst")
        Response getMultiplePagesRetryFirst(@Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/paging/multiple/retryfirst")
        void getMultiplePagesRetryFirstAsync(@Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/paging/multiple/retrysecond")
        Response getMultiplePagesRetrySecond(@Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/paging/multiple/retrysecond")
        void getMultiplePagesRetrySecondAsync(@Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/paging/single/failure")
        Response getSinglePagesFailure(@Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/paging/single/failure")
        void getSinglePagesFailureAsync(@Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/paging/multiple/failure")
        Response getMultiplePagesFailure(@Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/paging/multiple/failure")
        void getMultiplePagesFailureAsync(@Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/paging/multiple/failureuri")
        Response getMultiplePagesFailureUri(@Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/paging/multiple/failureuri")
        void getMultiplePagesFailureUriAsync(@Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("{nextLink}")
        Response getSinglePagesNext(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("{nextLink}")
        void getSinglePagesNextAsync(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("{nextLink}")
        Response getMultiplePagesNext(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("{nextLink}")
        void getMultiplePagesNextAsync(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("{nextLink}")
        Response getMultiplePagesRetryFirstNext(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("{nextLink}")
        void getMultiplePagesRetryFirstNextAsync(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("{nextLink}")
        Response getMultiplePagesRetrySecondNext(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("{nextLink}")
        void getMultiplePagesRetrySecondNextAsync(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("{nextLink}")
        Response getSinglePagesFailureNext(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("{nextLink}")
        void getSinglePagesFailureNextAsync(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("{nextLink}")
        Response getMultiplePagesFailureNext(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("{nextLink}")
        void getMultiplePagesFailureNextAsync(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("{nextLink}")
        Response getMultiplePagesFailureUriNext(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("{nextLink}")
        void getMultiplePagesFailureUriNextAsync(@Path("nextLink") String nextPageLink, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

    }
    /**
     * A paging operation that finishes on the first call without a nextlink
     *
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getSinglePages() throws ServiceException;

    /**
     * A paging operation that finishes on the first call without a nextlink
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getSinglePagesAsync(final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages
     *
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getMultiplePages() throws ServiceException;

    /**
     * A paging operation that includes a nextLink that has 10 pages
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMultiplePagesAsync(final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that fails on the first call with 500 and then
     * retries and then get a response including a nextLink that has 10 pages
     *
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getMultiplePagesRetryFirst() throws ServiceException;

    /**
     * A paging operation that fails on the first call with 500 and then
     * retries and then get a response including a nextLink that has 10 pages
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMultiplePagesRetryFirstAsync(final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which
     * the 2nd call fails first with 500. The client should retry and finish
     * all 10 pages eventually.
     *
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getMultiplePagesRetrySecond() throws ServiceException;

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which
     * the 2nd call fails first with 500. The client should retry and finish
     * all 10 pages eventually.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMultiplePagesRetrySecondAsync(final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that receives a 400 on the first call
     *
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getSinglePagesFailure() throws ServiceException;

    /**
     * A paging operation that receives a 400 on the first call
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getSinglePagesFailureAsync(final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that receives a 400 on the second call
     *
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getMultiplePagesFailure() throws ServiceException;

    /**
     * A paging operation that receives a 400 on the second call
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMultiplePagesFailureAsync(final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that receives an invalid nextLink
     *
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getMultiplePagesFailureUri() throws ServiceException;

    /**
     * A paging operation that receives an invalid nextLink
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMultiplePagesFailureUriAsync(final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that finishes on the first call without a nextlink
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getSinglePagesNext(String nextPageLink) throws ServiceException;

    /**
     * A paging operation that finishes on the first call without a nextlink
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getSinglePagesNextAsync(String nextPageLink, final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getMultiplePagesNext(String nextPageLink) throws ServiceException;

    /**
     * A paging operation that includes a nextLink that has 10 pages
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMultiplePagesNextAsync(String nextPageLink, final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that fails on the first call with 500 and then
     * retries and then get a response including a nextLink that has 10 pages
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getMultiplePagesRetryFirstNext(String nextPageLink) throws ServiceException;

    /**
     * A paging operation that fails on the first call with 500 and then
     * retries and then get a response including a nextLink that has 10 pages
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMultiplePagesRetryFirstNextAsync(String nextPageLink, final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which
     * the 2nd call fails first with 500. The client should retry and finish
     * all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getMultiplePagesRetrySecondNext(String nextPageLink) throws ServiceException;

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which
     * the 2nd call fails first with 500. The client should retry and finish
     * all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMultiplePagesRetrySecondNextAsync(String nextPageLink, final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that receives a 400 on the first call
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getSinglePagesFailureNext(String nextPageLink) throws ServiceException;

    /**
     * A paging operation that receives a 400 on the first call
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getSinglePagesFailureNextAsync(String nextPageLink, final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that receives a 400 on the second call
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getMultiplePagesFailureNext(String nextPageLink) throws ServiceException;

    /**
     * A paging operation that receives a 400 on the second call
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMultiplePagesFailureNextAsync(String nextPageLink, final ServiceCallback<Page<Product>> serviceCallback);

    /**
     * A paging operation that receives an invalid nextLink
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the Page&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Page<Product> getMultiplePagesFailureUriNext(String nextPageLink) throws ServiceException;

    /**
     * A paging operation that receives an invalid nextLink
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMultiplePagesFailureUriNextAsync(String nextPageLink, final ServiceCallback<Page<Product>> serviceCallback);

}
