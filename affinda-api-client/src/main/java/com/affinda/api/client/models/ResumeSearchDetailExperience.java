package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchDetailExperience model. */
@Fluent
public final class ResumeSearchDetailExperience {
    /*
     * The years property.
     */
    @JsonProperty(value = "years")
    private Integer years;

    /*
     * The match property.
     */
    @JsonProperty(value = "match")
    private Boolean match;

    /**
     * Get the years property: The years property.
     *
     * @return the years value.
     */
    public Integer getYears() {
        return this.years;
    }

    /**
     * Set the years property: The years property.
     *
     * @param years the years value to set.
     * @return the ResumeSearchDetailExperience object itself.
     */
    public ResumeSearchDetailExperience setYears(Integer years) {
        this.years = years;
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
     * @return the ResumeSearchDetailExperience object itself.
     */
    public ResumeSearchDetailExperience setMatch(Boolean match) {
        this.match = match;
        return this;
    }
}
