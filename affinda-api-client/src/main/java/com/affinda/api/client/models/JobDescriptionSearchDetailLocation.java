package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionSearchDetailLocation model. */
@Fluent
public final class JobDescriptionSearchDetailLocation {
    /*
     * The missing property.
     */
    @JsonProperty(value = "missing")
    private List<ResumeSearchParametersLocation> missing;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private JobDescriptionSearchDetailLocationValue value;

    /**
     * Get the missing property: The missing property.
     *
     * @return the missing value.
     */
    public List<ResumeSearchParametersLocation> getMissing() {
        return this.missing;
    }

    /**
     * Set the missing property: The missing property.
     *
     * @param missing the missing value to set.
     * @return the JobDescriptionSearchDetailLocation object itself.
     */
    public JobDescriptionSearchDetailLocation setMissing(List<ResumeSearchParametersLocation> missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public JobDescriptionSearchDetailLocationValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the JobDescriptionSearchDetailLocation object itself.
     */
    public JobDescriptionSearchDetailLocation setValue(JobDescriptionSearchDetailLocationValue value) {
        this.value = value;
        return this;
    }
}
