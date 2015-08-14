// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


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
     * number of items to skip
     * @return the RequiredGlobalPath value.
     */
    public String getRequiredGlobalPath() {
        return this.requiredGlobalPath;
    }

    private String requiredGlobalQuery;

    /**
     * number of items to skip
     * @return the RequiredGlobalQuery value.
     */
    public String getRequiredGlobalQuery() {
        return this.requiredGlobalQuery;
    }

    private Implicit implicit;

    /**
     * Test Infrastructure for AutoRest
     * @return the implicit value.
     */
    public Implicit getImplicit() {
        return this.implicit;
    }

    private Explicit explicit;

    /**
     * Test Infrastructure for AutoRest
     * @return the explicit value.
     */
    public Explicit getExplicit() {
        return this.explicit;
    }

    public AutoRestRequiredOptionalTestServiceImpl() {
        this("http://localhost");
    }

    public AutoRestRequiredOptionalTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    public AutoRestRequiredOptionalTestServiceImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        this.implicit = new ImplicitImpl(restAdapter);
        this.explicit = new ExplicitImpl(restAdapter);
    }
}
