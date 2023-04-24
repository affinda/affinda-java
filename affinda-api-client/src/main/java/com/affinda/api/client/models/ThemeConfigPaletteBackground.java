package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ThemeConfigPaletteBackground model. */
@Fluent
public final class ThemeConfigPaletteBackground {
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
     * @return the ThemeConfigPaletteBackground object itself.
     */
    public ThemeConfigPaletteBackground setDefaultProperty(String defaultProperty) {
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
     * @return the ThemeConfigPaletteBackground object itself.
     */
    public ThemeConfigPaletteBackground setPaper(String paper) {
        this.paper = paper;
        return this;
    }
}
