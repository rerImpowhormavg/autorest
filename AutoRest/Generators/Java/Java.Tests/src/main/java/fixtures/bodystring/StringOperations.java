/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodystring.models.ErrorException;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in StringOperations.
 */
public interface StringOperations {
    /**
     * Get null string value value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<String> getNull() throws ErrorException, IOException;

    /**
     * Get null string value value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getNullAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Set string value null.
     *
     * @param stringBody the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putNull(String stringBody) throws ErrorException, IOException;

    /**
     * Set string value null.
     *
     * @param stringBody the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall putNullAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get empty string value value ''.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<String> getEmpty() throws ErrorException, IOException;

    /**
     * Get empty string value value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getEmptyAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Set string value empty ''.
     *
     * @param stringBody the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putEmpty(String stringBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Set string value empty ''.
     *
     * @param stringBody the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall putEmptyAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<String> getMbcs() throws ErrorException, IOException;

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMbcsAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMbcs(String stringBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall putMbcsAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<String> getWhitespace() throws ErrorException, IOException;

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getWhitespaceAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putWhitespace(String stringBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall putWhitespaceAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<String> getNotProvided() throws ErrorException, IOException;

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall getNotProvidedAsync(final ServiceCallback<String> serviceCallback);

}
