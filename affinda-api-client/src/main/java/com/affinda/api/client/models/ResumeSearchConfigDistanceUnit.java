package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResumeSearchConfigDistanceUnit. */
public final class ResumeSearchConfigDistanceUnit extends ExpandableStringEnum<ResumeSearchConfigDistanceUnit> {
    /** Static value mi for ResumeSearchConfigDistanceUnit. */
    public static final ResumeSearchConfigDistanceUnit MI = fromString("mi");

    /** Static value km for ResumeSearchConfigDistanceUnit. */
    public static final ResumeSearchConfigDistanceUnit KM = fromString("km");

    /**
     * Creates or finds a ResumeSearchConfigDistanceUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResumeSearchConfigDistanceUnit.
     */
    @JsonCreator
    public static ResumeSearchConfigDistanceUnit fromString(String name) {
        return fromString(name, ResumeSearchConfigDistanceUnit.class);
    }

    /** @return known ResumeSearchConfigDistanceUnit values. */
    public static Collection<ResumeSearchConfigDistanceUnit> values() {
        return values(ResumeSearchConfigDistanceUnit.class);
    }
}
