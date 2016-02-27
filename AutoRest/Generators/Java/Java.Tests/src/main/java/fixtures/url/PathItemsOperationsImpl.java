/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.url.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in PathItemsOperations.
 */
public final class PathItemsOperationsImpl implements PathItemsOperations {
    /** The Retrofit service to perform REST calls. */
    private PathItemsService service;
    /** The service client containing this operation class. */
    private AutoRestUrlTestService client;

    /**
     * Initializes an instance of PathItemsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PathItemsOperationsImpl(Retrofit retrofit, AutoRestUrlTestService client) {
        this.service = retrofit.create(PathItemsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PathItemsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PathItemsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("pathitem/nullable/globalStringPath/{globalStringPath}/pathItemStringPath/{pathItemStringPath}/localStringPath/{localStringPath}/globalStringQuery/pathItemStringQuery/localStringQuery")
        Call<ResponseBody> getAllWithValues(@Path("localStringPath") String localStringPath, @Path("pathItemStringPath") String pathItemStringPath, @Path("globalStringPath") String globalStringPath, @Query("localStringQuery") String localStringQuery, @Query("pathItemStringQuery") String pathItemStringQuery, @Query("globalStringQuery") String globalStringQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("pathitem/nullable/globalStringPath/{globalStringPath}/pathItemStringPath/{pathItemStringPath}/localStringPath/{localStringPath}/null/pathItemStringQuery/localStringQuery")
        Call<ResponseBody> getGlobalQueryNull(@Path("localStringPath") String localStringPath, @Path("pathItemStringPath") String pathItemStringPath, @Path("globalStringPath") String globalStringPath, @Query("localStringQuery") String localStringQuery, @Query("pathItemStringQuery") String pathItemStringQuery, @Query("globalStringQuery") String globalStringQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("pathitem/nullable/globalStringPath/{globalStringPath}/pathItemStringPath/{pathItemStringPath}/localStringPath/{localStringPath}/null/pathItemStringQuery/null")
        Call<ResponseBody> getGlobalAndLocalQueryNull(@Path("localStringPath") String localStringPath, @Path("pathItemStringPath") String pathItemStringPath, @Path("globalStringPath") String globalStringPath, @Query("localStringQuery") String localStringQuery, @Query("pathItemStringQuery") String pathItemStringQuery, @Query("globalStringQuery") String globalStringQuery);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("pathitem/nullable/globalStringPath/{globalStringPath}/pathItemStringPath/{pathItemStringPath}/localStringPath/{localStringPath}/globalStringQuery/null/null")
        Call<ResponseBody> getLocalPathItemQueryNull(@Path("localStringPath") String localStringPath, @Path("pathItemStringPath") String pathItemStringPath, @Path("globalStringPath") String globalStringPath, @Query("localStringQuery") String localStringQuery, @Query("pathItemStringQuery") String pathItemStringQuery, @Query("globalStringQuery") String globalStringQuery);

    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getAllWithValues(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery) throws ErrorException, IOException, IllegalArgumentException {
        if (localStringPath == null) {
            throw new IllegalArgumentException("Parameter localStringPath is required and cannot be null.");
        }
        if (pathItemStringPath == null) {
            throw new IllegalArgumentException("Parameter pathItemStringPath is required and cannot be null.");
        }
        if (this.client.getGlobalStringPath() == null) {
            throw new IllegalArgumentException("Parameter this.client.getGlobalStringPath() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getAllWithValues(localStringPath, pathItemStringPath, this.client.getGlobalStringPath(), localStringQuery, pathItemStringQuery, this.client.getGlobalStringQuery());
        return getAllWithValuesDelegate(call.execute());
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getAllWithValuesAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback) {
        if (localStringPath == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter localStringPath is required and cannot be null."));
            return null;
        }
        if (pathItemStringPath == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter pathItemStringPath is required and cannot be null."));
            return null;
        }
        if (this.client.getGlobalStringPath() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getGlobalStringPath() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getAllWithValues(localStringPath, pathItemStringPath, this.client.getGlobalStringPath(), localStringQuery, pathItemStringQuery, this.client.getGlobalStringQuery());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getAllWithValuesDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> getAllWithValuesDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getGlobalQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery) throws ErrorException, IOException, IllegalArgumentException {
        if (localStringPath == null) {
            throw new IllegalArgumentException("Parameter localStringPath is required and cannot be null.");
        }
        if (pathItemStringPath == null) {
            throw new IllegalArgumentException("Parameter pathItemStringPath is required and cannot be null.");
        }
        if (this.client.getGlobalStringPath() == null) {
            throw new IllegalArgumentException("Parameter this.client.getGlobalStringPath() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getGlobalQueryNull(localStringPath, pathItemStringPath, this.client.getGlobalStringPath(), localStringQuery, pathItemStringQuery, this.client.getGlobalStringQuery());
        return getGlobalQueryNullDelegate(call.execute());
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getGlobalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback) {
        if (localStringPath == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter localStringPath is required and cannot be null."));
            return null;
        }
        if (pathItemStringPath == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter pathItemStringPath is required and cannot be null."));
            return null;
        }
        if (this.client.getGlobalStringPath() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getGlobalStringPath() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getGlobalQueryNull(localStringPath, pathItemStringPath, this.client.getGlobalStringPath(), localStringQuery, pathItemStringQuery, this.client.getGlobalStringQuery());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getGlobalQueryNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> getGlobalQueryNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getGlobalAndLocalQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery) throws ErrorException, IOException, IllegalArgumentException {
        if (localStringPath == null) {
            throw new IllegalArgumentException("Parameter localStringPath is required and cannot be null.");
        }
        if (pathItemStringPath == null) {
            throw new IllegalArgumentException("Parameter pathItemStringPath is required and cannot be null.");
        }
        if (this.client.getGlobalStringPath() == null) {
            throw new IllegalArgumentException("Parameter this.client.getGlobalStringPath() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getGlobalAndLocalQueryNull(localStringPath, pathItemStringPath, this.client.getGlobalStringPath(), localStringQuery, pathItemStringQuery, this.client.getGlobalStringQuery());
        return getGlobalAndLocalQueryNullDelegate(call.execute());
    }

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getGlobalAndLocalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback) {
        if (localStringPath == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter localStringPath is required and cannot be null."));
            return null;
        }
        if (pathItemStringPath == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter pathItemStringPath is required and cannot be null."));
            return null;
        }
        if (this.client.getGlobalStringPath() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getGlobalStringPath() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getGlobalAndLocalQueryNull(localStringPath, pathItemStringPath, this.client.getGlobalStringPath(), localStringQuery, pathItemStringQuery, this.client.getGlobalStringQuery());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getGlobalAndLocalQueryNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> getGlobalAndLocalQueryNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getLocalPathItemQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery) throws ErrorException, IOException, IllegalArgumentException {
        if (localStringPath == null) {
            throw new IllegalArgumentException("Parameter localStringPath is required and cannot be null.");
        }
        if (pathItemStringPath == null) {
            throw new IllegalArgumentException("Parameter pathItemStringPath is required and cannot be null.");
        }
        if (this.client.getGlobalStringPath() == null) {
            throw new IllegalArgumentException("Parameter this.client.getGlobalStringPath() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getLocalPathItemQueryNull(localStringPath, pathItemStringPath, this.client.getGlobalStringPath(), localStringQuery, pathItemStringQuery, this.client.getGlobalStringQuery());
        return getLocalPathItemQueryNullDelegate(call.execute());
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getLocalPathItemQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback) {
        if (localStringPath == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter localStringPath is required and cannot be null."));
            return null;
        }
        if (pathItemStringPath == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter pathItemStringPath is required and cannot be null."));
            return null;
        }
        if (this.client.getGlobalStringPath() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getGlobalStringPath() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getLocalPathItemQueryNull(localStringPath, pathItemStringPath, this.client.getGlobalStringPath(), localStringQuery, pathItemStringQuery, this.client.getGlobalStringQuery());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getLocalPathItemQueryNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> getLocalPathItemQueryNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
