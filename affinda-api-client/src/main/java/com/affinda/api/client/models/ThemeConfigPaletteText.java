package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ThemeConfigPaletteText model. */
@Fluent
public final class ThemeConfigPaletteText {
    /*
     * The primary property.
     */
    @JsonProperty(value = "primary")
    private String primary;

    /*
     * The secondary property.
     */
    @JsonProperty(value = "secondary")
    private String secondary;

    /*
     * The disabled property.
     */
    @JsonProperty(value = "disabled")
    private String disabled;

    /**
     * Get the primary property: The primary property.
     *
     * @return the primary value.
     */
    public String getPrimary() {
        return this.primary;
    }

    /**
     * Set the primary property: The primary property.
     *
     * @param primary the primary value to set.
     * @return the ThemeConfigPaletteText object itself.
     */
    public ThemeConfigPaletteText setPrimary(String primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the secondary property: The secondary property.
     *
     * @return the secondary value.
     */
    public String getSecondary() {
        return this.secondary;
    }

    /**
     * Set the secondary property: The secondary property.
     *
     * @param secondary the secondary value to set.
     * @return the ThemeConfigPaletteText object itself.
     */
    public ThemeConfigPaletteText setSecondary(String secondary) {
        this.secondary = secondary;
        return this;
    }

    /**
     * Get the disabled property: The disabled property.
     *
     * @return the disabled value.
     */
    public String getDisabled() {
        return this.disabled;
    }

    /**
     * Set the disabled property: The disabled property.
     *
     * @param disabled the disabled value to set.
     * @return the ThemeConfigPaletteText object itself.
     */
    public ThemeConfigPaletteText setDisabled(String disabled) {
        this.disabled = disabled;
        return this;
    }
}
