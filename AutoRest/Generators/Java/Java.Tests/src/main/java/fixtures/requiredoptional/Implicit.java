/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import fixtures.requiredoptional.models.Error;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Header;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in Implicit.
 */
public interface Implicit {
    /**
     * The interface defining all the services for Implicit to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ImplicitService {
        @GET("/reqopt/implicit/required/path/{pathParameter}")
        Response getRequiredPath(@Path("pathParameter") String pathParameter) throws ServiceException;

        @GET("/reqopt/implicit/required/path/{pathParameter}")
        void getRequiredPathAsync(@Path("pathParameter") String pathParameter, ServiceResponseCallback cb);

        @PUT("/reqopt/implicit/optional/query")
        Response putOptionalQuery(@Query("queryParameter") String queryParameter) throws ServiceException;

        @PUT("/reqopt/implicit/optional/query")
        void putOptionalQueryAsync(@Query("queryParameter") String queryParameter, ServiceResponseCallback cb);

        @PUT("/reqopt/implicit/optional/header")
        Response putOptionalHeader(@Header("queryParameter") String queryParameter) throws ServiceException;

        @PUT("/reqopt/implicit/optional/header")
        void putOptionalHeaderAsync(@Header("queryParameter") String queryParameter, ServiceResponseCallback cb);

        @PUT("/reqopt/implicit/optional/body")
        Response putOptionalBody(@Body String bodyParameter) throws ServiceException;

        @PUT("/reqopt/implicit/optional/body")
        void putOptionalBodyAsync(@Body String bodyParameter, ServiceResponseCallback cb);

        @GET("/reqopt/global/required/path/{required-global-path}")
        Response getRequiredGlobalPath(@Path("required-global-path") String requiredGlobalPath) throws ServiceException;

        @GET("/reqopt/global/required/path/{required-global-path}")
        void getRequiredGlobalPathAsync(@Path("required-global-path") String requiredGlobalPath, ServiceResponseCallback cb);

        @GET("/reqopt/global/required/query")
        Response getRequiredGlobalQuery(@Query("required-global-query") String requiredGlobalQuery) throws ServiceException;

        @GET("/reqopt/global/required/query")
        void getRequiredGlobalQueryAsync(@Query("required-global-query") String requiredGlobalQuery, ServiceResponseCallback cb);

        @GET("/reqopt/global/optional/query")
        Response getOptionalGlobalQuery(@Query("optional-global-query") Integer optionalGlobalQuery) throws ServiceException;

        @GET("/reqopt/global/optional/query")
        void getOptionalGlobalQueryAsync(@Query("optional-global-query") Integer optionalGlobalQuery, ServiceResponseCallback cb);

    }
    /**
     * Test implicitly required path parameter
     *
     * @param pathParameter the String value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error getRequiredPath(String pathParameter) throws ServiceException;

    /**
     * Test implicitly required path parameter
     *
     * @param pathParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getRequiredPathAsync(String pathParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly optional query parameter
     *
     * @param queryParameter the String value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putOptionalQuery(String queryParameter) throws ServiceException;

    /**
     * Test implicitly optional query parameter
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putOptionalQueryAsync(String queryParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional header parameter
     *
     * @param queryParameter the String value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putOptionalHeader(String queryParameter) throws ServiceException;

    /**
     * Test implicitly optional header parameter
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putOptionalHeaderAsync(String queryParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional body parameter
     *
     * @param bodyParameter the String value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putOptionalBody(String bodyParameter) throws ServiceException;

    /**
     * Test implicitly optional body parameter
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putOptionalBodyAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly required path parameter
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error getRequiredGlobalPath() throws ServiceException;

    /**
     * Test implicitly required path parameter
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getRequiredGlobalPathAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly required query parameter
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error getRequiredGlobalQuery() throws ServiceException;

    /**
     * Test implicitly required query parameter
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getRequiredGlobalQueryAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly optional query parameter
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error getOptionalGlobalQuery() throws ServiceException;

    /**
     * Test implicitly optional query parameter
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getOptionalGlobalQueryAsync(final ServiceCallback<Error> serviceCallback);

}
