/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.DateTimeRfc1123;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in Datetimerfc1123Operations.
 */
public final class Datetimerfc1123OperationsImpl implements Datetimerfc1123Operations {
    /** The Retrofit service to perform REST calls. */
    private Datetimerfc1123Service service;
    /** The service client containing this operation class. */
    private AutoRestRFC1123DateTimeTestService client;

    /**
     * Initializes an instance of Datetimerfc1123Operations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public Datetimerfc1123OperationsImpl(Retrofit retrofit, AutoRestRFC1123DateTimeTestService client) {
        this.service = retrofit.create(Datetimerfc1123Service.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Datetimerfc1123Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface Datetimerfc1123Service {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/invalid")
        Call<ResponseBody> getInvalid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/overflow")
        Call<ResponseBody> getOverflow();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/underflow")
        Call<ResponseBody> getUnderflow();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("datetimerfc1123/max")
        Call<ResponseBody> putUtcMaxDateTime(@Body DateTimeRfc1123 datetimeBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/max/lowercase")
        Call<ResponseBody> getUtcLowercaseMaxDateTime();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/max/uppercase")
        Call<ResponseBody> getUtcUppercaseMaxDateTime();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("datetimerfc1123/min")
        Call<ResponseBody> putUtcMinDateTime(@Body DateTimeRfc1123 datetimeBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/min")
        Call<ResponseBody> getUtcMinDateTime();

    }

    /**
     * Get null datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTimeRfc1123> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute());
    }

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getNullAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTimeRfc1123> getInvalid() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getInvalid();
        return getInvalidDelegate(call.execute());
    }

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getInvalidAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInvalidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTimeRfc1123> getOverflow() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getOverflow();
        return getOverflowDelegate(call.execute());
    }

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getOverflowAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getOverflow();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getOverflowDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getOverflowDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTimeRfc1123> getUnderflow() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUnderflow();
        return getUnderflowDelegate(call.execute());
    }

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getUnderflowAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflow();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUnderflowDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUnderflowDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putUtcMaxDateTime(DateTimeRfc1123 datetimeBody) throws ErrorException, IOException, IllegalArgumentException {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putUtcMaxDateTime(datetimeBody);
        return putUtcMaxDateTimeDelegate(call.execute());
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putUtcMaxDateTimeAsync(DateTimeRfc1123 datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter datetimeBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putUtcMaxDateTime(datetimeBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putUtcMaxDateTimeDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putUtcMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTimeRfc1123> getUtcLowercaseMaxDateTime() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUtcLowercaseMaxDateTime();
        return getUtcLowercaseMaxDateTimeDelegate(call.execute());
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getUtcLowercaseMaxDateTime();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUtcLowercaseMaxDateTimeDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcLowercaseMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTimeRfc1123> getUtcUppercaseMaxDateTime() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUtcUppercaseMaxDateTime();
        return getUtcUppercaseMaxDateTimeDelegate(call.execute());
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getUtcUppercaseMaxDateTime();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUtcUppercaseMaxDateTimeDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcUppercaseMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putUtcMinDateTime(DateTimeRfc1123 datetimeBody) throws ErrorException, IOException, IllegalArgumentException {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putUtcMinDateTime(datetimeBody);
        return putUtcMinDateTimeDelegate(call.execute());
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putUtcMinDateTimeAsync(DateTimeRfc1123 datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter datetimeBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putUtcMinDateTime(datetimeBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putUtcMinDateTimeDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putUtcMinDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTimeRfc1123> getUtcMinDateTime() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUtcMinDateTime();
        return getUtcMinDateTimeDelegate(call.execute());
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getUtcMinDateTimeAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getUtcMinDateTime();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUtcMinDateTimeDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcMinDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
