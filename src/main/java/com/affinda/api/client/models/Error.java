package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Error model. */
@Fluent
public final class Error {
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
     * @return the Error object itself.
     */
    public Error setErrorCode(String errorCode) {
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
     * @return the Error object itself.
     */
    public Error setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
}
