package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths4T5Cm5V3IndexGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class Paths4T5Cm5V3IndexGetResponses200ContentApplicationJsonSchemaAllof1 {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Index> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<Index> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the Paths4T5Cm5V3IndexGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public Paths4T5Cm5V3IndexGetResponses200ContentApplicationJsonSchemaAllof1 setResults(List<Index> results) {
        this.results = results;
        return this;
    }
}
