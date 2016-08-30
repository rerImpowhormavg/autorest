/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseuri;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.custombaseuri.models.ErrorException;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Paths.
 */
public interface Paths {
    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getEmpty(String accountName) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getEmptyAsync(String accountName, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getEmptyAsync(String accountName);

}
