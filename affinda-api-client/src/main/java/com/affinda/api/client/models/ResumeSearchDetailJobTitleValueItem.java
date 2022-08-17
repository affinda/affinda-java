package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchDetailJobTitleValueItem model. */
@Fluent
public final class ResumeSearchDetailJobTitleValueItem {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The startDate property.
     */
    @JsonProperty(value = "startDate")
    private String startDate;

    /*
     * The endDate property.
     */
    @JsonProperty(value = "endDate")
    private String endDate;

    /*
     * The companyName property.
     */
    @JsonProperty(value = "companyName")
    private String companyName;

    /*
     * The match property.
     */
    @JsonProperty(value = "match")
    private Boolean match;

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
     * @return the ResumeSearchDetailJobTitleValueItem object itself.
     */
    public ResumeSearchDetailJobTitleValueItem setName(String name) {
        this.name = name;
        return this;
    }

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
     * @return the ResumeSearchDetailJobTitleValueItem object itself.
     */
    public ResumeSearchDetailJobTitleValueItem setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate property: The endDate property.
     *
     * @return the endDate value.
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: The endDate property.
     *
     * @param endDate the endDate value to set.
     * @return the ResumeSearchDetailJobTitleValueItem object itself.
     */
    public ResumeSearchDetailJobTitleValueItem setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the companyName property: The companyName property.
     *
     * @return the companyName value.
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * Set the companyName property: The companyName property.
     *
     * @param companyName the companyName value to set.
     * @return the ResumeSearchDetailJobTitleValueItem object itself.
     */
    public ResumeSearchDetailJobTitleValueItem setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get the match property: The match property.
     *
     * @return the match value.
     */
    public Boolean isMatch() {
        return this.match;
    }

    /**
     * Set the match property: The match property.
     *
     * @param match the match value to set.
     * @return the ResumeSearchDetailJobTitleValueItem object itself.
     */
    public ResumeSearchDetailJobTitleValueItem setMatch(Boolean match) {
        this.match = match;
        return this;
    }
}
