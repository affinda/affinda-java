package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataPointCreate model. */
@Fluent
public final class DataPointCreate {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The slug property.
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
    @JsonProperty(value = "annotationContentType", required = true)
    private AnnotationContentType annotationContentType;

    /*
     * Uniquely identify an organization.
     */
    @JsonProperty(value = "organization", required = true)
    private String organization;

    /*
     * Uniquely identify an extractor.
     */
    @JsonProperty(value = "extractor", required = true)
    private String extractor;

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
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setName(String name) {
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
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setSlug(String slug) {
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
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the annotationContentType property: The different data types of annotations.
     *
     * @return the annotationContentType value.
     */
    public AnnotationContentType getAnnotationContentType() {
        return this.annotationContentType;
    }

    /**
     * Set the annotationContentType property: The different data types of annotations.
     *
     * @param annotationContentType the annotationContentType value to set.
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setAnnotationContentType(AnnotationContentType annotationContentType) {
        this.annotationContentType = annotationContentType;
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
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the extractor property: Uniquely identify an extractor.
     *
     * @return the extractor value.
     */
    public String getExtractor() {
        return this.extractor;
    }

    /**
     * Set the extractor property: Uniquely identify an extractor.
     *
     * @param extractor the extractor value to set.
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setExtractor(String extractor) {
        this.extractor = extractor;
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
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setMultiple(Boolean multiple) {
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
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setNoRect(Boolean noRect) {
        this.noRect = noRect;
        return this;
    }
}
