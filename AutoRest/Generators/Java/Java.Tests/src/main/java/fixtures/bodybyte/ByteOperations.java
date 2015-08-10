// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodybyte;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;

public interface ByteOperations {
    @GET("/byte/null")
    byte[] getNull();

    @GET("/byte/null")
    void getNullAsync(Callback<Byte[]> cb);

    @GET("/byte/empty")
    Byte[] getEmpty();

    @GET("/byte/empty")
    void getEmptyAsync(Callback<Byte[]> cb);

    @GET("/byte/nonAscii")
    Byte[] getNonAscii();

    @GET("/byte/nonAscii")
    void getNonAsciiAsync(Callback<Byte[]> cb);

    @PUT("/byte/nonAscii")
    void putNonAscii(Byte[] byteBody);

    @PUT("/byte/nonAscii")
    void putNonAsciiAsync(Byte[] byteBody, Callback<Response> cb);

    @GET("/byte/invalid")
    Byte[] getInvalid();

    @GET("/byte/invalid")
    void getInvalidAsync(Callback<Byte[]> cb);

}
