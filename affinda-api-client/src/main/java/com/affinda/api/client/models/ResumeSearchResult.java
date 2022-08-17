package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchResult model. */
@Fluent
public final class ResumeSearchResult {
    /*
     * Unique identifier for the document. If creating a document and left
     * blank, one will be automatically generated.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The score property.
     */
    @JsonProperty(value = "score", required = true)
    private float score;

    /*
     * The pdf property.
     */
    @JsonProperty(value = "pdf", required = true)
    private String pdf;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The jobTitle property.
     */
    @JsonProperty(value = "jobTitle", required = true)
    private JobTitleSearchScoreComponent jobTitle;

    /*
     * The managementLevel property.
     */
    @JsonProperty(value = "managementLevel", required = true)
    private ManagementLevelSearchScoreComponent managementLevel;

    /*
     * The experience property.
     */
    @JsonProperty(value = "experience", required = true)
    private ExperienceSearchScoreComponent experience;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills", required = true)
    private SkillsSearchScoreComponent skills;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages", required = true)
    private LanguagesSearchScoreComponent languages;

    /*
     * The location property.
     */
    @JsonProperty(value = "location", required = true)
    private LocationSearchScoreComponent location;

    /*
     * The education property.
     */
    @JsonProperty(value = "education", required = true)
    private EducationSearchScoreComponent education;

    /*
     * The occupationGroup property.
     */
    @JsonProperty(value = "occupationGroup", required = true)
    private OccupationGroupSearchScoreComponent occupationGroup;

    /*
     * The searchExpression property.
     */
    @JsonProperty(value = "searchExpression", required = true)
    private SearchExpressionSearchScoreComponent searchExpression;

    /**
     * Get the identifier property: Unique identifier for the document. If creating a document and left blank, one will
     * be automatically generated.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Unique identifier for the document. If creating a document and left blank, one will
     * be automatically generated.
     *
     * @param identifier the identifier value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the score property: The score property.
     *
     * @return the score value.
     */
    public float getScore() {
        return this.score;
    }

    /**
     * Set the score property: The score property.
     *
     * @param score the score value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setScore(float score) {
        this.score = score;
        return this;
    }

    /**
     * Get the pdf property: The pdf property.
     *
     * @return the pdf value.
     */
    public String getPdf() {
        return this.pdf;
    }

    /**
     * Set the pdf property: The pdf property.
     *
     * @param pdf the pdf value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setPdf(String pdf) {
        this.pdf = pdf;
        return this;
    }

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
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setName(String name) {
        this.name = name;
        return this;
    }

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
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setJobTitle(JobTitleSearchScoreComponent jobTitle) {
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
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setManagementLevel(ManagementLevelSearchScoreComponent managementLevel) {
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
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setExperience(ExperienceSearchScoreComponent experience) {
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
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setSkills(SkillsSearchScoreComponent skills) {
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
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setLanguages(LanguagesSearchScoreComponent languages) {
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
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setLocation(LocationSearchScoreComponent location) {
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
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setEducation(EducationSearchScoreComponent education) {
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
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setOccupationGroup(OccupationGroupSearchScoreComponent occupationGroup) {
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
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setSearchExpression(SearchExpressionSearchScoreComponent searchExpression) {
        this.searchExpression = searchExpression;
        return this;
    }
}
