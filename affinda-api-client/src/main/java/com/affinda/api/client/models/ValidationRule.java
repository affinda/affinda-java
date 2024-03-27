package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A validation rule for a collection. */
@Fluent
public final class ValidationRule {
    /*
     * The slug of the validation rule, in lowercase snake_case
     */
    @JsonProperty(value = "slug", required = true)
    private String slug;

    /*
     * The data point identifier that this validation rule applies to, can be
     * an empty list if the rule doens't use any data points as sources
     */
    @JsonProperty(value = "dataPoints", required = true)
    private List<String> dataPoints;

    /**
     * Get the slug property: The slug of the validation rule, in lowercase snake_case.
     *
     * @return the slug value.
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Set the slug property: The slug of the validation rule, in lowercase snake_case.
     *
     * @param slug the slug value to set.
     * @return the ValidationRule object itself.
     */
    public ValidationRule setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get the dataPoints property: The data point identifier that this validation rule applies to, can be an empty list
     * if the rule doens't use any data points as sources.
     *
     * @return the dataPoints value.
     */
    public List<String> getDataPoints() {
        return this.dataPoints;
    }

    /**
     * Set the dataPoints property: The data point identifier that this validation rule applies to, can be an empty list
     * if the rule doens't use any data points as sources.
     *
     * @param dataPoints the dataPoints value to set.
     * @return the ValidationRule object itself.
     */
    public ValidationRule setDataPoints(List<String> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }
}
