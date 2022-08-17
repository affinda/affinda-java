package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResumeSearchDetailLanguages model. */
@Fluent
public final class ResumeSearchDetailLanguages {
    /*
     * The missing property.
     */
    @JsonProperty(value = "missing")
    private List<ResumeSearchParametersSkill> missing;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<ResumeSearchDetailLanguagesValueItem> value;

    /**
     * Get the missing property: The missing property.
     *
     * @return the missing value.
     */
    public List<ResumeSearchParametersSkill> getMissing() {
        return this.missing;
    }

    /**
     * Set the missing property: The missing property.
     *
     * @param missing the missing value to set.
     * @return the ResumeSearchDetailLanguages object itself.
     */
    public ResumeSearchDetailLanguages setMissing(List<ResumeSearchParametersSkill> missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<ResumeSearchDetailLanguagesValueItem> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the ResumeSearchDetailLanguages object itself.
     */
    public ResumeSearchDetailLanguages setValue(List<ResumeSearchDetailLanguagesValueItem> value) {
        this.value = value;
        return this;
    }
}
