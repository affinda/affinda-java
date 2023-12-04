package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The field to be created. */
@Fluent
public final class DataFieldField {
    /*
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /*
     * The different data types of annotations
     */
    @JsonProperty(value = "fieldType")
    private AnnotationContentType fieldType;

    /*
     * The mandatory property.
     */
    @JsonProperty(value = "mandatory", required = true)
    private boolean mandatory;

    /*
     * The showDropdown property.
     */
    @JsonProperty(value = "showDropdown", required = true)
    private boolean showDropdown;

    /*
     * If true, both the value and the label for the enums will appear in the
     * dropdown in the validation tool.
     */
    @JsonProperty(value = "displayEnumValue", required = true)
    private boolean displayEnumValue;

    /*
     * The autoValidationThreshold property.
     */
    @JsonProperty(value = "autoValidationThreshold", required = true)
    private Float autoValidationThreshold;

    /*
     * The enabledChildFields property.
     */
    @JsonProperty(value = "enabledChildFields", required = true)
    private List<Field> enabledChildFields;

    /*
     * The disabledChildFields property.
     */
    @JsonProperty(value = "disabledChildFields", required = true)
    private List<Field> disabledChildFields;

    /*
     * Data source mapping identifier
     */
    @JsonProperty(value = "dataSource")
    private String dataSource;

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
     * @return the DataFieldField object itself.
     */
    public DataFieldField setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the fieldType property: The different data types of annotations.
     *
     * @return the fieldType value.
     */
    public AnnotationContentType getFieldType() {
        return this.fieldType;
    }

    /**
     * Set the fieldType property: The different data types of annotations.
     *
     * @param fieldType the fieldType value to set.
     * @return the DataFieldField object itself.
     */
    public DataFieldField setFieldType(AnnotationContentType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * Get the mandatory property: The mandatory property.
     *
     * @return the mandatory value.
     */
    public boolean isMandatory() {
        return this.mandatory;
    }

    /**
     * Set the mandatory property: The mandatory property.
     *
     * @param mandatory the mandatory value to set.
     * @return the DataFieldField object itself.
     */
    public DataFieldField setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
        return this;
    }

    /**
     * Get the showDropdown property: The showDropdown property.
     *
     * @return the showDropdown value.
     */
    public boolean isShowDropdown() {
        return this.showDropdown;
    }

    /**
     * Set the showDropdown property: The showDropdown property.
     *
     * @param showDropdown the showDropdown value to set.
     * @return the DataFieldField object itself.
     */
    public DataFieldField setShowDropdown(boolean showDropdown) {
        this.showDropdown = showDropdown;
        return this;
    }

    /**
     * Get the displayEnumValue property: If true, both the value and the label for the enums will appear in the
     * dropdown in the validation tool.
     *
     * @return the displayEnumValue value.
     */
    public boolean isDisplayEnumValue() {
        return this.displayEnumValue;
    }

    /**
     * Set the displayEnumValue property: If true, both the value and the label for the enums will appear in the
     * dropdown in the validation tool.
     *
     * @param displayEnumValue the displayEnumValue value to set.
     * @return the DataFieldField object itself.
     */
    public DataFieldField setDisplayEnumValue(boolean displayEnumValue) {
        this.displayEnumValue = displayEnumValue;
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
     * @return the DataFieldField object itself.
     */
    public DataFieldField setAutoValidationThreshold(Float autoValidationThreshold) {
        this.autoValidationThreshold = autoValidationThreshold;
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
     * @return the DataFieldField object itself.
     */
    public DataFieldField setEnabledChildFields(List<Field> enabledChildFields) {
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
     * @return the DataFieldField object itself.
     */
    public DataFieldField setDisabledChildFields(List<Field> disabledChildFields) {
        this.disabledChildFields = disabledChildFields;
        return this;
    }

    /**
     * Get the dataSource property: Data source mapping identifier.
     *
     * @return the dataSource value.
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * Set the dataSource property: Data source mapping identifier.
     *
     * @param dataSource the dataSource value to set.
     * @return the DataFieldField object itself.
     */
    public DataFieldField setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
}
