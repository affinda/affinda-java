package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DateRange. */
public final class DateRange extends ExpandableStringEnum<DateRange> {
    /** Static value today for DateRange. */
    public static final DateRange TODAY = fromString("today");

    /** Static value yesterday for DateRange. */
    public static final DateRange YESTERDAY = fromString("yesterday");

    /** Static value week for DateRange. */
    public static final DateRange WEEK = fromString("week");

    /** Static value month for DateRange. */
    public static final DateRange MONTH = fromString("month");

    /** Static value year for DateRange. */
    public static final DateRange YEAR = fromString("year");

    /**
     * Creates or finds a DateRange from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DateRange.
     */
    @JsonCreator
    public static DateRange fromString(String name) {
        return fromString(name, DateRange.class);
    }

    /** @return known DateRange values. */
    public static Collection<DateRange> values() {
        return values(DateRange.class);
    }
}
