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

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodycomplex.models.Fish;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in Polymorphism.
 */
public interface Polymorphism {
    /**
     * The interface defining all the services for Polymorphism to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PolymorphismService {
        @GET("/complex/polymorphism/valid")
        Call<ResponseBody> getValid();

        @PUT("/complex/polymorphism/valid")
        Call<ResponseBody> putValid(@Body Fish complexBody);

        @PUT("/complex/polymorphism/missingrequired/invalid")
        Call<ResponseBody> putValidMissingRequired(@Body Fish complexBody);

    }
    /**
     * Get complex types that are polymorphic
     *
     * @return the Fish object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Fish> getValid() throws ServiceException;

    /**
     * Get complex types that are polymorphic
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getValidAsync(final ServiceCallback<Fish> serviceCallback);

    /**
     * Put complex types that are polymorphic
     *
     * @param complexBody Please put a salmon that looks like this:
 {
         'dtype':'Salmon',
         'location':'alaska',
         'iswild':true,
         'species':'king',
         'length':1.0,
         'siblings':[
           {
             'dtype':'Shark',
             'age':6,
             'birthday': '2012-01-05T01:00:00Z',
             'length':20.0,
             'species':'predator',
           },
           {
             'dtype':'Sawshark',
             'age':105,
             'birthday': '1900-01-05T01:00:00Z',
             'length':10.0,
             'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
             'species':'dangerous',
           }
         ]
       };
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putValid(Fish complexBody) throws ServiceException;

    /**
     * Put complex types that are polymorphic
     *
     * @param complexBody Please put a salmon that looks like this:
 {
         'dtype':'Salmon',
         'location':'alaska',
         'iswild':true,
         'species':'king',
         'length':1.0,
         'siblings':[
           {
             'dtype':'Shark',
             'age':6,
             'birthday': '2012-01-05T01:00:00Z',
             'length':20.0,
             'species':'predator',
           },
           {
             'dtype':'Sawshark',
             'age':105,
             'birthday': '1900-01-05T01:00:00Z',
             'length':10.0,
             'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
             'species':'dangerous',
           }
         ]
       };
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putValidAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
 {
     "dtype": "sawshark",
     "species": "snaggle toothed",
     "length": 18.5,
     "age": 2,
     "birthday": "2013-06-01T01:00:00Z",
     "location": "alaska",
     "picture": base64(FF FF FF FF FE),
     "siblings": [
         {
             "dtype": "shark",
             "species": "predator",
             "birthday": "2012-01-05T01:00:00Z",
             "length": 20,
             "age": 6
         },
         {
             "dtype": "sawshark",
             "species": "dangerous",
             "picture": base64(FF FF FF FF FE),
             "length": 10,
             "age": 105
         }
     ]
 }
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putValidMissingRequired(Fish complexBody) throws ServiceException;

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
 {
     "dtype": "sawshark",
     "species": "snaggle toothed",
     "length": 18.5,
     "age": 2,
     "birthday": "2013-06-01T01:00:00Z",
     "location": "alaska",
     "picture": base64(FF FF FF FF FE),
     "siblings": [
         {
             "dtype": "shark",
             "species": "predator",
             "birthday": "2012-01-05T01:00:00Z",
             "length": 20,
             "age": 6
         },
         {
             "dtype": "sawshark",
             "species": "dangerous",
             "picture": base64(FF FF FF FF FE),
             "length": 10,
             "age": 105
         }
     ]
 }
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putValidMissingRequiredAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback);

}
