package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Get200ApplicationJsonPropertiesItemsItem model. */
@Fluent
public final class Get200ApplicationJsonPropertiesItemsItem {
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
     * @return the Get200ApplicationJsonPropertiesItemsItem object itself.
     */
    public Get200ApplicationJsonPropertiesItemsItem setDocument(String document) {
        this.document = document;
        return this;
    }
}
