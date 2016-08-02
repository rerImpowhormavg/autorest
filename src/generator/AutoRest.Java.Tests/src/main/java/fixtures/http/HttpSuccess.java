/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.http.models.ErrorException;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpSuccess.
 */
public interface HttpSuccess {
    /**
     * Return 200 status code if successful.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> head200() throws ErrorException, IOException;

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> head200Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get 200 success.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Boolean> get200() throws ErrorException, IOException;

    /**
     * Get 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Boolean>> get200Async(final ServiceCallback<Boolean> serviceCallback) throws IllegalArgumentException;

    /**
     * Put boolean value true returning 200 success.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put200() throws ErrorException, IOException;

    /**
     * Put boolean value true returning 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> put200Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Put boolean value true returning 200 success.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put200(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Put boolean value true returning 200 success.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> put200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch200() throws ErrorException, IOException;

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> patch200Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch200(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> patch200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post200() throws ErrorException, IOException;

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> post200Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post200(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> post200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete simple boolean value true returns 200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete200() throws ErrorException, IOException;

    /**
     * Delete simple boolean value true returns 200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> delete200Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Delete simple boolean value true returns 200.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete200(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Delete simple boolean value true returns 200.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> delete200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Put true Boolean value in request returns 201.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put201() throws ErrorException, IOException;

    /**
     * Put true Boolean value in request returns 201.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> put201Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Put true Boolean value in request returns 201.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put201(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Put true Boolean value in request returns 201.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> put201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post201() throws ErrorException, IOException;

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> post201Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post201(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> post201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put202() throws ErrorException, IOException;

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> put202Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put202(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> put202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch202() throws ErrorException, IOException;

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> patch202Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch202(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> patch202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post202() throws ErrorException, IOException;

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> post202Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post202(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> post202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete202() throws ErrorException, IOException;

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> delete202Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete202(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> delete202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 204 status code if successful.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> head204() throws ErrorException, IOException;

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> head204Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put204() throws ErrorException, IOException;

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> put204Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put204(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> put204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch204() throws ErrorException, IOException;

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> patch204Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch204(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> patch204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post204() throws ErrorException, IOException;

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> post204Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post204(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> post204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete204() throws ErrorException, IOException;

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> delete204Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete204(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> delete204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Return 404 status code.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> head404() throws ErrorException, IOException;

    /**
     * Return 404 status code.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ServiceResponse<Void>> head404Async(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}
