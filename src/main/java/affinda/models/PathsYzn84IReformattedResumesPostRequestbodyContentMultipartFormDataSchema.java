package affinda.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;
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
     * Identifier of the format used
     */
    @JsonProperty(value = "resumeFormat", required = true)
    private String resumeFormat;

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
    public URL getUrl() {
        return this.url;
    }

    /**
     * Set the url property: URL to file to download and process.
     *
     * @param url the url value to set.
     * @return the PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema setUrl(URL url) {
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
     * @return the PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema object itself.
     */
    public PathsYzn84IReformattedResumesPostRequestbodyContentMultipartFormDataSchema setResumeLanguage(
            String resumeLanguage) {
        this.resumeLanguage = resumeLanguage;
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
}
