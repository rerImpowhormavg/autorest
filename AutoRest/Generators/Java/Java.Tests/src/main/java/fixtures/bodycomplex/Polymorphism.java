// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodycomplex;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;
import fixtures.bodycomplex.models.Fish;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

public interface Polymorphism {
    @GET("/complex/polymorphism/valid")
    Fish getValid() throws ServiceException;

    @GET("/complex/polymorphism/valid")
    void getValidAsync(Callback<Fish> cb);

    @PUT("/complex/polymorphism/valid")
    Response putValid(@Body Fish complexBody) throws ServiceException;

    @PUT("/complex/polymorphism/valid")
    void putValidAsync(@Body Fish complexBody, Callback<Response> cb);

    @PUT("/complex/polymorphism/missingrequired/invalid")
    Response putValidMissingRequired(@Body Fish complexBody) throws ServiceException;

    @PUT("/complex/polymorphism/missingrequired/invalid")
    void putValidMissingRequiredAsync(@Body Fish complexBody, Callback<Response> cb);

}
