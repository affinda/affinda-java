package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema model. */
@Fluent
public final class Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The documentType property.
     */
    @JsonProperty(value = "documentType")
    private Enum6 documentType;

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
     * @return the Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the documentType property: The documentType property.
     *
     * @return the documentType value.
     */
    public Enum6 getDocumentType() {
        return this.documentType;
    }

    /**
     * Set the documentType property: The documentType property.
     *
     * @param documentType the documentType value to set.
     * @return the Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema setDocumentType(Enum6 documentType) {
        this.documentType = documentType;
        return this;
    }
}
