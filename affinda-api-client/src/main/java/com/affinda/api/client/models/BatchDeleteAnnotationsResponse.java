package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The BatchDeleteAnnotationsResponse model. */
@Fluent
public final class BatchDeleteAnnotationsResponse {
    /*
     * The validation results created, changed or deleted as a result of
     * deleting the annotations.
     */
    @JsonProperty(value = "validationResults")
    private Object validationResults;

    /**
     * Get the validationResults property: The validation results created, changed or deleted as a result of deleting
     * the annotations.
     *
     * @return the validationResults value.
     */
    public Object getValidationResults() {
        return this.validationResults;
    }

    /**
     * Set the validationResults property: The validation results created, changed or deleted as a result of deleting
     * the annotations.
     *
     * @param validationResults the validationResults value to set.
     * @return the BatchDeleteAnnotationsResponse object itself.
     */
    public BatchDeleteAnnotationsResponse setValidationResults(Object validationResults) {
        this.validationResults = validationResults;
        return this;
    }
}
