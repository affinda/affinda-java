package affinda.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ReformattedDocument model. */
@Fluent
public final class ReformattedDocument {
    /*
     * The data property.
     */
    @JsonProperty(value = "data")
    private ReformattedDocumentData data;

    /*
     * The meta property.
     */
    @JsonProperty(value = "meta")
    private Meta meta;

    /*
     * The error property.
     */
    @JsonProperty(value = "error")
    private Error error;

    /**
     * Get the data property: The data property.
     *
     * @return the data value.
     */
    public ReformattedDocumentData getData() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     *
     * @param data the data value to set.
     * @return the ReformattedDocument object itself.
     */
    public ReformattedDocument setData(ReformattedDocumentData data) {
        this.data = data;
        return this;
    }

    /**
     * Get the meta property: The meta property.
     *
     * @return the meta value.
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * Set the meta property: The meta property.
     *
     * @param meta the meta value to set.
     * @return the ReformattedDocument object itself.
     */
    public ReformattedDocument setMeta(Meta meta) {
        this.meta = meta;
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
     * @return the ReformattedDocument object itself.
     */
    public ReformattedDocument setError(Error error) {
        this.error = error;
        return this;
    }
}
