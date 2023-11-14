package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IndexRequestBody. */
@Fluent
public final class IndexCreate {
    /*
     * Unique index name
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The documentType property.
     */
    @JsonProperty(value = "documentType")
    private DocumentType documentType;

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
     * @return the IndexCreate object itself.
     */
    public IndexCreate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the documentType property: The documentType property.
     *
     * @return the documentType value.
     */
    public DocumentType getDocumentType() {
        return this.documentType;
    }

    /**
     * Set the documentType property: The documentType property.
     *
     * @param documentType the documentType value to set.
     * @return the IndexCreate object itself.
     */
    public IndexCreate setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
        return this;
    }
}
