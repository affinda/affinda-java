package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDescriptionSearchDetailJobTitleValue model. */
@Fluent
public final class JobDescriptionSearchDetailJobTitleValue {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

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
     * @return the JobDescriptionSearchDetailJobTitleValue object itself.
     */
    public JobDescriptionSearchDetailJobTitleValue setName(String name) {
        this.name = name;
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
     * @return the JobDescriptionSearchDetailJobTitleValue object itself.
     */
    public JobDescriptionSearchDetailJobTitleValue setCompanyName(String companyName) {
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
     * @return the JobDescriptionSearchDetailJobTitleValue object itself.
     */
    public JobDescriptionSearchDetailJobTitleValue setMatch(Boolean match) {
        this.match = match;
        return this;
    }
}
