package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Matching job title to extracted text. */
@Fluent
public final class JobTitleParsedParsed {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * EMSI id of the normalised job title.
     */
    @JsonProperty(value = "emsiId")
    private String emsiId;

    /*
     * The managementLevel property.
     */
    @JsonProperty(value = "managementLevel")
    private String managementLevel;

    /*
     * The classification property.
     */
    @JsonProperty(value = "classification")
    private JobTitleParsedClassification classification;

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
     * @return the JobTitleParsedParsed object itself.
     */
    public JobTitleParsedParsed setName(String name) {
        this.name = name;
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
     * @return the JobTitleParsedParsed object itself.
     */
    public JobTitleParsedParsed setEmsiId(String emsiId) {
        this.emsiId = emsiId;
        return this;
    }

    /**
     * Get the managementLevel property: The managementLevel property.
     *
     * @return the managementLevel value.
     */
    public String getManagementLevel() {
        return this.managementLevel;
    }

    /**
     * Set the managementLevel property: The managementLevel property.
     *
     * @param managementLevel the managementLevel value to set.
     * @return the JobTitleParsedParsed object itself.
     */
    public JobTitleParsedParsed setManagementLevel(String managementLevel) {
        this.managementLevel = managementLevel;
        return this;
    }

    /**
     * Get the classification property: The classification property.
     *
     * @return the classification value.
     */
    public JobTitleParsedClassification getClassification() {
        return this.classification;
    }

    /**
     * Set the classification property: The classification property.
     *
     * @param classification the classification value to set.
     * @return the JobTitleParsedParsed object itself.
     */
    public JobTitleParsedParsed setClassification(JobTitleParsedClassification classification) {
        this.classification = classification;
        return this;
    }
}
