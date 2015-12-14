/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for GreyscaleColors.
 */
public enum GreyscaleColors {
    /** Enum value White. */
    WHITE("White"),

    /** Enum value black. */
    BLACK("black"),

    /** Enum value GREY. */
    GREY("GREY");

    /** The actual serialized value for a GreyscaleColors instance. */
    private String value;

    private GreyscaleColors(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a GreyscaleColors instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a GreyscaleColors instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed GreyscaleColors object, or null if unable to parse.
     */
    @JsonCreator
    public static GreyscaleColors fromValue(String value) {
        GreyscaleColors[] items = GreyscaleColors.values();
        for (GreyscaleColors item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
