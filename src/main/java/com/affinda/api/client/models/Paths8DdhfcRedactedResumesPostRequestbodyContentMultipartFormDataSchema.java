package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;

/** The Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema model. */
@Fluent
public final class Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema {
    /*
     * File as binary data blob
     */
    @JsonProperty(value = "file")
    private Flux<ByteBuffer> file;

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

    /*
     * URL to file to download and process
     */
    @JsonProperty(value = "url")
    private URL url;

    /*
     * Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for
     * Chinese.
     */
    @JsonProperty(value = "resumeLanguage")
    private String resumeLanguage;

    /*
     * Whether to redact headshot
     */
    @JsonProperty(value = "redactHeadshot")
    private Boolean redactHeadshot;

    /*
     * Whether to redact personal details (e.g. name, address)
     */
    @JsonProperty(value = "redactPersonalDetails")
    private Boolean redactPersonalDetails;

    /*
     * Whether to redact work details (e.g. company names)
     */
    @JsonProperty(value = "redactWorkDetails")
    private Boolean redactWorkDetails;

    /*
     * Whether to redact education details (e.g. university names)
     */
    @JsonProperty(value = "redactEducationDetails")
    private Boolean redactEducationDetails;

    /*
     * Whether to redact referee details
     */
    @JsonProperty(value = "redactReferees")
    private Boolean redactReferees;

    /*
     * Whether to redact location names
     */
    @JsonProperty(value = "redactLocations")
    private Boolean redactLocations;

    /*
     * Whether to redact dates
     */
    @JsonProperty(value = "redactDates")
    private Boolean redactDates;

    /*
     * The date/time in ISO-8601 format when the resume will be automatically
     * deleted.  Defaults to no expiry.
     */
    @JsonProperty(value = "expiryTime")
    private String expiryTime;

    /**
     * Get the file property: File as binary data blob.
     *
     * @return the file value.
     */
    public Flux<ByteBuffer> getFile() {
        return this.file;
    }

    /**
     * Set the file property: File as binary data blob.
     *
     * @param file the file value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setFile(Flux<ByteBuffer> file) {
        this.file = file;
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
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setIdentifier(String identifier) {
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
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the url property: URL to file to download and process.
     *
     * @return the url value.
     */
    public URL getUrl() {
        return this.url;
    }

    /**
     * Set the url property: URL to file to download and process.
     *
     * @param url the url value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setUrl(URL url) {
        this.url = url;
        return this;
    }

    /**
     * Get the resumeLanguage property: Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     *
     * @return the resumeLanguage value.
     */
    public String getResumeLanguage() {
        return this.resumeLanguage;
    }

    /**
     * Set the resumeLanguage property: Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     *
     * @param resumeLanguage the resumeLanguage value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setResumeLanguage(
            String resumeLanguage) {
        this.resumeLanguage = resumeLanguage;
        return this;
    }

    /**
     * Get the redactHeadshot property: Whether to redact headshot.
     *
     * @return the redactHeadshot value.
     */
    public Boolean isRedactHeadshot() {
        return this.redactHeadshot;
    }

    /**
     * Set the redactHeadshot property: Whether to redact headshot.
     *
     * @param redactHeadshot the redactHeadshot value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setRedactHeadshot(
            Boolean redactHeadshot) {
        this.redactHeadshot = redactHeadshot;
        return this;
    }

    /**
     * Get the redactPersonalDetails property: Whether to redact personal details (e.g. name, address).
     *
     * @return the redactPersonalDetails value.
     */
    public Boolean isRedactPersonalDetails() {
        return this.redactPersonalDetails;
    }

    /**
     * Set the redactPersonalDetails property: Whether to redact personal details (e.g. name, address).
     *
     * @param redactPersonalDetails the redactPersonalDetails value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setRedactPersonalDetails(
            Boolean redactPersonalDetails) {
        this.redactPersonalDetails = redactPersonalDetails;
        return this;
    }

    /**
     * Get the redactWorkDetails property: Whether to redact work details (e.g. company names).
     *
     * @return the redactWorkDetails value.
     */
    public Boolean isRedactWorkDetails() {
        return this.redactWorkDetails;
    }

    /**
     * Set the redactWorkDetails property: Whether to redact work details (e.g. company names).
     *
     * @param redactWorkDetails the redactWorkDetails value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setRedactWorkDetails(
            Boolean redactWorkDetails) {
        this.redactWorkDetails = redactWorkDetails;
        return this;
    }

    /**
     * Get the redactEducationDetails property: Whether to redact education details (e.g. university names).
     *
     * @return the redactEducationDetails value.
     */
    public Boolean isRedactEducationDetails() {
        return this.redactEducationDetails;
    }

    /**
     * Set the redactEducationDetails property: Whether to redact education details (e.g. university names).
     *
     * @param redactEducationDetails the redactEducationDetails value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setRedactEducationDetails(
            Boolean redactEducationDetails) {
        this.redactEducationDetails = redactEducationDetails;
        return this;
    }

    /**
     * Get the redactReferees property: Whether to redact referee details.
     *
     * @return the redactReferees value.
     */
    public Boolean isRedactReferees() {
        return this.redactReferees;
    }

    /**
     * Set the redactReferees property: Whether to redact referee details.
     *
     * @param redactReferees the redactReferees value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setRedactReferees(
            Boolean redactReferees) {
        this.redactReferees = redactReferees;
        return this;
    }

    /**
     * Get the redactLocations property: Whether to redact location names.
     *
     * @return the redactLocations value.
     */
    public Boolean isRedactLocations() {
        return this.redactLocations;
    }

    /**
     * Set the redactLocations property: Whether to redact location names.
     *
     * @param redactLocations the redactLocations value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setRedactLocations(
            Boolean redactLocations) {
        this.redactLocations = redactLocations;
        return this;
    }

    /**
     * Get the redactDates property: Whether to redact dates.
     *
     * @return the redactDates value.
     */
    public Boolean isRedactDates() {
        return this.redactDates;
    }

    /**
     * Set the redactDates property: Whether to redact dates.
     *
     * @param redactDates the redactDates value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setRedactDates(Boolean redactDates) {
        this.redactDates = redactDates;
        return this;
    }

    /**
     * Get the expiryTime property: The date/time in ISO-8601 format when the resume will be automatically deleted.
     * Defaults to no expiry.
     *
     * @return the expiryTime value.
     */
    public String getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the expiryTime property: The date/time in ISO-8601 format when the resume will be automatically deleted.
     * Defaults to no expiry.
     *
     * @param expiryTime the expiryTime value to set.
     * @return the Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths8DdhfcRedactedResumesPostRequestbodyContentMultipartFormDataSchema setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
}
