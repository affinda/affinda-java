package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDescriptionSearchDetailSkillsValueItem model. */
@Fluent
public final class JobDescriptionSearchDetailSkillsValueItem {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The match property.
     */
    @JsonProperty(value = "match")
    private Boolean match;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the JobDescriptionSearchDetailSkillsValueItem object itself.
     */
    public JobDescriptionSearchDetailSkillsValueItem setName(String name) {
        this.name = name;
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
     * @return the JobDescriptionSearchDetailSkillsValueItem object itself.
     */
    public JobDescriptionSearchDetailSkillsValueItem setMatch(Boolean match) {
        this.match = match;
        return this;
    }
}
