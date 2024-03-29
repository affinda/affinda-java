package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The DocumentUpdate model. */
@Fluent
public final class DocumentUpdate {
    /*
     * Uniquely identify a collection.
     */
    @JsonProperty(value = "collection")
    private String collection;

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
     * The isConfirmed property.
     */
    @JsonProperty(value = "isConfirmed")
    private Boolean isConfirmed;

    /*
     * The isRejected property.
     */
    @JsonProperty(value = "isRejected")
    private Boolean isRejected;

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
     * Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for
     * Chinese.
     */
    @JsonProperty(value = "language")
    private String language;

    /*
     * Deprecated in favor of `customIdentifier`.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * Specify a custom identifier for the document if you need one, not
     * required to be unique.
     */
    @JsonProperty(value = "customIdentifier")
    private String customIdentifier;

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
     * @return the DocumentUpdate object itself.
     */
    public DocumentUpdate setCollection(String collection) {
        this.collection = collection;
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
     * @return the DocumentUpdate object itself.
     */
    public DocumentUpdate setFileName(String fileName) {
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
     * @return the DocumentUpdate object itself.
     */
    public DocumentUpdate setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
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
     * @return the DocumentUpdate object itself.
     */
    public DocumentUpdate setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
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
     * @return the DocumentUpdate object itself.
     */
    public DocumentUpdate setIsRejected(Boolean isRejected) {
        this.isRejected = isRejected;
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
     * @return the DocumentUpdate object itself.
     */
    public DocumentUpdate setIsArchived(Boolean isArchived) {
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
     * @return the DocumentUpdate object itself.
     */
    public DocumentUpdate setSkipParse(Boolean skipParse) {
        this.skipParse = skipParse;
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
     * @return the DocumentUpdate object itself.
     */
    public DocumentUpdate setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the identifier property: Deprecated in favor of `customIdentifier`.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Deprecated in favor of `customIdentifier`.
     *
     * @param identifier the identifier value to set.
     * @return the DocumentUpdate object itself.
     */
    public DocumentUpdate setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the customIdentifier property: Specify a custom identifier for the document if you need one, not required to
     * be unique.
     *
     * @return the customIdentifier value.
     */
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    /**
     * Set the customIdentifier property: Specify a custom identifier for the document if you need one, not required to
     * be unique.
     *
     * @param customIdentifier the customIdentifier value to set.
     * @return the DocumentUpdate object itself.
     */
    public DocumentUpdate setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
        return this;
    }
}
