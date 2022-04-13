package com.affinda.api.client.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for EducationLevel. */
public enum EducationLevel {
    /** Enum value school. */
    SCHOOL("school"),

    /** Enum value certificate. */
    CERTIFICATE("certificate"),

    /** Enum value bachelors. */
    BACHELORS("bachelors"),

    /** Enum value masters. */
    MASTERS("masters"),

    /** Enum value doctoral. */
    DOCTORAL("doctoral");

    /** The actual serialized value for a EducationLevel instance. */
    private final String value;

    EducationLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EducationLevel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EducationLevel object, or null if unable to parse.
     */
    @JsonCreator
    public static EducationLevel fromString(String value) {
        EducationLevel[] items = EducationLevel.values();
        for (EducationLevel item : items) {
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
