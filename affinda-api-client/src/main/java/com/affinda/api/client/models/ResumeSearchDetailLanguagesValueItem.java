package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchDetailLanguagesValueItem model. */
@Fluent
public final class ResumeSearchDetailLanguagesValueItem extends ResumeSkill {
    /*
     * The match property.
     */
    @JsonProperty(value = "match")
    private Boolean match;

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
     * @return the ResumeSearchDetailLanguagesValueItem object itself.
     */
    public ResumeSearchDetailLanguagesValueItem setMatch(Boolean match) {
        this.match = match;
        return this;
    }
}
