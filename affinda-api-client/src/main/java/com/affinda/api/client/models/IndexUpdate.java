package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IndexUpdate model. */
@Fluent
public final class IndexUpdate {
    /*
     * Unique index name
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: Unique index name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Unique index name.
     *
     * @param name the name value to set.
     * @return the IndexUpdate object itself.
     */
    public IndexUpdate setName(String name) {
        this.name = name;
        return this;
    }
}
