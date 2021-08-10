package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsWt95EfResumesPostResponses201ContentApplicationJsonSchema model. */
@Fluent
public final class PathsWt95EfResumesPostResponses201ContentApplicationJsonSchema {
    /*
     * Unique identifier for the resume. If creating a document and left blank,
     * one will be automatically generated.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * Optional filename of the file
     */
    @JsonProperty(value = "fileName")
    private String fileName;

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
     * @return the PathsWt95EfResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public PathsWt95EfResumesPostResponses201ContentApplicationJsonSchema setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

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
     * @return the PathsWt95EfResumesPostResponses201ContentApplicationJsonSchema object itself.
     */
    public PathsWt95EfResumesPostResponses201ContentApplicationJsonSchema setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
}
