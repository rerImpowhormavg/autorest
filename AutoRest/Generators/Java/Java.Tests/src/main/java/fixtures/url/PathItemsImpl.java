/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.url.models.Error;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class PathItemsImpl implements PathItems {
    private PathItemsService service;
    AutoRestUrlTestService client;

    public PathItemsImpl(Retrofit retrofit, AutoRestUrlTestService client) {
        this.service = retrofit.create(PathItemsService.class);
        this.client = client;
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     */
    public ServiceResponse<Void> getAllWithValues(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery) throws ServiceException, IOException, IllegalArgumentException {
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
        return getAllWithValuesDelegate(call.execute(), null);
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getAllWithValuesAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback) {
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
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getAllWithValuesDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getAllWithValuesDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     */
    public ServiceResponse<Void> getGlobalQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery) throws ServiceException, IOException, IllegalArgumentException {
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
        return getGlobalQueryNullDelegate(call.execute(), null);
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getGlobalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback) {
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
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getGlobalQueryNullDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getGlobalQueryNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     */
    public ServiceResponse<Void> getGlobalAndLocalQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery) throws ServiceException, IOException, IllegalArgumentException {
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
        return getGlobalAndLocalQueryNullDelegate(call.execute(), null);
    }

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getGlobalAndLocalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback) {
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
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getGlobalAndLocalQueryNullDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getGlobalAndLocalQueryNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     */
    public ServiceResponse<Void> getLocalPathItemQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery) throws ServiceException, IOException, IllegalArgumentException {
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
        return getLocalPathItemQueryNullDelegate(call.execute(), null);
    }

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getLocalPathItemQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback) {
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
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getLocalPathItemQueryNullDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getLocalPathItemQueryNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
