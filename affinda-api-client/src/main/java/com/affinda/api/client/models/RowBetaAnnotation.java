package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RowBetaAnnotation model. */
@Fluent
public final class RowBetaAnnotation extends Annotation {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private RowBetaAnnotationParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public RowBetaAnnotationParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the RowBetaAnnotation object itself.
     */
    public RowBetaAnnotation setParsed(RowBetaAnnotationParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
