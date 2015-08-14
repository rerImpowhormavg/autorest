// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodycomplex;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;

/**
 * Initializes a new instance of the AutoRestComplexTestService class.
 */
public class AutoRestComplexTestServiceImpl extends ServiceClient<AutoRestComplexTestService> implements AutoRestComplexTestService {
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private BasicOperations basicOperations;

    /**
     * Test Infrastructure for AutoRest
     * @return the basicOperations value.
     */
    public BasicOperations getBasicOperations() {
        return this.basicOperations;
    }

    private Primitive primitive;

    /**
     * Test Infrastructure for AutoRest
     * @return the primitive value.
     */
    public Primitive getPrimitive() {
        return this.primitive;
    }

    private Array array;

    /**
     * Test Infrastructure for AutoRest
     * @return the array value.
     */
    public Array getArray() {
        return this.array;
    }

    private Dictionary dictionary;

    /**
     * Test Infrastructure for AutoRest
     * @return the dictionary value.
     */
    public Dictionary getDictionary() {
        return this.dictionary;
    }

    private Inheritance inheritance;

    /**
     * Test Infrastructure for AutoRest
     * @return the inheritance value.
     */
    public Inheritance getInheritance() {
        return this.inheritance;
    }

    private Polymorphism polymorphism;

    /**
     * Test Infrastructure for AutoRest
     * @return the polymorphism value.
     */
    public Polymorphism getPolymorphism() {
        return this.polymorphism;
    }

    private Polymorphicrecursive polymorphicrecursive;

    /**
     * Test Infrastructure for AutoRest
     * @return the polymorphicrecursive value.
     */
    public Polymorphicrecursive getPolymorphicrecursive() {
        return this.polymorphicrecursive;
    }

    public AutoRestComplexTestServiceImpl() {
        this("http://localhost");
    }

    public AutoRestComplexTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    public AutoRestComplexTestServiceImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        this.basicOperations = new BasicOperations(restAdapter);
        this.primitive = new Primitive(restAdapter);
        this.array = new Array(restAdapter);
        this.dictionary = new Dictionary(restAdapter);
        this.inheritance = new Inheritance(restAdapter);
        this.polymorphism = new Polymorphism(restAdapter);
        this.polymorphicrecursive = new Polymorphicrecursive(restAdapter);
    }
}
