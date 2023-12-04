package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DateRangeAnnotationParsed model. */
@Fluent
public final class DateRangeAnnotationParsed {
    /*
     * The start property.
     */
    @JsonProperty(value = "start")
    private DateRangeValue start;

    /*
     * The end property.
     */
    @JsonProperty(value = "end")
    private DateRangeValue end;

    /**
     * Get the start property: The start property.
     *
     * @return the start value.
     */
    public DateRangeValue getStart() {
        return this.start;
    }

    /**
     * Set the start property: The start property.
     *
     * @param start the start value to set.
     * @return the DateRangeAnnotationParsed object itself.
     */
    public DateRangeAnnotationParsed setStart(DateRangeValue start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: The end property.
     *
     * @return the end value.
     */
    public DateRangeValue getEnd() {
        return this.end;
    }

    /**
     * Set the end property: The end property.
     *
     * @param end the end value to set.
     * @return the DateRangeAnnotationParsed object itself.
     */
    public DateRangeAnnotationParsed setEnd(DateRangeValue end) {
        this.end = end;
        return this;
    }
}
