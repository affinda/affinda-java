package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InvoiceMeta model. */
@Fluent
public final class InvoiceMeta extends Meta {
    /*
     * Signed URL (valid for 60 minutes) to access the invoice review tool
     */
    @JsonProperty(value = "reviewUrl")
    private String reviewUrl;

    /**
     * Get the reviewUrl property: Signed URL (valid for 60 minutes) to access the invoice review tool.
     *
     * @return the reviewUrl value.
     */
    public String getReviewUrl() {
        return this.reviewUrl;
    }

    /**
     * Set the reviewUrl property: Signed URL (valid for 60 minutes) to access the invoice review tool.
     *
     * @param reviewUrl the reviewUrl value to set.
     * @return the InvoiceMeta object itself.
     */
    public InvoiceMeta setReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
        return this;
    }
}
