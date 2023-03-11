package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Years of experience range. */
@Fluent
public final class YearsExperienceAnnotationV2UpdateParsed {
    /*
     * Minimum years of experience
     */
    @JsonProperty(value = "minimum")
    private Float minimum;

    /*
     * Maximum years of experience
     */
    @JsonProperty(value = "maximum")
    private Float maximum;

    /**
     * Get the minimum property: Minimum years of experience.
     *
     * @return the minimum value.
     */
    public Float getMinimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: Minimum years of experience.
     *
     * @param minimum the minimum value to set.
     * @return the YearsExperienceAnnotationV2UpdateParsed object itself.
     */
    public YearsExperienceAnnotationV2UpdateParsed setMinimum(Float minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: Maximum years of experience.
     *
     * @return the maximum value.
     */
    public Float getMaximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: Maximum years of experience.
     *
     * @param maximum the maximum value to set.
     * @return the YearsExperienceAnnotationV2UpdateParsed object itself.
     */
    public YearsExperienceAnnotationV2UpdateParsed setMaximum(Float maximum) {
        this.maximum = maximum;
        return this;
    }
}
