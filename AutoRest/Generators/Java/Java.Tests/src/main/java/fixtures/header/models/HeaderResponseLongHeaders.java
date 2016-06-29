/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;


/**
 * Defines headers for responseLong operation.
 */
public class HeaderResponseLongHeaders {
    /**
     * response with header value "value": 105 or -2.
     */
    private Long value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Long value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the HeaderResponseLongHeaders object itself.
     */
    public HeaderResponseLongHeaders withValue(Long value) {
        this.value = value;
        return this;
    }

}
