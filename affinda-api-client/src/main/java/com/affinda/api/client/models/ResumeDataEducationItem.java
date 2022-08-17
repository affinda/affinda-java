package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeDataEducationItem model. */
@Fluent
public final class ResumeDataEducationItem {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * The organization property.
     */
    @JsonProperty(value = "organization")
    private String organization;

    /*
     * The accreditation property.
     */
    @JsonProperty(value = "accreditation")
    private ResumeDataEducationItemAccreditation accreditation;

    /*
     * The grade property.
     */
    @JsonProperty(value = "grade")
    private ResumeDataEducationItemGrade grade;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private Location location;

    /*
     * The dates property.
     */
    @JsonProperty(value = "dates")
    private ResumeDataEducationItemDates dates;

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
     * @return the ResumeDataEducationItem object itself.
     */
    public ResumeDataEducationItem setId(Integer id) {
        this.id = id;
        return this;
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
     * @return the ResumeDataEducationItem object itself.
     */
    public ResumeDataEducationItem setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the accreditation property: The accreditation property.
     *
     * @return the accreditation value.
     */
    public ResumeDataEducationItemAccreditation getAccreditation() {
        return this.accreditation;
    }

    /**
     * Set the accreditation property: The accreditation property.
     *
     * @param accreditation the accreditation value to set.
     * @return the ResumeDataEducationItem object itself.
     */
    public ResumeDataEducationItem setAccreditation(ResumeDataEducationItemAccreditation accreditation) {
        this.accreditation = accreditation;
        return this;
    }

    /**
     * Get the grade property: The grade property.
     *
     * @return the grade value.
     */
    public ResumeDataEducationItemGrade getGrade() {
        return this.grade;
    }

    /**
     * Set the grade property: The grade property.
     *
     * @param grade the grade value to set.
     * @return the ResumeDataEducationItem object itself.
     */
    public ResumeDataEducationItem setGrade(ResumeDataEducationItemGrade grade) {
        this.grade = grade;
        return this;
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
     * @return the ResumeDataEducationItem object itself.
     */
    public ResumeDataEducationItem setLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * Get the dates property: The dates property.
     *
     * @return the dates value.
     */
    public ResumeDataEducationItemDates getDates() {
        return this.dates;
    }

    /**
     * Set the dates property: The dates property.
     *
     * @param dates the dates value to set.
     * @return the ResumeDataEducationItem object itself.
     */
    public ResumeDataEducationItem setDates(ResumeDataEducationItemDates dates) {
        this.dates = dates;
        return this;
    }
}
