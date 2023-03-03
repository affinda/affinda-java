package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** The JobDescriptionDocument model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "extractor")
@JsonTypeName("job-description")
@Fluent
public final class JobDescriptionDocument extends Document {
    /*
     * A JSON-encoded string of the `JobDescriptionData` object.
     */
    @JsonProperty(value = "data", required = true)
    private JobDescriptionData data;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the data property: A JSON-encoded string of the `JobDescriptionData` object.
     *
     * @return the data value.
     */
    public JobDescriptionData getData() {
        return this.data;
    }

    /**
     * Set the data property: A JSON-encoded string of the `JobDescriptionData` object.
     *
     * @param data the data value to set.
     * @return the JobDescriptionDocument object itself.
     */
    public JobDescriptionDocument setData(JobDescriptionData data) {
        this.data = data;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the JobDescriptionDocument object itself.
     */
    public JobDescriptionDocument setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
