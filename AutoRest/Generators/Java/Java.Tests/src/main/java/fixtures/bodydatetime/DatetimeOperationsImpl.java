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
import java.util.Date;
import fixtures.bodydatetime.models.Error;

public class DatetimeOperationsImpl implements DatetimeOperations {
    private DatetimeService service;

    public DatetimeOperationsImpl(RestAdapter restAdapter) {
        service = restAdapter.create(DatetimeService.class);
    }

    /**
     * Get null datetime value
     *
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getNull() throws ServiceException {
        try {
            ServiceResponse<Date> response = getNullDelegate(service.getNull(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getNullDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get null datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getNullAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get invalid datetime value
     *
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getInvalid() throws ServiceException {
        try {
            ServiceResponse<Date> response = getInvalidDelegate(service.getInvalid(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getInvalidDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get invalid datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getInvalidAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getInvalidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get overflow datetime value
     *
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getOverflow() throws ServiceException {
        try {
            ServiceResponse<Date> response = getOverflowDelegate(service.getOverflow(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getOverflowDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get overflow datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getOverflowAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getOverflowDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get underflow datetime value
     *
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getUnderflow() throws ServiceException {
        try {
            ServiceResponse<Date> response = getUnderflowDelegate(service.getUnderflow(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getUnderflowDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get underflow datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUnderflowAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getUnderflowDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z
     *
     * @param datetimeBody the Date value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putUtcMaxDateTime(Date datetimeBody) throws ServiceException {
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
     * @param datetimeBody the Date value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putUtcMaxDateTimeAsync(Date datetimeBody, final ServiceCallback<Void> serviceCallback) {
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
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getUtcLowercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<Date> response = getUtcLowercaseMaxDateTimeDelegate(service.getUtcLowercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getUtcLowercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getUtcLowercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z
     *
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getUtcUppercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<Date> response = getUtcUppercaseMaxDateTimeDelegate(service.getUtcUppercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getUtcUppercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getUtcUppercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put max datetime value with positive numoffset
     * 9999-12-31t23:59:59.9999999+14:00
     *
     * @param datetimeBody the Date value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putLocalPositiveOffsetMaxDateTime(Date datetimeBody) throws ServiceException {
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
     * @param datetimeBody the Date value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putLocalPositiveOffsetMaxDateTimeAsync(Date datetimeBody, final ServiceCallback<Void> serviceCallback) {
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
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getLocalPositiveOffsetLowercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<Date> response = getLocalPositiveOffsetLowercaseMaxDateTimeDelegate(service.getLocalPositiveOffsetLowercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getLocalPositiveOffsetLowercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31t23:59:59.9999999+14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalPositiveOffsetLowercaseMaxDateTimeAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getLocalPositiveOffsetLowercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31T23:59:59.9999999+14:00
     *
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getLocalPositiveOffsetUppercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<Date> response = getLocalPositiveOffsetUppercaseMaxDateTimeDelegate(service.getLocalPositiveOffsetUppercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getLocalPositiveOffsetUppercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31T23:59:59.9999999+14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalPositiveOffsetUppercaseMaxDateTimeAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getLocalPositiveOffsetUppercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put max datetime value with positive numoffset
     * 9999-12-31t23:59:59.9999999-14:00
     *
     * @param datetimeBody the Date value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putLocalNegativeOffsetMaxDateTime(Date datetimeBody) throws ServiceException {
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
     * @param datetimeBody the Date value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putLocalNegativeOffsetMaxDateTimeAsync(Date datetimeBody, final ServiceCallback<Void> serviceCallback) {
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
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getLocalNegativeOffsetUppercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<Date> response = getLocalNegativeOffsetUppercaseMaxDateTimeDelegate(service.getLocalNegativeOffsetUppercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getLocalNegativeOffsetUppercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31T23:59:59.9999999-14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalNegativeOffsetUppercaseMaxDateTimeAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getLocalNegativeOffsetUppercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31t23:59:59.9999999-14:00
     *
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getLocalNegativeOffsetLowercaseMaxDateTime() throws ServiceException {
        try {
            ServiceResponse<Date> response = getLocalNegativeOffsetLowercaseMaxDateTimeDelegate(service.getLocalNegativeOffsetLowercaseMaxDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getLocalNegativeOffsetLowercaseMaxDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max datetime value with positive num offset
     * 9999-12-31t23:59:59.9999999-14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalNegativeOffsetLowercaseMaxDateTimeAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getLocalNegativeOffsetLowercaseMaxDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put min datetime value 0001-01-01T00:00:00Z
     *
     * @param datetimeBody the Date value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putUtcMinDateTime(Date datetimeBody) throws ServiceException {
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
     * @param datetimeBody the Date value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putUtcMinDateTimeAsync(Date datetimeBody, final ServiceCallback<Void> serviceCallback) {
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
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getUtcMinDateTime() throws ServiceException {
        try {
            ServiceResponse<Date> response = getUtcMinDateTimeDelegate(service.getUtcMinDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getUtcMinDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get min datetime value 0001-01-01T00:00:00Z
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUtcMinDateTimeAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getUtcMinDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00
     *
     * @param datetimeBody the Date value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putLocalPositiveOffsetMinDateTime(Date datetimeBody) throws ServiceException {
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
     * @param datetimeBody the Date value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putLocalPositiveOffsetMinDateTimeAsync(Date datetimeBody, final ServiceCallback<Void> serviceCallback) {
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
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getLocalPositiveOffsetMinDateTime() throws ServiceException {
        try {
            ServiceResponse<Date> response = getLocalPositiveOffsetMinDateTimeDelegate(service.getLocalPositiveOffsetMinDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getLocalPositiveOffsetMinDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalPositiveOffsetMinDateTimeAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getLocalPositiveOffsetMinDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00
     *
     * @param datetimeBody the Date value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putLocalNegativeOffsetMinDateTime(Date datetimeBody) throws ServiceException {
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
     * @param datetimeBody the Date value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putLocalNegativeOffsetMinDateTimeAsync(Date datetimeBody, final ServiceCallback<Void> serviceCallback) {
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
     * @return the Date object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Date getLocalNegativeOffsetMinDateTime() throws ServiceException {
        try {
            ServiceResponse<Date> response = getLocalNegativeOffsetMinDateTimeDelegate(service.getLocalNegativeOffsetMinDateTime(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Date> response = getLocalNegativeOffsetMinDateTimeDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getLocalNegativeOffsetMinDateTimeAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getLocalNegativeOffsetMinDateTimeDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                .register(200, new TypeToken<Date>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
