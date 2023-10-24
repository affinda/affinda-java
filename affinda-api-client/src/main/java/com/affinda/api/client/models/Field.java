package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Field model. */
@Fluent
public final class Field {
    /*
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /*
     * Data point identifier
     */
    @JsonProperty(value = "dataPoint", required = true)
    private String dataPoint;

    /*
     * The mandatory property.
     */
    @JsonProperty(value = "mandatory")
    private Boolean mandatory;

    /*
     * The autoValidationThreshold property.
     */
    @JsonProperty(value = "autoValidationThreshold")
    private Float autoValidationThreshold;

    /*
     * The showDropdown property.
     */
    @JsonProperty(value = "showDropdown")
    private Boolean showDropdown;

    /*
     * If true, both the value and the label for the enums will appear in the
     * dropdown in the validation tool.
     */
    @JsonProperty(value = "displayEnumValue")
    private Boolean displayEnumValue;

    /*
     * The enabledChildFields property.
     */
    @JsonProperty(value = "enabledChildFields")
    private List<Field> enabledChildFields;

    /*
     * The disabledChildFields property.
     */
    @JsonProperty(value = "disabledChildFields")
    private List<Field> disabledChildFields;

    /*
     * The slug property.
     */
    @JsonProperty(value = "slug")
    private String slug;

    /*
     * The fields property.
     */
    @JsonProperty(value = "fields")
    private List<Object> fields;

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
     * @return the Field object itself.
     */
    public Field setLabel(String label) {
        this.label = label;
        return this;
    }

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
     * @return the Field object itself.
     */
    public Field setDataPoint(String dataPoint) {
        this.dataPoint = dataPoint;
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
     * @return the Field object itself.
     */
    public Field setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
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
     * @return the Field object itself.
     */
    public Field setAutoValidationThreshold(Float autoValidationThreshold) {
        this.autoValidationThreshold = autoValidationThreshold;
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
     * @return the Field object itself.
     */
    public Field setShowDropdown(Boolean showDropdown) {
        this.showDropdown = showDropdown;
        return this;
    }

    /**
     * Get the displayEnumValue property: If true, both the value and the label for the enums will appear in the
     * dropdown in the validation tool.
     *
     * @return the displayEnumValue value.
     */
    public Boolean isDisplayEnumValue() {
        return this.displayEnumValue;
    }

    /**
     * Set the displayEnumValue property: If true, both the value and the label for the enums will appear in the
     * dropdown in the validation tool.
     *
     * @param displayEnumValue the displayEnumValue value to set.
     * @return the Field object itself.
     */
    public Field setDisplayEnumValue(Boolean displayEnumValue) {
        this.displayEnumValue = displayEnumValue;
        return this;
    }

    /**
     * Get the enabledChildFields property: The enabledChildFields property.
     *
     * @return the enabledChildFields value.
     */
    public List<Field> getEnabledChildFields() {
        return this.enabledChildFields;
    }

    /**
     * Set the enabledChildFields property: The enabledChildFields property.
     *
     * @param enabledChildFields the enabledChildFields value to set.
     * @return the Field object itself.
     */
    public Field setEnabledChildFields(List<Field> enabledChildFields) {
        this.enabledChildFields = enabledChildFields;
        return this;
    }

    /**
     * Get the disabledChildFields property: The disabledChildFields property.
     *
     * @return the disabledChildFields value.
     */
    public List<Field> getDisabledChildFields() {
        return this.disabledChildFields;
    }

    /**
     * Set the disabledChildFields property: The disabledChildFields property.
     *
     * @param disabledChildFields the disabledChildFields value to set.
     * @return the Field object itself.
     */
    public Field setDisabledChildFields(List<Field> disabledChildFields) {
        this.disabledChildFields = disabledChildFields;
        return this;
    }

    /**
     * Get the slug property: The slug property.
     *
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: The slug property.
     *
     * @param slug the slug value to set.
     * @return the Field object itself.
     */
    public Field setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the fields property: The fields property.
     *
     * @return the fields value.
     */
    public List<Object> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: The fields property.
     *
     * @param fields the fields value to set.
     * @return the Field object itself.
     */
    public Field setFields(List<Object> fields) {
        this.fields = fields;
        return this;
    }
}
