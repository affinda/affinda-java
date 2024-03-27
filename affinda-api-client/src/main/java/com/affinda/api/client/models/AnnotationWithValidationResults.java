package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AnnotationWithValidationResults model. */
@Fluent
public final class AnnotationWithValidationResults extends Annotation {
    /*
     * List of validation results for this annotation.
     */
    @JsonProperty(value = "validationResults")
    private List<ValidationResult> validationResults;

    /**
     * Get the validationResults property: List of validation results for this annotation.
     *
     * @return the validationResults value.
     */
    public List<ValidationResult> getValidationResults() {
        return this.validationResults;
    }

    /**
     * Set the validationResults property: List of validation results for this annotation.
     *
     * @param validationResults the validationResults value to set.
     * @return the AnnotationWithValidationResults object itself.
     */
    public AnnotationWithValidationResults setValidationResults(List<ValidationResult> validationResults) {
        this.validationResults = validationResults;
        return this;
    }
}
