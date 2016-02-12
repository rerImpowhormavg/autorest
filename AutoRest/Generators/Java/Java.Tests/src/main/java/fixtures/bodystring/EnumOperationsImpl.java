/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodystring.models.Colors;
import fixtures.bodystring.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in EnumOperations.
 */
public final class EnumOperationsImpl implements EnumOperations {
    /** The Retrofit service to perform REST calls. */
    private EnumService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATService client;

    /**
     * Initializes an instance of EnumOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EnumOperationsImpl(Retrofit retrofit, AutoRestSwaggerBATService client) {
        this.service = retrofit.create(EnumService.class);
        this.client = client;
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Colors object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Colors> getNotExpandable() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNotExpandable();
        return getNotExpandableDelegate(call.execute());
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getNotExpandableAsync(final ServiceCallback<Colors> serviceCallback) {
        Call<ResponseBody> call = service.getNotExpandable();
        call.enqueue(new ServiceResponseCallback<Colors>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getNotExpandableDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Colors> getNotExpandableDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Colors, ErrorException>()
                .register(200, new TypeToken<Colors>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putNotExpandable(Colors stringBody) throws ErrorException, IOException, IllegalArgumentException {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putNotExpandable(stringBody);
        return putNotExpandableDelegate(call.execute());
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putNotExpandableAsync(Colors stringBody, final ServiceCallback<Void> serviceCallback) {
        if (stringBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter stringBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putNotExpandable(stringBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putNotExpandableDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putNotExpandableDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
