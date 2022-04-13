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
    private ResumeSearchScoreComponent jobTitle;

    /*
     * The managementLevel property.
     */
    @JsonProperty(value = "managementLevel", required = true)
    private ResumeSearchScoreComponent managementLevel;

    /*
     * The experience property.
     */
    @JsonProperty(value = "experience", required = true)
    private ResumeSearchScoreComponent experience;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills", required = true)
    private ResumeSearchScoreComponent skills;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages", required = true)
    private ResumeSearchScoreComponent languages;

    /*
     * The location property.
     */
    @JsonProperty(value = "location", required = true)
    private ResumeSearchScoreComponent location;

    /*
     * The education property.
     */
    @JsonProperty(value = "education", required = true)
    private ResumeSearchScoreComponent education;

    /*
     * The occupationGroup property.
     */
    @JsonProperty(value = "occupationGroup", required = true)
    private ResumeSearchScoreComponent occupationGroup;

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
    public ResumeSearchScoreComponent getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: The jobTitle property.
     *
     * @param jobTitle the jobTitle value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setJobTitle(ResumeSearchScoreComponent jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the managementLevel property: The managementLevel property.
     *
     * @return the managementLevel value.
     */
    public ResumeSearchScoreComponent getManagementLevel() {
        return this.managementLevel;
    }

    /**
     * Set the managementLevel property: The managementLevel property.
     *
     * @param managementLevel the managementLevel value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setManagementLevel(ResumeSearchScoreComponent managementLevel) {
        this.managementLevel = managementLevel;
        return this;
    }

    /**
     * Get the experience property: The experience property.
     *
     * @return the experience value.
     */
    public ResumeSearchScoreComponent getExperience() {
        return this.experience;
    }

    /**
     * Set the experience property: The experience property.
     *
     * @param experience the experience value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setExperience(ResumeSearchScoreComponent experience) {
        this.experience = experience;
        return this;
    }

    /**
     * Get the skills property: The skills property.
     *
     * @return the skills value.
     */
    public ResumeSearchScoreComponent getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: The skills property.
     *
     * @param skills the skills value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setSkills(ResumeSearchScoreComponent skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the languages property: The languages property.
     *
     * @return the languages value.
     */
    public ResumeSearchScoreComponent getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: The languages property.
     *
     * @param languages the languages value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setLanguages(ResumeSearchScoreComponent languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public ResumeSearchScoreComponent getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setLocation(ResumeSearchScoreComponent location) {
        this.location = location;
        return this;
    }

    /**
     * Get the education property: The education property.
     *
     * @return the education value.
     */
    public ResumeSearchScoreComponent getEducation() {
        return this.education;
    }

    /**
     * Set the education property: The education property.
     *
     * @param education the education value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setEducation(ResumeSearchScoreComponent education) {
        this.education = education;
        return this;
    }

    /**
     * Get the occupationGroup property: The occupationGroup property.
     *
     * @return the occupationGroup value.
     */
    public ResumeSearchScoreComponent getOccupationGroup() {
        return this.occupationGroup;
    }

    /**
     * Set the occupationGroup property: The occupationGroup property.
     *
     * @param occupationGroup the occupationGroup value to set.
     * @return the ResumeSearchResult object itself.
     */
    public ResumeSearchResult setOccupationGroup(ResumeSearchScoreComponent occupationGroup) {
        this.occupationGroup = occupationGroup;
        return this;
    }
}
