package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The Meta model. */
@Fluent
public final class Meta {
    /*
     * Unique identifier for the document. If creating a document and left
     * blank, one will be automatically generated.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * Optional filename of the file
     */
    @JsonProperty(value = "fileName")
    private String fileName;

    /*
     * If true, the document has finished processing. Particularly useful if an
     * endpoint request specified wait=False, when polling use this variable to
     * determine when to stop polling
     */
    @JsonProperty(value = "ready", required = true)
    private boolean ready;

    /*
     * The datetime when the document was ready
     */
    @JsonProperty(value = "readyDt")
    private OffsetDateTime readyDt;

    /*
     * If true, some exception was raised during processing. Check the 'error'
     * field of the main return object.
     */
    @JsonProperty(value = "failed", required = true)
    private boolean failed;

    /*
     * The date/time in ISO-8601 format when the document will be automatically
     * deleted.  Defaults to no expiry.
     */
    @JsonProperty(value = "expiryTime")
    private OffsetDateTime expiryTime;

    /*
     * The document's language.
     */
    @JsonProperty(value = "language")
    private String language;

    /*
     * The URL to the document's pdf (if the uploaded document is not already
     * pdf, it's converted to pdf as part of the parsing process).
     */
    @JsonProperty(value = "pdf", access = JsonProperty.Access.WRITE_ONLY)
    private String pdf;

    /*
     * If this document is part of a splitted document, this attribute points
     * to the original document that this document is splitted from.
     */
    @JsonProperty(value = "parentDocument", access = JsonProperty.Access.WRITE_ONLY)
    private SplitRelation parentDocument;

    /*
     * If this document has been splitted into a number of child documents,
     * this attribute points to those child documents.
     */
    @JsonProperty(value = "childDocuments", access = JsonProperty.Access.WRITE_ONLY)
    private List<SplitRelation> childDocuments;

    /*
     * The document's pages.
     */
    @JsonProperty(value = "pages")
    private List<PageMeta> pages;

    /*
     * This is true if the "confirm" button has been clicked in the Affinda
     * validation tool
     */
    @JsonProperty(value = "isVerified")
    private Boolean isVerified;

    /*
     * Signed URL (valid for 60 minutes) to access the validation tool.  Not
     * applicable for documents types such a resumes.
     */
    @JsonProperty(value = "reviewUrl")
    private String reviewUrl;

    /*
     * The overall confidence in the conversion of image to text.  (only
     * applicable for images or PDF documents without a text layer)
     */
    @JsonProperty(value = "ocrConfidence")
    private Float ocrConfidence;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

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
     * @return the Meta object itself.
     */
    public Meta setIdentifier(String identifier) {
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
     * @return the Meta object itself.
     */
    public Meta setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the ready property: If true, the document has finished processing. Particularly useful if an endpoint request
     * specified wait=False, when polling use this variable to determine when to stop polling.
     *
     * @return the ready value.
     */
    public boolean isReady() {
        return this.ready;
    }

    /**
     * Set the ready property: If true, the document has finished processing. Particularly useful if an endpoint request
     * specified wait=False, when polling use this variable to determine when to stop polling.
     *
     * @param ready the ready value to set.
     * @return the Meta object itself.
     */
    public Meta setReady(boolean ready) {
        this.ready = ready;
        return this;
    }

    /**
     * Get the readyDt property: The datetime when the document was ready.
     *
     * @return the readyDt value.
     */
    public OffsetDateTime getReadyDt() {
        return this.readyDt;
    }

    /**
     * Set the readyDt property: The datetime when the document was ready.
     *
     * @param readyDt the readyDt value to set.
     * @return the Meta object itself.
     */
    public Meta setReadyDt(OffsetDateTime readyDt) {
        this.readyDt = readyDt;
        return this;
    }

    /**
     * Get the failed property: If true, some exception was raised during processing. Check the 'error' field of the
     * main return object.
     *
     * @return the failed value.
     */
    public boolean isFailed() {
        return this.failed;
    }

    /**
     * Set the failed property: If true, some exception was raised during processing. Check the 'error' field of the
     * main return object.
     *
     * @param failed the failed value to set.
     * @return the Meta object itself.
     */
    public Meta setFailed(boolean failed) {
        this.failed = failed;
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
     * @return the Meta object itself.
     */
    public Meta setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get the language property: The document's language.
     *
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The document's language.
     *
     * @param language the language value to set.
     * @return the Meta object itself.
     */
    public Meta setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the pdf property: The URL to the document's pdf (if the uploaded document is not already pdf, it's converted
     * to pdf as part of the parsing process).
     *
     * @return the pdf value.
     */
    public String getPdf() {
        return this.pdf;
    }

    /**
     * Get the parentDocument property: If this document is part of a splitted document, this attribute points to the
     * original document that this document is splitted from.
     *
     * @return the parentDocument value.
     */
    public SplitRelation getParentDocument() {
        return this.parentDocument;
    }

    /**
     * Get the childDocuments property: If this document has been splitted into a number of child documents, this
     * attribute points to those child documents.
     *
     * @return the childDocuments value.
     */
    public List<SplitRelation> getChildDocuments() {
        return this.childDocuments;
    }

    /**
     * Get the pages property: The document's pages.
     *
     * @return the pages value.
     */
    public List<PageMeta> getPages() {
        return this.pages;
    }

    /**
     * Set the pages property: The document's pages.
     *
     * @param pages the pages value to set.
     * @return the Meta object itself.
     */
    public Meta setPages(List<PageMeta> pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Get the isVerified property: This is true if the "confirm" button has been clicked in the Affinda validation
     * tool.
     *
     * @return the isVerified value.
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Set the isVerified property: This is true if the "confirm" button has been clicked in the Affinda validation
     * tool.
     *
     * @param isVerified the isVerified value to set.
     * @return the Meta object itself.
     */
    public Meta setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * Get the reviewUrl property: Signed URL (valid for 60 minutes) to access the validation tool. Not applicable for
     * documents types such a resumes.
     *
     * @return the reviewUrl value.
     */
    public String getReviewUrl() {
        return this.reviewUrl;
    }

    /**
     * Set the reviewUrl property: Signed URL (valid for 60 minutes) to access the validation tool. Not applicable for
     * documents types such a resumes.
     *
     * @param reviewUrl the reviewUrl value to set.
     * @return the Meta object itself.
     */
    public Meta setReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
        return this;
    }

    /**
     * Get the ocrConfidence property: The overall confidence in the conversion of image to text. (only applicable for
     * images or PDF documents without a text layer).
     *
     * @return the ocrConfidence value.
     */
    public Float getOcrConfidence() {
        return this.ocrConfidence;
    }

    /**
     * Set the ocrConfidence property: The overall confidence in the conversion of image to text. (only applicable for
     * images or PDF documents without a text layer).
     *
     * @param ocrConfidence the ocrConfidence value to set.
     * @return the Meta object itself.
     */
    public Meta setOcrConfidence(Float ocrConfidence) {
        this.ocrConfidence = ocrConfidence;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the Meta object itself.
     */
    public Meta setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
