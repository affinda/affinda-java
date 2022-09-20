package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum4. */
public final class Enum4 extends ExpandableStringEnum<Enum4> {
    /** Static value resumes for Enum4. */
    public static final Enum4 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum4. */
    public static final Enum4 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum4 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum4.
     */
    @JsonCreator
    public static Enum4 fromString(String name) {
        return fromString(name, Enum4.class);
    }

    /** @return known Enum4 values. */
    public static Collection<Enum4> values() {
        return values(Enum4.class);
    }
}
