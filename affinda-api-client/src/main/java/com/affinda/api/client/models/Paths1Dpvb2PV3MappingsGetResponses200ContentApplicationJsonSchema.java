package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths1Dpvb2PV3MappingsGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class Paths1Dpvb2PV3MappingsGetResponses200ContentApplicationJsonSchema extends PaginatedResponse {
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
     * @return the Paths1Dpvb2PV3MappingsGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths1Dpvb2PV3MappingsGetResponses200ContentApplicationJsonSchema setResults(List<Mapping> results) {
        this.results = results;
        return this;
    }
}
