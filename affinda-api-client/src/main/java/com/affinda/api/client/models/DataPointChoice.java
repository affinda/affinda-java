package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DataPointChoice model. */
@Fluent
public final class DataPointChoice {
    /*
     * Data point choice's ID
     */
    @JsonProperty(value = "id", required = true)
    private int id;

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
     * Get the id property: Data point choice's ID.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: Data point choice's ID.
     *
     * @param id the id value to set.
     * @return the DataPointChoice object itself.
     */
    public DataPointChoice setId(int id) {
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
     * @return the DataPointChoice object itself.
     */
    public DataPointChoice setSynonyms(List<String> synonyms) {
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
     * @return the DataPointChoice object itself.
     */
    public DataPointChoice setDescription(String description) {
        this.description = description;
        return this;
    }
}
