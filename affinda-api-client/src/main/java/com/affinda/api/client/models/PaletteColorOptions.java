package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PaletteColorOptions model. */
@Fluent
public final class PaletteColorOptions {
    /*
     * The main property.
     */
    @JsonProperty(value = "main", required = true)
    private String main;

    /*
     * The light property.
     */
    @JsonProperty(value = "light")
    private String light;

    /*
     * The dark property.
     */
    @JsonProperty(value = "dark")
    private String dark;

    /*
     * The contrastText property.
     */
    @JsonProperty(value = "contrastText")
    private String contrastText;

    /**
     * Get the main property: The main property.
     *
     * @return the main value.
     */
    public String getMain() {
        return this.main;
    }

    /**
     * Set the main property: The main property.
     *
     * @param main the main value to set.
     * @return the PaletteColorOptions object itself.
     */
    public PaletteColorOptions setMain(String main) {
        this.main = main;
        return this;
    }

    /**
     * Get the light property: The light property.
     *
     * @return the light value.
     */
    public String getLight() {
        return this.light;
    }

    /**
     * Set the light property: The light property.
     *
     * @param light the light value to set.
     * @return the PaletteColorOptions object itself.
     */
    public PaletteColorOptions setLight(String light) {
        this.light = light;
        return this;
    }

    /**
     * Get the dark property: The dark property.
     *
     * @return the dark value.
     */
    public String getDark() {
        return this.dark;
    }

    /**
     * Set the dark property: The dark property.
     *
     * @param dark the dark value to set.
     * @return the PaletteColorOptions object itself.
     */
    public PaletteColorOptions setDark(String dark) {
        this.dark = dark;
        return this;
    }

    /**
     * Get the contrastText property: The contrastText property.
     *
     * @return the contrastText value.
     */
    public String getContrastText() {
        return this.contrastText;
    }

    /**
     * Set the contrastText property: The contrastText property.
     *
     * @param contrastText the contrastText value to set.
     * @return the PaletteColorOptions object itself.
     */
    public PaletteColorOptions setContrastText(String contrastText) {
        this.contrastText = contrastText;
        return this;
    }
}
