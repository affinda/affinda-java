package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum3. */
public final class Enum3 extends ExpandableStringEnum<Enum3> {
    /** Static value resumes for Enum3. */
    public static final Enum3 RESUMES = fromString("resumes");

    /** Static value job_descriptions for Enum3. */
    public static final Enum3 JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a Enum3 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum3.
     */
    @JsonCreator
    public static Enum3 fromString(String name) {
        return fromString(name, Enum3.class);
    }

    /** @return known Enum3 values. */
    public static Collection<Enum3> values() {
        return values(Enum3.class);
    }
}
