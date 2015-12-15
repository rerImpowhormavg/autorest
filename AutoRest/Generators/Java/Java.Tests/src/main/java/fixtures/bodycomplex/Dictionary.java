/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodycomplex.models.DictionaryWrapper;
import fixtures.bodycomplex.models.ErrorException;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in Dictionary.
 */
public interface Dictionary {
    /**
     * The interface defining all the services for Dictionary to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DictionaryService {
        @GET("/complex/dictionary/typed/valid")
        Call<ResponseBody> getValid();

        @PUT("/complex/dictionary/typed/valid")
        Call<ResponseBody> putValid(@Body DictionaryWrapper complexBody);

        @GET("/complex/dictionary/typed/empty")
        Call<ResponseBody> getEmpty();

        @PUT("/complex/dictionary/typed/empty")
        Call<ResponseBody> putEmpty(@Body DictionaryWrapper complexBody);

        @GET("/complex/dictionary/typed/null")
        Call<ResponseBody> getNull();

        @GET("/complex/dictionary/typed/notprovided")
        Call<ResponseBody> getNotProvided();

    }
    /**
     * Get complex types with dictionary property.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DictionaryWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DictionaryWrapper> getValid() throws ErrorException, IOException;

    /**
     * Get complex types with dictionary property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getValidAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putValid(DictionaryWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putValidAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DictionaryWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DictionaryWrapper> getEmpty() throws ErrorException, IOException;

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getEmptyAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putEmpty(DictionaryWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putEmptyAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get complex types with dictionary property which is null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DictionaryWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DictionaryWrapper> getNull() throws ErrorException, IOException;

    /**
     * Get complex types with dictionary property which is null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DictionaryWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DictionaryWrapper> getNotProvided() throws ErrorException, IOException;

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNotProvidedAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

}
