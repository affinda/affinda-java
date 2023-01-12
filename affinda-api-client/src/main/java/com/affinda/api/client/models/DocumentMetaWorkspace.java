package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentMetaWorkspace model. */
@Fluent
public final class DocumentMetaWorkspace {
    /*
     * Uniquely identify a workspace.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the identifier property: Uniquely identify a workspace.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify a workspace.
     *
     * @param identifier the identifier value to set.
     * @return the DocumentMetaWorkspace object itself.
     */
    public DocumentMetaWorkspace setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

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
     * @return the DocumentMetaWorkspace object itself.
     */
    public DocumentMetaWorkspace setName(String name) {
        this.name = name;
        return this;
    }
}
