package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum22. */
public final class Enum22 extends ExpandableStringEnum<Enum22> {
    /** Static value resumes for Enum22. */
    public static final Enum22 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum22. */
    public static final Enum22 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum22 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum22.
     */
    @JsonCreator
    public static Enum22 fromString(String name) {
        return fromString(name, Enum22.class);
    }

    /** @return known Enum22 values. */
    public static Collection<Enum22> values() {
        return values(Enum22.class);
    }
}
