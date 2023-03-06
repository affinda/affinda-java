package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GetAllDocumentsResultsItem model. */
@Fluent
public final class GetAllDocumentsResultsItem {
    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private DocumentMeta meta;

    /*
     * The error property.
     */
    @JsonProperty(value = "error")
    private Error error;

    /**
     * Get the meta property: The meta property.
     *
     * @return the meta value.
     */
    public DocumentMeta getMeta() {
        return this.meta;
    }

    /**
     * Set the meta property: The meta property.
     *
     * @param meta the meta value to set.
     * @return the GetAllDocumentsResultsItem object itself.
     */
    public GetAllDocumentsResultsItem setMeta(DocumentMeta meta) {
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
     * @return the GetAllDocumentsResultsItem object itself.
     */
    public GetAllDocumentsResultsItem setError(Error error) {
        this.error = error;
        return this;
    }
}
