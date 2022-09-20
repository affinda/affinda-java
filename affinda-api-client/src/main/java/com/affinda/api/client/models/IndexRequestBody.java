package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IndexRequestBody. */
@Fluent
public final class IndexRequestBody {
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
     * @return the IndexRequestBody object itself.
     */
    public IndexRequestBody setName(String name) {
        this.name = name;
        return this;
    }
}
