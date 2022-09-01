package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionSearchDetailEducationValue model. */
@Fluent
public final class JobDescriptionSearchDetailEducationValue {
    /*
     * The degrees property.
     */
    @JsonProperty(value = "degrees")
    private List<String> degrees;

    /*
     * The degreeTypes property.
     */
    @JsonProperty(value = "degreeTypes")
    private List<String> degreeTypes;

    /*
     * The match property.
     */
    @JsonProperty(value = "match")
    private Boolean match;

    /**
     * Get the degrees property: The degrees property.
     *
     * @return the degrees value.
     */
    public List<String> getDegrees() {
        return this.degrees;
    }

    /**
     * Set the degrees property: The degrees property.
     *
     * @param degrees the degrees value to set.
     * @return the JobDescriptionSearchDetailEducationValue object itself.
     */
    public JobDescriptionSearchDetailEducationValue setDegrees(List<String> degrees) {
        this.degrees = degrees;
        return this;
    }

    /**
     * Get the degreeTypes property: The degreeTypes property.
     *
     * @return the degreeTypes value.
     */
    public List<String> getDegreeTypes() {
        return this.degreeTypes;
    }

    /**
     * Set the degreeTypes property: The degreeTypes property.
     *
     * @param degreeTypes the degreeTypes value to set.
     * @return the JobDescriptionSearchDetailEducationValue object itself.
     */
    public JobDescriptionSearchDetailEducationValue setDegreeTypes(List<String> degreeTypes) {
        this.degreeTypes = degreeTypes;
        return this;
    }

    /**
     * Get the match property: The match property.
     *
     * @return the match value.
     */
    public Boolean isMatch() {
        return this.match;
    }

    /**
     * Set the match property: The match property.
     *
     * @param match the match value to set.
     * @return the JobDescriptionSearchDetailEducationValue object itself.
     */
    public JobDescriptionSearchDetailEducationValue setMatch(Boolean match) {
        this.match = match;
        return this;
    }
}
