package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Document model. */
@Fluent
public final class Document {
    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private DocumentMeta meta;

    /*
     * Dictionary of <any>
     */
    @JsonProperty(value = "data")
    private Map<String, Object> data;

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
     * @return the Document object itself.
     */
    public Document setMeta(DocumentMeta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get the data property: Dictionary of &lt;any&gt;.
     *
     * @return the data value.
     */
    public Map<String, Object> getData() {
        return this.data;
    }

    /**
     * Set the data property: Dictionary of &lt;any&gt;.
     *
     * @param data the data value to set.
     * @return the Document object itself.
     */
    public Document setData(Map<String, Object> data) {
        this.data = data;
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
     * @return the Document object itself.
     */
    public Document setError(Error error) {
        this.error = error;
        return this;
    }
}
