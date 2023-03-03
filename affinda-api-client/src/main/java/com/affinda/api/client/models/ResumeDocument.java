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

/** The ResumeDocument model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "extractor")
@JsonTypeName("resume")
@Fluent
public final class ResumeDocument extends Document {
    /*
     * A JSON-encoded string of the `ResumeData` object.
     */
    @JsonProperty(value = "data", required = true)
    private ResumeData data;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

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
     * @return the ResumeDocument object itself.
     */
    public ResumeDocument setData(ResumeData data) {
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
     * @return the ResumeDocument object itself.
     */
    public ResumeDocument setAdditionalProperties(Map<String, Object> additionalProperties) {
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
