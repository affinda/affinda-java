package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResumeSearchDetailOccupationGroup model. */
@Fluent
public final class ResumeSearchDetailOccupationGroup {
    /*
     * The missing property.
     */
    @JsonProperty(value = "missing")
    private List<Integer> missing;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<OccupationGroupSearchResult> value;

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
     * @return the ResumeSearchDetailOccupationGroup object itself.
     */
    public ResumeSearchDetailOccupationGroup setMissing(List<Integer> missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<OccupationGroupSearchResult> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the ResumeSearchDetailOccupationGroup object itself.
     */
    public ResumeSearchDetailOccupationGroup setValue(List<OccupationGroupSearchResult> value) {
        this.value = value;
        return this;
    }
}
