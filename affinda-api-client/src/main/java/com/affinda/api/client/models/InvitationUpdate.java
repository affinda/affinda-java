package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InvitationUpdate model. */
@Fluent
public final class InvitationUpdate {
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
     * @return the InvitationUpdate object itself.
     */
    public InvitationUpdate setRole(OrganizationRole role) {
        this.role = role;
        return this;
    }
}
