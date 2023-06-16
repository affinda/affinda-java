package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TextAnnotationUpdate model. */
@Fluent
public final class TextAnnotationUpdate extends AnnotationBase {
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
     * @return the TextAnnotationUpdate object itself.
     */
    public TextAnnotationUpdate setParsed(String parsed) {
        this.parsed = parsed;
        return this;
    }
}
