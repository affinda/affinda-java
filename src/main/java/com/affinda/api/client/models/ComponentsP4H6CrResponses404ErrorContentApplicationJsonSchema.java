package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsP4H6CrResponses404ErrorContentApplicationJsonSchema model. */
@Fluent
public final class ComponentsP4H6CrResponses404ErrorContentApplicationJsonSchema {
    /*
     * The detail property.
     */
    @JsonProperty(value = "detail")
    private String detail;

    /*
     * The statusCode property.
     */
    @JsonProperty(value = "statusCode")
    private Integer statusCode;

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
     * @return the ComponentsP4H6CrResponses404ErrorContentApplicationJsonSchema object itself.
     */
    public ComponentsP4H6CrResponses404ErrorContentApplicationJsonSchema setDetail(String detail) {
        this.detail = detail;
        return this;
    }

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
     * @return the ComponentsP4H6CrResponses404ErrorContentApplicationJsonSchema object itself.
     */
    public ComponentsP4H6CrResponses404ErrorContentApplicationJsonSchema setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
