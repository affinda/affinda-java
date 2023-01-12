package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import reactor.core.publisher.Flux;

/** The DocumentCreate model. */
@Fluent
public final class DocumentCreate {
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
     * Uniquely identify a collection.
     */
    @JsonProperty(value = "collection")
    private String collection;

    /*
     * Uniquely identify a workspace.
     */
    @JsonProperty(value = "workspace")
    private String workspace;

    /*
     * If "true" (default), will return a response only after processing has
     * completed. If "false", will return an empty data object which can be
     * polled at the GET endpoint until processing is complete.
     */
    @JsonProperty(value = "wait")
    private Boolean wait;

    /*
     * Specify a custom identifier for the document.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * Optional filename of the file
     */
    @JsonProperty(value = "fileName")
    private String fileName;

    /*
     * The date/time in ISO-8601 format when the document will be automatically
     * deleted.  Defaults to no expiry.
     */
    @JsonProperty(value = "expiryTime")
    private OffsetDateTime expiryTime;

    /*
     * Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for
     * Chinese.
     */
    @JsonProperty(value = "language")
    private String language;

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
     * @return the DocumentCreate object itself.
     */
    public DocumentCreate setFile(Flux<ByteBuffer> file) {
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
     * @return the DocumentCreate object itself.
     */
    public DocumentCreate setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the collection property: Uniquely identify a collection.
     *
     * @return the collection value.
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * Set the collection property: Uniquely identify a collection.
     *
     * @param collection the collection value to set.
     * @return the DocumentCreate object itself.
     */
    public DocumentCreate setCollection(String collection) {
        this.collection = collection;
        return this;
    }

    /**
     * Get the workspace property: Uniquely identify a workspace.
     *
     * @return the workspace value.
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * Set the workspace property: Uniquely identify a workspace.
     *
     * @param workspace the workspace value to set.
     * @return the DocumentCreate object itself.
     */
    public DocumentCreate setWorkspace(String workspace) {
        this.workspace = workspace;
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
     * @return the DocumentCreate object itself.
     */
    public DocumentCreate setWait(Boolean wait) {
        this.wait = wait;
        return this;
    }

    /**
     * Get the identifier property: Specify a custom identifier for the document.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Specify a custom identifier for the document.
     *
     * @param identifier the identifier value to set.
     * @return the DocumentCreate object itself.
     */
    public DocumentCreate setIdentifier(String identifier) {
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
     * @return the DocumentCreate object itself.
     */
    public DocumentCreate setFileName(String fileName) {
        this.fileName = fileName;
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
     * @return the DocumentCreate object itself.
     */
    public DocumentCreate setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
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
     * @return the DocumentCreate object itself.
     */
    public DocumentCreate setLanguage(String language) {
        this.language = language;
        return this;
    }
}
