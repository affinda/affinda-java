package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RequestError model. */
@Fluent
public final class RequestError {
    /*
     * The type property.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * The errors property.
     */
    @JsonProperty(value = "errors", required = true)
    private List<RequestErrorErrorsItem> errors;

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the RequestError object itself.
     */
    public RequestError setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the errors property: The errors property.
     *
     * @return the errors value.
     */
    public List<RequestErrorErrorsItem> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: The errors property.
     *
     * @param errors the errors value to set.
     * @return the RequestError object itself.
     */
    public RequestError setErrors(List<RequestErrorErrorsItem> errors) {
        this.errors = errors;
        return this;
    }
}
