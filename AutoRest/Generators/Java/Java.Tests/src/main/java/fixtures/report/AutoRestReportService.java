/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.report;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Call;
import java.util.Map;
import retrofit.http.GET;

/**
 * The interface for AutoRestReportService class.
 */
public interface AutoRestReportService {
    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    String getBaseUri();

    /**
     * The interface defining all the services for AutoRestReportService to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestReportServiceService {
        @GET("/report")
        Call<ResponseBody> getReport();

    }

    /**
     * Get test coverage report
     *
     * @return the Map&lt;String, Integer&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Integer> getReport() throws ServiceException;

    /**
     * Get test coverage report
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback);

}
