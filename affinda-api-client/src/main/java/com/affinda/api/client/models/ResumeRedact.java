package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The ResumeRedact model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "extractor")
@JsonTypeName("resume-redact")
@Fluent
public final class ResumeRedact extends Document {
    /*
     * The data property.
     */
    @JsonProperty(value = "data")
    private ResumeRedactData data;

    /**
     * Get the data property: The data property.
     *
     * @return the data value.
     */
    public ResumeRedactData getData() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     *
     * @param data the data value to set.
     * @return the ResumeRedact object itself.
     */
    public ResumeRedact setData(ResumeRedactData data) {
        this.data = data;
        return this;
    }
}
