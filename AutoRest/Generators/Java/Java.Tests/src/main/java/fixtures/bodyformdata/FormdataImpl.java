/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyformdata;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodyformdata.models.Error;
import fixtures.bodyformdata.models.UploadFile;
import java.io.InputStream;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in Formdata.
 */
public class FormdataImpl implements Formdata {
    /** The Retrofit service to perform REST calls. */
    private FormdataService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATFormDataService client;

    /**
     * Initializes an instance of Formdata.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FormdataImpl(Retrofit retrofit, AutoRestSwaggerBATFormDataService client) {
        this.service = retrofit.create(FormdataService.class);
        this.client = client;
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the UploadFile object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<UploadFile> uploadFile(InputStream fileContent, String fileName) throws ServiceException, IOException, IllegalArgumentException {
        if (fileContent == null) {
            throw new IllegalArgumentException("Parameter fileContent is required and cannot be null.");
        }
        if (fileName == null) {
            throw new IllegalArgumentException("Parameter fileName is required and cannot be null.");
        }
        Call<ResponseBody> call = service.uploadFile(fileContent, fileName);
        return uploadFileDelegate(call.execute(), null);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> uploadFileAsync(InputStream fileContent, String fileName, final ServiceCallback<UploadFile> serviceCallback) {
        if (fileContent == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter fileContent is required and cannot be null."));
            return null;
        }
        if (fileName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter fileName is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.uploadFile(fileContent, fileName);
        call.enqueue(new ServiceResponseCallback<UploadFile>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(uploadFileDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<UploadFile> uploadFileDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<UploadFile>()
                .register(200, new TypeToken<UploadFile>() { }.getType())
                .registerError(new TypeToken<Error>() { }.getType())
                .build(response, retrofit);
    }

}
