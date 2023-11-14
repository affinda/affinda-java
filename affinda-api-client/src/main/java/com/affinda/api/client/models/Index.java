package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Index model. */
@Fluent
public final class Index {
    /*
     * Unique index name
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The documentType property.
     */
    @JsonProperty(value = "documentType", required = true)
    private IndexDocumentType documentType;

    /*
     * The user who created this index
     */
    @JsonProperty(value = "user", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private IndexUser user;

    /**
     * Get the name property: Unique index name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Unique index name.
     *
     * @param name the name value to set.
     * @return the Index object itself.
     */
    public Index setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the documentType property: The documentType property.
     *
     * @return the documentType value.
     */
    public IndexDocumentType getDocumentType() {
        return this.documentType;
    }

    /**
     * Set the documentType property: The documentType property.
     *
     * @param documentType the documentType value to set.
     * @return the Index object itself.
     */
    public Index setDocumentType(IndexDocumentType documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * Get the user property: The user who created this index.
     *
     * @return the user value.
     */
    public IndexUser getUser() {
        return this.user;
    }
}
