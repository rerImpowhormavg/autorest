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

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import fixtures.azureparametergrouping.models.ErrorException;
import fixtures.azureparametergrouping.models.FirstParameterGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostMultiParamGroupsSecondParamGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostOptionalParameters;
import fixtures.azureparametergrouping.models.ParameterGroupingPostRequiredParameters;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

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
     * The interface defining all the services for ParameterGroupingOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ParameterGroupingService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/postRequired/{path}")
        Call<ResponseBody> postRequired(@Path("path") String path, @Header("accept-language") String acceptLanguage, @Body int body, @Header("customHeader") String customHeader, @Query("query") Integer query);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/postOptional")
        Call<ResponseBody> postOptional(@Header("accept-language") String acceptLanguage, @Header("customHeader") String customHeader, @Query("query") Integer query);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/postMultipleParameterGroups")
        Call<ResponseBody> postMultiParamGroups(@Header("accept-language") String acceptLanguage, @Header("header-one") String headerOne, @Query("query-one") Integer queryOne, @Header("header-two") String headerTwo, @Query("query-two") Integer queryTwo);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/sharedParameterGroupObject")
        Call<ResponseBody> postSharedParameterGroupObject(@Header("accept-language") String acceptLanguage, @Header("header-one") String headerOne, @Query("query-one") Integer queryOne);

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
        return postRequiredDelegate(call.execute());
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
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postRequiredDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postRequiredDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
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
        Validator.validate(parameterGroupingPostOptionalParameters);
        String customHeader = null;
        Integer query = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeader = parameterGroupingPostOptionalParameters.getCustomHeader();
            query = parameterGroupingPostOptionalParameters.getQuery();
        }
        Call<ResponseBody> call = service.postOptional(this.client.getAcceptLanguage(), customHeader, query);
        return postOptionalDelegate(call.execute());
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> postOptionalAsync(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters, final ServiceCallback<Void> serviceCallback) {
        Validator.validate(parameterGroupingPostOptionalParameters, serviceCallback);
        String customHeader = null;
        Integer query = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeader = parameterGroupingPostOptionalParameters.getCustomHeader();
            query = parameterGroupingPostOptionalParameters.getQuery();
        }
        Call<ResponseBody> call = service.postOptional(this.client.getAcceptLanguage(), customHeader, query);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postOptionalDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postOptionalDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postMultiParamGroups(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup) throws ErrorException, IOException {
        Validator.validate(firstParameterGroup);
        Validator.validate(parameterGroupingPostMultiParamGroupsSecondParamGroup);
        String headerOne = null;
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.getHeaderOne();
            queryOne = firstParameterGroup.getQueryOne();
        }
        String headerTwo = null;
        Integer queryTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            headerTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.getHeaderTwo();
            queryTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.getQueryTwo();
        }
        Call<ResponseBody> call = service.postMultiParamGroups(this.client.getAcceptLanguage(), headerOne, queryOne, headerTwo, queryTwo);
        return postMultiParamGroupsDelegate(call.execute());
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> postMultiParamGroupsAsync(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup, final ServiceCallback<Void> serviceCallback) {
        Validator.validate(firstParameterGroup, serviceCallback);
        Validator.validate(parameterGroupingPostMultiParamGroupsSecondParamGroup, serviceCallback);
        String headerOne = null;
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.getHeaderOne();
            queryOne = firstParameterGroup.getQueryOne();
        }
        String headerTwo = null;
        Integer queryTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            headerTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.getHeaderTwo();
            queryTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.getQueryTwo();
        }
        Call<ResponseBody> call = service.postMultiParamGroups(this.client.getAcceptLanguage(), headerOne, queryOne, headerTwo, queryTwo);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postMultiParamGroupsDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postMultiParamGroupsDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
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
        Validator.validate(firstParameterGroup);
        String headerOne = null;
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.getHeaderOne();
            queryOne = firstParameterGroup.getQueryOne();
        }
        Call<ResponseBody> call = service.postSharedParameterGroupObject(this.client.getAcceptLanguage(), headerOne, queryOne);
        return postSharedParameterGroupObjectDelegate(call.execute());
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> postSharedParameterGroupObjectAsync(FirstParameterGroup firstParameterGroup, final ServiceCallback<Void> serviceCallback) {
        Validator.validate(firstParameterGroup, serviceCallback);
        String headerOne = null;
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.getHeaderOne();
            queryOne = firstParameterGroup.getQueryOne();
        }
        Call<ResponseBody> call = service.postSharedParameterGroupObject(this.client.getAcceptLanguage(), headerOne, queryOne);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postSharedParameterGroupObjectDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postSharedParameterGroupObjectDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
