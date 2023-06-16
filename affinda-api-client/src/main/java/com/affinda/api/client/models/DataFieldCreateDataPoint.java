package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The data point to be created for this field. If a data point with the same slug and collection already exists, it
 * will be reused.
 */
@Fluent
public final class DataFieldCreateDataPoint {
    /*
     * Name of the data point.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A camelCase string that will be used as the key in the API response.
     */
    @JsonProperty(value = "slug", required = true)
    private String slug;

    /*
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The different data types of annotations
     */
    @JsonProperty(value = "type", required = true)
    private AnnotationContentType type;

    /*
     * The multiple property.
     */
    @JsonProperty(value = "multiple")
    private Boolean multiple;

    /*
     * The noRect property.
     */
    @JsonProperty(value = "noRect")
    private Boolean noRect;

    /**
     * Get the name property: Name of the data point.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the data point.
     *
     * @param name the name value to set.
     * @return the DataFieldCreateDataPoint object itself.
     */
    public DataFieldCreateDataPoint setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the slug property: A camelCase string that will be used as the key in the API response.
     *
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: A camelCase string that will be used as the key in the API response.
     *
     * @param slug the slug value to set.
     * @return the DataFieldCreateDataPoint object itself.
     */
    public DataFieldCreateDataPoint setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the description property: The description property.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description property.
     *
     * @param description the description value to set.
     * @return the DataFieldCreateDataPoint object itself.
     */
    public DataFieldCreateDataPoint setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the type property: The different data types of annotations.
     *
     * @return the type value.
     */
    public AnnotationContentType getType() {
        return this.type;
    }

    /**
     * Set the type property: The different data types of annotations.
     *
     * @param type the type value to set.
     * @return the DataFieldCreateDataPoint object itself.
     */
    public DataFieldCreateDataPoint setType(AnnotationContentType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the multiple property: The multiple property.
     *
     * @return the multiple value.
     */
    public Boolean isMultiple() {
        return this.multiple;
    }

    /**
     * Set the multiple property: The multiple property.
     *
     * @param multiple the multiple value to set.
     * @return the DataFieldCreateDataPoint object itself.
     */
    public DataFieldCreateDataPoint setMultiple(Boolean multiple) {
        this.multiple = multiple;
        return this;
    }

    /**
     * Get the noRect property: The noRect property.
     *
     * @return the noRect value.
     */
    public Boolean isNoRect() {
        return this.noRect;
    }

    /**
     * Set the noRect property: The noRect property.
     *
     * @param noRect the noRect value to set.
     * @return the DataFieldCreateDataPoint object itself.
     */
    public DataFieldCreateDataPoint setNoRect(Boolean noRect) {
        this.noRect = noRect;
        return this;
    }
}
