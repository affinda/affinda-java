package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchMatch model. */
@Fluent
public final class ResumeSearchMatch {
    /*
     * The matching score between the provided resume and job description.
     */
    @JsonProperty(value = "score")
    private Float score;

    /*
     * The details property.
     */
    @JsonProperty(value = "details")
    private ResumeSearchMatchDetails details;

    /**
     * Get the score property: The matching score between the provided resume and job description.
     *
     * @return the score value.
     */
    public Float getScore() {
        return this.score;
    }

    /**
     * Set the score property: The matching score between the provided resume and job description.
     *
     * @param score the score value to set.
     * @return the ResumeSearchMatch object itself.
     */
    public ResumeSearchMatch setScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * Get the details property: The details property.
     *
     * @return the details value.
     */
    public ResumeSearchMatchDetails getDetails() {
        return this.details;
    }

    /**
     * Set the details property: The details property.
     *
     * @param details the details value to set.
     * @return the ResumeSearchMatch object itself.
     */
    public ResumeSearchMatch setDetails(ResumeSearchMatchDetails details) {
        this.details = details;
        return this;
    }
}
