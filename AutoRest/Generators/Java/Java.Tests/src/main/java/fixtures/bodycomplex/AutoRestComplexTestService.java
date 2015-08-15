/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

/**
 * The interface for AutoRestComplexTestService class.
 */
public interface AutoRestComplexTestService {
    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    String getBaseUri();

    /**
     * Gets the BasicOperations object to access its operations.
     * @return the basicOperations value.
     */
    BasicOperations getBasicOperations();

    /**
     * Gets the Primitive object to access its operations.
     * @return the primitive value.
     */
    Primitive getPrimitive();

    /**
     * Gets the Array object to access its operations.
     * @return the array value.
     */
    Array getArray();

    /**
     * Gets the Dictionary object to access its operations.
     * @return the dictionary value.
     */
    Dictionary getDictionary();

    /**
     * Gets the Inheritance object to access its operations.
     * @return the inheritance value.
     */
    Inheritance getInheritance();

    /**
     * Gets the Polymorphism object to access its operations.
     * @return the polymorphism value.
     */
    Polymorphism getPolymorphism();

    /**
     * Gets the Polymorphicrecursive object to access its operations.
     * @return the polymorphicrecursive value.
     */
    Polymorphicrecursive getPolymorphicrecursive();
}
