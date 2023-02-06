package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The EducationGrade model. */
@Fluent
public final class EducationGrade {
    /*
     * The raw property.
     */
    @JsonProperty(value = "raw")
    private String raw;

    /*
     * The metric property.
     */
    @JsonProperty(value = "metric")
    private String metric;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the raw property: The raw property.
     *
     * @return the raw value.
     */
    public String getRaw() {
        return this.raw;
    }

    /**
     * Set the raw property: The raw property.
     *
     * @param raw the raw value to set.
     * @return the EducationGrade object itself.
     */
    public EducationGrade setRaw(String raw) {
        this.raw = raw;
        return this;
    }

    /**
     * Get the metric property: The metric property.
     *
     * @return the metric value.
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * Set the metric property: The metric property.
     *
     * @param metric the metric value to set.
     * @return the EducationGrade object itself.
     */
    public EducationGrade setMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the EducationGrade object itself.
     */
    public EducationGrade setValue(String value) {
        this.value = value;
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
     * @return the EducationGrade object itself.
     */
    public EducationGrade setAdditionalProperties(Map<String, Object> additionalProperties) {
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
