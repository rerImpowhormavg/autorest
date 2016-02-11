/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import fixtures.http.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpSuccessOperations.
 */
public final class HttpSuccessOperationsImpl implements HttpSuccessOperations {
    /** The Retrofit service to perform REST calls. */
    private HttpSuccessService service;
    /** The service client containing this operation class. */
    private AutoRestHttpInfrastructureTestService client;

    /**
     * Initializes an instance of HttpSuccessOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HttpSuccessOperationsImpl(Retrofit retrofit, AutoRestHttpInfrastructureTestService client) {
        this.service = retrofit.create(HttpSuccessService.class);
        this.client = client;
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> head200() throws ErrorException, IOException {
        Call<Void> call = service.head200();
        return head200Delegate(call.execute());
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head200Async(final ServiceCallback<Void> serviceCallback) {
        Call<Void> call = service.head200();
        call.enqueue(new ServiceResponseEmptyCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(head200Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> head200Delegate(Response<Void> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildEmpty(response);
    }

    /**
     * Get 200 success.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> get200() throws ErrorException, IOException {
        Call<ResponseBody> call = service.get200();
        return get200Delegate(call.execute());
    }

    /**
     * Get 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> get200Async(final ServiceCallback<Boolean> serviceCallback) {
        Call<ResponseBody> call = service.get200();
        call.enqueue(new ServiceResponseCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(get200Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> get200Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Boolean, ErrorException>()
                .register(200, new TypeToken<Boolean>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put boolean value true returning 200 success.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> put200(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.put200(booleanValue);
        return put200Delegate(call.execute());
    }

    /**
     * Put boolean value true returning 200 success.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> put200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.put200(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(put200Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> put200Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> patch200(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.patch200(booleanValue);
        return patch200Delegate(call.execute());
    }

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> patch200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.patch200(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(patch200Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> patch200Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> post200(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.post200(booleanValue);
        return post200Delegate(call.execute());
    }

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> post200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.post200(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(post200Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> post200Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Delete simple boolean value true returns 200.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> delete200(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.delete200(booleanValue);
        return delete200Delegate(call.execute());
    }

    /**
     * Delete simple boolean value true returns 200.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> delete200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.delete200(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(delete200Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> delete200Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put true Boolean value in request returns 201.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> put201(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.put201(booleanValue);
        return put201Delegate(call.execute());
    }

    /**
     * Put true Boolean value in request returns 201.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> put201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.put201(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(put201Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> put201Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(201, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> post201(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.post201(booleanValue);
        return post201Delegate(call.execute());
    }

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> post201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.post201(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(post201Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> post201Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(201, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> put202(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.put202(booleanValue);
        return put202Delegate(call.execute());
    }

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> put202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.put202(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(put202Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> put202Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> patch202(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.patch202(booleanValue);
        return patch202Delegate(call.execute());
    }

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> patch202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.patch202(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(patch202Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> patch202Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> post202(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.post202(booleanValue);
        return post202Delegate(call.execute());
    }

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> post202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.post202(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(post202Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> post202Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> delete202(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.delete202(booleanValue);
        return delete202Delegate(call.execute());
    }

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> delete202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.delete202(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(delete202Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> delete202Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> head204() throws ErrorException, IOException {
        Call<Void> call = service.head204();
        return head204Delegate(call.execute());
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head204Async(final ServiceCallback<Void> serviceCallback) {
        Call<Void> call = service.head204();
        call.enqueue(new ServiceResponseEmptyCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(head204Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> head204Delegate(Response<Void> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildEmpty(response);
    }

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> put204(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.put204(booleanValue);
        return put204Delegate(call.execute());
    }

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> put204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.put204(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(put204Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> put204Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> patch204(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.patch204(booleanValue);
        return patch204Delegate(call.execute());
    }

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> patch204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.patch204(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(patch204Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> patch204Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> post204(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.post204(booleanValue);
        return post204Delegate(call.execute());
    }

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> post204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.post204(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(post204Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> post204Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> delete204(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.delete204(booleanValue);
        return delete204Delegate(call.execute());
    }

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> delete204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.delete204(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(delete204Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> delete204Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Return 404 status code.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> head404() throws ErrorException, IOException {
        Call<Void> call = service.head404();
        return head404Delegate(call.execute());
    }

    /**
     * Return 404 status code.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head404Async(final ServiceCallback<Void> serviceCallback) {
        Call<Void> call = service.head404();
        call.enqueue(new ServiceResponseEmptyCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(head404Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> head404Delegate(Response<Void> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(204, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildEmpty(response);
    }

}
