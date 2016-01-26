/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;

import org.joda.time.Period;

/**
 * Defines headers for responseDuration operation.
 */
public class HeaderResponseDurationHeaders {
    /**
     * response with header values "P123DT22H14M12.011S".
     */
    private Period value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Period getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(Period value) {
        this.value = value;
    }

}
