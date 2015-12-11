/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping;

import com.microsoft.rest.AzureClient;
import com.microsoft.rest.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.CustomHeaderInterceptor;
import com.squareup.okhttp.OkHttpClient;
import java.util.UUID;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestParameterGroupingTestService class.
 */
public class AutoRestParameterGroupingTestServiceImpl extends AzureServiceClient implements AutoRestParameterGroupingTestService {
    /** The URI used as the base for all cloud service requests. */
    private String baseUri;
    /** the {@link AzureClient} used for long running operations .*/
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

    /** The management credentials for Azure. */
    private ServiceClientCredentials credentials;

    /**
     * Gets The management credentials for Azure.
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

    /** The retry timeout for Long Running Operations. */
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
     * Gets the ParameterGroupingOperations object to access its operations.
     * @return the parameterGrouping value.
     */
    public ParameterGroupingOperations getParameterGrouping() {
        return new ParameterGroupingOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of AutoRestParameterGroupingTestService client.
     */
    public AutoRestParameterGroupingTestServiceImpl() {
        this("https://localhost");
    }

    /**
     * Initializes an instance of AutoRestParameterGroupingTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestParameterGroupingTestServiceImpl(String baseUri) {
        this(baseUri, null);
    }

    /**
     * Initializes an instance of AutoRestParameterGroupingTestService client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestParameterGroupingTestServiceImpl(ServiceClientCredentials credentials) {
        this("https://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestParameterGroupingTestService client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestParameterGroupingTestServiceImpl(String baseUri, ServiceClientCredentials credentials) {
        super();
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestParameterGroupingTestService client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestParameterGroupingTestServiceImpl(String baseUri, ServiceClientCredentials credentials, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    private void initialize() {
        if (this.credentials != null) {
            this.credentials.applyCredentialsFilter(this.client);
        }
        this.acceptLanguage = "en-US";
        this.getClientInterceptors().add(new CustomHeaderInterceptor("x-ms-client-request-id", UUID.randomUUID().toString()));
        this.azureClient = new AzureClient(client, retrofitBuilder);
        this.azureClient.setCredentials(this.credentials);
        this.retrofitBuilder.baseUrl(baseUri);
    }
}
