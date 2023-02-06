package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataPointChoice model. */
@Fluent
public final class DataPointChoice {
    /*
     * The id property.
     */
    @JsonProperty(value = "id", required = true)
    private float id;

    /*
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /*
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public float getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the DataPointChoice object itself.
     */
    public DataPointChoice setId(float id) {
        this.id = id;
        return this;
    }

    /**
     * Get the label property: The label property.
     *
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: The label property.
     *
     * @param label the label value to set.
     * @return the DataPointChoice object itself.
     */
    public DataPointChoice setLabel(String label) {
        this.label = label;
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
     * @return the DataPointChoice object itself.
     */
    public DataPointChoice setValue(String value) {
        this.value = value;
        return this;
    }
}
