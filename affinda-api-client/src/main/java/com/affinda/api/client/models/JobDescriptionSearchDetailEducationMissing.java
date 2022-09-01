package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionSearchDetailEducationMissing model. */
@Fluent
public final class JobDescriptionSearchDetailEducationMissing {
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
     * @return the JobDescriptionSearchDetailEducationMissing object itself.
     */
    public JobDescriptionSearchDetailEducationMissing setDegrees(List<String> degrees) {
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
     * @return the JobDescriptionSearchDetailEducationMissing object itself.
     */
    public JobDescriptionSearchDetailEducationMissing setDegreeTypes(List<String> degreeTypes) {
        this.degreeTypes = degreeTypes;
        return this;
    }
}
