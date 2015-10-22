/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.subscriptionidapiversion;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.Resource;
import com.microsoft.rest.SubResource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import java.io.IOException;
import fixtures.subscriptionidapiversion.models.SampleResourceGroup;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.Header;

public class GroupImpl implements Group {
    private GroupService service;
    MicrosoftAzureTestUrl client;

    public GroupImpl(Retrofit retrofit, MicrosoftAzureTestUrl client) {
        this.service = retrofit.create(GroupService.class);
        this.client = client;
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @return the SampleResourceGroup object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<SampleResourceGroup> getSampleResourceGroup(String resourceGroupName) throws ServiceException {
        if (this.client.getSubscriptionId() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getSampleResourceGroup(this.client.getSubscriptionId(), resourceGroupName, this.client.getApiVersion(), this.client.getAcceptLanguage());
            return getSampleResourceGroupDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getSampleResourceGroupAsync(String resourceGroupName, final ServiceCallback<SampleResourceGroup> serviceCallback) {
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getSampleResourceGroup(this.client.getSubscriptionId(), resourceGroupName, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<SampleResourceGroup>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSampleResourceGroupDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<SampleResourceGroup> getSampleResourceGroupDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<SampleResourceGroup>()
                .register(200, new TypeToken<SampleResourceGroup>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
