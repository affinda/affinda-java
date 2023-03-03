package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsM3DzbgV3JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class PathsM3DzbgV3JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema {
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
     * @return the PathsM3DzbgV3JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsM3DzbgV3JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema setConfigOverride(
            JobDescriptionSearchConfig configOverride) {
        this.configOverride = configOverride;
        return this;
    }
}
