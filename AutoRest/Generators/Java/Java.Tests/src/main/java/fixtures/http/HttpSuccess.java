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
import retrofit.http.HEAD;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.HTTP;

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
        @HEAD("/http/success/200")
        Call<Void> head200();

        @GET("/http/success/200")
        Call<ResponseBody> get200();

        @PUT("/http/success/200")
        Call<ResponseBody> put200(@Body Boolean booleanValue);

        @PATCH("/http/success/200")
        Call<ResponseBody> patch200(@Body Boolean booleanValue);

        @POST("/http/success/200")
        Call<ResponseBody> post200(@Body Boolean booleanValue);

        @HTTP(path = "/http/success/200", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete200(@Body Boolean booleanValue);

        @PUT("/http/success/201")
        Call<ResponseBody> put201(@Body Boolean booleanValue);

        @POST("/http/success/201")
        Call<ResponseBody> post201(@Body Boolean booleanValue);

        @PUT("/http/success/202")
        Call<ResponseBody> put202(@Body Boolean booleanValue);

        @PATCH("/http/success/202")
        Call<ResponseBody> patch202(@Body Boolean booleanValue);

        @POST("/http/success/202")
        Call<ResponseBody> post202(@Body Boolean booleanValue);

        @HTTP(path = "/http/success/202", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete202(@Body Boolean booleanValue);

        @HEAD("/http/success/204")
        Call<Void> head204();

        @PUT("/http/success/204")
        Call<ResponseBody> put204(@Body Boolean booleanValue);

        @PATCH("/http/success/204")
        Call<ResponseBody> patch204(@Body Boolean booleanValue);

        @POST("/http/success/204")
        Call<ResponseBody> post204(@Body Boolean booleanValue);

        @HTTP(path = "/http/success/204", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete204(@Body Boolean booleanValue);

        @HEAD("/http/success/404")
        Call<Void> head404();

    }
    /**
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void head200() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<Void> head200Async(final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Boolean get200() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> get200Async(final ServiceCallback<Boolean> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put200(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> put200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void patch200(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> patch200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post200(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> post200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void delete200(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> delete200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put201(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> put201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post201(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> post201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put202(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> put202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void patch202(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> patch202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post202(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> post202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void delete202(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> delete202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void head204() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<Void> head204Async(final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put204(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> put204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void patch204(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> patch204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post204(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> post204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void delete204(Boolean booleanValue) throws ServiceException;

    /**
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> delete204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void head404() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<Void> head404Async(final ServiceCallback<Void> serviceCallback);

}
