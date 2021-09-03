package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components8Sxs33Responses400ErrorContentApplicationJsonSchema model. */
@Fluent
public final class Components8Sxs33Responses400ErrorContentApplicationJsonSchema {
    /*
     * The statusCode property.
     */
    @JsonProperty(value = "statusCode")
    private Integer statusCode;

    /*
     * The detail property.
     */
    @JsonProperty(value = "detail")
    private String detail;

    /**
     * Get the statusCode property: The statusCode property.
     *
     * @return the statusCode value.
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: The statusCode property.
     *
     * @param statusCode the statusCode value to set.
     * @return the Components8Sxs33Responses400ErrorContentApplicationJsonSchema object itself.
     */
    public Components8Sxs33Responses400ErrorContentApplicationJsonSchema setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

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
     * @return the Components8Sxs33Responses400ErrorContentApplicationJsonSchema object itself.
     */
    public Components8Sxs33Responses400ErrorContentApplicationJsonSchema setDetail(String detail) {
        this.detail = detail;
        return this;
    }
}
