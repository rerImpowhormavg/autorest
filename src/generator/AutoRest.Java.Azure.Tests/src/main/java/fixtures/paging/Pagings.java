/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceResponse;
import fixtures.paging.models.PageImpl;
import fixtures.paging.models.PageImpl1;
import fixtures.paging.models.PagingGetMultiplePagesOptions;
import fixtures.paging.models.PagingGetMultiplePagesWithOffsetNextOptions;
import fixtures.paging.models.PagingGetMultiplePagesWithOffsetOptions;
import fixtures.paging.models.PagingGetOdataMultiplePagesOptions;
import fixtures.paging.models.Product;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in Pagings.
 */
public interface Pagings {
    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getSinglePages() throws CloudException, IOException;

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getSinglePagesAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePages() throws CloudException, IOException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesAsync(final ListOperationCallback<Product> serviceCallback);
    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePages(final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions) throws CloudException, IOException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesAsync(final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getOdataMultiplePages() throws CloudException, IOException;

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getOdataMultiplePagesAsync(final ListOperationCallback<Product> serviceCallback);
    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetOdataMultiplePagesOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getOdataMultiplePages(final String clientRequestId, final PagingGetOdataMultiplePagesOptions pagingGetOdataMultiplePagesOptions) throws CloudException, IOException;

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetOdataMultiplePagesOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getOdataMultiplePagesAsync(final String clientRequestId, final PagingGetOdataMultiplePagesOptions pagingGetOdataMultiplePagesOptions, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param pagingGetMultiplePagesWithOffsetOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesWithOffset(final PagingGetMultiplePagesWithOffsetOptions pagingGetMultiplePagesWithOffsetOptions) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param pagingGetMultiplePagesWithOffsetOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesWithOffsetAsync(final PagingGetMultiplePagesWithOffsetOptions pagingGetMultiplePagesWithOffsetOptions, final ListOperationCallback<Product> serviceCallback);
    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param pagingGetMultiplePagesWithOffsetOptions Additional parameters for the operation
     * @param clientRequestId the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesWithOffset(final PagingGetMultiplePagesWithOffsetOptions pagingGetMultiplePagesWithOffsetOptions, final String clientRequestId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param pagingGetMultiplePagesWithOffsetOptions Additional parameters for the operation
     * @param clientRequestId the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesWithOffsetAsync(final PagingGetMultiplePagesWithOffsetOptions pagingGetMultiplePagesWithOffsetOptions, final String clientRequestId, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesRetryFirst() throws CloudException, IOException;

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesRetryFirstAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesRetrySecond() throws CloudException, IOException;

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesRetrySecondAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getSinglePagesFailure() throws CloudException, IOException;

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getSinglePagesFailureAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesFailure() throws CloudException, IOException;

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesFailureAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesFailureUri() throws CloudException, IOException;

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesFailureUriAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getSinglePagesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getSinglePagesNextAsync(final String nextPageLink, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesNextAsync(final String nextPageLink, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);
    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesNext(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesNextAsync(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getOdataMultiplePagesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getOdataMultiplePagesNextAsync(final String nextPageLink, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);
    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetOdataMultiplePagesOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getOdataMultiplePagesNext(final String nextPageLink, final String clientRequestId, final PagingGetOdataMultiplePagesOptions pagingGetOdataMultiplePagesOptions) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetOdataMultiplePagesOptions Additional parameters for the operation
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getOdataMultiplePagesNextAsync(final String nextPageLink, final String clientRequestId, final PagingGetOdataMultiplePagesOptions pagingGetOdataMultiplePagesOptions, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesWithOffsetNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesWithOffsetNextAsync(final String nextPageLink, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);
    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesWithOffsetNextOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesWithOffsetNext(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesWithOffsetNextOptions pagingGetMultiplePagesWithOffsetNextOptions) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesWithOffsetNextOptions Additional parameters for the operation
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesWithOffsetNextAsync(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesWithOffsetNextOptions pagingGetMultiplePagesWithOffsetNextOptions, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesRetryFirstNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesRetryFirstNextAsync(final String nextPageLink, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesRetrySecondNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesRetrySecondNextAsync(final String nextPageLink, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getSinglePagesFailureNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getSinglePagesFailureNextAsync(final String nextPageLink, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesFailureNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesFailureNextAsync(final String nextPageLink, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Product>> getMultiplePagesFailureUriNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Page<Product>> getMultiplePagesFailureUriNextAsync(final String nextPageLink, final ServiceCall<Page<Product>> serviceCall, final ListOperationCallback<Product> serviceCallback);

}
