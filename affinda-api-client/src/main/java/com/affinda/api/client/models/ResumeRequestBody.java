package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import reactor.core.publisher.Flux;

/** ResumeRequestBody. */
@Fluent
public final class ResumeRequestBody {
    /*
     * File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF,
     * HTML, PNG, JPG
     */
    @JsonProperty(value = "file")
    private Flux<ByteBuffer> file;

    /*
     * URL to a resume to download and process
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * A JSON-encoded string of the `ResumeData` object.
     */
    @JsonProperty(value = "data")
    private ResumeData data;

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
     * If "true" (default), will return a response only after processing has
     * completed. If "false", will return an empty data object which can be
     * polled at the GET endpoint until processing is complete.
     */
    @JsonProperty(value = "wait")
    private Boolean wait;

    /*
     * If "true", parsing will fail when the uploaded document is duplicate of
     * an existing document. If "false" (default), will parse the document
     * normally whether its a duplicate or not.
     */
    @JsonProperty(value = "rejectDuplicates")
    private Boolean rejectDuplicates;

    /*
     * Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for
     * Chinese.
     */
    @JsonProperty(value = "language")
    private String language;

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
     * @return the ResumeRequestBody object itself.
     */
    public ResumeRequestBody setFile(Flux<ByteBuffer> file) {
        this.file = file;
        return this;
    }

    /**
     * Get the url property: URL to a resume to download and process.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: URL to a resume to download and process.
     *
     * @param url the url value to set.
     * @return the ResumeRequestBody object itself.
     */
    public ResumeRequestBody setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the data property: A JSON-encoded string of the `ResumeData` object.
     *
     * @return the data value.
     */
    public ResumeData getData() {
        return this.data;
    }

    /**
     * Set the data property: A JSON-encoded string of the `ResumeData` object.
     *
     * @param data the data value to set.
     * @return the ResumeRequestBody object itself.
     */
    public ResumeRequestBody setData(ResumeData data) {
        this.data = data;
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
     * @return the ResumeRequestBody object itself.
     */
    public ResumeRequestBody setIdentifier(String identifier) {
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
     * @return the ResumeRequestBody object itself.
     */
    public ResumeRequestBody setFileName(String fileName) {
        this.fileName = fileName;
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
     * @return the ResumeRequestBody object itself.
     */
    public ResumeRequestBody setWait(Boolean wait) {
        this.wait = wait;
        return this;
    }

    /**
     * Get the rejectDuplicates property: If "true", parsing will fail when the uploaded document is duplicate of an
     * existing document. If "false" (default), will parse the document normally whether its a duplicate or not.
     *
     * @return the rejectDuplicates value.
     */
    public Boolean isRejectDuplicates() {
        return this.rejectDuplicates;
    }

    /**
     * Set the rejectDuplicates property: If "true", parsing will fail when the uploaded document is duplicate of an
     * existing document. If "false" (default), will parse the document normally whether its a duplicate or not.
     *
     * @param rejectDuplicates the rejectDuplicates value to set.
     * @return the ResumeRequestBody object itself.
     */
    public ResumeRequestBody setRejectDuplicates(Boolean rejectDuplicates) {
        this.rejectDuplicates = rejectDuplicates;
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
     * @return the ResumeRequestBody object itself.
     */
    public ResumeRequestBody setLanguage(String language) {
        this.language = language;
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
     * @return the ResumeRequestBody object itself.
     */
    public ResumeRequestBody setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
}
