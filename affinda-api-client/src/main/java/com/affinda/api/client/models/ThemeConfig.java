package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ThemeConfig model. */
@Fluent
public final class ThemeConfig {
    /*
     * The palette property.
     */
    @JsonProperty(value = "palette")
    private ThemeConfigPalette palette;

    /*
     * The typography property.
     */
    @JsonProperty(value = "typography")
    private ThemeConfigTypography typography;

    /*
     * The borderRadius property.
     */
    @JsonProperty(value = "borderRadius")
    private Float borderRadius;

    /*
     * The fontUrl property.
     */
    @JsonProperty(value = "fontUrl")
    private String fontUrl;

    /**
     * Get the palette property: The palette property.
     *
     * @return the palette value.
     */
    public ThemeConfigPalette getPalette() {
        return this.palette;
    }

    /**
     * Set the palette property: The palette property.
     *
     * @param palette the palette value to set.
     * @return the ThemeConfig object itself.
     */
    public ThemeConfig setPalette(ThemeConfigPalette palette) {
        this.palette = palette;
        return this;
    }

    /**
     * Get the typography property: The typography property.
     *
     * @return the typography value.
     */
    public ThemeConfigTypography getTypography() {
        return this.typography;
    }

    /**
     * Set the typography property: The typography property.
     *
     * @param typography the typography value to set.
     * @return the ThemeConfig object itself.
     */
    public ThemeConfig setTypography(ThemeConfigTypography typography) {
        this.typography = typography;
        return this;
    }

    /**
     * Get the borderRadius property: The borderRadius property.
     *
     * @return the borderRadius value.
     */
    public Float getBorderRadius() {
        return this.borderRadius;
    }

    /**
     * Set the borderRadius property: The borderRadius property.
     *
     * @param borderRadius the borderRadius value to set.
     * @return the ThemeConfig object itself.
     */
    public ThemeConfig setBorderRadius(Float borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    /**
     * Get the fontUrl property: The fontUrl property.
     *
     * @return the fontUrl value.
     */
    public String getFontUrl() {
        return this.fontUrl;
    }

    /**
     * Set the fontUrl property: The fontUrl property.
     *
     * @param fontUrl the fontUrl value to set.
     * @return the ThemeConfig object itself.
     */
    public ThemeConfig setFontUrl(String fontUrl) {
        this.fontUrl = fontUrl;
        return this;
    }
}
