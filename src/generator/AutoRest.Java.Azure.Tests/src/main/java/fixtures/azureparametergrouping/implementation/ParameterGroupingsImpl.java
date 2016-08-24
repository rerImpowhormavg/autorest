/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.implementation;

import retrofit2.Retrofit;
import fixtures.azureparametergrouping.ParameterGroupings;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
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
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ParameterGroupings.
 */
public final class ParameterGroupingsImpl implements ParameterGroupings {
    /** The Retrofit service to perform REST calls. */
    private ParameterGroupingsService service;
    /** The service client containing this operation class. */
    private AutoRestParameterGroupingTestServiceImpl client;

    /**
     * Initializes an instance of ParameterGroupingsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ParameterGroupingsImpl(Retrofit retrofit, AutoRestParameterGroupingTestServiceImpl client) {
        this.service = retrofit.create(ParameterGroupingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ParameterGroupings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ParameterGroupingsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/postRequired/{path}")
        Observable<Response<ResponseBody>> postRequired(@Path("path") String path, @Header("accept-language") String acceptLanguage, @Body int body, @Header("customHeader") String customHeader, @Query("query") Integer query, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/postOptional")
        Observable<Response<ResponseBody>> postOptional(@Header("accept-language") String acceptLanguage, @Header("customHeader") String customHeader, @Query("query") Integer query, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/postMultipleParameterGroups")
        Observable<Response<ResponseBody>> postMultiParamGroups(@Header("accept-language") String acceptLanguage, @Header("header-one") String headerOne, @Query("query-one") Integer queryOne, @Header("header-two") String headerTwo, @Query("query-two") Integer queryTwo, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/sharedParameterGroupObject")
        Observable<Response<ResponseBody>> postSharedParameterGroupObject(@Header("accept-language") String acceptLanguage, @Header("header-one") String headerOne, @Query("query-one") Integer queryOne, @Header("User-Agent") String userAgent);

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
        return postRequiredAsync(parameterGroupingPostRequiredParameters).toBlocking().single();
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> postRequiredAsync(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(postRequiredAsync(parameterGroupingPostRequiredParameters), serviceCallback);
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postRequiredAsync(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters) {
        if (parameterGroupingPostRequiredParameters == null) {
            throw new IllegalArgumentException("Parameter parameterGroupingPostRequiredParameters is required and cannot be null.");
        }
        Validator.validate(parameterGroupingPostRequiredParameters);
        int body = parameterGroupingPostRequiredParameters.body();
        String customHeader = parameterGroupingPostRequiredParameters.customHeader();
        Integer query = parameterGroupingPostRequiredParameters.query();
        String path = parameterGroupingPostRequiredParameters.path();
        return service.postRequired(path, this.client.acceptLanguage(), body, customHeader, query, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postRequiredDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> postRequiredDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postOptional() throws ErrorException, IOException {
        return postOptionalAsync().toBlocking().single();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> postOptionalAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(postOptionalAsync(), serviceCallback);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postOptionalAsync() {
        final ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters = null;
        String customHeader = null;
        Integer query = null;
        return service.postOptional(this.client.acceptLanguage(), customHeader, query, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postOptionalDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return postOptionalAsync(parameterGroupingPostOptionalParameters).toBlocking().single();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> postOptionalAsync(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(postOptionalAsync(parameterGroupingPostOptionalParameters), serviceCallback);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postOptionalAsync(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters) {
        Validator.validate(parameterGroupingPostOptionalParameters);
        String customHeader = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeader = parameterGroupingPostOptionalParameters.customHeader();
        }
        Integer query = null;
        if (parameterGroupingPostOptionalParameters != null) {
            query = parameterGroupingPostOptionalParameters.query();
        }
        return service.postOptional(this.client.acceptLanguage(), customHeader, query, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postOptionalDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> postOptionalDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postMultiParamGroups() throws ErrorException, IOException {
        return postMultiParamGroupsAsync().toBlocking().single();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> postMultiParamGroupsAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(postMultiParamGroupsAsync(), serviceCallback);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postMultiParamGroupsAsync() {
        final FirstParameterGroup firstParameterGroup = null;
        final ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup = null;
        String headerOne = null;
        Integer queryOne = null;
        String headerTwo = null;
        Integer queryTwo = null;
        return service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postMultiParamGroupsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return postMultiParamGroupsAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup).toBlocking().single();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> postMultiParamGroupsAsync(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(postMultiParamGroupsAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup), serviceCallback);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postMultiParamGroupsAsync(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        Validator.validate(firstParameterGroup);
        Validator.validate(parameterGroupingPostMultiParamGroupsSecondParamGroup);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        String headerTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            headerTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.headerTwo();
        }
        Integer queryTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            queryTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.queryTwo();
        }
        return service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postMultiParamGroupsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> postMultiParamGroupsDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postSharedParameterGroupObject() throws ErrorException, IOException {
        return postSharedParameterGroupObjectAsync().toBlocking().single();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> postSharedParameterGroupObjectAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(postSharedParameterGroupObjectAsync(), serviceCallback);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postSharedParameterGroupObjectAsync() {
        final FirstParameterGroup firstParameterGroup = null;
        String headerOne = null;
        Integer queryOne = null;
        return service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postSharedParameterGroupObjectDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
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
        return postSharedParameterGroupObjectAsync(firstParameterGroup).toBlocking().single();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> postSharedParameterGroupObjectAsync(FirstParameterGroup firstParameterGroup, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(postSharedParameterGroupObjectAsync(firstParameterGroup), serviceCallback);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postSharedParameterGroupObjectAsync(FirstParameterGroup firstParameterGroup) {
        Validator.validate(firstParameterGroup);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        return service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postSharedParameterGroupObjectDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> postSharedParameterGroupObjectDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
