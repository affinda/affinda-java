package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WorkspaceMembershipCreate model. */
@Fluent
public final class WorkspaceMembershipCreate {
    /*
     * Uniquely identify a workspace.
     */
    @JsonProperty(value = "workspace")
    private String workspace;

    /*
     * Uniquely identify a user.
     */
    @JsonProperty(value = "user")
    private Integer user;

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
     * @return the WorkspaceMembershipCreate object itself.
     */
    public WorkspaceMembershipCreate setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * Get the user property: Uniquely identify a user.
     *
     * @return the user value.
     */
    public Integer getUser() {
        return this.user;
    }

    /**
     * Set the user property: Uniquely identify a user.
     *
     * @param user the user value to set.
     * @return the WorkspaceMembershipCreate object itself.
     */
    public WorkspaceMembershipCreate setUser(Integer user) {
        this.user = user;
        return this;
    }
}
