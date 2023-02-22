package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LocationAnnotationV2Update model. */
@Fluent
public final class LocationAnnotationV2Update extends AnnotationV2Base {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed", access = JsonProperty.Access.WRITE_ONLY)
    private LocationAnnotationV2UpdateParsed parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public LocationAnnotationV2UpdateParsed getParsed() {
        return this.parsed;
    }
}
