/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureresource;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.Resource;
import com.microsoft.azure.RestClient;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.azureresource.models.ErrorException;
import fixtures.azureresource.models.FlattenedProduct;
import fixtures.azureresource.models.ResourceCollection;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import rx.Observable;

/**
 * The interface for AutoRestResourceFlatteningTestService class.
 */
public interface AutoRestResourceFlatteningTestService {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    AutoRestResourceFlatteningTestService withAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    AutoRestResourceFlatteningTestService withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    AutoRestResourceFlatteningTestService withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Put External Resource as an Array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putArray() throws ErrorException, IOException;

    /**
     * Put External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putArrayAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putArrayAsync();

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putArrayAsyncWithServiceResponse();
    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putArray(List<Resource> resourceArray) throws ErrorException, IOException;

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putArrayAsync(List<Resource> resourceArray, final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putArrayAsync(List<Resource> resourceArray);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putArrayAsyncWithServiceResponse(List<Resource> resourceArray);

    /**
     * Get External Resource as an Array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;FlattenedProduct&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    List<FlattenedProduct> getArray() throws ErrorException, IOException;

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<List<FlattenedProduct>> getArrayAsync(final ServiceCallback<List<FlattenedProduct>> serviceCallback);

    /**
     * Get External Resource as an Array.
     *
     * @return the observable to the List&lt;FlattenedProduct&gt; object
     */
    Observable<List<FlattenedProduct>> getArrayAsync();

    /**
     * Get External Resource as an Array.
     *
     * @return the observable to the List&lt;FlattenedProduct&gt; object
     */
    Observable<ServiceResponse<List<FlattenedProduct>>> getArrayAsyncWithServiceResponse();

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putDictionary() throws ErrorException, IOException;

    /**
     * Put External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putDictionaryAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putDictionaryAsync();

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putDictionaryAsyncWithServiceResponse();
    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putDictionary(Map<String, FlattenedProduct> resourceDictionary) throws ErrorException, IOException;

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary, final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putDictionaryAsyncWithServiceResponse(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, FlattenedProduct&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    Map<String, FlattenedProduct> getDictionary() throws ErrorException, IOException;

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Map<String, FlattenedProduct>> getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProduct>> serviceCallback);

    /**
     * Get External Resource as a Dictionary.
     *
     * @return the observable to the Map&lt;String, FlattenedProduct&gt; object
     */
    Observable<Map<String, FlattenedProduct>> getDictionaryAsync();

    /**
     * Get External Resource as a Dictionary.
     *
     * @return the observable to the Map&lt;String, FlattenedProduct&gt; object
     */
    Observable<ServiceResponse<Map<String, FlattenedProduct>>> getDictionaryAsyncWithServiceResponse();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putResourceCollection() throws ErrorException, IOException;

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putResourceCollectionAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putResourceCollectionAsync();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putResourceCollectionAsyncWithServiceResponse();
    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void putResourceCollection(ResourceCollection resourceComplexObject) throws ErrorException, IOException;

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putResourceCollectionAsync(ResourceCollection resourceComplexObject, final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putResourceCollectionAsync(ResourceCollection resourceComplexObject);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putResourceCollectionAsyncWithServiceResponse(ResourceCollection resourceComplexObject);

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ResourceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ResourceCollection getResourceCollection() throws ErrorException, IOException;

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ResourceCollection> getResourceCollectionAsync(final ServiceCallback<ResourceCollection> serviceCallback);

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return the observable to the ResourceCollection object
     */
    Observable<ResourceCollection> getResourceCollectionAsync();

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return the observable to the ResourceCollection object
     */
    Observable<ServiceResponse<ResourceCollection>> getResourceCollectionAsyncWithServiceResponse();

}
