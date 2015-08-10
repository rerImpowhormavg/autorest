// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodyfile;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;

/**
 * Initializes a new instance of the AutoRestSwaggerBATFileService class.
 */
public class AutoRestSwaggerBATFileServiceImpl extends ServiceClient<AutoRestSwaggerBATFileService> implements AutoRestSwaggerBATFileService {
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private Files files;

    /**
     * Test Infrastructure for AutoRest Swagger BAT
     * @return the files value.
     */
    public Files getFiles() {
        return this.files;
    }

    public AutoRestSwaggerBATFileServiceImpl() {
        this("http://localhost");
    }

    public AutoRestSwaggerBATFileServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    public AutoRestSwaggerBATFileServiceImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        this.files = restAdapter.create(Files.class);
    }
}
