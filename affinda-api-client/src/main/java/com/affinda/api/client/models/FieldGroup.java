package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FieldGroup model. */
@Fluent
public final class FieldGroup {
    /*
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /*
     * The fields property.
     */
    @JsonProperty(value = "fields", required = true)
    private List<FieldDeprecated> fields;

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
     * @return the FieldGroup object itself.
     */
    public FieldGroup setLabel(String label) {
        this.label = label;
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
     * @return the FieldGroup object itself.
     */
    public FieldGroup setFields(List<FieldDeprecated> fields) {
        this.fields = fields;
        return this;
    }
}
