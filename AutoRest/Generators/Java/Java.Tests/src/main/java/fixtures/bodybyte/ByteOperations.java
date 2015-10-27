/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodybyte;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import org.apache.commons.codec.binary.Base64;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in ByteOperations.
 */
public interface ByteOperations {
    /**
     * The interface defining all the services for ByteOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ByteService {
        @GET("/byte/null")
        Call<ResponseBody> getNull();

        @GET("/byte/empty")
        Call<ResponseBody> getEmpty();

        @GET("/byte/nonAscii")
        Call<ResponseBody> getNonAscii();

        @PUT("/byte/nonAscii")
        Call<ResponseBody> putNonAscii(@Body byte[] byteBody);

        @GET("/byte/invalid")
        Call<ResponseBody> getInvalid();

    }
    /**
     * Get null byte value
     *
     * @return the byte[] object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    byte[] getNull() throws ServiceException;

    /**
     * Get null byte value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get empty byte value ''
     *
     * @return the byte[] object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    byte[] getEmpty() throws ServiceException;

    /**
     * Get empty byte value ''
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getEmptyAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     *
     * @return the byte[] object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    byte[] getNonAscii() throws ServiceException;

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNonAsciiAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putNonAscii(byte[] byteBody) throws ServiceException;

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putNonAsciiAsync(byte[] byteBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get invalid byte value ':::SWAGGER::::'
     *
     * @return the byte[] object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    byte[] getInvalid() throws ServiceException;

    /**
     * Get invalid byte value ':::SWAGGER::::'
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidAsync(final ServiceCallback<byte[]> serviceCallback);

}
