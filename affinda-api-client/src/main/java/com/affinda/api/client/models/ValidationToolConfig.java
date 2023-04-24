package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration of the embeddable validation tool. */
@Fluent
public final class ValidationToolConfig {
    /*
     * The theme property.
     */
    @JsonProperty(value = "theme")
    private ThemeConfig theme;

    /*
     * Hide the confirm document button and other actions.
     */
    @JsonProperty(value = "hideActions")
    private Boolean hideActions;

    /**
     * Get the theme property: The theme property.
     *
     * @return the theme value.
     */
    public ThemeConfig getTheme() {
        return this.theme;
    }

    /**
     * Set the theme property: The theme property.
     *
     * @param theme the theme value to set.
     * @return the ValidationToolConfig object itself.
     */
    public ValidationToolConfig setTheme(ThemeConfig theme) {
        this.theme = theme;
        return this;
    }

    /**
     * Get the hideActions property: Hide the confirm document button and other actions.
     *
     * @return the hideActions value.
     */
    public Boolean isHideActions() {
        return this.hideActions;
    }

    /**
     * Set the hideActions property: Hide the confirm document button and other actions.
     *
     * @param hideActions the hideActions value to set.
     * @return the ValidationToolConfig object itself.
     */
    public ValidationToolConfig setHideActions(Boolean hideActions) {
        this.hideActions = hideActions;
        return this;
    }
}
