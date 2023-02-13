package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentMetaCollectionExtractor model. */
@Fluent
public final class DocumentMetaCollectionExtractor {
    /*
     * Uniquely identify an extractor.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Base extractor's identifier.
     */
    @JsonProperty(value = "baseExtractor")
    private String baseExtractor;

    /*
     * The validatable property.
     */
    @JsonProperty(value = "validatable")
    private Boolean validatable;

    /**
     * Get the identifier property: Uniquely identify an extractor.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify an extractor.
     *
     * @param identifier the identifier value to set.
     * @return the DocumentMetaCollectionExtractor object itself.
     */
    public DocumentMetaCollectionExtractor setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

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
     * @return the DocumentMetaCollectionExtractor object itself.
     */
    public DocumentMetaCollectionExtractor setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the baseExtractor property: Base extractor's identifier.
     *
     * @return the baseExtractor value.
     */
    public String getBaseExtractor() {
        return this.baseExtractor;
    }

    /**
     * Set the baseExtractor property: Base extractor's identifier.
     *
     * @param baseExtractor the baseExtractor value to set.
     * @return the DocumentMetaCollectionExtractor object itself.
     */
    public DocumentMetaCollectionExtractor setBaseExtractor(String baseExtractor) {
        this.baseExtractor = baseExtractor;
        return this;
    }

    /**
     * Get the validatable property: The validatable property.
     *
     * @return the validatable value.
     */
    public Boolean isValidatable() {
        return this.validatable;
    }

    /**
     * Set the validatable property: The validatable property.
     *
     * @param validatable the validatable value to set.
     * @return the DocumentMetaCollectionExtractor object itself.
     */
    public DocumentMetaCollectionExtractor setValidatable(Boolean validatable) {
        this.validatable = validatable;
        return this;
    }
}
