/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import retrofit2.Retrofit;
import fixtures.azurespecials.XMsClientRequestIds;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in XMsClientRequestIds.
 */
public class XMsClientRequestIdsImpl implements XMsClientRequestIds {
    /** The Retrofit service to perform REST calls. */
    private XMsClientRequestIdsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of XMsClientRequestIdsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public XMsClientRequestIdsImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = retrofit.create(XMsClientRequestIdsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for XMsClientRequestIds to be
     * used by Retrofit to perform actually REST calls.
     */
    interface XMsClientRequestIdsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.XMsClientRequestIds get" })
        @GET("azurespecials/overwrite/x-ms-client-request-id/method/")
        Observable<Response<ResponseBody>> get(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.XMsClientRequestIds paramGet" })
        @GET("azurespecials/overwrite/x-ms-client-request-id/via-param/method/")
        Observable<Response<ResponseBody>> paramGet(@Header("x-ms-client-request-id") String xMsClientRequestId, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     */
    public void get() {
        getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getWithServiceResponseAsync() {
        return service.get(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getDelegate(Response<ResponseBody> response) throws CloudException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     */
    public void paramGet(String xMsClientRequestId) {
        paramGetWithServiceResponseAsync(xMsClientRequestId).toBlocking().single().body();
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> paramGetAsync(String xMsClientRequestId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(paramGetWithServiceResponseAsync(xMsClientRequestId), serviceCallback);
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> paramGetAsync(String xMsClientRequestId) {
        return paramGetWithServiceResponseAsync(xMsClientRequestId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> paramGetWithServiceResponseAsync(String xMsClientRequestId) {
        if (xMsClientRequestId == null) {
            throw new IllegalArgumentException("Parameter xMsClientRequestId is required and cannot be null.");
        }
        return service.paramGet(xMsClientRequestId, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = paramGetDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> paramGetDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
