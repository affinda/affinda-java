package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataPointCreate model. */
@Fluent
public final class DataPointCreate {
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

    /*
     * If true, both the value and the label for the enums will appear in the
     * dropdown in the validation tool.
     */
    @JsonProperty(value = "displayEnumValue")
    private Boolean displayEnumValue;

    /*
     * The identifier of the parent data point if applicable.
     */
    @JsonProperty(value = "parent")
    private String parent;

    /*
     * If true, the model will not be used to predict this data point. Instead,
     * the user will be able to manually enter the value in the validation
     * tool.
     */
    @JsonProperty(value = "manualEntry")
    private Boolean manualEntry;

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
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setName(String name) {
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

    /**
     * Get the displayEnumValue property: If true, both the value and the label for the enums will appear in the
     * dropdown in the validation tool.
     *
     * @return the displayEnumValue value.
     */
    public Boolean isDisplayEnumValue() {
        return this.displayEnumValue;
    }

    /**
     * Set the displayEnumValue property: If true, both the value and the label for the enums will appear in the
     * dropdown in the validation tool.
     *
     * @param displayEnumValue the displayEnumValue value to set.
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setDisplayEnumValue(Boolean displayEnumValue) {
        this.displayEnumValue = displayEnumValue;
        return this;
    }

    /**
     * Get the parent property: The identifier of the parent data point if applicable.
     *
     * @return the parent value.
     */
    public String getParent() {
        return this.parent;
    }

    /**
     * Set the parent property: The identifier of the parent data point if applicable.
     *
     * @param parent the parent value to set.
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get the manualEntry property: If true, the model will not be used to predict this data point. Instead, the user
     * will be able to manually enter the value in the validation tool.
     *
     * @return the manualEntry value.
     */
    public Boolean isManualEntry() {
        return this.manualEntry;
    }

    /**
     * Set the manualEntry property: If true, the model will not be used to predict this data point. Instead, the user
     * will be able to manually enter the value in the validation tool.
     *
     * @param manualEntry the manualEntry value to set.
     * @return the DataPointCreate object itself.
     */
    public DataPointCreate setManualEntry(Boolean manualEntry) {
        this.manualEntry = manualEntry;
        return this;
    }
}
