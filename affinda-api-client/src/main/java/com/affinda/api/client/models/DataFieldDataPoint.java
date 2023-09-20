package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

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

    /*
     * The identifier of the parent data point if applicable.
     */
    @JsonProperty(value = "parent", required = true)
    private String parent;

    /*
     * The children property.
     */
    @JsonProperty(value = "children", required = true)
    private List<DataPoint> children;

    /*
     * If true, the model will not be used to predict this data point. Instead,
     * the user will be able to manually enter the value in the validation
     * tool.
     */
    @JsonProperty(value = "manualEntry")
    private Boolean manualEntry;

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
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setName(String name) {
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
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setParent(String parent) {
        this.parent = parent;
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
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setChildren(List<DataPoint> children) {
        this.children = children;
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
     * @return the DataFieldDataPoint object itself.
     */
    public DataFieldDataPoint setManualEntry(Boolean manualEntry) {
        this.manualEntry = manualEntry;
        return this;
    }
}
