package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum19. */
public final class Enum19 extends ExpandableStringEnum<Enum19> {
    /** Static value resumes for Enum19. */
    public static final Enum19 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum19. */
    public static final Enum19 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum19 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum19.
     */
    @JsonCreator
    public static Enum19 fromString(String name) {
        return fromString(name, Enum19.class);
    }

    /** @return known Enum19 values. */
    public static Collection<Enum19> values() {
        return values(Enum19.class);
    }
}
