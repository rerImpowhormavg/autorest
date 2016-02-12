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
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
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
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodLocalValid(String apiVersion) throws ErrorException, IOException, IllegalArgumentException {
        if (apiVersion == null) {
            throw new IllegalArgumentException("Parameter apiVersion is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getMethodLocalValid(apiVersion, this.client.getAcceptLanguage());
        return getMethodLocalValidDelegate(call.execute());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMethodLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        if (apiVersion == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter apiVersion is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getMethodLocalValid(apiVersion, this.client.getAcceptLanguage());
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
        return call;
    }

    private ServiceResponse<Void> getMethodLocalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
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
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMethodLocalNullAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.getMethodLocalNull(apiVersion, this.client.getAcceptLanguage());
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
        return call;
    }

    private ServiceResponse<Void> getMethodLocalNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getPathLocalValid(String apiVersion) throws ErrorException, IOException, IllegalArgumentException {
        if (apiVersion == null) {
            throw new IllegalArgumentException("Parameter apiVersion is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getPathLocalValid(apiVersion, this.client.getAcceptLanguage());
        return getPathLocalValidDelegate(call.execute());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getPathLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        if (apiVersion == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter apiVersion is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getPathLocalValid(apiVersion, this.client.getAcceptLanguage());
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
        return call;
    }

    private ServiceResponse<Void> getPathLocalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion The api version, which appears in the query, the value is always '2.0'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getSwaggerLocalValid(String apiVersion) throws ErrorException, IOException, IllegalArgumentException {
        if (apiVersion == null) {
            throw new IllegalArgumentException("Parameter apiVersion is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSwaggerLocalValid(apiVersion, this.client.getAcceptLanguage());
        return getSwaggerLocalValidDelegate(call.execute());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion The api version, which appears in the query, the value is always '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getSwaggerLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        if (apiVersion == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter apiVersion is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSwaggerLocalValid(apiVersion, this.client.getAcceptLanguage());
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
        return call;
    }

    private ServiceResponse<Void> getSwaggerLocalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
