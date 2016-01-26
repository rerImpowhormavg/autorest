/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.http.models.Error;
import fixtures.http.models.ErrorException;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.HEAD;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.POST;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpServerFailureOperations.
 */
public interface HttpServerFailureOperations {
    /**
     * The interface defining all the services for HttpServerFailureOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpServerFailureService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/failure/server/501")
        Call<Void> head501();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("http/failure/server/501")
        Call<ResponseBody> get501();

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("http/failure/server/505")
        Call<ResponseBody> post505(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "http/failure/server/505", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete505(@Body Boolean booleanValue);

    }
    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> head501() throws ErrorException, IOException;

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head501Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> get501() throws ErrorException, IOException;

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get501Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> post505(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> delete505(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

}
