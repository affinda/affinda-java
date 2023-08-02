package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Workspace model. */
@Fluent
public final class Workspace {
    /*
     * Uniquely identify a workspace.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The organization property.
     */
    @JsonProperty(value = "organization")
    private Organization organization;

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
     * The collections property.
     */
    @JsonProperty(value = "collections")
    private List<WorkspaceCollectionsItem> collections;

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
     * The members property.
     */
    @JsonProperty(value = "members")
    private List<User> members;

    /*
     * Number of unvalidated documents in the workspace.
     */
    @JsonProperty(value = "unvalidatedDocsCount")
    private Integer unvalidatedDocsCount;

    /*
     * Number of validated documents in the workspace.
     */
    @JsonProperty(value = "confirmedDocsCount")
    private Integer confirmedDocsCount;

    /*
     * When you send email to this address, any document attached in the body
     * will be uploaded to this workspace.
     */
    @JsonProperty(value = "ingestEmail")
    private String ingestEmail;

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
     * @return the Workspace object itself.
     */
    public Workspace setIdentifier(String identifier) {
        this.identifier = identifier;
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
     * @return the Workspace object itself.
     */
    public Workspace setOrganization(Organization organization) {
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
     * @return the Workspace object itself.
     */
    public Workspace setName(String name) {
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
     * @return the Workspace object itself.
     */
    public Workspace setVisibility(WorkspaceVisibility visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the collections property: The collections property.
     *
     * @return the collections value.
     */
    public List<WorkspaceCollectionsItem> getCollections() {
        return this.collections;
    }

    /**
     * Set the collections property: The collections property.
     *
     * @param collections the collections value to set.
     * @return the Workspace object itself.
     */
    public Workspace setCollections(List<WorkspaceCollectionsItem> collections) {
        this.collections = collections;
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
     * @return the Workspace object itself.
     */
    public Workspace setRejectInvalidDocuments(Boolean rejectInvalidDocuments) {
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
     * @return the Workspace object itself.
     */
    public Workspace setRejectDuplicates(Boolean rejectDuplicates) {
        this.rejectDuplicates = rejectDuplicates;
        return this;
    }

    /**
     * Get the members property: The members property.
     *
     * @return the members value.
     */
    public List<User> getMembers() {
        return this.members;
    }

    /**
     * Set the members property: The members property.
     *
     * @param members the members value to set.
     * @return the Workspace object itself.
     */
    public Workspace setMembers(List<User> members) {
        this.members = members;
        return this;
    }

    /**
     * Get the unvalidatedDocsCount property: Number of unvalidated documents in the workspace.
     *
     * @return the unvalidatedDocsCount value.
     */
    public Integer getUnvalidatedDocsCount() {
        return this.unvalidatedDocsCount;
    }

    /**
     * Set the unvalidatedDocsCount property: Number of unvalidated documents in the workspace.
     *
     * @param unvalidatedDocsCount the unvalidatedDocsCount value to set.
     * @return the Workspace object itself.
     */
    public Workspace setUnvalidatedDocsCount(Integer unvalidatedDocsCount) {
        this.unvalidatedDocsCount = unvalidatedDocsCount;
        return this;
    }

    /**
     * Get the confirmedDocsCount property: Number of validated documents in the workspace.
     *
     * @return the confirmedDocsCount value.
     */
    public Integer getConfirmedDocsCount() {
        return this.confirmedDocsCount;
    }

    /**
     * Set the confirmedDocsCount property: Number of validated documents in the workspace.
     *
     * @param confirmedDocsCount the confirmedDocsCount value to set.
     * @return the Workspace object itself.
     */
    public Workspace setConfirmedDocsCount(Integer confirmedDocsCount) {
        this.confirmedDocsCount = confirmedDocsCount;
        return this;
    }

    /**
     * Get the ingestEmail property: When you send email to this address, any document attached in the body will be
     * uploaded to this workspace.
     *
     * @return the ingestEmail value.
     */
    public String getIngestEmail() {
        return this.ingestEmail;
    }

    /**
     * Set the ingestEmail property: When you send email to this address, any document attached in the body will be
     * uploaded to this workspace.
     *
     * @param ingestEmail the ingestEmail value to set.
     * @return the Workspace object itself.
     */
    public Workspace setIngestEmail(String ingestEmail) {
        this.ingestEmail = ingestEmail;
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
     * @return the Workspace object itself.
     */
    public Workspace setWhitelistIngestAddresses(List<String> whitelistIngestAddresses) {
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
     * @return the Workspace object itself.
     */
    public Workspace setSplitDocuments(Boolean splitDocuments) {
        this.splitDocuments = splitDocuments;
        return this;
    }
}
