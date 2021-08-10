package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema model. */
@Fluent
public final class Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema {
    /*
     * The fileName property.
     */
    @JsonProperty(value = "fileName")
    private String fileName;

    /*
     * The identifier property.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * The redactHeadshot property.
     */
    @JsonProperty(value = "redactHeadshot")
    private Boolean redactHeadshot;

    /*
     * The redactPersonalDetails property.
     */
    @JsonProperty(value = "redactPersonalDetails")
    private Boolean redactPersonalDetails;

    /*
     * The redactWorkDetails property.
     */
    @JsonProperty(value = "redactWorkDetails")
    private Boolean redactWorkDetails;

    /*
     * The redactEducationDetails property.
     */
    @JsonProperty(value = "redactEducationDetails")
    private Boolean redactEducationDetails;

    /*
     * The redactReferees property.
     */
    @JsonProperty(value = "redactReferees")
    private Boolean redactReferees;

    /*
     * The redactLocations property.
     */
    @JsonProperty(value = "redactLocations")
    private Boolean redactLocations;

    /*
     * The redactDates property.
     */
    @JsonProperty(value = "redactDates")
    private Boolean redactDates;

    /**
     * Get the fileName property: The fileName property.
     *
     * @return the fileName value.
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The fileName property.
     *
     * @param fileName the fileName value to set.
     * @return the Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the identifier property: The identifier property.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: The identifier property.
     *
     * @param identifier the identifier value to set.
     * @return the Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the redactHeadshot property: The redactHeadshot property.
     *
     * @return the redactHeadshot value.
     */
    public Boolean isRedactHeadshot() {
        return this.redactHeadshot;
    }

    /**
     * Set the redactHeadshot property: The redactHeadshot property.
     *
     * @param redactHeadshot the redactHeadshot value to set.
     * @return the Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema setRedactHeadshot(
            Boolean redactHeadshot) {
        this.redactHeadshot = redactHeadshot;
        return this;
    }

    /**
     * Get the redactPersonalDetails property: The redactPersonalDetails property.
     *
     * @return the redactPersonalDetails value.
     */
    public Boolean isRedactPersonalDetails() {
        return this.redactPersonalDetails;
    }

    /**
     * Set the redactPersonalDetails property: The redactPersonalDetails property.
     *
     * @param redactPersonalDetails the redactPersonalDetails value to set.
     * @return the Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema setRedactPersonalDetails(
            Boolean redactPersonalDetails) {
        this.redactPersonalDetails = redactPersonalDetails;
        return this;
    }

    /**
     * Get the redactWorkDetails property: The redactWorkDetails property.
     *
     * @return the redactWorkDetails value.
     */
    public Boolean isRedactWorkDetails() {
        return this.redactWorkDetails;
    }

    /**
     * Set the redactWorkDetails property: The redactWorkDetails property.
     *
     * @param redactWorkDetails the redactWorkDetails value to set.
     * @return the Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema setRedactWorkDetails(
            Boolean redactWorkDetails) {
        this.redactWorkDetails = redactWorkDetails;
        return this;
    }

    /**
     * Get the redactEducationDetails property: The redactEducationDetails property.
     *
     * @return the redactEducationDetails value.
     */
    public Boolean isRedactEducationDetails() {
        return this.redactEducationDetails;
    }

    /**
     * Set the redactEducationDetails property: The redactEducationDetails property.
     *
     * @param redactEducationDetails the redactEducationDetails value to set.
     * @return the Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema setRedactEducationDetails(
            Boolean redactEducationDetails) {
        this.redactEducationDetails = redactEducationDetails;
        return this;
    }

    /**
     * Get the redactReferees property: The redactReferees property.
     *
     * @return the redactReferees value.
     */
    public Boolean isRedactReferees() {
        return this.redactReferees;
    }

    /**
     * Set the redactReferees property: The redactReferees property.
     *
     * @param redactReferees the redactReferees value to set.
     * @return the Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema setRedactReferees(
            Boolean redactReferees) {
        this.redactReferees = redactReferees;
        return this;
    }

    /**
     * Get the redactLocations property: The redactLocations property.
     *
     * @return the redactLocations value.
     */
    public Boolean isRedactLocations() {
        return this.redactLocations;
    }

    /**
     * Set the redactLocations property: The redactLocations property.
     *
     * @param redactLocations the redactLocations value to set.
     * @return the Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema setRedactLocations(
            Boolean redactLocations) {
        this.redactLocations = redactLocations;
        return this;
    }

    /**
     * Get the redactDates property: The redactDates property.
     *
     * @return the redactDates value.
     */
    public Boolean isRedactDates() {
        return this.redactDates;
    }

    /**
     * Set the redactDates property: The redactDates property.
     *
     * @param redactDates the redactDates value to set.
     * @return the Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1VouiekRedactedResumesPostResponses201ContentApplicationJsonSchema setRedactDates(Boolean redactDates) {
        this.redactDates = redactDates;
        return this;
    }
}
