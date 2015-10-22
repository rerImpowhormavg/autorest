/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.Resource;
import com.microsoft.rest.SubResource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import java.io.IOException;
import fixtures.lro.models.Product;
import retrofit.http.PUT;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.POST;

public class LRORetrysImpl implements LRORetrys {
    private LRORetrysService service;
    AutoRestLongRunningOperationTestService client;

    public LRORetrysImpl(Retrofit retrofit, AutoRestLongRunningOperationTestService client) {
        this.service = retrofit.create(LRORetrysService.class);
        this.client = client;
    }

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @param product Product to put
     * @return the Product object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Product> put201CreatingSucceeded200(Product product) throws ServiceException, IOException, InterruptedException {
        Response<ResponseBody> result = service.put201CreatingSucceeded200(product, this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Product>() {}.getType());
    }

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> put201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback) {
        Call<ResponseBody> call = service.put201CreatingSucceeded200(product, this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @return the Product object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Product> putAsyncRelativeRetrySucceeded(Product product) throws ServiceException, IOException, InterruptedException {
        Response<ResponseBody> result = service.putAsyncRelativeRetrySucceeded(product, this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Product>() {}.getType());
    }

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback) {
        Call<ResponseBody> call = service.putAsyncRelativeRetrySucceeded(product, this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @return the Product object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Product> deleteProvisioning202Accepted200Succeeded() throws ServiceException, IOException, InterruptedException {
        Response<ResponseBody> result = service.deleteProvisioning202Accepted200Succeeded(this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Product>() {}.getType());
    }

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> deleteProvisioning202Accepted200SucceededAsync(final ServiceCallback<Product> serviceCallback) {
        Call<ResponseBody> call = service.deleteProvisioning202Accepted200Succeeded(this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> delete202Retry200() throws ServiceException, IOException, InterruptedException {
        Response<ResponseBody> result = service.delete202Retry200(this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Void>() {}.getType());
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> delete202Retry200Async(final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.delete202Retry200(this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> deleteAsyncRelativeRetrySucceeded() throws ServiceException, IOException, InterruptedException {
        Response<ResponseBody> result = service.deleteAsyncRelativeRetrySucceeded(this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Void>() {}.getType());
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> deleteAsyncRelativeRetrySucceededAsync(final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.deleteAsyncRelativeRetrySucceeded(this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success
     *
     * @param product Product to put
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> post202Retry200(Product product) throws ServiceException, IOException, InterruptedException {
        Response<ResponseBody> result = service.post202Retry200(product, this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Void>() {}.getType());
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> post202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.post202Retry200(product, this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> postAsyncRelativeRetrySucceeded(Product product) throws ServiceException, IOException, InterruptedException {
        Response<ResponseBody> result = service.postAsyncRelativeRetrySucceeded(product, this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Void>() {}.getType());
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.postAsyncRelativeRetrySucceeded(product, this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, serviceCallback);
            }
        });
        return call;
    }

}
