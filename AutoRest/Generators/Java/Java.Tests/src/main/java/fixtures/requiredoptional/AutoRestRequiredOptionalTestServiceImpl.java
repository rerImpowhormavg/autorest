/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestRequiredOptionalTestService class.
 */
public final class AutoRestRequiredOptionalTestServiceImpl extends ServiceClient implements AutoRestRequiredOptionalTestService {
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

    /** number of items to skip. */
    private String requiredGlobalPath;

    /**
     * Gets number of items to skip.
     *
     * @return the requiredGlobalPath value.
     */
    public String getRequiredGlobalPath() {
        return this.requiredGlobalPath;
    }

    /**
     * Sets number of items to skip.
     *
     * @param requiredGlobalPath the requiredGlobalPath value.
     */
    public void setRequiredGlobalPath(String requiredGlobalPath) {
        this.requiredGlobalPath = requiredGlobalPath;
    }

    /** number of items to skip. */
    private String requiredGlobalQuery;

    /**
     * Gets number of items to skip.
     *
     * @return the requiredGlobalQuery value.
     */
    public String getRequiredGlobalQuery() {
        return this.requiredGlobalQuery;
    }

    /**
     * Sets number of items to skip.
     *
     * @param requiredGlobalQuery the requiredGlobalQuery value.
     */
    public void setRequiredGlobalQuery(String requiredGlobalQuery) {
        this.requiredGlobalQuery = requiredGlobalQuery;
    }

    /** number of items to skip. */
    private int optionalGlobalQuery;

    /**
     * Gets number of items to skip.
     *
     * @return the optionalGlobalQuery value.
     */
    public int getOptionalGlobalQuery() {
        return this.optionalGlobalQuery;
    }

    /**
     * Sets number of items to skip.
     *
     * @param optionalGlobalQuery the optionalGlobalQuery value.
     */
    public void setOptionalGlobalQuery(int optionalGlobalQuery) {
        this.optionalGlobalQuery = optionalGlobalQuery;
    }

    /**
     * Gets the ImplicitOperations object to access its operations.
     * @return the ImplicitOperations object.
     */
    public ImplicitOperations getImplicitOperations() {
        return new ImplicitOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ExplicitOperations object to access its operations.
     * @return the ExplicitOperations object.
     */
    public ExplicitOperations getExplicitOperations() {
        return new ExplicitOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of AutoRestRequiredOptionalTestService client.
     */
    public AutoRestRequiredOptionalTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestRequiredOptionalTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestRequiredOptionalTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestRequiredOptionalTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestRequiredOptionalTestServiceImpl(String baseUri, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        this.retrofitBuilder.baseUrl(baseUri);
    }
}
