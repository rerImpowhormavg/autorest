/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LongWrapper model.
 */
public class LongWrapper {
    /**
     * The field1 property.
     */
    @JsonProperty(value = "field1")
    private Long field1;

    /**
     * The field2 property.
     */
    @JsonProperty(value = "field2")
    private Long field2;

    /**
     * Get the field1 value.
     *
     * @return the field1 value
     */
    public Long field1() {
        return this.field1;
    }

    /**
     * Set the field1 value.
     *
     * @param field1 the field1 value to set
     * @return the LongWrapper object itself.
     */
    public LongWrapper withField1(Long field1) {
        this.field1 = field1;
        return this;
    }

    /**
     * Get the field2 value.
     *
     * @return the field2 value
     */
    public Long field2() {
        return this.field2;
    }

    /**
     * Set the field2 value.
     *
     * @param field2 the field2 value to set
     * @return the LongWrapper object itself.
     */
    public LongWrapper withField2(Long field2) {
        this.field2 = field2;
        return this;
    }

}
