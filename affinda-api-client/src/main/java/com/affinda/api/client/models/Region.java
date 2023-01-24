package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Region. */
public final class Region extends ExpandableStringEnum<Region> {
    /** Static value api for Region. */
    public static final Region API = fromString("api");

    /** Static value api.eu1 for Region. */
    public static final Region API_EU1 = fromString("api.eu1");

    /**
     * Creates or finds a Region from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Region.
     */
    @JsonCreator
    public static Region fromString(String name) {
        return fromString(name, Region.class);
    }

    /** @return known Region values. */
    public static Collection<Region> values() {
        return values(Region.class);
    }
}
