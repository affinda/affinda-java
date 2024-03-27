package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The Meta model. */
@Fluent
public final class Meta {
    /*
     * Unique identifier for the document
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * Optional identifier for the document that you can set to track the
     * document in the Affinda system.  Is not required to be unique.
     */
    @JsonProperty(value = "customIdentifier")
    private String customIdentifier;

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
    @JsonProperty(value = "ready")
    private Boolean ready;

    /*
     * The datetime when the document was ready
     */
    @JsonProperty(value = "readyDt")
    private OffsetDateTime readyDt;

    /*
     * If true, some exception was raised during processing. Check the 'error'
     * field of the main return object.
     */
    @JsonProperty(value = "failed")
    private Boolean failed;

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
    @JsonProperty(value = "pdf")
    private String pdf;

    /*
     * If this document is part of a splitted document, this attribute points
     * to the original document that this document is splitted from.
     */
    @JsonProperty(value = "parentDocument")
    private MetaParentDocument parentDocument;

    /*
     * If this document has been splitted into a number of child documents,
     * this attribute points to those child documents.
     */
    @JsonProperty(value = "childDocuments")
    private List<MetaChildDocumentsItem> childDocuments;

    /*
     * The document's pages.
     */
    @JsonProperty(value = "pages")
    private List<PageMeta> pages;

    /*
     * This is true if the 'confirm' button has been clicked in the Affinda
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
     * The createdDt property.
     */
    @JsonProperty(value = "createdDt")
    private OffsetDateTime createdDt;

    /*
     * The documentType property.
     */
    @JsonProperty(value = "documentType")
    private String documentType;

    /*
     * The regionBias property.
     */
    @JsonProperty(value = "regionBias")
    private RegionBias regionBias;

    /*
     * The isOcrd property.
     */
    @JsonProperty(value = "isOcrd")
    private Boolean isOcrd;

    /**
     * Get the identifier property: Unique identifier for the document.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Unique identifier for the document.
     *
     * @param identifier the identifier value to set.
     * @return the Meta object itself.
     */
    public Meta setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the customIdentifier property: Optional identifier for the document that you can set to track the document in
     * the Affinda system. Is not required to be unique.
     *
     * @return the customIdentifier value.
     */
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    /**
     * Set the customIdentifier property: Optional identifier for the document that you can set to track the document in
     * the Affinda system. Is not required to be unique.
     *
     * @param customIdentifier the customIdentifier value to set.
     * @return the Meta object itself.
     */
    public Meta setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
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
    public Boolean isReady() {
        return this.ready;
    }

    /**
     * Set the ready property: If true, the document has finished processing. Particularly useful if an endpoint request
     * specified wait=False, when polling use this variable to determine when to stop polling.
     *
     * @param ready the ready value to set.
     * @return the Meta object itself.
     */
    public Meta setReady(Boolean ready) {
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
    public Boolean isFailed() {
        return this.failed;
    }

    /**
     * Set the failed property: If true, some exception was raised during processing. Check the 'error' field of the
     * main return object.
     *
     * @param failed the failed value to set.
     * @return the Meta object itself.
     */
    public Meta setFailed(Boolean failed) {
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
     * Set the pdf property: The URL to the document's pdf (if the uploaded document is not already pdf, it's converted
     * to pdf as part of the parsing process).
     *
     * @param pdf the pdf value to set.
     * @return the Meta object itself.
     */
    public Meta setPdf(String pdf) {
        this.pdf = pdf;
        return this;
    }

    /**
     * Get the parentDocument property: If this document is part of a splitted document, this attribute points to the
     * original document that this document is splitted from.
     *
     * @return the parentDocument value.
     */
    public MetaParentDocument getParentDocument() {
        return this.parentDocument;
    }

    /**
     * Set the parentDocument property: If this document is part of a splitted document, this attribute points to the
     * original document that this document is splitted from.
     *
     * @param parentDocument the parentDocument value to set.
     * @return the Meta object itself.
     */
    public Meta setParentDocument(MetaParentDocument parentDocument) {
        this.parentDocument = parentDocument;
        return this;
    }

    /**
     * Get the childDocuments property: If this document has been splitted into a number of child documents, this
     * attribute points to those child documents.
     *
     * @return the childDocuments value.
     */
    public List<MetaChildDocumentsItem> getChildDocuments() {
        return this.childDocuments;
    }

    /**
     * Set the childDocuments property: If this document has been splitted into a number of child documents, this
     * attribute points to those child documents.
     *
     * @param childDocuments the childDocuments value to set.
     * @return the Meta object itself.
     */
    public Meta setChildDocuments(List<MetaChildDocumentsItem> childDocuments) {
        this.childDocuments = childDocuments;
        return this;
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
     * Get the isVerified property: This is true if the 'confirm' button has been clicked in the Affinda validation
     * tool.
     *
     * @return the isVerified value.
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Set the isVerified property: This is true if the 'confirm' button has been clicked in the Affinda validation
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
     * Get the createdDt property: The createdDt property.
     *
     * @return the createdDt value.
     */
    public OffsetDateTime getCreatedDt() {
        return this.createdDt;
    }

    /**
     * Set the createdDt property: The createdDt property.
     *
     * @param createdDt the createdDt value to set.
     * @return the Meta object itself.
     */
    public Meta setCreatedDt(OffsetDateTime createdDt) {
        this.createdDt = createdDt;
        return this;
    }

    /**
     * Get the documentType property: The documentType property.
     *
     * @return the documentType value.
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * Set the documentType property: The documentType property.
     *
     * @param documentType the documentType value to set.
     * @return the Meta object itself.
     */
    public Meta setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * Get the regionBias property: The regionBias property.
     *
     * @return the regionBias value.
     */
    public RegionBias getRegionBias() {
        return this.regionBias;
    }

    /**
     * Set the regionBias property: The regionBias property.
     *
     * @param regionBias the regionBias value to set.
     * @return the Meta object itself.
     */
    public Meta setRegionBias(RegionBias regionBias) {
        this.regionBias = regionBias;
        return this;
    }

    /**
     * Get the isOcrd property: The isOcrd property.
     *
     * @return the isOcrd value.
     */
    public Boolean isOcrd() {
        return this.isOcrd;
    }

    /**
     * Set the isOcrd property: The isOcrd property.
     *
     * @param isOcrd the isOcrd value to set.
     * @return the Meta object itself.
     */
    public Meta setIsOcrd(Boolean isOcrd) {
        this.isOcrd = isOcrd;
        return this;
    }
}
