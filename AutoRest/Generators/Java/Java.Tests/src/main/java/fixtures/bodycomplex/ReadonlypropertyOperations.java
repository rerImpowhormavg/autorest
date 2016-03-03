/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.ReadonlyObj;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in ReadonlypropertyOperations.
 */
public interface ReadonlypropertyOperations {
    /**
     * Get complex types that have readonly properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ReadonlyObj object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ReadonlyObj> getValid() throws ErrorException, IOException;

    /**
     * Get complex types that have readonly properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getValidAsync(final ServiceCallback<ReadonlyObj> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putValid(ReadonlyObj complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putValidAsync(ReadonlyObj complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}
