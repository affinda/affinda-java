package com.affinda.api.client.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SearchLocationUnit. */
public enum SearchLocationUnit {
    /** Enum value km. */
    KM("km"),

    /** Enum value mi. */
    MI("mi");

    /** The actual serialized value for a SearchLocationUnit instance. */
    private final String value;

    SearchLocationUnit(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SearchLocationUnit instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SearchLocationUnit object, or null if unable to parse.
     */
    @JsonCreator
    public static SearchLocationUnit fromString(String value) {
        SearchLocationUnit[] items = SearchLocationUnit.values();
        for (SearchLocationUnit item : items) {
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
