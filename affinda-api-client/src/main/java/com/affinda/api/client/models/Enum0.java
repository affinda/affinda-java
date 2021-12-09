package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum0. */
public final class Enum0 extends ExpandableStringEnum<Enum0> {
    /** Static value None for Enum0. */
    public static final Enum0 NONE = fromString("None");

    /** Static value Low for Enum0. */
    public static final Enum0 LOW = fromString("Low");

    /** Static value Mid for Enum0. */
    public static final Enum0 MID = fromString("Mid");

    /** Static value Upper for Enum0. */
    public static final Enum0 UPPER = fromString("Upper");

    /**
     * Creates or finds a Enum0 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum0.
     */
    @JsonCreator
    public static Enum0 fromString(String name) {
        return fromString(name, Enum0.class);
    }

    /** @return known Enum0 values. */
    public static Collection<Enum0> values() {
        return values(Enum0.class);
    }
}
