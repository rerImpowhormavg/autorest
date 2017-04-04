/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureresource.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.Resource;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import fixtures.azureresource.ErrorException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the AutoRestResourceFlatteningTestServiceImpl class.
 */
public class AutoRestResourceFlatteningTestServiceImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private AutoRestResourceFlatteningTestServiceService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestResourceFlatteningTestServiceImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestResourceFlatteningTestServiceImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AutoRestResourceFlatteningTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "AutoRestResourceFlatteningTestService", "1.0.0");
    }

    private void initializeService() {
        service = restClient().retrofit().create(AutoRestResourceFlatteningTestServiceService.class);
    }

    /**
     * The interface defining all the services for AutoRestResourceFlatteningTestService to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestResourceFlatteningTestServiceService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService putArray" })
        @PUT("azure/resource-flatten/array")
        Observable<Response<ResponseBody>> putArray(@Body List<Resource> resourceArray, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService getArray" })
        @GET("azure/resource-flatten/array")
        Observable<Response<ResponseBody>> getArray(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService putDictionary" })
        @PUT("azure/resource-flatten/dictionary")
        Observable<Response<ResponseBody>> putDictionary(@Body Map<String, FlattenedProductInner> resourceDictionary, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService getDictionary" })
        @GET("azure/resource-flatten/dictionary")
        Observable<Response<ResponseBody>> getDictionary(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService putResourceCollection" })
        @PUT("azure/resource-flatten/resourcecollection")
        Observable<Response<ResponseBody>> putResourceCollection(@Body ResourceCollectionInner resourceComplexObject, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService getResourceCollection" })
        @GET("azure/resource-flatten/resourcecollection")
        Observable<Response<ResponseBody>> getResourceCollection(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Put External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putArray() {
        putArrayWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putArrayAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putArrayWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Put External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putArrayAsync() {
        return putArrayWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putArrayWithServiceResponseAsync() {
        final List<Resource> resourceArray = null;
        return service.putArray(resourceArray, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putArrayDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putArray(List<Resource> resourceArray) {
        putArrayWithServiceResponseAsync(resourceArray).toBlocking().single().body();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putArrayAsync(List<Resource> resourceArray, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putArrayWithServiceResponseAsync(resourceArray), serviceCallback);
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putArrayAsync(List<Resource> resourceArray) {
        return putArrayWithServiceResponseAsync(resourceArray).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putArrayWithServiceResponseAsync(List<Resource> resourceArray) {
        Validator.validate(resourceArray);
        return service.putArray(resourceArray, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putArrayDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putArrayDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;FlattenedProductInner&gt; object if successful.
     */
    public List<FlattenedProductInner> getArray() {
        return getArrayWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<FlattenedProductInner>> getArrayAsync(final ServiceCallback<List<FlattenedProductInner>> serviceCallback) {
        return ServiceFuture.fromResponse(getArrayWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FlattenedProductInner&gt; object
     */
    public Observable<List<FlattenedProductInner>> getArrayAsync() {
        return getArrayWithServiceResponseAsync().map(new Func1<ServiceResponse<List<FlattenedProductInner>>, List<FlattenedProductInner>>() {
            @Override
            public List<FlattenedProductInner> call(ServiceResponse<List<FlattenedProductInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Get External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FlattenedProductInner&gt; object
     */
    public Observable<ServiceResponse<List<FlattenedProductInner>>> getArrayWithServiceResponseAsync() {
        return service.getArray(this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<FlattenedProductInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<FlattenedProductInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<FlattenedProductInner>> clientResponse = getArrayDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<FlattenedProductInner>> getArrayDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.restClient().responseBuilderFactory().<List<FlattenedProductInner>, ErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<List<FlattenedProductInner>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putDictionary() {
        putDictionaryWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putDictionaryAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putDictionaryWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putDictionaryAsync() {
        return putDictionaryWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putDictionaryWithServiceResponseAsync() {
        final Map<String, FlattenedProductInner> resourceDictionary = null;
        return service.putDictionary(resourceDictionary, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putDictionaryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putDictionary(Map<String, FlattenedProductInner> resourceDictionary) {
        putDictionaryWithServiceResponseAsync(resourceDictionary).toBlocking().single().body();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putDictionaryAsync(Map<String, FlattenedProductInner> resourceDictionary, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putDictionaryWithServiceResponseAsync(resourceDictionary), serviceCallback);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putDictionaryAsync(Map<String, FlattenedProductInner> resourceDictionary) {
        return putDictionaryWithServiceResponseAsync(resourceDictionary).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putDictionaryWithServiceResponseAsync(Map<String, FlattenedProductInner> resourceDictionary) {
        Validator.validate(resourceDictionary);
        return service.putDictionary(resourceDictionary, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putDictionaryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putDictionaryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Map&lt;String, FlattenedProductInner&gt; object if successful.
     */
    public Map<String, FlattenedProductInner> getDictionary() {
        return getDictionaryWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Map<String, FlattenedProductInner>> getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProductInner>> serviceCallback) {
        return ServiceFuture.fromResponse(getDictionaryWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, FlattenedProductInner&gt; object
     */
    public Observable<Map<String, FlattenedProductInner>> getDictionaryAsync() {
        return getDictionaryWithServiceResponseAsync().map(new Func1<ServiceResponse<Map<String, FlattenedProductInner>>, Map<String, FlattenedProductInner>>() {
            @Override
            public Map<String, FlattenedProductInner> call(ServiceResponse<Map<String, FlattenedProductInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, FlattenedProductInner&gt; object
     */
    public Observable<ServiceResponse<Map<String, FlattenedProductInner>>> getDictionaryWithServiceResponseAsync() {
        return service.getDictionary(this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Map<String, FlattenedProductInner>>>>() {
                @Override
                public Observable<ServiceResponse<Map<String, FlattenedProductInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Map<String, FlattenedProductInner>> clientResponse = getDictionaryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Map<String, FlattenedProductInner>> getDictionaryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.restClient().responseBuilderFactory().<Map<String, FlattenedProductInner>, ErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Map<String, FlattenedProductInner>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putResourceCollection() {
        putResourceCollectionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putResourceCollectionAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putResourceCollectionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putResourceCollectionAsync() {
        return putResourceCollectionWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putResourceCollectionWithServiceResponseAsync() {
        final ResourceCollectionInner resourceComplexObject = null;
        return service.putResourceCollection(resourceComplexObject, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putResourceCollectionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putResourceCollection(ResourceCollectionInner resourceComplexObject) {
        putResourceCollectionWithServiceResponseAsync(resourceComplexObject).toBlocking().single().body();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putResourceCollectionAsync(ResourceCollectionInner resourceComplexObject, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putResourceCollectionWithServiceResponseAsync(resourceComplexObject), serviceCallback);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putResourceCollectionAsync(ResourceCollectionInner resourceComplexObject) {
        return putResourceCollectionWithServiceResponseAsync(resourceComplexObject).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putResourceCollectionWithServiceResponseAsync(ResourceCollectionInner resourceComplexObject) {
        Validator.validate(resourceComplexObject);
        return service.putResourceCollection(resourceComplexObject, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putResourceCollectionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putResourceCollectionDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceCollectionInner object if successful.
     */
    public ResourceCollectionInner getResourceCollection() {
        return getResourceCollectionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceCollectionInner> getResourceCollectionAsync(final ServiceCallback<ResourceCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getResourceCollectionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceCollectionInner object
     */
    public Observable<ResourceCollectionInner> getResourceCollectionAsync() {
        return getResourceCollectionWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceCollectionInner>, ResourceCollectionInner>() {
            @Override
            public ResourceCollectionInner call(ServiceResponse<ResourceCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceCollectionInner object
     */
    public Observable<ServiceResponse<ResourceCollectionInner>> getResourceCollectionWithServiceResponseAsync() {
        return service.getResourceCollection(this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<ResourceCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceCollectionInner> clientResponse = getResourceCollectionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceCollectionInner> getResourceCollectionDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceCollectionInner, ErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceCollectionInner>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
