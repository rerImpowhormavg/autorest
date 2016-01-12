/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging;

import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.paging.models.PageImpl;
import fixtures.paging.models.PagingGetMultiplePagesNextOptions;
import fixtures.paging.models.PagingGetMultiplePagesOptions;
import fixtures.paging.models.Product;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in PagingOperations.
 */
public interface PagingOperations {
    /**
     * The interface defining all the services for PagingOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PagingService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("paging/single")
        Call<ResponseBody> getSinglePages(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("paging/multiple")
        Call<ResponseBody> getMultiplePages(@Header("client-request-id") String clientRequestId, @Header("accept-language") String acceptLanguage, @Header("maxresults") Integer maxresults, @Header("timeout") Integer timeout);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("paging/multiple/retryfirst")
        Call<ResponseBody> getMultiplePagesRetryFirst(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("paging/multiple/retrysecond")
        Call<ResponseBody> getMultiplePagesRetrySecond(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("paging/single/failure")
        Call<ResponseBody> getSinglePagesFailure(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("paging/multiple/failure")
        Call<ResponseBody> getMultiplePagesFailure(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("paging/multiple/failureuri")
        Call<ResponseBody> getMultiplePagesFailureUri(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> getSinglePagesNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> getMultiplePagesNext(@Url String nextPageLink, @Header("client-request-id") String clientRequestId, @Header("accept-language") String acceptLanguage, @Header("maxresults") Integer maxresults, @Header("timeout") Integer timeout);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> getMultiplePagesRetryFirstNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> getMultiplePagesRetrySecondNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> getSinglePagesFailureNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> getMultiplePagesFailureNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> getMultiplePagesFailureUriNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getSinglePages() throws CloudException, IOException;

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSinglePagesAsync(final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePages(String clientRequestId, PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions) throws CloudException, IOException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMultiplePagesAsync(String clientRequestId, PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions, final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirst() throws CloudException, IOException;

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMultiplePagesRetryFirstAsync(final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecond() throws CloudException, IOException;

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMultiplePagesRetrySecondAsync(final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getSinglePagesFailure() throws CloudException, IOException;

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSinglePagesFailureAsync(final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesFailure() throws CloudException, IOException;

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMultiplePagesFailureAsync(final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUri() throws CloudException, IOException;

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMultiplePagesFailureUriAsync(final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getSinglePagesNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSinglePagesNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesNextOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesNext(String nextPageLink, String clientRequestId, PagingGetMultiplePagesNextOptions pagingGetMultiplePagesNextOptions) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesNextOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMultiplePagesNextAsync(String nextPageLink, String clientRequestId, PagingGetMultiplePagesNextOptions pagingGetMultiplePagesNextOptions, final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirstNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMultiplePagesRetryFirstNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecondNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMultiplePagesRetrySecondNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getSinglePagesFailureNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSinglePagesFailureNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesFailureNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMultiplePagesFailureNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback);

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUriNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMultiplePagesFailureUriNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback);

}
