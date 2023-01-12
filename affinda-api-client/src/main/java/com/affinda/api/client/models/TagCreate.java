package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TagCreate model. */
@Fluent
public final class TagCreate {
    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Uniquely identify a workspace.
     */
    @JsonProperty(value = "workspace", required = true)
    private String workspace;

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
     * @return the TagCreate object itself.
     */
    public TagCreate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the workspace property: Uniquely identify a workspace.
     *
     * @return the workspace value.
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * Set the workspace property: Uniquely identify a workspace.
     *
     * @param workspace the workspace value to set.
     * @return the TagCreate object itself.
     */
    public TagCreate setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
}
