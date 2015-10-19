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
import fixtures.http.models.Error;
import retrofit.http.HEAD;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.HTTP;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpClientFailure.
 */
public interface HttpClientFailure {
    /**
     * The interface defining all the services for HttpClientFailure to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpClientFailureService {
        @HEAD("/http/failure/client/400")
        Call<Void> head400();

        @GET("/http/failure/client/400")
        Call<ResponseBody> get400();

        @PUT("/http/failure/client/400")
        Call<ResponseBody> put400(@Body Boolean booleanValue);

        @PATCH("/http/failure/client/400")
        Call<ResponseBody> patch400(@Body Boolean booleanValue);

        @POST("/http/failure/client/400")
        Call<ResponseBody> post400(@Body Boolean booleanValue);

        @HTTP(path = "/http/failure/client/400", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete400(@Body Boolean booleanValue);

        @HEAD("/http/failure/client/401")
        Call<Void> head401();

        @GET("/http/failure/client/402")
        Call<ResponseBody> get402();

        @GET("/http/failure/client/403")
        Call<ResponseBody> get403();

        @PUT("/http/failure/client/404")
        Call<ResponseBody> put404(@Body Boolean booleanValue);

        @PATCH("/http/failure/client/405")
        Call<ResponseBody> patch405(@Body Boolean booleanValue);

        @POST("/http/failure/client/406")
        Call<ResponseBody> post406(@Body Boolean booleanValue);

        @HTTP(path = "/http/failure/client/407", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete407(@Body Boolean booleanValue);

        @PUT("/http/failure/client/409")
        Call<ResponseBody> put409(@Body Boolean booleanValue);

        @HEAD("/http/failure/client/410")
        Call<Void> head410();

        @GET("/http/failure/client/411")
        Call<ResponseBody> get411();

        @GET("/http/failure/client/412")
        Call<ResponseBody> get412();

        @PUT("/http/failure/client/413")
        Call<ResponseBody> put413(@Body Boolean booleanValue);

        @PATCH("/http/failure/client/414")
        Call<ResponseBody> patch414(@Body Boolean booleanValue);

        @POST("/http/failure/client/415")
        Call<ResponseBody> post415(@Body Boolean booleanValue);

        @GET("/http/failure/client/416")
        Call<ResponseBody> get416();

        @HTTP(path = "/http/failure/client/417", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete417(@Body Boolean booleanValue);

        @HEAD("/http/failure/client/429")
        Call<Void> head429();

    }
    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error head400() throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head400Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get400() throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get400Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error put400(Boolean booleanValue) throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error patch400(Boolean booleanValue) throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error post400(Boolean booleanValue) throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error delete400(Boolean booleanValue) throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 401 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error head401() throws ServiceException;

    /**
     * Return 401 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head401Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 402 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get402() throws ServiceException;

    /**
     * Return 402 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get402Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 403 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get403() throws ServiceException;

    /**
     * Return 403 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get403Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 404 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error put404(Boolean booleanValue) throws ServiceException;

    /**
     * Return 404 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put404Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 405 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error patch405(Boolean booleanValue) throws ServiceException;

    /**
     * Return 405 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch405Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 406 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error post406(Boolean booleanValue) throws ServiceException;

    /**
     * Return 406 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post406Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 407 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error delete407(Boolean booleanValue) throws ServiceException;

    /**
     * Return 407 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete407Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 409 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error put409(Boolean booleanValue) throws ServiceException;

    /**
     * Return 409 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put409Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 410 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error head410() throws ServiceException;

    /**
     * Return 410 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head410Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 411 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get411() throws ServiceException;

    /**
     * Return 411 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get411Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 412 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get412() throws ServiceException;

    /**
     * Return 412 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get412Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 413 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error put413(Boolean booleanValue) throws ServiceException;

    /**
     * Return 413 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put413Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 414 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error patch414(Boolean booleanValue) throws ServiceException;

    /**
     * Return 414 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch414Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 415 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error post415(Boolean booleanValue) throws ServiceException;

    /**
     * Return 415 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post415Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 416 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get416() throws ServiceException;

    /**
     * Return 416 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get416Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 417 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error delete417(Boolean booleanValue) throws ServiceException;

    /**
     * Return 417 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete417Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 429 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error head429() throws ServiceException;

    /**
     * Return 429 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head429Async(final ServiceCallback<Error> serviceCallback);

}
