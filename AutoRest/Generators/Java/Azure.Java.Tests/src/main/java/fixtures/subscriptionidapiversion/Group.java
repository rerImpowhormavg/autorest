/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.subscriptionidapiversion;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import fixtures.subscriptionidapiversion.models.SampleResourceGroup;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.Header;

/**
 * An instance of this class provides access to all the operations defined
 * in Group.
 */
public interface Group {
    /**
     * The interface defining all the services for Group to be
     * used by Retrofit to perform actually REST calls.
     */
    interface GroupService {
        @GET("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        Response getSampleResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        void getSampleResourceGroupAsync(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

    }
    /**
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @return the SampleResourceGroup object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    SampleResourceGroup getSampleResourceGroup(String resourceGroupName) throws ServiceException;

    /**
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getSampleResourceGroupAsync(String resourceGroupName, final ServiceCallback<SampleResourceGroup> serviceCallback);

}
