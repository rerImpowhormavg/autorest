/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EnumConst.
 */
public enum EnumConst {
    /** Enum value constant_string_as_enum. */
    CONSTANT_STRING_AS_ENUM("constant_string_as_enum");

    /** The actual serialized value for a EnumConst instance. */
    private String value;

    EnumConst(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a EnumConst instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a EnumConst instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EnumConst object, or null if unable to parse.
     */
    @JsonCreator
    public static EnumConst fromValue(String value) {
        EnumConst[] items = EnumConst.values();
        for (EnumConst item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return toValue();
    }
}
