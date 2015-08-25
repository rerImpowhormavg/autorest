/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import fixtures.bodyboolean.models.Error;

public class BoolImpl implements Bool {
    private BoolService service;
    AutoRestBoolTestService client;

    public BoolImpl(RestAdapter restAdapter, AutoRestBoolTestService client) {
        this.service = restAdapter.create(BoolService.class);
        this.client = client;
    }

    /**
     * Get true Boolean value
     *
     * @return the boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public boolean getTrue() throws ServiceException {
        try {
            ServiceResponse<Boolean> response = getTrueDelegate(service.getTrue(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Boolean> response = getTrueDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get true Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getTrueAsync(final ServiceCallback<Boolean> serviceCallback) {
        service.getTrueAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getTrueDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Boolean> getTrueDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Boolean>()
                .register(200, new TypeToken<Boolean>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Set Boolean value true
     *
     * @param boolBody the boolean value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putTrue(boolean boolBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putTrueDelegate(service.putTrue(boolBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putTrueDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Set Boolean value true
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putTrueAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback) {
        service.putTrueAsync(boolBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putTrueDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putTrueDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get false Boolean value
     *
     * @return the boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public boolean getFalse() throws ServiceException {
        try {
            ServiceResponse<Boolean> response = getFalseDelegate(service.getFalse(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Boolean> response = getFalseDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get false Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getFalseAsync(final ServiceCallback<Boolean> serviceCallback) {
        service.getFalseAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getFalseDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Boolean> getFalseDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Boolean>()
                .register(200, new TypeToken<Boolean>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Set Boolean value false
     *
     * @param boolBody the boolean value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putFalse(boolean boolBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putFalseDelegate(service.putFalse(boolBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putFalseDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Set Boolean value false
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putFalseAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback) {
        service.putFalseAsync(boolBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putFalseDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putFalseDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get null Boolean value
     *
     * @return the boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public boolean getNull() throws ServiceException {
        try {
            ServiceResponse<Boolean> response = getNullDelegate(service.getNull(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Boolean> response = getNullDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get null Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getNullAsync(final ServiceCallback<Boolean> serviceCallback) {
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

    private ServiceResponse<Boolean> getNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Boolean>()
                .register(200, new TypeToken<Boolean>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get invalid Boolean value
     *
     * @return the boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public boolean getInvalid() throws ServiceException {
        try {
            ServiceResponse<Boolean> response = getInvalidDelegate(service.getInvalid(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Boolean> response = getInvalidDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get invalid Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getInvalidAsync(final ServiceCallback<Boolean> serviceCallback) {
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

    private ServiceResponse<Boolean> getInvalidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Boolean>()
                .register(200, new TypeToken<Boolean>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
