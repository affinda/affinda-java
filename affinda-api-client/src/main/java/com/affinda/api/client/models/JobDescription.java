package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDescription model. */
@Fluent
public final class JobDescription {
    /*
     * A JSON-encoded string of the `JobDescriptionData` object.
     */
    @JsonProperty(value = "data", required = true)
    private JobDescriptionData data;

    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private Meta meta;

    /*
     * The error property.
     */
    @JsonProperty(value = "error", required = true)
    private Error error;

    /**
     * Get the data property: A JSON-encoded string of the `JobDescriptionData` object.
     *
     * @return the data value.
     */
    public JobDescriptionData getData() {
        return this.data;
    }

    /**
     * Set the data property: A JSON-encoded string of the `JobDescriptionData` object.
     *
     * @param data the data value to set.
     * @return the JobDescription object itself.
     */
    public JobDescription setData(JobDescriptionData data) {
        this.data = data;
        return this;
    }

    /**
     * Get the meta property: The meta property.
     *
     * @return the meta value.
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * Set the meta property: The meta property.
     *
     * @param meta the meta value to set.
     * @return the JobDescription object itself.
     */
    public JobDescription setMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get the error property: The error property.
     *
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }

    /**
     * Set the error property: The error property.
     *
     * @param error the error value to set.
     * @return the JobDescription object itself.
     */
    public JobDescription setError(Error error) {
        this.error = error;
        return this;
    }
}
