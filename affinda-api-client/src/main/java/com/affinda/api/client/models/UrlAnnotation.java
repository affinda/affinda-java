package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UrlAnnotation model. */
@Fluent
public final class UrlAnnotation extends Annotation {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private UrlAnnotationParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public UrlAnnotationParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the UrlAnnotation object itself.
     */
    public UrlAnnotation setParsed(UrlAnnotationParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
