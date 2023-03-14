package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DataPointChoiceCreate model. */
@Fluent
public final class DataPointChoiceCreate {
    /*
     * Uniquely identify a data point.
     */
    @JsonProperty(value = "dataPoint", required = true)
    private String dataPoint;

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

    /*
     * The synonyms property.
     */
    @JsonProperty(value = "synonyms")
    private List<String> synonyms;

    /*
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the dataPoint property: Uniquely identify a data point.
     *
     * @return the dataPoint value.
     */
    public String getDataPoint() {
        return this.dataPoint;
    }

    /**
     * Set the dataPoint property: Uniquely identify a data point.
     *
     * @param dataPoint the dataPoint value to set.
     * @return the DataPointChoiceCreate object itself.
     */
    public DataPointChoiceCreate setDataPoint(String dataPoint) {
        this.dataPoint = dataPoint;
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
     * @return the DataPointChoiceCreate object itself.
     */
    public DataPointChoiceCreate setLabel(String label) {
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
     * @return the DataPointChoiceCreate object itself.
     */
    public DataPointChoiceCreate setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the synonyms property: The synonyms property.
     *
     * @return the synonyms value.
     */
    public List<String> getSynonyms() {
        return this.synonyms;
    }

    /**
     * Set the synonyms property: The synonyms property.
     *
     * @param synonyms the synonyms value to set.
     * @return the DataPointChoiceCreate object itself.
     */
    public DataPointChoiceCreate setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    /**
     * Get the description property: The description property.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description property.
     *
     * @param description the description value to set.
     * @return the DataPointChoiceCreate object itself.
     */
    public DataPointChoiceCreate setDescription(String description) {
        this.description = description;
        return this;
    }
}
