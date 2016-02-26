/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseuri;

import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.AutoRestBaseUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestParameterizedHostTestClient class.
 */
public final class AutoRestParameterizedHostTestClientImpl extends ServiceClient implements AutoRestParameterizedHostTestClient {
    /**
     * The URL used as the base for all cloud service requests.
     */
    private final AutoRestBaseUrl baseUrl;

    /**
     * Gets the URL used as the base for all cloud service requests.
     *
     * @return The BaseUrl value.
     */
    public AutoRestBaseUrl getBaseUrl() {
        return this.baseUrl;
    }

    /** A string value that is used as a global part of the parameterized host. */
    private String host;

    /**
     * Gets A string value that is used as a global part of the parameterized host.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Sets A string value that is used as a global part of the parameterized host.
     *
     * @param host the host value.
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Gets the PathsOperations object to access its operations.
     * @return the PathsOperations object.
     */
    public PathsOperations getPathsOperations() {
        return new PathsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Initializes an instance of AutoRestParameterizedHostTestClient client.
     */
    public AutoRestParameterizedHostTestClientImpl() {
        this("http://{accountName}{host}");
    }

    /**
     * Initializes an instance of AutoRestParameterizedHostTestClient client.
     *
     * @param baseUrl the base URL of the host
     */
    private AutoRestParameterizedHostTestClientImpl(String baseUrl) {
        super();
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestParameterizedHostTestClient client.
     *
     * @param clientBuilder the builder for building up an {@link OkHttpClient}
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestParameterizedHostTestClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder retrofitBuilder) {
        super(clientBuilder, retrofitBuilder);
        this.baseUrl = new AutoRestBaseUrl("http://{accountName}{host}");
        initialize();
    }

    @Override
    protected void initialize() {
        super.initialize();
        this.retrofitBuilder.baseUrl(baseUrl);
    }
}
