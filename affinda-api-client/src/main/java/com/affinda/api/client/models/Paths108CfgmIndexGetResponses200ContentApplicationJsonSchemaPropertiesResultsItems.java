package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths108CfgmIndexGetResponses200ContentApplicationJsonSchemaPropertiesResultsItems model. */
@Fluent
public final class Paths108CfgmIndexGetResponses200ContentApplicationJsonSchemaPropertiesResultsItems {
    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the Paths108CfgmIndexGetResponses200ContentApplicationJsonSchemaPropertiesResultsItems object itself.
     */
    public Paths108CfgmIndexGetResponses200ContentApplicationJsonSchemaPropertiesResultsItems setName(String name) {
        this.name = name;
        return this;
    }
}
