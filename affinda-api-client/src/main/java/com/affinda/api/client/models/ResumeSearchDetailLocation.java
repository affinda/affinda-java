package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResumeSearchDetailLocation model. */
@Fluent
public final class ResumeSearchDetailLocation {
    /*
     * The missing property.
     */
    @JsonProperty(value = "missing")
    private List<ResumeSearchParametersLocation> missing;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private ResumeSearchDetailLocationValue value;

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
     * @return the ResumeSearchDetailLocation object itself.
     */
    public ResumeSearchDetailLocation setMissing(List<ResumeSearchParametersLocation> missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public ResumeSearchDetailLocationValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the ResumeSearchDetailLocation object itself.
     */
    public ResumeSearchDetailLocation setValue(ResumeSearchDetailLocationValue value) {
        this.value = value;
        return this;
    }
}
