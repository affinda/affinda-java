package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/** The ResumeDataEducationItemDates model. */
@Fluent
public final class ResumeDataEducationItemDates {
    /*
     * The completionDate property.
     */
    @JsonProperty(value = "completionDate")
    private LocalDate completionDate;

    /*
     * The isCurrent property.
     */
    @JsonProperty(value = "isCurrent")
    private Boolean isCurrent;

    /*
     * The startDate property.
     */
    @JsonProperty(value = "startDate")
    private LocalDate startDate;

    /**
     * Get the completionDate property: The completionDate property.
     *
     * @return the completionDate value.
     */
    public LocalDate getCompletionDate() {
        return this.completionDate;
    }

    /**
     * Set the completionDate property: The completionDate property.
     *
     * @param completionDate the completionDate value to set.
     * @return the ResumeDataEducationItemDates object itself.
     */
    public ResumeDataEducationItemDates setCompletionDate(LocalDate completionDate) {
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
     * @return the ResumeDataEducationItemDates object itself.
     */
    public ResumeDataEducationItemDates setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
        return this;
    }

    /**
     * Get the startDate property: The startDate property.
     *
     * @return the startDate value.
     */
    public LocalDate getStartDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The startDate property.
     *
     * @param startDate the startDate value to set.
     * @return the ResumeDataEducationItemDates object itself.
     */
    public ResumeDataEducationItemDates setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
}
