/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.head;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import retrofit.http.HEAD;
import retrofit.http.Header;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpSuccess.
 */
public interface HttpSuccess {
    /**
     * The interface defining all the services for HttpSuccess to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpSuccessService {
        @HEAD("/http/success/204")
        Call<Void> head204(@Header("accept-language") String acceptLanguage);

        @HEAD("/http/success/404")
        Call<Void> head404(@Header("accept-language") String acceptLanguage);

    }
    /**
     * Return 204 status code if successful
     *
     * @return the Boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Boolean head204() throws ServiceException;

    /**
     * Return 204 status code if successful
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head204Async(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Return 404 status code if successful
     *
     * @return the Boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Boolean head404() throws ServiceException;

    /**
     * Return 404 status code if successful
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head404Async(final ServiceCallback<Boolean> serviceCallback);

}
