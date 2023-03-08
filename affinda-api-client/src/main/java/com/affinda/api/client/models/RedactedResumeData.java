package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RedactedResumeData model. */
@Fluent
public final class RedactedResumeData {
    /*
     * URL to redacted PDF
     */
    @JsonProperty(value = "redactedPdf")
    private String redactedPdf;

    /**
     * Get the redactedPdf property: URL to redacted PDF.
     *
     * @return the redactedPdf value.
     */
    public String getRedactedPdf() {
        return this.redactedPdf;
    }

    /**
     * Set the redactedPdf property: URL to redacted PDF.
     *
     * @param redactedPdf the redactedPdf value to set.
     * @return the RedactedResumeData object itself.
     */
    public RedactedResumeData setRedactedPdf(String redactedPdf) {
        this.redactedPdf = redactedPdf;
        return this;
    }
}
