/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro;

import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.Retrofit;
import com.microsoft.rest.AzureClient;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.BaseResource;
import retrofit.Callback;

/**
 * Initializes a new instance of the AutoRestLongRunningOperationTestService class.
 */
public class AutoRestLongRunningOperationTestServiceImpl extends ServiceClient implements AutoRestLongRunningOperationTestService {
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

    private LROs lROs;

    /**
     * Gets the LROs object to access its operations.
     * @return the lROs value.
     */
    public LROs getLROs() {
        return this.lROs;
    }

    private LRORetrys lRORetrys;

    /**
     * Gets the LRORetrys object to access its operations.
     * @return the lRORetrys value.
     */
    public LRORetrys getLRORetrys() {
        return this.lRORetrys;
    }

    private LROSADs lROSADs;

    /**
     * Gets the LROSADs object to access its operations.
     * @return the lROSADs value.
     */
    public LROSADs getLROSADs() {
        return this.lROSADs;
    }

    private LROsCustomHeader lROsCustomHeader;

    /**
     * Gets the LROsCustomHeader object to access its operations.
     * @return the lROsCustomHeader value.
     */
    public LROsCustomHeader getLROsCustomHeader() {
        return this.lROsCustomHeader;
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     */
    public AutoRestLongRunningOperationTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestLongRunningOperationTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestLongRunningOperationTestServiceImpl(String baseUri, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        if (this.credentials != null)
        {
            this.credentials.applyCredentialsFilter(this.client);
        }
        this.azureClient = new AzureClient(client, retrofitBuilder);
        this.azureClient.setCredentials(this.credentials);
        this.azureClient.setLongRunningOperationRetryTimeout(this.longRunningOperationRetryTimeout);
        Retrofit retrofit = retrofitBuilder.baseUrl(baseUri).build();
        this.lROs = new LROsImpl(retrofit, this);
        this.lRORetrys = new LRORetrysImpl(retrofit, this);
        this.lROSADs = new LROSADsImpl(retrofit, this);
        this.lROsCustomHeader = new LROsCustomHeaderImpl(retrofit, this);
    }
}
