package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeDataEducationItemAccreditation model. */
@Fluent
public final class ResumeDataEducationItemAccreditation {
    /*
     * The education property.
     */
    @JsonProperty(value = "education")
    private String education;

    /*
     * The inputStr property.
     */
    @JsonProperty(value = "inputStr", access = JsonProperty.Access.WRITE_ONLY)
    private String inputStr;

    /*
     * The matchStr property.
     */
    @JsonProperty(value = "matchStr", access = JsonProperty.Access.WRITE_ONLY)
    private String matchStr;

    /*
     * The educationLevel property.
     */
    @JsonProperty(value = "educationLevel", access = JsonProperty.Access.WRITE_ONLY)
    private String educationLevel;

    /**
     * Get the education property: The education property.
     *
     * @return the education value.
     */
    public String getEducation() {
        return this.education;
    }

    /**
     * Set the education property: The education property.
     *
     * @param education the education value to set.
     * @return the ResumeDataEducationItemAccreditation object itself.
     */
    public ResumeDataEducationItemAccreditation setEducation(String education) {
        this.education = education;
        return this;
    }

    /**
     * Get the inputStr property: The inputStr property.
     *
     * @return the inputStr value.
     */
    public String getInputStr() {
        return this.inputStr;
    }

    /**
     * Get the matchStr property: The matchStr property.
     *
     * @return the matchStr value.
     */
    public String getMatchStr() {
        return this.matchStr;
    }

    /**
     * Get the educationLevel property: The educationLevel property.
     *
     * @return the educationLevel value.
     */
    public String getEducationLevel() {
        return this.educationLevel;
    }
}
