package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;

/** The RedactedResumeData model. */
@Fluent
public final class RedactedResumeData {
    /*
     * The redactedPdf property.
     */
    @JsonProperty(value = "redactedPdf")
    private URL redactedPdf;

    /**
     * Get the redactedPdf property: The redactedPdf property.
     *
     * @return the redactedPdf value.
     */
    public URL getRedactedPdf() {
        return this.redactedPdf;
    }

    /**
     * Set the redactedPdf property: The redactedPdf property.
     *
     * @param redactedPdf the redactedPdf value to set.
     * @return the RedactedResumeData object itself.
     */
    public RedactedResumeData setRedactedPdf(URL redactedPdf) {
        this.redactedPdf = redactedPdf;
        return this;
    }
}
