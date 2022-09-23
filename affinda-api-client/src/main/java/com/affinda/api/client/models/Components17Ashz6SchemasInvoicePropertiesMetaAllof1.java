package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components17Ashz6SchemasInvoicePropertiesMetaAllof1 model. */
@Fluent
public class Components17Ashz6SchemasInvoicePropertiesMetaAllof1 {
    /*
     * The clientVerifiedDt property.
     */
    @JsonProperty(value = "clientVerifiedDt")
    private Boolean clientVerifiedDt;

    /*
     * Signed URL (valid for 60 minutes) to access the invoice review tool
     */
    @JsonProperty(value = "reviewUrl")
    private String reviewUrl;

    /**
     * Get the clientVerifiedDt property: The clientVerifiedDt property.
     *
     * @return the clientVerifiedDt value.
     */
    public Boolean isClientVerifiedDt() {
        return this.clientVerifiedDt;
    }

    /**
     * Set the clientVerifiedDt property: The clientVerifiedDt property.
     *
     * @param clientVerifiedDt the clientVerifiedDt value to set.
     * @return the Components17Ashz6SchemasInvoicePropertiesMetaAllof1 object itself.
     */
    public Components17Ashz6SchemasInvoicePropertiesMetaAllof1 setClientVerifiedDt(Boolean clientVerifiedDt) {
        this.clientVerifiedDt = clientVerifiedDt;
        return this;
    }

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
     * @return the Components17Ashz6SchemasInvoicePropertiesMetaAllof1 object itself.
     */
    public Components17Ashz6SchemasInvoicePropertiesMetaAllof1 setReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
        return this;
    }
}
