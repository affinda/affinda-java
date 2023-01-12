package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataPointChoicesItem model. */
@Fluent
public final class DataPointChoicesItem {
    /*
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

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
     * @return the DataPointChoicesItem object itself.
     */
    public DataPointChoicesItem setLabel(String label) {
        this.label = label;
        return this;
    }
}
