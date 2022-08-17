package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** The Meta model. */
@Fluent
public class Meta {
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
     * The resume's language.
     */
    @JsonProperty(value = "language")
    private String language;

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
     * Get the language property: The resume's language.
     *
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The resume's language.
     *
     * @param language the language value to set.
     * @return the Meta object itself.
     */
    public Meta setLanguage(String language) {
        this.language = language;
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
