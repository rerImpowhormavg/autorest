/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestHttpInfrastructureTestService class.
 */
public final class AutoRestHttpInfrastructureTestServiceImpl extends ServiceClient implements AutoRestHttpInfrastructureTestService {
    /**
     * The URI used as the base for all cloud service requests.
     */
    private final String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    /**
     * Gets the HttpFailureOperations object to access its operations.
     * @return the HttpFailureOperations object.
     */
    public HttpFailureOperations getHttpFailureOperations() {
        return new HttpFailureOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the HttpSuccessOperations object to access its operations.
     * @return the HttpSuccessOperations object.
     */
    public HttpSuccessOperations getHttpSuccessOperations() {
        return new HttpSuccessOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the HttpRedirectsOperations object to access its operations.
     * @return the HttpRedirectsOperations object.
     */
    public HttpRedirectsOperations getHttpRedirectsOperations() {
        return new HttpRedirectsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the HttpClientFailureOperations object to access its operations.
     * @return the HttpClientFailureOperations object.
     */
    public HttpClientFailureOperations getHttpClientFailureOperations() {
        return new HttpClientFailureOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the HttpServerFailureOperations object to access its operations.
     * @return the HttpServerFailureOperations object.
     */
    public HttpServerFailureOperations getHttpServerFailureOperations() {
        return new HttpServerFailureOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the HttpRetryOperations object to access its operations.
     * @return the HttpRetryOperations object.
     */
    public HttpRetryOperations getHttpRetryOperations() {
        return new HttpRetryOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the MultipleResponsesOperations object to access its operations.
     * @return the MultipleResponsesOperations object.
     */
    public MultipleResponsesOperations getMultipleResponsesOperations() {
        return new MultipleResponsesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of AutoRestHttpInfrastructureTestService client.
     */
    public AutoRestHttpInfrastructureTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestHttpInfrastructureTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestHttpInfrastructureTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestHttpInfrastructureTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestHttpInfrastructureTestServiceImpl(String baseUri, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        this.retrofitBuilder.baseUrl(baseUri);
    }
}