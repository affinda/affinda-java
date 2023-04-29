package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SearchParametersCustomDataFilterType. */
public final class SearchParametersCustomDataFilterType
        extends ExpandableStringEnum<SearchParametersCustomDataFilterType> {
    /** Static value equals for SearchParametersCustomDataFilterType. */
    public static final SearchParametersCustomDataFilterType EQUALS = fromString("equals");

    /** Static value range for SearchParametersCustomDataFilterType. */
    public static final SearchParametersCustomDataFilterType RANGE = fromString("range");

    /**
     * Creates or finds a SearchParametersCustomDataFilterType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SearchParametersCustomDataFilterType.
     */
    @JsonCreator
    public static SearchParametersCustomDataFilterType fromString(String name) {
        return fromString(name, SearchParametersCustomDataFilterType.class);
    }

    /** @return known SearchParametersCustomDataFilterType values. */
    public static Collection<SearchParametersCustomDataFilterType> values() {
        return values(SearchParametersCustomDataFilterType.class);
    }
}
