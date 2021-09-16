package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RequestError model. */
@Fluent
public final class RequestError {
    /*
     * The detail property.
     */
    @JsonProperty(value = "detail", required = true)
    private String detail;

    /*
     * The statusCode property.
     */
    @JsonProperty(value = "statusCode", required = true)
    private int statusCode;

    /**
     * Get the detail property: The detail property.
     *
     * @return the detail value.
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * Set the detail property: The detail property.
     *
     * @param detail the detail value to set.
     * @return the RequestError object itself.
     */
    public RequestError setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Get the statusCode property: The statusCode property.
     *
     * @return the statusCode value.
     */
    public int getStatusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: The statusCode property.
     *
     * @param statusCode the statusCode value to set.
     * @return the RequestError object itself.
     */
    public RequestError setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
