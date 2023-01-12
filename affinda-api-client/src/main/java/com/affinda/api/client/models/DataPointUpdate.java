package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataPointUpdate model. */
@Fluent
public final class DataPointUpdate {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
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
     * @return the DataPointUpdate object itself.
     */
    public DataPointUpdate setName(String name) {
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
}
