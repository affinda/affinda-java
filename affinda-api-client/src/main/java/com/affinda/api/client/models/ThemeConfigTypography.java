package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ThemeConfigTypography model. */
@Fluent
public final class ThemeConfigTypography {
    /*
     * The fontFamily property.
     */
    @JsonProperty(value = "fontFamily")
    private String fontFamily;

    /*
     * The fontSize property.
     */
    @JsonProperty(value = "fontSize")
    private String fontSize;

    /*
     * The fontWeightRegular property.
     */
    @JsonProperty(value = "fontWeightRegular")
    private String fontWeightRegular;

    /*
     * The fontWeightMedium property.
     */
    @JsonProperty(value = "fontWeightMedium")
    private String fontWeightMedium;

    /*
     * The fontWeightBold property.
     */
    @JsonProperty(value = "fontWeightBold")
    private String fontWeightBold;

    /**
     * Get the fontFamily property: The fontFamily property.
     *
     * @return the fontFamily value.
     */
    public String getFontFamily() {
        return this.fontFamily;
    }

    /**
     * Set the fontFamily property: The fontFamily property.
     *
     * @param fontFamily the fontFamily value to set.
     * @return the ThemeConfigTypography object itself.
     */
    public ThemeConfigTypography setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    /**
     * Get the fontSize property: The fontSize property.
     *
     * @return the fontSize value.
     */
    public String getFontSize() {
        return this.fontSize;
    }

    /**
     * Set the fontSize property: The fontSize property.
     *
     * @param fontSize the fontSize value to set.
     * @return the ThemeConfigTypography object itself.
     */
    public ThemeConfigTypography setFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * Get the fontWeightRegular property: The fontWeightRegular property.
     *
     * @return the fontWeightRegular value.
     */
    public String getFontWeightRegular() {
        return this.fontWeightRegular;
    }

    /**
     * Set the fontWeightRegular property: The fontWeightRegular property.
     *
     * @param fontWeightRegular the fontWeightRegular value to set.
     * @return the ThemeConfigTypography object itself.
     */
    public ThemeConfigTypography setFontWeightRegular(String fontWeightRegular) {
        this.fontWeightRegular = fontWeightRegular;
        return this;
    }

    /**
     * Get the fontWeightMedium property: The fontWeightMedium property.
     *
     * @return the fontWeightMedium value.
     */
    public String getFontWeightMedium() {
        return this.fontWeightMedium;
    }

    /**
     * Set the fontWeightMedium property: The fontWeightMedium property.
     *
     * @param fontWeightMedium the fontWeightMedium value to set.
     * @return the ThemeConfigTypography object itself.
     */
    public ThemeConfigTypography setFontWeightMedium(String fontWeightMedium) {
        this.fontWeightMedium = fontWeightMedium;
        return this;
    }

    /**
     * Get the fontWeightBold property: The fontWeightBold property.
     *
     * @return the fontWeightBold value.
     */
    public String getFontWeightBold() {
        return this.fontWeightBold;
    }

    /**
     * Set the fontWeightBold property: The fontWeightBold property.
     *
     * @param fontWeightBold the fontWeightBold value to set.
     * @return the ThemeConfigTypography object itself.
     */
    public ThemeConfigTypography setFontWeightBold(String fontWeightBold) {
        this.fontWeightBold = fontWeightBold;
        return this;
    }
}
