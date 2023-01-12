package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WorkspaceMembership model. */
@Fluent
public final class WorkspaceMembership {
    /*
     * Uniquely identify a membership.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * Uniquely identify a workspace.
     */
    @JsonProperty(value = "workspace")
    private String workspace;

    /*
     * The user property.
     */
    @JsonProperty(value = "user")
    private User user;

    /**
     * Get the identifier property: Uniquely identify a membership.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify a membership.
     *
     * @param identifier the identifier value to set.
     * @return the WorkspaceMembership object itself.
     */
    public WorkspaceMembership setIdentifier(String identifier) {
        this.identifier = identifier;
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
     * @return the WorkspaceMembership object itself.
     */
    public WorkspaceMembership setWorkspace(String workspace) {
        this.workspace = workspace;
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
     * @return the WorkspaceMembership object itself.
     */
    public WorkspaceMembership setUser(User user) {
        this.user = user;
        return this;
    }
}
