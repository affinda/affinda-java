package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The Document model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "extractor",
        defaultImpl = Document.class)
@JsonTypeName("Document")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "resume", value = Resume.class),
    @JsonSubTypes.Type(name = "invoice", value = Invoice.class),
    @JsonSubTypes.Type(name = "job-description", value = JobDescription.class)
})
@Fluent
public class Document {
    /*
     * Any object
     */
    @JsonProperty(value = "data")
    private Object data;

    /*
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private DocumentMeta meta;

    /*
     * The error property.
     */
    @JsonProperty(value = "error")
    private DocumentError error;

    /**
     * Get the data property: Any object.
     *
     * @return the data value.
     */
    public Object getData() {
        return this.data;
    }

    /**
     * Set the data property: Any object.
     *
     * @param data the data value to set.
     * @return the Document object itself.
     */
    public Document setData(Object data) {
        this.data = data;
        return this;
    }

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
     * Get the error property: The error property.
     *
     * @return the error value.
     */
    public DocumentError getError() {
        return this.error;
    }

    /**
     * Set the error property: The error property.
     *
     * @param error the error value to set.
     * @return the Document object itself.
     */
    public Document setError(DocumentError error) {
        this.error = error;
        return this;
    }
}
