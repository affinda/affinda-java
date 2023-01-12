package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * If this document is part of a splitted document, this attribute points to the original document that this document is
 * splitted from.
 */
@Fluent
public final class MetaParentDocument {
    /*
     * Uniquely identify a document.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /**
     * Get the identifier property: Uniquely identify a document.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify a document.
     *
     * @param identifier the identifier value to set.
     * @return the MetaParentDocument object itself.
     */
    public MetaParentDocument setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
}
