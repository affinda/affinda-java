package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The FieldDeprecated model. */
@Fluent
public final class FieldDeprecated {
    /*
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /*
     * The slug property.
     */
    @JsonProperty(value = "slug")
    private String slug;

    /*
     * The different data types of annotations
     */
    @JsonProperty(value = "fieldType", required = true)
    private AnnotationContentType fieldType;

    /*
     * Data source mapping identifier
     */
    @JsonProperty(value = "dataSource")
    private String dataSource;

    /*
     * Defines how the data point is mapped to the data source
     */
    @JsonProperty(value = "mapping")
    private String mapping;

    /*
     * The dataPoint property.
     */
    @JsonProperty(value = "dataPoint", required = true)
    private String dataPoint;

    /*
     * The mandatory property.
     */
    @JsonProperty(value = "mandatory")
    private Boolean mandatory;

    /*
     * The disabled property.
     */
    @JsonProperty(value = "disabled")
    private Boolean disabled;

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
     * The displayRawText property.
     */
    @JsonProperty(value = "displayRawText")
    private Boolean displayRawText;

    /*
     * If True, any dropdown annotations that fail to parse to a value will be
     * discarded
     */
    @JsonProperty(value = "dropNull")
    private Boolean dropNull;

    /*
     * The displayEnumValue property.
     */
    @JsonProperty(value = "displayEnumValue")
    private Boolean displayEnumValue;

    /*
     * The fields property.
     */
    @JsonProperty(value = "fields")
    private List<FieldDeprecated> fields;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

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
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setLabel(String label) {
        this.label = label;
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
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setSlug(String slug) {
        this.slug = slug;
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
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setFieldType(AnnotationContentType fieldType) {
        this.fieldType = fieldType;
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
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * Get the mapping property: Defines how the data point is mapped to the data source.
     *
     * @return the mapping value.
     */
    public String getMapping() {
        return this.mapping;
    }

    /**
     * Set the mapping property: Defines how the data point is mapped to the data source.
     *
     * @param mapping the mapping value to set.
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setMapping(String mapping) {
        this.mapping = mapping;
        return this;
    }

    /**
     * Get the dataPoint property: The dataPoint property.
     *
     * @return the dataPoint value.
     */
    public String getDataPoint() {
        return this.dataPoint;
    }

    /**
     * Set the dataPoint property: The dataPoint property.
     *
     * @param dataPoint the dataPoint value to set.
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setDataPoint(String dataPoint) {
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
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
        return this;
    }

    /**
     * Get the disabled property: The disabled property.
     *
     * @return the disabled value.
     */
    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * Set the disabled property: The disabled property.
     *
     * @param disabled the disabled value to set.
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setDisabled(Boolean disabled) {
        this.disabled = disabled;
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
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setAutoValidationThreshold(Float autoValidationThreshold) {
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
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setShowDropdown(Boolean showDropdown) {
        this.showDropdown = showDropdown;
        return this;
    }

    /**
     * Get the displayRawText property: The displayRawText property.
     *
     * @return the displayRawText value.
     */
    public Boolean isDisplayRawText() {
        return this.displayRawText;
    }

    /**
     * Set the displayRawText property: The displayRawText property.
     *
     * @param displayRawText the displayRawText value to set.
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setDisplayRawText(Boolean displayRawText) {
        this.displayRawText = displayRawText;
        return this;
    }

    /**
     * Get the dropNull property: If True, any dropdown annotations that fail to parse to a value will be discarded.
     *
     * @return the dropNull value.
     */
    public Boolean isDropNull() {
        return this.dropNull;
    }

    /**
     * Set the dropNull property: If True, any dropdown annotations that fail to parse to a value will be discarded.
     *
     * @param dropNull the dropNull value to set.
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setDropNull(Boolean dropNull) {
        this.dropNull = dropNull;
        return this;
    }

    /**
     * Get the displayEnumValue property: The displayEnumValue property.
     *
     * @return the displayEnumValue value.
     */
    public Boolean isDisplayEnumValue() {
        return this.displayEnumValue;
    }

    /**
     * Set the displayEnumValue property: The displayEnumValue property.
     *
     * @param displayEnumValue the displayEnumValue value to set.
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setDisplayEnumValue(Boolean displayEnumValue) {
        this.displayEnumValue = displayEnumValue;
        return this;
    }

    /**
     * Get the fields property: The fields property.
     *
     * @return the fields value.
     */
    public List<FieldDeprecated> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: The fields property.
     *
     * @param fields the fields value to set.
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setFields(List<FieldDeprecated> fields) {
        this.fields = fields;
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
     * @return the FieldDeprecated object itself.
     */
    public FieldDeprecated setAdditionalProperties(Map<String, Object> additionalProperties) {
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
