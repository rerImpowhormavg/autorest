/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.headexceptions.implementation;

import retrofit2.Retrofit;
import fixtures.headexceptions.HeadExceptions;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import retrofit2.Call;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in HeadExceptions.
 */
public final class HeadExceptionsImpl implements HeadExceptions {
    /** The Retrofit service to perform REST calls. */
    private HeadExceptionsService service;
    /** The service client containing this operation class. */
    private AutoRestHeadExceptionTestServiceImpl client;

    /**
     * Initializes an instance of HeadExceptionsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HeadExceptionsImpl(Retrofit retrofit, AutoRestHeadExceptionTestServiceImpl client) {
        this.service = retrofit.create(HeadExceptionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for HeadExceptions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HeadExceptionsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/200")
        Observable<Response<Void>> head200(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/204")
        Observable<Response<Void>> head204(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/404")
        Observable<Response<Void>> head404(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Return 200 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> head200() throws CloudException, IOException {
        return head200Async().toBlocking().single();
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> head200Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(head200Async(), serviceCallback);
    }

    /**
     * Return 200 status code if successful.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> head200Async() {
        return service.head200(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Void> clientResponse = head200Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (CloudException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    private ServiceResponse<Void> head200Delegate(Response<Void> response) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .buildEmpty(response);
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> head204() throws CloudException, IOException {
        return head204Async().toBlocking().single();
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> head204Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(head204Async(), serviceCallback);
    }

    /**
     * Return 204 status code if successful.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> head204Async() {
        return service.head204(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Void> clientResponse = head204Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (CloudException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    private ServiceResponse<Void> head204Delegate(Response<Void> response) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.mapperAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .buildEmpty(response);
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> head404() throws CloudException, IOException {
        return head404Async().toBlocking().single();
    }

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> head404Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(head404Async(), serviceCallback);
    }

    /**
     * Return 404 status code if successful.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> head404Async() {
        return service.head404(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Void> clientResponse = head404Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (CloudException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    private ServiceResponse<Void> head404Delegate(Response<Void> response) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.mapperAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .buildEmpty(response);
    }

}
