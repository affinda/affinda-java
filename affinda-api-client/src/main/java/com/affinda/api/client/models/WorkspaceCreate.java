package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WorkspaceCreate model. */
@Fluent
public final class WorkspaceCreate {
    /*
     * Uniquely identify an organization.
     */
    @JsonProperty(value = "organization", required = true)
    private String organization;

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Visibility "organization" means everyone in the organization can access
     * the workspace. Visibility "private" means only people explicitly added
     * can access the workspace.
     */
    @JsonProperty(value = "visibility")
    private WorkspaceVisibility visibility;

    /*
     * If true, the uploaded document will be rejected if it's of the wrong
     * document type, or if its document type cannot be determined. No credits
     * will be consumed.
     */
    @JsonProperty(value = "rejectInvalidDocuments")
    private Boolean rejectInvalidDocuments;

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
     * @return the WorkspaceCreate object itself.
     */
    public WorkspaceCreate setOrganization(String organization) {
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
     * @return the WorkspaceCreate object itself.
     */
    public WorkspaceCreate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the visibility property: Visibility "organization" means everyone in the organization can access the
     * workspace. Visibility "private" means only people explicitly added can access the workspace.
     *
     * @return the visibility value.
     */
    public WorkspaceVisibility getVisibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: Visibility "organization" means everyone in the organization can access the
     * workspace. Visibility "private" means only people explicitly added can access the workspace.
     *
     * @param visibility the visibility value to set.
     * @return the WorkspaceCreate object itself.
     */
    public WorkspaceCreate setVisibility(WorkspaceVisibility visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the rejectInvalidDocuments property: If true, the uploaded document will be rejected if it's of the wrong
     * document type, or if its document type cannot be determined. No credits will be consumed.
     *
     * @return the rejectInvalidDocuments value.
     */
    public Boolean isRejectInvalidDocuments() {
        return this.rejectInvalidDocuments;
    }

    /**
     * Set the rejectInvalidDocuments property: If true, the uploaded document will be rejected if it's of the wrong
     * document type, or if its document type cannot be determined. No credits will be consumed.
     *
     * @param rejectInvalidDocuments the rejectInvalidDocuments value to set.
     * @return the WorkspaceCreate object itself.
     */
    public WorkspaceCreate setRejectInvalidDocuments(Boolean rejectInvalidDocuments) {
        this.rejectInvalidDocuments = rejectInvalidDocuments;
        return this;
    }
}
