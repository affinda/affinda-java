package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths1Czpnk1V3ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths1Czpnk1V3ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema {
    /*
     * The configOverride property.
     */
    @JsonProperty(value = "configOverride")
    private ResumeSearchConfig configOverride;

    /**
     * Get the configOverride property: The configOverride property.
     *
     * @return the configOverride value.
     */
    public ResumeSearchConfig getConfigOverride() {
        return this.configOverride;
    }

    /**
     * Set the configOverride property: The configOverride property.
     *
     * @param configOverride the configOverride value to set.
     * @return the Paths1Czpnk1V3ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths1Czpnk1V3ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema setConfigOverride(
            ResumeSearchConfig configOverride) {
        this.configOverride = configOverride;
        return this;
    }
}
