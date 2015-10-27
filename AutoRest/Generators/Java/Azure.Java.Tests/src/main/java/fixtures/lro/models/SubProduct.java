/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SubProduct model.
 */
public class SubProduct extends SubResource {
    /**
     * The provisioningState property.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Possible values for this property include: 'Succeeded', 'Failed',
     * 'canceled', 'Accepted', 'Creating', 'Created', 'Updating', 'Updated',
     * 'Deleting', 'Deleted', 'OK'.
     */
    @JsonProperty(value = "properties.provisioningStateValues")
    private String provisioningStateValues;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */ 
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * Get the provisioningStateValues value.
     *
     * @return the provisioningStateValues value
     */ 
    public String getProvisioningStateValues() {
        return this.provisioningStateValues;
    }

    /**
     * Set the provisioningStateValues value.
     *
     * @param provisioningStateValues the provisioningStateValues value to set
     */
    public void setProvisioningStateValues(String provisioningStateValues) {
        this.provisioningStateValues = provisioningStateValues;
    }

}
