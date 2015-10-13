/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import java.io.InputStream;
import retrofit.http.GET;

/**
 * An instance of this class provides access to all the operations defined
 * in Files.
 */
public interface Files {
    /**
     * The interface defining all the services for Files to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FilesService {
        @GET("/files/stream/nonempty")
        Call<ResponseBody> getFile();

        @GET("/files/stream/empty")
        Call<ResponseBody> getEmptyFile();

    }
    /**
     *
     * @return the InputStream object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    InputStream getFile() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getFileAsync(final ServiceCallback<InputStream> serviceCallback);

    /**
     *
     * @return the InputStream object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    InputStream getEmptyFile() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getEmptyFileAsync(final ServiceCallback<InputStream> serviceCallback);

}
