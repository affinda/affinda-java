package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.IOException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/** The Document model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "extractor",
        defaultImpl = Document.class)
@JsonTypeName("Document")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "resume", value = ResumeDocument.class),
    @JsonSubTypes.Type(name = "invoice", value = InvoiceDocument.class),
    @JsonSubTypes.Type(name = "job-description", value = JobDescriptionDocument.class)
})
@Fluent
public class Document {
    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private DocumentMeta meta;

    /*
     * The data property.
     */
    @JsonProperty(value = "data")
    private Object data;

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
     * Get the data property: The data property.
     *
     * @return the data value.
     */
    public Object getData() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     *
     * @param data the data value to set.
     * @return the Document object itself.
     */
    public Document setData(Object data) {
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
        // Race conditions don't matter here, so no need to synchronise
        if (sharedSerializerAdapter == null) {
            sharedSerializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        return sharedSerializerAdapter;
    }
    
    private <T> T convertDataToClass(Class<T> clazz) throws IOException {
        return (T) getSharedSerializerAdapter().deserialize(
            getSharedSerializerAdapter().serialize(this.getData(), SerializerEncoding.JSON),
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
    
    /**
     * Convert {@link #getData() this.data} to {@link InvoiceData}.
     *
     * @throws IllegalStateException if document type is not <code>invoice</code>
     * @return This Document's <code>data</code> as <code>InvoiceData</code>
     */
    public InvoiceData asInvoice() throws IOException {
        if (!this.validateDocumentType("invoice")) {
            throw new IllegalStateException("Document does not appear to be an invoice.");
        }
        if (this.getData() == null) {
            return null;
        }
        return (InvoiceData) this.convertDataToClass(InvoiceData.class);
    }
    
    /**
     * Convert {@link #getData() this.data} to {@link JobDescriptionData}.
     *
     * @throws IllegalStateException if document type is not <code>job-description</code>
     * @return This Document's <code>data</code> as <code>JobDescriptionData</code>
     */
    public JobDescriptionData asJobDescription() throws IOException {
        if (!this.validateDocumentType("job-description")) {
            throw new IllegalStateException("Document does not appear to be a job description.");
        }
        if (this.getData() == null) {
            return null;
        }
        return (JobDescriptionData) this.convertDataToClass(JobDescriptionData.class);
    }
    
    /**
     * Convert {@link #getData() this.data} to {@link ResumeData}.
     *
     * @throws IllegalStateException if document type is not <code>resume</code>
     * @return This Document's <code>data</code> as <code>ResumeData</code>
     */
    public ResumeData asResume() throws IOException {
        if (!this.validateDocumentType("resume")) {
            throw new IllegalStateException("Document does not appear to be a resume.");
        }
        if (this.getData() == null) {
            return null;
        }
        return (ResumeData) this.convertDataToClass(ResumeData.class);
    }
}