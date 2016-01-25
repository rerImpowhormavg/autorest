/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.resourceflattening.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FlattenedProduct model.
 */
public class FlattenedProduct extends Resource {
    /**
     * The pname property.
     */
    @JsonProperty(value = "properties.pname")
    private String pname;

    /**
     * The flattenedProductType property.
     */
    @JsonProperty(value = "properties.type")
    private String flattenedProductType;

    /**
     * Possible values for this property include: 'Succeeded', 'Failed',
     * 'canceled', 'Accepted', 'Creating', 'Created', 'Updating', 'Updated',
     * 'Deleting', 'Deleted', 'OK'.
     */
    @JsonProperty(value = "properties.provisioningStateValues")
    private String provisioningStateValues;

    /**
     * The provisioningState property.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the pname value.
     *
     * @return the pname value
     */
    public String getPname() {
        return this.pname;
    }

    /**
     * Set the pname value.
     *
     * @param pname the pname value to set
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * Get the flattenedProductType value.
     *
     * @return the flattenedProductType value
     */
    public String getFlattenedProductType() {
        return this.flattenedProductType;
    }

    /**
     * Set the flattenedProductType value.
     *
     * @param flattenedProductType the flattenedProductType value to set
     */
    public void setFlattenedProductType(String flattenedProductType) {
        this.flattenedProductType = flattenedProductType;
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

}
