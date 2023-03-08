package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentError model. */
@Fluent
public final class DocumentError {
    /*
     * The errorCode property.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /*
     * The errorDetail property.
     */
    @JsonProperty(value = "errorDetail")
    private String errorDetail;

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the DocumentError object itself.
     */
    public DocumentError setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorDetail property: The errorDetail property.
     *
     * @return the errorDetail value.
     */
    public String getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * Set the errorDetail property: The errorDetail property.
     *
     * @param errorDetail the errorDetail value to set.
     * @return the DocumentError object itself.
     */
    public DocumentError setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
}
