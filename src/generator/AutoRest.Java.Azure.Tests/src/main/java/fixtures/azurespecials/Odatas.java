/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Odatas.
 */
public interface Odatas {
    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     */
    void getWithFilter();

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getWithFilterAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getWithFilterAsync();

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getWithFilterWithServiceResponseAsync();
    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param filter The filter parameter with value '$filter=id gt 5 and name eq 'foo''.
     * @param top The top parameter with value 10.
     * @param orderby The orderby parameter with value id.
     */
    void getWithFilter(String filter, Integer top, String orderby);

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param filter The filter parameter with value '$filter=id gt 5 and name eq 'foo''.
     * @param top The top parameter with value 10.
     * @param orderby The orderby parameter with value id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getWithFilterAsync(String filter, Integer top, String orderby, final ServiceCallback<Void> serviceCallback);

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param filter The filter parameter with value '$filter=id gt 5 and name eq 'foo''.
     * @param top The top parameter with value 10.
     * @param orderby The orderby parameter with value id.
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getWithFilterAsync(String filter, Integer top, String orderby);

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param filter The filter parameter with value '$filter=id gt 5 and name eq 'foo''.
     * @param top The top parameter with value 10.
     * @param orderby The orderby parameter with value id.
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getWithFilterWithServiceResponseAsync(String filter, Integer top, String orderby);

}
