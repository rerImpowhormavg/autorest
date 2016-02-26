/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodydate.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.LocalDate;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in DateOperations.
 */
public final class DateOperationsImpl implements DateOperations {
    /** The Retrofit service to perform REST calls. */
    private DateService service;
    /** The service client containing this operation class. */
    private AutoRestDateTestService client;

    /**
     * Initializes an instance of DateOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DateOperationsImpl(Retrofit retrofit, AutoRestDateTestService client) {
        this.service = retrofit.create(DateService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DateOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DateService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("date/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("date/invaliddate")
        Call<ResponseBody> getInvalidDate();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("date/overflowdate")
        Call<ResponseBody> getOverflowDate();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("date/underflowdate")
        Call<ResponseBody> getUnderflowDate();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("date/max")
        Call<ResponseBody> putMaxDate(@Body LocalDate dateBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("date/max")
        Call<ResponseBody> getMaxDate();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("date/min")
        Call<ResponseBody> putMinDate(@Body LocalDate dateBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("date/min")
        Call<ResponseBody> getMinDate();

    }

    /**
     * Get null date value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<LocalDate> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute());
    }

    /**
     * Get null date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getNullAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<LocalDate> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid date value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<LocalDate> getInvalidDate() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getInvalidDate();
        return getInvalidDateDelegate(call.execute());
    }

    /**
     * Get invalid date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getInvalidDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getInvalidDate();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInvalidDateDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<LocalDate> getInvalidDateDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow date value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<LocalDate> getOverflowDate() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getOverflowDate();
        return getOverflowDateDelegate(call.execute());
    }

    /**
     * Get overflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getOverflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getOverflowDate();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getOverflowDateDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<LocalDate> getOverflowDateDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow date value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<LocalDate> getUnderflowDate() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUnderflowDate();
        return getUnderflowDateDelegate(call.execute());
    }

    /**
     * Get underflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getUnderflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflowDate();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUnderflowDateDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<LocalDate> getUnderflowDateDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMaxDate(LocalDate dateBody) throws ErrorException, IOException, IllegalArgumentException {
        if (dateBody == null) {
            throw new IllegalArgumentException("Parameter dateBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putMaxDate(dateBody);
        return putMaxDateDelegate(call.execute());
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall putMaxDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) {
        if (dateBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter dateBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putMaxDate(dateBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMaxDateDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMaxDateDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<LocalDate> getMaxDate() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getMaxDate();
        return getMaxDateDelegate(call.execute());
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getMaxDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getMaxDate();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getMaxDateDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<LocalDate> getMaxDateDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMinDate(LocalDate dateBody) throws ErrorException, IOException, IllegalArgumentException {
        if (dateBody == null) {
            throw new IllegalArgumentException("Parameter dateBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putMinDate(dateBody);
        return putMinDateDelegate(call.execute());
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall putMinDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) {
        if (dateBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter dateBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putMinDate(dateBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMinDateDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMinDateDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<LocalDate> getMinDate() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getMinDate();
        return getMinDateDelegate(call.execute());
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getMinDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getMinDate();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getMinDateDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<LocalDate> getMinDateDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
