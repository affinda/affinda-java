package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum7. */
public final class Enum7 extends ExpandableStringEnum<Enum7> {
    /** Static value resumes for Enum7. */
    public static final Enum7 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum7. */
    public static final Enum7 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum7 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum7.
     */
    @JsonCreator
    public static Enum7 fromString(String name) {
        return fromString(name, Enum7.class);
    }

    /** @return known Enum7 values. */
    public static Collection<Enum7> values() {
        return values(Enum7.class);
    }
}
