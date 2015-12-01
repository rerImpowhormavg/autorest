/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.resourceflattening;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.AzureClient;
import com.microsoft.rest.AzureServiceClient;
import com.microsoft.rest.AzureServiceResponseBuilder;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.CustomHeaderInterceptor;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.ResponseBody;
import fixtures.resourceflattening.models.Error;
import fixtures.resourceflattening.models.FlattenedProduct;
import fixtures.resourceflattening.models.Resource;
import fixtures.resourceflattening.models.ResourceCollection;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestResourceFlatteningTestService class.
 */
public class AutoRestResourceFlatteningTestServiceImpl extends AzureServiceClient implements AutoRestResourceFlatteningTestService {
    private AutoRestResourceFlatteningTestServiceService service;
    private String baseUri;
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

    private ServiceClientCredentials credentials;

    /**
     * Gets The management credentials for Azure.
     *
     * @return the credentials value.
     */
    public ServiceClientCredentials getCredentials() {
        return this.credentials;
    }

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

    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout for Long Running Operations.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout for Long Running Operations.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    public void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
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
        if (this.credentials != null)
        {
            this.credentials.applyCredentialsFilter(this.client);
        }
        this.acceptLanguage = "en-US";
        this.getClientInterceptors().add(new CustomHeaderInterceptor("x-ms-client-request-id", UUID.randomUUID().toString()));
        this.azureClient = new AzureClient(client, retrofitBuilder);
        this.azureClient.setCredentials(this.credentials);
        this.retrofitBuilder.baseUrl(baseUri);
        service = this.retrofitBuilder.build().create(AutoRestResourceFlatteningTestServiceService.class);
    }

    /**
     * Put External Resource as an Array
     *
     * @param resourceArray External Resource as an Array to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public ServiceResponse<Void> putArray(List<Resource> resourceArray) throws ServiceException, IOException {
        Call<ResponseBody> call = service.putArray(resourceArray, this.getAcceptLanguage());
        return putArrayDelegate(call.execute(), null);
    }

    /**
     * Put External Resource as an Array
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putArrayAsync(List<Resource> resourceArray, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putArray(resourceArray, this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putArrayDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putArrayDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<Void>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get External Resource as an Array
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;FlattenedProduct&gt; object if successful.
     */
    public ServiceResponse<List<FlattenedProduct>> getArray() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getArray(this.getAcceptLanguage());
        return getArrayDelegate(call.execute(), null);
    }

    /**
     * Get External Resource as an Array
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getArrayAsync(final ServiceCallback<List<FlattenedProduct>> serviceCallback) {
        Call<ResponseBody> call = service.getArray(this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<List<FlattenedProduct>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getArrayDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<List<FlattenedProduct>> getArrayDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<List<FlattenedProduct>>(new AzureJacksonUtils())
                .register(200, new TypeToken<List<FlattenedProduct>>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put External Resource as a Dictionary
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public ServiceResponse<Void> putDictionary(Map<String, FlattenedProduct> resourceDictionary) throws ServiceException, IOException {
        Call<ResponseBody> call = service.putDictionary(resourceDictionary, this.getAcceptLanguage());
        return putDictionaryDelegate(call.execute(), null);
    }

    /**
     * Put External Resource as a Dictionary
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putDictionary(resourceDictionary, this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putDictionaryDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putDictionaryDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<Void>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get External Resource as a Dictionary
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, FlattenedProduct&gt; object if successful.
     */
    public ServiceResponse<Map<String, FlattenedProduct>> getDictionary() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getDictionary(this.getAcceptLanguage());
        return getDictionaryDelegate(call.execute(), null);
    }

    /**
     * Get External Resource as a Dictionary
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProduct>> serviceCallback) {
        Call<ResponseBody> call = service.getDictionary(this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Map<String, FlattenedProduct>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getDictionaryDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Map<String, FlattenedProduct>> getDictionaryDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<Map<String, FlattenedProduct>>(new AzureJacksonUtils())
                .register(200, new TypeToken<Map<String, FlattenedProduct>>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put External Resource as a ResourceCollection
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public ServiceResponse<Void> putResourceCollection(ResourceCollection resourceComplexObject) throws ServiceException, IOException {
        Call<ResponseBody> call = service.putResourceCollection(resourceComplexObject, this.getAcceptLanguage());
        return putResourceCollectionDelegate(call.execute(), null);
    }

    /**
     * Put External Resource as a ResourceCollection
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putResourceCollectionAsync(ResourceCollection resourceComplexObject, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putResourceCollection(resourceComplexObject, this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putResourceCollectionDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putResourceCollectionDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<Void>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get External Resource as a ResourceCollection
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ResourceCollection object if successful.
     */
    public ServiceResponse<ResourceCollection> getResourceCollection() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getResourceCollection(this.getAcceptLanguage());
        return getResourceCollectionDelegate(call.execute(), null);
    }

    /**
     * Get External Resource as a ResourceCollection
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getResourceCollectionAsync(final ServiceCallback<ResourceCollection> serviceCallback) {
        Call<ResponseBody> call = service.getResourceCollection(this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<ResourceCollection>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getResourceCollectionDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<ResourceCollection> getResourceCollectionDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<ResourceCollection>(new AzureJacksonUtils())
                .register(200, new TypeToken<ResourceCollection>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
