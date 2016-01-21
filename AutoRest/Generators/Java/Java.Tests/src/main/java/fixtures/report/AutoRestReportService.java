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

import java.util.List;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.logging.HttpLoggingInterceptor.Level;
import com.microsoft.rest.serializer.JacksonMapperAdapter;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.report.models.ErrorException;
import java.io.IOException;
import java.util.Map;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;

/**
 * The interface for AutoRestReportService class.
 */
public interface AutoRestReportService {
    /**
     * Gets the URI used as the base for all cloud service requests.
     *
     * @return the BaseUri value.
     */
    String getBaseUri();

    /**
     * Gets the list of interceptors the OkHttp client will execute.
     *
     * @return the list of interceptors.
     */
    List<Interceptor> getClientInterceptors();

    /**
     * Sets the logging level for OkHttp client.
     *
     * @param logLevel the logging level enum.
     */
    void setLogLevel(Level logLevel);

    /**
     * Gets the adapter for {@link com.fasterxml.jackson.databind.ObjectMapper} for serialization
     * and deserialization operations..
     *
     * @return the adapter.
     */
    JacksonMapperAdapter getMapperAdapter();

    /**
     * The interface defining all the services for AutoRestReportService to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestReportServiceService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("report")
        Call<ResponseBody> getReport();

    }

    /**
     * Get test coverage report.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, Integer&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Map<String, Integer>> getReport() throws ErrorException, IOException;

    /**
     * Get test coverage report.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback);

}
