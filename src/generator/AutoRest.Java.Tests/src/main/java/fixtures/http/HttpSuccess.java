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
import rx.Observable;

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> head200Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 200 status code if successful.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> head200Async();

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Boolean> get200Async(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get 200 success.
     *
     * @return the observable to the boolean object
     */
    Observable<ServiceResponse<Boolean>> get200Async();

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> put200Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> put200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Put boolean value true returning 200 success.
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> put200Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> patch200Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> patch200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> patch200Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> post200Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> post200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> post200Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> delete200Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> delete200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete simple boolean value true returns 200.
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> delete200Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> put201Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> put201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 201.
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> put201Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> post201Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> post201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> post201Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> put202Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> put202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> put202Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> patch202Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> patch202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> patch202Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> post202Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> post202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> post202Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> delete202Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> delete202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> delete202Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> head204Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 204 status code if successful.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> head204Async();

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> put204Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> put204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> put204Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> patch204Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> patch204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> patch204Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> post204Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> post204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> post204Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> delete204Async(final ServiceCallback<Void> serviceCallback);
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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> delete204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> delete204Async(Boolean booleanValue);

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> head404Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 404 status code.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> head404Async();

}
