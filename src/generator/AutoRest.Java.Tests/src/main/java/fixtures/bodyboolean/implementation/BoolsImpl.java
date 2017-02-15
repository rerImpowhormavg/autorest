/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean.implementation;

import retrofit2.Retrofit;
import fixtures.bodyboolean.Bools;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodyboolean.models.ErrorException;
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
 * in Bools.
 */
public class BoolsImpl implements Bools {
    /** The Retrofit service to perform REST calls. */
    private BoolsService service;
    /** The service client containing this operation class. */
    private AutoRestBoolTestServiceImpl client;

    /**
     * Initializes an instance of Bools.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BoolsImpl(Retrofit retrofit, AutoRestBoolTestServiceImpl client) {
        this.service = retrofit.create(BoolsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Bools to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BoolsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyboolean.Bools getTrue" })
        @GET("bool/true")
        Observable<Response<ResponseBody>> getTrue();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyboolean.Bools putTrue" })
        @PUT("bool/true")
        Observable<Response<ResponseBody>> putTrue(@Body boolean boolBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyboolean.Bools getFalse" })
        @GET("bool/false")
        Observable<Response<ResponseBody>> getFalse();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyboolean.Bools putFalse" })
        @PUT("bool/false")
        Observable<Response<ResponseBody>> putFalse(@Body boolean boolBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyboolean.Bools getNull" })
        @GET("bool/null")
        Observable<Response<ResponseBody>> getNull();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyboolean.Bools getInvalid" })
        @GET("bool/invalid")
        Observable<Response<ResponseBody>> getInvalid();

    }

    /**
     * Get true Boolean value.
     *
     * @return the boolean object if successful.
     */
    public boolean getTrue() {
        return getTrueWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get true Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getTrueAsync(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromResponse(getTrueWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get true Boolean value.
     *
     * @return the observable to the Boolean object
     */
    public Observable<Boolean> getTrueAsync() {
        return getTrueWithServiceResponseAsync().map(new Func1<ServiceResponse<Boolean>, Boolean>() {
            @Override
            public Boolean call(ServiceResponse<Boolean> response) {
                return response.body();
            }
        });
    }

    /**
     * Get true Boolean value.
     *
     * @return the observable to the Boolean object
     */
    public Observable<ServiceResponse<Boolean>> getTrueWithServiceResponseAsync() {
        return service.getTrue()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = getTrueDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> getTrueDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Boolean, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Boolean>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     */
    public void putTrue(boolean boolBody) {
        putTrueWithServiceResponseAsync(boolBody).toBlocking().single().body();
    }

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putTrueAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putTrueWithServiceResponseAsync(boolBody), serviceCallback);
    }

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putTrueAsync(boolean boolBody) {
        return putTrueWithServiceResponseAsync(boolBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putTrueWithServiceResponseAsync(boolean boolBody) {
        return service.putTrue(boolBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putTrueDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putTrueDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get false Boolean value.
     *
     * @return the boolean object if successful.
     */
    public boolean getFalse() {
        return getFalseWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get false Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getFalseAsync(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromResponse(getFalseWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get false Boolean value.
     *
     * @return the observable to the Boolean object
     */
    public Observable<Boolean> getFalseAsync() {
        return getFalseWithServiceResponseAsync().map(new Func1<ServiceResponse<Boolean>, Boolean>() {
            @Override
            public Boolean call(ServiceResponse<Boolean> response) {
                return response.body();
            }
        });
    }

    /**
     * Get false Boolean value.
     *
     * @return the observable to the Boolean object
     */
    public Observable<ServiceResponse<Boolean>> getFalseWithServiceResponseAsync() {
        return service.getFalse()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = getFalseDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> getFalseDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Boolean, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Boolean>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     */
    public void putFalse(boolean boolBody) {
        putFalseWithServiceResponseAsync(boolBody).toBlocking().single().body();
    }

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putFalseAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putFalseWithServiceResponseAsync(boolBody), serviceCallback);
    }

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putFalseAsync(boolean boolBody) {
        return putFalseWithServiceResponseAsync(boolBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putFalseWithServiceResponseAsync(boolean boolBody) {
        return service.putFalse(boolBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putFalseDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putFalseDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get null Boolean value.
     *
     * @return the boolean object if successful.
     */
    public boolean getNull() {
        return getNullWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get null Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getNullAsync(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromResponse(getNullWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get null Boolean value.
     *
     * @return the observable to the Boolean object
     */
    public Observable<Boolean> getNullAsync() {
        return getNullWithServiceResponseAsync().map(new Func1<ServiceResponse<Boolean>, Boolean>() {
            @Override
            public Boolean call(ServiceResponse<Boolean> response) {
                return response.body();
            }
        });
    }

    /**
     * Get null Boolean value.
     *
     * @return the observable to the Boolean object
     */
    public Observable<ServiceResponse<Boolean>> getNullWithServiceResponseAsync() {
        return service.getNull()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = getNullDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Boolean, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Boolean>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid Boolean value.
     *
     * @return the boolean object if successful.
     */
    public boolean getInvalid() {
        return getInvalidWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get invalid Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getInvalidAsync(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromResponse(getInvalidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get invalid Boolean value.
     *
     * @return the observable to the Boolean object
     */
    public Observable<Boolean> getInvalidAsync() {
        return getInvalidWithServiceResponseAsync().map(new Func1<ServiceResponse<Boolean>, Boolean>() {
            @Override
            public Boolean call(ServiceResponse<Boolean> response) {
                return response.body();
            }
        });
    }

    /**
     * Get invalid Boolean value.
     *
     * @return the observable to the Boolean object
     */
    public Observable<ServiceResponse<Boolean>> getInvalidWithServiceResponseAsync() {
        return service.getInvalid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = getInvalidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Boolean, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Boolean>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
