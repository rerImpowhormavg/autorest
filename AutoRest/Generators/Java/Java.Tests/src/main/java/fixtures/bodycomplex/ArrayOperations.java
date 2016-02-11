/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodycomplex.models.ArrayWrapper;
import fixtures.bodycomplex.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in ArrayOperations.
 */
public interface ArrayOperations {
    /**
     * The interface defining all the services for ArrayOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ArrayService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/array/valid")
        Call<ResponseBody> getValid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/array/valid")
        Call<ResponseBody> putValid(@Body ArrayWrapper complexBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/array/empty")
        Call<ResponseBody> getEmpty();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/array/empty")
        Call<ResponseBody> putEmpty(@Body ArrayWrapper complexBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/array/notprovided")
        Call<ResponseBody> getNotProvided();

    }
    /**
     * Get complex types with array property.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ArrayWrapper> getValid() throws ErrorException, IOException;

    /**
     * Get complex types with array property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getValidAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putValid(ArrayWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putValidAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get complex types with array property which is empty.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ArrayWrapper> getEmpty() throws ErrorException, IOException;

    /**
     * Get complex types with array property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getEmptyAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putEmpty(ArrayWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putEmptyAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ArrayWrapper> getNotProvided() throws ErrorException, IOException;

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNotProvidedAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

}
