package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DocumentMetaCollection model. */
@Fluent
public final class DocumentMetaCollection {
    /*
     * Uniquely identify a collection.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The extractor property.
     */
    @JsonProperty(value = "extractor")
    private DocumentMetaCollectionExtractor extractor;

    /*
     * The validationRules property.
     */
    @JsonProperty(value = "validationRules")
    private List<ValidationRule> validationRules;

    /**
     * Get the identifier property: Uniquely identify a collection.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify a collection.
     *
     * @param identifier the identifier value to set.
     * @return the DocumentMetaCollection object itself.
     */
    public DocumentMetaCollection setIdentifier(String identifier) {
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
     * @return the DocumentMetaCollection object itself.
     */
    public DocumentMetaCollection setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the extractor property: The extractor property.
     *
     * @return the extractor value.
     */
    public DocumentMetaCollectionExtractor getExtractor() {
        return this.extractor;
    }

    /**
     * Set the extractor property: The extractor property.
     *
     * @param extractor the extractor value to set.
     * @return the DocumentMetaCollection object itself.
     */
    public DocumentMetaCollection setExtractor(DocumentMetaCollectionExtractor extractor) {
        this.extractor = extractor;
        return this;
    }

    /**
     * Get the validationRules property: The validationRules property.
     *
     * @return the validationRules value.
     */
    public List<ValidationRule> getValidationRules() {
        return this.validationRules;
    }

    /**
     * Set the validationRules property: The validationRules property.
     *
     * @param validationRules the validationRules value to set.
     * @return the DocumentMetaCollection object itself.
     */
    public DocumentMetaCollection setValidationRules(List<ValidationRule> validationRules) {
        this.validationRules = validationRules;
        return this;
    }
}
