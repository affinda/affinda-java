package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths23Ubd8V2ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths23Ubd8V2ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema {
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
     * @return the Paths23Ubd8V2ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths23Ubd8V2ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema setConfigOverride(
            ResumeSearchConfig configOverride) {
        this.configOverride = configOverride;
        return this;
    }
}
