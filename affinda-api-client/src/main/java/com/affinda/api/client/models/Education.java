package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Education model. */
@Fluent
public class Education {
    /*
     * The organization property.
     */
    @JsonProperty(value = "organization")
    private String organization;

    /*
     * The accreditation property.
     */
    @JsonProperty(value = "accreditation")
    private Accreditation accreditation;

    /*
     * The grade property.
     */
    @JsonProperty(value = "grade")
    private EducationGrade grade;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private Location location;

    /*
     * The dates property.
     */
    @JsonProperty(value = "dates")
    private EducationDates dates;

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
     * @return the Education object itself.
     */
    public Education setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the accreditation property: The accreditation property.
     *
     * @return the accreditation value.
     */
    public Accreditation getAccreditation() {
        return this.accreditation;
    }

    /**
     * Set the accreditation property: The accreditation property.
     *
     * @param accreditation the accreditation value to set.
     * @return the Education object itself.
     */
    public Education setAccreditation(Accreditation accreditation) {
        this.accreditation = accreditation;
        return this;
    }

    /**
     * Get the grade property: The grade property.
     *
     * @return the grade value.
     */
    public EducationGrade getGrade() {
        return this.grade;
    }

    /**
     * Set the grade property: The grade property.
     *
     * @param grade the grade value to set.
     * @return the Education object itself.
     */
    public Education setGrade(EducationGrade grade) {
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
     * @return the Education object itself.
     */
    public Education setLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * Get the dates property: The dates property.
     *
     * @return the dates value.
     */
    public EducationDates getDates() {
        return this.dates;
    }

    /**
     * Set the dates property: The dates property.
     *
     * @param dates the dates value to set.
     * @return the Education object itself.
     */
    public Education setDates(EducationDates dates) {
        this.dates = dates;
        return this;
    }
}
