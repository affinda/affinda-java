package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataPointUpdate model. */
@Fluent
public final class DataPointUpdate {
    /*
     * Name of the data point.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A camelCase string that will be used as the key in the API response.
     */
    @JsonProperty(value = "slug")
    private String slug;

    /*
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

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
     * @return the DataPointUpdate object itself.
     */
    public DataPointUpdate setName(String name) {
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
     * @return the DataPointUpdate object itself.
     */
    public DataPointUpdate setSlug(String slug) {
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
     * @return the DataPointUpdate object itself.
     */
    public DataPointUpdate setDescription(String description) {
        this.description = description;
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
     * @return the DataPointUpdate object itself.
     */
    public DataPointUpdate setDisplayEnumValue(Boolean displayEnumValue) {
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
     * @return the DataPointUpdate object itself.
     */
    public DataPointUpdate setParent(String parent) {
        this.parent = parent;
        return this;
    }
}
