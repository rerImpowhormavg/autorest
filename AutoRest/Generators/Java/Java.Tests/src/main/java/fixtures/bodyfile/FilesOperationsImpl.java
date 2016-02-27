/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodyfile.models.ErrorException;
import java.io.InputStream;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in FilesOperations.
 */
public final class FilesOperationsImpl implements FilesOperations {
    /** The Retrofit service to perform REST calls. */
    private FilesService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATFileService client;

    /**
     * Initializes an instance of FilesOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FilesOperationsImpl(Retrofit retrofit, AutoRestSwaggerBATFileService client) {
        this.service = retrofit.create(FilesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for FilesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FilesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("files/stream/nonempty")
        Call<ResponseBody> getFile();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("files/stream/empty")
        Call<ResponseBody> getEmptyFile();

    }

    /**
     * Get file.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<InputStream> getFile() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getFile();
        return getFileDelegate(call.execute());
    }

    /**
     * Get file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getFileAsync(final ServiceCallback<InputStream> serviceCallback) {
        Call<ResponseBody> call = service.getFile();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getFileDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<InputStream> getFileDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<InputStream, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get empty file.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<InputStream> getEmptyFile() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getEmptyFile();
        return getEmptyFileDelegate(call.execute());
    }

    /**
     * Get empty file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getEmptyFileAsync(final ServiceCallback<InputStream> serviceCallback) {
        Call<ResponseBody> call = service.getEmptyFile();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getEmptyFileDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<InputStream> getEmptyFileDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<InputStream, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
