package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.IOException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/** The Document model. */
@Fluent
public final class Document {
    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private DocumentMeta meta;

    /*
     * Dictionary of <any>
     */
    @JsonProperty(value = "data")
    private Map<String, Object> data;

    /*
     * The error property.
     */
    @JsonProperty(value = "error")
    private Error error;

    /**
     * Get the meta property: The meta property.
     *
     * @return the meta value.
     */
    public DocumentMeta getMeta() {
        return this.meta;
    }

    /**
     * Set the meta property: The meta property.
     *
     * @param meta the meta value to set.
     * @return the Document object itself.
     */
    public Document setMeta(DocumentMeta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get the data property: Dictionary of &lt;any&gt;.
     *
     * @return the data value.
     */
    public Map<String, Object> getData() {
        return this.data;
    }

    /**
     * Set the data property: Dictionary of &lt;any&gt;.
     *
     * @param data the data value to set.
     * @return the Document object itself.
     */
    public Document setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the error property: The error property.
     *
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }

    /**
     * Set the error property: The error property.
     *
     * @param error the error value to set.
     * @return the Document object itself.
     */
    public Document setError(Error error) {
        this.error = error;
        return this;
    }

    private static SerializerAdapter sharedSerializerAdapter = null;
    
    private static SerializerAdapter getSharedSerializerAdapter() {
        // Race conditions don't matter, so no need to synchronise
        if (sharedSerializerAdapter == null) {
            sharedSerializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        return sharedSerializerAdapter;
    }
    
    private <T> T convertToClass(Class<T> clazz) throws IOException {
        return (T) getSharedSerializerAdapter().deserialize(
            getSharedSerializerAdapter().serialize(this, SerializerEncoding.JSON),
            clazz,
            SerializerEncoding.JSON
        );
    }
    
    private boolean validateDocumentType(String expected) {
        if (this.getMeta().getCollection() == null) {
            return false;
        }
        if (this.getMeta().getCollection().getExtractor() == null) {
            return false;
        }
        if (this.getMeta().getCollection().getExtractor().getIdentifier() == null) {
            return false;
        }
        return this.getMeta().getCollection().getExtractor().getIdentifier().equals(expected);
    }
    
    public Invoice asInvoice() throws IOException {
        if (!this.validateDocumentType("invoice")) {
            throw new IllegalStateException("Document does not appear to be an invoice.");
        }
        final Invoice invoice = (Invoice) this.convertToClass(Invoice.class);
        invoice.getMeta().setIsVerified(this.getMeta().isConfirmed());
        if (this.getMeta().getConfirmedDt() != null) {
            invoice.setClientVerifiedDt(
                this.getMeta().getConfirmedDt()
                    .withOffsetSameInstant(ZoneOffset.UTC)
                    .format(DateTimeFormatter.ISO_OFFSET_DATE)
            );
        }
        return invoice;
    }
    
    public JobDescription asJobDescription() throws IOException {
        if (!this.validateDocumentType("job-description")) {
            throw new IllegalStateException("Document does not appear to be a job description.");
        }
        final JobDescription jobDescription = (JobDescription) this.convertToClass(JobDescription.class);
        jobDescription.getMeta().setIsVerified(this.getMeta().isConfirmed());
        return jobDescription;
    }
    
    public Resume asResume() throws IOException {
        if (!this.validateDocumentType("resume")) {
            throw new IllegalStateException("Document does not appear to be a resume.");
        }
        final Resume resume = (Resume) this.convertToClass(Resume.class);
        resume.getMeta().setIsVerified(this.getMeta().isConfirmed());
        return resume;
    }
}