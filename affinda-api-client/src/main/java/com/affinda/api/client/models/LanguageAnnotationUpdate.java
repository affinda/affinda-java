package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LanguageAnnotationUpdate model. */
@Fluent
public final class LanguageAnnotationUpdate extends AnnotationBase {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed", access = JsonProperty.Access.WRITE_ONLY)
    private String parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public String getParsed() {
        return this.parsed;
    }
}
