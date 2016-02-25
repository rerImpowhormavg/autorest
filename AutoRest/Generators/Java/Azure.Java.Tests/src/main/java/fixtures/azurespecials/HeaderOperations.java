/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponseWithHeaders;
import fixtures.azurespecials.models.ErrorException;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdHeaders;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * An instance of this class provides access to all the operations defined
 * in HeaderOperations.
 */
public interface HeaderOperations {
    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponseWithHeaders object if successful.
     */
    ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeaders> customNamedRequestId(String fooClientRequestId) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> customNamedRequestIdAsync(String fooClientRequestId, final ServiceCallback<Void> serviceCallback);

}
