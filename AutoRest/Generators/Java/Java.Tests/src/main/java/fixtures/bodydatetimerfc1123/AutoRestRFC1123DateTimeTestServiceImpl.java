/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestRFC1123DateTimeTestService class.
 */
public final class AutoRestRFC1123DateTimeTestServiceImpl extends ServiceClient implements AutoRestRFC1123DateTimeTestService {
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
     * Gets the Datetimerfc1123Operations object to access its operations.
     * @return the Datetimerfc1123Operations object.
     */
    public Datetimerfc1123Operations getDatetimerfc1123Operations() {
        return new Datetimerfc1123OperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of AutoRestRFC1123DateTimeTestService client.
     */
    public AutoRestRFC1123DateTimeTestServiceImpl() {
        this("https://localhost");
    }

    /**
     * Initializes an instance of AutoRestRFC1123DateTimeTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestRFC1123DateTimeTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestRFC1123DateTimeTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestRFC1123DateTimeTestServiceImpl(String baseUri, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        this.retrofitBuilder.baseUrl(baseUri);
    }
}