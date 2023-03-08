package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths15O3Zn5V2JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class Paths15O3Zn5V2JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema {
    /*
     * The configOverride property.
     */
    @JsonProperty(value = "configOverride")
    private JobDescriptionSearchConfig configOverride;

    /**
     * Get the configOverride property: The configOverride property.
     *
     * @return the configOverride value.
     */
    public JobDescriptionSearchConfig getConfigOverride() {
        return this.configOverride;
    }

    /**
     * Set the configOverride property: The configOverride property.
     *
     * @param configOverride the configOverride value to set.
     * @return the Paths15O3Zn5V2JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths15O3Zn5V2JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema setConfigOverride(
            JobDescriptionSearchConfig configOverride) {
        this.configOverride = configOverride;
        return this;
    }
}
