package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths4K6IzqV3DataPointChoicesGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class Paths4K6IzqV3DataPointChoicesGetResponses200ContentApplicationJsonSchemaAllof1 {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<DataPointChoice> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<DataPointChoice> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the Paths4K6IzqV3DataPointChoicesGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public Paths4K6IzqV3DataPointChoicesGetResponses200ContentApplicationJsonSchemaAllof1 setResults(
            List<DataPointChoice> results) {
        this.results = results;
        return this;
    }
}
