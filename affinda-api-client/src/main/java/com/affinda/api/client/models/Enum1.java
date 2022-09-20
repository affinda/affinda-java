package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum1. */
public final class Enum1 extends ExpandableStringEnum<Enum1> {
    /** Static value resumes for Enum1. */
    public static final Enum1 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum1. */
    public static final Enum1 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum1 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum1.
     */
    @JsonCreator
    public static Enum1 fromString(String name) {
        return fromString(name, Enum1.class);
    }

    /** @return known Enum1 values. */
    public static Collection<Enum1> values() {
        return values(Enum1.class);
    }
}
