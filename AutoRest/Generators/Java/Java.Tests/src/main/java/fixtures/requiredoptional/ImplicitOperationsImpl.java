/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.requiredoptional.models.Error;
import fixtures.requiredoptional.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in ImplicitOperations.
 */
public final class ImplicitOperationsImpl implements ImplicitOperations {
    /** The Retrofit service to perform REST calls. */
    private ImplicitService service;
    /** The service client containing this operation class. */
    private AutoRestRequiredOptionalTestService client;

    /**
     * Initializes an instance of ImplicitOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ImplicitOperationsImpl(Retrofit retrofit, AutoRestRequiredOptionalTestService client) {
        this.service = retrofit.create(ImplicitService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ImplicitOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ImplicitService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("reqopt/implicit/required/path/{pathParameter}")
        Call<ResponseBody> getRequiredPath(@Path("pathParameter") String pathParameter);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("reqopt/implicit/optional/query")
        Call<ResponseBody> putOptionalQuery(@Query("queryParameter") String queryParameter);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("reqopt/implicit/optional/header")
        Call<ResponseBody> putOptionalHeader(@Header("queryParameter") String queryParameter);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("reqopt/implicit/optional/body")
        Call<ResponseBody> putOptionalBody(@Body String bodyParameter);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("reqopt/global/required/path/{required-global-path}")
        Call<ResponseBody> getRequiredGlobalPath(@Path("required-global-path") String requiredGlobalPath);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("reqopt/global/required/query")
        Call<ResponseBody> getRequiredGlobalQuery(@Query("required-global-query") String requiredGlobalQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("reqopt/global/optional/query")
        Call<ResponseBody> getOptionalGlobalQuery(@Query("optional-global-query") Integer optionalGlobalQuery);

    }

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Error> getRequiredPath(String pathParameter) throws ErrorException, IOException, IllegalArgumentException {
        if (pathParameter == null) {
            throw new IllegalArgumentException("Parameter pathParameter is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getRequiredPath(pathParameter);
        return getRequiredPathDelegate(call.execute());
    }

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getRequiredPathAsync(String pathParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (pathParameter == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter pathParameter is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getRequiredPath(pathParameter);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Error>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getRequiredPathDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Error> getRequiredPathDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Error, ErrorException>()
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putOptionalQuery(String queryParameter) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putOptionalQuery(queryParameter);
        return putOptionalQueryDelegate(call.execute());
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putOptionalQueryAsync(String queryParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.putOptionalQuery(queryParameter);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putOptionalQueryDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putOptionalQueryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putOptionalHeader(String queryParameter) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putOptionalHeader(queryParameter);
        return putOptionalHeaderDelegate(call.execute());
    }

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putOptionalHeaderAsync(String queryParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.putOptionalHeader(queryParameter);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putOptionalHeaderDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putOptionalHeaderDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putOptionalBody(String bodyParameter) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putOptionalBody(bodyParameter);
        return putOptionalBodyDelegate(call.execute());
    }

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putOptionalBodyAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.putOptionalBody(bodyParameter);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putOptionalBodyDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putOptionalBodyDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly required path parameter.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Error> getRequiredGlobalPath() throws ErrorException, IOException, IllegalArgumentException {
        if (this.client.getRequiredGlobalPath() == null) {
            throw new IllegalArgumentException("Parameter this.client.getRequiredGlobalPath() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getRequiredGlobalPath(this.client.getRequiredGlobalPath());
        return getRequiredGlobalPathDelegate(call.execute());
    }

    /**
     * Test implicitly required path parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getRequiredGlobalPathAsync(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.getRequiredGlobalPath() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getRequiredGlobalPath() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getRequiredGlobalPath(this.client.getRequiredGlobalPath());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Error>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getRequiredGlobalPathDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Error> getRequiredGlobalPathDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Error, ErrorException>()
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly required query parameter.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Error> getRequiredGlobalQuery() throws ErrorException, IOException, IllegalArgumentException {
        if (this.client.getRequiredGlobalQuery() == null) {
            throw new IllegalArgumentException("Parameter this.client.getRequiredGlobalQuery() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getRequiredGlobalQuery(this.client.getRequiredGlobalQuery());
        return getRequiredGlobalQueryDelegate(call.execute());
    }

    /**
     * Test implicitly required query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getRequiredGlobalQueryAsync(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.getRequiredGlobalQuery() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getRequiredGlobalQuery() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getRequiredGlobalQuery(this.client.getRequiredGlobalQuery());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Error>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getRequiredGlobalQueryDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Error> getRequiredGlobalQueryDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Error, ErrorException>()
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Error> getOptionalGlobalQuery() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getOptionalGlobalQuery(this.client.getOptionalGlobalQuery());
        return getOptionalGlobalQueryDelegate(call.execute());
    }

    /**
     * Test implicitly optional query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getOptionalGlobalQueryAsync(final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getOptionalGlobalQuery(this.client.getOptionalGlobalQuery());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Error>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getOptionalGlobalQueryDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Error> getOptionalGlobalQueryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Error, ErrorException>()
                .registerError(ErrorException.class)
                .build(response);
    }

}
