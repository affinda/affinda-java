package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import reactor.core.publisher.Flux;

/** InvoiceRequestBody. */
@Fluent
public final class InvoiceRequestBody {
    /*
     * File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF,
     * HTML, PNG, JPG
     */
    @JsonProperty(value = "file")
    private Flux<ByteBuffer> file;

    /*
     * URL to download the invoice.
     */
    @JsonProperty(value = "url")
    private String url;

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
     * an existing document, no credits will be consumed. If "false", will
     * parse the document normally whether its a duplicate or not. If not
     * provided, will fallback to the workspace settings.
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
     * @return the InvoiceRequestBody object itself.
     */
    public InvoiceRequestBody setFile(Flux<ByteBuffer> file) {
        this.file = file;
        return this;
    }

    /**
     * Get the url property: URL to download the invoice.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: URL to download the invoice.
     *
     * @param url the url value to set.
     * @return the InvoiceRequestBody object itself.
     */
    public InvoiceRequestBody setUrl(String url) {
        this.url = url;
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
     * @return the InvoiceRequestBody object itself.
     */
    public InvoiceRequestBody setIdentifier(String identifier) {
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
     * @return the InvoiceRequestBody object itself.
     */
    public InvoiceRequestBody setFileName(String fileName) {
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
     * @return the InvoiceRequestBody object itself.
     */
    public InvoiceRequestBody setWait(Boolean wait) {
        this.wait = wait;
        return this;
    }

    /**
     * Get the rejectDuplicates property: If "true", parsing will fail when the uploaded document is duplicate of an
     * existing document, no credits will be consumed. If "false", will parse the document normally whether its a
     * duplicate or not. If not provided, will fallback to the workspace settings.
     *
     * @return the rejectDuplicates value.
     */
    public Boolean isRejectDuplicates() {
        return this.rejectDuplicates;
    }

    /**
     * Set the rejectDuplicates property: If "true", parsing will fail when the uploaded document is duplicate of an
     * existing document, no credits will be consumed. If "false", will parse the document normally whether its a
     * duplicate or not. If not provided, will fallback to the workspace settings.
     *
     * @param rejectDuplicates the rejectDuplicates value to set.
     * @return the InvoiceRequestBody object itself.
     */
    public InvoiceRequestBody setRejectDuplicates(Boolean rejectDuplicates) {
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
     * @return the InvoiceRequestBody object itself.
     */
    public InvoiceRequestBody setLanguage(String language) {
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
     * @return the InvoiceRequestBody object itself.
     */
    public InvoiceRequestBody setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
}