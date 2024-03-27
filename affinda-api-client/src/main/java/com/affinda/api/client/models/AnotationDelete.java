package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AnotationDelete model. */
@Fluent
public final class AnotationDelete {
    /*
     * The validation results created, changed or deleted as a result of
     * deleting the annotation.
     */
    @JsonProperty(value = "validationResults")
    private Object validationResults;

    /**
     * Get the validationResults property: The validation results created, changed or deleted as a result of deleting
     * the annotation.
     *
     * @return the validationResults value.
     */
    public Object getValidationResults() {
        return this.validationResults;
    }

    /**
     * Set the validationResults property: The validation results created, changed or deleted as a result of deleting
     * the annotation.
     *
     * @param validationResults the validationResults value to set.
     * @return the AnotationDelete object itself.
     */
    public AnotationDelete setValidationResults(Object validationResults) {
        this.validationResults = validationResults;
        return this;
    }
}
