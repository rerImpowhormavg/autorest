/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import retrofit2.Retrofit;
import fixtures.bodystring.Enums;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.Validator;
import fixtures.bodystring.models.Colors;
import fixtures.bodystring.models.ErrorException;
import fixtures.bodystring.models.RefColorConstant;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Enums.
 */
public final class EnumsImpl implements Enums {
    /** The Retrofit service to perform REST calls. */
    private EnumsService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATServiceImpl client;

    /**
     * Initializes an instance of Enums.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EnumsImpl(Retrofit retrofit, AutoRestSwaggerBATServiceImpl client) {
        this.service = retrofit.create(EnumsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Enums to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EnumsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/enum/notExpandable")
        Observable<Response<ResponseBody>> getNotExpandable();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("string/enum/notExpandable")
        Observable<Response<ResponseBody>> putNotExpandable(@Body Colors stringBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/enum/Referenced")
        Observable<Response<ResponseBody>> getReferenced();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("string/enum/Referenced")
        Observable<Response<ResponseBody>> putReferenced(@Body Colors enumStringBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/enum/ReferencedConstant")
        Observable<Response<ResponseBody>> getReferencedConstant();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("string/enum/ReferencedConstant")
        Observable<Response<ResponseBody>> putReferencedConstant(@Body RefColorConstant enumStringBody);

    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Colors object wrapped in {@link ServiceResponse} if successful.
     */
    public Colors getNotExpandable() throws ErrorException, IOException {
        return getNotExpandableAsyncWithServiceResponse().toBlocking().single().getBody();
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Colors> getNotExpandableAsync(final ServiceCallback<Colors> serviceCallback) {
        return ServiceCall.create(getNotExpandableAsyncWithServiceResponse(), serviceCallback);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @return the observable to the Colors object
     */
    public Observable<Colors> getNotExpandableAsync() {
        return getNotExpandableAsyncWithServiceResponse().map(new Func1<ServiceResponse<Colors>, Colors>() {
            @Override
            public Colors call(ServiceResponse<Colors> response) {
                return response.getBody();
            }
        }); 
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @return the observable to the Colors object
     */
    public Observable<ServiceResponse<Colors>> getNotExpandableAsyncWithServiceResponse() {
        return service.getNotExpandable()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Colors>>>() {
                @Override
                public Observable<ServiceResponse<Colors>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Colors> clientResponse = getNotExpandableDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Colors> getNotExpandableDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Colors, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Colors>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public void putNotExpandable(Colors stringBody) throws ErrorException, IOException, IllegalArgumentException {
        putNotExpandableAsyncWithServiceResponse(stringBody).toBlocking().single().getBody();
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putNotExpandableAsync(Colors stringBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putNotExpandableAsyncWithServiceResponse(stringBody), serviceCallback);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putNotExpandableAsync(Colors stringBody) {
        return putNotExpandableAsyncWithServiceResponse(stringBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        }); 
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putNotExpandableAsyncWithServiceResponse(Colors stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putNotExpandable(stringBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putNotExpandableDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putNotExpandableDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Colors object wrapped in {@link ServiceResponse} if successful.
     */
    public Colors getReferenced() throws ErrorException, IOException {
        return getReferencedAsyncWithServiceResponse().toBlocking().single().getBody();
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Colors> getReferencedAsync(final ServiceCallback<Colors> serviceCallback) {
        return ServiceCall.create(getReferencedAsyncWithServiceResponse(), serviceCallback);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @return the observable to the Colors object
     */
    public Observable<Colors> getReferencedAsync() {
        return getReferencedAsyncWithServiceResponse().map(new Func1<ServiceResponse<Colors>, Colors>() {
            @Override
            public Colors call(ServiceResponse<Colors> response) {
                return response.getBody();
            }
        }); 
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @return the observable to the Colors object
     */
    public Observable<ServiceResponse<Colors>> getReferencedAsyncWithServiceResponse() {
        return service.getReferenced()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Colors>>>() {
                @Override
                public Observable<ServiceResponse<Colors>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Colors> clientResponse = getReferencedDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Colors> getReferencedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Colors, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Colors>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public void putReferenced(Colors enumStringBody) throws ErrorException, IOException, IllegalArgumentException {
        putReferencedAsyncWithServiceResponse(enumStringBody).toBlocking().single().getBody();
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putReferencedAsync(Colors enumStringBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putReferencedAsyncWithServiceResponse(enumStringBody), serviceCallback);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putReferencedAsync(Colors enumStringBody) {
        return putReferencedAsyncWithServiceResponse(enumStringBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        }); 
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putReferencedAsyncWithServiceResponse(Colors enumStringBody) {
        if (enumStringBody == null) {
            throw new IllegalArgumentException("Parameter enumStringBody is required and cannot be null.");
        }
        return service.putReferenced(enumStringBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putReferencedDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putReferencedDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get value 'green-color' from the constant.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the RefColorConstant object wrapped in {@link ServiceResponse} if successful.
     */
    public RefColorConstant getReferencedConstant() throws ErrorException, IOException {
        return getReferencedConstantAsyncWithServiceResponse().toBlocking().single().getBody();
    }

    /**
     * Get value 'green-color' from the constant.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<RefColorConstant> getReferencedConstantAsync(final ServiceCallback<RefColorConstant> serviceCallback) {
        return ServiceCall.create(getReferencedConstantAsyncWithServiceResponse(), serviceCallback);
    }

    /**
     * Get value 'green-color' from the constant.
     *
     * @return the observable to the RefColorConstant object
     */
    public Observable<RefColorConstant> getReferencedConstantAsync() {
        return getReferencedConstantAsyncWithServiceResponse().map(new Func1<ServiceResponse<RefColorConstant>, RefColorConstant>() {
            @Override
            public RefColorConstant call(ServiceResponse<RefColorConstant> response) {
                return response.getBody();
            }
        }); 
    }

    /**
     * Get value 'green-color' from the constant.
     *
     * @return the observable to the RefColorConstant object
     */
    public Observable<ServiceResponse<RefColorConstant>> getReferencedConstantAsyncWithServiceResponse() {
        return service.getReferencedConstant()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RefColorConstant>>>() {
                @Override
                public Observable<ServiceResponse<RefColorConstant>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RefColorConstant> clientResponse = getReferencedConstantDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RefColorConstant> getReferencedConstantDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<RefColorConstant, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<RefColorConstant>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public void putReferencedConstant(RefColorConstant enumStringBody) throws ErrorException, IOException, IllegalArgumentException {
        putReferencedConstantAsyncWithServiceResponse(enumStringBody).toBlocking().single().getBody();
    }

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putReferencedConstantAsync(RefColorConstant enumStringBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putReferencedConstantAsyncWithServiceResponse(enumStringBody), serviceCallback);
    }

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putReferencedConstantAsync(RefColorConstant enumStringBody) {
        return putReferencedConstantAsyncWithServiceResponse(enumStringBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        }); 
    }

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putReferencedConstantAsyncWithServiceResponse(RefColorConstant enumStringBody) {
        if (enumStringBody == null) {
            throw new IllegalArgumentException("Parameter enumStringBody is required and cannot be null.");
        }
        Validator.validate(enumStringBody);
        return service.putReferencedConstant(enumStringBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putReferencedConstantDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putReferencedConstantDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
