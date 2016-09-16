/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration.implementation;

import retrofit2.Retrofit;
import fixtures.bodyduration.Durations;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import fixtures.bodyduration.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.Period;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Durations.
 */
public final class DurationsImpl implements Durations {
    /** The Retrofit service to perform REST calls. */
    private DurationsService service;
    /** The service client containing this operation class. */
    private AutoRestDurationTestServiceImpl client;

    /**
     * Initializes an instance of Durations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DurationsImpl(Retrofit retrofit, AutoRestDurationTestServiceImpl client) {
        this.service = retrofit.create(DurationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Durations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DurationsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("duration/null")
        Observable<Response<ResponseBody>> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("duration/positiveduration")
        Observable<Response<ResponseBody>> putPositiveDuration(@Body Period durationBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("duration/positiveduration")
        Observable<Response<ResponseBody>> getPositiveDuration();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("duration/invalid")
        Observable<Response<ResponseBody>> getInvalid();

    }

    /**
     * Get null duration value.
     *
     * @return the Period object if successful.
     */
    public Period getNull() {
        return getNullWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get null duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Period> getNullAsync(final ServiceCallback<Period> serviceCallback) {
        return ServiceCall.create(getNullWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get null duration value.
     *
     * @return the observable to the Period object
     */
    public Observable<Period> getNullAsync() {
        return getNullWithServiceResponseAsync().map(new Func1<ServiceResponse<Period>, Period>() {
            @Override
            public Period call(ServiceResponse<Period> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get null duration value.
     *
     * @return the observable to the Period object
     */
    public Observable<ServiceResponse<Period>> getNullWithServiceResponseAsync() {
        return service.getNull()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Period>>>() {
                @Override
                public Observable<ServiceResponse<Period>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Period> clientResponse = getNullDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Period> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Period, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Period>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     */
    public void putPositiveDuration(Period durationBody) {
        putPositiveDurationWithServiceResponseAsync(durationBody).toBlocking().single().getBody();
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putPositiveDurationAsync(Period durationBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putPositiveDurationWithServiceResponseAsync(durationBody), serviceCallback);
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putPositiveDurationAsync(Period durationBody) {
        return putPositiveDurationWithServiceResponseAsync(durationBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putPositiveDurationWithServiceResponseAsync(Period durationBody) {
        if (durationBody == null) {
            throw new IllegalArgumentException("Parameter durationBody is required and cannot be null.");
        }
        return service.putPositiveDuration(durationBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putPositiveDurationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putPositiveDurationDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get a positive duration value.
     *
     * @return the Period object if successful.
     */
    public Period getPositiveDuration() {
        return getPositiveDurationWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get a positive duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Period> getPositiveDurationAsync(final ServiceCallback<Period> serviceCallback) {
        return ServiceCall.create(getPositiveDurationWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a positive duration value.
     *
     * @return the observable to the Period object
     */
    public Observable<Period> getPositiveDurationAsync() {
        return getPositiveDurationWithServiceResponseAsync().map(new Func1<ServiceResponse<Period>, Period>() {
            @Override
            public Period call(ServiceResponse<Period> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get a positive duration value.
     *
     * @return the observable to the Period object
     */
    public Observable<ServiceResponse<Period>> getPositiveDurationWithServiceResponseAsync() {
        return service.getPositiveDuration()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Period>>>() {
                @Override
                public Observable<ServiceResponse<Period>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Period> clientResponse = getPositiveDurationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Period> getPositiveDurationDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Period, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Period>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get an invalid duration value.
     *
     * @return the Period object if successful.
     */
    public Period getInvalid() {
        return getInvalidWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get an invalid duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Period> getInvalidAsync(final ServiceCallback<Period> serviceCallback) {
        return ServiceCall.create(getInvalidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get an invalid duration value.
     *
     * @return the observable to the Period object
     */
    public Observable<Period> getInvalidAsync() {
        return getInvalidWithServiceResponseAsync().map(new Func1<ServiceResponse<Period>, Period>() {
            @Override
            public Period call(ServiceResponse<Period> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get an invalid duration value.
     *
     * @return the observable to the Period object
     */
    public Observable<ServiceResponse<Period>> getInvalidWithServiceResponseAsync() {
        return service.getInvalid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Period>>>() {
                @Override
                public Observable<ServiceResponse<Period>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Period> clientResponse = getInvalidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Period> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Period, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Period>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
