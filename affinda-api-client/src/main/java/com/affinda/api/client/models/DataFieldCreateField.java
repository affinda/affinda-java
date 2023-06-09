package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The field to be created. */
@Fluent
public final class DataFieldCreateField {
    /*
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /*
     * The mandatory property.
     */
    @JsonProperty(value = "mandatory")
    private Boolean mandatory;

    /*
     * The showDropdown property.
     */
    @JsonProperty(value = "showDropdown")
    private Boolean showDropdown;

    /*
     * The autoValidationThreshold property.
     */
    @JsonProperty(value = "autoValidationThreshold")
    private Float autoValidationThreshold;

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
     * @return the DataFieldCreateField object itself.
     */
    public DataFieldCreateField setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the mandatory property: The mandatory property.
     *
     * @return the mandatory value.
     */
    public Boolean isMandatory() {
        return this.mandatory;
    }

    /**
     * Set the mandatory property: The mandatory property.
     *
     * @param mandatory the mandatory value to set.
     * @return the DataFieldCreateField object itself.
     */
    public DataFieldCreateField setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
        return this;
    }

    /**
     * Get the showDropdown property: The showDropdown property.
     *
     * @return the showDropdown value.
     */
    public Boolean isShowDropdown() {
        return this.showDropdown;
    }

    /**
     * Set the showDropdown property: The showDropdown property.
     *
     * @param showDropdown the showDropdown value to set.
     * @return the DataFieldCreateField object itself.
     */
    public DataFieldCreateField setShowDropdown(Boolean showDropdown) {
        this.showDropdown = showDropdown;
        return this;
    }

    /**
     * Get the autoValidationThreshold property: The autoValidationThreshold property.
     *
     * @return the autoValidationThreshold value.
     */
    public Float getAutoValidationThreshold() {
        return this.autoValidationThreshold;
    }

    /**
     * Set the autoValidationThreshold property: The autoValidationThreshold property.
     *
     * @param autoValidationThreshold the autoValidationThreshold value to set.
     * @return the DataFieldCreateField object itself.
     */
    public DataFieldCreateField setAutoValidationThreshold(Float autoValidationThreshold) {
        this.autoValidationThreshold = autoValidationThreshold;
        return this;
    }
}