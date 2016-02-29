/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import fixtures.http.models.A;
import fixtures.http.models.ErrorException;
import fixtures.http.models.MyException;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in MultipleResponsesOperations.
 */
public interface MultipleResponsesOperations {
    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200Model204NoModelDefaultError200Valid() throws ErrorException, IOException;

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200Model204NoModelDefaultError200ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 204 response with no payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200Model204NoModelDefaultError204Valid() throws ErrorException, IOException;

    /**
     * Send a 204 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200Model204NoModelDefaultError204ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 201 response with valid payload: {'statusCode': '201'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200Model204NoModelDefaultError201Invalid() throws ErrorException, IOException;

    /**
     * Send a 201 response with valid payload: {'statusCode': '201'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200Model204NoModelDefaultError201InvalidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 202 response with no payload:.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200Model204NoModelDefaultError202None() throws ErrorException, IOException;

    /**
     * Send a 202 response with no payload:.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200Model204NoModelDefaultError202NoneAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with valid error payload: {'status': 400, 'message': 'client error'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200Model204NoModelDefaultError400Valid() throws ErrorException, IOException;

    /**
     * Send a 400 response with valid error payload: {'status': 400, 'message': 'client error'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200Model204NoModelDefaultError400ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200Model201ModelDefaultError200Valid() throws ErrorException, IOException;

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200Model201ModelDefaultError200ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 201 response with valid payload: {'statusCode': '201', 'textStatusCode': 'Created'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200Model201ModelDefaultError201Valid() throws ErrorException, IOException;

    /**
     * Send a 201 response with valid payload: {'statusCode': '201', 'textStatusCode': 'Created'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200Model201ModelDefaultError201ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200Model201ModelDefaultError400Valid() throws ErrorException, IOException;

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200Model201ModelDefaultError400ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> get200ModelA201ModelC404ModelDDefaultError200Valid() throws ErrorException, IOException;

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA201ModelC404ModelDDefaultError200ValidAsync(final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with valid payload: {'httpCode': '201'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> get200ModelA201ModelC404ModelDDefaultError201Valid() throws ErrorException, IOException;

    /**
     * Send a 200 response with valid payload: {'httpCode': '201'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA201ModelC404ModelDDefaultError201ValidAsync(final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with valid payload: {'httpStatusCode': '404'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> get200ModelA201ModelC404ModelDDefaultError404Valid() throws ErrorException, IOException;

    /**
     * Send a 200 response with valid payload: {'httpStatusCode': '404'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA201ModelC404ModelDDefaultError404ValidAsync(final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> get200ModelA201ModelC404ModelDDefaultError400Valid() throws ErrorException, IOException;

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA201ModelC404ModelDDefaultError400ValidAsync(final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 202 response with no payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> get202None204NoneDefaultError202None() throws ErrorException, IOException;

    /**
     * Send a 202 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get202None204NoneDefaultError202NoneAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 204 response with no payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> get202None204NoneDefaultError204None() throws ErrorException, IOException;

    /**
     * Send a 204 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get202None204NoneDefaultError204NoneAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> get202None204NoneDefaultError400Valid() throws ErrorException, IOException;

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get202None204NoneDefaultError400ValidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 202 response with an unexpected payload {'property': 'value'}.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> get202None204NoneDefaultNone202Invalid() throws ServiceException, IOException;

    /**
     * Send a 202 response with an unexpected payload {'property': 'value'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get202None204NoneDefaultNone202InvalidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 204 response with no payload.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> get202None204NoneDefaultNone204None() throws ServiceException, IOException;

    /**
     * Send a 204 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get202None204NoneDefaultNone204NoneAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with no payload.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> get202None204NoneDefaultNone400None() throws ServiceException, IOException;

    /**
     * Send a 400 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get202None204NoneDefaultNone400NoneAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with an unexpected payload {'property': 'value'}.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> get202None204NoneDefaultNone400Invalid() throws ServiceException, IOException;

    /**
     * Send a 400 response with an unexpected payload {'property': 'value'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get202None204NoneDefaultNone400InvalidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @throws MyException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> getDefaultModelA200Valid() throws MyException, IOException;

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDefaultModelA200ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with no payload.
     *
     * @throws MyException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> getDefaultModelA200None() throws MyException, IOException;

    /**
     * Send a 200 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDefaultModelA200NoneAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @throws MyException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> getDefaultModelA400Valid() throws MyException, IOException;

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDefaultModelA400ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with no payload.
     *
     * @throws MyException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> getDefaultModelA400None() throws MyException, IOException;

    /**
     * Send a 400 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDefaultModelA400NoneAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with invalid payload: {'statusCode': '200'}.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getDefaultNone200Invalid() throws ServiceException, IOException;

    /**
     * Send a 200 response with invalid payload: {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDefaultNone200InvalidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with no payload.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getDefaultNone200None() throws ServiceException, IOException;

    /**
     * Send a 200 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDefaultNone200NoneAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getDefaultNone400Invalid() throws ServiceException, IOException;

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDefaultNone400InvalidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with no payload.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getDefaultNone400None() throws ServiceException, IOException;

    /**
     * Send a 400 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDefaultNone400NoneAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with no payload, when a payload is expected - client should return a null object of thde type for model A.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200ModelA200None() throws ServiceException, IOException;

    /**
     * Send a 200 response with no payload, when a payload is expected - client should return a null object of thde type for model A.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA200NoneAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with payload {'statusCode': '200'}.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200ModelA200Valid() throws ServiceException, IOException;

    /**
     * Send a 200 response with payload {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA200ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '200'}.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200ModelA200Invalid() throws ServiceException, IOException;

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA200InvalidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 400 response with no payload client should treat as an http error with no error model.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200ModelA400None() throws ServiceException, IOException;

    /**
     * Send a 400 response with no payload client should treat as an http error with no error model.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA400NoneAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with payload {'statusCode': '400'}.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200ModelA400Valid() throws ServiceException, IOException;

    /**
     * Send a 200 response with payload {'statusCode': '400'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA400ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '400'}.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200ModelA400Invalid() throws ServiceException, IOException;

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '400'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA400InvalidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

    /**
     * Send a 202 response with payload {'statusCode': '202'}.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the A object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<A> get200ModelA202Valid() throws ServiceException, IOException;

    /**
     * Send a 202 response with payload {'statusCode': '202'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall get200ModelA202ValidAsync(final ServiceCallback<A> serviceCallback) throws IllegalArgumentException;

}
