package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ThemeConfigPalette model. */
@Fluent
public final class ThemeConfigPalette {
    /*
     * The mode property.
     */
    @JsonProperty(value = "mode")
    private ThemeConfigPaletteMode mode;

    /*
     * Anything
     */
    @JsonProperty(value = "background")
    private Object background;

    /*
     * The text property.
     */
    @JsonProperty(value = "text")
    private ThemeConfigPaletteText text;

    /*
     * The divider property.
     */
    @JsonProperty(value = "divider")
    private String divider;

    /*
     * The primary property.
     */
    @JsonProperty(value = "primary")
    private PaletteColorOptions primary;

    /*
     * The secondary property.
     */
    @JsonProperty(value = "secondary")
    private PaletteColorOptions secondary;

    /*
     * The success property.
     */
    @JsonProperty(value = "success")
    private PaletteColorOptions success;

    /*
     * The annotation property.
     */
    @JsonProperty(value = "annotation")
    private PaletteColorOptions annotation;

    /*
     * The error property.
     */
    @JsonProperty(value = "error")
    private PaletteColorOptions error;

    /*
     * The info property.
     */
    @JsonProperty(value = "info")
    private PaletteColorOptions info;

    /*
     * The warning property.
     */
    @JsonProperty(value = "warning")
    private PaletteColorOptions warning;

    /**
     * Get the mode property: The mode property.
     *
     * @return the mode value.
     */
    public ThemeConfigPaletteMode getMode() {
        return this.mode;
    }

    /**
     * Set the mode property: The mode property.
     *
     * @param mode the mode value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setMode(ThemeConfigPaletteMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the background property: Anything.
     *
     * @return the background value.
     */
    public Object getBackground() {
        return this.background;
    }

    /**
     * Set the background property: Anything.
     *
     * @param background the background value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setBackground(Object background) {
        this.background = background;
        return this;
    }

    /**
     * Get the text property: The text property.
     *
     * @return the text value.
     */
    public ThemeConfigPaletteText getText() {
        return this.text;
    }

    /**
     * Set the text property: The text property.
     *
     * @param text the text value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setText(ThemeConfigPaletteText text) {
        this.text = text;
        return this;
    }

    /**
     * Get the divider property: The divider property.
     *
     * @return the divider value.
     */
    public String getDivider() {
        return this.divider;
    }

    /**
     * Set the divider property: The divider property.
     *
     * @param divider the divider value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setDivider(String divider) {
        this.divider = divider;
        return this;
    }

    /**
     * Get the primary property: The primary property.
     *
     * @return the primary value.
     */
    public PaletteColorOptions getPrimary() {
        return this.primary;
    }

    /**
     * Set the primary property: The primary property.
     *
     * @param primary the primary value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setPrimary(PaletteColorOptions primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the secondary property: The secondary property.
     *
     * @return the secondary value.
     */
    public PaletteColorOptions getSecondary() {
        return this.secondary;
    }

    /**
     * Set the secondary property: The secondary property.
     *
     * @param secondary the secondary value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setSecondary(PaletteColorOptions secondary) {
        this.secondary = secondary;
        return this;
    }

    /**
     * Get the success property: The success property.
     *
     * @return the success value.
     */
    public PaletteColorOptions getSuccess() {
        return this.success;
    }

    /**
     * Set the success property: The success property.
     *
     * @param success the success value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setSuccess(PaletteColorOptions success) {
        this.success = success;
        return this;
    }

    /**
     * Get the annotation property: The annotation property.
     *
     * @return the annotation value.
     */
    public PaletteColorOptions getAnnotation() {
        return this.annotation;
    }

    /**
     * Set the annotation property: The annotation property.
     *
     * @param annotation the annotation value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setAnnotation(PaletteColorOptions annotation) {
        this.annotation = annotation;
        return this;
    }

    /**
     * Get the error property: The error property.
     *
     * @return the error value.
     */
    public PaletteColorOptions getError() {
        return this.error;
    }

    /**
     * Set the error property: The error property.
     *
     * @param error the error value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setError(PaletteColorOptions error) {
        this.error = error;
        return this;
    }

    /**
     * Get the info property: The info property.
     *
     * @return the info value.
     */
    public PaletteColorOptions getInfo() {
        return this.info;
    }

    /**
     * Set the info property: The info property.
     *
     * @param info the info value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setInfo(PaletteColorOptions info) {
        this.info = info;
        return this;
    }

    /**
     * Get the warning property: The warning property.
     *
     * @return the warning value.
     */
    public PaletteColorOptions getWarning() {
        return this.warning;
    }

    /**
     * Set the warning property: The warning property.
     *
     * @param warning the warning value to set.
     * @return the ThemeConfigPalette object itself.
     */
    public ThemeConfigPalette setWarning(PaletteColorOptions warning) {
        this.warning = warning;
        return this;
    }
}
