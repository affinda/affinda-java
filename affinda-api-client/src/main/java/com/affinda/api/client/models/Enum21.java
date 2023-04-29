package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum21. */
public final class Enum21 extends ExpandableStringEnum<Enum21> {
    /** Static value resumes for Enum21. */
    public static final Enum21 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum21. */
    public static final Enum21 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum21 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum21.
     */
    @JsonCreator
    public static Enum21 fromString(String name) {
        return fromString(name, Enum21.class);
    }

    /** @return known Enum21 values. */
    public static Collection<Enum21> values() {
        return values(Enum21.class);
    }
}
