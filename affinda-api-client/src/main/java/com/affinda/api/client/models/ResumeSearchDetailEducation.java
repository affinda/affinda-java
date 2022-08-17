package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResumeSearchDetailEducation model. */
@Fluent
public final class ResumeSearchDetailEducation {
    /*
     * The missing property.
     */
    @JsonProperty(value = "missing")
    private ResumeSearchDetailEducationMissing missing;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<ResumeSearchDetailEducationValueItem> value;

    /**
     * Get the missing property: The missing property.
     *
     * @return the missing value.
     */
    public ResumeSearchDetailEducationMissing getMissing() {
        return this.missing;
    }

    /**
     * Set the missing property: The missing property.
     *
     * @param missing the missing value to set.
     * @return the ResumeSearchDetailEducation object itself.
     */
    public ResumeSearchDetailEducation setMissing(ResumeSearchDetailEducationMissing missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<ResumeSearchDetailEducationValueItem> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the ResumeSearchDetailEducation object itself.
     */
    public ResumeSearchDetailEducation setValue(List<ResumeSearchDetailEducationValueItem> value) {
        this.value = value;
        return this;
    }
}
