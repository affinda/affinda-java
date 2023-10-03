package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DataPointChoiceReplaceResponseChoicesItem model. */
@Fluent
public final class DataPointChoiceReplaceResponseChoicesItem {
    /*
     * Data point choice's ID
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /*
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /*
     * The synonyms property.
     */
    @JsonProperty(value = "synonyms", required = true)
    private List<String> synonyms;

    /*
     * The description property.
     */
    @JsonProperty(value = "description", required = true)
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
     * @return the DataPointChoiceReplaceResponseChoicesItem object itself.
     */
    public DataPointChoiceReplaceResponseChoicesItem setId(int id) {
        this.id = id;
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
     * @return the DataPointChoiceReplaceResponseChoicesItem object itself.
     */
    public DataPointChoiceReplaceResponseChoicesItem setValue(String value) {
        this.value = value;
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
     * @return the DataPointChoiceReplaceResponseChoicesItem object itself.
     */
    public DataPointChoiceReplaceResponseChoicesItem setLabel(String label) {
        this.label = label;
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
     * @return the DataPointChoiceReplaceResponseChoicesItem object itself.
     */
    public DataPointChoiceReplaceResponseChoicesItem setSynonyms(List<String> synonyms) {
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
     * @return the DataPointChoiceReplaceResponseChoicesItem object itself.
     */
    public DataPointChoiceReplaceResponseChoicesItem setDescription(String description) {
        this.description = description;
        return this;
    }
}
