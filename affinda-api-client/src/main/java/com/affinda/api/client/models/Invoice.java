package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Invoice model. */
@Fluent
public final class Invoice {
    /*
     * The data property.
     */
    @JsonProperty(value = "data", required = true)
    private InvoiceData data;

    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private InvoiceMeta meta;

    /*
     * The error property.
     */
    @JsonProperty(value = "error", required = true)
    private Error error;

    /**
     * Get the data property: The data property.
     *
     * @return the data value.
     */
    public InvoiceData getData() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     *
     * @param data the data value to set.
     * @return the Invoice object itself.
     */
    public Invoice setData(InvoiceData data) {
        this.data = data;
        return this;
    }

    /**
     * Get the meta property: The meta property.
     *
     * @return the meta value.
     */
    public InvoiceMeta getMeta() {
        return this.meta;
    }

    /**
     * Set the meta property: The meta property.
     *
     * @param meta the meta value to set.
     * @return the Invoice object itself.
     */
    public Invoice setMeta(InvoiceMeta meta) {
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
     * @return the Invoice object itself.
     */
    public Invoice setError(Error error) {
        this.error = error;
        return this;
    }
}
