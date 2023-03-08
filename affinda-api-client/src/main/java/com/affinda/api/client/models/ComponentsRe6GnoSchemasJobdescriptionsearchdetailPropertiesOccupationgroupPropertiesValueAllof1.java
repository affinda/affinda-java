package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsRe6GnoSchemasJobdescriptionsearchdetailPropertiesOccupationgroupPropertiesValueAllof1 model. */
@Fluent
public class ComponentsRe6GnoSchemasJobdescriptionsearchdetailPropertiesOccupationgroupPropertiesValueAllof1 {
    /*
     * The match property.
     */
    @JsonProperty(value = "match")
    private Boolean match;

    /**
     * Get the match property: The match property.
     *
     * @return the match value.
     */
    public Boolean isMatch() {
        return this.match;
    }

    /**
     * Set the match property: The match property.
     *
     * @param match the match value to set.
     * @return the ComponentsRe6GnoSchemasJobdescriptionsearchdetailPropertiesOccupationgroupPropertiesValueAllof1
     *     object itself.
     */
    public ComponentsRe6GnoSchemasJobdescriptionsearchdetailPropertiesOccupationgroupPropertiesValueAllof1 setMatch(
            Boolean match) {
        this.match = match;
        return this;
    }
}
