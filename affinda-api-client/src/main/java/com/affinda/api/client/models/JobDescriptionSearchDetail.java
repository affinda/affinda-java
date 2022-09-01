package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDescriptionSearchDetail model. */
@Fluent
public final class JobDescriptionSearchDetail {
    /*
     * The jobTitle property.
     */
    @JsonProperty(value = "jobTitle")
    private JobDescriptionSearchDetailJobTitle jobTitle;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private JobDescriptionSearchDetailLocation location;

    /*
     * The education property.
     */
    @JsonProperty(value = "education")
    private JobDescriptionSearchDetailEducation education;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills")
    private JobDescriptionSearchDetailSkills skills;

    /*
     * The experience property.
     */
    @JsonProperty(value = "experience")
    private JobDescriptionSearchDetailExperience experience;

    /*
     * The occupationGroup property.
     */
    @JsonProperty(value = "occupationGroup")
    private JobDescriptionSearchDetailOccupationGroup occupationGroup;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages")
    private JobDescriptionSearchDetailLanguages languages;

    /*
     * The managementLevel property.
     */
    @JsonProperty(value = "managementLevel")
    private JobDescriptionSearchDetailManagementLevel managementLevel;

    /*
     * The searchExpression property.
     */
    @JsonProperty(value = "searchExpression")
    private JobDescriptionSearchDetailSearchExpression searchExpression;

    /**
     * Get the jobTitle property: The jobTitle property.
     *
     * @return the jobTitle value.
     */
    public JobDescriptionSearchDetailJobTitle getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: The jobTitle property.
     *
     * @param jobTitle the jobTitle value to set.
     * @return the JobDescriptionSearchDetail object itself.
     */
    public JobDescriptionSearchDetail setJobTitle(JobDescriptionSearchDetailJobTitle jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public JobDescriptionSearchDetailLocation getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the JobDescriptionSearchDetail object itself.
     */
    public JobDescriptionSearchDetail setLocation(JobDescriptionSearchDetailLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the education property: The education property.
     *
     * @return the education value.
     */
    public JobDescriptionSearchDetailEducation getEducation() {
        return this.education;
    }

    /**
     * Set the education property: The education property.
     *
     * @param education the education value to set.
     * @return the JobDescriptionSearchDetail object itself.
     */
    public JobDescriptionSearchDetail setEducation(JobDescriptionSearchDetailEducation education) {
        this.education = education;
        return this;
    }

    /**
     * Get the skills property: The skills property.
     *
     * @return the skills value.
     */
    public JobDescriptionSearchDetailSkills getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: The skills property.
     *
     * @param skills the skills value to set.
     * @return the JobDescriptionSearchDetail object itself.
     */
    public JobDescriptionSearchDetail setSkills(JobDescriptionSearchDetailSkills skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the experience property: The experience property.
     *
     * @return the experience value.
     */
    public JobDescriptionSearchDetailExperience getExperience() {
        return this.experience;
    }

    /**
     * Set the experience property: The experience property.
     *
     * @param experience the experience value to set.
     * @return the JobDescriptionSearchDetail object itself.
     */
    public JobDescriptionSearchDetail setExperience(JobDescriptionSearchDetailExperience experience) {
        this.experience = experience;
        return this;
    }

    /**
     * Get the occupationGroup property: The occupationGroup property.
     *
     * @return the occupationGroup value.
     */
    public JobDescriptionSearchDetailOccupationGroup getOccupationGroup() {
        return this.occupationGroup;
    }

    /**
     * Set the occupationGroup property: The occupationGroup property.
     *
     * @param occupationGroup the occupationGroup value to set.
     * @return the JobDescriptionSearchDetail object itself.
     */
    public JobDescriptionSearchDetail setOccupationGroup(JobDescriptionSearchDetailOccupationGroup occupationGroup) {
        this.occupationGroup = occupationGroup;
        return this;
    }

    /**
     * Get the languages property: The languages property.
     *
     * @return the languages value.
     */
    public JobDescriptionSearchDetailLanguages getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: The languages property.
     *
     * @param languages the languages value to set.
     * @return the JobDescriptionSearchDetail object itself.
     */
    public JobDescriptionSearchDetail setLanguages(JobDescriptionSearchDetailLanguages languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the managementLevel property: The managementLevel property.
     *
     * @return the managementLevel value.
     */
    public JobDescriptionSearchDetailManagementLevel getManagementLevel() {
        return this.managementLevel;
    }

    /**
     * Set the managementLevel property: The managementLevel property.
     *
     * @param managementLevel the managementLevel value to set.
     * @return the JobDescriptionSearchDetail object itself.
     */
    public JobDescriptionSearchDetail setManagementLevel(JobDescriptionSearchDetailManagementLevel managementLevel) {
        this.managementLevel = managementLevel;
        return this;
    }

    /**
     * Get the searchExpression property: The searchExpression property.
     *
     * @return the searchExpression value.
     */
    public JobDescriptionSearchDetailSearchExpression getSearchExpression() {
        return this.searchExpression;
    }

    /**
     * Set the searchExpression property: The searchExpression property.
     *
     * @param searchExpression the searchExpression value to set.
     * @return the JobDescriptionSearchDetail object itself.
     */
    public JobDescriptionSearchDetail setSearchExpression(JobDescriptionSearchDetailSearchExpression searchExpression) {
        this.searchExpression = searchExpression;
        return this;
    }
}
