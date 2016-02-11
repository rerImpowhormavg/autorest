/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.resourceflattening;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CustomHeaderInterceptor;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.resourceflattening.models.ErrorException;
import fixtures.resourceflattening.models.FlattenedProduct;
import fixtures.resourceflattening.models.Resource;
import fixtures.resourceflattening.models.ResourceCollection;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestResourceFlatteningTestService class.
 */
public final class AutoRestResourceFlatteningTestServiceImpl extends AzureServiceClient implements AutoRestResourceFlatteningTestService {
    /** The Retrofit service to perform REST calls. */
    private AutoRestResourceFlatteningTestServiceService service;
    /** The URI used as the base for all cloud service requests. */
    private final String baseUri;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Gets Azure subscription credentials. */
    private ServiceClientCredentials credentials;

    /**
     * Gets Gets Azure subscription credentials.
     *
     * @return the credentials value.
     */
    public ServiceClientCredentials getCredentials() {
        return this.credentials;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    public void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean getGenerateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     */
    public void setGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     */
    public AutoRestResourceFlatteningTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestResourceFlatteningTestServiceImpl(String baseUri) {
        this(baseUri, null);
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
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestResourceFlatteningTestServiceImpl(String baseUri, ServiceClientCredentials credentials) {
        super();
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestResourceFlatteningTestServiceImpl(String baseUri, ServiceClientCredentials credentials, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    private void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.getClientInterceptors().add(new CustomHeaderInterceptor("x-ms-client-request-id", UUID.randomUUID().toString()));
        if (this.credentials != null) {
            this.credentials.applyCredentialsFilter(this.client);
        }
        this.azureClient = new AzureClient(client, retrofitBuilder);
        this.azureClient.setCredentials(this.credentials);
        this.retrofitBuilder.baseUrl(baseUri);
        service = this.retrofitBuilder.build().create(AutoRestResourceFlatteningTestServiceService.class);
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putArray(List<Resource> resourceArray) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putArray(resourceArray, this.getAcceptLanguage());
        return putArrayDelegate(call.execute());
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putArrayAsync(List<Resource> resourceArray, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putArray(resourceArray, this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putArrayDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putArrayDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as an Array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;FlattenedProduct&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<FlattenedProduct>> getArray() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getArray(this.getAcceptLanguage());
        return getArrayDelegate(call.execute());
    }

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getArrayAsync(final ServiceCallback<List<FlattenedProduct>> serviceCallback) {
        Call<ResponseBody> call = service.getArray(this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<List<FlattenedProduct>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getArrayDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<List<FlattenedProduct>> getArrayDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<List<FlattenedProduct>, ErrorException>()
                .register(200, new TypeToken<List<FlattenedProduct>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putDictionary(Map<String, FlattenedProduct> resourceDictionary) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putDictionary(resourceDictionary, this.getAcceptLanguage());
        return putDictionaryDelegate(call.execute());
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putDictionary(resourceDictionary, this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putDictionaryDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putDictionaryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, FlattenedProduct&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Map<String, FlattenedProduct>> getDictionary() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getDictionary(this.getAcceptLanguage());
        return getDictionaryDelegate(call.execute());
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProduct>> serviceCallback) {
        Call<ResponseBody> call = service.getDictionary(this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Map<String, FlattenedProduct>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDictionaryDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Map<String, FlattenedProduct>> getDictionaryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Map<String, FlattenedProduct>, ErrorException>()
                .register(200, new TypeToken<Map<String, FlattenedProduct>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putResourceCollection(ResourceCollection resourceComplexObject) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putResourceCollection(resourceComplexObject, this.getAcceptLanguage());
        return putResourceCollectionDelegate(call.execute());
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putResourceCollectionAsync(ResourceCollection resourceComplexObject, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putResourceCollection(resourceComplexObject, this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putResourceCollectionDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putResourceCollectionDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ResourceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ResourceCollection> getResourceCollection() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getResourceCollection(this.getAcceptLanguage());
        return getResourceCollectionDelegate(call.execute());
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getResourceCollectionAsync(final ServiceCallback<ResourceCollection> serviceCallback) {
        Call<ResponseBody> call = service.getResourceCollection(this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<ResourceCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getResourceCollectionDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<ResourceCollection> getResourceCollectionDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<ResourceCollection, ErrorException>()
                .register(200, new TypeToken<ResourceCollection>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
