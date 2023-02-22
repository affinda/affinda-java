package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The YearsExperienceAnnotationV2Update model. */
@Fluent
public final class YearsExperienceAnnotationV2Update extends AnnotationV2Base {
    /*
     * Years of experience range
     */
    @JsonProperty(value = "parsed")
    private YearsExperienceAnnotationV2UpdateParsed parsed;

    /**
     * Get the parsed property: Years of experience range.
     *
     * @return the parsed value.
     */
    public YearsExperienceAnnotationV2UpdateParsed getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: Years of experience range.
     *
     * @param parsed the parsed value to set.
     * @return the YearsExperienceAnnotationV2Update object itself.
     */
    public YearsExperienceAnnotationV2Update setParsed(YearsExperienceAnnotationV2UpdateParsed parsed) {
        this.parsed = parsed;
        return this;
    }
}
