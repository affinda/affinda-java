package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EnumAnnotationSerializerV2 model. */
@Fluent
public final class EnumAnnotationSerializerV2 extends AnnotationV2 {
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
     * @return the EnumAnnotationSerializerV2 object itself.
     */
    public EnumAnnotationSerializerV2 setParsed(String parsed) {
        this.parsed = parsed;
        return this;
    }
}
