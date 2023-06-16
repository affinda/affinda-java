package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpectedRemunerationAnnotationUpdate model. */
@Fluent
public final class ExpectedRemunerationAnnotationUpdate extends AnnotationBase {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private ExpectedRemunerationAnnotationUpdateParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public ExpectedRemunerationAnnotationUpdateParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the ExpectedRemunerationAnnotationUpdate object itself.
     */
    public ExpectedRemunerationAnnotationUpdate setParsed(ExpectedRemunerationAnnotationUpdateParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
