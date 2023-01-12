package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DateFormatPreference. */
public final class DateFormatPreference extends ExpandableStringEnum<DateFormatPreference> {
    /** Static value DMY for DateFormatPreference. */
    public static final DateFormatPreference DMY = fromString("DMY");

    /** Static value MDY for DateFormatPreference. */
    public static final DateFormatPreference MDY = fromString("MDY");

    /** Static value YMD for DateFormatPreference. */
    public static final DateFormatPreference YMD = fromString("YMD");

    /**
     * Creates or finds a DateFormatPreference from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DateFormatPreference.
     */
    @JsonCreator
    public static DateFormatPreference fromString(String name) {
        return fromString(name, DateFormatPreference.class);
    }

    /** @return known DateFormatPreference values. */
    public static Collection<DateFormatPreference> values() {
        return values(DateFormatPreference.class);
    }
}
