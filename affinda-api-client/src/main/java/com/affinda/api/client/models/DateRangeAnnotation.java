package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DateRangeAnnotation model. */
@Fluent
public final class DateRangeAnnotation extends Annotation {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private DateRangeAnnotationParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public DateRangeAnnotationParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the DateRangeAnnotation object itself.
     */
    public DateRangeAnnotation setParsed(DateRangeAnnotationParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
