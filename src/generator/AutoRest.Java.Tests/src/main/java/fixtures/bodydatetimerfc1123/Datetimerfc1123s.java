/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import java.io.IOException;
import org.joda.time.DateTime;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Datetimerfc1123s.
 */
public interface Datetimerfc1123s {
    /**
     * Get null datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTime> getNull() throws ErrorException, IOException;

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DateTime> getNullAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     * Get null datetime value.
     *
     * @return the observable to the DateTime object
     */
    Observable<ServiceResponse<DateTime>> getNullAsync();

    /**
     * Get invalid datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTime> getInvalid() throws ErrorException, IOException;

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DateTime> getInvalidAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     * Get invalid datetime value.
     *
     * @return the observable to the DateTime object
     */
    Observable<ServiceResponse<DateTime>> getInvalidAsync();

    /**
     * Get overflow datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTime> getOverflow() throws ErrorException, IOException;

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DateTime> getOverflowAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     * Get overflow datetime value.
     *
     * @return the observable to the DateTime object
     */
    Observable<ServiceResponse<DateTime>> getOverflowAsync();

    /**
     * Get underflow datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTime> getUnderflow() throws ErrorException, IOException;

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DateTime> getUnderflowAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     * Get underflow datetime value.
     *
     * @return the observable to the DateTime object
     */
    Observable<ServiceResponse<DateTime>> getUnderflowAsync();

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putUtcMaxDateTime(DateTime datetimeBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putUtcMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putUtcMaxDateTimeAsync(DateTime datetimeBody);

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTime> getUtcLowercaseMaxDateTime() throws ErrorException, IOException;

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DateTime> getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return the observable to the DateTime object
     */
    Observable<ServiceResponse<DateTime>> getUtcLowercaseMaxDateTimeAsync();

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTime> getUtcUppercaseMaxDateTime() throws ErrorException, IOException;

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DateTime> getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return the observable to the DateTime object
     */
    Observable<ServiceResponse<DateTime>> getUtcUppercaseMaxDateTimeAsync();

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putUtcMinDateTime(DateTime datetimeBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putUtcMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putUtcMinDateTimeAsync(DateTime datetimeBody);

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTime> getUtcMinDateTime() throws ErrorException, IOException;

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<DateTime> getUtcMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return the observable to the DateTime object
     */
    Observable<ServiceResponse<DateTime>> getUtcMinDateTimeAsync();

}
