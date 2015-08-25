/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import fixtures.http.models.Error;

public class HttpRetryImpl implements HttpRetry {
    private HttpRetryService service;

    public HttpRetryImpl(RestAdapter restAdapter) {
        service = restAdapter.create(HttpRetryService.class);
    }

    /**
     * Return 408 status code, then 200 after retry
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void head408() throws ServiceException {
        try {
            ServiceResponse<Void> response = head408Delegate(service.head408(), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = head408Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 408 status code, then 200 after retry
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void head408Async(final ServiceCallback<Void> serviceCallback) {
        service.head408Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(head408Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> head408Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Return 500 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void put500(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = put500Delegate(service.put500(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = put500Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 500 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void put500Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.put500Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(put500Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> put500Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Return 500 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void patch500(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = patch500Delegate(service.patch500(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = patch500Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 500 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void patch500Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.patch500Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(patch500Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> patch500Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Return 502 status code, then 200 after retry
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void get502() throws ServiceException {
        try {
            ServiceResponse<Void> response = get502Delegate(service.get502(), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = get502Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 502 status code, then 200 after retry
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void get502Async(final ServiceCallback<Void> serviceCallback) {
        service.get502Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(get502Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> get502Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Return 503 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void post503(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = post503Delegate(service.post503(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = post503Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 503 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void post503Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.post503Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(post503Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> post503Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Return 503 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void delete503(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = delete503Delegate(service.delete503(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = delete503Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 503 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void delete503Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.delete503Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(delete503Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> delete503Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Return 504 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void put504(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = put504Delegate(service.put504(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = put504Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 504 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void put504Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.put504Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(put504Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> put504Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Return 504 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void patch504(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = patch504Delegate(service.patch504(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = patch504Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 504 status code, then 200 after retry
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void patch504Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.patch504Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(patch504Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> patch504Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
