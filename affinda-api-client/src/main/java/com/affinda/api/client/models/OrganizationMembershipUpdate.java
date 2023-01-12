package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OrganizationMembershipUpdate model. */
@Fluent
public final class OrganizationMembershipUpdate {
    /*
     * The role property.
     */
    @JsonProperty(value = "role")
    private OrganizationRole role;

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
     * @return the OrganizationMembershipUpdate object itself.
     */
    public OrganizationMembershipUpdate setRole(OrganizationRole role) {
        this.role = role;
        return this;
    }
}
