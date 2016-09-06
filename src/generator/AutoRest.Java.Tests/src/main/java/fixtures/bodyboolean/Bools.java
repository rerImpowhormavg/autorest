/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodyboolean.models.ErrorException;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Bools.
 */
public interface Bools {
    /**
     * Get true Boolean value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    boolean getTrue() throws ErrorException, IOException;

    /**
     * Get true Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Boolean> getTrueAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get true Boolean value.
     *
     * @return the observable to the boolean object
     */
    Observable<Boolean> getTrueAsync();

    /**
     * Get true Boolean value.
     *
     * @return the observable to the boolean object
     */
    Observable<ServiceResponse<Boolean>> getTrueAsyncWithServiceResponse();

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putTrue(boolean boolBody) throws ErrorException, IOException;

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putTrueAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putTrueAsync(boolean boolBody);

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putTrueAsyncWithServiceResponse(boolean boolBody);

    /**
     * Get false Boolean value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    boolean getFalse() throws ErrorException, IOException;

    /**
     * Get false Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Boolean> getFalseAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get false Boolean value.
     *
     * @return the observable to the boolean object
     */
    Observable<Boolean> getFalseAsync();

    /**
     * Get false Boolean value.
     *
     * @return the observable to the boolean object
     */
    Observable<ServiceResponse<Boolean>> getFalseAsyncWithServiceResponse();

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putFalse(boolean boolBody) throws ErrorException, IOException;

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putFalseAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putFalseAsync(boolean boolBody);

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putFalseAsyncWithServiceResponse(boolean boolBody);

    /**
     * Get null Boolean value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    boolean getNull() throws ErrorException, IOException;

    /**
     * Get null Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Boolean> getNullAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get null Boolean value.
     *
     * @return the observable to the boolean object
     */
    Observable<Boolean> getNullAsync();

    /**
     * Get null Boolean value.
     *
     * @return the observable to the boolean object
     */
    Observable<ServiceResponse<Boolean>> getNullAsyncWithServiceResponse();

    /**
     * Get invalid Boolean value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    boolean getInvalid() throws ErrorException, IOException;

    /**
     * Get invalid Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Boolean> getInvalidAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get invalid Boolean value.
     *
     * @return the observable to the boolean object
     */
    Observable<Boolean> getInvalidAsync();

    /**
     * Get invalid Boolean value.
     *
     * @return the observable to the boolean object
     */
    Observable<ServiceResponse<Boolean>> getInvalidAsyncWithServiceResponse();

}
