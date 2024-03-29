package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchParametersSkill model. */
@Fluent
public final class ResumeSearchParametersSkill {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The required property.
     */
    @JsonProperty(value = "required")
    private Boolean required;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the ResumeSearchParametersSkill object itself.
     */
    public ResumeSearchParametersSkill setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the required property: The required property.
     *
     * @return the required value.
     */
    public Boolean isRequired() {
        return this.required;
    }

    /**
     * Set the required property: The required property.
     *
     * @param required the required value to set.
     * @return the ResumeSearchParametersSkill object itself.
     */
    public ResumeSearchParametersSkill setRequired(Boolean required) {
        this.required = required;
        return this;
    }
}
