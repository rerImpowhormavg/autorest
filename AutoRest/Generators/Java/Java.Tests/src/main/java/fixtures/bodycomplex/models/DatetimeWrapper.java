/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import org.joda.time.DateTime;

/**
 * The DatetimeWrapper model.
 */
public class DatetimeWrapper {
    /**
     * The field property.
     */
    private DateTime field;

    /**
     * The now property.
     */
    private DateTime now;

    /**
     * Get the field value.
     *
     * @return the field value
     */
    public DateTime getField() {
        return this.field;
    }

    /**
     * Set the field value.
     *
     * @param field the field value to set
     */
    public void setField(DateTime field) {
        this.field = field;
    }

    /**
     * Get the now value.
     *
     * @return the now value
     */
    public DateTime getNow() {
        return this.now;
    }

    /**
     * Set the now value.
     *
     * @param now the now value to set
     */
    public void setNow(DateTime now) {
        this.now = now;
    }

}
