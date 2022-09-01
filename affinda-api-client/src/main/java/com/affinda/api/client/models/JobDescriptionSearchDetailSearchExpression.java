package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionSearchDetailSearchExpression model. */
@Fluent
public final class JobDescriptionSearchDetailSearchExpression {
    /*
     * The missing property.
     */
    @JsonProperty(value = "missing")
    private List<String> missing;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<String> value;

    /**
     * Get the missing property: The missing property.
     *
     * @return the missing value.
     */
    public List<String> getMissing() {
        return this.missing;
    }

    /**
     * Set the missing property: The missing property.
     *
     * @param missing the missing value to set.
     * @return the JobDescriptionSearchDetailSearchExpression object itself.
     */
    public JobDescriptionSearchDetailSearchExpression setMissing(List<String> missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<String> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the JobDescriptionSearchDetailSearchExpression object itself.
     */
    public JobDescriptionSearchDetailSearchExpression setValue(List<String> value) {
        this.value = value;
        return this;
    }
}
