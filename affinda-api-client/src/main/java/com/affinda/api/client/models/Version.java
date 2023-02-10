package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Version. */
public final class Version extends ExpandableStringEnum<Version> {
    /** Static value v1 for Version. */
    public static final Version V1 = fromString("v1");

    /** Static value v2 for Version. */
    public static final Version V2 = fromString("v2");

    /** Static value v3 for Version. */
    public static final Version V3 = fromString("v3");

    /**
     * Creates or finds a Version from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Version.
     */
    @JsonCreator
    public static Version fromString(String name) {
        return fromString(name, Version.class);
    }

    /** @return known Version values. */
    public static Collection<Version> values() {
        return values(Version.class);
    }
}
