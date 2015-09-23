/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import java.time.Period;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

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
        @GET("/duration/null")
        Response getNull() throws ServiceException;

        @GET("/duration/null")
        void getNullAsync(ServiceResponseCallback cb);

        @PUT("/duration/positiveduration")
        Response putPositiveDuration(@Body Period durationBody) throws ServiceException;

        @PUT("/duration/positiveduration")
        void putPositiveDurationAsync(@Body Period durationBody, ServiceResponseCallback cb);

        @GET("/duration/positiveduration")
        Response getPositiveDuration() throws ServiceException;

        @GET("/duration/positiveduration")
        void getPositiveDurationAsync(ServiceResponseCallback cb);

        @PUT("/duration/negativeduration")
        Response putNegativeDuration(@Body Period durationBody) throws ServiceException;

        @PUT("/duration/negativeduration")
        void putNegativeDurationAsync(@Body Period durationBody, ServiceResponseCallback cb);

        @GET("/duration/negativeduration")
        Response getNegativeDuration() throws ServiceException;

        @GET("/duration/negativeduration")
        void getNegativeDurationAsync(ServiceResponseCallback cb);

        @GET("/duration/invalid")
        Response getInvalid() throws ServiceException;

        @GET("/duration/invalid")
        void getInvalidAsync(ServiceResponseCallback cb);

    }
    /**
     * Get null duration value
     *
     * @return the Period object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Period getNull() throws ServiceException;

    /**
     * Get null duration value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNullAsync(final ServiceCallback<Period> serviceCallback);

    /**
     * Put a positive duration value
     *
     * @param durationBody the Period value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putPositiveDuration(Period durationBody) throws ServiceException;

    /**
     * Put a positive duration value
     *
     * @param durationBody the Period value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putPositiveDurationAsync(Period durationBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a positive duration value
     *
     * @return the Period object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Period getPositiveDuration() throws ServiceException;

    /**
     * Get a positive duration value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getPositiveDurationAsync(final ServiceCallback<Period> serviceCallback);

    /**
     * Put a negative duration value
     *
     * @param durationBody the Period value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putNegativeDuration(Period durationBody) throws ServiceException;

    /**
     * Put a negative duration value
     *
     * @param durationBody the Period value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putNegativeDurationAsync(Period durationBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a negative valid duration value
     *
     * @return the Period object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Period getNegativeDuration() throws ServiceException;

    /**
     * Get a negative valid duration value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNegativeDurationAsync(final ServiceCallback<Period> serviceCallback);

    /**
     * Get an invalid duration value
     *
     * @return the Period object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Period getInvalid() throws ServiceException;

    /**
     * Get an invalid duration value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getInvalidAsync(final ServiceCallback<Period> serviceCallback);

}
