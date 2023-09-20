package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum23. */
public final class Enum23 extends ExpandableStringEnum<Enum23> {
    /** Static value resumes for Enum23. */
    public static final Enum23 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum23. */
    public static final Enum23 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum23 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum23.
     */
    @JsonCreator
    public static Enum23 fromString(String name) {
        return fromString(name, Enum23.class);
    }

    /** @return known Enum23 values. */
    public static Collection<Enum23> values() {
        return values(Enum23.class);
    }
}
