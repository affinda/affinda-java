package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsWvcyp9V3MappingsGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class PathsWvcyp9V3MappingsGetResponses200ContentApplicationJsonSchemaAllof1 {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Mapping> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<Mapping> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsWvcyp9V3MappingsGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public PathsWvcyp9V3MappingsGetResponses200ContentApplicationJsonSchemaAllof1 setResults(List<Mapping> results) {
        this.results = results;
        return this;
    }
}
