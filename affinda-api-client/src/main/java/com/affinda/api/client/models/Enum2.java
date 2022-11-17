package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum2. */
public final class Enum2 extends ExpandableStringEnum<Enum2> {
    /** Static value resumes for Enum2. */
    public static final Enum2 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum2. */
    public static final Enum2 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum2 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum2.
     */
    @JsonCreator
    public static Enum2 fromString(String name) {
        return fromString(name, Enum2.class);
    }

    /** @return known Enum2 values. */
    public static Collection<Enum2> values() {
        return values(Enum2.class);
    }
}
