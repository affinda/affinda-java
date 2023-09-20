package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

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
     * Option "leave" means no document splitting at all. Option "conservative"
     * means we don't actually split documents the documents, but will add a
     * warning to documents that may require a split. Option "recommended"
     * means we split documents that are highly likely to require a split, and
     * add warnings to documents that might require one. Option "aggressive"
     * means we split all documents that are likely to require a split.
     */
    @JsonProperty(value = "documentSplitter")
    private WorkspaceSplitDocumentsOptions documentSplitter;

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
     * @return the WorkspaceUpdate object itself.
     */
    public WorkspaceUpdate setRejectDuplicates(Boolean rejectDuplicates) {
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
     * @return the WorkspaceUpdate object itself.
     */
    public WorkspaceUpdate setWhitelistIngestAddresses(List<String> whitelistIngestAddresses) {
        this.whitelistIngestAddresses = whitelistIngestAddresses;
        return this;
    }

    /**
     * Get the documentSplitter property: Option "leave" means no document splitting at all. Option "conservative" means
     * we don't actually split documents the documents, but will add a warning to documents that may require a split.
     * Option "recommended" means we split documents that are highly likely to require a split, and add warnings to
     * documents that might require one. Option "aggressive" means we split all documents that are likely to require a
     * split.
     *
     * @return the documentSplitter value.
     */
    public WorkspaceSplitDocumentsOptions getDocumentSplitter() {
        return this.documentSplitter;
    }

    /**
     * Set the documentSplitter property: Option "leave" means no document splitting at all. Option "conservative" means
     * we don't actually split documents the documents, but will add a warning to documents that may require a split.
     * Option "recommended" means we split documents that are highly likely to require a split, and add warnings to
     * documents that might require one. Option "aggressive" means we split all documents that are likely to require a
     * split.
     *
     * @param documentSplitter the documentSplitter value to set.
     * @return the WorkspaceUpdate object itself.
     */
    public WorkspaceUpdate setDocumentSplitter(WorkspaceSplitDocumentsOptions documentSplitter) {
        this.documentSplitter = documentSplitter;
        return this;
    }
}
