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

import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionDefaults.
 */
public interface ApiVersionDefaults {
    /**
     * GET method with api-version modeled in global settings.
     *
     */
    void getMethodGlobalValid();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getMethodGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getMethodGlobalValidAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getMethodGlobalValidWithServiceResponseAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     */
    void getMethodGlobalNotProvidedValid();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getMethodGlobalNotProvidedValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getMethodGlobalNotProvidedValidAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getMethodGlobalNotProvidedValidWithServiceResponseAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     */
    void getPathGlobalValid();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getPathGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getPathGlobalValidAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getPathGlobalValidWithServiceResponseAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     */
    void getSwaggerGlobalValid();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getSwaggerGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getSwaggerGlobalValidAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getSwaggerGlobalValidWithServiceResponseAsync();

}
