package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The Resume model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "extractor")
@JsonTypeName("resume")
@Fluent
public final class Resume extends Document {
    /*
     * A JSON-encoded string of the `ResumeData` object.
     */
    @JsonProperty(value = "data")
    private ResumeData data;

    /**
     * Get the data property: A JSON-encoded string of the `ResumeData` object.
     *
     * @return the data value.
     */
    public ResumeData getData() {
        return this.data;
    }

    /**
     * Set the data property: A JSON-encoded string of the `ResumeData` object.
     *
     * @param data the data value to set.
     * @return the Resume object itself.
     */
    public Resume setData(ResumeData data) {
        this.data = data;
        return this;
    }
}
