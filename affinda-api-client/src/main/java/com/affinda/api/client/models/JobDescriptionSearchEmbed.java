package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDescriptionSearchEmbed model. */
@Fluent
public final class JobDescriptionSearchEmbed {
    /*
     * The signed URL for the embedable search tool.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get the url property: The signed URL for the embedable search tool.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The signed URL for the embedable search tool.
     *
     * @param url the url value to set.
     * @return the JobDescriptionSearchEmbed object itself.
     */
    public JobDescriptionSearchEmbed setUrl(String url) {
        this.url = url;
        return this;
    }
}
