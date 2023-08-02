package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

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

    /*
     * If "true", parsing will fail when the uploaded document is duplicate of
     * an existing document, no credits will be consumed. If "false", will
     * parse the document normally whether its a duplicate or not. If not
     * provided, will fallback to the workspace settings.
     */
    @JsonProperty(value = "rejectDuplicates")
    private Boolean rejectDuplicates;

    /*
     * If specified, only emails from these addresses will be ingested for
     * parsing. Wild cards are allowed, e.g. "*@eyefind.info".
     */
    @JsonProperty(value = "whitelistIngestAddresses")
    private List<String> whitelistIngestAddresses;

    /*
     * If true, attempt to split documents if multiple documents are detected
     * in a single file.
     */
    @JsonProperty(value = "splitDocuments")
    private Boolean splitDocuments;

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

    /**
     * Get the rejectDuplicates property: If "true", parsing will fail when the uploaded document is duplicate of an
     * existing document, no credits will be consumed. If "false", will parse the document normally whether its a
     * duplicate or not. If not provided, will fallback to the workspace settings.
     *
     * @return the rejectDuplicates value.
     */
    public Boolean isRejectDuplicates() {
        return this.rejectDuplicates;
    }

    /**
     * Set the rejectDuplicates property: If "true", parsing will fail when the uploaded document is duplicate of an
     * existing document, no credits will be consumed. If "false", will parse the document normally whether its a
     * duplicate or not. If not provided, will fallback to the workspace settings.
     *
     * @param rejectDuplicates the rejectDuplicates value to set.
     * @return the WorkspaceCreate object itself.
     */
    public WorkspaceCreate setRejectDuplicates(Boolean rejectDuplicates) {
        this.rejectDuplicates = rejectDuplicates;
        return this;
    }

    /**
     * Get the whitelistIngestAddresses property: If specified, only emails from these addresses will be ingested for
     * parsing. Wild cards are allowed, e.g. "*@eyefind.info".
     *
     * @return the whitelistIngestAddresses value.
     */
    public List<String> getWhitelistIngestAddresses() {
        return this.whitelistIngestAddresses;
    }

    /**
     * Set the whitelistIngestAddresses property: If specified, only emails from these addresses will be ingested for
     * parsing. Wild cards are allowed, e.g. "*@eyefind.info".
     *
     * @param whitelistIngestAddresses the whitelistIngestAddresses value to set.
     * @return the WorkspaceCreate object itself.
     */
    public WorkspaceCreate setWhitelistIngestAddresses(List<String> whitelistIngestAddresses) {
        this.whitelistIngestAddresses = whitelistIngestAddresses;
        return this;
    }

    /**
     * Get the splitDocuments property: If true, attempt to split documents if multiple documents are detected in a
     * single file.
     *
     * @return the splitDocuments value.
     */
    public Boolean isSplitDocuments() {
        return this.splitDocuments;
    }

    /**
     * Set the splitDocuments property: If true, attempt to split documents if multiple documents are detected in a
     * single file.
     *
     * @param splitDocuments the splitDocuments value to set.
     * @return the WorkspaceCreate object itself.
     */
    public WorkspaceCreate setSplitDocuments(Boolean splitDocuments) {
        this.splitDocuments = splitDocuments;
        return this;
    }
}
