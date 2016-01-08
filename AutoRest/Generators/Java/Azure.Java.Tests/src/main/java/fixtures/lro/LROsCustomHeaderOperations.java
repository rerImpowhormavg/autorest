/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro;

import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.squareup.okhttp.ResponseBody;
import fixtures.lro.models.LROsCustomHeaderPost202Retry200Headers;
import fixtures.lro.models.LROsCustomHeaderPostAsyncRetrySucceededHeaders;
import fixtures.lro.models.LROsCustomHeaderPutAsyncRetrySucceededHeaders;
import fixtures.lro.models.Product;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in LROsCustomHeaderOperations.
 */
public interface LROsCustomHeaderOperations {
    /**
     * The interface defining all the services for LROsCustomHeaderOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LROsCustomHeaderService {
        @PUT("/lro/customheader/putasync/retry/succeeded")
        Call<ResponseBody> putAsyncRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/customheader/put/201/creating/succeeded/200")
        Call<ResponseBody> put201CreatingSucceeded200(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/customheader/post/202/retry/200")
        Call<ResponseBody> post202Retry200(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/customheader/postasync/retry/succeeded")
        Call<ResponseBody> postAsyncRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage);

    }
    /**
     * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required message header for all requests. Long running put request, service returns a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponseWithHeaders if successful.
     */
    ServiceResponseWithHeaders<Product, LROsCustomHeaderPutAsyncRetrySucceededHeaders> putAsyncRetrySucceeded(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required message header for all requests. Long running put request, service returns a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putAsyncRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required message header for all requests. Long running put request, service returns a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> put201CreatingSucceeded200(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required message header for all requests. Long running put request, service returns a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required message header for all requests. Long running post request, service returns a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponseWithHeaders object if successful.
     */
    ServiceResponseWithHeaders<Void, LROsCustomHeaderPost202Retry200Headers> post202Retry200(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required message header for all requests. Long running post request, service returns a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required message header for all requests. Long running post request, service returns a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponseWithHeaders object if successful.
     */
    ServiceResponseWithHeaders<Void, LROsCustomHeaderPostAsyncRetrySucceededHeaders> postAsyncRetrySucceeded(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 is required message header for all requests. Long running post request, service returns a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postAsyncRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback);

}
