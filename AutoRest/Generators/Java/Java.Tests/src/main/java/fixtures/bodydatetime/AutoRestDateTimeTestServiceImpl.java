/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetime;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;

/**
 * Initializes a new instance of the AutoRestDateTimeTestService class.
 */
public class AutoRestDateTimeTestServiceImpl extends ServiceClient implements AutoRestDateTimeTestService {
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private DatetimeOperations datetimeOperations;

    /**
     * Gets the DatetimeOperations object to access its operations.
     * @return the datetimeOperations value.
     */
    public DatetimeOperations getDatetimeOperations() {
        return this.datetimeOperations;
    }

    /**
     * Initializes an instance of AutoRestDateTimeTestService client.
     */
    public AutoRestDateTimeTestServiceImpl() {
        this("https://localhost");
    }

    /**
     * Initializes an instance of AutoRestDateTimeTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestDateTimeTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestDateTimeTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param restAdapterBuilder the builder for building up a {@link RestAdapter}
     */
    public AutoRestDateTimeTestServiceImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        this.datetimeOperations = new DatetimeOperationsImpl(restAdapter);
    }
}
