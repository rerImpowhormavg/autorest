/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydictionary;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import java.util.Map;
import org.joda.time.LocalDate;
import org.joda.time.DateTime;
import fixtures.bodydictionary.models.Widget;
import java.util.List;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

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
        @GET("/dictionary/null")
        Call<ResponseBody> getNull();

        @GET("/dictionary/empty")
        Call<ResponseBody> getEmpty();

        @PUT("/dictionary/empty")
        Call<ResponseBody> putEmpty(@Body Map<String, String> arrayBody);

        @GET("/dictionary/nullvalue")
        Call<ResponseBody> getNullValue();

        @GET("/dictionary/nullkey")
        Call<ResponseBody> getNullKey();

        @GET("/dictionary/keyemptystring")
        Call<ResponseBody> getEmptyStringKey();

        @GET("/dictionary/invalid")
        Call<ResponseBody> getInvalid();

        @GET("/dictionary/prim/boolean/tfft")
        Call<ResponseBody> getBooleanTfft();

        @PUT("/dictionary/prim/boolean/tfft")
        Call<ResponseBody> putBooleanTfft(@Body Map<String, Boolean> arrayBody);

        @GET("/dictionary/prim/boolean/true.null.false")
        Call<ResponseBody> getBooleanInvalidNull();

        @GET("/dictionary/prim/boolean/true.boolean.false")
        Call<ResponseBody> getBooleanInvalidString();

        @GET("/dictionary/prim/integer/1.-1.3.300")
        Call<ResponseBody> getIntegerValid();

        @PUT("/dictionary/prim/integer/1.-1.3.300")
        Call<ResponseBody> putIntegerValid(@Body Map<String, Integer> arrayBody);

        @GET("/dictionary/prim/integer/1.null.zero")
        Call<ResponseBody> getIntInvalidNull();

        @GET("/dictionary/prim/integer/1.integer.0")
        Call<ResponseBody> getIntInvalidString();

        @GET("/dictionary/prim/long/1.-1.3.300")
        Call<ResponseBody> getLongValid();

        @PUT("/dictionary/prim/long/1.-1.3.300")
        Call<ResponseBody> putLongValid(@Body Map<String, Long> arrayBody);

        @GET("/dictionary/prim/long/1.null.zero")
        Call<ResponseBody> getLongInvalidNull();

        @GET("/dictionary/prim/long/1.integer.0")
        Call<ResponseBody> getLongInvalidString();

        @GET("/dictionary/prim/float/0--0.01-1.2e20")
        Call<ResponseBody> getFloatValid();

        @PUT("/dictionary/prim/float/0--0.01-1.2e20")
        Call<ResponseBody> putFloatValid(@Body Map<String, Double> arrayBody);

        @GET("/dictionary/prim/float/0.0-null-1.2e20")
        Call<ResponseBody> getFloatInvalidNull();

        @GET("/dictionary/prim/float/1.number.0")
        Call<ResponseBody> getFloatInvalidString();

        @GET("/dictionary/prim/double/0--0.01-1.2e20")
        Call<ResponseBody> getDoubleValid();

        @PUT("/dictionary/prim/double/0--0.01-1.2e20")
        Call<ResponseBody> putDoubleValid(@Body Map<String, Double> arrayBody);

        @GET("/dictionary/prim/double/0.0-null-1.2e20")
        Call<ResponseBody> getDoubleInvalidNull();

        @GET("/dictionary/prim/double/1.number.0")
        Call<ResponseBody> getDoubleInvalidString();

        @GET("/dictionary/prim/string/foo1.foo2.foo3")
        Call<ResponseBody> getStringValid();

        @PUT("/dictionary/prim/string/foo1.foo2.foo3")
        Call<ResponseBody> putStringValid(@Body Map<String, String> arrayBody);

        @GET("/dictionary/prim/string/foo.null.foo2")
        Call<ResponseBody> getStringWithNull();

        @GET("/dictionary/prim/string/foo.123.foo2")
        Call<ResponseBody> getStringWithInvalid();

        @GET("/dictionary/prim/date/valid")
        Call<ResponseBody> getDateValid();

        @PUT("/dictionary/prim/date/valid")
        Call<ResponseBody> putDateValid(@Body Map<String, LocalDate> arrayBody);

        @GET("/dictionary/prim/date/invalidnull")
        Call<ResponseBody> getDateInvalidNull();

        @GET("/dictionary/prim/date/invalidchars")
        Call<ResponseBody> getDateInvalidChars();

        @GET("/dictionary/prim/date-time/valid")
        Call<ResponseBody> getDateTimeValid();

        @PUT("/dictionary/prim/date-time/valid")
        Call<ResponseBody> putDateTimeValid(@Body Map<String, DateTime> arrayBody);

        @GET("/dictionary/prim/date-time/invalidnull")
        Call<ResponseBody> getDateTimeInvalidNull();

        @GET("/dictionary/prim/date-time/invalidchars")
        Call<ResponseBody> getDateTimeInvalidChars();

        @GET("/dictionary/prim/byte/valid")
        Call<ResponseBody> getByteValid();

        @PUT("/dictionary/prim/byte/valid")
        Call<ResponseBody> putByteValid(@Body Map<String, byte[]> arrayBody);

        @GET("/dictionary/prim/byte/invalidnull")
        Call<ResponseBody> getByteInvalidNull();

        @GET("/dictionary/complex/null")
        Call<ResponseBody> getComplexNull();

        @GET("/dictionary/complex/empty")
        Call<ResponseBody> getComplexEmpty();

        @GET("/dictionary/complex/itemnull")
        Call<ResponseBody> getComplexItemNull();

        @GET("/dictionary/complex/itemempty")
        Call<ResponseBody> getComplexItemEmpty();

        @GET("/dictionary/complex/valid")
        Call<ResponseBody> getComplexValid();

        @PUT("/dictionary/complex/valid")
        Call<ResponseBody> putComplexValid(@Body Map<String, Widget> arrayBody);

        @GET("/dictionary/array/null")
        Call<ResponseBody> getArrayNull();

        @GET("/dictionary/array/empty")
        Call<ResponseBody> getArrayEmpty();

        @GET("/dictionary/array/itemnull")
        Call<ResponseBody> getArrayItemNull();

        @GET("/dictionary/array/itemempty")
        Call<ResponseBody> getArrayItemEmpty();

        @GET("/dictionary/array/valid")
        Call<ResponseBody> getArrayValid();

        @PUT("/dictionary/array/valid")
        Call<ResponseBody> putArrayValid(@Body Map<String, List<String>> arrayBody);

        @GET("/dictionary/dictionary/null")
        Call<ResponseBody> getDictionaryNull();

        @GET("/dictionary/dictionary/empty")
        Call<ResponseBody> getDictionaryEmpty();

        @GET("/dictionary/dictionary/itemnull")
        Call<ResponseBody> getDictionaryItemNull();

        @GET("/dictionary/dictionary/itemempty")
        Call<ResponseBody> getDictionaryItemEmpty();

        @GET("/dictionary/dictionary/valid")
        Call<ResponseBody> getDictionaryValid();

        @PUT("/dictionary/dictionary/valid")
        Call<ResponseBody> putDictionaryValid(@Body Map<String, Map<String, String>> arrayBody);

    }
    /**
     *
     * @return the Map&lt;String, Integer&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Integer> getNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<Map<String, Integer>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Integer&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Integer> getEmpty() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getEmptyAsync(final ServiceCallback<Map<String, Integer>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, String&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putEmpty(Map<String, String> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putEmptyAsync(Map<String, String> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, String&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, String> getNullValue() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullValueAsync(final ServiceCallback<Map<String, String>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, String&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, String> getNullKey() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullKeyAsync(final ServiceCallback<Map<String, String>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, String&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, String> getEmptyStringKey() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getEmptyStringKeyAsync(final ServiceCallback<Map<String, String>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, String&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, String> getInvalid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidAsync(final ServiceCallback<Map<String, String>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Boolean&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Boolean> getBooleanTfft() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBooleanTfftAsync(final ServiceCallback<Map<String, Boolean>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, Boolean&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putBooleanTfft(Map<String, Boolean> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, Boolean&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBooleanTfftAsync(Map<String, Boolean> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Boolean&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Boolean> getBooleanInvalidNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBooleanInvalidNullAsync(final ServiceCallback<Map<String, Boolean>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Boolean&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Boolean> getBooleanInvalidString() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBooleanInvalidStringAsync(final ServiceCallback<Map<String, Boolean>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Integer&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Integer> getIntegerValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getIntegerValidAsync(final ServiceCallback<Map<String, Integer>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, Integer&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putIntegerValid(Map<String, Integer> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, Integer&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putIntegerValidAsync(Map<String, Integer> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Integer&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Integer> getIntInvalidNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getIntInvalidNullAsync(final ServiceCallback<Map<String, Integer>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Integer&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Integer> getIntInvalidString() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getIntInvalidStringAsync(final ServiceCallback<Map<String, Integer>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Long&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Long> getLongValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getLongValidAsync(final ServiceCallback<Map<String, Long>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, Long&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putLongValid(Map<String, Long> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, Long&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putLongValidAsync(Map<String, Long> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Long&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Long> getLongInvalidNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getLongInvalidNullAsync(final ServiceCallback<Map<String, Long>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Long&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Long> getLongInvalidString() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getLongInvalidStringAsync(final ServiceCallback<Map<String, Long>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Double&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Double> getFloatValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getFloatValidAsync(final ServiceCallback<Map<String, Double>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, Double&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putFloatValid(Map<String, Double> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, Double&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putFloatValidAsync(Map<String, Double> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Double&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Double> getFloatInvalidNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getFloatInvalidNullAsync(final ServiceCallback<Map<String, Double>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Double&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Double> getFloatInvalidString() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getFloatInvalidStringAsync(final ServiceCallback<Map<String, Double>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Double&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Double> getDoubleValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDoubleValidAsync(final ServiceCallback<Map<String, Double>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, Double&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putDoubleValid(Map<String, Double> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, Double&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putDoubleValidAsync(Map<String, Double> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Double&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Double> getDoubleInvalidNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDoubleInvalidNullAsync(final ServiceCallback<Map<String, Double>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Double&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Double> getDoubleInvalidString() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDoubleInvalidStringAsync(final ServiceCallback<Map<String, Double>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, String&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, String> getStringValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getStringValidAsync(final ServiceCallback<Map<String, String>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, String&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putStringValid(Map<String, String> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putStringValidAsync(Map<String, String> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, String&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, String> getStringWithNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getStringWithNullAsync(final ServiceCallback<Map<String, String>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, String&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, String> getStringWithInvalid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getStringWithInvalidAsync(final ServiceCallback<Map<String, String>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, LocalDate&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, LocalDate> getDateValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDateValidAsync(final ServiceCallback<Map<String, LocalDate>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, LocalDate&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putDateValid(Map<String, LocalDate> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, LocalDate&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putDateValidAsync(Map<String, LocalDate> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, LocalDate&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, LocalDate> getDateInvalidNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDateInvalidNullAsync(final ServiceCallback<Map<String, LocalDate>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, LocalDate&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, LocalDate> getDateInvalidChars() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDateInvalidCharsAsync(final ServiceCallback<Map<String, LocalDate>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, DateTime&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, DateTime> getDateTimeValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDateTimeValidAsync(final ServiceCallback<Map<String, DateTime>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, DateTime&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putDateTimeValid(Map<String, DateTime> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, DateTime&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putDateTimeValidAsync(Map<String, DateTime> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, DateTime&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, DateTime> getDateTimeInvalidNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDateTimeInvalidNullAsync(final ServiceCallback<Map<String, DateTime>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, DateTime&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, DateTime> getDateTimeInvalidChars() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDateTimeInvalidCharsAsync(final ServiceCallback<Map<String, DateTime>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, byte[]&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, byte[]> getByteValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getByteValidAsync(final ServiceCallback<Map<String, byte[]>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, byte[]&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putByteValid(Map<String, byte[]> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, byte[]&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putByteValidAsync(Map<String, byte[]> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, byte[]&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, byte[]> getByteInvalidNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getByteInvalidNullAsync(final ServiceCallback<Map<String, byte[]>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Widget&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Widget> getComplexNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getComplexNullAsync(final ServiceCallback<Map<String, Widget>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Widget&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Widget> getComplexEmpty() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getComplexEmptyAsync(final ServiceCallback<Map<String, Widget>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Widget&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Widget> getComplexItemNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getComplexItemNullAsync(final ServiceCallback<Map<String, Widget>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Widget&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Widget> getComplexItemEmpty() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getComplexItemEmptyAsync(final ServiceCallback<Map<String, Widget>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Widget&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Widget> getComplexValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getComplexValidAsync(final ServiceCallback<Map<String, Widget>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, Widget&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putComplexValid(Map<String, Widget> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, Widget&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putComplexValidAsync(Map<String, Widget> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, List&lt;String&gt;&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, List<String>> getArrayNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getArrayNullAsync(final ServiceCallback<Map<String, List<String>>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, List&lt;String&gt;&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, List<String>> getArrayEmpty() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getArrayEmptyAsync(final ServiceCallback<Map<String, List<String>>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, List&lt;String&gt;&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, List<String>> getArrayItemNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getArrayItemNullAsync(final ServiceCallback<Map<String, List<String>>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, List&lt;String&gt;&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, List<String>> getArrayItemEmpty() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getArrayItemEmptyAsync(final ServiceCallback<Map<String, List<String>>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, List&lt;String&gt;&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, List<String>> getArrayValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getArrayValidAsync(final ServiceCallback<Map<String, List<String>>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, List&lt;String&gt;&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putArrayValid(Map<String, List<String>> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, List&lt;String&gt;&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putArrayValidAsync(Map<String, List<String>> arrayBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Map&lt;String, String&gt;&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Map<String, String>> getDictionaryNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDictionaryNullAsync(final ServiceCallback<Map<String, Map<String, String>>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Map&lt;String, String&gt;&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Map<String, String>> getDictionaryEmpty() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDictionaryEmptyAsync(final ServiceCallback<Map<String, Map<String, String>>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Map&lt;String, String&gt;&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Map<String, String>> getDictionaryItemNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDictionaryItemNullAsync(final ServiceCallback<Map<String, Map<String, String>>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Map&lt;String, String&gt;&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Map<String, String>> getDictionaryItemEmpty() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDictionaryItemEmptyAsync(final ServiceCallback<Map<String, Map<String, String>>> serviceCallback);

    /**
     *
     * @return the Map&lt;String, Map&lt;String, String&gt;&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Map<String, Map<String, String>> getDictionaryValid() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDictionaryValidAsync(final ServiceCallback<Map<String, Map<String, String>>> serviceCallback);

    /**
     *
     * @param arrayBody the Map&lt;String, Map&lt;String, String&gt;&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putDictionaryValid(Map<String, Map<String, String>> arrayBody) throws ServiceException;

    /**
     *
     * @param arrayBody the Map&lt;String, Map&lt;String, String&gt;&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putDictionaryValidAsync(Map<String, Map<String, String>> arrayBody, final ServiceCallback<Void> serviceCallback);

}
