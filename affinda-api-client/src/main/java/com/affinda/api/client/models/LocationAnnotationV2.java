package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LocationAnnotationV2 model. */
@Fluent
public final class LocationAnnotationV2 extends AnnotationV2 {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed", access = JsonProperty.Access.WRITE_ONLY)
    private LocationAnnotationV2Parsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public LocationAnnotationV2Parsed getParsed() {
        return this.parsed;
    }
}
