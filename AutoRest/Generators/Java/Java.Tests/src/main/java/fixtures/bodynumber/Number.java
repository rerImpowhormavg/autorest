/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodynumber;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in Number.
 */
public interface Number {
    /**
     * The interface defining all the services for Number to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NumberService {
        @GET("/number/null")
        Response getNull() throws ServiceException;

        @GET("/number/null")
        void getNullAsync(ServiceResponseCallback cb);

        @GET("/number/invalidfloat")
        Response getInvalidFloat() throws ServiceException;

        @GET("/number/invalidfloat")
        void getInvalidFloatAsync(ServiceResponseCallback cb);

        @GET("/number/invaliddouble")
        Response getInvalidDouble() throws ServiceException;

        @GET("/number/invaliddouble")
        void getInvalidDoubleAsync(ServiceResponseCallback cb);

        @PUT("/number/big/float/3.402823e+20")
        Response putBigFloat(@Body double numberBody) throws ServiceException;

        @PUT("/number/big/float/3.402823e+20")
        void putBigFloatAsync(@Body double numberBody, ServiceResponseCallback cb);

        @GET("/number/big/float/3.402823e+20")
        Response getBigFloat() throws ServiceException;

        @GET("/number/big/float/3.402823e+20")
        void getBigFloatAsync(ServiceResponseCallback cb);

        @PUT("/number/big/double/2.5976931e+101")
        Response putBigDouble(@Body double numberBody) throws ServiceException;

        @PUT("/number/big/double/2.5976931e+101")
        void putBigDoubleAsync(@Body double numberBody, ServiceResponseCallback cb);

        @GET("/number/big/double/2.5976931e+101")
        Response getBigDouble() throws ServiceException;

        @GET("/number/big/double/2.5976931e+101")
        void getBigDoubleAsync(ServiceResponseCallback cb);

        @PUT("/number/big/double/99999999.99")
        Response putBigDoublePositiveDecimal(@Body double numberBody) throws ServiceException;

        @PUT("/number/big/double/99999999.99")
        void putBigDoublePositiveDecimalAsync(@Body double numberBody, ServiceResponseCallback cb);

        @GET("/number/big/double/99999999.99")
        Response getBigDoublePositiveDecimal() throws ServiceException;

        @GET("/number/big/double/99999999.99")
        void getBigDoublePositiveDecimalAsync(ServiceResponseCallback cb);

        @PUT("/number/big/double/-99999999.99")
        Response putBigDoubleNegativeDecimal(@Body double numberBody) throws ServiceException;

        @PUT("/number/big/double/-99999999.99")
        void putBigDoubleNegativeDecimalAsync(@Body double numberBody, ServiceResponseCallback cb);

        @GET("/number/big/double/-99999999.99")
        Response getBigDoubleNegativeDecimal() throws ServiceException;

        @GET("/number/big/double/-99999999.99")
        void getBigDoubleNegativeDecimalAsync(ServiceResponseCallback cb);

        @PUT("/number/small/float/3.402823e-20")
        Response putSmallFloat(@Body double numberBody) throws ServiceException;

        @PUT("/number/small/float/3.402823e-20")
        void putSmallFloatAsync(@Body double numberBody, ServiceResponseCallback cb);

        @GET("/number/small/float/3.402823e-20")
        Response getSmallFloat() throws ServiceException;

        @GET("/number/small/float/3.402823e-20")
        void getSmallFloatAsync(ServiceResponseCallback cb);

        @PUT("/number/small/double/2.5976931e-101")
        Response putSmallDouble(@Body double numberBody) throws ServiceException;

        @PUT("/number/small/double/2.5976931e-101")
        void putSmallDoubleAsync(@Body double numberBody, ServiceResponseCallback cb);

        @GET("/number/small/double/2.5976931e-101")
        Response getSmallDouble() throws ServiceException;

        @GET("/number/small/double/2.5976931e-101")
        void getSmallDoubleAsync(ServiceResponseCallback cb);

    }
    /**
     * Get null Number value
     *
     * @return the double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    double getNull() throws ServiceException;

    /**
     * Get null Number value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNullAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid float Number value
     *
     * @return the double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    double getInvalidFloat() throws ServiceException;

    /**
     * Get invalid float Number value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getInvalidFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid double Number value
     *
     * @return the double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    double getInvalidDouble() throws ServiceException;

    /**
     * Get invalid double Number value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getInvalidDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big float value 3.402823e+20
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putBigFloat(double numberBody) throws ServiceException;

    /**
     * Put big float value 3.402823e+20
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putBigFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big float value 3.402823e+20
     *
     * @return the double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    double getBigFloat() throws ServiceException;

    /**
     * Get big float value 3.402823e+20
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getBigFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big double value 2.5976931e+101
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putBigDouble(double numberBody) throws ServiceException;

    /**
     * Put big double value 2.5976931e+101
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putBigDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 2.5976931e+101
     *
     * @return the double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    double getBigDouble() throws ServiceException;

    /**
     * Get big double value 2.5976931e+101
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getBigDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big double value 99999999.99
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putBigDoublePositiveDecimal(double numberBody) throws ServiceException;

    /**
     * Put big double value 99999999.99
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putBigDoublePositiveDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 99999999.99
     *
     * @return the double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    double getBigDoublePositiveDecimal() throws ServiceException;

    /**
     * Get big double value 99999999.99
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getBigDoublePositiveDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big double value -99999999.99
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putBigDoubleNegativeDecimal(double numberBody) throws ServiceException;

    /**
     * Put big double value -99999999.99
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putBigDoubleNegativeDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value -99999999.99
     *
     * @return the double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    double getBigDoubleNegativeDecimal() throws ServiceException;

    /**
     * Get big double value -99999999.99
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getBigDoubleNegativeDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put small float value 3.402823e-20
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putSmallFloat(double numberBody) throws ServiceException;

    /**
     * Put small float value 3.402823e-20
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putSmallFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 3.402823e-20
     *
     * @return the double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    double getSmallFloat() throws ServiceException;

    /**
     * Get big double value 3.402823e-20
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getSmallFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put small double value 2.5976931e-101
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putSmallDouble(double numberBody) throws ServiceException;

    /**
     * Put small double value 2.5976931e-101
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putSmallDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 2.5976931e-101
     *
     * @return the double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    double getSmallDouble() throws ServiceException;

    /**
     * Get big double value 2.5976931e-101
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getSmallDoubleAsync(final ServiceCallback<Double> serviceCallback);

}
