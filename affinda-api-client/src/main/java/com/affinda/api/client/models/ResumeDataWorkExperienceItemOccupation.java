package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeDataWorkExperienceItemOccupation model. */
@Fluent
public final class ResumeDataWorkExperienceItemOccupation {
    /*
     * The raw (not normalized) job title pulled from the work experience entry
     */
    @JsonProperty(value = "jobTitle")
    private String jobTitle;

    /*
     * Mapped onto the EMSI job title taxonomy if a sufficiently close match
     * exists.
     */
    @JsonProperty(value = "jobTitleNormalized")
    private String jobTitleNormalized;

    /*
     * EMSI id of the normalised job title.
     */
    @JsonProperty(value = "emsiId")
    private String emsiId;

    /*
     * The managementLevel property.
     */
    @JsonProperty(value = "managementLevel")
    private ManagementLevel managementLevel;

    /*
     * The classification property.
     */
    @JsonProperty(value = "classification")
    private Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
            classification;

    /**
     * Get the jobTitle property: The raw (not normalized) job title pulled from the work experience entry.
     *
     * @return the jobTitle value.
     */
    public String getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: The raw (not normalized) job title pulled from the work experience entry.
     *
     * @param jobTitle the jobTitle value to set.
     * @return the ResumeDataWorkExperienceItemOccupation object itself.
     */
    public ResumeDataWorkExperienceItemOccupation setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the jobTitleNormalized property: Mapped onto the EMSI job title taxonomy if a sufficiently close match
     * exists.
     *
     * @return the jobTitleNormalized value.
     */
    public String getJobTitleNormalized() {
        return this.jobTitleNormalized;
    }

    /**
     * Set the jobTitleNormalized property: Mapped onto the EMSI job title taxonomy if a sufficiently close match
     * exists.
     *
     * @param jobTitleNormalized the jobTitleNormalized value to set.
     * @return the ResumeDataWorkExperienceItemOccupation object itself.
     */
    public ResumeDataWorkExperienceItemOccupation setJobTitleNormalized(String jobTitleNormalized) {
        this.jobTitleNormalized = jobTitleNormalized;
        return this;
    }

    /**
     * Get the emsiId property: EMSI id of the normalised job title.
     *
     * @return the emsiId value.
     */
    public String getEmsiId() {
        return this.emsiId;
    }

    /**
     * Set the emsiId property: EMSI id of the normalised job title.
     *
     * @param emsiId the emsiId value to set.
     * @return the ResumeDataWorkExperienceItemOccupation object itself.
     */
    public ResumeDataWorkExperienceItemOccupation setEmsiId(String emsiId) {
        this.emsiId = emsiId;
        return this;
    }

    /**
     * Get the managementLevel property: The managementLevel property.
     *
     * @return the managementLevel value.
     */
    public ManagementLevel getManagementLevel() {
        return this.managementLevel;
    }

    /**
     * Set the managementLevel property: The managementLevel property.
     *
     * @param managementLevel the managementLevel value to set.
     * @return the ResumeDataWorkExperienceItemOccupation object itself.
     */
    public ResumeDataWorkExperienceItemOccupation setManagementLevel(ManagementLevel managementLevel) {
        this.managementLevel = managementLevel;
        return this;
    }

    /**
     * Get the classification property: The classification property.
     *
     * @return the classification value.
     */
    public Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
            getClassification() {
        return this.classification;
    }

    /**
     * Set the classification property: The classification property.
     *
     * @param classification the classification value to set.
     * @return the ResumeDataWorkExperienceItemOccupation object itself.
     */
    public ResumeDataWorkExperienceItemOccupation setClassification(
            Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
                    classification) {
        this.classification = classification;
        return this;
    }
}
