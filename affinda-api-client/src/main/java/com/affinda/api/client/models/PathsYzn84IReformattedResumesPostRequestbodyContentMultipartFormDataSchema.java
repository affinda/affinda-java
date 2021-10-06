package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;

/** The PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema model. */
@Fluent
public final class PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema {
    /*
     * File as binary data blob
     */
    @JsonProperty(value = "file")
    private Flux<ByteBuffer> file;

    /*
     * Unique identifier for the document. If creating a document and left
     * blank, one will be automatically generated.
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
    private String url;

    /*
     * Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for
     * Chinese.
     */
    @JsonProperty(value = "language")
    private String language;

    /*
     * Identifier of the format used
     */
    @JsonProperty(value = "resumeFormat", required = true)
    private String resumeFormat;

    /*
     * If "true" (default), will return a response only after processing has
     * completed. If "false", will return an empty data object which can be
     * polled at the GET endpoint until processing is complete.
     */
    @JsonProperty(value = "wait")
    private String wait;

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
     * @return the PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema setFile(Flux<ByteBuffer> file) {
        this.file = file;
        return this;
    }

    /**
     * Get the identifier property: Unique identifier for the document. If creating a document and left blank, one will
     * be automatically generated.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Unique identifier for the document. If creating a document and left blank, one will
     * be automatically generated.
     *
     * @param identifier the identifier value to set.
     * @return the PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema setIdentifier(String identifier) {
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
     * @return the PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the url property: URL to file to download and process.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: URL to file to download and process.
     *
     * @param url the url value to set.
     * @return the PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema setUrl(String url) {
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
     * @return the PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema setLanguage(String language) {
        this.language = language;
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
     * @return the PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema setResumeFormat(
            String resumeFormat) {
        this.resumeFormat = resumeFormat;
        return this;
    }

    /**
     * Get the wait property: If "true" (default), will return a response only after processing has completed. If
     * "false", will return an empty data object which can be polled at the GET endpoint until processing is complete.
     *
     * @return the wait value.
     */
    public String getWait() {
        return this.wait;
    }

    /**
     * Set the wait property: If "true" (default), will return a response only after processing has completed. If
     * "false", will return an empty data object which can be polled at the GET endpoint until processing is complete.
     *
     * @param wait the wait value to set.
     * @return the PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema setWait(String wait) {
        this.wait = wait;
        return this;
    }
}
