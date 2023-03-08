package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths16Tz5M5V2IndexNameDocumentsGetResponses200ContentApplicationJsonSchemaPropertiesResultsItems model. */
@Fluent
public final class Paths16Tz5M5V2IndexNameDocumentsGetResponses200ContentApplicationJsonSchemaPropertiesResultsItems {
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
     * @return the Paths16Tz5M5V2IndexNameDocumentsGetResponses200ContentApplicationJsonSchemaPropertiesResultsItems
     *     object itself.
     */
    public Paths16Tz5M5V2IndexNameDocumentsGetResponses200ContentApplicationJsonSchemaPropertiesResultsItems
            setDocument(String document) {
        this.document = document;
        return this;
    }
}
