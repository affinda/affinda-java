package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeRedactData model. */
@Fluent
public final class ResumeRedactData {
    /*
     * URL to download the redacted resume.
     */
    @JsonProperty(value = "redactedPdf")
    private String redactedPdf;

    /**
     * Get the redactedPdf property: URL to download the redacted resume.
     *
     * @return the redactedPdf value.
     */
    public String getRedactedPdf() {
        return this.redactedPdf;
    }

    /**
     * Set the redactedPdf property: URL to download the redacted resume.
     *
     * @param redactedPdf the redactedPdf value to set.
     * @return the ResumeRedactData object itself.
     */
    public ResumeRedactData setRedactedPdf(String redactedPdf) {
        this.redactedPdf = redactedPdf;
        return this;
    }
}
