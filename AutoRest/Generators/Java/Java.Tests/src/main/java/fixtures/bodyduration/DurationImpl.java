/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import org.joda.time.Period;
import fixtures.bodyduration.models.Error;

public class DurationImpl implements Duration {
    private DurationService service;
    AutoRestDurationTestService client;

    public DurationImpl(RestAdapter restAdapter, AutoRestDurationTestService client) {
        this.service = restAdapter.create(DurationService.class);
        this.client = client;
    }

    /**
     * Get null duration value
     *
     * @return the Period object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Period getNull() throws ServiceException {
        try {
            ServiceResponse<Period> response = getNullDelegate(service.getNull(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Period> response = getNullDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get null duration value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getNullAsync(final ServiceCallback<Period> serviceCallback) {
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

    private ServiceResponse<Period> getNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Period>()
                .register(200, new TypeToken<Period>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put a positive duration value
     *
     * @param durationBody the Period value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putPositiveDuration(Period durationBody) throws ServiceException {
        if (durationBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter durationBody is required and cannot be null."));
        }
        try {
            ServiceResponse<Void> response = putPositiveDurationDelegate(service.putPositiveDuration(durationBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putPositiveDurationDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put a positive duration value
     *
     * @param durationBody the Period value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putPositiveDurationAsync(Period durationBody, final ServiceCallback<Void> serviceCallback) {
        if (durationBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter durationBody is required and cannot be null.")));
        }
        service.putPositiveDurationAsync(durationBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putPositiveDurationDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putPositiveDurationDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get a positive duration value
     *
     * @return the Period object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Period getPositiveDuration() throws ServiceException {
        try {
            ServiceResponse<Period> response = getPositiveDurationDelegate(service.getPositiveDuration(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Period> response = getPositiveDurationDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get a positive duration value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getPositiveDurationAsync(final ServiceCallback<Period> serviceCallback) {
        service.getPositiveDurationAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getPositiveDurationDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Period> getPositiveDurationDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Period>()
                .register(200, new TypeToken<Period>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get an invalid duration value
     *
     * @return the Period object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Period getInvalid() throws ServiceException {
        try {
            ServiceResponse<Period> response = getInvalidDelegate(service.getInvalid(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Period> response = getInvalidDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get an invalid duration value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getInvalidAsync(final ServiceCallback<Period> serviceCallback) {
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

    private ServiceResponse<Period> getInvalidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Period>()
                .register(200, new TypeToken<Period>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
