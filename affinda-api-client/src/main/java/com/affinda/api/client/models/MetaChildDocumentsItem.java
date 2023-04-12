package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MetaChildDocumentsItem model. */
@Fluent
public final class MetaChildDocumentsItem {
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
     * @return the MetaChildDocumentsItem object itself.
     */
    public MetaChildDocumentsItem setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
}
