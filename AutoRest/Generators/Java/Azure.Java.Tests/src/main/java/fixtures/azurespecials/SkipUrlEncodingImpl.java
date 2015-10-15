/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

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
import fixtures.azurespecials.models.Error;

public class SkipUrlEncodingImpl implements SkipUrlEncoding {
    private SkipUrlEncodingService service;
    AutoRestAzureSpecialParametersTestClient client;

    public SkipUrlEncodingImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClient client) {
        this.service = retrofit.create(SkipUrlEncodingService.class);
        this.client = client;
    }

    /**
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getMethodPathValid(String unencodedPathParam) throws ServiceException {
        if (unencodedPathParam == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getMethodPathValid(unencodedPathParam, this.client.getAcceptLanguage());
            ServiceResponse<Void> response = getMethodPathValidDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMethodPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback) {
        if (unencodedPathParam == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getMethodPathValid(unencodedPathParam, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMethodPathValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getMethodPathValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getPathPathValid(String unencodedPathParam) throws ServiceException {
        if (unencodedPathParam == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getPathPathValid(unencodedPathParam, this.client.getAcceptLanguage());
            ServiceResponse<Void> response = getPathPathValidDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getPathPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback) {
        if (unencodedPathParam == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getPathPathValid(unencodedPathParam, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getPathPathValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getPathPathValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @param unencodedPathParam An unencoded path parameter with value 'path1/path2/path3'. Possible values for this parameter include: 'path1/path2/path3'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getSwaggerPathValid(String unencodedPathParam) throws ServiceException {
        if (unencodedPathParam == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getSwaggerPathValid(unencodedPathParam, this.client.getAcceptLanguage());
            ServiceResponse<Void> response = getSwaggerPathValidDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param unencodedPathParam An unencoded path parameter with value 'path1/path2/path3'. Possible values for this parameter include: 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getSwaggerPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback) {
        if (unencodedPathParam == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getSwaggerPathValid(unencodedPathParam, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSwaggerPathValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getSwaggerPathValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getMethodQueryValid(String q1) throws ServiceException {
        if (q1 == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter q1 is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getMethodQueryValid(q1, this.client.getAcceptLanguage());
            ServiceResponse<Void> response = getMethodQueryValidDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMethodQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        if (q1 == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter q1 is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getMethodQueryValid(q1, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMethodQueryValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getMethodQueryValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @param q1 Unencoded query parameter with value null
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getMethodQueryNull(String q1) throws ServiceException {
        try {
            Call<ResponseBody> call = service.getMethodQueryNull(q1, this.client.getAcceptLanguage());
            ServiceResponse<Void> response = getMethodQueryNullDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param q1 Unencoded query parameter with value null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMethodQueryNullAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.getMethodQueryNull(q1, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMethodQueryNullDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getMethodQueryNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getPathQueryValid(String q1) throws ServiceException {
        if (q1 == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter q1 is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getPathQueryValid(q1, this.client.getAcceptLanguage());
            ServiceResponse<Void> response = getPathQueryValidDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getPathQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        if (q1 == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter q1 is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getPathQueryValid(q1, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getPathQueryValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getPathQueryValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @param q1 An unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'. Possible values for this parameter include: 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getSwaggerQueryValid(String q1) throws ServiceException {
        try {
            Call<ResponseBody> call = service.getSwaggerQueryValid(q1, this.client.getAcceptLanguage());
            ServiceResponse<Void> response = getSwaggerQueryValidDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param q1 An unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'. Possible values for this parameter include: 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getSwaggerQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.getSwaggerQueryValid(q1, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSwaggerQueryValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getSwaggerQueryValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
