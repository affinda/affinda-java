package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import reactor.core.publisher.Flux;

/** RedactedResumeRequestBody. */
@Fluent
public final class RedactedResumeRequestBody {
    /*
     * File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF,
     * HTML, PNG, JPG
     */
    @JsonProperty(value = "file")
    private Flux<ByteBuffer> file;

    /*
     * A random string that uniquely identify the resource.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * Optional filename of the file
     */
    @JsonProperty(value = "fileName")
    private String fileName;

    /*
     * URL to download the resume.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for
     * Chinese.
     */
    @JsonProperty(value = "language")
    private String language;

    /*
     * If "true" (default), will return a response only after processing has
     * completed. If "false", will return an empty data object which can be
     * polled at the GET endpoint until processing is complete.
     */
    @JsonProperty(value = "wait")
    private Boolean wait;

    /*
     * Whether to redact headshot
     */
    @JsonProperty(value = "redactHeadshot")
    private String redactHeadshot;

    /*
     * Whether to redact personal details (e.g. name, address)
     */
    @JsonProperty(value = "redactPersonalDetails")
    private String redactPersonalDetails;

    /*
     * Whether to redact work details (e.g. company names)
     */
    @JsonProperty(value = "redactWorkDetails")
    private String redactWorkDetails;

    /*
     * Whether to redact education details (e.g. university names)
     */
    @JsonProperty(value = "redactEducationDetails")
    private String redactEducationDetails;

    /*
     * Whether to redact referee details
     */
    @JsonProperty(value = "redactReferees")
    private String redactReferees;

    /*
     * Whether to redact location names
     */
    @JsonProperty(value = "redactLocations")
    private String redactLocations;

    /*
     * Whether to redact dates
     */
    @JsonProperty(value = "redactDates")
    private String redactDates;

    /*
     * Whether to redact gender
     */
    @JsonProperty(value = "redactGender")
    private String redactGender;

    /*
     * The date/time in ISO-8601 format when the document will be automatically
     * deleted.  Defaults to no expiry.
     */
    @JsonProperty(value = "expiryTime")
    private OffsetDateTime expiryTime;

    /**
     * Get the file property: File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     *
     * @return the file value.
     */
    public Flux<ByteBuffer> getFile() {
        return this.file;
    }

    /**
     * Set the file property: File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     *
     * @param file the file value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setFile(Flux<ByteBuffer> file) {
        this.file = file;
        return this;
    }

    /**
     * Get the identifier property: A random string that uniquely identify the resource.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: A random string that uniquely identify the resource.
     *
     * @param identifier the identifier value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setIdentifier(String identifier) {
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
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the url property: URL to download the resume.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: URL to download the resume.
     *
     * @param url the url value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the language property: Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     *
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     *
     * @param language the language value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the wait property: If "true" (default), will return a response only after processing has completed. If
     * "false", will return an empty data object which can be polled at the GET endpoint until processing is complete.
     *
     * @return the wait value.
     */
    public Boolean isWait() {
        return this.wait;
    }

    /**
     * Set the wait property: If "true" (default), will return a response only after processing has completed. If
     * "false", will return an empty data object which can be polled at the GET endpoint until processing is complete.
     *
     * @param wait the wait value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setWait(Boolean wait) {
        this.wait = wait;
        return this;
    }

    /**
     * Get the redactHeadshot property: Whether to redact headshot.
     *
     * @return the redactHeadshot value.
     */
    public String getRedactHeadshot() {
        return this.redactHeadshot;
    }

    /**
     * Set the redactHeadshot property: Whether to redact headshot.
     *
     * @param redactHeadshot the redactHeadshot value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setRedactHeadshot(String redactHeadshot) {
        this.redactHeadshot = redactHeadshot;
        return this;
    }

    /**
     * Get the redactPersonalDetails property: Whether to redact personal details (e.g. name, address).
     *
     * @return the redactPersonalDetails value.
     */
    public String getRedactPersonalDetails() {
        return this.redactPersonalDetails;
    }

    /**
     * Set the redactPersonalDetails property: Whether to redact personal details (e.g. name, address).
     *
     * @param redactPersonalDetails the redactPersonalDetails value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setRedactPersonalDetails(String redactPersonalDetails) {
        this.redactPersonalDetails = redactPersonalDetails;
        return this;
    }

    /**
     * Get the redactWorkDetails property: Whether to redact work details (e.g. company names).
     *
     * @return the redactWorkDetails value.
     */
    public String getRedactWorkDetails() {
        return this.redactWorkDetails;
    }

    /**
     * Set the redactWorkDetails property: Whether to redact work details (e.g. company names).
     *
     * @param redactWorkDetails the redactWorkDetails value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setRedactWorkDetails(String redactWorkDetails) {
        this.redactWorkDetails = redactWorkDetails;
        return this;
    }

    /**
     * Get the redactEducationDetails property: Whether to redact education details (e.g. university names).
     *
     * @return the redactEducationDetails value.
     */
    public String getRedactEducationDetails() {
        return this.redactEducationDetails;
    }

    /**
     * Set the redactEducationDetails property: Whether to redact education details (e.g. university names).
     *
     * @param redactEducationDetails the redactEducationDetails value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setRedactEducationDetails(String redactEducationDetails) {
        this.redactEducationDetails = redactEducationDetails;
        return this;
    }

    /**
     * Get the redactReferees property: Whether to redact referee details.
     *
     * @return the redactReferees value.
     */
    public String getRedactReferees() {
        return this.redactReferees;
    }

    /**
     * Set the redactReferees property: Whether to redact referee details.
     *
     * @param redactReferees the redactReferees value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setRedactReferees(String redactReferees) {
        this.redactReferees = redactReferees;
        return this;
    }

    /**
     * Get the redactLocations property: Whether to redact location names.
     *
     * @return the redactLocations value.
     */
    public String getRedactLocations() {
        return this.redactLocations;
    }

    /**
     * Set the redactLocations property: Whether to redact location names.
     *
     * @param redactLocations the redactLocations value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setRedactLocations(String redactLocations) {
        this.redactLocations = redactLocations;
        return this;
    }

    /**
     * Get the redactDates property: Whether to redact dates.
     *
     * @return the redactDates value.
     */
    public String getRedactDates() {
        return this.redactDates;
    }

    /**
     * Set the redactDates property: Whether to redact dates.
     *
     * @param redactDates the redactDates value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setRedactDates(String redactDates) {
        this.redactDates = redactDates;
        return this;
    }

    /**
     * Get the redactGender property: Whether to redact gender.
     *
     * @return the redactGender value.
     */
    public String getRedactGender() {
        return this.redactGender;
    }

    /**
     * Set the redactGender property: Whether to redact gender.
     *
     * @param redactGender the redactGender value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setRedactGender(String redactGender) {
        this.redactGender = redactGender;
        return this;
    }

    /**
     * Get the expiryTime property: The date/time in ISO-8601 format when the document will be automatically deleted.
     * Defaults to no expiry.
     *
     * @return the expiryTime value.
     */
    public OffsetDateTime getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the expiryTime property: The date/time in ISO-8601 format when the document will be automatically deleted.
     * Defaults to no expiry.
     *
     * @param expiryTime the expiryTime value to set.
     * @return the RedactedResumeRequestBody object itself.
     */
    public RedactedResumeRequestBody setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
}
