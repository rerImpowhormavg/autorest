/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;

/**
 * Initializes a new instance of the AutoRestDateTestService class.
 */
public class AutoRestDateTestServiceImpl extends ServiceClient implements AutoRestDateTestService {
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private DateOperations dateOperations;

    /**
     * Gets the DateOperations object to access its operations.
     * @return the dateOperations value.
     */
    public DateOperations getDateOperations() {
        return this.dateOperations;
    }

    /**
     * Initializes an instance of AutoRestDateTestService client.
     */
    public AutoRestDateTestServiceImpl() {
        this("https://localhost");
    }

    /**
     * Initializes an instance of AutoRestDateTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestDateTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestDateTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param restAdapterBuilder the builder for building up a {@link RestAdapter}
     */
    public AutoRestDateTestServiceImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        this.dateOperations = new DateOperationsImpl(restAdapter);
    }
}
