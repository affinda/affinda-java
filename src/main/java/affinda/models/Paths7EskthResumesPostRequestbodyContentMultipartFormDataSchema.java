package affinda.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;

/** The Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema model. */
@Fluent
public final class Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema {
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
     * If true (default), will return a response only after resume processing
     * has completed. If False, will return an identifier, which can be polled
     * at the GET endpoint until processing is complete.
     */
    @JsonProperty(value = "wait")
    private Boolean wait;

    /*
     * Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for
     * Chinese.
     */
    @JsonProperty(value = "resumeLanguage")
    private String resumeLanguage;

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
     * @return the Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema setFile(Flux<ByteBuffer> file) {
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
     * @return the Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema setIdentifier(String identifier) {
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
     * @return the Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema setFileName(String fileName) {
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
     * @return the Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema setUrl(URL url) {
        this.url = url;
        return this;
    }

    /**
     * Get the wait property: If true (default), will return a response only after resume processing has completed. If
     * False, will return an identifier, which can be polled at the GET endpoint until processing is complete.
     *
     * @return the wait value.
     */
    public Boolean isWait() {
        return this.wait;
    }

    /**
     * Set the wait property: If true (default), will return a response only after resume processing has completed. If
     * False, will return an identifier, which can be polled at the GET endpoint until processing is complete.
     *
     * @param wait the wait value to set.
     * @return the Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema setWait(Boolean wait) {
        this.wait = wait;
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
     * @return the Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema setResumeLanguage(String resumeLanguage) {
        this.resumeLanguage = resumeLanguage;
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
     * @return the Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public Paths7EskthResumesPostRequestbodyContentMultipartFormDataSchema setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
}
