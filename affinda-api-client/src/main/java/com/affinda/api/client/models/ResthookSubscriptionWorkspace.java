package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResthookSubscriptionWorkspace model. */
@Fluent
public final class ResthookSubscriptionWorkspace {
    /*
     * Uniquely identify a workspace.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The organization property.
     */
    @JsonProperty(value = "organization", required = true)
    private Organization organization;

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
     * @return the ResthookSubscriptionWorkspace object itself.
     */
    public ResthookSubscriptionWorkspace setIdentifier(String identifier) {
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
     * @return the ResthookSubscriptionWorkspace object itself.
     */
    public ResthookSubscriptionWorkspace setName(String name) {
        this.name = name;
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
     * @return the ResthookSubscriptionWorkspace object itself.
     */
    public ResthookSubscriptionWorkspace setOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }
}
