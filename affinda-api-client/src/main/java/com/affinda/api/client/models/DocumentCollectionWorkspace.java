package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentCollectionWorkspace model. */
@Fluent
public final class DocumentCollectionWorkspace {
    /*
     * Uniquely identify a workspace.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * The organization property.
     */
    @JsonProperty(value = "organization")
    private Organization organization;

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
     * @return the DocumentCollectionWorkspace object itself.
     */
    public DocumentCollectionWorkspace setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the organization property: The organization property.
     *
     * @return the organization value.
     */
    public Organization getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization property: The organization property.
     *
     * @param organization the organization value to set.
     * @return the DocumentCollectionWorkspace object itself.
     */
    public DocumentCollectionWorkspace setOrganization(Organization organization) {
        this.organization = organization;
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
     * @return the DocumentCollectionWorkspace object itself.
     */
    public DocumentCollectionWorkspace setName(String name) {
        this.name = name;
        return this;
    }
}
