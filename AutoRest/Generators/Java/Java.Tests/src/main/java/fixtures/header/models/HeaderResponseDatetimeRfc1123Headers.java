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

import com.microsoft.rest.DateTimeRfc1123;

/**
 * Defines headers for responseDatetimeRfc1123 operation.
 */
public class HeaderResponseDatetimeRfc1123Headers {
    /**
     * response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01
     * Jan 0001 00:00:00 GMT".
     */
    private DateTimeRfc1123 value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public DateTime getValue() {
        if (this.value == null) {
            return null;
        }
        return this.value.getDateTime();
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(DateTime value) {
        this.value = new DateTimeRfc1123(value);
    }

}
