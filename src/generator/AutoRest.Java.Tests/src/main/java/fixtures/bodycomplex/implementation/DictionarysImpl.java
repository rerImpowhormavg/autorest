/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import retrofit2.Retrofit;
import fixtures.bodycomplex.Dictionarys;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.Validator;
import fixtures.bodycomplex.models.DictionaryWrapper;
import fixtures.bodycomplex.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Dictionarys.
 */
public final class DictionarysImpl implements Dictionarys {
    /** The Retrofit service to perform REST calls. */
    private DictionarysService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Dictionarys.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DictionarysImpl(Retrofit retrofit, AutoRestComplexTestServiceImpl client) {
        this.service = retrofit.create(DictionarysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Dictionarys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DictionarysService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/dictionary/typed/valid")
        Observable<Response<ResponseBody>> getValid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/dictionary/typed/valid")
        Observable<Response<ResponseBody>> putValid(@Body DictionaryWrapper complexBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/dictionary/typed/empty")
        Observable<Response<ResponseBody>> getEmpty();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/dictionary/typed/empty")
        Observable<Response<ResponseBody>> putEmpty(@Body DictionaryWrapper complexBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/dictionary/typed/null")
        Observable<Response<ResponseBody>> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/dictionary/typed/notprovided")
        Observable<Response<ResponseBody>> getNotProvided();

    }

    /**
     * Get complex types with dictionary property.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DictionaryWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DictionaryWrapper> getValid() throws ErrorException, IOException {
        return getValidAsync().toBlocking().single();
    }

    /**
     * Get complex types with dictionary property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DictionaryWrapper> getValidAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceCall.create(getValidAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<ServiceResponse<DictionaryWrapper>> getValidAsync() {
        return service.getValid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DictionaryWrapper>>>() {
                @Override
                public Observable<ServiceResponse<DictionaryWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DictionaryWrapper> clientResponse = getValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DictionaryWrapper> getValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DictionaryWrapper, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DictionaryWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putValid(DictionaryWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException {
        return putValidAsync(complexBody).toBlocking().single();
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putValidAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putValidAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putValidAsync(DictionaryWrapper complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DictionaryWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DictionaryWrapper> getEmpty() throws ErrorException, IOException {
        return getEmptyAsync().toBlocking().single();
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DictionaryWrapper> getEmptyAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceCall.create(getEmptyAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<ServiceResponse<DictionaryWrapper>> getEmptyAsync() {
        return service.getEmpty()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DictionaryWrapper>>>() {
                @Override
                public Observable<ServiceResponse<DictionaryWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DictionaryWrapper> clientResponse = getEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DictionaryWrapper> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DictionaryWrapper, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DictionaryWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putEmpty(DictionaryWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException {
        return putEmptyAsync(complexBody).toBlocking().single();
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putEmptyAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putEmptyAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putEmptyAsync(DictionaryWrapper complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putEmpty(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DictionaryWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DictionaryWrapper> getNull() throws ErrorException, IOException {
        return getNullAsync().toBlocking().single();
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DictionaryWrapper> getNullAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceCall.create(getNullAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<ServiceResponse<DictionaryWrapper>> getNullAsync() {
        return service.getNull()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DictionaryWrapper>>>() {
                @Override
                public Observable<ServiceResponse<DictionaryWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DictionaryWrapper> clientResponse = getNullDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DictionaryWrapper> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DictionaryWrapper, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DictionaryWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DictionaryWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DictionaryWrapper> getNotProvided() throws ErrorException, IOException {
        return getNotProvidedAsync().toBlocking().single();
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DictionaryWrapper> getNotProvidedAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceCall.create(getNotProvidedAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<ServiceResponse<DictionaryWrapper>> getNotProvidedAsync() {
        return service.getNotProvided()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DictionaryWrapper>>>() {
                @Override
                public Observable<ServiceResponse<DictionaryWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DictionaryWrapper> clientResponse = getNotProvidedDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DictionaryWrapper> getNotProvidedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DictionaryWrapper, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DictionaryWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
