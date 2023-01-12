package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InvitationCreate model. */
@Fluent
public final class InvitationCreate {
    /*
     * Uniquely identify an organization.
     */
    @JsonProperty(value = "organization", required = true)
    private String organization;

    /*
     * The email which the invitation is sent to.
     */
    @JsonProperty(value = "email", required = true)
    private String email;

    /*
     * The role property.
     */
    @JsonProperty(value = "role", required = true)
    private OrganizationRole role;

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
     * @return the InvitationCreate object itself.
     */
    public InvitationCreate setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the email property: The email which the invitation is sent to.
     *
     * @return the email value.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set the email property: The email which the invitation is sent to.
     *
     * @param email the email value to set.
     * @return the InvitationCreate object itself.
     */
    public InvitationCreate setEmail(String email) {
        this.email = email;
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
     * @return the InvitationCreate object itself.
     */
    public InvitationCreate setRole(OrganizationRole role) {
        this.role = role;
        return this;
    }
}
