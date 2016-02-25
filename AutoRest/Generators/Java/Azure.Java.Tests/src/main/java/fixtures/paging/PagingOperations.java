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
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceResponse;
import fixtures.paging.models.PageImpl;
import fixtures.paging.models.PagingGetMultiplePagesOptions;
import fixtures.paging.models.PagingGetMultiplePagesWithOffsetNextOptions;
import fixtures.paging.models.PagingGetMultiplePagesWithOffsetOptions;
import fixtures.paging.models.Product;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in PagingOperations.
 */
public interface PagingOperations {
    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<Product>> getSinglePages() throws CloudException, IOException;

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSinglePagesAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<Product>> getMultiplePages(final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions) throws CloudException, IOException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesAsync(final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param pagingGetMultiplePagesWithOffsetOptions Additional parameters for the operation
     * @param clientRequestId the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<Product>> getMultiplePagesWithOffset(final PagingGetMultiplePagesWithOffsetOptions pagingGetMultiplePagesWithOffsetOptions, final String clientRequestId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param pagingGetMultiplePagesWithOffsetOptions Additional parameters for the operation
     * @param clientRequestId the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesWithOffsetAsync(final PagingGetMultiplePagesWithOffsetOptions pagingGetMultiplePagesWithOffsetOptions, final String clientRequestId, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<Product>> getMultiplePagesRetryFirst() throws CloudException, IOException;

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesRetryFirstAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<Product>> getMultiplePagesRetrySecond() throws CloudException, IOException;

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesRetrySecondAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<Product>> getSinglePagesFailure() throws CloudException, IOException;

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSinglePagesFailureAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<Product>> getMultiplePagesFailure() throws CloudException, IOException;

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesFailureAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<Product>> getMultiplePagesFailureUri() throws CloudException, IOException;

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesFailureUriAsync(final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getSinglePagesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSinglePagesNextAsync(final String nextPageLink, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesNext(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesNextAsync(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesOptions pagingGetMultiplePagesOptions, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesWithOffsetNextOptions Additional parameters for the operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesWithOffsetNext(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesWithOffsetNextOptions pagingGetMultiplePagesWithOffsetNextOptions) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param clientRequestId the String value
     * @param pagingGetMultiplePagesWithOffsetNextOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesWithOffsetNextAsync(final String nextPageLink, final String clientRequestId, final PagingGetMultiplePagesWithOffsetNextOptions pagingGetMultiplePagesWithOffsetNextOptions, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirstNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesRetryFirstNextAsync(final String nextPageLink, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecondNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesRetrySecondNextAsync(final String nextPageLink, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getSinglePagesFailureNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSinglePagesFailureNextAsync(final String nextPageLink, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesFailureNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesFailureNextAsync(final String nextPageLink, final ListOperationCallback<Product> serviceCallback);

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Product&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUriNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiplePagesFailureUriNextAsync(final String nextPageLink, final ListOperationCallback<Product> serviceCallback);

}
