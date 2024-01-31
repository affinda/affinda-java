package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MappingUpdate model. */
@Fluent
public final class MappingUpdate {
    /*
     * Higher values will result in more strict matching.
     */
    @JsonProperty(value = "scoreCutoff")
    private Float scoreCutoff;

    /**
     * Get the scoreCutoff property: Higher values will result in more strict matching.
     *
     * @return the scoreCutoff value.
     */
    public Float getScoreCutoff() {
        return this.scoreCutoff;
    }

    /**
     * Set the scoreCutoff property: Higher values will result in more strict matching.
     *
     * @param scoreCutoff the scoreCutoff value to set.
     * @return the MappingUpdate object itself.
     */
    public MappingUpdate setScoreCutoff(Float scoreCutoff) {
        this.scoreCutoff = scoreCutoff;
        return this;
    }
}
