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
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import java.util.List;
import retrofit.http.HEAD;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.HTTP;

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
        Call<Void> head300();

        @GET("/http/redirect/300")
        Call<ResponseBody> get300();

        @HEAD("/http/redirect/301")
        Call<Void> head301();

        @GET("/http/redirect/301")
        Call<ResponseBody> get301();

        @PUT("/http/redirect/301")
        Call<ResponseBody> put301(@Body Boolean booleanValue);

        @HEAD("/http/redirect/302")
        Call<Void> head302();

        @GET("/http/redirect/302")
        Call<ResponseBody> get302();

        @PATCH("/http/redirect/302")
        Call<ResponseBody> patch302(@Body Boolean booleanValue);

        @POST("/http/redirect/303")
        Call<ResponseBody> post303(@Body Boolean booleanValue);

        @HEAD("/http/redirect/307")
        Call<Void> head307();

        @GET("/http/redirect/307")
        Call<ResponseBody> get307();

        @PUT("/http/redirect/307")
        Call<ResponseBody> put307(@Body Boolean booleanValue);

        @PATCH("/http/redirect/307")
        Call<ResponseBody> patch307(@Body Boolean booleanValue);

        @POST("/http/redirect/307")
        Call<ResponseBody> post307(@Body Boolean booleanValue);

        @HTTP(path = "/http/redirect/307", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete307(@Body Boolean booleanValue);

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
     * @return the {@link Call} object
     */
    Call<Void> head300Async(final ServiceCallback<Void> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<ResponseBody> get300Async(final ServiceCallback<List<String>> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<Void> head301Async(final ServiceCallback<Void> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<ResponseBody> get301Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put301(Boolean booleanValue) throws ServiceException;

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put301Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<Void> head302Async(final ServiceCallback<Void> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<ResponseBody> get302Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void patch302(Boolean booleanValue) throws ServiceException;

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch302Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post303(Boolean booleanValue) throws ServiceException;

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post303Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<Void> head307Async(final ServiceCallback<Void> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<ResponseBody> get307Async(final ServiceCallback<Void> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<ResponseBody> put307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<ResponseBody> post307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

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
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

}
