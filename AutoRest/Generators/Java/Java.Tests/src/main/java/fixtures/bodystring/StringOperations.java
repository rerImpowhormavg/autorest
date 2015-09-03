/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in StringOperations.
 */
public interface StringOperations {
    /**
     * The interface defining all the services for StringOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface StringService {
        @GET("/string/null")
        Response getNull() throws ServiceException;

        @GET("/string/null")
        void getNullAsync(ServiceResponseCallback cb);

        @PUT("/string/null")
        Response putNull(@Body String stringBody) throws ServiceException;

        @PUT("/string/null")
        void putNullAsync(@Body String stringBody, ServiceResponseCallback cb);

        @GET("/string/empty")
        Response getEmpty() throws ServiceException;

        @GET("/string/empty")
        void getEmptyAsync(ServiceResponseCallback cb);

        @PUT("/string/empty")
        Response putEmpty(@Body String stringBody) throws ServiceException;

        @PUT("/string/empty")
        void putEmptyAsync(@Body String stringBody, ServiceResponseCallback cb);

        @GET("/string/mbcs")
        Response getMbcs() throws ServiceException;

        @GET("/string/mbcs")
        void getMbcsAsync(ServiceResponseCallback cb);

        @PUT("/string/mbcs")
        Response putMbcs(@Body String stringBody) throws ServiceException;

        @PUT("/string/mbcs")
        void putMbcsAsync(@Body String stringBody, ServiceResponseCallback cb);

        @GET("/string/whitespace")
        Response getWhitespace() throws ServiceException;

        @GET("/string/whitespace")
        void getWhitespaceAsync(ServiceResponseCallback cb);

        @PUT("/string/whitespace")
        Response putWhitespace(@Body String stringBody) throws ServiceException;

        @PUT("/string/whitespace")
        void putWhitespaceAsync(@Body String stringBody, ServiceResponseCallback cb);

        @GET("/string/notProvided")
        Response getNotProvided() throws ServiceException;

        @GET("/string/notProvided")
        void getNotProvidedAsync(ServiceResponseCallback cb);

    }
    /**
     * Get null string value value
     *
     * @return the String object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    String getNull() throws ServiceException;

    /**
     * Get null string value value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNullAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Set string value null
     *
     * @param stringBody Possible values for this parameter include: ''
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putNull(String stringBody) throws ServiceException;

    /**
     * Set string value null
     *
     * @param stringBody Possible values for this parameter include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putNullAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get empty string value value ''
     *
     * @return the String object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    String getEmpty() throws ServiceException;

    /**
     * Get empty string value value ''
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getEmptyAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Set string value empty ''
     *
     * @param stringBody Possible values for this parameter include: ''
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putEmpty(String stringBody) throws ServiceException;

    /**
     * Set string value empty ''
     *
     * @param stringBody Possible values for this parameter include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putEmptyAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get mbcs string value
     * '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€
     * '
     *
     * @return the String object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    String getMbcs() throws ServiceException;

    /**
     * Get mbcs string value
     * '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€
     * '
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMbcsAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Set string value mbcs
     * '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€
     * '
     *
     * @param stringBody Possible values for this parameter include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putMbcs(String stringBody) throws ServiceException;

    /**
     * Set string value mbcs
     * '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€
     * '
     *
     * @param stringBody Possible values for this parameter include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putMbcsAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get string value with leading and trailing whitespace
     * '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men
     * to come to the aid of their
     * country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'
     *
     * @return the String object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    String getWhitespace() throws ServiceException;

    /**
     * Get string value with leading and trailing whitespace
     * '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men
     * to come to the aid of their
     * country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getWhitespaceAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Set String value with leading and trailing whitespace
     * '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men
     * to come to the aid of their
     * country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'
     *
     * @param stringBody Possible values for this parameter include: '    Now is the time for all good men to come to the aid of their country    '
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putWhitespace(String stringBody) throws ServiceException;

    /**
     * Set String value with leading and trailing whitespace
     * '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men
     * to come to the aid of their
     * country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'
     *
     * @param stringBody Possible values for this parameter include: '    Now is the time for all good men to come to the aid of their country    '
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putWhitespaceAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get String value when no string value is sent in response payload
     *
     * @return the String object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    String getNotProvided() throws ServiceException;

    /**
     * Get String value when no string value is sent in response payload
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNotProvidedAsync(final ServiceCallback<String> serviceCallback);

}
