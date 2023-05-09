package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TableAnnotation model. */
@Fluent
public final class TableAnnotation extends Annotation {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private TableAnnotationParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public TableAnnotationParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the TableAnnotation object itself.
     */
    public TableAnnotation setParsed(TableAnnotationParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
