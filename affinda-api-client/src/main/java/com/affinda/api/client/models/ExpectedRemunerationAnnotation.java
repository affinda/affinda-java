package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpectedRemunerationAnnotation model. */
@Fluent
public final class ExpectedRemunerationAnnotation extends Annotation {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private ExpectedRemunerationAnnotationParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public ExpectedRemunerationAnnotationParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the ExpectedRemunerationAnnotation object itself.
     */
    public ExpectedRemunerationAnnotation setParsed(ExpectedRemunerationAnnotationParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
