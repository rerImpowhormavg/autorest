// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.header;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;

public interface headerOperations {
    @POST("/header/param/existingkey")
     paramExistingKey(String userAgent);

    @POST("/header/param/existingkey")
    void paramExistingKeyAsync(String userAgent, Callback<Response> cb);

    @POST("/header/response/existingkey")
     responseExistingKey();

    @POST("/header/response/existingkey")
    void responseExistingKeyAsync(Callback<Response> cb);

    @POST("/header/param/protectedkey")
     paramProtectedKey(String contentType);

    @POST("/header/param/protectedkey")
    void paramProtectedKeyAsync(String contentType, Callback<Response> cb);

    @POST("/header/response/protectedkey")
     responseProtectedKey();

    @POST("/header/response/protectedkey")
    void responseProtectedKeyAsync(Callback<Response> cb);

    @POST("/header/param/prim/integer")
     paramInteger(String scenario, Integer value);

    @POST("/header/param/prim/integer")
    void paramIntegerAsync(String scenario, Integer value, Callback<Response> cb);

    @POST("/header/response/prim/integer")
     responseInteger(String scenario);

    @POST("/header/response/prim/integer")
    void responseIntegerAsync(String scenario, Callback<Response> cb);

    @POST("/header/param/prim/long")
     paramLong(String scenario, Long value);

    @POST("/header/param/prim/long")
    void paramLongAsync(String scenario, Long value, Callback<Response> cb);

    @POST("/header/response/prim/long")
     responseLong(String scenario);

    @POST("/header/response/prim/long")
    void responseLongAsync(String scenario, Callback<Response> cb);

    @POST("/header/param/prim/float")
     paramFloat(String scenario, Double value);

    @POST("/header/param/prim/float")
    void paramFloatAsync(String scenario, Double value, Callback<Response> cb);

    @POST("/header/response/prim/float")
     responseFloat(String scenario);

    @POST("/header/response/prim/float")
    void responseFloatAsync(String scenario, Callback<Response> cb);

    @POST("/header/param/prim/double")
     paramDouble(String scenario, Double value);

    @POST("/header/param/prim/double")
    void paramDoubleAsync(String scenario, Double value, Callback<Response> cb);

    @POST("/header/response/prim/double")
     responseDouble(String scenario);

    @POST("/header/response/prim/double")
    void responseDoubleAsync(String scenario, Callback<Response> cb);

    @POST("/header/param/prim/bool")
     paramBool(String scenario, Boolean value);

    @POST("/header/param/prim/bool")
    void paramBoolAsync(String scenario, Boolean value, Callback<Response> cb);

    @POST("/header/response/prim/bool")
     responseBool(String scenario);

    @POST("/header/response/prim/bool")
    void responseBoolAsync(String scenario, Callback<Response> cb);

    @POST("/header/param/prim/string")
     paramString(String scenario, String value);

    @POST("/header/param/prim/string")
    void paramStringAsync(String scenario, String value, Callback<Response> cb);

    @POST("/header/response/prim/string")
     responseString(String scenario);

    @POST("/header/response/prim/string")
    void responseStringAsync(String scenario, Callback<Response> cb);

    @POST("/header/param/prim/date")
     paramDate(String scenario, Date value);

    @POST("/header/param/prim/date")
    void paramDateAsync(String scenario, Date value, Callback<Response> cb);

    @POST("/header/response/prim/date")
     responseDate(String scenario);

    @POST("/header/response/prim/date")
    void responseDateAsync(String scenario, Callback<Response> cb);

    @POST("/header/param/prim/datetime")
     paramDatetime(String scenario, Date value);

    @POST("/header/param/prim/datetime")
    void paramDatetimeAsync(String scenario, Date value, Callback<Response> cb);

    @POST("/header/response/prim/datetime")
     responseDatetime(String scenario);

    @POST("/header/response/prim/datetime")
    void responseDatetimeAsync(String scenario, Callback<Response> cb);

    @POST("/header/param/prim/byte")
     paramByte(String scenario, Buffer value);

    @POST("/header/param/prim/byte")
    void paramByteAsync(String scenario, Buffer value, Callback<Response> cb);

    @POST("/header/response/prim/byte")
     responseByte(String scenario);

    @POST("/header/response/prim/byte")
    void responseByteAsync(String scenario, Callback<Response> cb);

    @POST("/header/param/prim/enum")
     paramEnum(String scenario, GreyscaleColors value);

    @POST("/header/param/prim/enum")
    void paramEnumAsync(String scenario, GreyscaleColors value, Callback<Response> cb);

    @POST("/header/response/prim/enum")
     responseEnum(String scenario);

    @POST("/header/response/prim/enum")
    void responseEnumAsync(String scenario, Callback<Response> cb);

    @POST("/header/custom/x-ms-client-request-id/9C4D50EE-2D56-4CD3-8152-34347DC9F2B0")
     customRequestId();

    @POST("/header/custom/x-ms-client-request-id/9C4D50EE-2D56-4CD3-8152-34347DC9F2B0")
    void customRequestIdAsync(Callback<Response> cb);

}
