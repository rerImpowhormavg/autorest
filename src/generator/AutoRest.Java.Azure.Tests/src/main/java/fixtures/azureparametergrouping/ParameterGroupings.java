/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.azureparametergrouping.models.ErrorException;
import fixtures.azureparametergrouping.models.FirstParameterGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostMultiParamGroupsSecondParamGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostOptionalParameters;
import fixtures.azureparametergrouping.models.ParameterGroupingPostRequiredParameters;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ParameterGroupings.
 */
public interface ParameterGroupings {
    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void postRequired(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> postRequiredAsync(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> postRequiredAsync(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters);

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> postRequiredAsyncWithServiceResponse(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters);

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void postOptional() throws ErrorException, IOException;

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> postOptionalAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> postOptionalAsync();

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> postOptionalAsyncWithServiceResponse();
    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void postOptional(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters) throws ErrorException, IOException;

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> postOptionalAsync(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> postOptionalAsync(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters);

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> postOptionalAsyncWithServiceResponse(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters);

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void postMultiParamGroups() throws ErrorException, IOException;

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> postMultiParamGroupsAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> postMultiParamGroupsAsync();

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> postMultiParamGroupsAsyncWithServiceResponse();
    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void postMultiParamGroups(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup) throws ErrorException, IOException;

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> postMultiParamGroupsAsync(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup, final ServiceCallback<Void> serviceCallback);

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> postMultiParamGroupsAsync(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup);

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> postMultiParamGroupsAsyncWithServiceResponse(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup);

    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void postSharedParameterGroupObject() throws ErrorException, IOException;

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> postSharedParameterGroupObjectAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> postSharedParameterGroupObjectAsync();

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> postSharedParameterGroupObjectAsyncWithServiceResponse();
    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void postSharedParameterGroupObject(FirstParameterGroup firstParameterGroup) throws ErrorException, IOException;

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> postSharedParameterGroupObjectAsync(FirstParameterGroup firstParameterGroup, final ServiceCallback<Void> serviceCallback);

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> postSharedParameterGroupObjectAsync(FirstParameterGroup firstParameterGroup);

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> postSharedParameterGroupObjectAsyncWithServiceResponse(FirstParameterGroup firstParameterGroup);

}
