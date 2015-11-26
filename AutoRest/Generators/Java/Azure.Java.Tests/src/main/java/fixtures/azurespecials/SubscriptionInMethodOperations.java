/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import retrofit.Call;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.POST;

/**
 * An instance of this class provides access to all the operations defined
 * in SubscriptionInMethodOperations.
 */
public interface SubscriptionInMethodOperations {
    /**
     * The interface defining all the services for SubscriptionInMethodOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SubscriptionInMethodService {
        @POST("/azurespecials/subscriptionId/method/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        Call<ResponseBody> postMethodLocalValid(@Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage);

        @POST("/azurespecials/subscriptionId/method/string/none/path/local/null/{subscriptionId}")
        Call<ResponseBody> postMethodLocalNull(@Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage);

        @POST("/azurespecials/subscriptionId/path/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        Call<ResponseBody> postPathLocalValid(@Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage);

        @POST("/azurespecials/subscriptionId/swagger/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        Call<ResponseBody> postSwaggerLocalValid(@Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage);

    }
    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postMethodLocalValid(String subscriptionId) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postMethodLocalValidAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback);

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postMethodLocalNull(String subscriptionId) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postMethodLocalNullAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback);

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postPathLocalValid(String subscriptionId) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postPathLocalValidAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback);

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postSwaggerLocalValid(String subscriptionId) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postSwaggerLocalValidAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback);

}
