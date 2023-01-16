package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpectedRemunerationAnnotationV2 model. */
@Fluent
public final class ExpectedRemunerationAnnotationV2 extends AnnotationV2 {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private ExpectedRemunerationAnnotationV2Parsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public ExpectedRemunerationAnnotationV2Parsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the ExpectedRemunerationAnnotationV2 object itself.
     */
    public ExpectedRemunerationAnnotationV2 setParsed(ExpectedRemunerationAnnotationV2Parsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
