/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodyboolean.models.ErrorException;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in BoolOperations.
 */
public final class BoolOperationsImpl implements BoolOperations {
    /** The Retrofit service to perform REST calls. */
    private BoolService service;
    /** The service client containing this operation class. */
    private AutoRestBoolTestService client;

    /**
     * Initializes an instance of BoolOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BoolOperationsImpl(Retrofit retrofit, AutoRestBoolTestService client) {
        this.service = retrofit.create(BoolService.class);
        this.client = client;
    }

    /**
     * Get true Boolean value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> getTrue() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getTrue();
        return getTrueDelegate(call.execute(), null);
    }

    /**
     * Get true Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getTrueAsync(final ServiceCallback<Boolean> serviceCallback) {
        Call<ResponseBody> call = service.getTrue();
        call.enqueue(new ServiceResponseCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getTrueDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> getTrueDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Boolean, ErrorException>()
                .register(200, new TypeToken<Boolean>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putTrue(boolean boolBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putTrue(boolBody);
        return putTrueDelegate(call.execute(), null);
    }

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putTrueAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putTrue(boolBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putTrueDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putTrueDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Get false Boolean value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> getFalse() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getFalse();
        return getFalseDelegate(call.execute(), null);
    }

    /**
     * Get false Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getFalseAsync(final ServiceCallback<Boolean> serviceCallback) {
        Call<ResponseBody> call = service.getFalse();
        call.enqueue(new ServiceResponseCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getFalseDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> getFalseDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Boolean, ErrorException>()
                .register(200, new TypeToken<Boolean>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putFalse(boolean boolBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putFalse(boolBody);
        return putFalseDelegate(call.execute(), null);
    }

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putFalseAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putFalse(boolBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putFalseDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putFalseDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Get null Boolean value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute(), null);
    }

    /**
     * Get null Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getNullAsync(final ServiceCallback<Boolean> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        call.enqueue(new ServiceResponseCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNullDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> getNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Boolean, ErrorException>()
                .register(200, new TypeToken<Boolean>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Get invalid Boolean value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> getInvalid() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getInvalid();
        return getInvalidDelegate(call.execute(), null);
    }

    /**
     * Get invalid Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getInvalidAsync(final ServiceCallback<Boolean> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        call.enqueue(new ServiceResponseCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getInvalidDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> getInvalidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Boolean, ErrorException>()
                .register(200, new TypeToken<Boolean>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

}
