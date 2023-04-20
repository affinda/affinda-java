package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CustomFieldConfig model. */
@Fluent
public final class CustomFieldConfig {
    /*
     * Data point identifier.
     */
    @JsonProperty(value = "dataPoint", required = true)
    private String dataPoint;

    /*
     * The weight property.
     */
    @JsonProperty(value = "weight", required = true)
    private float weight;

    /**
     * Get the dataPoint property: Data point identifier.
     *
     * @return the dataPoint value.
     */
    public String getDataPoint() {
        return this.dataPoint;
    }

    /**
     * Set the dataPoint property: Data point identifier.
     *
     * @param dataPoint the dataPoint value to set.
     * @return the CustomFieldConfig object itself.
     */
    public CustomFieldConfig setDataPoint(String dataPoint) {
        this.dataPoint = dataPoint;
        return this;
    }

    /**
     * Get the weight property: The weight property.
     *
     * @return the weight value.
     */
    public float getWeight() {
        return this.weight;
    }

    /**
     * Set the weight property: The weight property.
     *
     * @param weight the weight value to set.
     * @return the CustomFieldConfig object itself.
     */
    public CustomFieldConfig setWeight(float weight) {
        this.weight = weight;
        return this;
    }
}
