// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import fixtures.bodycomplex.models.ArrayWrapper;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in Array.
 */
public interface Array {
    /**
     * The interface defining all the services for Array to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ArrayService {
        @GET("/complex/array/valid")
        Response getValid() throws ServiceException;

        @GET("/complex/array/valid")
        void getValidAsync(ServiceResponseCallback cb);

        @PUT("/complex/array/valid")
        Response putValid(@Body ArrayWrapper complexBody) throws ServiceException;

        @PUT("/complex/array/valid")
        void putValidAsync(@Body ArrayWrapper complexBody, ServiceResponseCallback cb);

        @GET("/complex/array/empty")
        Response getEmpty() throws ServiceException;

        @GET("/complex/array/empty")
        void getEmptyAsync(ServiceResponseCallback cb);

        @PUT("/complex/array/empty")
        Response putEmpty(@Body ArrayWrapper complexBody) throws ServiceException;

        @PUT("/complex/array/empty")
        void putEmptyAsync(@Body ArrayWrapper complexBody, ServiceResponseCallback cb);

        @GET("/complex/array/notprovided")
        Response getNotProvided() throws ServiceException;

        @GET("/complex/array/notprovided")
        void getNotProvidedAsync(ServiceResponseCallback cb);

    }
    /**
     * Get complex types with array property
     *
     * @return the ArrayWrapper object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ArrayWrapper getValid() throws ServiceException;

    /**
     * Get complex types with array property
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getValidAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

    /**
     * Put complex types with array property
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putValid(ArrayWrapper complexBody) throws ServiceException;

    /**
     * Put complex types with array property
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putValidAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get complex types with array property which is empty
     *
     * @return the ArrayWrapper object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ArrayWrapper getEmpty() throws ServiceException;

    /**
     * Get complex types with array property which is empty
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getEmptyAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

    /**
     * Put complex types with array property which is empty
     *
     * @param complexBody Please put an empty array
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putEmpty(ArrayWrapper complexBody) throws ServiceException;

    /**
     * Put complex types with array property which is empty
     *
     * @param complexBody Please put an empty array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putEmptyAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get complex types with array property while server doesn't provide a
     * response payload
     *
     * @return the ArrayWrapper object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ArrayWrapper getNotProvided() throws ServiceException;

    /**
     * Get complex types with array property while server doesn't provide a
     * response payload
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNotProvidedAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

}
