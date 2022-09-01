package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionSearchDetailJobTitle model. */
@Fluent
public final class JobDescriptionSearchDetailJobTitle {
    /*
     * The missing property.
     */
    @JsonProperty(value = "missing")
    private List<String> missing;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private JobDescriptionSearchDetailJobTitleValue value;

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
     * @return the JobDescriptionSearchDetailJobTitle object itself.
     */
    public JobDescriptionSearchDetailJobTitle setMissing(List<String> missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public JobDescriptionSearchDetailJobTitleValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the JobDescriptionSearchDetailJobTitle object itself.
     */
    public JobDescriptionSearchDetailJobTitle setValue(JobDescriptionSearchDetailJobTitleValue value) {
        this.value = value;
        return this;
    }
}
