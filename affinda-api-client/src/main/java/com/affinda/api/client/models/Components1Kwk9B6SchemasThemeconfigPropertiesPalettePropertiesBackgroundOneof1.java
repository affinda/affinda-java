package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components1Kwk9B6SchemasThemeconfigPropertiesPalettePropertiesBackgroundOneof1 model. */
@Fluent
public final class Components1Kwk9B6SchemasThemeconfigPropertiesPalettePropertiesBackgroundOneof1 {
    /*
     * The default property.
     */
    @JsonProperty(value = "default")
    private String defaultProperty;

    /*
     * The paper property.
     */
    @JsonProperty(value = "paper")
    private String paper;

    /**
     * Get the defaultProperty property: The default property.
     *
     * @return the defaultProperty value.
     */
    public String getDefaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: The default property.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the Components1Kwk9B6SchemasThemeconfigPropertiesPalettePropertiesBackgroundOneof1 object itself.
     */
    public Components1Kwk9B6SchemasThemeconfigPropertiesPalettePropertiesBackgroundOneof1 setDefaultProperty(
            String defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the paper property: The paper property.
     *
     * @return the paper value.
     */
    public String getPaper() {
        return this.paper;
    }

    /**
     * Set the paper property: The paper property.
     *
     * @param paper the paper value to set.
     * @return the Components1Kwk9B6SchemasThemeconfigPropertiesPalettePropertiesBackgroundOneof1 object itself.
     */
    public Components1Kwk9B6SchemasThemeconfigPropertiesPalettePropertiesBackgroundOneof1 setPaper(String paper) {
        this.paper = paper;
        return this;
    }
}
