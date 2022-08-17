package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Accreditation model. */
@Fluent
public final class Accreditation {
    /*
     * The education property.
     */
    @JsonProperty(value = "education")
    private String education;

    /*
     * The educationLevel property.
     */
    @JsonProperty(value = "educationLevel")
    private String educationLevel;

    /*
     * The inputStr property.
     */
    @JsonProperty(value = "inputStr")
    private String inputStr;

    /*
     * The matchStr property.
     */
    @JsonProperty(value = "matchStr")
    private String matchStr;

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
     * @return the Accreditation object itself.
     */
    public Accreditation setEducation(String education) {
        this.education = education;
        return this;
    }

    /**
     * Get the educationLevel property: The educationLevel property.
     *
     * @return the educationLevel value.
     */
    public String getEducationLevel() {
        return this.educationLevel;
    }

    /**
     * Set the educationLevel property: The educationLevel property.
     *
     * @param educationLevel the educationLevel value to set.
     * @return the Accreditation object itself.
     */
    public Accreditation setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
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
     * Set the inputStr property: The inputStr property.
     *
     * @param inputStr the inputStr value to set.
     * @return the Accreditation object itself.
     */
    public Accreditation setInputStr(String inputStr) {
        this.inputStr = inputStr;
        return this;
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
     * Set the matchStr property: The matchStr property.
     *
     * @param matchStr the matchStr value to set.
     * @return the Accreditation object itself.
     */
    public Accreditation setMatchStr(String matchStr) {
        this.matchStr = matchStr;
        return this;
    }
}
