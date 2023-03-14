package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum16. */
public final class Enum16 extends ExpandableStringEnum<Enum16> {
    /** Static value resumes for Enum16. */
    public static final Enum16 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum16. */
    public static final Enum16 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum16 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum16.
     */
    @JsonCreator
    public static Enum16 fromString(String name) {
        return fromString(name, Enum16.class);
    }

    /** @return known Enum16 values. */
    public static Collection<Enum16> values() {
        return values(Enum16.class);
    }
}
