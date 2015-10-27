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

import org.apache.commons.codec.binary.Base64;

/**
 * The ByteWrapper model.
 */
public class ByteWrapper {
    /**
     * The field property.
     */
    private byte[] field;

    /**
     * Get the field value.
     *
     * @return the field value
     */ 
    public byte[] getField() {
        return this.field;
    }

    /**
     * Set the field value.
     *
     * @param field the field value to set
     */
    public void setField(byte[] field) {
        this.field = field;
    }

}
