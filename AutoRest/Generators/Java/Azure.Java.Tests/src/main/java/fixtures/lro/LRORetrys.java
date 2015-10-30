/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.lro.models.Product;
import java.io.IOException;
import java.lang.InterruptedException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.POST;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in LRORetrys.
 */
public interface LRORetrys {
    /**
     * The interface defining all the services for LRORetrys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LRORetrysService {
        @PUT("/lro/retryerror/put/201/creating/succeeded/200")
        Call<ResponseBody> put201CreatingSucceeded200(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/retryerror/putasync/retry/succeeded")
        Call<ResponseBody> putAsyncRelativeRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/retryerror/delete/provisioning/202/accepted/200/succeeded", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteProvisioning202Accepted200Succeeded(@Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/retryerror/delete/202/retry/200", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete202Retry200(@Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/retryerror/deleteasync/retry/succeeded", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAsyncRelativeRetrySucceeded(@Header("accept-language") String acceptLanguage);

        @POST("/lro/retryerror/post/202/retry/200")
        Call<ResponseBody> post202Retry200(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/retryerror/postasync/retry/succeeded")
        Call<ResponseBody> postAsyncRelativeRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> put201CreatingSucceeded200(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> putAsyncRelativeRetrySucceeded(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> deleteProvisioning202Accepted200Succeeded() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteProvisioning202Accepted200SucceededAsync(final ServiceCallback<Product> serviceCallback);

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete202Retry200() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete202Retry200Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAsyncRelativeRetrySucceeded() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsyncRelativeRetrySucceededAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> post202Retry200(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postAsyncRelativeRetrySucceeded(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback);

}
