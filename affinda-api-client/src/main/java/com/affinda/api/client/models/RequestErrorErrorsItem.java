package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RequestErrorErrorsItem model. */
@Fluent
public final class RequestErrorErrorsItem {
    /*
     * The attr property.
     */
    @JsonProperty(value = "attr", required = true)
    private String attr;

    /*
     * The code property.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * The detail property.
     */
    @JsonProperty(value = "detail", required = true)
    private String detail;

    /**
     * Get the attr property: The attr property.
     *
     * @return the attr value.
     */
    public String getAttr() {
        return this.attr;
    }

    /**
     * Set the attr property: The attr property.
     *
     * @param attr the attr value to set.
     * @return the RequestErrorErrorsItem object itself.
     */
    public RequestErrorErrorsItem setAttr(String attr) {
        this.attr = attr;
        return this;
    }

    /**
     * Get the code property: The code property.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     *
     * @param code the code value to set.
     * @return the RequestErrorErrorsItem object itself.
     */
    public RequestErrorErrorsItem setCode(String code) {
        this.code = code;
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
     * @return the RequestErrorErrorsItem object itself.
     */
    public RequestErrorErrorsItem setDetail(String detail) {
        this.detail = detail;
        return this;
    }
}
