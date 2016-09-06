/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.requiredoptional.models.Error;
import fixtures.requiredoptional.models.ErrorException;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Implicits.
 */
public interface Implicits {
    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    Error getRequiredPath(String pathParameter) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Error> getRequiredPathAsync(String pathParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @return the observable to the Error object
     */
    Observable<Error> getRequiredPathAsync(String pathParameter);

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @return the observable to the Error object
     */
    Observable<ServiceResponse<Error>> getRequiredPathAsyncWithServiceResponse(String pathParameter);

    /**
     * Test implicitly optional query parameter.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putOptionalQuery() throws ErrorException, IOException;

    /**
     * Test implicitly optional query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putOptionalQueryAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putOptionalQueryAsync();

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putOptionalQueryAsyncWithServiceResponse();
    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putOptionalQuery(String queryParameter) throws ErrorException, IOException;

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putOptionalQueryAsync(String queryParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putOptionalQueryAsync(String queryParameter);

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putOptionalQueryAsyncWithServiceResponse(String queryParameter);

    /**
     * Test implicitly optional header parameter.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putOptionalHeader() throws ErrorException, IOException;

    /**
     * Test implicitly optional header parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putOptionalHeaderAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putOptionalHeaderAsync();

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putOptionalHeaderAsyncWithServiceResponse();
    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putOptionalHeader(String queryParameter) throws ErrorException, IOException;

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putOptionalHeaderAsync(String queryParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putOptionalHeaderAsync(String queryParameter);

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putOptionalHeaderAsyncWithServiceResponse(String queryParameter);

    /**
     * Test implicitly optional body parameter.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putOptionalBody() throws ErrorException, IOException;

    /**
     * Test implicitly optional body parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putOptionalBodyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putOptionalBodyAsync();

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putOptionalBodyAsyncWithServiceResponse();
    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putOptionalBody(String bodyParameter) throws ErrorException, IOException;

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putOptionalBodyAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putOptionalBodyAsync(String bodyParameter);

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putOptionalBodyAsyncWithServiceResponse(String bodyParameter);

    /**
     * Test implicitly required path parameter.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    Error getRequiredGlobalPath() throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test implicitly required path parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Error> getRequiredGlobalPathAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly required path parameter.
     *
     * @return the observable to the Error object
     */
    Observable<Error> getRequiredGlobalPathAsync();

    /**
     * Test implicitly required path parameter.
     *
     * @return the observable to the Error object
     */
    Observable<ServiceResponse<Error>> getRequiredGlobalPathAsyncWithServiceResponse();

    /**
     * Test implicitly required query parameter.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    Error getRequiredGlobalQuery() throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test implicitly required query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Error> getRequiredGlobalQueryAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly required query parameter.
     *
     * @return the observable to the Error object
     */
    Observable<Error> getRequiredGlobalQueryAsync();

    /**
     * Test implicitly required query parameter.
     *
     * @return the observable to the Error object
     */
    Observable<ServiceResponse<Error>> getRequiredGlobalQueryAsyncWithServiceResponse();

    /**
     * Test implicitly optional query parameter.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    Error getOptionalGlobalQuery() throws ErrorException, IOException;

    /**
     * Test implicitly optional query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Error> getOptionalGlobalQueryAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly optional query parameter.
     *
     * @return the observable to the Error object
     */
    Observable<Error> getOptionalGlobalQueryAsync();

    /**
     * Test implicitly optional query parameter.
     *
     * @return the observable to the Error object
     */
    Observable<ServiceResponse<Error>> getOptionalGlobalQueryAsyncWithServiceResponse();

}
