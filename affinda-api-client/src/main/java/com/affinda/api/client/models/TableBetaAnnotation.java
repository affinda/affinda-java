package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TableBetaAnnotation model. */
@Fluent
public final class TableBetaAnnotation extends Annotation {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private TableBetaAnnotationParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public TableBetaAnnotationParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the TableBetaAnnotation object itself.
     */
    public TableBetaAnnotation setParsed(TableBetaAnnotationParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
