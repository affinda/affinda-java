package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionSearchDetailOccupationGroup model. */
@Fluent
public final class JobDescriptionSearchDetailOccupationGroup {
    /*
     * The missing property.
     */
    @JsonProperty(value = "missing")
    private List<Integer> missing;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private JobDescriptionSearchDetailOccupationGroupValue value;

    /**
     * Get the missing property: The missing property.
     *
     * @return the missing value.
     */
    public List<Integer> getMissing() {
        return this.missing;
    }

    /**
     * Set the missing property: The missing property.
     *
     * @param missing the missing value to set.
     * @return the JobDescriptionSearchDetailOccupationGroup object itself.
     */
    public JobDescriptionSearchDetailOccupationGroup setMissing(List<Integer> missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public JobDescriptionSearchDetailOccupationGroupValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the JobDescriptionSearchDetailOccupationGroup object itself.
     */
    public JobDescriptionSearchDetailOccupationGroup setValue(JobDescriptionSearchDetailOccupationGroupValue value) {
        this.value = value;
        return this;
    }
}
