package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CurrencyCodeAnnotation model. */
@Fluent
public final class CurrencyCodeAnnotation extends Annotation {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private DataPointChoice parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public DataPointChoice getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the CurrencyCodeAnnotation object itself.
     */
    public CurrencyCodeAnnotation setParsed(DataPointChoice parsed) {
        this.parsed = parsed;
        return this;
    }
}
