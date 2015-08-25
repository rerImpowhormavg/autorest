/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import fixtures.bodycomplex.models.ArrayWrapper;
import fixtures.bodycomplex.models.Error;
import com.microsoft.rest.Validator;

public class ArrayImpl implements Array {
    private ArrayService service;

    public ArrayImpl(RestAdapter restAdapter) {
        service = restAdapter.create(ArrayService.class);
    }

    /**
     * Get complex types with array property
     *
     * @return the ArrayWrapper object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ArrayWrapper getValid() throws ServiceException {
        try {
            ServiceResponse<ArrayWrapper> response = getValidDelegate(service.getValid(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<ArrayWrapper> response = getValidDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get complex types with array property
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getValidAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        service.getValidAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getValidDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<ArrayWrapper> getValidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<ArrayWrapper>()
                .register(200, new TypeToken<ArrayWrapper>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put complex types with array property
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putValid(ArrayWrapper complexBody) throws ServiceException {
        if (complexBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter complexBody is required and cannot be null."));
        }
        Validator.validate(complexBody);
        try {
            ServiceResponse<Void> response = putValidDelegate(service.putValid(complexBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putValidDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put complex types with array property
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putValidAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        if (complexBody == null) {
           serviceCallback.failure(new ServiceException(
               new IllegalArgumentException("Parameter complexBody is required and cannot be null.")));
        }
        Validator.validate(complexBody, serviceCallback);
        service.putValidAsync(complexBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putValidDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putValidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get complex types with array property which is empty
     *
     * @return the ArrayWrapper object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ArrayWrapper getEmpty() throws ServiceException {
        try {
            ServiceResponse<ArrayWrapper> response = getEmptyDelegate(service.getEmpty(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<ArrayWrapper> response = getEmptyDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get complex types with array property which is empty
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getEmptyAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        service.getEmptyAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getEmptyDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<ArrayWrapper> getEmptyDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<ArrayWrapper>()
                .register(200, new TypeToken<ArrayWrapper>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put complex types with array property which is empty
     *
     * @param complexBody Please put an empty array
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putEmpty(ArrayWrapper complexBody) throws ServiceException {
        if (complexBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter complexBody is required and cannot be null."));
        }
        Validator.validate(complexBody);
        try {
            ServiceResponse<Void> response = putEmptyDelegate(service.putEmpty(complexBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putEmptyDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put complex types with array property which is empty
     *
     * @param complexBody Please put an empty array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putEmptyAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        if (complexBody == null) {
           serviceCallback.failure(new ServiceException(
               new IllegalArgumentException("Parameter complexBody is required and cannot be null.")));
        }
        Validator.validate(complexBody, serviceCallback);
        service.putEmptyAsync(complexBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putEmptyDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putEmptyDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get complex types with array property while server doesn't provide a
     * response payload
     *
     * @return the ArrayWrapper object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ArrayWrapper getNotProvided() throws ServiceException {
        try {
            ServiceResponse<ArrayWrapper> response = getNotProvidedDelegate(service.getNotProvided(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<ArrayWrapper> response = getNotProvidedDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get complex types with array property while server doesn't provide a
     * response payload
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getNotProvidedAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        service.getNotProvidedAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getNotProvidedDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<ArrayWrapper> getNotProvidedDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<ArrayWrapper>()
                .register(200, new TypeToken<ArrayWrapper>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
