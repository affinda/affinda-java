package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobTitleAnnotation model. */
@Fluent
public final class JobTitleAnnotation extends Annotation {
    /*
     * Years of experience range
     */
    @JsonProperty(value = "parsed")
    private JobTitleAnnotationParsed parsed;

    /**
     * Get the parsed property: Years of experience range.
     *
     * @return the parsed value.
     */
    public JobTitleAnnotationParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: Years of experience range.
     *
     * @param parsed the parsed value to set.
     * @return the JobTitleAnnotation object itself.
     */
    public JobTitleAnnotation setParsed(JobTitleAnnotationParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
