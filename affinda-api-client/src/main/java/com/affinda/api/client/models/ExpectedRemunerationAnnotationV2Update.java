package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpectedRemunerationAnnotationV2Update model. */
@Fluent
public final class ExpectedRemunerationAnnotationV2Update extends AnnotationV2Base {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private ExpectedRemunerationAnnotationV2UpdateParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public ExpectedRemunerationAnnotationV2UpdateParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the ExpectedRemunerationAnnotationV2Update object itself.
     */
    public ExpectedRemunerationAnnotationV2Update setParsed(ExpectedRemunerationAnnotationV2UpdateParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
