package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobDescriptionSearchConfigDistanceUnit. */
public final class JobDescriptionSearchConfigDistanceUnit
        extends ExpandableStringEnum<JobDescriptionSearchConfigDistanceUnit> {
    /** Static value mi for JobDescriptionSearchConfigDistanceUnit. */
    public static final JobDescriptionSearchConfigDistanceUnit MI = fromString("mi");

    /** Static value km for JobDescriptionSearchConfigDistanceUnit. */
    public static final JobDescriptionSearchConfigDistanceUnit KM = fromString("km");

    /**
     * Creates or finds a JobDescriptionSearchConfigDistanceUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobDescriptionSearchConfigDistanceUnit.
     */
    @JsonCreator
    public static JobDescriptionSearchConfigDistanceUnit fromString(String name) {
        return fromString(name, JobDescriptionSearchConfigDistanceUnit.class);
    }

    /** @return known JobDescriptionSearchConfigDistanceUnit values. */
    public static Collection<JobDescriptionSearchConfigDistanceUnit> values() {
        return values(JobDescriptionSearchConfigDistanceUnit.class);
    }
}
