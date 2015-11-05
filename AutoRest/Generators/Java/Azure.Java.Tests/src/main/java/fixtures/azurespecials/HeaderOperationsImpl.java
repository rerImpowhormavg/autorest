/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.serializer.AzureJacksonHelper;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.azurespecials.models.Error;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class HeaderOperationsImpl implements HeaderOperations {
    private HeaderService service;
    AutoRestAzureSpecialParametersTestClient client;

    public HeaderOperationsImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClient client) {
        this.service = retrofit.create(HeaderService.class);
        this.client = client;
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request
     *
     * @param fooClientRequestId The fooRequestId
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> customNamedRequestId(String fooClientRequestId) throws ServiceException {
        if (fooClientRequestId == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.customNamedRequestId(fooClientRequestId, this.client.getAcceptLanguage());
            return customNamedRequestIdDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request
     *
     * @param fooClientRequestId The fooRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> customNamedRequestIdAsync(String fooClientRequestId, final ServiceCallback<Void> serviceCallback) {
        if (fooClientRequestId == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.customNamedRequestId(fooClientRequestId, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(customNamedRequestIdDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> customNamedRequestIdDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>(new AzureJacksonHelper())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
