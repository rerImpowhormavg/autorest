/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodydate.models.ErrorException;
import java.io.IOException;
import org.joda.time.LocalDate;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

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
     * Get null date value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<LocalDate> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute(), null);
    }

    /**
     * Get null date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getNullAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNullDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getInvalidDateDelegate(call.execute(), null);
    }

    /**
     * Get invalid date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getInvalidDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getInvalidDate();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getInvalidDateDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getInvalidDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getOverflowDateDelegate(call.execute(), null);
    }

    /**
     * Get overflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getOverflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getOverflowDate();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getOverflowDateDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getOverflowDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getUnderflowDateDelegate(call.execute(), null);
    }

    /**
     * Get underflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getUnderflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflowDate();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUnderflowDateDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getUnderflowDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return putMaxDateDelegate(call.execute(), null);
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putMaxDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) {
        if (dateBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter dateBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putMaxDate(dateBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putMaxDateDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMaxDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getMaxDateDelegate(call.execute(), null);
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMaxDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getMaxDate();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMaxDateDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getMaxDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return putMinDateDelegate(call.execute(), null);
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putMinDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) {
        if (dateBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter dateBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putMinDate(dateBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putMinDateDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMinDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getMinDateDelegate(call.execute(), null);
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMinDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getMinDate();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMinDateDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getMinDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<LocalDate, ErrorException>()
                .register(200, new TypeToken<LocalDate>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

}
