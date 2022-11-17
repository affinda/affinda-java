package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResumeSearchParametersCustomDataFilterType. */
public final class ResumeSearchParametersCustomDataFilterType
        extends ExpandableStringEnum<ResumeSearchParametersCustomDataFilterType> {
    /** Static value equals for ResumeSearchParametersCustomDataFilterType. */
    public static final ResumeSearchParametersCustomDataFilterType EQUALS = fromString("equals");

    /** Static value range for ResumeSearchParametersCustomDataFilterType. */
    public static final ResumeSearchParametersCustomDataFilterType RANGE = fromString("range");

    /**
     * Creates or finds a ResumeSearchParametersCustomDataFilterType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResumeSearchParametersCustomDataFilterType.
     */
    @JsonCreator
    public static ResumeSearchParametersCustomDataFilterType fromString(String name) {
        return fromString(name, ResumeSearchParametersCustomDataFilterType.class);
    }

    /** @return known ResumeSearchParametersCustomDataFilterType values. */
    public static Collection<ResumeSearchParametersCustomDataFilterType> values() {
        return values(ResumeSearchParametersCustomDataFilterType.class);
    }
}
