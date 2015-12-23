/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;

import org.joda.time.DateTime;

/**
 * Defines headers for responseDatetime operation.
 */
public class HeaderResponseDatetimeHeaders {
    /**
     * response with header values "2010-01-01T12:34:56Z" or
     * "0001-01-01T00:00:00Z".
     */
    private DateTime value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public DateTime getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(DateTime value) {
        this.value = value;
    }

}
