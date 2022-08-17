package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchDetail model. */
@Fluent
public final class ResumeSearchDetail {
    /*
     * The jobTitle property.
     */
    @JsonProperty(value = "jobTitle")
    private ResumeSearchDetailJobTitle jobTitle;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private ResumeSearchDetailLocation location;

    /*
     * The education property.
     */
    @JsonProperty(value = "education")
    private ResumeSearchDetailEducation education;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills")
    private ResumeSearchDetailSkills skills;

    /*
     * The experience property.
     */
    @JsonProperty(value = "experience")
    private ResumeSearchDetailExperience experience;

    /*
     * The occupationGroup property.
     */
    @JsonProperty(value = "occupationGroup")
    private ResumeSearchDetailOccupationGroup occupationGroup;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages")
    private ResumeSearchDetailLanguages languages;

    /*
     * The managementLevel property.
     */
    @JsonProperty(value = "managementLevel")
    private ResumeSearchDetailManagementLevel managementLevel;

    /*
     * The searchExpression property.
     */
    @JsonProperty(value = "searchExpression")
    private ResumeSearchDetailSearchExpression searchExpression;

    /**
     * Get the jobTitle property: The jobTitle property.
     *
     * @return the jobTitle value.
     */
    public ResumeSearchDetailJobTitle getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: The jobTitle property.
     *
     * @param jobTitle the jobTitle value to set.
     * @return the ResumeSearchDetail object itself.
     */
    public ResumeSearchDetail setJobTitle(ResumeSearchDetailJobTitle jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public ResumeSearchDetailLocation getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the ResumeSearchDetail object itself.
     */
    public ResumeSearchDetail setLocation(ResumeSearchDetailLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the education property: The education property.
     *
     * @return the education value.
     */
    public ResumeSearchDetailEducation getEducation() {
        return this.education;
    }

    /**
     * Set the education property: The education property.
     *
     * @param education the education value to set.
     * @return the ResumeSearchDetail object itself.
     */
    public ResumeSearchDetail setEducation(ResumeSearchDetailEducation education) {
        this.education = education;
        return this;
    }

    /**
     * Get the skills property: The skills property.
     *
     * @return the skills value.
     */
    public ResumeSearchDetailSkills getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: The skills property.
     *
     * @param skills the skills value to set.
     * @return the ResumeSearchDetail object itself.
     */
    public ResumeSearchDetail setSkills(ResumeSearchDetailSkills skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the experience property: The experience property.
     *
     * @return the experience value.
     */
    public ResumeSearchDetailExperience getExperience() {
        return this.experience;
    }

    /**
     * Set the experience property: The experience property.
     *
     * @param experience the experience value to set.
     * @return the ResumeSearchDetail object itself.
     */
    public ResumeSearchDetail setExperience(ResumeSearchDetailExperience experience) {
        this.experience = experience;
        return this;
    }

    /**
     * Get the occupationGroup property: The occupationGroup property.
     *
     * @return the occupationGroup value.
     */
    public ResumeSearchDetailOccupationGroup getOccupationGroup() {
        return this.occupationGroup;
    }

    /**
     * Set the occupationGroup property: The occupationGroup property.
     *
     * @param occupationGroup the occupationGroup value to set.
     * @return the ResumeSearchDetail object itself.
     */
    public ResumeSearchDetail setOccupationGroup(ResumeSearchDetailOccupationGroup occupationGroup) {
        this.occupationGroup = occupationGroup;
        return this;
    }

    /**
     * Get the languages property: The languages property.
     *
     * @return the languages value.
     */
    public ResumeSearchDetailLanguages getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: The languages property.
     *
     * @param languages the languages value to set.
     * @return the ResumeSearchDetail object itself.
     */
    public ResumeSearchDetail setLanguages(ResumeSearchDetailLanguages languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the managementLevel property: The managementLevel property.
     *
     * @return the managementLevel value.
     */
    public ResumeSearchDetailManagementLevel getManagementLevel() {
        return this.managementLevel;
    }

    /**
     * Set the managementLevel property: The managementLevel property.
     *
     * @param managementLevel the managementLevel value to set.
     * @return the ResumeSearchDetail object itself.
     */
    public ResumeSearchDetail setManagementLevel(ResumeSearchDetailManagementLevel managementLevel) {
        this.managementLevel = managementLevel;
        return this;
    }

    /**
     * Get the searchExpression property: The searchExpression property.
     *
     * @return the searchExpression value.
     */
    public ResumeSearchDetailSearchExpression getSearchExpression() {
        return this.searchExpression;
    }

    /**
     * Set the searchExpression property: The searchExpression property.
     *
     * @param searchExpression the searchExpression value to set.
     * @return the ResumeSearchDetail object itself.
     */
    public ResumeSearchDetail setSearchExpression(ResumeSearchDetailSearchExpression searchExpression) {
        this.searchExpression = searchExpression;
        return this;
    }
}
