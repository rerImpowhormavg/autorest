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

public class HttpSuccessImpl implements HttpSuccess {
    private HttpSuccessService service;
    AutoRestHttpInfrastructureTestService client;

    public HttpSuccessImpl(RestAdapter restAdapter, AutoRestHttpInfrastructureTestService client) {
        this.service = restAdapter.create(HttpSuccessService.class);
        this.client = client;
    }

    /**
     * Return 200 status code if successful
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void head200() throws ServiceException {
        try {
            ServiceResponse<Void> response = head200Delegate(service.head200(), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = head200Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 200 status code if successful
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void head200Async(final ServiceCallback<Void> serviceCallback) {
        service.head200Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(head200Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> head200Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get 200 success
     *
     * @return the boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public boolean get200() throws ServiceException {
        try {
            ServiceResponse<Boolean> response = get200Delegate(service.get200(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Boolean> response = get200Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get 200 success
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void get200Async(final ServiceCallback<Boolean> serviceCallback) {
        service.get200Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(get200Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Boolean> get200Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Boolean>()
                .register(200, new TypeToken<Boolean>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put boolean value true returning 200 success
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void put200(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = put200Delegate(service.put200(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = put200Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put boolean value true returning 200 success
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void put200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.put200Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(put200Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> put200Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Patch true Boolean value in request returning 200
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void patch200(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = patch200Delegate(service.patch200(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = patch200Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Patch true Boolean value in request returning 200
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void patch200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.patch200Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(patch200Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> patch200Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Post bollean value true in request that returns a 200
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void post200(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = post200Delegate(service.post200(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = post200Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Post bollean value true in request that returns a 200
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void post200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.post200Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(post200Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> post200Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Delete simple boolean value true returns 200
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void delete200(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = delete200Delegate(service.delete200(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = delete200Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Delete simple boolean value true returns 200
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void delete200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.delete200Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(delete200Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> delete200Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put true Boolean value in request returns 201
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void put201(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = put201Delegate(service.put201(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = put201Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put true Boolean value in request returns 201
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void put201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.put201Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(put201Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> put201Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(201, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Post true Boolean value in request returns 201 (Created)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void post201(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = post201Delegate(service.post201(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = post201Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Post true Boolean value in request returns 201 (Created)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void post201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.post201Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(post201Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> post201Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(201, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put true Boolean value in request returns 202 (Accepted)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void put202(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = put202Delegate(service.put202(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = put202Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put true Boolean value in request returns 202 (Accepted)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void put202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.put202Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(put202Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> put202Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(202, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Patch true Boolean value in request returns 202
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void patch202(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = patch202Delegate(service.patch202(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = patch202Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Patch true Boolean value in request returns 202
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void patch202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.patch202Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(patch202Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> patch202Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(202, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Post true Boolean value in request returns 202 (Accepted)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void post202(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = post202Delegate(service.post202(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = post202Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Post true Boolean value in request returns 202 (Accepted)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void post202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.post202Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(post202Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> post202Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(202, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Delete true Boolean value in request returns 202 (accepted)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void delete202(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = delete202Delegate(service.delete202(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = delete202Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Delete true Boolean value in request returns 202 (accepted)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void delete202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.delete202Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(delete202Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> delete202Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(202, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Return 204 status code if successful
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void head204() throws ServiceException {
        try {
            ServiceResponse<Void> response = head204Delegate(service.head204(), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = head204Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 204 status code if successful
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void head204Async(final ServiceCallback<Void> serviceCallback) {
        service.head204Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(head204Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> head204Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(204, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void put204(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = put204Delegate(service.put204(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = put204Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void put204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.put204Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(put204Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> put204Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(204, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Patch true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void patch204(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = patch204Delegate(service.patch204(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = patch204Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Patch true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void patch204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.patch204Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(patch204Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> patch204Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(204, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Post true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void post204(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = post204Delegate(service.post204(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = post204Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Post true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void post204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.post204Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(post204Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> post204Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(204, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Delete true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void delete204(Boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Void> response = delete204Delegate(service.delete204(booleanValue), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = delete204Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Delete true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void delete204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        service.delete204Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(delete204Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> delete204Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(204, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Return 404 status code
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void head404() throws ServiceException {
        try {
            ServiceResponse<Void> response = head404Delegate(service.head404(), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = head404Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Return 404 status code
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void head404Async(final ServiceCallback<Void> serviceCallback) {
        service.head404Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(head404Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> head404Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(204, new TypeToken<Void>(){}.getType())
                .register(404, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
