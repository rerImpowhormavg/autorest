/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package storage;

import .models.Usage;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Usages.
 */
public interface Usages {
    /**
     * Gets the current usage count and the limit for the resources under the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;Usage&gt; object if successful.
     */
    List<Usage> list();

    /**
     * Gets the current usage count and the limit for the resources under the subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Usage>> listAsync(final ServiceCallback<List<Usage>> serviceCallback);

    /**
     * Gets the current usage count and the limit for the resources under the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Usage&gt; object
     */
    Observable<List<Usage>> listAsync();

    /**
     * Gets the current usage count and the limit for the resources under the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Usage&gt; object
     */
    Observable<ServiceResponse<List<Usage>>> listWithServiceResponseAsync();

}
