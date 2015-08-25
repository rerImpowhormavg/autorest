/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import java.util.List;
import retrofit.http.HEAD;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.DELETE;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpRedirects.
 */
public interface HttpRedirects {
    /**
     * The interface defining all the services for HttpRedirects to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpRedirectsService {
        @HEAD("/http/redirect/300")
        Response head300() throws ServiceException;

        @HEAD("/http/redirect/300")
        void head300Async(ServiceResponseCallback cb);

        @GET("/http/redirect/300")
        Response get300() throws ServiceException;

        @GET("/http/redirect/300")
        void get300Async(ServiceResponseCallback cb);

        @HEAD("/http/redirect/301")
        Response head301() throws ServiceException;

        @HEAD("/http/redirect/301")
        void head301Async(ServiceResponseCallback cb);

        @GET("/http/redirect/301")
        Response get301() throws ServiceException;

        @GET("/http/redirect/301")
        void get301Async(ServiceResponseCallback cb);

        @PUT("/http/redirect/301")
        Response put301(@Body Boolean booleanValue) throws ServiceException;

        @PUT("/http/redirect/301")
        void put301Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @HEAD("/http/redirect/302")
        Response head302() throws ServiceException;

        @HEAD("/http/redirect/302")
        void head302Async(ServiceResponseCallback cb);

        @GET("/http/redirect/302")
        Response get302() throws ServiceException;

        @GET("/http/redirect/302")
        void get302Async(ServiceResponseCallback cb);

        @PATCH("/http/redirect/302")
        Response patch302(@Body Boolean booleanValue) throws ServiceException;

        @PATCH("/http/redirect/302")
        void patch302Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/redirect/303")
        Response post303(@Body Boolean booleanValue) throws ServiceException;

        @POST("/http/redirect/303")
        void post303Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @HEAD("/http/redirect/307")
        Response head307() throws ServiceException;

        @HEAD("/http/redirect/307")
        void head307Async(ServiceResponseCallback cb);

        @GET("/http/redirect/307")
        Response get307() throws ServiceException;

        @GET("/http/redirect/307")
        void get307Async(ServiceResponseCallback cb);

        @PUT("/http/redirect/307")
        Response put307(@Body Boolean booleanValue) throws ServiceException;

        @PUT("/http/redirect/307")
        void put307Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @PATCH("/http/redirect/307")
        Response patch307(@Body Boolean booleanValue) throws ServiceException;

        @PATCH("/http/redirect/307")
        void patch307Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/redirect/307")
        Response post307(@Body Boolean booleanValue) throws ServiceException;

        @POST("/http/redirect/307")
        void post307Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @DELETE("/http/redirect/307")
        Response delete307(@Body Boolean booleanValue) throws ServiceException;

        @DELETE("/http/redirect/307")
        void delete307Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

    }
    /**
     * Return 300 status code and redirect to /http/success/200
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void head300() throws ServiceException;

    /**
     * Return 300 status code and redirect to /http/success/200
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head300Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 300 status code and redirect to /http/success/200
     *
     * @return the List&lt;String&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    List<String> get300() throws ServiceException;

    /**
     * Return 300 status code and redirect to /http/success/200
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get300Async(final ServiceCallback<List<String>> serviceCallback);

    /**
     * Return 301 status code and redirect to /http/success/200
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void head301() throws ServiceException;

    /**
     * Return 301 status code and redirect to /http/success/200
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head301Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 301 status code and redirect to /http/success/200
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void get301() throws ServiceException;

    /**
     * Return 301 status code and redirect to /http/success/200
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get301Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 301.  This request should not
     * be automatically redirected, but should return the received 301 to the
     * caller for evaluation
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put301(Boolean booleanValue) throws ServiceException;

    /**
     * Put true Boolean value in request returns 301.  This request should not
     * be automatically redirected, but should return the received 301 to the
     * caller for evaluation
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put301Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 302 status code and redirect to /http/success/200
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void head302() throws ServiceException;

    /**
     * Return 302 status code and redirect to /http/success/200
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head302Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 302 status code and redirect to /http/success/200
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void get302() throws ServiceException;

    /**
     * Return 302 status code and redirect to /http/success/200
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get302Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 302.  This request should
     * not be automatically redirected, but should return the received 302 to
     * the caller for evaluation
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void patch302(Boolean booleanValue) throws ServiceException;

    /**
     * Patch true Boolean value in request returns 302.  This request should
     * not be automatically redirected, but should return the received 302 to
     * the caller for evaluation
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void patch302Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 303.  This request should be
     * automatically redirected usign a get, ultimately returning a 200
     * status code
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post303(Boolean booleanValue) throws ServiceException;

    /**
     * Post true Boolean value in request returns 303.  This request should be
     * automatically redirected usign a get, ultimately returning a 200
     * status code
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void post303Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Redirect with 307, resulting in a 200 success
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void head307() throws ServiceException;

    /**
     * Redirect with 307, resulting in a 200 success
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head307Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Redirect get with 307, resulting in a 200 success
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void get307() throws ServiceException;

    /**
     * Redirect get with 307, resulting in a 200 success
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get307Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Put redirected with 307, resulting in a 200 after redirect
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put307(Boolean booleanValue) throws ServiceException;

    /**
     * Put redirected with 307, resulting in a 200 after redirect
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void patch307(Boolean booleanValue) throws ServiceException;

    /**
     * Patch redirected with 307, resulting in a 200 after redirect
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void patch307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post redirected with 307, resulting in a 200 after redirect
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post307(Boolean booleanValue) throws ServiceException;

    /**
     * Post redirected with 307, resulting in a 200 after redirect
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void post307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void delete307(Boolean booleanValue) throws ServiceException;

    /**
     * Delete redirected with 307, resulting in a 200 after redirect
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void delete307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

}
