package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum20. */
public final class Enum20 extends ExpandableStringEnum<Enum20> {
    /** Static value resumes for Enum20. */
    public static final Enum20 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum20. */
    public static final Enum20 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum20 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum20.
     */
    @JsonCreator
    public static Enum20 fromString(String name) {
        return fromString(name, Enum20.class);
    }

    /** @return known Enum20 values. */
    public static Collection<Enum20> values() {
        return values(Enum20.class);
    }
}
