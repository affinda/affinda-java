package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EducationDates model. */
@Fluent
public final class EducationDates {
    /*
     * The startDate property.
     */
    @JsonProperty(value = "startDate")
    private String startDate;

    /*
     * The completionDate property.
     */
    @JsonProperty(value = "completionDate")
    private String completionDate;

    /*
     * The isCurrent property.
     */
    @JsonProperty(value = "isCurrent")
    private Boolean isCurrent;

    /**
     * Get the startDate property: The startDate property.
     *
     * @return the startDate value.
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The startDate property.
     *
     * @param startDate the startDate value to set.
     * @return the EducationDates object itself.
     */
    public EducationDates setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the completionDate property: The completionDate property.
     *
     * @return the completionDate value.
     */
    public String getCompletionDate() {
        return this.completionDate;
    }

    /**
     * Set the completionDate property: The completionDate property.
     *
     * @param completionDate the completionDate value to set.
     * @return the EducationDates object itself.
     */
    public EducationDates setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * Get the isCurrent property: The isCurrent property.
     *
     * @return the isCurrent value.
     */
    public Boolean isCurrent() {
        return this.isCurrent;
    }

    /**
     * Set the isCurrent property: The isCurrent property.
     *
     * @param isCurrent the isCurrent value to set.
     * @return the EducationDates object itself.
     */
    public EducationDates setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
        return this;
    }
}
