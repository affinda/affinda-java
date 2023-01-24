package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DataPoint model. */
@Fluent
public final class DataPoint {
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
    @JsonProperty(value = "slug")
    private String slug;

    /*
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The annotationContentType property.
     */
    @JsonProperty(value = "annotationContentType", required = true)
    private AnnotationContentType annotationContentType;

    /*
     * The organization property.
     */
    @JsonProperty(value = "organization")
    private Organization organization;

    /*
     * Extractor's ID.
     */
    @JsonProperty(value = "extractor", required = true)
    private Integer extractor;

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

    /*
     * The choices property.
     */
    @JsonProperty(value = "choices")
    private List<DataPointChoicesItem> choices;

    /*
     * The children property.
     */
    @JsonProperty(value = "children")
    private List<DataPoint> children;

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
     * @return the DataPoint object itself.
     */
    public DataPoint setIdentifier(String identifier) {
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
     * @return the DataPoint object itself.
     */
    public DataPoint setName(String name) {
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
     * @return the DataPoint object itself.
     */
    public DataPoint setSlug(String slug) {
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
     * @return the DataPoint object itself.
     */
    public DataPoint setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the annotationContentType property: The annotationContentType property.
     *
     * @return the annotationContentType value.
     */
    public AnnotationContentType getAnnotationContentType() {
        return this.annotationContentType;
    }

    /**
     * Set the annotationContentType property: The annotationContentType property.
     *
     * @param annotationContentType the annotationContentType value to set.
     * @return the DataPoint object itself.
     */
    public DataPoint setAnnotationContentType(AnnotationContentType annotationContentType) {
        this.annotationContentType = annotationContentType;
        return this;
    }

    /**
     * Get the organization property: The organization property.
     *
     * @return the organization value.
     */
    public Organization getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization property: The organization property.
     *
     * @param organization the organization value to set.
     * @return the DataPoint object itself.
     */
    public DataPoint setOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the extractor property: Extractor's ID.
     *
     * @return the extractor value.
     */
    public Integer getExtractor() {
        return this.extractor;
    }

    /**
     * Set the extractor property: Extractor's ID.
     *
     * @param extractor the extractor value to set.
     * @return the DataPoint object itself.
     */
    public DataPoint setExtractor(Integer extractor) {
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
     * @return the DataPoint object itself.
     */
    public DataPoint setMultiple(Boolean multiple) {
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
     * @return the DataPoint object itself.
     */
    public DataPoint setNoRect(Boolean noRect) {
        this.noRect = noRect;
        return this;
    }

    /**
     * Get the choices property: The choices property.
     *
     * @return the choices value.
     */
    public List<DataPointChoicesItem> getChoices() {
        return this.choices;
    }

    /**
     * Set the choices property: The choices property.
     *
     * @param choices the choices value to set.
     * @return the DataPoint object itself.
     */
    public DataPoint setChoices(List<DataPointChoicesItem> choices) {
        this.choices = choices;
        return this;
    }

    /**
     * Get the children property: The children property.
     *
     * @return the children value.
     */
    public List<DataPoint> getChildren() {
        return this.children;
    }

    /**
     * Set the children property: The children property.
     *
     * @param children the children value to set.
     * @return the DataPoint object itself.
     */
    public DataPoint setChildren(List<DataPoint> children) {
        this.children = children;
        return this;
    }
}
