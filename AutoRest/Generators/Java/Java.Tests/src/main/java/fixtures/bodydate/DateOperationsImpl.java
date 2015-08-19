/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import org.joda.time.LocalDate;
import fixtures.bodydate.models.Error;

public class DateOperationsImpl implements DateOperations {
    private DateService service;

    public DateOperationsImpl(RestAdapter restAdapter) {
        service = restAdapter.create(DateService.class);
    }

    /**
     * Get null date value
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getNull() throws ServiceException {
        try {
            ServiceResponse<LocalDate> response = getNullDelegate(service.getNull(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<LocalDate> response = getNullDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get null date value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getNullAsync(final ServiceCallback<LocalDate> serviceCallback) {
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

    private ServiceResponse<LocalDate> getNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get invalid date value
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getInvalidDate() throws ServiceException {
        try {
            ServiceResponse<LocalDate> response = getInvalidDateDelegate(service.getInvalidDate(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<LocalDate> response = getInvalidDateDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get invalid date value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getInvalidDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        service.getInvalidDateAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getInvalidDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<LocalDate> getInvalidDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get overflow date value
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getOverflowDate() throws ServiceException {
        try {
            ServiceResponse<LocalDate> response = getOverflowDateDelegate(service.getOverflowDate(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<LocalDate> response = getOverflowDateDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get overflow date value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getOverflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        service.getOverflowDateAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getOverflowDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<LocalDate> getOverflowDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get underflow date value
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getUnderflowDate() throws ServiceException {
        try {
            ServiceResponse<LocalDate> response = getUnderflowDateDelegate(service.getUnderflowDate(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<LocalDate> response = getUnderflowDateDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get underflow date value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUnderflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        service.getUnderflowDateAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getUnderflowDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<LocalDate> getUnderflowDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put max date value 9999-12-31
     *
     * @param dateBody the LocalDate value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putMaxDate(LocalDate dateBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putMaxDateDelegate(service.putMaxDate(dateBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putMaxDateDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put max date value 9999-12-31
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putMaxDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) {
        service.putMaxDateAsync(dateBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putMaxDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putMaxDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get max date value 9999-12-31
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getMaxDate() throws ServiceException {
        try {
            ServiceResponse<LocalDate> response = getMaxDateDelegate(service.getMaxDate(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<LocalDate> response = getMaxDateDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get max date value 9999-12-31
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getMaxDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        service.getMaxDateAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getMaxDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<LocalDate> getMaxDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put min date value 0000-01-01
     *
     * @param dateBody the LocalDate value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putMinDate(LocalDate dateBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putMinDateDelegate(service.putMinDate(dateBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putMinDateDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put min date value 0000-01-01
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putMinDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) {
        service.putMinDateAsync(dateBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putMinDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putMinDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get min date value 0000-01-01
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getMinDate() throws ServiceException {
        try {
            ServiceResponse<LocalDate> response = getMinDateDelegate(service.getMinDate(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<LocalDate> response = getMinDateDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get min date value 0000-01-01
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getMinDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        service.getMinDateAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getMinDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<LocalDate> getMinDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
