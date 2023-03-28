package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Extra configurations specific to an extractor. */
@Fluent
public final class ExtractorConfig {
    /*
     * The resumeRedact property.
     */
    @JsonProperty(value = "resumeRedact")
    private RedactConfig resumeRedact;

    /**
     * Get the resumeRedact property: The resumeRedact property.
     *
     * @return the resumeRedact value.
     */
    public RedactConfig getResumeRedact() {
        return this.resumeRedact;
    }

    /**
     * Set the resumeRedact property: The resumeRedact property.
     *
     * @param resumeRedact the resumeRedact value to set.
     * @return the ExtractorConfig object itself.
     */
    public ExtractorConfig setResumeRedact(RedactConfig resumeRedact) {
        this.resumeRedact = resumeRedact;
        return this;
    }
}
