package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LocationAnnotationV2 model. */
@Fluent
public final class LocationAnnotationV2 extends AnnotationV2 {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private Location parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public Location getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the LocationAnnotationV2 object itself.
     */
    public LocationAnnotationV2 setParsed(Location parsed) {
        this.parsed = parsed;
        return this;
    }
}
