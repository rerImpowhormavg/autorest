/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123.implementation;

import retrofit2.Retrofit;
import fixtures.bodydatetimerfc1123.Datetimerfc1123s;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.DateTimeRfc1123;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Datetimerfc1123s.
 */
public class Datetimerfc1123sImpl implements Datetimerfc1123s {
    /** The Retrofit service to perform REST calls. */
    private Datetimerfc1123sService service;
    /** The service client containing this operation class. */
    private AutoRestRFC1123DateTimeTestServiceImpl client;

    /**
     * Initializes an instance of Datetimerfc1123s.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public Datetimerfc1123sImpl(Retrofit retrofit, AutoRestRFC1123DateTimeTestServiceImpl client) {
        this.service = retrofit.create(Datetimerfc1123sService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Datetimerfc1123s to be
     * used by Retrofit to perform actually REST calls.
     */
    interface Datetimerfc1123sService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getNull" })
        @GET("datetimerfc1123/null")
        Observable<Response<ResponseBody>> getNull();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getInvalid" })
        @GET("datetimerfc1123/invalid")
        Observable<Response<ResponseBody>> getInvalid();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getOverflow" })
        @GET("datetimerfc1123/overflow")
        Observable<Response<ResponseBody>> getOverflow();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getUnderflow" })
        @GET("datetimerfc1123/underflow")
        Observable<Response<ResponseBody>> getUnderflow();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s putUtcMaxDateTime" })
        @PUT("datetimerfc1123/max")
        Observable<Response<ResponseBody>> putUtcMaxDateTime(@Body DateTimeRfc1123 datetimeBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getUtcLowercaseMaxDateTime" })
        @GET("datetimerfc1123/max/lowercase")
        Observable<Response<ResponseBody>> getUtcLowercaseMaxDateTime();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getUtcUppercaseMaxDateTime" })
        @GET("datetimerfc1123/max/uppercase")
        Observable<Response<ResponseBody>> getUtcUppercaseMaxDateTime();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s putUtcMinDateTime" })
        @PUT("datetimerfc1123/min")
        Observable<Response<ResponseBody>> putUtcMinDateTime(@Body DateTimeRfc1123 datetimeBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getUtcMinDateTime" })
        @GET("datetimerfc1123/min")
        Observable<Response<ResponseBody>> getUtcMinDateTime();

    }

    /**
     * Get null datetime value.
     *
     * @return the DateTime object if successful.
     */
    public DateTime getNull() {
        return getNullWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getNullAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromResponse(getNullWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get null datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<DateTime> getNullAsync() {
        return getNullWithServiceResponseAsync().map(new Func1<ServiceResponse<DateTime>, DateTime>() {
            @Override
            public DateTime call(ServiceResponse<DateTime> response) {
                return response.body();
            }
        });
    }

    /**
     * Get null datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getNullWithServiceResponseAsync() {
        return service.getNull()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getNullDelegate(response);
                        DateTime body = null;
                        if (result.body() != null) {
                            body = result.body().dateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DateTimeRfc1123, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid datetime value.
     *
     * @return the DateTime object if successful.
     */
    public DateTime getInvalid() {
        return getInvalidWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getInvalidAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromResponse(getInvalidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get invalid datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<DateTime> getInvalidAsync() {
        return getInvalidWithServiceResponseAsync().map(new Func1<ServiceResponse<DateTime>, DateTime>() {
            @Override
            public DateTime call(ServiceResponse<DateTime> response) {
                return response.body();
            }
        });
    }

    /**
     * Get invalid datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getInvalidWithServiceResponseAsync() {
        return service.getInvalid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getInvalidDelegate(response);
                        DateTime body = null;
                        if (result.body() != null) {
                            body = result.body().dateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DateTimeRfc1123, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow datetime value.
     *
     * @return the DateTime object if successful.
     */
    public DateTime getOverflow() {
        return getOverflowWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getOverflowAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromResponse(getOverflowWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get overflow datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<DateTime> getOverflowAsync() {
        return getOverflowWithServiceResponseAsync().map(new Func1<ServiceResponse<DateTime>, DateTime>() {
            @Override
            public DateTime call(ServiceResponse<DateTime> response) {
                return response.body();
            }
        });
    }

    /**
     * Get overflow datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getOverflowWithServiceResponseAsync() {
        return service.getOverflow()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getOverflowDelegate(response);
                        DateTime body = null;
                        if (result.body() != null) {
                            body = result.body().dateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getOverflowDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DateTimeRfc1123, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow datetime value.
     *
     * @return the DateTime object if successful.
     */
    public DateTime getUnderflow() {
        return getUnderflowWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getUnderflowAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromResponse(getUnderflowWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get underflow datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<DateTime> getUnderflowAsync() {
        return getUnderflowWithServiceResponseAsync().map(new Func1<ServiceResponse<DateTime>, DateTime>() {
            @Override
            public DateTime call(ServiceResponse<DateTime> response) {
                return response.body();
            }
        });
    }

    /**
     * Get underflow datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getUnderflowWithServiceResponseAsync() {
        return service.getUnderflow()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getUnderflowDelegate(response);
                        DateTime body = null;
                        if (result.body() != null) {
                            body = result.body().dateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getUnderflowDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DateTimeRfc1123, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     */
    public void putUtcMaxDateTime(DateTime datetimeBody) {
        putUtcMaxDateTimeWithServiceResponseAsync(datetimeBody).toBlocking().single().body();
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putUtcMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putUtcMaxDateTimeWithServiceResponseAsync(datetimeBody), serviceCallback);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putUtcMaxDateTimeAsync(DateTime datetimeBody) {
        return putUtcMaxDateTimeWithServiceResponseAsync(datetimeBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putUtcMaxDateTimeWithServiceResponseAsync(DateTime datetimeBody) {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        return service.putUtcMaxDateTime(datetimeBodyConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putUtcMaxDateTimeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putUtcMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return the DateTime object if successful.
     */
    public DateTime getUtcLowercaseMaxDateTime() {
        return getUtcLowercaseMaxDateTimeWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromResponse(getUtcLowercaseMaxDateTimeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return the observable to the DateTime object
     */
    public Observable<DateTime> getUtcLowercaseMaxDateTimeAsync() {
        return getUtcLowercaseMaxDateTimeWithServiceResponseAsync().map(new Func1<ServiceResponse<DateTime>, DateTime>() {
            @Override
            public DateTime call(ServiceResponse<DateTime> response) {
                return response.body();
            }
        });
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getUtcLowercaseMaxDateTimeWithServiceResponseAsync() {
        return service.getUtcLowercaseMaxDateTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getUtcLowercaseMaxDateTimeDelegate(response);
                        DateTime body = null;
                        if (result.body() != null) {
                            body = result.body().dateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getUtcLowercaseMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DateTimeRfc1123, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return the DateTime object if successful.
     */
    public DateTime getUtcUppercaseMaxDateTime() {
        return getUtcUppercaseMaxDateTimeWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromResponse(getUtcUppercaseMaxDateTimeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return the observable to the DateTime object
     */
    public Observable<DateTime> getUtcUppercaseMaxDateTimeAsync() {
        return getUtcUppercaseMaxDateTimeWithServiceResponseAsync().map(new Func1<ServiceResponse<DateTime>, DateTime>() {
            @Override
            public DateTime call(ServiceResponse<DateTime> response) {
                return response.body();
            }
        });
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getUtcUppercaseMaxDateTimeWithServiceResponseAsync() {
        return service.getUtcUppercaseMaxDateTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getUtcUppercaseMaxDateTimeDelegate(response);
                        DateTime body = null;
                        if (result.body() != null) {
                            body = result.body().dateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getUtcUppercaseMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DateTimeRfc1123, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     */
    public void putUtcMinDateTime(DateTime datetimeBody) {
        putUtcMinDateTimeWithServiceResponseAsync(datetimeBody).toBlocking().single().body();
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putUtcMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putUtcMinDateTimeWithServiceResponseAsync(datetimeBody), serviceCallback);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putUtcMinDateTimeAsync(DateTime datetimeBody) {
        return putUtcMinDateTimeWithServiceResponseAsync(datetimeBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putUtcMinDateTimeWithServiceResponseAsync(DateTime datetimeBody) {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        return service.putUtcMinDateTime(datetimeBodyConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putUtcMinDateTimeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putUtcMinDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return the DateTime object if successful.
     */
    public DateTime getUtcMinDateTime() {
        return getUtcMinDateTimeWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getUtcMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromResponse(getUtcMinDateTimeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return the observable to the DateTime object
     */
    public Observable<DateTime> getUtcMinDateTimeAsync() {
        return getUtcMinDateTimeWithServiceResponseAsync().map(new Func1<ServiceResponse<DateTime>, DateTime>() {
            @Override
            public DateTime call(ServiceResponse<DateTime> response) {
                return response.body();
            }
        });
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getUtcMinDateTimeWithServiceResponseAsync() {
        return service.getUtcMinDateTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getUtcMinDateTimeDelegate(response);
                        DateTime body = null;
                        if (result.body() != null) {
                            body = result.body().dateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getUtcMinDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DateTimeRfc1123, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
