package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The JobDescription model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "extractor")
@JsonTypeName("job-description")
@Fluent
public final class JobDescription extends Document {
    /*
     * The data property.
     */
    @JsonProperty(value = "data")
    private JobDescriptionData data;

    /**
     * Get the data property: The data property.
     *
     * @return the data value.
     */
    public JobDescriptionData getData() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     *
     * @param data the data value to set.
     * @return the JobDescription object itself.
     */
    public JobDescription setData(JobDescriptionData data) {
        this.data = data;
        return this;
    }
}
