package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SearchExpressionSearchScoreComponent model. */
@Fluent
public final class SearchExpressionSearchScoreComponent {
    /*
     * The label property.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * The score property.
     */
    @JsonProperty(value = "score")
    private Float score;

    /**
     * Get the label property: The label property.
     *
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: The label property.
     *
     * @param label the label value to set.
     * @return the SearchExpressionSearchScoreComponent object itself.
     */
    public SearchExpressionSearchScoreComponent setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the SearchExpressionSearchScoreComponent object itself.
     */
    public SearchExpressionSearchScoreComponent setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the score property: The score property.
     *
     * @return the score value.
     */
    public Float getScore() {
        return this.score;
    }

    /**
     * Set the score property: The score property.
     *
     * @param score the score value to set.
     * @return the SearchExpressionSearchScoreComponent object itself.
     */
    public SearchExpressionSearchScoreComponent setScore(Float score) {
        this.score = score;
        return this;
    }
}
