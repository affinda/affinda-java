package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WorkspaceCollectionsItem model. */
@Fluent
public final class WorkspaceCollectionsItem {
    /*
     * Uniquely identify a collection.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The extractor property.
     */
    @JsonProperty(value = "extractor", required = true)
    private WorkspaceCollectionsItemExtractor extractor;

    /*
     * Number of unvalidated documents in the collection.
     */
    @JsonProperty(value = "unvalidatedDocsCount")
    private Integer unvalidatedDocsCount;

    /*
     * Number of validated documents in the collection.
     */
    @JsonProperty(value = "confirmedDocsCount")
    private Integer confirmedDocsCount;

    /**
     * Get the identifier property: Uniquely identify a collection.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify a collection.
     *
     * @param identifier the identifier value to set.
     * @return the WorkspaceCollectionsItem object itself.
     */
    public WorkspaceCollectionsItem setIdentifier(String identifier) {
        this.identifier = identifier;
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
     * @return the WorkspaceCollectionsItem object itself.
     */
    public WorkspaceCollectionsItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the extractor property: The extractor property.
     *
     * @return the extractor value.
     */
    public WorkspaceCollectionsItemExtractor getExtractor() {
        return this.extractor;
    }

    /**
     * Set the extractor property: The extractor property.
     *
     * @param extractor the extractor value to set.
     * @return the WorkspaceCollectionsItem object itself.
     */
    public WorkspaceCollectionsItem setExtractor(WorkspaceCollectionsItemExtractor extractor) {
        this.extractor = extractor;
        return this;
    }

    /**
     * Get the unvalidatedDocsCount property: Number of unvalidated documents in the collection.
     *
     * @return the unvalidatedDocsCount value.
     */
    public Integer getUnvalidatedDocsCount() {
        return this.unvalidatedDocsCount;
    }

    /**
     * Set the unvalidatedDocsCount property: Number of unvalidated documents in the collection.
     *
     * @param unvalidatedDocsCount the unvalidatedDocsCount value to set.
     * @return the WorkspaceCollectionsItem object itself.
     */
    public WorkspaceCollectionsItem setUnvalidatedDocsCount(Integer unvalidatedDocsCount) {
        this.unvalidatedDocsCount = unvalidatedDocsCount;
        return this;
    }

    /**
     * Get the confirmedDocsCount property: Number of validated documents in the collection.
     *
     * @return the confirmedDocsCount value.
     */
    public Integer getConfirmedDocsCount() {
        return this.confirmedDocsCount;
    }

    /**
     * Set the confirmedDocsCount property: Number of validated documents in the collection.
     *
     * @param confirmedDocsCount the confirmedDocsCount value to set.
     * @return the WorkspaceCollectionsItem object itself.
     */
    public WorkspaceCollectionsItem setConfirmedDocsCount(Integer confirmedDocsCount) {
        this.confirmedDocsCount = confirmedDocsCount;
        return this;
    }
}
