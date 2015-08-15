/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import fixtures.bodycomplex.models.DictionaryWrapper;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in Dictionary.
 */
public interface Dictionary {
    /**
     * The interface defining all the services for Dictionary to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DictionaryService {
        @GET("/complex/dictionary/typed/valid")
        Response getValid() throws ServiceException;

        @GET("/complex/dictionary/typed/valid")
        void getValidAsync(ServiceResponseCallback cb);

        @PUT("/complex/dictionary/typed/valid")
        Response putValid(@Body DictionaryWrapper complexBody) throws ServiceException;

        @PUT("/complex/dictionary/typed/valid")
        void putValidAsync(@Body DictionaryWrapper complexBody, ServiceResponseCallback cb);

        @GET("/complex/dictionary/typed/empty")
        Response getEmpty() throws ServiceException;

        @GET("/complex/dictionary/typed/empty")
        void getEmptyAsync(ServiceResponseCallback cb);

        @PUT("/complex/dictionary/typed/empty")
        Response putEmpty(@Body DictionaryWrapper complexBody) throws ServiceException;

        @PUT("/complex/dictionary/typed/empty")
        void putEmptyAsync(@Body DictionaryWrapper complexBody, ServiceResponseCallback cb);

        @GET("/complex/dictionary/typed/null")
        Response getNull() throws ServiceException;

        @GET("/complex/dictionary/typed/null")
        void getNullAsync(ServiceResponseCallback cb);

        @GET("/complex/dictionary/typed/notprovided")
        Response getNotProvided() throws ServiceException;

        @GET("/complex/dictionary/typed/notprovided")
        void getNotProvidedAsync(ServiceResponseCallback cb);

    }
    /**
     * Get complex types with dictionary property
     *
     * @return the DictionaryWrapper object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DictionaryWrapper getValid() throws ServiceException;

    /**
     * Get complex types with dictionary property
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getValidAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

    /**
     * Put complex types with dictionary property
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putValid(DictionaryWrapper complexBody) throws ServiceException;

    /**
     * Put complex types with dictionary property
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putValidAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get complex types with dictionary property which is empty
     *
     * @return the DictionaryWrapper object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DictionaryWrapper getEmpty() throws ServiceException;

    /**
     * Get complex types with dictionary property which is empty
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getEmptyAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

    /**
     * Put complex types with dictionary property which is empty
     *
     * @param complexBody Please put an empty dictionary
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putEmpty(DictionaryWrapper complexBody) throws ServiceException;

    /**
     * Put complex types with dictionary property which is empty
     *
     * @param complexBody Please put an empty dictionary
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putEmptyAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get complex types with dictionary property which is null
     *
     * @return the DictionaryWrapper object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DictionaryWrapper getNull() throws ServiceException;

    /**
     * Get complex types with dictionary property which is null
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNullAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

    /**
     * Get complex types with dictionary property while server doesn't provide
     * a response payload
     *
     * @return the DictionaryWrapper object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    DictionaryWrapper getNotProvided() throws ServiceException;

    /**
     * Get complex types with dictionary property while server doesn't provide
     * a response payload
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNotProvidedAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

}
