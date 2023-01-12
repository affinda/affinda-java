package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExtractorCreate model. */
@Fluent
public final class ExtractorCreate {
    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The namePlural property.
     */
    @JsonProperty(value = "namePlural")
    private String namePlural;

    /*
     * The base extractor's ID.
     */
    @JsonProperty(value = "baseExtractor")
    private Integer baseExtractor;

    /*
     * Uniquely identify an organization.
     */
    @JsonProperty(value = "organization", required = true)
    private String organization;

    /*
     * The category property.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The validatable property.
     */
    @JsonProperty(value = "validatable")
    private Boolean validatable;

    /*
     * The fieldGroups property.
     */
    @JsonProperty(value = "fieldGroups")
    private FieldGroups fieldGroups;

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
     * @return the ExtractorCreate object itself.
     */
    public ExtractorCreate setName(String name) {
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
     * @return the ExtractorCreate object itself.
     */
    public ExtractorCreate setNamePlural(String namePlural) {
        this.namePlural = namePlural;
        return this;
    }

    /**
     * Get the baseExtractor property: The base extractor's ID.
     *
     * @return the baseExtractor value.
     */
    public Integer getBaseExtractor() {
        return this.baseExtractor;
    }

    /**
     * Set the baseExtractor property: The base extractor's ID.
     *
     * @param baseExtractor the baseExtractor value to set.
     * @return the ExtractorCreate object itself.
     */
    public ExtractorCreate setBaseExtractor(Integer baseExtractor) {
        this.baseExtractor = baseExtractor;
        return this;
    }

    /**
     * Get the organization property: Uniquely identify an organization.
     *
     * @return the organization value.
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization property: Uniquely identify an organization.
     *
     * @param organization the organization value to set.
     * @return the ExtractorCreate object itself.
     */
    public ExtractorCreate setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the category property: The category property.
     *
     * @return the category value.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Set the category property: The category property.
     *
     * @param category the category value to set.
     * @return the ExtractorCreate object itself.
     */
    public ExtractorCreate setCategory(String category) {
        this.category = category;
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
     * @return the ExtractorCreate object itself.
     */
    public ExtractorCreate setValidatable(Boolean validatable) {
        this.validatable = validatable;
        return this;
    }

    /**
     * Get the fieldGroups property: The fieldGroups property.
     *
     * @return the fieldGroups value.
     */
    public FieldGroups getFieldGroups() {
        return this.fieldGroups;
    }

    /**
     * Set the fieldGroups property: The fieldGroups property.
     *
     * @param fieldGroups the fieldGroups value to set.
     * @return the ExtractorCreate object itself.
     */
    public ExtractorCreate setFieldGroups(FieldGroups fieldGroups) {
        this.fieldGroups = fieldGroups;
        return this;
    }
}
