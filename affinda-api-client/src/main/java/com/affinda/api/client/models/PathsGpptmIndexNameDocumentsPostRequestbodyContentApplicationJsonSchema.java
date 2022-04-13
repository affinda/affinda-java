package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema {
    /*
     * The document property.
     */
    @JsonProperty(value = "document")
    private String document;

    /**
     * Get the document property: The document property.
     *
     * @return the document value.
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * Set the document property: The document property.
     *
     * @param document the document value to set.
     * @return the PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema setDocument(String document) {
        this.document = document;
        return this;
    }
}
