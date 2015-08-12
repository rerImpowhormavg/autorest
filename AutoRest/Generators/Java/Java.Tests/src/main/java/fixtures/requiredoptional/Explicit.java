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
import fixtures.requiredoptional.models.IntWrapper;
import fixtures.requiredoptional.models.IntOptionalWrapper;
import fixtures.requiredoptional.models.StringWrapper;
import fixtures.requiredoptional.models.StringOptionalWrapper;
import fixtures.requiredoptional.models.Product;
import fixtures.requiredoptional.models.ClassWrapper;
import fixtures.requiredoptional.models.ClassOptionalWrapper;
import java.util.List;
import fixtures.requiredoptional.models.ArrayWrapper;
import fixtures.requiredoptional.models.ArrayOptionalWrapper;
import fixtures.requiredoptional.models.Error;
import retrofit.http.POST;
import retrofit.http.Body;
import retrofit.http.Header;

public interface Explicit {
    @POST("/reqopt/requied/integer/parameter")
    Error postRequiredIntegerParameter(@Body int bodyParameter) throws ServiceException;

    @POST("/reqopt/requied/integer/parameter")
    void postRequiredIntegerParameterAsync(@Body int bodyParameter, Callback<Error> cb);

    @POST("/reqopt/optional/integer/parameter")
    Response postOptionalIntegerParameter(@Body int bodyParameter) throws ServiceException;

    @POST("/reqopt/optional/integer/parameter")
    void postOptionalIntegerParameterAsync(@Body int bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/integer/property")
    Error postRequiredIntegerProperty(@Body IntWrapper bodyParameter) throws ServiceException;

    @POST("/reqopt/requied/integer/property")
    void postRequiredIntegerPropertyAsync(@Body IntWrapper bodyParameter, Callback<Error> cb);

    @POST("/reqopt/optional/integer/property")
    Response postOptionalIntegerProperty(@Body IntOptionalWrapper bodyParameter) throws ServiceException;

    @POST("/reqopt/optional/integer/property")
    void postOptionalIntegerPropertyAsync(@Body IntOptionalWrapper bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/integer/header")
    Error postRequiredIntegerHeader(@Header("headerParameter") int headerParameter) throws ServiceException;

    @POST("/reqopt/requied/integer/header")
    void postRequiredIntegerHeaderAsync(@Header("headerParameter") int headerParameter, Callback<Error> cb);

    @POST("/reqopt/optional/integer/header")
    Response postOptionalIntegerHeader(@Header("headerParameter") int headerParameter) throws ServiceException;

    @POST("/reqopt/optional/integer/header")
    void postOptionalIntegerHeaderAsync(@Header("headerParameter") int headerParameter, Callback<Response> cb);

    @POST("/reqopt/requied/string/parameter")
    Error postRequiredStringParameter(@Body String bodyParameter) throws ServiceException;

    @POST("/reqopt/requied/string/parameter")
    void postRequiredStringParameterAsync(@Body String bodyParameter, Callback<Error> cb);

    @POST("/reqopt/optional/string/parameter")
    Response postOptionalStringParameter(@Body String bodyParameter) throws ServiceException;

    @POST("/reqopt/optional/string/parameter")
    void postOptionalStringParameterAsync(@Body String bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/string/property")
    Error postRequiredStringProperty(@Body StringWrapper bodyParameter) throws ServiceException;

    @POST("/reqopt/requied/string/property")
    void postRequiredStringPropertyAsync(@Body StringWrapper bodyParameter, Callback<Error> cb);

    @POST("/reqopt/optional/string/property")
    Response postOptionalStringProperty(@Body StringOptionalWrapper bodyParameter) throws ServiceException;

    @POST("/reqopt/optional/string/property")
    void postOptionalStringPropertyAsync(@Body StringOptionalWrapper bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/string/header")
    Error postRequiredStringHeader(@Header("headerParameter") String headerParameter) throws ServiceException;

    @POST("/reqopt/requied/string/header")
    void postRequiredStringHeaderAsync(@Header("headerParameter") String headerParameter, Callback<Error> cb);

    @POST("/reqopt/optional/string/header")
    Response postOptionalStringHeader(@Header("bodyParameter") String bodyParameter) throws ServiceException;

    @POST("/reqopt/optional/string/header")
    void postOptionalStringHeaderAsync(@Header("bodyParameter") String bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/class/parameter")
    Error postRequiredClassParameter(@Body Product bodyParameter) throws ServiceException;

    @POST("/reqopt/requied/class/parameter")
    void postRequiredClassParameterAsync(@Body Product bodyParameter, Callback<Error> cb);

    @POST("/reqopt/optional/class/parameter")
    Response postOptionalClassParameter(@Body Product bodyParameter) throws ServiceException;

    @POST("/reqopt/optional/class/parameter")
    void postOptionalClassParameterAsync(@Body Product bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/class/property")
    Error postRequiredClassProperty(@Body ClassWrapper bodyParameter) throws ServiceException;

    @POST("/reqopt/requied/class/property")
    void postRequiredClassPropertyAsync(@Body ClassWrapper bodyParameter, Callback<Error> cb);

    @POST("/reqopt/optional/class/property")
    Response postOptionalClassProperty(@Body ClassOptionalWrapper bodyParameter) throws ServiceException;

    @POST("/reqopt/optional/class/property")
    void postOptionalClassPropertyAsync(@Body ClassOptionalWrapper bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/array/parameter")
    Error postRequiredArrayParameter(@Body List<String> bodyParameter) throws ServiceException;

    @POST("/reqopt/requied/array/parameter")
    void postRequiredArrayParameterAsync(@Body List<String> bodyParameter, Callback<Error> cb);

    @POST("/reqopt/optional/array/parameter")
    Response postOptionalArrayParameter(@Body List<String> bodyParameter) throws ServiceException;

    @POST("/reqopt/optional/array/parameter")
    void postOptionalArrayParameterAsync(@Body List<String> bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/array/property")
    Error postRequiredArrayProperty(@Body ArrayWrapper bodyParameter) throws ServiceException;

    @POST("/reqopt/requied/array/property")
    void postRequiredArrayPropertyAsync(@Body ArrayWrapper bodyParameter, Callback<Error> cb);

    @POST("/reqopt/optional/array/property")
    Response postOptionalArrayProperty(@Body ArrayOptionalWrapper bodyParameter) throws ServiceException;

    @POST("/reqopt/optional/array/property")
    void postOptionalArrayPropertyAsync(@Body ArrayOptionalWrapper bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/array/header")
    Error postRequiredArrayHeader(@Header("headerParameter") List<String> headerParameter) throws ServiceException;

    @POST("/reqopt/requied/array/header")
    void postRequiredArrayHeaderAsync(@Header("headerParameter") List<String> headerParameter, Callback<Error> cb);

    @POST("/reqopt/optional/array/header")
    Response postOptionalArrayHeader(@Header("headerParameter") List<String> headerParameter) throws ServiceException;

    @POST("/reqopt/optional/array/header")
    void postOptionalArrayHeaderAsync(@Header("headerParameter") List<String> headerParameter, Callback<Response> cb);

}
