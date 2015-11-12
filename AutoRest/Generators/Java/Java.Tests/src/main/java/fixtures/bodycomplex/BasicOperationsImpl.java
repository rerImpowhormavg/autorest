/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodycomplex.models.Basic;
import fixtures.bodycomplex.models.Error;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class BasicOperationsImpl implements BasicOperations {
    private BasicService service;
    AutoRestComplexTestService client;

    public BasicOperationsImpl(Retrofit retrofit, AutoRestComplexTestService client) {
        this.service = retrofit.create(BasicService.class);
        this.client = client;
    }

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}
     *
     * @return the Basic object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Basic> getValid() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getValid();
            return getValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getValidAsync(final ServiceCallback<Basic> serviceCallback) {
        Call<ResponseBody> call = service.getValid();
        call.enqueue(new ServiceResponseCallback<Basic>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Basic> getValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Basic>()
                .register(200, new TypeToken<Basic>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> putValid(Basic complexBody) throws ServiceException {
        if (complexBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter complexBody is required and cannot be null."));
        }
        Validator.validate(complexBody);
        try {
            Call<ResponseBody> call = service.putValid(complexBody);
            return putValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putValidAsync(Basic complexBody, final ServiceCallback<Void> serviceCallback) {
        if (complexBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter complexBody is required and cannot be null.")));
            return null;
        }
        Validator.validate(complexBody, serviceCallback);
        Call<ResponseBody> call = service.putValid(complexBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get a basic complex type that is invalid for the local strong type
     *
     * @return the Basic object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Basic> getInvalid() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getInvalid();
            return getInvalidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get a basic complex type that is invalid for the local strong type
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getInvalidAsync(final ServiceCallback<Basic> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        call.enqueue(new ServiceResponseCallback<Basic>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getInvalidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Basic> getInvalidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Basic>()
                .register(200, new TypeToken<Basic>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get a basic complex type that is empty
     *
     * @return the Basic object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Basic> getEmpty() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getEmpty();
            return getEmptyDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get a basic complex type that is empty
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getEmptyAsync(final ServiceCallback<Basic> serviceCallback) {
        Call<ResponseBody> call = service.getEmpty();
        call.enqueue(new ServiceResponseCallback<Basic>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getEmptyDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Basic> getEmptyDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Basic>()
                .register(200, new TypeToken<Basic>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get a basic complex type whose properties are null
     *
     * @return the Basic object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Basic> getNull() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getNull();
            return getNullDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get a basic complex type whose properties are null
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getNullAsync(final ServiceCallback<Basic> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        call.enqueue(new ServiceResponseCallback<Basic>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNullDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Basic> getNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Basic>()
                .register(200, new TypeToken<Basic>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get a basic complex type while the server doesn't provide a response payload
     *
     * @return the Basic object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Basic> getNotProvided() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getNotProvided();
            return getNotProvidedDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get a basic complex type while the server doesn't provide a response payload
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getNotProvidedAsync(final ServiceCallback<Basic> serviceCallback) {
        Call<ResponseBody> call = service.getNotProvided();
        call.enqueue(new ServiceResponseCallback<Basic>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNotProvidedDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Basic> getNotProvidedDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Basic>()
                .register(200, new TypeToken<Basic>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
