package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FieldCategory model. */
@Fluent
public final class FieldCategory {
    /*
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /*
     * The enabledFields property.
     */
    @JsonProperty(value = "enabledFields", required = true)
    private List<Field> enabledFields;

    /*
     * The disabledFields property.
     */
    @JsonProperty(value = "disabledFields", required = true)
    private List<Field> disabledFields;

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
     * @return the FieldCategory object itself.
     */
    public FieldCategory setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the enabledFields property: The enabledFields property.
     *
     * @return the enabledFields value.
     */
    public List<Field> getEnabledFields() {
        return this.enabledFields;
    }

    /**
     * Set the enabledFields property: The enabledFields property.
     *
     * @param enabledFields the enabledFields value to set.
     * @return the FieldCategory object itself.
     */
    public FieldCategory setEnabledFields(List<Field> enabledFields) {
        this.enabledFields = enabledFields;
        return this;
    }

    /**
     * Get the disabledFields property: The disabledFields property.
     *
     * @return the disabledFields value.
     */
    public List<Field> getDisabledFields() {
        return this.disabledFields;
    }

    /**
     * Set the disabledFields property: The disabledFields property.
     *
     * @param disabledFields the disabledFields value to set.
     * @return the FieldCategory object itself.
     */
    public FieldCategory setDisabledFields(List<Field> disabledFields) {
        this.disabledFields = disabledFields;
        return this;
    }
}
