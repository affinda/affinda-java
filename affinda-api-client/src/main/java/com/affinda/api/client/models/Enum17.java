package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum17. */
public final class Enum17 extends ExpandableStringEnum<Enum17> {
    /** Static value resumes for Enum17. */
    public static final Enum17 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum17. */
    public static final Enum17 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum17 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum17.
     */
    @JsonCreator
    public static Enum17 fromString(String name) {
        return fromString(name, Enum17.class);
    }

    /** @return known Enum17 values. */
    public static Collection<Enum17> values() {
        return values(Enum17.class);
    }
}
