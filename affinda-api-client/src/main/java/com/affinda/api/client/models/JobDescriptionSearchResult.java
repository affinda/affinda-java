package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The JobDescriptionSearchResult model. */
@Fluent
public final class JobDescriptionSearchResult {
    /*
     * A random string that uniquely identify the resource.
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
    @JsonProperty(value = "occupationGroup")
    private OccupationGroupSearchScoreComponent occupationGroup;

    /*
     * The searchExpression property.
     */
    @JsonProperty(value = "searchExpression", required = true)
    private SearchExpressionSearchScoreComponent searchExpression;

    /*
     * The organizationName property.
     */
    @JsonProperty(value = "organizationName", required = true)
    private String organizationName;

    /*
     * Dictionary of
     * <components·nqbw24·schemas·customdatasearchscorecomponent·additionalproperties>
     */
    @JsonProperty(value = "customData")
    private Map<String, ComponentsNqbw24SchemasCustomdatasearchscorecomponentAdditionalproperties> customData;

    /**
     * Get the identifier property: A random string that uniquely identify the resource.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: A random string that uniquely identify the resource.
     *
     * @param identifier the identifier value to set.
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setIdentifier(String identifier) {
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setScore(float score) {
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setPdf(String pdf) {
        this.pdf = pdf;
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setJobTitle(JobTitleSearchScoreComponent jobTitle) {
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setManagementLevel(ManagementLevelSearchScoreComponent managementLevel) {
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setExperience(ExperienceSearchScoreComponent experience) {
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setSkills(SkillsSearchScoreComponent skills) {
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setLanguages(LanguagesSearchScoreComponent languages) {
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setLocation(LocationSearchScoreComponent location) {
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setEducation(EducationSearchScoreComponent education) {
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setOccupationGroup(OccupationGroupSearchScoreComponent occupationGroup) {
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
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setSearchExpression(SearchExpressionSearchScoreComponent searchExpression) {
        this.searchExpression = searchExpression;
        return this;
    }

    /**
     * Get the organizationName property: The organizationName property.
     *
     * @return the organizationName value.
     */
    public String getOrganizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: The organizationName property.
     *
     * @param organizationName the organizationName value to set.
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the customData property: Dictionary of
     * &lt;components·nqbw24·schemas·customdatasearchscorecomponent·additionalproperties&gt;.
     *
     * @return the customData value.
     */
    public Map<String, ComponentsNqbw24SchemasCustomdatasearchscorecomponentAdditionalproperties> getCustomData() {
        return this.customData;
    }

    /**
     * Set the customData property: Dictionary of
     * &lt;components·nqbw24·schemas·customdatasearchscorecomponent·additionalproperties&gt;.
     *
     * @param customData the customData value to set.
     * @return the JobDescriptionSearchResult object itself.
     */
    public JobDescriptionSearchResult setCustomData(
            Map<String, ComponentsNqbw24SchemasCustomdatasearchscorecomponentAdditionalproperties> customData) {
        this.customData = customData;
        return this;
    }
}
