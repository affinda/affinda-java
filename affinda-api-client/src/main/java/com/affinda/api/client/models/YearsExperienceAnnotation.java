package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The YearsExperienceAnnotation model. */
@Fluent
public final class YearsExperienceAnnotation extends Annotation {
    /*
     * Years of experience range
     */
    @JsonProperty(value = "parsed")
    private YearsExperienceAnnotationParsed parsed;

    /**
     * Get the parsed property: Years of experience range.
     *
     * @return the parsed value.
     */
    public YearsExperienceAnnotationParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: Years of experience range.
     *
     * @param parsed the parsed value to set.
     * @return the YearsExperienceAnnotation object itself.
     */
    public YearsExperienceAnnotation setParsed(YearsExperienceAnnotationParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
