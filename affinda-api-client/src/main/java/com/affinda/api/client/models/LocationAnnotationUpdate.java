package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LocationAnnotationUpdate model. */
@Fluent
public final class LocationAnnotationUpdate extends AnnotationBase {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed", access = JsonProperty.Access.WRITE_ONLY)
    private LocationAnnotationUpdateParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public LocationAnnotationUpdateParsed getParsed() {
        return this.parsed;
    }
}
