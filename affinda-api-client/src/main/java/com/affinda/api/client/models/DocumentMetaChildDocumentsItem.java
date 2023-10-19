package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentMetaChildDocumentsItem model. */
@Fluent
public final class DocumentMetaChildDocumentsItem {
    /*
     * Unique identifier for the document
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /**
     * Get the identifier property: Unique identifier for the document.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Unique identifier for the document.
     *
     * @param identifier the identifier value to set.
     * @return the DocumentMetaChildDocumentsItem object itself.
     */
    public DocumentMetaChildDocumentsItem setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
}
