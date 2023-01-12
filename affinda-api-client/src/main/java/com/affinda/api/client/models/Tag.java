package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Tag model. */
@Fluent
public final class Tag {
    /*
     * Uniquely identify a tag.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

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

    /*
     * Number of documents tagged with this.
     */
    @JsonProperty(value = "documentCount", required = true)
    private int documentCount;

    /**
     * Get the id property: Uniquely identify a tag.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: Uniquely identify a tag.
     *
     * @param id the id value to set.
     * @return the Tag object itself.
     */
    public Tag setId(int id) {
        this.id = id;
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
     * @return the Tag object itself.
     */
    public Tag setName(String name) {
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
     * @return the Tag object itself.
     */
    public Tag setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * Get the documentCount property: Number of documents tagged with this.
     *
     * @return the documentCount value.
     */
    public int getDocumentCount() {
        return this.documentCount;
    }

    /**
     * Set the documentCount property: Number of documents tagged with this.
     *
     * @param documentCount the documentCount value to set.
     * @return the Tag object itself.
     */
    public Tag setDocumentCount(int documentCount) {
        this.documentCount = documentCount;
        return this;
    }
}
