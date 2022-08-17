package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeDataWorkExperienceItem model. */
@Fluent
public final class ResumeDataWorkExperienceItem {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * The jobTitle property.
     */
    @JsonProperty(value = "jobTitle")
    private String jobTitle;

    /*
     * The socCode property.
     */
    @JsonProperty(value = "socCode", access = JsonProperty.Access.WRITE_ONLY)
    private String socCode;

    /*
     * The socName property.
     */
    @JsonProperty(value = "socName", access = JsonProperty.Access.WRITE_ONLY)
    private String socName;

    /*
     * The organization property.
     */
    @JsonProperty(value = "organization")
    private String organization;

    /*
     * The industry property.
     */
    @JsonProperty(value = "industry", access = JsonProperty.Access.WRITE_ONLY)
    private String industry;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private Location location;

    /*
     * The jobDescription property.
     */
    @JsonProperty(value = "jobDescription")
    private String jobDescription;

    /*
     * The dates property.
     */
    @JsonProperty(value = "dates")
    private ResumeDataWorkExperienceItemDates dates;

    /*
     * The occupation property.
     */
    @JsonProperty(value = "occupation", access = JsonProperty.Access.WRITE_ONLY)
    private ResumeDataWorkExperienceItemOccupation occupation;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the ResumeDataWorkExperienceItem object itself.
     */
    public ResumeDataWorkExperienceItem setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the jobTitle property: The jobTitle property.
     *
     * @return the jobTitle value.
     */
    public String getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: The jobTitle property.
     *
     * @param jobTitle the jobTitle value to set.
     * @return the ResumeDataWorkExperienceItem object itself.
     */
    public ResumeDataWorkExperienceItem setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the socCode property: The socCode property.
     *
     * @return the socCode value.
     */
    public String getSocCode() {
        return this.socCode;
    }

    /**
     * Get the socName property: The socName property.
     *
     * @return the socName value.
     */
    public String getSocName() {
        return this.socName;
    }

    /**
     * Get the organization property: The organization property.
     *
     * @return the organization value.
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization property: The organization property.
     *
     * @param organization the organization value to set.
     * @return the ResumeDataWorkExperienceItem object itself.
     */
    public ResumeDataWorkExperienceItem setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the industry property: The industry property.
     *
     * @return the industry value.
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the ResumeDataWorkExperienceItem object itself.
     */
    public ResumeDataWorkExperienceItem setLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * Get the jobDescription property: The jobDescription property.
     *
     * @return the jobDescription value.
     */
    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * Set the jobDescription property: The jobDescription property.
     *
     * @param jobDescription the jobDescription value to set.
     * @return the ResumeDataWorkExperienceItem object itself.
     */
    public ResumeDataWorkExperienceItem setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }

    /**
     * Get the dates property: The dates property.
     *
     * @return the dates value.
     */
    public ResumeDataWorkExperienceItemDates getDates() {
        return this.dates;
    }

    /**
     * Set the dates property: The dates property.
     *
     * @param dates the dates value to set.
     * @return the ResumeDataWorkExperienceItem object itself.
     */
    public ResumeDataWorkExperienceItem setDates(ResumeDataWorkExperienceItemDates dates) {
        this.dates = dates;
        return this;
    }

    /**
     * Get the occupation property: The occupation property.
     *
     * @return the occupation value.
     */
    public ResumeDataWorkExperienceItemOccupation getOccupation() {
        return this.occupation;
    }
}
