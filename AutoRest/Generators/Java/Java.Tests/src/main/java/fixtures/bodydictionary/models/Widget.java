/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydictionary.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Widget model.
 */
public class Widget {
    /**
     * The integer property.
     */
    private Integer integer;

    /**
     * The stringProperty property.
     */
    @JsonProperty(value = "string")
    private String stringProperty;

    /**
     * Get the integer value.
     *
     * @return the integer value
     */
    public Integer getInteger() {
        return this.integer;
    }

    /**
     * Set the integer value.
     *
     * @param integer the integer value to set
     */
    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    /**
     * Get the stringProperty value.
     *
     * @return the stringProperty value
     */
    public String getStringProperty() {
        return this.stringProperty;
    }

    /**
     * Set the stringProperty value.
     *
     * @param stringProperty the stringProperty value to set
     */
    public void setStringProperty(String stringProperty) {
        this.stringProperty = stringProperty;
    }

}
