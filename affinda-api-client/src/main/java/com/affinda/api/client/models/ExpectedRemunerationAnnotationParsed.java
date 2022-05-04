package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpectedRemunerationAnnotationParsed model. */
@Fluent
public final class ExpectedRemunerationAnnotationParsed {
    /*
     * The minimum property.
     */
    @JsonProperty(value = "minimum")
    private Float minimum;

    /*
     * The maximum property.
     */
    @JsonProperty(value = "maximum")
    private Float maximum;

    /*
     * The currency property.
     */
    @JsonProperty(value = "currency")
    private String currency;

    /*
     * The unit property.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Get the minimum property: The minimum property.
     *
     * @return the minimum value.
     */
    public Float getMinimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: The minimum property.
     *
     * @param minimum the minimum value to set.
     * @return the ExpectedRemunerationAnnotationParsed object itself.
     */
    public ExpectedRemunerationAnnotationParsed setMinimum(Float minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: The maximum property.
     *
     * @return the maximum value.
     */
    public Float getMaximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: The maximum property.
     *
     * @param maximum the maximum value to set.
     * @return the ExpectedRemunerationAnnotationParsed object itself.
     */
    public ExpectedRemunerationAnnotationParsed setMaximum(Float maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the currency property: The currency property.
     *
     * @return the currency value.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Set the currency property: The currency property.
     *
     * @param currency the currency value to set.
     * @return the ExpectedRemunerationAnnotationParsed object itself.
     */
    public ExpectedRemunerationAnnotationParsed setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get the unit property: The unit property.
     *
     * @return the unit value.
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit property.
     *
     * @param unit the unit value to set.
     * @return the ExpectedRemunerationAnnotationParsed object itself.
     */
    public ExpectedRemunerationAnnotationParsed setUnit(String unit) {
        this.unit = unit;
        return this;
    }
}
