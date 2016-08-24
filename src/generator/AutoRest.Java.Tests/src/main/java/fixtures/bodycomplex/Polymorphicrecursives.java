/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.Fish;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in Polymorphicrecursives.
 */
public interface Polymorphicrecursives {
    /**
     * Get complex types that are polymorphic and have recursive references.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Fish object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Fish> getValid() throws ErrorException, IOException;

    /**
     * Get complex types that are polymorphic and have recursive references.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Fish> getValidAsync(final ServiceCallback<Fish> serviceCallback);

    /**
     * Put complex types that are polymorphic and have recursive references.
     *
     * @param complexBody Please put a salmon that looks like this:
     {
         "fishtype": "salmon",
         "species": "king",
         "length": 1,
         "age": 1,
         "location": "alaska",
         "iswild": true,
         "siblings": [
             {
                 "fishtype": "shark",
                 "species": "predator",
                 "length": 20,
                 "age": 6,
                 "siblings": [
                     {
                         "fishtype": "salmon",
                         "species": "coho",
                         "length": 2,
                         "age": 2,
                         "location": "atlantic",
                         "iswild": true,
                         "siblings": [
                             {
                                 "fishtype": "shark",
                                 "species": "predator",
                                 "length": 20,
                                 "age": 6
                             },
                             {
                                 "fishtype": "sawshark",
                                 "species": "dangerous",
                                 "length": 10,
                                 "age": 105
                             }
                         ]
                     },
                     {
                         "fishtype": "sawshark",
                         "species": "dangerous",
                         "length": 10,
                         "age": 105
                     }
                 ]
             },
             {
                 "fishtype": "sawshark",
                 "species": "dangerous",
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putValid(Fish complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types that are polymorphic and have recursive references.
     *
     * @param complexBody Please put a salmon that looks like this:
     {
         "fishtype": "salmon",
         "species": "king",
         "length": 1,
         "age": 1,
         "location": "alaska",
         "iswild": true,
         "siblings": [
             {
                 "fishtype": "shark",
                 "species": "predator",
                 "length": 20,
                 "age": 6,
                 "siblings": [
                     {
                         "fishtype": "salmon",
                         "species": "coho",
                         "length": 2,
                         "age": 2,
                         "location": "atlantic",
                         "iswild": true,
                         "siblings": [
                             {
                                 "fishtype": "shark",
                                 "species": "predator",
                                 "length": 20,
                                 "age": 6
                             },
                             {
                                 "fishtype": "sawshark",
                                 "species": "dangerous",
                                 "length": 10,
                                 "age": 105
                             }
                         ]
                     },
                     {
                         "fishtype": "sawshark",
                         "species": "dangerous",
                         "length": 10,
                         "age": 105
                     }
                 ]
             },
             {
                 "fishtype": "sawshark",
                 "species": "dangerous",
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putValidAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback);

}
