package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchMatchDetails model. */
@Fluent
public final class ResumeSearchMatchDetails {
    /*
     * The jobTitle property.
     */
    @JsonProperty(value = "jobTitle")
    private JobTitleSearchScoreComponent jobTitle;

    /*
     * The managementLevel property.
     */
    @JsonProperty(value = "managementLevel")
    private ManagementLevelSearchScoreComponent managementLevel;

    /*
     * The experience property.
     */
    @JsonProperty(value = "experience")
    private ExperienceSearchScoreComponent experience;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills")
    private SkillsSearchScoreComponent skills;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages")
    private LanguagesSearchScoreComponent languages;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private LocationSearchScoreComponent location;

    /*
     * The education property.
     */
    @JsonProperty(value = "education")
    private EducationSearchScoreComponent education;

    /*
     * The occupationGroup property.
     */
    @JsonProperty(value = "occupationGroup")
    private OccupationGroupSearchScoreComponent occupationGroup;

    /*
     * The searchExpression property.
     */
    @JsonProperty(value = "searchExpression")
    private SearchExpressionSearchScoreComponent searchExpression;

    /**
     * Get the jobTitle property: The jobTitle property.
     *
     * @return the jobTitle value.
     */
    public JobTitleSearchScoreComponent getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: The jobTitle property.
     *
     * @param jobTitle the jobTitle value to set.
     * @return the ResumeSearchMatchDetails object itself.
     */
    public ResumeSearchMatchDetails setJobTitle(JobTitleSearchScoreComponent jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the managementLevel property: The managementLevel property.
     *
     * @return the managementLevel value.
     */
    public ManagementLevelSearchScoreComponent getManagementLevel() {
        return this.managementLevel;
    }

    /**
     * Set the managementLevel property: The managementLevel property.
     *
     * @param managementLevel the managementLevel value to set.
     * @return the ResumeSearchMatchDetails object itself.
     */
    public ResumeSearchMatchDetails setManagementLevel(ManagementLevelSearchScoreComponent managementLevel) {
        this.managementLevel = managementLevel;
        return this;
    }

    /**
     * Get the experience property: The experience property.
     *
     * @return the experience value.
     */
    public ExperienceSearchScoreComponent getExperience() {
        return this.experience;
    }

    /**
     * Set the experience property: The experience property.
     *
     * @param experience the experience value to set.
     * @return the ResumeSearchMatchDetails object itself.
     */
    public ResumeSearchMatchDetails setExperience(ExperienceSearchScoreComponent experience) {
        this.experience = experience;
        return this;
    }

    /**
     * Get the skills property: The skills property.
     *
     * @return the skills value.
     */
    public SkillsSearchScoreComponent getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: The skills property.
     *
     * @param skills the skills value to set.
     * @return the ResumeSearchMatchDetails object itself.
     */
    public ResumeSearchMatchDetails setSkills(SkillsSearchScoreComponent skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the languages property: The languages property.
     *
     * @return the languages value.
     */
    public LanguagesSearchScoreComponent getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: The languages property.
     *
     * @param languages the languages value to set.
     * @return the ResumeSearchMatchDetails object itself.
     */
    public ResumeSearchMatchDetails setLanguages(LanguagesSearchScoreComponent languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public LocationSearchScoreComponent getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the ResumeSearchMatchDetails object itself.
     */
    public ResumeSearchMatchDetails setLocation(LocationSearchScoreComponent location) {
        this.location = location;
        return this;
    }

    /**
     * Get the education property: The education property.
     *
     * @return the education value.
     */
    public EducationSearchScoreComponent getEducation() {
        return this.education;
    }

    /**
     * Set the education property: The education property.
     *
     * @param education the education value to set.
     * @return the ResumeSearchMatchDetails object itself.
     */
    public ResumeSearchMatchDetails setEducation(EducationSearchScoreComponent education) {
        this.education = education;
        return this;
    }

    /**
     * Get the occupationGroup property: The occupationGroup property.
     *
     * @return the occupationGroup value.
     */
    public OccupationGroupSearchScoreComponent getOccupationGroup() {
        return this.occupationGroup;
    }

    /**
     * Set the occupationGroup property: The occupationGroup property.
     *
     * @param occupationGroup the occupationGroup value to set.
     * @return the ResumeSearchMatchDetails object itself.
     */
    public ResumeSearchMatchDetails setOccupationGroup(OccupationGroupSearchScoreComponent occupationGroup) {
        this.occupationGroup = occupationGroup;
        return this;
    }

    /**
     * Get the searchExpression property: The searchExpression property.
     *
     * @return the searchExpression value.
     */
    public SearchExpressionSearchScoreComponent getSearchExpression() {
        return this.searchExpression;
    }

    /**
     * Set the searchExpression property: The searchExpression property.
     *
     * @param searchExpression the searchExpression value to set.
     * @return the ResumeSearchMatchDetails object itself.
     */
    public ResumeSearchMatchDetails setSearchExpression(SearchExpressionSearchScoreComponent searchExpression) {
        this.searchExpression = searchExpression;
        return this;
    }
}
