package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum18. */
public final class Enum18 extends ExpandableStringEnum<Enum18> {
    /** Static value resumes for Enum18. */
    public static final Enum18 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum18. */
    public static final Enum18 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum18 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum18.
     */
    @JsonCreator
    public static Enum18 fromString(String name) {
        return fromString(name, Enum18.class);
    }

    /** @return known Enum18 values. */
    public static Collection<Enum18> values() {
        return values(Enum18.class);
    }
}
