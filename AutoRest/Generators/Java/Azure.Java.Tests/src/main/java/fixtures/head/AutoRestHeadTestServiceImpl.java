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

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.CustomHeaderInterceptor;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.squareup.okhttp.OkHttpClient;
import java.util.UUID;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestHeadTestService class.
 */
public final class AutoRestHeadTestServiceImpl extends AzureServiceClient implements AutoRestHeadTestService {
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
     * Gets the HttpSuccessOperations object to access its operations.
     * @return the HttpSuccessOperations object.
     */
    public HttpSuccessOperations getHttpSuccessOperations() {
        return new HttpSuccessOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of AutoRestHeadTestService client.
     */
    public AutoRestHeadTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestHeadTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestHeadTestServiceImpl(String baseUri) {
        this(baseUri, null);
    }

    /**
     * Initializes an instance of AutoRestHeadTestService client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestHeadTestServiceImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestHeadTestService client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestHeadTestServiceImpl(String baseUri, ServiceClientCredentials credentials) {
        super();
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestHeadTestService client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestHeadTestServiceImpl(String baseUri, ServiceClientCredentials credentials, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
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
    }
}
