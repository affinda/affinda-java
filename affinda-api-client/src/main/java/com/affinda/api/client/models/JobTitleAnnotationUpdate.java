package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobTitleAnnotationUpdate model. */
@Fluent
public final class JobTitleAnnotationUpdate extends AnnotationBase {
    /*
     * Matching job title to extracted text
     */
    @JsonProperty(value = "parsed", access = JsonProperty.Access.WRITE_ONLY)
    private JobTitleParsedParsed parsed;

    /**
     * Get the parsed property: Matching job title to extracted text.
     *
     * @return the parsed value.
     */
    public JobTitleParsedParsed getParsed() {
        return this.parsed;
    }
}
