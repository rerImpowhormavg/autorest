/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.subscriptionidapiversion;

import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.AzureClient;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.Resource;

/**
 * The interface for MicrosoftAzureTestUrl class.
 */
public interface MicrosoftAzureTestUrl {
    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    String getBaseUri();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets The management credentials for Azure..
     *
     * @return the credentials value.
     */
    ServiceClientCredentials getCredentials();

    /**
     * Gets Subscription Id..
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Sets Subscription Id..
     *
     * @param subscriptionId the subscriptionId value.
     */
    void setSubscriptionId(String subscriptionId);

    /**
     * Gets API Version with value '2014-04-01-preview'..
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String getAcceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    void setAcceptLanguage(String acceptLanguage);

    /**
     * Gets The retry timeout for Long Running Operations..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int getLongRunningOperationRetryTimeout();

    /**
     * Sets The retry timeout for Long Running Operations..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets the Group object to access its operations.
     * @return the group value.
     */
    Group getGroup();

}
