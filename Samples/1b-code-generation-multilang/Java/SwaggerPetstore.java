/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package javanamespace;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;
import java.util.List;
import javanamespace.models.ErrorException;
import javanamespace.models.ListPetsHeaders;
import javanamespace.models.Pet;
import rx.Observable;
import com.microsoft.rest.RestClient;

/**
 * The interface for SwaggerPetstore class.
 */
public interface SwaggerPetstore {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "http://petstore.swagger.io/v1";

    /**
     * List all pets.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;Pet&gt; object if successful.
     */
    List<Pet> listPets();

    /**
     * List all pets.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Pet>> listPetsAsync(final ServiceCallback<List<Pet>> serviceCallback);

    /**
     * List all pets.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Pet&gt; object
     */
    Observable<List<Pet>> listPetsAsync();

    /**
     * List all pets.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Pet&gt; object
     */
    Observable<ServiceResponseWithHeaders<List<Pet>, ListPetsHeaders>> listPetsWithServiceResponseAsync();
    /**
     * List all pets.
     *
     * @param limit How many items to return at one time (max 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;Pet&gt; object if successful.
     */
    List<Pet> listPets(Integer limit);

    /**
     * List all pets.
     *
     * @param limit How many items to return at one time (max 100)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Pet>> listPetsAsync(Integer limit, final ServiceCallback<List<Pet>> serviceCallback);

    /**
     * List all pets.
     *
     * @param limit How many items to return at one time (max 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Pet&gt; object
     */
    Observable<List<Pet>> listPetsAsync(Integer limit);

    /**
     * List all pets.
     *
     * @param limit How many items to return at one time (max 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Pet&gt; object
     */
    Observable<ServiceResponseWithHeaders<List<Pet>, ListPetsHeaders>> listPetsWithServiceResponseAsync(Integer limit);

    /**
     * Create a pet.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void createPets();

    /**
     * Create a pet.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createPetsAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Create a pet.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createPetsAsync();

    /**
     * Create a pet.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createPetsWithServiceResponseAsync();

    /**
     * Info for a specific pet.
     *
     * @param petId The id of the pet to retrieve
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;Pet&gt; object if successful.
     */
    List<Pet> showPetById(String petId);

    /**
     * Info for a specific pet.
     *
     * @param petId The id of the pet to retrieve
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Pet>> showPetByIdAsync(String petId, final ServiceCallback<List<Pet>> serviceCallback);

    /**
     * Info for a specific pet.
     *
     * @param petId The id of the pet to retrieve
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Pet&gt; object
     */
    Observable<List<Pet>> showPetByIdAsync(String petId);

    /**
     * Info for a specific pet.
     *
     * @param petId The id of the pet to retrieve
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Pet&gt; object
     */
    Observable<ServiceResponse<List<Pet>>> showPetByIdWithServiceResponseAsync(String petId);

}
