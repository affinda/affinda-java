package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExtractorUpdate model. */
@Fluent
public final class ExtractorUpdate {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
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
    private List<FieldGroup> fieldGroups;

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
     * @return the ExtractorUpdate object itself.
     */
    public ExtractorUpdate setName(String name) {
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
     * @return the ExtractorUpdate object itself.
     */
    public ExtractorUpdate setNamePlural(String namePlural) {
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
     * @return the ExtractorUpdate object itself.
     */
    public ExtractorUpdate setBaseExtractor(Integer baseExtractor) {
        this.baseExtractor = baseExtractor;
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
     * @return the ExtractorUpdate object itself.
     */
    public ExtractorUpdate setCategory(String category) {
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
     * @return the ExtractorUpdate object itself.
     */
    public ExtractorUpdate setValidatable(Boolean validatable) {
        this.validatable = validatable;
        return this;
    }

    /**
     * Get the fieldGroups property: The fieldGroups property.
     *
     * @return the fieldGroups value.
     */
    public List<FieldGroup> getFieldGroups() {
        return this.fieldGroups;
    }

    /**
     * Set the fieldGroups property: The fieldGroups property.
     *
     * @param fieldGroups the fieldGroups value to set.
     * @return the ExtractorUpdate object itself.
     */
    public ExtractorUpdate setFieldGroups(List<FieldGroup> fieldGroups) {
        this.fieldGroups = fieldGroups;
        return this;
    }
}
