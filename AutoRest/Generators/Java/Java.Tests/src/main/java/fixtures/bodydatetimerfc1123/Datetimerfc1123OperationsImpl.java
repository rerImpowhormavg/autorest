/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
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
import com.squareup.okhttp.ResponseBody;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

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
     * Get null datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTimeRfc1123> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute(), null);
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

    private ServiceResponse<DateTimeRfc1123> getNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getInvalidDelegate(call.execute(), null);
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
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getInvalidDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getInvalidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getOverflowDelegate(call.execute(), null);
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
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getOverflowDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getOverflowDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getUnderflowDelegate(call.execute(), null);
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
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUnderflowDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUnderflowDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return putUtcMaxDateTimeDelegate(call.execute(), null);
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
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putUtcMaxDateTimeDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putUtcMaxDateTimeDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getUtcLowercaseMaxDateTimeDelegate(call.execute(), null);
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
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUtcLowercaseMaxDateTimeDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcLowercaseMaxDateTimeDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getUtcUppercaseMaxDateTimeDelegate(call.execute(), null);
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
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUtcUppercaseMaxDateTimeDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcUppercaseMaxDateTimeDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return putUtcMinDateTimeDelegate(call.execute(), null);
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
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putUtcMinDateTimeDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putUtcMinDateTimeDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
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
        return getUtcMinDateTimeDelegate(call.execute(), null);
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
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUtcMinDateTimeDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcMinDateTimeDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>()
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

}
