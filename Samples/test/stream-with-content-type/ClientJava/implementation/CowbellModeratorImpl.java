/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package streamwithcontenttype.implementation;

import .CowbellModerator;
import .Images;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the CowbellModerator class.
 */
public class CowbellModeratorImpl extends ServiceClient implements CowbellModerator {

    /**
     * The Images object to access its operations.
     */
    private Images images;

    /**
     * Gets the Images object to access its operations.
     * @return the Images object.
     */
    public Images images() {
        return this.images;
    }

    /**
     * Initializes an instance of CowbellModerator client.
     */
    public CowbellModeratorImpl() {
        this("https://localhost");
    }

    /**
     * Initializes an instance of CowbellModerator client.
     *
     * @param baseUrl the base URL of the host
     */
    public CowbellModeratorImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of CowbellModerator client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public CowbellModeratorImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://localhost", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of CowbellModerator client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public CowbellModeratorImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of CowbellModerator client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public CowbellModeratorImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.images = new ImagesImpl(retrofit(), this);
    }
}
