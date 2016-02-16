/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import com.microsoft.rest.serializer.JacksonMapperAdapter;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import fixtures.validation.models.ErrorException;
import fixtures.validation.models.Product;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/**
 * The interface for AutoRestValidationTest class.
 */
public interface AutoRestValidationTest {
    /**
     * Gets the URI used as the base for all cloud service requests.
     *
     * @return the BaseUri value.
     */
    String getBaseUri();

    /**
     * Gets the list of interceptors the OkHttp client will execute.
     *
     * @return the list of interceptors.
     */
    List<Interceptor> getClientInterceptors();

    /**
     * Sets the logging level for OkHttp client.
     *
     * @param logLevel the logging level enum.
     */
    void setLogLevel(Level logLevel);

    /**
     * Gets the adapter for {@link com.fasterxml.jackson.databind.ObjectMapper} for serialization
     * and deserialization operations..
     *
     * @return the adapter.
     */
    JacksonMapperAdapter getMapperAdapter();

    /**
     * Gets Subscription ID..
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Sets Subscription ID..
     *
     * @param subscriptionId the subscriptionId value.
     */
    void setSubscriptionId(String subscriptionId);

    /**
     * Gets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Sets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @param apiVersion the apiVersion value.
     */
    void setApiVersion(String apiVersion);

    /**
     * The interface defining all the services for AutoRestValidationTest to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestValidationTestService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("fakepath/{subscriptionId}/{resourceGroupName}/{id}")
        Call<ResponseBody> validationOfMethodParameters(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("id") int id, @Query("apiVersion") String apiVersion);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("fakepath/{subscriptionId}/{resourceGroupName}/{id}")
        Call<ResponseBody> validationOfBody(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("id") int id, @Body Product body, @Query("apiVersion") String apiVersion);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("validation/constantsInPath/{constantParam}/value")
        Call<ResponseBody> getWithConstantInPath(@Path("constantParam") String constantParam);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("validation/constantsInPath/{constantParam}/value")
        Call<ResponseBody> postWithConstantInBody(@Path("constantParam") String constantParam, @Body Product body);

    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Product object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Product> validationOfMethodParameters(String resourceGroupName, int id) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> validationOfMethodParametersAsync(String resourceGroupName, int id, final ServiceCallback<Product> serviceCallback);
    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Product object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Product> validationOfBody(String resourceGroupName, int id, Product body) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> validationOfBodyAsync(String resourceGroupName, int id, Product body, final ServiceCallback<Product> serviceCallback);
    /**
     *
     * @param constantParam the String value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getWithConstantInPath(String constantParam) throws ServiceException, IOException, IllegalArgumentException;

    /**
     *
     * @param constantParam the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getWithConstantInPathAsync(String constantParam, final ServiceCallback<Void> serviceCallback);
    /**
     *
     * @param constantParam the String value
     * @param body the Product value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Product object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Product> postWithConstantInBody(String constantParam, Product body) throws ServiceException, IOException, IllegalArgumentException;

    /**
     *
     * @param constantParam the String value
     * @param body the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postWithConstantInBodyAsync(String constantParam, Product body, final ServiceCallback<Product> serviceCallback);

}
