/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import retrofit2.Retrofit;
import fixtures.bodycomplex.Arrays;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import fixtures.bodycomplex.models.ArrayWrapper;
import fixtures.bodycomplex.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;

/**
 * An instance of this class provides access to all the operations defined
 * in Arrays.
 */
public final class ArraysImpl implements Arrays {
    /** The Retrofit service to perform REST calls. */
    private ArraysService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Arrays.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ArraysImpl(Retrofit retrofit, AutoRestComplexTestServiceImpl client) {
        this.service = retrofit.create(ArraysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Arrays to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ArraysService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/array/valid")
        Call<ResponseBody> getValid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/array/valid")
        Call<ResponseBody> putValid(@Body ArrayWrapper complexBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/array/empty")
        Call<ResponseBody> getEmpty();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/array/empty")
        Call<ResponseBody> putEmpty(@Body ArrayWrapper complexBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/array/notprovided")
        Call<ResponseBody> getNotProvided();

    }

    /**
     * Get complex types with array property.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ArrayWrapper> getValid() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getValid();
        return getValidDelegate(call.execute());
    }

    /**
     * Get complex types with array property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getValidAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        Call<ResponseBody> call = service.getValid();
        final ServiceCall<ServiceResponse<ArrayWrapper>> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<ArrayWrapper>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<ArrayWrapper> clientResponse = getValidDelegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<ArrayWrapper> getValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<ArrayWrapper, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ArrayWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putValid(ArrayWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        Call<ResponseBody> call = service.putValid(complexBody);
        return putValidDelegate(call.execute());
    }

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall putValidAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        Call<ResponseBody> call = service.putValid(complexBody);
        final ServiceCall<ServiceResponse<Void>> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Void> clientResponse = putValidDelegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types with array property which is empty.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ArrayWrapper> getEmpty() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getEmpty();
        return getEmptyDelegate(call.execute());
    }

    /**
     * Get complex types with array property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getEmptyAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        Call<ResponseBody> call = service.getEmpty();
        final ServiceCall<ServiceResponse<ArrayWrapper>> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<ArrayWrapper>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<ArrayWrapper> clientResponse = getEmptyDelegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<ArrayWrapper> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<ArrayWrapper, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ArrayWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putEmpty(ArrayWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        Call<ResponseBody> call = service.putEmpty(complexBody);
        return putEmptyDelegate(call.execute());
    }

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall putEmptyAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        Call<ResponseBody> call = service.putEmpty(complexBody);
        final ServiceCall<ServiceResponse<Void>> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Void> clientResponse = putEmptyDelegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ArrayWrapper> getNotProvided() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNotProvided();
        return getNotProvidedDelegate(call.execute());
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getNotProvidedAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        Call<ResponseBody> call = service.getNotProvided();
        final ServiceCall<ServiceResponse<ArrayWrapper>> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<ArrayWrapper>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<ArrayWrapper> clientResponse = getNotProvidedDelegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<ArrayWrapper> getNotProvidedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<ArrayWrapper, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ArrayWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
