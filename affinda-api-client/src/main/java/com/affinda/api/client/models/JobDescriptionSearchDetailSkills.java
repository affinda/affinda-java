package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionSearchDetailSkills model. */
@Fluent
public final class JobDescriptionSearchDetailSkills {
    /*
     * The missing property.
     */
    @JsonProperty(value = "missing")
    private List<ResumeSearchParametersSkill> missing;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<JobDescriptionSearchDetailSkillsValueItem> value;

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
     * @return the JobDescriptionSearchDetailSkills object itself.
     */
    public JobDescriptionSearchDetailSkills setMissing(List<ResumeSearchParametersSkill> missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<JobDescriptionSearchDetailSkillsValueItem> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the JobDescriptionSearchDetailSkills object itself.
     */
    public JobDescriptionSearchDetailSkills setValue(List<JobDescriptionSearchDetailSkillsValueItem> value) {
        this.value = value;
        return this;
    }
}
