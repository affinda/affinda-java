package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/** The ResumeDataWorkExperienceItemDates model. */
@Fluent
public final class ResumeDataWorkExperienceItemDates {
    /*
     * The startDate property.
     */
    @JsonProperty(value = "startDate")
    private LocalDate startDate;

    /*
     * The endDate property.
     */
    @JsonProperty(value = "endDate")
    private LocalDate endDate;

    /*
     * The monthsInPosition property.
     */
    @JsonProperty(value = "monthsInPosition")
    private Integer monthsInPosition;

    /*
     * The isCurrent property.
     */
    @JsonProperty(value = "isCurrent")
    private Boolean isCurrent;

    /*
     * The rawText property.
     */
    @JsonProperty(value = "rawText")
    private String rawText;

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
     * @return the ResumeDataWorkExperienceItemDates object itself.
     */
    public ResumeDataWorkExperienceItemDates setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate property: The endDate property.
     *
     * @return the endDate value.
     */
    public LocalDate getEndDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: The endDate property.
     *
     * @param endDate the endDate value to set.
     * @return the ResumeDataWorkExperienceItemDates object itself.
     */
    public ResumeDataWorkExperienceItemDates setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the monthsInPosition property: The monthsInPosition property.
     *
     * @return the monthsInPosition value.
     */
    public Integer getMonthsInPosition() {
        return this.monthsInPosition;
    }

    /**
     * Set the monthsInPosition property: The monthsInPosition property.
     *
     * @param monthsInPosition the monthsInPosition value to set.
     * @return the ResumeDataWorkExperienceItemDates object itself.
     */
    public ResumeDataWorkExperienceItemDates setMonthsInPosition(Integer monthsInPosition) {
        this.monthsInPosition = monthsInPosition;
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
     * @return the ResumeDataWorkExperienceItemDates object itself.
     */
    public ResumeDataWorkExperienceItemDates setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
        return this;
    }

    /**
     * Get the rawText property: The rawText property.
     *
     * @return the rawText value.
     */
    public String getRawText() {
        return this.rawText;
    }

    /**
     * Set the rawText property: The rawText property.
     *
     * @param rawText the rawText value to set.
     * @return the ResumeDataWorkExperienceItemDates object itself.
     */
    public ResumeDataWorkExperienceItemDates setRawText(String rawText) {
        this.rawText = rawText;
        return this;
    }
}
