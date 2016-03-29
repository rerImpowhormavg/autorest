/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodyinteger.models.ErrorException;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in IntOperations.
 */
public interface IntOperations {
    /**
     * Get null Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Integer> getNull() throws ErrorException, IOException;

    /**
     * Get null Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getNullAsync(final ServiceCallback<Integer> serviceCallback) throws IllegalArgumentException;

    /**
     * Get invalid Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Integer> getInvalid() throws ErrorException, IOException;

    /**
     * Get invalid Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getInvalidAsync(final ServiceCallback<Integer> serviceCallback) throws IllegalArgumentException;

    /**
     * Get overflow Int32 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Integer> getOverflowInt32() throws ErrorException, IOException;

    /**
     * Get overflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback) throws IllegalArgumentException;

    /**
     * Get underflow Int32 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Integer> getUnderflowInt32() throws ErrorException, IOException;

    /**
     * Get underflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback) throws IllegalArgumentException;

    /**
     * Get overflow Int64 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the long object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Long> getOverflowInt64() throws ErrorException, IOException;

    /**
     * Get overflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getOverflowInt64Async(final ServiceCallback<Long> serviceCallback) throws IllegalArgumentException;

    /**
     * Get underflow Int64 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the long object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Long> getUnderflowInt64() throws ErrorException, IOException;

    /**
     * Get underflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback) throws IllegalArgumentException;

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMax32(int intBody) throws ErrorException, IOException;

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMax64(long intBody) throws ErrorException, IOException;

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMin32(int intBody) throws ErrorException, IOException;

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMin64(long intBody) throws ErrorException, IOException;

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}
