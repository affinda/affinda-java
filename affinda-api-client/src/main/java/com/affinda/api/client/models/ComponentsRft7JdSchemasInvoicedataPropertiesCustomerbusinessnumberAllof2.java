package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComponentsRft7JdSchemasInvoicedataPropertiesCustomerbusinessnumberAllof2 model. */
@Fluent
public class ComponentsRft7JdSchemasInvoicedataPropertiesCustomerbusinessnumberAllof2 {
    /*
     * The raw property.
     */
    @JsonProperty(value = "raw")
    private String raw;

    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private String parsed;

    /**
     * Get the raw property: The raw property.
     *
     * @return the raw value.
     */
    public String getRaw() {
        return this.raw;
    }

    /**
     * Set the raw property: The raw property.
     *
     * @param raw the raw value to set.
     * @return the ComponentsRft7JdSchemasInvoicedataPropertiesCustomerbusinessnumberAllof2 object itself.
     */
    public ComponentsRft7JdSchemasInvoicedataPropertiesCustomerbusinessnumberAllof2 setRaw(String raw) {
        this.raw = raw;
        return this;
    }

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public String getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the ComponentsRft7JdSchemasInvoicedataPropertiesCustomerbusinessnumberAllof2 object itself.
     */
    public ComponentsRft7JdSchemasInvoicedataPropertiesCustomerbusinessnumberAllof2 setParsed(String parsed) {
        this.parsed = parsed;
        return this;
    }
}