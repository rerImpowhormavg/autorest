// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


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
import fixtures.bodycomplex.models.Fish;
import fixtures.bodycomplex.models.Error;

public class PolymorphicrecursiveImpl implements Polymorphicrecursive {
    private PolymorphicrecursiveService service;

    public PolymorphicrecursiveImpl(RestAdapter restAdapter) {
        service = restAdapter.create(PolymorphicrecursiveService.class);
    }

    /**
     * Get complex types that are polymorphic and have recursive references
     *
     * @return the Fish object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Fish getValid() throws ServiceException {
        try {
            ServiceResponse<Fish> response = getValidDelegate(service.getValid(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Fish> response = getValidDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get complex types that are polymorphic and have recursive references
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getValidAsync(final ServiceCallback<Fish> serviceCallback) {
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

    private ServiceResponse<Fish> getValidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Fish>()
                .register(200, new TypeToken<Fish>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put complex types that are polymorphic and have recursive references
     *
     * @param complexBody Please put a salmon that looks like this:
 {
     "dtype": "salmon",
     "species": "king",
     "length": 1,
     "age": 1,
     "location": "alaska",
     "iswild": true,
     "siblings": [
         {
             "dtype": "shark",
             "species": "predator",
             "length": 20,
             "age": 6,
             "siblings": [
                 {
                     "dtype": "salmon",
                     "species": "coho",
                     "length": 2,
                     "age": 2,
                     "location": "atlantic",
                     "iswild": true,
                     "siblings": [
                         {
                             "dtype": "shark",
                             "species": "predator",
                             "length": 20,
                             "age": 6
                         },
                         {
                             "dtype": "sawshark",
                             "species": "dangerous",
                             "length": 10,
                             "age": 105
                         }
                     ]
                 },
                 {
                     "dtype": "sawshark",
                     "species": "dangerous",
                     "length": 10,
                     "age": 105
                 }
             ]
         },
         {
             "dtype": "sawshark",
             "species": "dangerous",
             "length": 10,
             "age": 105
         }
     ]
 }
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putValid(Fish complexBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putValidDelegate(service.putValid(complexBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putValidDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put complex types that are polymorphic and have recursive references
     *
     * @param complexBody Please put a salmon that looks like this:
 {
     "dtype": "salmon",
     "species": "king",
     "length": 1,
     "age": 1,
     "location": "alaska",
     "iswild": true,
     "siblings": [
         {
             "dtype": "shark",
             "species": "predator",
             "length": 20,
             "age": 6,
             "siblings": [
                 {
                     "dtype": "salmon",
                     "species": "coho",
                     "length": 2,
                     "age": 2,
                     "location": "atlantic",
                     "iswild": true,
                     "siblings": [
                         {
                             "dtype": "shark",
                             "species": "predator",
                             "length": 20,
                             "age": 6
                         },
                         {
                             "dtype": "sawshark",
                             "species": "dangerous",
                             "length": 10,
                             "age": 105
                         }
                     ]
                 },
                 {
                     "dtype": "sawshark",
                     "species": "dangerous",
                     "length": 10,
                     "age": 105
                 }
             ]
         },
         {
             "dtype": "sawshark",
             "species": "dangerous",
             "length": 10,
             "age": 105
         }
     ]
 }
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putValidAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback) {
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

}
