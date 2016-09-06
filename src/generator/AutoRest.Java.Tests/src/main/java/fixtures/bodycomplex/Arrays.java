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
import fixtures.bodycomplex.models.ArrayWrapper;
import fixtures.bodycomplex.models.ErrorException;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Arrays.
 */
public interface Arrays {
    /**
     * Get complex types with array property.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ArrayWrapper getValid() throws ErrorException, IOException;

    /**
     * Get complex types with array property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ArrayWrapper> getValidAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

    /**
     * Get complex types with array property.
     *
     * @return the observable to the ArrayWrapper object
     */
    Observable<ArrayWrapper> getValidAsync();

    /**
     * Get complex types with array property.
     *
     * @return the observable to the ArrayWrapper object
     */
    Observable<ServiceResponse<ArrayWrapper>> getValidAsyncWithServiceResponse();

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void putValid(ArrayWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putValidAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putValidAsync(ArrayWrapper complexBody);

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putValidAsyncWithServiceResponse(ArrayWrapper complexBody);

    /**
     * Get complex types with array property which is empty.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ArrayWrapper getEmpty() throws ErrorException, IOException;

    /**
     * Get complex types with array property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ArrayWrapper> getEmptyAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

    /**
     * Get complex types with array property which is empty.
     *
     * @return the observable to the ArrayWrapper object
     */
    Observable<ArrayWrapper> getEmptyAsync();

    /**
     * Get complex types with array property which is empty.
     *
     * @return the observable to the ArrayWrapper object
     */
    Observable<ServiceResponse<ArrayWrapper>> getEmptyAsyncWithServiceResponse();

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void putEmpty(ArrayWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putEmptyAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putEmptyAsync(ArrayWrapper complexBody);

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putEmptyAsyncWithServiceResponse(ArrayWrapper complexBody);

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ArrayWrapper getNotProvided() throws ErrorException, IOException;

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ArrayWrapper> getNotProvidedAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @return the observable to the ArrayWrapper object
     */
    Observable<ArrayWrapper> getNotProvidedAsync();

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @return the observable to the ArrayWrapper object
     */
    Observable<ServiceResponse<ArrayWrapper>> getNotProvidedAsyncWithServiceResponse();

}
