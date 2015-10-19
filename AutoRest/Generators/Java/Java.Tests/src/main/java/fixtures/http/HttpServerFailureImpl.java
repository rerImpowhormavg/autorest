/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Response;
import fixtures.http.models.Error;

public class HttpServerFailureImpl implements HttpServerFailure {
    private HttpServerFailureService service;
    AutoRestHttpInfrastructureTestService client;

    public HttpServerFailureImpl(Retrofit retrofit, AutoRestHttpInfrastructureTestService client) {
        this.service = retrofit.create(HttpServerFailureService.class);
        this.client = client;
    }

    /**
     * Return 501 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Error head501() throws ServiceException {
        try {
            Call<Void> call = service.head501();
            ServiceResponse<Error> response = head501Delegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Return 501 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<Void> head501Async(final ServiceCallback<Error> serviceCallback) {
        Call<Void> call = service.head501();
        call.enqueue(new ServiceResponseEmptyCallback<Error>(serviceCallback) {
            @Override
            public void onResponse(Response<Void> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(head501Delegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Error> head501Delegate(Response<Void> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .buildEmpty(response, retrofit);
    }

    /**
     * Return 501 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Error get501() throws ServiceException {
        try {
            Call<ResponseBody> call = service.get501();
            ServiceResponse<Error> response = get501Delegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Return 501 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> get501Async(final ServiceCallback<Error> serviceCallback) {
        Call<ResponseBody> call = service.get501();
        call.enqueue(new ServiceResponseCallback<Error>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(get501Delegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Error> get501Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Return 505 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Error post505(Boolean booleanValue) throws ServiceException {
        try {
            Call<ResponseBody> call = service.post505(booleanValue);
            ServiceResponse<Error> response = post505Delegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Return 505 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> post505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        Call<ResponseBody> call = service.post505(booleanValue);
        call.enqueue(new ServiceResponseCallback<Error>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(post505Delegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Error> post505Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Return 505 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Error delete505(Boolean booleanValue) throws ServiceException {
        try {
            Call<ResponseBody> call = service.delete505(booleanValue);
            ServiceResponse<Error> response = delete505Delegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Return 505 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> delete505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        Call<ResponseBody> call = service.delete505(booleanValue);
        call.enqueue(new ServiceResponseCallback<Error>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(delete505Delegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Error> delete505Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
