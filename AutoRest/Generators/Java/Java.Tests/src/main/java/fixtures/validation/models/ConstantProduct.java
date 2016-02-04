/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The product documentation.
 */
public class ConstantProduct {
    /**
     * Constant string.
     */
    @JsonProperty(required = true)
    private String constProperty;

    /**
     * Constant string2.
     */
    private String constProperty2;

    /**
     * Get the constProperty value.
     *
     * @return the constProperty value
     */
    public String getConstProperty() {
        return this.constProperty;
    }

    /**
     * Set the constProperty value.
     *
     * @param constProperty the constProperty value to set
     */
    public void setConstProperty(String constProperty) {
        this.constProperty = constProperty;
    }

    /**
     * Get the constProperty2 value.
     *
     * @return the constProperty2 value
     */
    public String getConstProperty2() {
        return this.constProperty2;
    }

    /**
     * Set the constProperty2 value.
     *
     * @param constProperty2 the constProperty2 value to set
     */
    public void setConstProperty2(String constProperty2) {
        this.constProperty2 = constProperty2;
    }

}
