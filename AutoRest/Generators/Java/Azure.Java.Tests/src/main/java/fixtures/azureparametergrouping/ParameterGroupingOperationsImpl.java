/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.AzureServiceResponseBuilder;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import com.squareup.okhttp.ResponseBody;
import fixtures.azureparametergrouping.models.ErrorException;
import fixtures.azureparametergrouping.models.FirstParameterGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostMultipleParameterGroupsSecondParameterGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostOptionalParameters;
import fixtures.azureparametergrouping.models.ParameterGroupingPostRequiredParameters;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in ParameterGroupingOperations.
 */
public final class ParameterGroupingOperationsImpl implements ParameterGroupingOperations {
    /** The Retrofit service to perform REST calls. */
    private ParameterGroupingService service;
    /** The service client containing this operation class. */
    private AutoRestParameterGroupingTestService client;

    /**
     * Initializes an instance of ParameterGroupingOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ParameterGroupingOperationsImpl(Retrofit retrofit, AutoRestParameterGroupingTestService client) {
        this.service = retrofit.create(ParameterGroupingService.class);
        this.client = client;
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postRequired(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters) throws ErrorException, IOException, IllegalArgumentException {
        if (parameterGroupingPostRequiredParameters == null) {
            throw new IllegalArgumentException("Parameter parameterGroupingPostRequiredParameters is required and cannot be null.");
        }
        Validator.validate(parameterGroupingPostRequiredParameters);
        int body = parameterGroupingPostRequiredParameters.getBody();
        String customHeader = parameterGroupingPostRequiredParameters.getCustomHeader();
        Integer query = parameterGroupingPostRequiredParameters.getQuery();
        String path = parameterGroupingPostRequiredParameters.getPath();
        Call<ResponseBody> call = service.postRequired(path, this.client.getAcceptLanguage(), body, customHeader, query);
        return postRequiredDelegate(call.execute(), null);
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> postRequiredAsync(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters, final ServiceCallback<Void> serviceCallback) {
        if (parameterGroupingPostRequiredParameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter parameterGroupingPostRequiredParameters is required and cannot be null."));
            return null;
        }
        Validator.validate(parameterGroupingPostRequiredParameters, serviceCallback);
        int body = parameterGroupingPostRequiredParameters.getBody();
        String customHeader = parameterGroupingPostRequiredParameters.getCustomHeader();
        Integer query = parameterGroupingPostRequiredParameters.getQuery();
        String path = parameterGroupingPostRequiredParameters.getPath();
        Call<ResponseBody> call = service.postRequired(path, this.client.getAcceptLanguage(), body, customHeader, query);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postRequiredDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postRequiredDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postOptional(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters) throws ErrorException, IOException {
        String customHeader = null;
        Integer query = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeader = parameterGroupingPostOptionalParameters.getCustomHeader();
            query = parameterGroupingPostOptionalParameters.getQuery();
        }
        Call<ResponseBody> call = service.postOptional(this.client.getAcceptLanguage(), customHeader, query);
        return postOptionalDelegate(call.execute(), null);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> postOptionalAsync(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters, final ServiceCallback<Void> serviceCallback) {
        String customHeader = null;
        Integer query = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeader = parameterGroupingPostOptionalParameters.getCustomHeader();
            query = parameterGroupingPostOptionalParameters.getQuery();
        }
        Call<ResponseBody> call = service.postOptional(this.client.getAcceptLanguage(), customHeader, query);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postOptionalDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postOptionalDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultipleParameterGroupsSecondParameterGroup Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postMultipleParameterGroups(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultipleParameterGroupsSecondParameterGroup parameterGroupingPostMultipleParameterGroupsSecondParameterGroup) throws ErrorException, IOException {
        String headerOne = null;
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.getHeaderOne();
            queryOne = firstParameterGroup.getQueryOne();
        }
        String headerTwo = null;
        Integer queryTwo = null;
        if (parameterGroupingPostMultipleParameterGroupsSecondParameterGroup != null) {
            headerTwo = parameterGroupingPostMultipleParameterGroupsSecondParameterGroup.getHeaderTwo();
            queryTwo = parameterGroupingPostMultipleParameterGroupsSecondParameterGroup.getQueryTwo();
        }
        Call<ResponseBody> call = service.postMultipleParameterGroups(this.client.getAcceptLanguage(), headerOne, queryOne, headerTwo, queryTwo);
        return postMultipleParameterGroupsDelegate(call.execute(), null);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultipleParameterGroupsSecondParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> postMultipleParameterGroupsAsync(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultipleParameterGroupsSecondParameterGroup parameterGroupingPostMultipleParameterGroupsSecondParameterGroup, final ServiceCallback<Void> serviceCallback) {
        String headerOne = null;
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.getHeaderOne();
            queryOne = firstParameterGroup.getQueryOne();
        }
        String headerTwo = null;
        Integer queryTwo = null;
        if (parameterGroupingPostMultipleParameterGroupsSecondParameterGroup != null) {
            headerTwo = parameterGroupingPostMultipleParameterGroupsSecondParameterGroup.getHeaderTwo();
            queryTwo = parameterGroupingPostMultipleParameterGroupsSecondParameterGroup.getQueryTwo();
        }
        Call<ResponseBody> call = service.postMultipleParameterGroups(this.client.getAcceptLanguage(), headerOne, queryOne, headerTwo, queryTwo);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postMultipleParameterGroupsDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postMultipleParameterGroupsDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postSharedParameterGroupObject(FirstParameterGroup firstParameterGroup) throws ErrorException, IOException {
        String headerOne = null;
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.getHeaderOne();
            queryOne = firstParameterGroup.getQueryOne();
        }
        Call<ResponseBody> call = service.postSharedParameterGroupObject(this.client.getAcceptLanguage(), headerOne, queryOne);
        return postSharedParameterGroupObjectDelegate(call.execute(), null);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> postSharedParameterGroupObjectAsync(FirstParameterGroup firstParameterGroup, final ServiceCallback<Void> serviceCallback) {
        String headerOne = null;
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.getHeaderOne();
            queryOne = firstParameterGroup.getQueryOne();
        }
        Call<ResponseBody> call = service.postSharedParameterGroupObject(this.client.getAcceptLanguage(), headerOne, queryOne);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postSharedParameterGroupObjectDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postSharedParameterGroupObjectDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

}
