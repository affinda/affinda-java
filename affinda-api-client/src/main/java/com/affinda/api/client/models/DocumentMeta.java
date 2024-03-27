package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The DocumentMeta model. */
@Fluent
public final class DocumentMeta {
    /*
     * Unique identifier for the document
     */
    @JsonProperty(value = "identifier", required = true)
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
    private DocumentMetaParentDocument parentDocument;

    /*
     * If this document has been splitted into a number of child documents,
     * this attribute points to those child documents.
     */
    @JsonProperty(value = "childDocuments")
    private List<DocumentMetaChildDocumentsItem> childDocuments;

    /*
     * The document's pages.
     */
    @JsonProperty(value = "pages", required = true)
    private List<PageMeta> pages;

    /*
     * The isOcrd property.
     */
    @JsonProperty(value = "isOcrd")
    private Boolean isOcrd;

    /*
     * The ocrConfidence property.
     */
    @JsonProperty(value = "ocrConfidence")
    private Float ocrConfidence;

    /*
     * The reviewUrl property.
     */
    @JsonProperty(value = "reviewUrl")
    private String reviewUrl;

    /*
     * The collection property.
     */
    @JsonProperty(value = "collection")
    private DocumentMetaCollection collection;

    /*
     * The workspace property.
     */
    @JsonProperty(value = "workspace", required = true)
    private DocumentMetaWorkspace workspace;

    /*
     * The archivedDt property.
     */
    @JsonProperty(value = "archivedDt")
    private OffsetDateTime archivedDt;

    /*
     * The isArchived property.
     */
    @JsonProperty(value = "isArchived")
    private Boolean isArchived;

    /*
     * The skipParse property.
     */
    @JsonProperty(value = "skipParse")
    private Boolean skipParse;

    /*
     * The confirmedDt property.
     */
    @JsonProperty(value = "confirmedDt")
    private OffsetDateTime confirmedDt;

    /*
     * The confirmedBy property.
     */
    @JsonProperty(value = "confirmedBy")
    private UserNullable confirmedBy;

    /*
     * The isConfirmed property.
     */
    @JsonProperty(value = "isConfirmed")
    private Boolean isConfirmed;

    /*
     * The rejectedDt property.
     */
    @JsonProperty(value = "rejectedDt")
    private OffsetDateTime rejectedDt;

    /*
     * The rejectedBy property.
     */
    @JsonProperty(value = "rejectedBy")
    private UserNullable rejectedBy;

    /*
     * The isRejected property.
     */
    @JsonProperty(value = "isRejected")
    private Boolean isRejected;

    /*
     * The createdDt property.
     */
    @JsonProperty(value = "createdDt")
    private OffsetDateTime createdDt;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /*
     * The errorDetail property.
     */
    @JsonProperty(value = "errorDetail")
    private String errorDetail;

    /*
     * URL to view the file.
     */
    @JsonProperty(value = "file")
    private String file;

    /*
     * The tags property.
     */
    @JsonProperty(value = "tags")
    private List<Tag> tags;

    /*
     * The createdBy property.
     */
    @JsonProperty(value = "createdBy")
    private User createdBy;

    /*
     * If the document is created via email ingestion, this field stores the
     * email file's URL.
     */
    @JsonProperty(value = "sourceEmail")
    private String sourceEmail;

    /*
     * If the document is created via email ingestion, this field stores the
     * email's From address.
     */
    @JsonProperty(value = "sourceEmailAddress")
    private String sourceEmailAddress;

    /*
     * The regionBias property.
     */
    @JsonProperty(value = "regionBias")
    private RegionBias regionBias;

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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setIdentifier(String identifier) {
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setCustomIdentifier(String customIdentifier) {
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setFileName(String fileName) {
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setReady(Boolean ready) {
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setReadyDt(OffsetDateTime readyDt) {
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setFailed(Boolean failed) {
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setExpiryTime(OffsetDateTime expiryTime) {
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setLanguage(String language) {
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setPdf(String pdf) {
        this.pdf = pdf;
        return this;
    }

    /**
     * Get the parentDocument property: If this document is part of a splitted document, this attribute points to the
     * original document that this document is splitted from.
     *
     * @return the parentDocument value.
     */
    public DocumentMetaParentDocument getParentDocument() {
        return this.parentDocument;
    }

    /**
     * Set the parentDocument property: If this document is part of a splitted document, this attribute points to the
     * original document that this document is splitted from.
     *
     * @param parentDocument the parentDocument value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setParentDocument(DocumentMetaParentDocument parentDocument) {
        this.parentDocument = parentDocument;
        return this;
    }

    /**
     * Get the childDocuments property: If this document has been splitted into a number of child documents, this
     * attribute points to those child documents.
     *
     * @return the childDocuments value.
     */
    public List<DocumentMetaChildDocumentsItem> getChildDocuments() {
        return this.childDocuments;
    }

    /**
     * Set the childDocuments property: If this document has been splitted into a number of child documents, this
     * attribute points to those child documents.
     *
     * @param childDocuments the childDocuments value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setChildDocuments(List<DocumentMetaChildDocumentsItem> childDocuments) {
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setPages(List<PageMeta> pages) {
        this.pages = pages;
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setIsOcrd(Boolean isOcrd) {
        this.isOcrd = isOcrd;
        return this;
    }

    /**
     * Get the ocrConfidence property: The ocrConfidence property.
     *
     * @return the ocrConfidence value.
     */
    public Float getOcrConfidence() {
        return this.ocrConfidence;
    }

    /**
     * Set the ocrConfidence property: The ocrConfidence property.
     *
     * @param ocrConfidence the ocrConfidence value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setOcrConfidence(Float ocrConfidence) {
        this.ocrConfidence = ocrConfidence;
        return this;
    }

    /**
     * Get the reviewUrl property: The reviewUrl property.
     *
     * @return the reviewUrl value.
     */
    public String getReviewUrl() {
        return this.reviewUrl;
    }

    /**
     * Set the reviewUrl property: The reviewUrl property.
     *
     * @param reviewUrl the reviewUrl value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
        return this;
    }

    /**
     * Get the collection property: The collection property.
     *
     * @return the collection value.
     */
    public DocumentMetaCollection getCollection() {
        return this.collection;
    }

    /**
     * Set the collection property: The collection property.
     *
     * @param collection the collection value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setCollection(DocumentMetaCollection collection) {
        this.collection = collection;
        return this;
    }

    /**
     * Get the workspace property: The workspace property.
     *
     * @return the workspace value.
     */
    public DocumentMetaWorkspace getWorkspace() {
        return this.workspace;
    }

    /**
     * Set the workspace property: The workspace property.
     *
     * @param workspace the workspace value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setWorkspace(DocumentMetaWorkspace workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * Get the archivedDt property: The archivedDt property.
     *
     * @return the archivedDt value.
     */
    public OffsetDateTime getArchivedDt() {
        return this.archivedDt;
    }

    /**
     * Set the archivedDt property: The archivedDt property.
     *
     * @param archivedDt the archivedDt value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setArchivedDt(OffsetDateTime archivedDt) {
        this.archivedDt = archivedDt;
        return this;
    }

    /**
     * Get the isArchived property: The isArchived property.
     *
     * @return the isArchived value.
     */
    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * Set the isArchived property: The isArchived property.
     *
     * @param isArchived the isArchived value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * Get the skipParse property: The skipParse property.
     *
     * @return the skipParse value.
     */
    public Boolean isSkipParse() {
        return this.skipParse;
    }

    /**
     * Set the skipParse property: The skipParse property.
     *
     * @param skipParse the skipParse value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setSkipParse(Boolean skipParse) {
        this.skipParse = skipParse;
        return this;
    }

    /**
     * Get the confirmedDt property: The confirmedDt property.
     *
     * @return the confirmedDt value.
     */
    public OffsetDateTime getConfirmedDt() {
        return this.confirmedDt;
    }

    /**
     * Set the confirmedDt property: The confirmedDt property.
     *
     * @param confirmedDt the confirmedDt value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setConfirmedDt(OffsetDateTime confirmedDt) {
        this.confirmedDt = confirmedDt;
        return this;
    }

    /**
     * Get the confirmedBy property: The confirmedBy property.
     *
     * @return the confirmedBy value.
     */
    public UserNullable getConfirmedBy() {
        return this.confirmedBy;
    }

    /**
     * Set the confirmedBy property: The confirmedBy property.
     *
     * @param confirmedBy the confirmedBy value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setConfirmedBy(UserNullable confirmedBy) {
        this.confirmedBy = confirmedBy;
        return this;
    }

    /**
     * Get the isConfirmed property: The isConfirmed property.
     *
     * @return the isConfirmed value.
     */
    public Boolean isConfirmed() {
        return this.isConfirmed;
    }

    /**
     * Set the isConfirmed property: The isConfirmed property.
     *
     * @param isConfirmed the isConfirmed value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
        return this;
    }

    /**
     * Get the rejectedDt property: The rejectedDt property.
     *
     * @return the rejectedDt value.
     */
    public OffsetDateTime getRejectedDt() {
        return this.rejectedDt;
    }

    /**
     * Set the rejectedDt property: The rejectedDt property.
     *
     * @param rejectedDt the rejectedDt value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setRejectedDt(OffsetDateTime rejectedDt) {
        this.rejectedDt = rejectedDt;
        return this;
    }

    /**
     * Get the rejectedBy property: The rejectedBy property.
     *
     * @return the rejectedBy value.
     */
    public UserNullable getRejectedBy() {
        return this.rejectedBy;
    }

    /**
     * Set the rejectedBy property: The rejectedBy property.
     *
     * @param rejectedBy the rejectedBy value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setRejectedBy(UserNullable rejectedBy) {
        this.rejectedBy = rejectedBy;
        return this;
    }

    /**
     * Get the isRejected property: The isRejected property.
     *
     * @return the isRejected value.
     */
    public Boolean isRejected() {
        return this.isRejected;
    }

    /**
     * Set the isRejected property: The isRejected property.
     *
     * @param isRejected the isRejected value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setIsRejected(Boolean isRejected) {
        this.isRejected = isRejected;
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setCreatedDt(OffsetDateTime createdDt) {
        this.createdDt = createdDt;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorDetail property: The errorDetail property.
     *
     * @return the errorDetail value.
     */
    public String getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * Set the errorDetail property: The errorDetail property.
     *
     * @param errorDetail the errorDetail value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    /**
     * Get the file property: URL to view the file.
     *
     * @return the file value.
     */
    public String getFile() {
        return this.file;
    }

    /**
     * Set the file property: URL to view the file.
     *
     * @param file the file value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setFile(String file) {
        this.file = file;
        return this;
    }

    /**
     * Get the tags property: The tags property.
     *
     * @return the tags value.
     */
    public List<Tag> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags property.
     *
     * @param tags the tags value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the createdBy property: The createdBy property.
     *
     * @return the createdBy value.
     */
    public User getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: The createdBy property.
     *
     * @param createdBy the createdBy value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the sourceEmail property: If the document is created via email ingestion, this field stores the email file's
     * URL.
     *
     * @return the sourceEmail value.
     */
    public String getSourceEmail() {
        return this.sourceEmail;
    }

    /**
     * Set the sourceEmail property: If the document is created via email ingestion, this field stores the email file's
     * URL.
     *
     * @param sourceEmail the sourceEmail value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setSourceEmail(String sourceEmail) {
        this.sourceEmail = sourceEmail;
        return this;
    }

    /**
     * Get the sourceEmailAddress property: If the document is created via email ingestion, this field stores the
     * email's From address.
     *
     * @return the sourceEmailAddress value.
     */
    public String getSourceEmailAddress() {
        return this.sourceEmailAddress;
    }

    /**
     * Set the sourceEmailAddress property: If the document is created via email ingestion, this field stores the
     * email's From address.
     *
     * @param sourceEmailAddress the sourceEmailAddress value to set.
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setSourceEmailAddress(String sourceEmailAddress) {
        this.sourceEmailAddress = sourceEmailAddress;
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
     * @return the DocumentMeta object itself.
     */
    public DocumentMeta setRegionBias(RegionBias regionBias) {
        this.regionBias = regionBias;
        return this;
    }
}
