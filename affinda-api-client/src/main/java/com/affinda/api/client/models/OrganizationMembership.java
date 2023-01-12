package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OrganizationMembership model. */
@Fluent
public final class OrganizationMembership {
    /*
     * A random string that uniquely identify the resource.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * Uniquely identify an organization.
     */
    @JsonProperty(value = "organization", required = true)
    private String organization;

    /*
     * The user property.
     */
    @JsonProperty(value = "user", required = true)
    private User user;

    /*
     * The role property.
     */
    @JsonProperty(value = "role", required = true)
    private OrganizationRole role;

    /**
     * Get the identifier property: A random string that uniquely identify the resource.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: A random string that uniquely identify the resource.
     *
     * @param identifier the identifier value to set.
     * @return the OrganizationMembership object itself.
     */
    public OrganizationMembership setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the organization property: Uniquely identify an organization.
     *
     * @return the organization value.
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization property: Uniquely identify an organization.
     *
     * @param organization the organization value to set.
     * @return the OrganizationMembership object itself.
     */
    public OrganizationMembership setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the user property: The user property.
     *
     * @return the user value.
     */
    public User getUser() {
        return this.user;
    }

    /**
     * Set the user property: The user property.
     *
     * @param user the user value to set.
     * @return the OrganizationMembership object itself.
     */
    public OrganizationMembership setUser(User user) {
        this.user = user;
        return this;
    }

    /**
     * Get the role property: The role property.
     *
     * @return the role value.
     */
    public OrganizationRole getRole() {
        return this.role;
    }

    /**
     * Set the role property: The role property.
     *
     * @param role the role value to set.
     * @return the OrganizationMembership object itself.
     */
    public OrganizationMembership setRole(OrganizationRole role) {
        this.role = role;
        return this;
    }
}
