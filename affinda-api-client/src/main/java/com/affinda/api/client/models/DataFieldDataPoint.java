package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The data point to be created for this field. If a data point with the same slug and collection already exists, it
 * will be reused.
 */
@Fluent
public final class DataFieldDataPoint {
    /*
     * Uniquely identify a data point.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The slug property.
     */
    @JsonProperty(value = "slug", required = true)
    private String slug;

    /*
     * The description property.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /*
     * The different data types of annotations
     */
    @JsonProperty(value = "type", required = true)
    private AnnotationContentType type;

    /*
     * The multiple property.
     */
    @JsonProperty(value = "multiple", required = true)
    private boolean multiple;

    /*
     * The noRect property.
     */
    @JsonProperty(value = "noRect", required = true)
    private boolean noRect;

    /**
     * Get the identifier property: Uniquely identify a data point.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify a data point.
     *
     * @param identifier the identifier value to set.
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setIdentifier(String identifier) {
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
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the slug property: The slug property.
     *
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: The slug property.
     *
     * @param slug the slug value to set.
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setSlug(String slug) {
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
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setDescription(String description) {
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
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setType(AnnotationContentType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the multiple property: The multiple property.
     *
     * @return the multiple value.
     */
    public boolean isMultiple() {
        return this.multiple;
    }

    /**
     * Set the multiple property: The multiple property.
     *
     * @param multiple the multiple value to set.
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setMultiple(boolean multiple) {
        this.multiple = multiple;
        return this;
    }

    /**
     * Get the noRect property: The noRect property.
     *
     * @return the noRect value.
     */
    public boolean isNoRect() {
        return this.noRect;
    }

    /**
     * Set the noRect property: The noRect property.
     *
     * @param noRect the noRect value to set.
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setNoRect(boolean noRect) {
        this.noRect = noRect;
        return this;
    }
}
