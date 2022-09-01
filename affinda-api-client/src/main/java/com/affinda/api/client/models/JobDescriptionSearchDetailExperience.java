package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDescriptionSearchDetailExperience model. */
@Fluent
public final class JobDescriptionSearchDetailExperience {
    /*
     * The minimumExperience property.
     */
    @JsonProperty(value = "minimumExperience")
    private Integer minimumExperience;

    /*
     * The maximumExperience property.
     */
    @JsonProperty(value = "maximumExperience")
    private Integer maximumExperience;

    /*
     * The match property.
     */
    @JsonProperty(value = "match")
    private Boolean match;

    /**
     * Get the minimumExperience property: The minimumExperience property.
     *
     * @return the minimumExperience value.
     */
    public Integer getMinimumExperience() {
        return this.minimumExperience;
    }

    /**
     * Set the minimumExperience property: The minimumExperience property.
     *
     * @param minimumExperience the minimumExperience value to set.
     * @return the JobDescriptionSearchDetailExperience object itself.
     */
    public JobDescriptionSearchDetailExperience setMinimumExperience(Integer minimumExperience) {
        this.minimumExperience = minimumExperience;
        return this;
    }

    /**
     * Get the maximumExperience property: The maximumExperience property.
     *
     * @return the maximumExperience value.
     */
    public Integer getMaximumExperience() {
        return this.maximumExperience;
    }

    /**
     * Set the maximumExperience property: The maximumExperience property.
     *
     * @param maximumExperience the maximumExperience value to set.
     * @return the JobDescriptionSearchDetailExperience object itself.
     */
    public JobDescriptionSearchDetailExperience setMaximumExperience(Integer maximumExperience) {
        this.maximumExperience = maximumExperience;
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
     * @return the JobDescriptionSearchDetailExperience object itself.
     */
    public JobDescriptionSearchDetailExperience setMatch(Boolean match) {
        this.match = match;
        return this;
    }
}
