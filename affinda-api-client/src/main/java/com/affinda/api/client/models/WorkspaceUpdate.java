package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WorkspaceUpdate model. */
@Fluent
public final class WorkspaceUpdate {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
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

    /*
     * If "true", parsing will fail when the uploaded document is duplicate of
     * an existing document, no credits will be consumed. If "false" (default),
     * will parse the document normally whether its a duplicate or not.
     */
    @JsonProperty(value = "rejectDuplicates")
    private Boolean rejectDuplicates;

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
     * @return the WorkspaceUpdate object itself.
     */
    public WorkspaceUpdate setName(String name) {
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
     * @return the WorkspaceUpdate object itself.
     */
    public WorkspaceUpdate setVisibility(WorkspaceVisibility visibility) {
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
     * @return the WorkspaceUpdate object itself.
     */
    public WorkspaceUpdate setRejectInvalidDocuments(Boolean rejectInvalidDocuments) {
        this.rejectInvalidDocuments = rejectInvalidDocuments;
        return this;
    }

    /**
     * Get the rejectDuplicates property: If "true", parsing will fail when the uploaded document is duplicate of an
     * existing document, no credits will be consumed. If "false" (default), will parse the document normally whether
     * its a duplicate or not.
     *
     * @return the rejectDuplicates value.
     */
    public Boolean isRejectDuplicates() {
        return this.rejectDuplicates;
    }

    /**
     * Set the rejectDuplicates property: If "true", parsing will fail when the uploaded document is duplicate of an
     * existing document, no credits will be consumed. If "false" (default), will parse the document normally whether
     * its a duplicate or not.
     *
     * @param rejectDuplicates the rejectDuplicates value to set.
     * @return the WorkspaceUpdate object itself.
     */
    public WorkspaceUpdate setRejectDuplicates(Boolean rejectDuplicates) {
        this.rejectDuplicates = rejectDuplicates;
        return this;
    }
}
