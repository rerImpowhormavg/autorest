/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionLocalOperations.
 */
public final class ApiVersionLocalOperationsImpl implements ApiVersionLocalOperations {
    /** The Retrofit service to perform REST calls. */
    private ApiVersionLocalService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClient client;

    /**
     * Initializes an instance of ApiVersionLocalOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ApiVersionLocalOperationsImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClient client) {
        this.service = retrofit.create(ApiVersionLocalService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiVersionLocalOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApiVersionLocalService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/apiVersion/method/string/none/query/local/2.0")
        Call<ResponseBody> getMethodLocalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/apiVersion/method/string/none/query/local/null")
        Call<ResponseBody> getMethodLocalNull(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/apiVersion/path/string/none/query/local/2.0")
        Call<ResponseBody> getPathLocalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/apiVersion/swagger/string/none/query/local/2.0")
        Call<ResponseBody> getSwaggerLocalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodLocalValid() throws ErrorException, IOException {
        final String apiVersion = "2.0";
        Call<ResponseBody> call = service.getMethodLocalValid(apiVersion, this.client.getAcceptLanguage());
        return getMethodLocalValidDelegate(call.execute());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getMethodLocalValidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        final String apiVersion = "2.0";
        Call<ResponseBody> call = service.getMethodLocalValid(apiVersion, this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getMethodLocalValidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> getMethodLocalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodLocalNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getMethodLocalNull(null, null);
        return getMethodLocalNullDelegate(call.execute());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getMethodLocalNullAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getMethodLocalNull(null, null);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getMethodLocalNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodLocalNull(String apiVersion) throws ErrorException, IOException {
        Call<ResponseBody> call = service.getMethodLocalNull(apiVersion, this.client.getAcceptLanguage());
        return getMethodLocalNullDelegate(call.execute());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getMethodLocalNullAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getMethodLocalNull(apiVersion, this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getMethodLocalNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> getMethodLocalNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getPathLocalValid() throws ErrorException, IOException {
        final String apiVersion = "2.0";
        Call<ResponseBody> call = service.getPathLocalValid(apiVersion, this.client.getAcceptLanguage());
        return getPathLocalValidDelegate(call.execute());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getPathLocalValidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        final String apiVersion = "2.0";
        Call<ResponseBody> call = service.getPathLocalValid(apiVersion, this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getPathLocalValidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> getPathLocalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getSwaggerLocalValid() throws ErrorException, IOException {
        final String apiVersion = "2.0";
        Call<ResponseBody> call = service.getSwaggerLocalValid(apiVersion, this.client.getAcceptLanguage());
        return getSwaggerLocalValidDelegate(call.execute());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSwaggerLocalValidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        final String apiVersion = "2.0";
        Call<ResponseBody> call = service.getSwaggerLocalValid(apiVersion, this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSwaggerLocalValidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> getSwaggerLocalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
