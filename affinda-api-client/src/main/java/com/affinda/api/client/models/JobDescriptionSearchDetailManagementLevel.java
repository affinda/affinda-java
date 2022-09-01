package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDescriptionSearchDetailManagementLevel model. */
@Fluent
public final class JobDescriptionSearchDetailManagementLevel {
    /*
     * The level property.
     */
    @JsonProperty(value = "level")
    private ManagementLevel level;

    /*
     * The match property.
     */
    @JsonProperty(value = "match")
    private Boolean match;

    /**
     * Get the level property: The level property.
     *
     * @return the level value.
     */
    public ManagementLevel getLevel() {
        return this.level;
    }

    /**
     * Set the level property: The level property.
     *
     * @param level the level value to set.
     * @return the JobDescriptionSearchDetailManagementLevel object itself.
     */
    public JobDescriptionSearchDetailManagementLevel setLevel(ManagementLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get the match property: The match property.
     *
     * @return the match value.
     */
    public Boolean isMatch() {
        return this.match;
    }

    /**
     * Set the match property: The match property.
     *
     * @param match the match value to set.
     * @return the JobDescriptionSearchDetailManagementLevel object itself.
     */
    public JobDescriptionSearchDetailManagementLevel setMatch(Boolean match) {
        this.match = match;
        return this;
    }
}
