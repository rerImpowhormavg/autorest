/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.Resource;
import com.microsoft.rest.SubResource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import java.io.IOException;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.Header;

public class ApiVersionLocalImpl implements ApiVersionLocal {
    private ApiVersionLocalService service;
    AutoRestAzureSpecialParametersTestClient client;

    public ApiVersionLocalImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClient client) {
        this.service = retrofit.create(ApiVersionLocalService.class);
        this.client = client;
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> getMethodLocalValid(String apiVersion) throws ServiceException {
        if (apiVersion == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getMethodLocalValid(apiVersion, this.client.getAcceptLanguage());
            return getMethodLocalValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMethodLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        if (apiVersion == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getMethodLocalValid(apiVersion, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMethodLocalValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getMethodLocalValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> getMethodLocalNull(String apiVersion) throws ServiceException {
        try {
            Call<ResponseBody> call = service.getMethodLocalNull(apiVersion, this.client.getAcceptLanguage());
            return getMethodLocalNullDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMethodLocalNullAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.getMethodLocalNull(apiVersion, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMethodLocalNullDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getMethodLocalNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> getPathLocalValid(String apiVersion) throws ServiceException {
        if (apiVersion == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getPathLocalValid(apiVersion, this.client.getAcceptLanguage());
            return getPathLocalValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getPathLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        if (apiVersion == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getPathLocalValid(apiVersion, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getPathLocalValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getPathLocalValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion The api version, which appears in the query, the value is always '2.0'. Possible values for this parameter include: '2.0'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> getSwaggerLocalValid(String apiVersion) throws ServiceException {
        if (apiVersion == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getSwaggerLocalValid(apiVersion, this.client.getAcceptLanguage());
            return getSwaggerLocalValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion The api version, which appears in the query, the value is always '2.0'. Possible values for this parameter include: '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getSwaggerLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        if (apiVersion == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getSwaggerLocalValid(apiVersion, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSwaggerLocalValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getSwaggerLocalValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
