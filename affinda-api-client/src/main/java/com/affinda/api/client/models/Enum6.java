package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum6. */
public final class Enum6 extends ExpandableStringEnum<Enum6> {
    /** Static value resumes for Enum6. */
    public static final Enum6 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum6. */
    public static final Enum6 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum6 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum6.
     */
    @JsonCreator
    public static Enum6 fromString(String name) {
        return fromString(name, Enum6.class);
    }

    /** @return known Enum6 values. */
    public static Collection<Enum6> values() {
        return values(Enum6.class);
    }
}
