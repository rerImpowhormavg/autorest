/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.modelflattening;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.modelflattening.models.FlattenedProduct;
import fixtures.modelflattening.models.FlattenParameterGroup;
import fixtures.modelflattening.models.Resource;
import fixtures.modelflattening.models.ResourceCollection;
import fixtures.modelflattening.models.SimpleProduct;
import java.util.List;
import java.util.Map;
import rx.Observable;

/**
 * The interface for AutoRestResourceFlatteningTestService class.
 */
public interface AutoRestResourceFlatteningTestService {
    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "http://localhost";

    /**
     * Put External Resource as an Array.
     *
     */
    void putArray();

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
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putArrayAsync();

    /**
     * Put External Resource as an Array.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putArrayWithServiceResponseAsync();
    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     */
    void putArray(List<Resource> resourceArray);

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
    Observable<ServiceResponse<Void>> putArrayWithServiceResponseAsync(List<Resource> resourceArray);

    /**
     * Get External Resource as an Array.
     *
     * @return the List&lt;FlattenedProduct&gt; object if successful.
     */
    List<FlattenedProduct> getArray();

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
    Observable<ServiceResponse<List<FlattenedProduct>>> getArrayWithServiceResponseAsync();

    /**
     * Put External Resource as a Dictionary.
     *
     */
    void putDictionary();

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
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putDictionaryAsync();

    /**
     * Put External Resource as a Dictionary.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putDictionaryWithServiceResponseAsync();
    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     */
    void putDictionary(Map<String, FlattenedProduct> resourceDictionary);

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
    Observable<ServiceResponse<Void>> putDictionaryWithServiceResponseAsync(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Get External Resource as a Dictionary.
     *
     * @return the Map&lt;String, FlattenedProduct&gt; object if successful.
     */
    Map<String, FlattenedProduct> getDictionary();

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
    Observable<ServiceResponse<Map<String, FlattenedProduct>>> getDictionaryWithServiceResponseAsync();

    /**
     * Put External Resource as a ResourceCollection.
     *
     */
    void putResourceCollection();

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
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putResourceCollectionAsync();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putResourceCollectionWithServiceResponseAsync();
    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     */
    void putResourceCollection(ResourceCollection resourceComplexObject);

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
    Observable<ServiceResponse<Void>> putResourceCollectionWithServiceResponseAsync(ResourceCollection resourceComplexObject);

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return the ResourceCollection object if successful.
     */
    ResourceCollection getResourceCollection();

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
    Observable<ServiceResponse<ResourceCollection>> getResourceCollectionWithServiceResponseAsync();

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct putSimpleProduct();

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<SimpleProduct> putSimpleProductAsync(final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @return the observable to the SimpleProduct object
     */
    Observable<SimpleProduct> putSimpleProductAsync();

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @return the observable to the SimpleProduct object
     */
    Observable<ServiceResponse<SimpleProduct>> putSimpleProductWithServiceResponseAsync();
    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct putSimpleProduct(SimpleProduct simpleBodyProduct);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<SimpleProduct> putSimpleProductAsync(SimpleProduct simpleBodyProduct, final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put
     * @return the observable to the SimpleProduct object
     */
    Observable<SimpleProduct> putSimpleProductAsync(SimpleProduct simpleBodyProduct);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put
     * @return the observable to the SimpleProduct object
     */
    Observable<ServiceResponse<SimpleProduct>> putSimpleProductWithServiceResponseAsync(SimpleProduct simpleBodyProduct);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct postFlattenedSimpleProduct(String productId, String maxProductDisplayName);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @return the observable to the SimpleProduct object
     */
    Observable<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @return the observable to the SimpleProduct object
     */
    Observable<ServiceResponse<SimpleProduct>> postFlattenedSimpleProductWithServiceResponseAsync(String productId, String maxProductDisplayName);
    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct postFlattenedSimpleProduct(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue, final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @return the observable to the SimpleProduct object
     */
    Observable<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @return the observable to the SimpleProduct object
     */
    Observable<ServiceResponse<SimpleProduct>> postFlattenedSimpleProductWithServiceResponseAsync(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct putSimpleProductWithGrouping(FlattenParameterGroup flattenParameterGroup);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<SimpleProduct> putSimpleProductWithGroupingAsync(FlattenParameterGroup flattenParameterGroup, final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation
     * @return the observable to the SimpleProduct object
     */
    Observable<SimpleProduct> putSimpleProductWithGroupingAsync(FlattenParameterGroup flattenParameterGroup);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation
     * @return the observable to the SimpleProduct object
     */
    Observable<ServiceResponse<SimpleProduct>> putSimpleProductWithGroupingWithServiceResponseAsync(FlattenParameterGroup flattenParameterGroup);

}
