package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDescriptionSearchDetailEducation model. */
@Fluent
public final class JobDescriptionSearchDetailEducation {
    /*
     * The missing property.
     */
    @JsonProperty(value = "missing")
    private JobDescriptionSearchDetailEducationMissing missing;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private JobDescriptionSearchDetailEducationValue value;

    /**
     * Get the missing property: The missing property.
     *
     * @return the missing value.
     */
    public JobDescriptionSearchDetailEducationMissing getMissing() {
        return this.missing;
    }

    /**
     * Set the missing property: The missing property.
     *
     * @param missing the missing value to set.
     * @return the JobDescriptionSearchDetailEducation object itself.
     */
    public JobDescriptionSearchDetailEducation setMissing(JobDescriptionSearchDetailEducationMissing missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public JobDescriptionSearchDetailEducationValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the JobDescriptionSearchDetailEducation object itself.
     */
    public JobDescriptionSearchDetailEducation setValue(JobDescriptionSearchDetailEducationValue value) {
        this.value = value;
        return this;
    }
}
