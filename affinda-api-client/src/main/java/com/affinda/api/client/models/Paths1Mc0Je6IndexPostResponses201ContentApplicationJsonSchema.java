package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths1Mc0Je6IndexPostResponses201ContentApplicationJsonSchema model. */
@Fluent
public final class Paths1Mc0Je6IndexPostResponses201ContentApplicationJsonSchema {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
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
     * @return the Paths1Mc0Je6IndexPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1Mc0Je6IndexPostResponses201ContentApplicationJsonSchema setName(String name) {
        this.name = name;
        return this;
    }
}
