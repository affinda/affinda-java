package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The YearsExperienceAnnotationV2 model. */
@Fluent
public final class YearsExperienceAnnotationV2 extends AnnotationV2 {
    /*
     * Years of experience range
     */
    @JsonProperty(value = "parsed")
    private YearsExperienceAnnotationV2Parsed parsed;

    /**
     * Get the parsed property: Years of experience range.
     *
     * @return the parsed value.
     */
    public YearsExperienceAnnotationV2Parsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: Years of experience range.
     *
     * @param parsed the parsed value to set.
     * @return the YearsExperienceAnnotationV2 object itself.
     */
    public YearsExperienceAnnotationV2 setParsed(YearsExperienceAnnotationV2Parsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
