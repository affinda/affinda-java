package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema {
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
     * @return the Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema setConfigOverride(
            ResumeSearchConfig configOverride) {
        this.configOverride = configOverride;
        return this;
    }
}
