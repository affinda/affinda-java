package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

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
}
