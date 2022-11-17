package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum5. */
public final class Enum5 extends ExpandableStringEnum<Enum5> {
    /** Static value resumes for Enum5. */
    public static final Enum5 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum5. */
    public static final Enum5 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum5 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum5.
     */
    @JsonCreator
    public static Enum5 fromString(String name) {
        return fromString(name, Enum5.class);
    }

    /** @return known Enum5 values. */
    public static Collection<Enum5> values() {
        return values(Enum5.class);
    }
}
