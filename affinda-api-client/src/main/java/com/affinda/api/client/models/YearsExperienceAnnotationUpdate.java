package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The YearsExperienceAnnotationUpdate model. */
@Fluent
public final class YearsExperienceAnnotationUpdate extends AnnotationBase {
    /*
     * Years of experience range
     */
    @JsonProperty(value = "parsed")
    private YearsExperienceAnnotationUpdateParsed parsed;

    /**
     * Get the parsed property: Years of experience range.
     *
     * @return the parsed value.
     */
    public YearsExperienceAnnotationUpdateParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: Years of experience range.
     *
     * @param parsed the parsed value to set.
     * @return the YearsExperienceAnnotationUpdate object itself.
     */
    public YearsExperienceAnnotationUpdate setParsed(YearsExperienceAnnotationUpdateParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
