package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TagUpdate model. */
@Fluent
public final class TagUpdate {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Uniquely identify a workspace.
     */
    @JsonProperty(value = "workspace")
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
     * @return the TagUpdate object itself.
     */
    public TagUpdate setName(String name) {
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
     * @return the TagUpdate object itself.
     */
    public TagUpdate setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
}
