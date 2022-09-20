package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsFqn8P8JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class PathsFqn8P8JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema {
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
     * @return the PathsFqn8P8JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsFqn8P8JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema setConfigOverride(
            JobDescriptionSearchConfig configOverride) {
        this.configOverride = configOverride;
        return this;
    }
}
