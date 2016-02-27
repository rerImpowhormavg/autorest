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
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.microsoft.rest.ServiceResponseWithHeaders;
import fixtures.http.models.ErrorException;
import fixtures.http.models.HttpRedirectsDelete307Headers;
import fixtures.http.models.HttpRedirectsGet300Headers;
import fixtures.http.models.HttpRedirectsGet301Headers;
import fixtures.http.models.HttpRedirectsGet302Headers;
import fixtures.http.models.HttpRedirectsGet307Headers;
import fixtures.http.models.HttpRedirectsHead300Headers;
import fixtures.http.models.HttpRedirectsHead301Headers;
import fixtures.http.models.HttpRedirectsHead302Headers;
import fixtures.http.models.HttpRedirectsHead307Headers;
import fixtures.http.models.HttpRedirectsPatch302Headers;
import fixtures.http.models.HttpRedirectsPatch307Headers;
import fixtures.http.models.HttpRedirectsPost303Headers;
import fixtures.http.models.HttpRedirectsPost307Headers;
import fixtures.http.models.HttpRedirectsPut301Headers;
import fixtures.http.models.HttpRedirectsPut307Headers;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpRedirectsOperations.
 */
public final class HttpRedirectsOperationsImpl implements HttpRedirectsOperations {
    /** The Retrofit service to perform REST calls. */
    private HttpRedirectsService service;
    /** The service client containing this operation class. */
    private AutoRestHttpInfrastructureTestService client;

    /**
     * Initializes an instance of HttpRedirectsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HttpRedirectsOperationsImpl(Retrofit retrofit, AutoRestHttpInfrastructureTestService client) {
        this.service = retrofit.create(HttpRedirectsService.class);
        this.client = client;
    }

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsHead300Headers> head300() throws ErrorException, IOException {
        Call<Void> call = service.head300();
        return head300Delegate(call.execute());
    }

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head300Async(final ServiceCallback<Void> serviceCallback) {
        Call<Void> call = service.head300();
        call.enqueue(new ServiceResponseEmptyCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(head300Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsHead300Headers> head300Delegate(Response<Void> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(300, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildEmptyWithHeaders(response, HttpRedirectsHead300Headers.class);
    }

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;String&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<List<String>, HttpRedirectsGet300Headers> get300() throws ErrorException, IOException {
        Call<ResponseBody> call = service.get300();
        return get300Delegate(call.execute());
    }

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> get300Async(final ServiceCallback<List<String>> serviceCallback) {
        Call<ResponseBody> call = service.get300();
        call.enqueue(new ServiceResponseCallback<List<String>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(get300Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<List<String>, HttpRedirectsGet300Headers> get300Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<List<String>, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(300, new TypeToken<List<String>>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsGet300Headers.class);
    }

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsHead301Headers> head301() throws ErrorException, IOException {
        Call<Void> call = service.head301();
        return head301Delegate(call.execute());
    }

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head301Async(final ServiceCallback<Void> serviceCallback) {
        Call<Void> call = service.head301();
        call.enqueue(new ServiceResponseEmptyCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(head301Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsHead301Headers> head301Delegate(Response<Void> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(301, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildEmptyWithHeaders(response, HttpRedirectsHead301Headers.class);
    }

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsGet301Headers> get301() throws ErrorException, IOException {
        Call<ResponseBody> call = service.get301();
        return get301Delegate(call.execute());
    }

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> get301Async(final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.get301();
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(get301Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsGet301Headers> get301Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(301, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsGet301Headers.class);
    }

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsPut301Headers> put301(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.put301(booleanValue);
        return put301Delegate(call.execute());
    }

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> put301Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.put301(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(put301Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsPut301Headers> put301Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(301, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsPut301Headers.class);
    }

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsHead302Headers> head302() throws ErrorException, IOException {
        Call<Void> call = service.head302();
        return head302Delegate(call.execute());
    }

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head302Async(final ServiceCallback<Void> serviceCallback) {
        Call<Void> call = service.head302();
        call.enqueue(new ServiceResponseEmptyCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(head302Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsHead302Headers> head302Delegate(Response<Void> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(302, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildEmptyWithHeaders(response, HttpRedirectsHead302Headers.class);
    }

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsGet302Headers> get302() throws ErrorException, IOException {
        Call<ResponseBody> call = service.get302();
        return get302Delegate(call.execute());
    }

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> get302Async(final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.get302();
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(get302Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsGet302Headers> get302Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(302, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsGet302Headers.class);
    }

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsPatch302Headers> patch302(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.patch302(booleanValue);
        return patch302Delegate(call.execute());
    }

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> patch302Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.patch302(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(patch302Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsPatch302Headers> patch302Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(302, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsPatch302Headers.class);
    }

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsPost303Headers> post303(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.post303(booleanValue);
        return post303Delegate(call.execute());
    }

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> post303Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.post303(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(post303Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsPost303Headers> post303Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(303, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsPost303Headers.class);
    }

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsHead307Headers> head307() throws ErrorException, IOException {
        Call<Void> call = service.head307();
        return head307Delegate(call.execute());
    }

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head307Async(final ServiceCallback<Void> serviceCallback) {
        Call<Void> call = service.head307();
        call.enqueue(new ServiceResponseEmptyCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(head307Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsHead307Headers> head307Delegate(Response<Void> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(307, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildEmptyWithHeaders(response, HttpRedirectsHead307Headers.class);
    }

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsGet307Headers> get307() throws ErrorException, IOException {
        Call<ResponseBody> call = service.get307();
        return get307Delegate(call.execute());
    }

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> get307Async(final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.get307();
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(get307Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsGet307Headers> get307Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(307, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsGet307Headers.class);
    }

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsPut307Headers> put307(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.put307(booleanValue);
        return put307Delegate(call.execute());
    }

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> put307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.put307(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(put307Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsPut307Headers> put307Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(307, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsPut307Headers.class);
    }

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsPatch307Headers> patch307(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.patch307(booleanValue);
        return patch307Delegate(call.execute());
    }

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> patch307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.patch307(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(patch307Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsPatch307Headers> patch307Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(307, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsPatch307Headers.class);
    }

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsPost307Headers> post307(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.post307(booleanValue);
        return post307Delegate(call.execute());
    }

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> post307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.post307(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(post307Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsPost307Headers> post307Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(307, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsPost307Headers.class);
    }

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HttpRedirectsDelete307Headers> delete307(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.delete307(booleanValue);
        return delete307Delegate(call.execute());
    }

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> delete307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.delete307(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(delete307Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HttpRedirectsDelete307Headers> delete307Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(307, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HttpRedirectsDelete307Headers.class);
    }

}
