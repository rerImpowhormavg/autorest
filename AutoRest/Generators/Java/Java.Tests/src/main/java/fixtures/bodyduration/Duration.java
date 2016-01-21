/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodyduration.models.ErrorException;
import java.io.IOException;
import org.joda.time.Period;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in Duration.
 */
public interface Duration {
    /**
     * The interface defining all the services for Duration to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DurationService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("duration/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("duration/positiveduration")
        Call<ResponseBody> putPositiveDuration(@Body Period durationBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("duration/positiveduration")
        Call<ResponseBody> getPositiveDuration();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("duration/invalid")
        Call<ResponseBody> getInvalid();

    }
    /**
     * Get null duration value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Period object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Period> getNull() throws ErrorException, IOException;

    /**
     * Get null duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<Period> serviceCallback);

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putPositiveDuration(Period durationBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putPositiveDurationAsync(Period durationBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a positive duration value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Period object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Period> getPositiveDuration() throws ErrorException, IOException;

    /**
     * Get a positive duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getPositiveDurationAsync(final ServiceCallback<Period> serviceCallback);

    /**
     * Get an invalid duration value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Period object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Period> getInvalid() throws ErrorException, IOException;

    /**
     * Get an invalid duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidAsync(final ServiceCallback<Period> serviceCallback);

}
