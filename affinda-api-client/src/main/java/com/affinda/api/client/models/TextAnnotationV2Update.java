package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TextAnnotationV2Update model. */
@Fluent
public final class TextAnnotationV2Update extends AnnotationV2Base {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private String parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public String getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the TextAnnotationV2Update object itself.
     */
    public TextAnnotationV2Update setParsed(String parsed) {
        this.parsed = parsed;
        return this;
    }
}
