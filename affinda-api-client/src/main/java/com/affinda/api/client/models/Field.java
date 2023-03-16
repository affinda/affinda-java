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
     * The slug property.
     */
    @JsonProperty(value = "slug")
    private String slug;

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
     * The fields property.
     */
    @JsonProperty(value = "fields")
    private List<Field> fields;

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
     * @return the Field object itself.
     */
    public Field setDisabled(Boolean disabled) {
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
     * @return the Field object itself.
     */
    public Field setAutoValidationThreshold(Float autoValidationThreshold) {
        this.autoValidationThreshold = autoValidationThreshold;
        return this;
    }

    /**
     * Get the fields property: The fields property.
     *
     * @return the fields value.
     */
    public List<Field> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: The fields property.
     *
     * @param fields the fields value to set.
     * @return the Field object itself.
     */
    public Field setFields(List<Field> fields) {
        this.fields = fields;
        return this;
    }
}
