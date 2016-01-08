/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for Colors.
 */
public enum Colors {
    /** Enum value red color. */
    RED_COLOR("red color"),

    /** Enum value green-color. */
    GREEN_COLOR("green-color"),

    /** Enum value blue_color. */
    BLUE_COLOR("blue_color");

    /** The actual serialized value for a Colors instance. */
    private String value;

    Colors(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a Colors instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a Colors instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Colors object, or null if unable to parse.
     */
    @JsonCreator
    public static Colors fromValue(String value) {
        Colors[] items = Colors.values();
        for (Colors item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
