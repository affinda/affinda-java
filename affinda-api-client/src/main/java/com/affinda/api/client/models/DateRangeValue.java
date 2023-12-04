package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/** The DateRangeValue model. */
@Fluent
public final class DateRangeValue {
    /*
     * The date property.
     */
    @JsonProperty(value = "date")
    private LocalDate date;

    /*
     * The isCurrent property.
     */
    @JsonProperty(value = "isCurrent")
    private Boolean isCurrent;

    /*
     * The day property.
     */
    @JsonProperty(value = "day")
    private Integer day;

    /*
     * The month property.
     */
    @JsonProperty(value = "month")
    private Integer month;

    /*
     * The year property.
     */
    @JsonProperty(value = "year")
    private Integer year;

    /**
     * Get the date property: The date property.
     *
     * @return the date value.
     */
    public LocalDate getDate() {
        return this.date;
    }

    /**
     * Set the date property: The date property.
     *
     * @param date the date value to set.
     * @return the DateRangeValue object itself.
     */
    public DateRangeValue setDate(LocalDate date) {
        this.date = date;
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
     * @return the DateRangeValue object itself.
     */
    public DateRangeValue setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
        return this;
    }

    /**
     * Get the day property: The day property.
     *
     * @return the day value.
     */
    public Integer getDay() {
        return this.day;
    }

    /**
     * Set the day property: The day property.
     *
     * @param day the day value to set.
     * @return the DateRangeValue object itself.
     */
    public DateRangeValue setDay(Integer day) {
        this.day = day;
        return this;
    }

    /**
     * Get the month property: The month property.
     *
     * @return the month value.
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * Set the month property: The month property.
     *
     * @param month the month value to set.
     * @return the DateRangeValue object itself.
     */
    public DateRangeValue setMonth(Integer month) {
        this.month = month;
        return this;
    }

    /**
     * Get the year property: The year property.
     *
     * @return the year value.
     */
    public Integer getYear() {
        return this.year;
    }

    /**
     * Set the year property: The year property.
     *
     * @param year the year value to set.
     * @return the DateRangeValue object itself.
     */
    public DateRangeValue setYear(Integer year) {
        this.year = year;
        return this;
    }
}
