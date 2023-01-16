package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/** The DateAnnotationV2 model. */
@Fluent
public final class DateAnnotationV2 extends AnnotationV2 {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private LocalDate parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public LocalDate getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the DateAnnotationV2 object itself.
     */
    public DateAnnotationV2 setParsed(LocalDate parsed) {
        this.parsed = parsed;
        return this;
    }
}
