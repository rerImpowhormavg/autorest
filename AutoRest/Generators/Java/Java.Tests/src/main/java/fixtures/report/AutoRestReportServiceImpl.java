/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.report;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.report.models.ErrorException;
import java.io.IOException;
import java.util.Map;
import retrofit.Call;
import retrofit.Response;

/**
 * Initializes a new instance of the AutoRestReportService class.
 */
public final class AutoRestReportServiceImpl extends ServiceClient implements AutoRestReportService {
    /**
     * The Retrofit service to perform REST calls.
     */
    private AutoRestReportServiceService service;
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
     * Initializes an instance of AutoRestReportService client.
     */
    public AutoRestReportServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestReportServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestReportServiceImpl(String baseUri, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        this.retrofitBuilder.baseUrl(baseUri);
        service = this.retrofitBuilder.build().create(AutoRestReportServiceService.class);
    }

    /**
     * Get test coverage report.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, Integer&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Map<String, Integer>> getReport() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getReport();
        return getReportDelegate(call.execute(), null);
    }

    /**
     * Get test coverage report.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback) {
        Call<ResponseBody> call = service.getReport();
        call.enqueue(new ServiceResponseCallback<Map<String, Integer>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getReportDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Map<String, Integer>> getReportDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Map<String, Integer>, ErrorException>()
                .register(200, new TypeToken<Map<String, Integer>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

}
