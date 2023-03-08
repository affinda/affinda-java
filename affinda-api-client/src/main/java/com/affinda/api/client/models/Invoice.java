package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The Invoice model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "extractor")
@JsonTypeName("invoice")
@Fluent
public final class Invoice extends Document {
    /*
     * The data property.
     */
    @JsonProperty(value = "data")
    private InvoiceData data;

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
}
