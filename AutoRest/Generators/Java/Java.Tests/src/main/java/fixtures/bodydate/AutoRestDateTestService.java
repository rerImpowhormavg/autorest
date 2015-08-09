// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodydate;

import com.microsoft.rest.ServiceClient;

/**
 * The interface for AutoRestDateTestService class.
 */
public interface AutoRestDateTestService {
    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    String getBaseUri();

    /**
     * Test Infrastructure for AutoRest
     * @return the dateOperations value.
     */
    DateOperations getDateOperations();
}
