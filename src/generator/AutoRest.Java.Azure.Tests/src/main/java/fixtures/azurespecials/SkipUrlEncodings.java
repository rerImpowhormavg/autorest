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

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in SkipUrlEncodings.
 */
public interface SkipUrlEncodings {
    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getMethodPathValid(String unencodedPathParam) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getMethodPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getPathPathValid(String unencodedPathParam) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getPathPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getSwaggerPathValid() throws ErrorException, IOException;

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getSwaggerPathValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getMethodQueryValid(String q1) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getMethodQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getMethodQueryNull() throws ErrorException, IOException;

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getMethodQueryNullAsync(final ServiceCallback<Void> serviceCallback);
    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getMethodQueryNull(String q1) throws ErrorException, IOException;

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getMethodQueryNullAsync(String q1, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getPathQueryValid(String q1) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getPathQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getSwaggerQueryValid() throws ErrorException, IOException;

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getSwaggerQueryValidAsync(final ServiceCallback<Void> serviceCallback);

}
