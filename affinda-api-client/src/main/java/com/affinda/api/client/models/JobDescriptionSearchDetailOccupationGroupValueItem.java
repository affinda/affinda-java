package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDescriptionSearchDetailOccupationGroupValueItem model. */
@Fluent
public final class JobDescriptionSearchDetailOccupationGroupValueItem extends OccupationGroup {
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
     * @return the JobDescriptionSearchDetailOccupationGroupValueItem object itself.
     */
    public JobDescriptionSearchDetailOccupationGroupValueItem setMatch(Boolean match) {
        this.match = match;
        return this;
    }
}
