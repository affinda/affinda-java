package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The BaseExtractor model. */
@Fluent
public final class BaseExtractor {
    /*
     * Uniquely identify an extractor.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The namePlural property.
     */
    @JsonProperty(value = "namePlural", required = true)
    private String namePlural;

    /*
     * The validatable property.
     */
    @JsonProperty(value = "validatable", required = true)
    private boolean validatable;

    /*
     * The isCustom property.
     */
    @JsonProperty(value = "isCustom")
    private Boolean isCustom;

    /*
     * The createdDt property.
     */
    @JsonProperty(value = "createdDt")
    private OffsetDateTime createdDt;

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
     * @return the BaseExtractor object itself.
     */
    public BaseExtractor setIdentifier(String identifier) {
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
     * @return the BaseExtractor object itself.
     */
    public BaseExtractor setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namePlural property: The namePlural property.
     *
     * @return the namePlural value.
     */
    public String getNamePlural() {
        return this.namePlural;
    }

    /**
     * Set the namePlural property: The namePlural property.
     *
     * @param namePlural the namePlural value to set.
     * @return the BaseExtractor object itself.
     */
    public BaseExtractor setNamePlural(String namePlural) {
        this.namePlural = namePlural;
        return this;
    }

    /**
     * Get the validatable property: The validatable property.
     *
     * @return the validatable value.
     */
    public boolean isValidatable() {
        return this.validatable;
    }

    /**
     * Set the validatable property: The validatable property.
     *
     * @param validatable the validatable value to set.
     * @return the BaseExtractor object itself.
     */
    public BaseExtractor setValidatable(boolean validatable) {
        this.validatable = validatable;
        return this;
    }

    /**
     * Get the isCustom property: The isCustom property.
     *
     * @return the isCustom value.
     */
    public Boolean isCustom() {
        return this.isCustom;
    }

    /**
     * Set the isCustom property: The isCustom property.
     *
     * @param isCustom the isCustom value to set.
     * @return the BaseExtractor object itself.
     */
    public BaseExtractor setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
        return this;
    }

    /**
     * Get the createdDt property: The createdDt property.
     *
     * @return the createdDt value.
     */
    public OffsetDateTime getCreatedDt() {
        return this.createdDt;
    }

    /**
     * Set the createdDt property: The createdDt property.
     *
     * @param createdDt the createdDt value to set.
     * @return the BaseExtractor object itself.
     */
    public BaseExtractor setCreatedDt(OffsetDateTime createdDt) {
        this.createdDt = createdDt;
        return this;
    }
}
