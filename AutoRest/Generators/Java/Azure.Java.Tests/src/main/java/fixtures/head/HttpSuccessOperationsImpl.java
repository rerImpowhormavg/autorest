/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.head;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import java.io.IOException;
import retrofit2.Call;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpSuccessOperations.
 */
public final class HttpSuccessOperationsImpl implements HttpSuccessOperations {
    /** The Retrofit service to perform REST calls. */
    private HttpSuccessService service;
    /** The service client containing this operation class. */
    private AutoRestHeadTestService client;

    /**
     * Initializes an instance of HttpSuccessOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HttpSuccessOperationsImpl(Retrofit retrofit, AutoRestHeadTestService client) {
        this.service = retrofit.create(HttpSuccessService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpSuccessOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpSuccessService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/200")
        Call<Void> head200(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/204")
        Call<Void> head204(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/404")
        Call<Void> head404(@Header("accept-language") String acceptLanguage);

    }

    /**
     * Return 200 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> head200() throws CloudException, IOException {
        Call<Void> call = service.head200(this.client.getAcceptLanguage());
        return head200Delegate(call.execute());
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head200Async(final ServiceCallback<Boolean> serviceCallback) {
        Call<Void> call = service.head200(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseEmptyCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(head200Delegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> head200Delegate(Response<Void> response) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<Boolean, CloudException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildEmpty(response);
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> head204() throws CloudException, IOException {
        Call<Void> call = service.head204(this.client.getAcceptLanguage());
        return head204Delegate(call.execute());
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head204Async(final ServiceCallback<Boolean> serviceCallback) {
        Call<Void> call = service.head204(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseEmptyCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(head204Delegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> head204Delegate(Response<Void> response) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<Boolean, CloudException>()
                .register(204, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildEmpty(response);
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> head404() throws CloudException, IOException {
        Call<Void> call = service.head404(this.client.getAcceptLanguage());
        return head404Delegate(call.execute());
    }

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head404Async(final ServiceCallback<Boolean> serviceCallback) {
        Call<Void> call = service.head404(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseEmptyCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(head404Delegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> head404Delegate(Response<Void> response) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<Boolean, CloudException>()
                .register(204, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildEmpty(response);
    }

}
