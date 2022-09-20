package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Get200ApplicationJsonPropertiesItemsItem model. */
@Fluent
public final class Get200ApplicationJsonPropertiesItemsItem {
    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The documentType property.
     */
    @JsonProperty(value = "documentType")
    private GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType documentType;

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
     * @return the Get200ApplicationJsonPropertiesItemsItem object itself.
     */
    public Get200ApplicationJsonPropertiesItemsItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the documentType property: The documentType property.
     *
     * @return the documentType value.
     */
    public GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType getDocumentType() {
        return this.documentType;
    }

    /**
     * Set the documentType property: The documentType property.
     *
     * @param documentType the documentType value to set.
     * @return the Get200ApplicationJsonPropertiesItemsItem object itself.
     */
    public Get200ApplicationJsonPropertiesItemsItem setDocumentType(
            GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType documentType) {
        this.documentType = documentType;
        return this;
    }
}
