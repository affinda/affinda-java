package com.affinda.api.client.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ManagementLevel. */
public enum ManagementLevel {
    /** Enum value Low. */
    LOW("Low"),

    /** Enum value Mid. */
    MID("Mid"),

    /** Enum value Upper. */
    UPPER("Upper");

    /** The actual serialized value for a ManagementLevel instance. */
    private final String value;

    ManagementLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ManagementLevel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ManagementLevel object, or null if unable to parse.
     */
    @JsonCreator
    public static ManagementLevel fromString(String value) {
        ManagementLevel[] items = ManagementLevel.values();
        for (ManagementLevel item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
