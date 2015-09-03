/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetime;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import org.joda.time.DateTime;
import fixtures.bodydatetime.models.Error;

public class DatetimeOperationsImpl implements DatetimeOperations {
    private DatetimeService service;
    AutoRestDateTimeTestService client;

    public DatetimeOperationsImpl(RestAdapter restAdapter, AutoRestDateTimeTestService client) {
        this.service = restAdapter.create(DatetimeService.class);
        this.client = client;
    }

    /**
     * Get null datetime value
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getNull() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getNullDelegate(service.getNull(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getNullDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get null datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getNullAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getNullAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getNullDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get invalid datetime value
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getInvalid() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getInvalidDelegate(service.getInvalid(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getInvalidDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get invalid datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getInvalidAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getInvalidAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getInvalidDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getInvalidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get overflow datetime value
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getOverflow() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getOverflowDelegate(service.getOverflow(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getOverflowDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get overflow datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getOverflowAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getOverflowAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getOverflowDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getOverflowDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get underflow datetime value
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getUnderflow() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getUnderflowDelegate(service.getUnderflow(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getUnderflowDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get underflow datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUnderflowAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getUnderflowAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getUnderflowDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getUnderflowDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putUtcMaxDateTime(DateTime datetimeBody) throws ServiceException {
        if (datetimeBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null."));
        }
        try {
            ServiceResponse<Void> response = putUtcMaxDateTimeDelegate(service.putUtcMaxDateTime(datetimeBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putUtcMaxDateTimeDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putUtcMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.")));
        }
        service.putUtcMaxDateTimeAsync(datetimeBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putUtcMaxDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putUtcMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getUtcLowercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getUtcLowercaseMaxDateTimeDelegate(service.getUtcLowercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getUtcLowercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getUtcLowercaseMaxDateTimeAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getUtcLowercaseMaxDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getUtcLowercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getUtcUppercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getUtcUppercaseMaxDateTimeDelegate(service.getUtcUppercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getUtcUppercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getUtcUppercaseMaxDateTimeAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getUtcUppercaseMaxDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getUtcUppercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put max datetime value with positive numoffset
     * 9999-12-31t23:59:59.9999999+14:00
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putLocalPositiveOffsetMaxDateTime(DateTime datetimeBody) throws ServiceException {
        if (datetimeBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null."));
        }
        try {
            ServiceResponse<Void> response = putLocalPositiveOffsetMaxDateTimeDelegate(service.putLocalPositiveOffsetMaxDateTime(datetimeBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putLocalPositiveOffsetMaxDateTimeDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put max datetime value with positive numoffset
     * 9999-12-31t23:59:59.9999999+14:00
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putLocalPositiveOffsetMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.")));
        }
        service.putLocalPositiveOffsetMaxDateTimeAsync(datetimeBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putLocalPositiveOffsetMaxDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putLocalPositiveOffsetMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31t23:59:59.9999999+14:00
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getLocalPositiveOffsetLowercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getLocalPositiveOffsetLowercaseMaxDateTimeDelegate(service.getLocalPositiveOffsetLowercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getLocalPositiveOffsetLowercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31t23:59:59.9999999+14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalPositiveOffsetLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getLocalPositiveOffsetLowercaseMaxDateTimeAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getLocalPositiveOffsetLowercaseMaxDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getLocalPositiveOffsetLowercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31T23:59:59.9999999+14:00
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getLocalPositiveOffsetUppercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getLocalPositiveOffsetUppercaseMaxDateTimeDelegate(service.getLocalPositiveOffsetUppercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getLocalPositiveOffsetUppercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31T23:59:59.9999999+14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalPositiveOffsetUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getLocalPositiveOffsetUppercaseMaxDateTimeAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getLocalPositiveOffsetUppercaseMaxDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getLocalPositiveOffsetUppercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put max datetime value with positive numoffset
     * 9999-12-31t23:59:59.9999999-14:00
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putLocalNegativeOffsetMaxDateTime(DateTime datetimeBody) throws ServiceException {
        if (datetimeBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null."));
        }
        try {
            ServiceResponse<Void> response = putLocalNegativeOffsetMaxDateTimeDelegate(service.putLocalNegativeOffsetMaxDateTime(datetimeBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putLocalNegativeOffsetMaxDateTimeDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put max datetime value with positive numoffset
     * 9999-12-31t23:59:59.9999999-14:00
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putLocalNegativeOffsetMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.")));
        }
        service.putLocalNegativeOffsetMaxDateTimeAsync(datetimeBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putLocalNegativeOffsetMaxDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putLocalNegativeOffsetMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31T23:59:59.9999999-14:00
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getLocalNegativeOffsetUppercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getLocalNegativeOffsetUppercaseMaxDateTimeDelegate(service.getLocalNegativeOffsetUppercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getLocalNegativeOffsetUppercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31T23:59:59.9999999-14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalNegativeOffsetUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getLocalNegativeOffsetUppercaseMaxDateTimeAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getLocalNegativeOffsetUppercaseMaxDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getLocalNegativeOffsetUppercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31t23:59:59.9999999-14:00
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getLocalNegativeOffsetLowercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getLocalNegativeOffsetLowercaseMaxDateTimeDelegate(service.getLocalNegativeOffsetLowercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getLocalNegativeOffsetLowercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31t23:59:59.9999999-14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalNegativeOffsetLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getLocalNegativeOffsetLowercaseMaxDateTimeAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getLocalNegativeOffsetLowercaseMaxDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getLocalNegativeOffsetLowercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put min datetime value 0001-01-01T00:00:00Z
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putUtcMinDateTime(DateTime datetimeBody) throws ServiceException {
        if (datetimeBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null."));
        }
        try {
            ServiceResponse<Void> response = putUtcMinDateTimeDelegate(service.putUtcMinDateTime(datetimeBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putUtcMinDateTimeDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put min datetime value 0001-01-01T00:00:00Z
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putUtcMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.")));
        }
        service.putUtcMinDateTimeAsync(datetimeBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putUtcMinDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putUtcMinDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get min datetime value 0001-01-01T00:00:00Z
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getUtcMinDateTime() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getUtcMinDateTimeDelegate(service.getUtcMinDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getUtcMinDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get min datetime value 0001-01-01T00:00:00Z
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUtcMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getUtcMinDateTimeAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getUtcMinDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getUtcMinDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putLocalPositiveOffsetMinDateTime(DateTime datetimeBody) throws ServiceException {
        if (datetimeBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null."));
        }
        try {
            ServiceResponse<Void> response = putLocalPositiveOffsetMinDateTimeDelegate(service.putLocalPositiveOffsetMinDateTime(datetimeBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putLocalPositiveOffsetMinDateTimeDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putLocalPositiveOffsetMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.")));
        }
        service.putLocalPositiveOffsetMinDateTimeAsync(datetimeBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putLocalPositiveOffsetMinDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putLocalPositiveOffsetMinDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getLocalPositiveOffsetMinDateTime() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getLocalPositiveOffsetMinDateTimeDelegate(service.getLocalPositiveOffsetMinDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getLocalPositiveOffsetMinDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalPositiveOffsetMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getLocalPositiveOffsetMinDateTimeAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getLocalPositiveOffsetMinDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getLocalPositiveOffsetMinDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00
     *
     * @param datetimeBody the DateTime value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putLocalNegativeOffsetMinDateTime(DateTime datetimeBody) throws ServiceException {
        if (datetimeBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null."));
        }
        try {
            ServiceResponse<Void> response = putLocalNegativeOffsetMinDateTimeDelegate(service.putLocalNegativeOffsetMinDateTime(datetimeBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putLocalNegativeOffsetMinDateTimeDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putLocalNegativeOffsetMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.")));
        }
        service.putLocalNegativeOffsetMinDateTimeAsync(datetimeBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putLocalNegativeOffsetMinDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putLocalNegativeOffsetMinDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00
     *
     * @return the DateTime object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTime getLocalNegativeOffsetMinDateTime() throws ServiceException {
        try {
            ServiceResponse<DateTime> response = getLocalNegativeOffsetMinDateTimeDelegate(service.getLocalNegativeOffsetMinDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<DateTime> response = getLocalNegativeOffsetMinDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalNegativeOffsetMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        service.getLocalNegativeOffsetMinDateTimeAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getLocalNegativeOffsetMinDateTimeDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DateTime> getLocalNegativeOffsetMinDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DateTime>()
                .register(200, new TypeToken<DateTime>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
