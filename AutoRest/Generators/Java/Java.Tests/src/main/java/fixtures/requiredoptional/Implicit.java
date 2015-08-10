// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.requiredoptional;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;

public interface Implicit {
    @GET("/reqopt/implicit/required/path/{pathParameter}")
    ErrorModel getRequiredPath(String pathParameter);

    @GET("/reqopt/implicit/required/path/{pathParameter}")
    void getRequiredPathAsync(String pathParameter, Callback<ErrorModel> cb);

    @PUT("/reqopt/implicit/optional/query")
    void putOptionalQuery(String queryParameter);

    @PUT("/reqopt/implicit/optional/query")
    void putOptionalQueryAsync(String queryParameter, Callback<Response> cb);

    @PUT("/reqopt/implicit/optional/header")
    void putOptionalHeader(String queryParameter);

    @PUT("/reqopt/implicit/optional/header")
    void putOptionalHeaderAsync(String queryParameter, Callback<Response> cb);

    @PUT("/reqopt/implicit/optional/body")
    void putOptionalBody(String bodyParameter);

    @PUT("/reqopt/implicit/optional/body")
    void putOptionalBodyAsync(String bodyParameter, Callback<Response> cb);

    @GET("/reqopt/global/required/path/{required-global-path}")
    ErrorModel getRequiredGlobalPath();

    @GET("/reqopt/global/required/path/{required-global-path}")
    void getRequiredGlobalPathAsync(Callback<ErrorModel> cb);

    @GET("/reqopt/global/required/query")
    ErrorModel getRequiredGlobalQuery();

    @GET("/reqopt/global/required/query")
    void getRequiredGlobalQueryAsync(Callback<ErrorModel> cb);

    @GET("/reqopt/global/optional/query")
    ErrorModel getOptionalGlobalQuery();

    @GET("/reqopt/global/optional/query")
    void getOptionalGlobalQueryAsync(Callback<ErrorModel> cb);

}
