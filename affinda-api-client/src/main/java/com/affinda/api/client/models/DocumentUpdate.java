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
     * Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for
     * Chinese.
     */
    @JsonProperty(value = "language")
    private String language;

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
}
