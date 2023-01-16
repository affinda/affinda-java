package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentMetaCollectionExtractor model. */
@Fluent
public final class DocumentMetaCollectionExtractor {
    /*
     * Extractor's ID.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * The identifier property.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Base extractor's ID.
     */
    @JsonProperty(value = "baseExtractor")
    private Integer baseExtractor;

    /*
     * The validatable property.
     */
    @JsonProperty(value = "validatable")
    private Boolean validatable;

    /**
     * Get the id property: Extractor's ID.
     *
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: Extractor's ID.
     *
     * @param id the id value to set.
     * @return the DocumentMetaCollectionExtractor object itself.
     */
    public DocumentMetaCollectionExtractor setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the identifier property: The identifier property.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: The identifier property.
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
     * Get the baseExtractor property: Base extractor's ID.
     *
     * @return the baseExtractor value.
     */
    public Integer getBaseExtractor() {
        return this.baseExtractor;
    }

    /**
     * Set the baseExtractor property: Base extractor's ID.
     *
     * @param baseExtractor the baseExtractor value to set.
     * @return the DocumentMetaCollectionExtractor object itself.
     */
    public DocumentMetaCollectionExtractor setBaseExtractor(Integer baseExtractor) {
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
