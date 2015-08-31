/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;


/**
 * Initializes a new instance of the AutoRestRequiredOptionalTestService class.
 */
public class AutoRestRequiredOptionalTestServiceImpl extends ServiceClient implements AutoRestRequiredOptionalTestService {
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private String requiredGlobalPath;

    /**
     * Gets number of items to skip
     *
     * @return the requiredGlobalPath value.
     */
    public String getRequiredGlobalPath() {
        return this.requiredGlobalPath;
    }

    /**
     * Sets number of items to skip
     *
     * @param requiredGlobalPath the requiredGlobalPath value.
     */
    public void setRequiredGlobalPath(String requiredGlobalPath) {
        this.requiredGlobalPath = requiredGlobalPath;
    }

    private String requiredGlobalQuery;

    /**
     * Gets number of items to skip
     *
     * @return the requiredGlobalQuery value.
     */
    public String getRequiredGlobalQuery() {
        return this.requiredGlobalQuery;
    }

    /**
     * Sets number of items to skip
     *
     * @param requiredGlobalQuery the requiredGlobalQuery value.
     */
    public void setRequiredGlobalQuery(String requiredGlobalQuery) {
        this.requiredGlobalQuery = requiredGlobalQuery;
    }

    private int optionalGlobalQuery;

    /**
     * Gets number of items to skip
     *
     * @return the optionalGlobalQuery value.
     */
    public int getOptionalGlobalQuery() {
        return this.optionalGlobalQuery;
    }

    /**
     * Sets number of items to skip
     *
     * @param optionalGlobalQuery the optionalGlobalQuery value.
     */
    public void setOptionalGlobalQuery(int optionalGlobalQuery) {
        this.optionalGlobalQuery = optionalGlobalQuery;
    }

    private Implicit implicit;

    /**
     * Gets the Implicit object to access its operations.
     * @return the implicit value.
     */
    public Implicit getImplicit() {
        return this.implicit;
    }

    private Explicit explicit;

    /**
     * Gets the Explicit object to access its operations.
     * @return the explicit value.
     */
    public Explicit getExplicit() {
        return this.explicit;
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
     * @param restAdapterBuilder the builder for building up a {@link RestAdapter}
     */
    public AutoRestRequiredOptionalTestServiceImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        this.implicit = new ImplicitImpl(restAdapter, this);
        this.explicit = new ExplicitImpl(restAdapter, this);
    }
}
