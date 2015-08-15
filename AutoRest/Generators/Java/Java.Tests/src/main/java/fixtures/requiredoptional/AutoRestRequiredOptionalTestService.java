/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

/**
 * The interface for AutoRestRequiredOptionalTestService class.
 */
public interface AutoRestRequiredOptionalTestService {
    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    String getBaseUri();

    /**
     * Gets number of items to skip.
     * @return the requiredGlobalPath value.
     */
    String getRequiredGlobalPath();

    /**
     * Gets number of items to skip.
     * @return the requiredGlobalQuery value.
     */
    String getRequiredGlobalQuery();

    /**
     * Gets the Implicit object to access its operations.
     * @return the implicit value.
     */
    Implicit getImplicit();

    /**
     * Gets the Explicit object to access its operations.
     * @return the explicit value.
     */
    Explicit getExplicit();
}
