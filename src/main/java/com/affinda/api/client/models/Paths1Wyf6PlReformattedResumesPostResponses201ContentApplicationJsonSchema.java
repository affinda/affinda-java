package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths1Wyf6PlReformattedResumesPostResponses201ContentApplicationJsonSchema model. */
@Fluent
public final class Paths1Wyf6PlReformattedResumesPostResponses201ContentApplicationJsonSchema {
    /*
     * Optional filename of the file
     */
    @JsonProperty(value = "fileName")
    private String fileName;

    /*
     * Unique identifier for the resume. If creating a document and left blank,
     * one will be automatically generated.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * Identifier of the format used
     */
    @JsonProperty(value = "resumeFormat")
    private String resumeFormat;

    /**
     * Get the fileName property: Optional filename of the file.
     *
     * @return the fileName value.
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: Optional filename of the file.
     *
     * @param fileName the fileName value to set.
     * @return the Paths1Wyf6PlReformattedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1Wyf6PlReformattedResumesPostResponses201ContentApplicationJsonSchema setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the identifier property: Unique identifier for the resume. If creating a document and left blank, one will be
     * automatically generated.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Unique identifier for the resume. If creating a document and left blank, one will be
     * automatically generated.
     *
     * @param identifier the identifier value to set.
     * @return the Paths1Wyf6PlReformattedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1Wyf6PlReformattedResumesPostResponses201ContentApplicationJsonSchema setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the resumeFormat property: Identifier of the format used.
     *
     * @return the resumeFormat value.
     */
    public String getResumeFormat() {
        return this.resumeFormat;
    }

    /**
     * Set the resumeFormat property: Identifier of the format used.
     *
     * @param resumeFormat the resumeFormat value to set.
     * @return the Paths1Wyf6PlReformattedResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public Paths1Wyf6PlReformattedResumesPostResponses201ContentApplicationJsonSchema setResumeFormat(
            String resumeFormat) {
        this.resumeFormat = resumeFormat;
        return this;
    }
}
