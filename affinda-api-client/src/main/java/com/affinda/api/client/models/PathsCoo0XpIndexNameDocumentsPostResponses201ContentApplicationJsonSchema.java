package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsCoo0XpIndexNameDocumentsPostResponses201ContentApplicationJsonSchema model. */
@Fluent
public final class PathsCoo0XpIndexNameDocumentsPostResponses201ContentApplicationJsonSchema {
    /*
     * Unique identifier for the document.
     */
    @JsonProperty(value = "document")
    private String document;

    /**
     * Get the document property: Unique identifier for the document.
     *
     * @return the document value.
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * Set the document property: Unique identifier for the document.
     *
     * @param document the document value to set.
     * @return the PathsCoo0XpIndexNameDocumentsPostResponses201ContentApplicationJsonSchema object itself.
     */
    public PathsCoo0XpIndexNameDocumentsPostResponses201ContentApplicationJsonSchema setDocument(String document) {
        this.document = document;
        return this;
    }
}
