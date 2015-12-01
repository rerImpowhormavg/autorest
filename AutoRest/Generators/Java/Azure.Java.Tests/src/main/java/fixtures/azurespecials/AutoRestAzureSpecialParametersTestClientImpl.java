/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.AzureClient;
import com.microsoft.rest.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.CustomHeaderInterceptor;
import com.squareup.okhttp.OkHttpClient;
import java.util.UUID;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestAzureSpecialParametersTestClient class.
 */
public class AutoRestAzureSpecialParametersTestClientImpl extends AzureServiceClient implements AutoRestAzureSpecialParametersTestClient {
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

    private String subscriptionId;

    /**
     * Gets The subscription id, which appears in the path, always modeled in credentials. The value is always '1234-5678-9012-3456'
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription id, which appears in the path, always modeled in credentials. The value is always '1234-5678-9012-3456'
     *
     * @param subscriptionId the subscriptionId value.
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    private String apiVersion;

    /**
     * Gets The api version, which appears in the query, the value is always '2015-07-01-preview'
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
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
     * Gets the XMsClientRequestIdOperations object to access its operations.
     * @return the xMsClientRequestId value.
     */
    public XMsClientRequestIdOperations getXMsClientRequestId() {
        return new XMsClientRequestIdOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the SubscriptionInCredentialsOperations object to access its operations.
     * @return the subscriptionInCredentials value.
     */
    public SubscriptionInCredentialsOperations getSubscriptionInCredentials() {
        return new SubscriptionInCredentialsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the SubscriptionInMethodOperations object to access its operations.
     * @return the subscriptionInMethod value.
     */
    public SubscriptionInMethodOperations getSubscriptionInMethod() {
        return new SubscriptionInMethodOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ApiVersionDefaultOperations object to access its operations.
     * @return the apiVersionDefault value.
     */
    public ApiVersionDefaultOperations getApiVersionDefault() {
        return new ApiVersionDefaultOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ApiVersionLocalOperations object to access its operations.
     * @return the apiVersionLocal value.
     */
    public ApiVersionLocalOperations getApiVersionLocal() {
        return new ApiVersionLocalOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the SkipUrlEncodingOperations object to access its operations.
     * @return the skipUrlEncoding value.
     */
    public SkipUrlEncodingOperations getSkipUrlEncoding() {
        return new SkipUrlEncodingOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the OdataOperations object to access its operations.
     * @return the odata value.
     */
    public OdataOperations getOdata() {
        return new OdataOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the HeaderOperationsOperations object to access its operations.
     * @return the headerOperations value.
     */
    public HeaderOperationsOperations getHeaderOperations() {
        return new HeaderOperationsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     */
    public AutoRestAzureSpecialParametersTestClientImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestAzureSpecialParametersTestClientImpl(String baseUri) {
        this(baseUri, null);
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestAzureSpecialParametersTestClientImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestAzureSpecialParametersTestClientImpl(String baseUri, ServiceClientCredentials credentials) {
        super();
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestAzureSpecialParametersTestClientImpl(String baseUri, ServiceClientCredentials credentials, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
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
        this.apiVersion = "2015-07-01-preview";
        this.acceptLanguage = "en-US";
        this.getClientInterceptors().add(new CustomHeaderInterceptor("x-ms-client-request-id", UUID.randomUUID().toString()));
        this.azureClient = new AzureClient(client, retrofitBuilder);
        this.azureClient.setCredentials(this.credentials);
        this.retrofitBuilder.baseUrl(baseUri);
    }
}
