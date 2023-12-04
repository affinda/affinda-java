package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PhoneNumberAnnotation model. */
@Fluent
public final class PhoneNumberAnnotation extends Annotation {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private PhoneNumberAnnotationParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public PhoneNumberAnnotationParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the PhoneNumberAnnotation object itself.
     */
    public PhoneNumberAnnotation setParsed(PhoneNumberAnnotationParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
