/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodystring.models.Colors;
import fixtures.bodystring.models.ErrorException;
import fixtures.bodystring.models.RefColorConstant;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Enums.
 */
public interface Enums {
    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Colors object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Colors> getNotExpandable() throws ErrorException, IOException;

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Colors> getNotExpandableAsync(final ServiceCallback<Colors> serviceCallback);

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @return the observable to the Colors object
     */
    Observable<ServiceResponse<Colors>> getNotExpandableAsync();

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putNotExpandable(Colors stringBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putNotExpandableAsync(Colors stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putNotExpandableAsync(Colors stringBody);

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Colors object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Colors> getReferenced() throws ErrorException, IOException;

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Colors> getReferencedAsync(final ServiceCallback<Colors> serviceCallback);

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @return the observable to the Colors object
     */
    Observable<ServiceResponse<Colors>> getReferencedAsync();

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putReferenced(Colors enumStringBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putReferencedAsync(Colors enumStringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putReferencedAsync(Colors enumStringBody);

    /**
     * Get value 'green-color' from the constant.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the RefColorConstant object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RefColorConstant> getReferencedConstant() throws ErrorException, IOException;

    /**
     * Get value 'green-color' from the constant.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<RefColorConstant> getReferencedConstantAsync(final ServiceCallback<RefColorConstant> serviceCallback);

    /**
     * Get value 'green-color' from the constant.
     *
     * @return the observable to the RefColorConstant object
     */
    Observable<ServiceResponse<RefColorConstant>> getReferencedConstantAsync();

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putReferencedConstant(RefColorConstant enumStringBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putReferencedConstantAsync(RefColorConstant enumStringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putReferencedConstantAsync(RefColorConstant enumStringBody);

}
