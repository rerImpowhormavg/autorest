/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.CloudError;
import com.microsoft.rest.BaseResource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.http.POST;
import retrofit.http.Header;

/**
 * An instance of this class provides access to all the operations defined
 * in HeaderOperations.
 */
public interface HeaderOperations {
    /**
     * The interface defining all the services for HeaderOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HeaderService {
        @POST("/azurespecials/customNamedRequestId")
        Call<ResponseBody> customNamedRequestId(@Header("foo-client-request-id") String fooClientRequestId, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request
     *
     * @param fooClientRequestId The fooRequestId
     * @throws ServiceException exception thrown from REST call
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> customNamedRequestId(String fooClientRequestId) throws ServiceException;

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request
     *
     * @param fooClientRequestId The fooRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> customNamedRequestIdAsync(String fooClientRequestId, final ServiceCallback<Void> serviceCallback);

}
